package Uy;

import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.employee_mode_impl.deeplink.j;
import com.avito.android.employee_mode_impl.deeplink.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EmployeeModeDeeplinkModule_ProvideEmployeeModeDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Uy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15585b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f16804a;

    public C15585b(j jVar) {
        this.f16804a = jVar;
    }

    public static C43834a a(j jVar) {
        C15584a.f16803a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EmployeeModeSwitchLink.class, new k(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(EmployeeModeSwitchLink.class), jVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f16804a);
    }
}
