package jz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.employee_mode_pub.manager.model.EmployeeModeSwitchSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeSwitch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljz/d;", "", "a", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C42453d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f405975d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42451b f405976a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f405977b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EmployeeModeSwitchSource f405978c;

    /* compiled from: EmployeeModeSwitch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljz/d$a;", "", "<init>", "()V", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42453d(InterfaceC42451b interfaceC42451b, boolean z12, EmployeeModeSwitchSource employeeModeSwitchSource, C42822w c42822w) {
        this.f405976a = interfaceC42451b;
        this.f405977b = z12;
        this.f405978c = employeeModeSwitchSource;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42453d)) {
            return false;
        }
        C42453d c42453d = (C42453d) obj;
        return L.f(this.f405976a, c42453d.f405976a) && this.f405977b == c42453d.f405977b && this.f405978c == c42453d.f405978c;
    }

    public final int hashCode() {
        return this.f405978c.hashCode() + r.i(this.f405976a.hashCode() * 31, 31, this.f405977b);
    }

    @k
    public final String toString() {
        return "EmployeeModeSwitch(targetMode=" + this.f405976a + ", checkModeApproved=" + this.f405977b + ", fromSource=" + this.f405978c + ')';
    }
}
