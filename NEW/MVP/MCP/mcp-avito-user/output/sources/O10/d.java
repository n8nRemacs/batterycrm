package o10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SignState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo10/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f419304k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C44503a f419305b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f419306c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f419307d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f419308e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f419309f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f419310g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f419311h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f419312i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f419313j;

    /* compiled from: SignState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/d$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k C44503a c44503a, @k String str, @l PrintableText printableText, boolean z12, @k String str2, @k String str3, @k String str4, @l String str5, @l String str6) {
        this.f419305b = c44503a;
        this.f419306c = str;
        this.f419307d = printableText;
        this.f419308e = z12;
        this.f419309f = str2;
        this.f419310g = str3;
        this.f419311h = str4;
        this.f419312i = str5;
        this.f419313j = str6;
    }

    public static d a(d dVar, C44503a c44503a, PrintableText printableText, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            c44503a = dVar.f419305b;
        }
        C44503a c44503a2 = c44503a;
        String str = dVar.f419306c;
        if ((i12 & 4) != 0) {
            printableText = dVar.f419307d;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 8) != 0) {
            z12 = dVar.f419308e;
        }
        String str2 = dVar.f419309f;
        String str3 = dVar.f419310g;
        String str4 = dVar.f419311h;
        String str5 = dVar.f419312i;
        String str6 = dVar.f419313j;
        dVar.getClass();
        return new d(c44503a2, str, printableText2, z12, str2, str3, str4, str5, str6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f419305b, dVar.f419305b) && L.f(this.f419306c, dVar.f419306c) && L.f(this.f419307d, dVar.f419307d) && this.f419308e == dVar.f419308e && L.f(this.f419309f, dVar.f419309f) && L.f(this.f419310g, dVar.f419310g) && L.f(this.f419311h, dVar.f419311h) && L.f(this.f419312i, dVar.f419312i) && L.f(this.f419313j, dVar.f419313j);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f419305b.f419293a.hashCode() * 31, 31, this.f419306c);
        PrintableText printableText = this.f419307d;
        int iD3 = H.d(H.d(H.d(r.i((iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f419308e), 31, this.f419309f), 31, this.f419310g), 31, this.f419311h);
        String str = this.f419312i;
        int iHashCode = (iD3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f419313j;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignState(drawState=");
        sb2.append(this.f419305b);
        sb2.append(", name=");
        sb2.append(this.f419306c);
        sb2.append(", error=");
        sb2.append(this.f419307d);
        sb2.append(", isLoading=");
        sb2.append(this.f419308e);
        sb2.append(", packageId=");
        sb2.append(this.f419309f);
        sb2.append(", documentId=");
        sb2.append(this.f419310g);
        sb2.append(", clientProfileId=");
        sb2.append(this.f419311h);
        sb2.append(", applicantType=");
        sb2.append(this.f419312i);
        sb2.append(", applicationId=");
        return C22026a.c(sb2, this.f419313j, ')');
    }
}
