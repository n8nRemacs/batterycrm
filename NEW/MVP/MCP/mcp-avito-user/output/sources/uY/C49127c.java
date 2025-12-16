package uy;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditCountFieldState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Luy/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C49127c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f440355h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440356b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f440357c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f440358d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f440359e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440360f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f440361g;

    /* compiled from: EditCountFieldState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luy/c$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uy.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49127c(@k String str, @l Integer num, @l Integer num2, @l PrintableText printableText, boolean z12, boolean z13) {
        this.f440356b = str;
        this.f440357c = num;
        this.f440358d = num2;
        this.f440359e = printableText;
        this.f440360f = z12;
        this.f440361g = z13;
    }

    public static C49127c a(C49127c c49127c, String str, PrintableText printableText, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            str = c49127c.f440356b;
        }
        String str2 = str;
        Integer num = c49127c.f440357c;
        Integer num2 = c49127c.f440358d;
        if ((i12 & 8) != 0) {
            printableText = c49127c.f440359e;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 16) != 0) {
            z12 = c49127c.f440360f;
        }
        boolean z14 = z12;
        if ((i12 & 32) != 0) {
            z13 = c49127c.f440361g;
        }
        c49127c.getClass();
        return new C49127c(str2, num, num2, printableText2, z14, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49127c)) {
            return false;
        }
        C49127c c49127c = (C49127c) obj;
        return L.f(this.f440356b, c49127c.f440356b) && L.f(this.f440357c, c49127c.f440357c) && L.f(this.f440358d, c49127c.f440358d) && L.f(this.f440359e, c49127c.f440359e) && this.f440360f == c49127c.f440360f && this.f440361g == c49127c.f440361g;
    }

    public final int hashCode() {
        int iHashCode = this.f440356b.hashCode() * 31;
        Integer num = this.f440357c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f440358d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PrintableText printableText = this.f440359e;
        return Boolean.hashCode(this.f440361g) + r.i((iHashCode3 + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f440360f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditCountFieldState(text=");
        sb2.append(this.f440356b);
        sb2.append(", maxValue=");
        sb2.append(this.f440357c);
        sb2.append(", maxIntDigits=");
        sb2.append(this.f440358d);
        sb2.append(", error=");
        sb2.append(this.f440359e);
        sb2.append(", isLoading=");
        sb2.append(this.f440360f);
        sb2.append(", isButtonEnabled=");
        return r.x(sb2, this.f440361g, ')');
    }
}
