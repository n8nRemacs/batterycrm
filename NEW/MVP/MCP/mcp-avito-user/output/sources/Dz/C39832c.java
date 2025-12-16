package dz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response;
import com.avito.android.employee_mode_impl.manager.domain.d;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import com.avito.android.remote.model.TypedResult;
import jz.C42450a;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/c;", "", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C39832c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42450a f394202a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TypedResult<d> f394203b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TypedResult<ApiMessengerInfoV2Response> f394204c;

    /* renamed from: d, reason: collision with root package name */
    public final long f394205d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f394206e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final EmployeeModeSwitchSource f394207f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42451b f394208g;

    public C39832c() {
        this(null, null, null, 0L, null, null, null, 127, null);
    }

    public static C39832c a(C39832c c39832c, C42450a c42450a, TypedResult typedResult, TypedResult typedResult2, long j12, String str, EmployeeModeSwitchSource employeeModeSwitchSource, InterfaceC42451b interfaceC42451b, int i12) {
        C42450a c42450a2 = (i12 & 1) != 0 ? c39832c.f394202a : c42450a;
        TypedResult typedResult3 = (i12 & 2) != 0 ? c39832c.f394203b : typedResult;
        TypedResult typedResult4 = (i12 & 4) != 0 ? c39832c.f394204c : typedResult2;
        long j13 = (i12 & 8) != 0 ? c39832c.f394205d : j12;
        String str2 = (i12 & 16) != 0 ? c39832c.f394206e : str;
        EmployeeModeSwitchSource employeeModeSwitchSource2 = (i12 & 32) != 0 ? c39832c.f394207f : employeeModeSwitchSource;
        InterfaceC42451b interfaceC42451b2 = (i12 & 64) != 0 ? c39832c.f394208g : interfaceC42451b;
        c39832c.getClass();
        return new C39832c(c42450a2, typedResult3, typedResult4, j13, str2, employeeModeSwitchSource2, interfaceC42451b2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39832c)) {
            return false;
        }
        C39832c c39832c = (C39832c) obj;
        return L.f(this.f394202a, c39832c.f394202a) && L.f(this.f394203b, c39832c.f394203b) && L.f(this.f394204c, c39832c.f394204c) && this.f394205d == c39832c.f394205d && L.f(this.f394206e, c39832c.f394206e) && this.f394207f == c39832c.f394207f && L.f(this.f394208g, c39832c.f394208g);
    }

    public final int hashCode() {
        int iHashCode = this.f394202a.hashCode() * 31;
        TypedResult<d> typedResult = this.f394203b;
        int iHashCode2 = (iHashCode + (typedResult == null ? 0 : typedResult.hashCode())) * 31;
        TypedResult<ApiMessengerInfoV2Response> typedResult2 = this.f394204c;
        int iD2 = H.d(r.g((iHashCode2 + (typedResult2 == null ? 0 : typedResult2.hashCode())) * 31, 31, this.f394205d), 31, this.f394206e);
        EmployeeModeSwitchSource employeeModeSwitchSource = this.f394207f;
        return this.f394208g.hashCode() + ((iD2 + (employeeModeSwitchSource != null ? employeeModeSwitchSource.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "EmployeeModeState(info=" + this.f394202a + ", infoResponse=" + this.f394203b + ", infoMessengerResponse=" + this.f394204c + ", infoLastUpdateTime=" + this.f394205d + ", futureProfileId=" + this.f394206e + ", futureProfileSwitchSource=" + this.f394207f + ", futureProfileEmployeeMode=" + this.f394208g + ')';
    }

    public C39832c(@k C42450a c42450a, @l TypedResult<d> typedResult, @l TypedResult<ApiMessengerInfoV2Response> typedResult2, long j12, @k String str, @l EmployeeModeSwitchSource employeeModeSwitchSource, @k InterfaceC42451b interfaceC42451b) {
        this.f394202a = c42450a;
        this.f394203b = typedResult;
        this.f394204c = typedResult2;
        this.f394205d = j12;
        this.f394206e = str;
        this.f394207f = employeeModeSwitchSource;
        this.f394208g = interfaceC42451b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C39832c(C42450a c42450a, TypedResult typedResult, TypedResult typedResult2, long j12, String str, EmployeeModeSwitchSource employeeModeSwitchSource, InterfaceC42451b interfaceC42451b, int i12, C42822w c42822w) {
        C42450a c42450a2;
        if ((i12 & 1) != 0) {
            C42450a.f405961d.getClass();
            c42450a2 = C42450a.f405962e;
        } else {
            c42450a2 = c42450a;
        }
        this(c42450a2, (i12 & 2) != 0 ? null : typedResult, (i12 & 4) != 0 ? null : typedResult2, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? "" : str, (i12 & 32) == 0 ? employeeModeSwitchSource : null, (i12 & 64) != 0 ? InterfaceC42451b.a.f405966a : interfaceC42451b);
    }
}
