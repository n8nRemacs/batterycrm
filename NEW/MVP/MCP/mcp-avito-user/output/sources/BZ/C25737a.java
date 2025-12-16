package bz;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.remote.model.UserTypeCode;
import java.util.Map;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeSwitchEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbz/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C25737a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42451b f57576b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EmployeeModeSwitchSource f57577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57578d;

    public C25737a(@k InterfaceC42451b interfaceC42451b, @k EmployeeModeSwitchSource employeeModeSwitchSource) {
        String str;
        String str2;
        this.f57576b = interfaceC42451b;
        this.f57577c = employeeModeSwitchSource;
        if (interfaceC42451b instanceof InterfaceC42451b.C11596b) {
            str = "employee";
        } else {
            if (!(interfaceC42451b instanceof InterfaceC42451b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = UserTypeCode.PRIVATE;
        }
        Q q12 = new Q("desc", str);
        int iOrdinal = employeeModeSwitchSource.ordinal();
        if (iOrdinal == 0) {
            str2 = "profile";
        } else if (iOrdinal == 1) {
            str2 = "blocker";
        } else if (iOrdinal == 2) {
            str2 = "switch_profile_deeplink";
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "switch_mode_deeplink";
        }
        this.f57578d = new ParametrizedClickStreamEvent(9373, 1, P0.g(q12, new Q("info_source", str2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25737a)) {
            return false;
        }
        C25737a c25737a = (C25737a) obj;
        return L.f(this.f57576b, c25737a.f57576b) && this.f57577c == c25737a.f57577c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f57578d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57578d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f57578d.f90248c;
    }

    public final int hashCode() {
        return this.f57577c.hashCode() + (this.f57576b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "EmployeeModeSwitchEvent(employeeMode=" + this.f57576b + ", fromSource=" + this.f57577c + ')';
    }
}
