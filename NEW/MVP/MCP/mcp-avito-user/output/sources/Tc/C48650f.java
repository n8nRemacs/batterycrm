package tc;

import android.app.Application;
import com.avito.android.di.module.O0;
import com.avito.android.di.module.P0;
import com.avito.android.di.module.Q0;
import com.avito.android.di.module.R0;
import com.avito.android.di.module.S0;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sc.C48153b;
import sc.InterfaceC48152a;

/* compiled from: AppMetricaModule_ProvideAppMetricaInitializerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: tc.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48650f implements h<InterfaceC48152a> {

    /* renamed from: a, reason: collision with root package name */
    public final C48649e f439333a;

    /* renamed from: b, reason: collision with root package name */
    public final l f439334b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f439335c;

    /* renamed from: d, reason: collision with root package name */
    public final R0 f439336d;

    /* renamed from: e, reason: collision with root package name */
    public final Q0 f439337e;

    /* renamed from: f, reason: collision with root package name */
    public final S0 f439338f;

    /* renamed from: g, reason: collision with root package name */
    public final O0 f439339g;

    /* renamed from: h, reason: collision with root package name */
    public final P0 f439340h;

    public C48650f(C48649e c48649e, l lVar, Provider provider, R0 r02, Q0 q02, S0 s02, O0 o02, P0 p02) {
        this.f439333a = c48649e;
        this.f439334b = lVar;
        this.f439335c = provider;
        this.f439336d = r02;
        this.f439337e = q02;
        this.f439338f = s02;
        this.f439339g = o02;
        this.f439340h = p02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f439334b.f393949a;
        C c12 = this.f439335c.get();
        boolean zBooleanValue = ((Boolean) this.f439336d.get()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.f439337e.get()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) this.f439338f.get()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) this.f439339g.get()).booleanValue();
        this.f439340h.get();
        this.f439333a.getClass();
        if (zBooleanValue) {
            return new C48153b(application, c12, zBooleanValue2, zBooleanValue3, zBooleanValue4, "1ae47837-3870-4f32-a05d-d9b5cf37ce69");
        }
        return null;
    }
}
