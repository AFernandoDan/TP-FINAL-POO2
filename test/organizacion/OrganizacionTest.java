package organizacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import localizacion.Ubicacion;

public class OrganizacionTest {
	private TipoOrganizacion unTipoOrga;
	private Ubicacion unaUbicacion;
	private Organizacion unaOrga, otraOrga;

	@BeforeEach
	public void setUp() {
		unTipoOrga = mock(TipoOrganizacion.class);
		unaUbicacion = mock(Ubicacion.class);
		unaOrga = new Organizacion(unaUbicacion, unTipoOrga, 10);
		otraOrga = new Organizacion(unaUbicacion, unTipoOrga, 25);
	}
	
	@Test
	public void unaOrganizacionTieneUbicacionTipoYCantidadDePersonasQueTrabajanEnElla() {
		assertEquals(unaOrga.getUbicacion(), unaUbicacion);
		assertEquals(unaOrga.getTipo(), unTipoOrga);
		assertEquals(unaOrga.getCantidadTrabajadores(), 10);
	}
	
	@Test
	public void otraOrganizacionTieneUnaCantidadDiferenteDeTrabajadores() {
		assertEquals(otraOrga.getCantidadTrabajadores(), 25);
	}
}
