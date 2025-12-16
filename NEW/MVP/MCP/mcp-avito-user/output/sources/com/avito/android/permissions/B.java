package com.avito.android.permissions;

import Yb.InterfaceC18250a;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PermissionStateProviderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/permissions/B;", "Lcom/avito/android/permissions/z;", "a", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f215090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f215091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Yb.e f215092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18250a f215093d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f215094e = new com.jakewharton.rxrelay3.c<>();

    /* compiled from: PermissionStateProviderImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/B$a;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f215095a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PermissionState f215096b;

        public a(@Y61.k PermissionState permissionState, @Y61.k String str) {
            this.f215095a = str;
            this.f215096b = permissionState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f215095a, aVar.f215095a) && this.f215096b == aVar.f215096b;
        }

        public final int hashCode() {
            return this.f215096b.hashCode() + (this.f215095a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "PermissionWithState(permission=" + this.f215095a + ", state=" + this.f215096b + ')';
        }
    }

    @Inject
    public B(@Y61.k u uVar, @Y61.k G g12, @Y61.k Yb.e eVar, @Y61.k InterfaceC18250a interfaceC18250a) {
        this.f215090a = uVar;
        this.f215091b = g12;
        this.f215092c = eVar;
        this.f215093d = interfaceC18250a;
    }

    @Override // com.avito.android.permissions.z
    @Y61.k
    public final B0 a() {
        C41998x0 c41998x0C0 = io.reactivex.rxjava3.core.z.c0(new a(this.f215090a.b("android.permission.RECORD_AUDIO") ? PermissionState.f215104b : this.f215091b.j("android.permission.RECORD_AUDIO") ? PermissionState.f215106d : PermissionState.f215105c, "android.permission.RECORD_AUDIO"));
        com.jakewharton.rxrelay3.c<a> cVar = this.f215094e;
        Objects.requireNonNull(cVar, "other is null");
        return io.reactivex.rxjava3.core.z.p(c41998x0C0, cVar).N(new C()).d0(D.f215097b);
    }

    @Override // com.avito.android.permissions.z
    @Y61.k
    public final PermissionState b(@Y61.k String str) {
        return this.f215090a.b(str) ? PermissionState.f215104b : this.f215091b.j(str) ? PermissionState.f215106d : PermissionState.f215105c;
    }

    @Override // com.avito.android.permissions.z
    public final void c(@Y61.k PermissionState permissionState, @Y61.k String str) {
        V2.f318762a.c("PermissionStateProvider", "Update state for permission=[" + str + "] to state=[" + permissionState + ']', null);
        this.f215091b.i(str, permissionState == PermissionState.f215106d);
        this.f215094e.accept(new a(permissionState, str));
        int iHashCode = str.hashCode();
        InterfaceC18250a interfaceC18250a = this.f215093d;
        if (iHashCode == -1888586689) {
            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                interfaceC18250a.a();
            }
        } else if (iHashCode == -63024214) {
            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                interfaceC18250a.a();
            }
        } else if (iHashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
            this.f215092c.a();
        }
    }
}
