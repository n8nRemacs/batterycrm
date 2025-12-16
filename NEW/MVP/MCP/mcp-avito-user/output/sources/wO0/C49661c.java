package wo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TfaDisablePasswordState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwo0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wo0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C49661c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f441790f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C49661c f441791g = new C49661c("", false, null, false, 14, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f441792b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441793c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f441794d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441795e;

    /* compiled from: TfaDisablePasswordState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo0/c$a;", "", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C49661c(String str, boolean z12, PrintableText printableText, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? null : printableText, (i12 & 8) != 0 ? false : z13);
    }

    public static C49661c a(C49661c c49661c, String str, boolean z12, PrintableText printableText, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            str = c49661c.f441792b;
        }
        if ((i12 & 2) != 0) {
            z12 = c49661c.f441793c;
        }
        if ((i12 & 4) != 0) {
            printableText = c49661c.f441794d;
        }
        if ((i12 & 8) != 0) {
            z13 = c49661c.f441795e;
        }
        c49661c.getClass();
        return new C49661c(str, z12, printableText, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49661c)) {
            return false;
        }
        C49661c c49661c = (C49661c) obj;
        return L.f(this.f441792b, c49661c.f441792b) && this.f441793c == c49661c.f441793c && L.f(this.f441794d, c49661c.f441794d) && this.f441795e == c49661c.f441795e;
    }

    public final int hashCode() {
        int i12 = r.i(this.f441792b.hashCode() * 31, 31, this.f441793c);
        PrintableText printableText = this.f441794d;
        return Boolean.hashCode(this.f441795e) + ((i12 + (printableText == null ? 0 : printableText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TfaDisablePasswordState(password=");
        sb2.append(this.f441792b);
        sb2.append(", isPasswordHidden=");
        sb2.append(this.f441793c);
        sb2.append(", passwordError=");
        sb2.append(this.f441794d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f441795e, ')');
    }

    public C49661c(@k String str, boolean z12, @l PrintableText printableText, boolean z13) {
        this.f441792b = str;
        this.f441793c = z12;
        this.f441794d = printableText;
        this.f441795e = z13;
    }
}
