package Wy;

import com.avito.android.employee_mode_impl.generated.api.EmployeeModeApi;
import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EmployeeModeApi_Module_ProvideEmployeeModeApiFactory.java */
@e
@y
@x
/* renamed from: Wy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15809b implements h<EmployeeModeApi> {

    /* renamed from: a, reason: collision with root package name */
    public final f f18089a;

    public C15809b(f fVar) {
        this.f18089a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f18089a.get();
        C15808a.f18088a.getClass();
        EmployeeModeApi employeeModeApi = (EmployeeModeApi) r02.create(EmployeeModeApi.class);
        t.d(employeeModeApi);
        return employeeModeApi;
    }
}
