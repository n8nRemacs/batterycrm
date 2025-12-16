package org.mockito.internal.configuration;

import com.akita.compose.theme.re23.style.C0;
import java.io.Serializable;
import org.mockito.exceptions.misusing.MockitoConfigurationException;

/* compiled from: GlobalConfiguration.java */
/* loaded from: classes7.dex */
public class f implements C71.b, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<C71.b> f421494b = new ThreadLocal<>();
    private static final long serialVersionUID = -2860353062105505938L;

    public f() {
        C71.b bVar;
        ThreadLocal<C71.b> threadLocal = f421494b;
        if (threadLocal.get() == null) {
            C71.b aVar = new C71.a();
            new b();
            try {
            } catch (ClassNotFoundException unused) {
                bVar = null;
            }
            try {
                bVar = (C71.b) Class.forName("org.mockito.configuration.MockitoConfiguration").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                threadLocal.set(bVar != null ? bVar : aVar);
            } catch (ClassCastException e12) {
                throw new MockitoConfigurationException(C0.f(C71.b.class, new StringBuilder("MockitoConfiguration class must implement "), " interface."), e12);
            } catch (Exception e13) {
                throw new MockitoConfigurationException("Unable to instantiate org.mockito.configuration.MockitoConfiguration class. Does it have a safe, no-arg constructor?", e13);
            }
        }
    }

    @Override // C71.b
    public final boolean a() {
        return f421494b.get().a();
    }

    @Override // C71.b
    public final boolean b() {
        return f421494b.get().b();
    }

    @Override // C71.b
    public final l81.g<Object> c() {
        return f421494b.get().c();
    }
}
