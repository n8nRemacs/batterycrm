package Ry;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: EmployeeBugReporterFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRy/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ry.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15095a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f14752d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f14753b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f14754c;

    static {
        h0 h0Var = new h0(C15095a.class, "employeeBugReporter", "getEmployeeBugReporter()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f14752d = new n[]{n0Var.i(h0Var), C0.k(C15095a.class, "zhuchokPro", "getZhuchokPro()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C15095a() {
        Owners owners = Owners.f210417J;
        Boolean bool = Boolean.FALSE;
        this.f14753b = A0.u(this, "Жучок - баг репортер для сотрудников", "employee_bug_reporter", bool, false, 0, owners, 56);
        this.f14754c = A0.u(this, "Жучок Pro - баг репортер", "zhuchokPro", bool, false, 0, Owners.f210450U2, 56);
    }
}
