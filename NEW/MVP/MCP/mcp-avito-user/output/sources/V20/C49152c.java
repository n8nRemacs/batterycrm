package v20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.motivation_screen.models.UiProgressStep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationUiState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv20/c;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49152c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<String> f440404a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440405b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f440406c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f440407d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f440408e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f440409f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f440410g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<UiProgressStep> f440411h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f440412i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final d f440413j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final d f440414k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f440415l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f440416m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f440417n;

    public C49152c() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, false, 16383, null);
    }

    public static C49152c a(C49152c c49152c, boolean z12, boolean z13) {
        List<String> list = c49152c.f440404a;
        String str = c49152c.f440405b;
        AttributedText attributedText = c49152c.f440406c;
        String str2 = c49152c.f440407d;
        AttributedText attributedText2 = c49152c.f440408e;
        String str3 = c49152c.f440409f;
        String str4 = c49152c.f440410g;
        List<UiProgressStep> list2 = c49152c.f440411h;
        String str5 = c49152c.f440412i;
        d dVar = c49152c.f440413j;
        d dVar2 = c49152c.f440414k;
        boolean z14 = c49152c.f440417n;
        c49152c.getClass();
        return new C49152c(list, str, attributedText, str2, attributedText2, str3, str4, list2, str5, dVar, dVar2, z12, z13, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49152c)) {
            return false;
        }
        C49152c c49152c = (C49152c) obj;
        return L.f(this.f440404a, c49152c.f440404a) && L.f(this.f440405b, c49152c.f440405b) && L.f(this.f440406c, c49152c.f440406c) && L.f(this.f440407d, c49152c.f440407d) && L.f(this.f440408e, c49152c.f440408e) && L.f(this.f440409f, c49152c.f440409f) && L.f(this.f440410g, c49152c.f440410g) && L.f(this.f440411h, c49152c.f440411h) && L.f(this.f440412i, c49152c.f440412i) && L.f(this.f440413j, c49152c.f440413j) && L.f(this.f440414k, c49152c.f440414k) && this.f440415l == c49152c.f440415l && this.f440416m == c49152c.f440416m && this.f440417n == c49152c.f440417n;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(H.d(com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.b(H.d(this.f440404a.hashCode() * 31, 31, this.f440405b), 31, this.f440406c), 31, this.f440407d), 31, this.f440408e), 31, this.f440409f), 31, this.f440410g), 31, this.f440411h);
        String str = this.f440412i;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f440413j;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f440414k;
        return Boolean.hashCode(this.f440417n) + r.i(r.i((iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.f440415l), 31, this.f440416m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MotivationUiState(badges=");
        sb2.append(this.f440404a);
        sb2.append(", title=");
        sb2.append(this.f440405b);
        sb2.append(", subtitle=");
        sb2.append(this.f440406c);
        sb2.append(", description=");
        sb2.append(this.f440407d);
        sb2.append(", duration=");
        sb2.append(this.f440408e);
        sb2.append(", progressTitle=");
        sb2.append(this.f440409f);
        sb2.append(", progressSubtitle=");
        sb2.append(this.f440410g);
        sb2.append(", uiProgressSteps=");
        sb2.append(this.f440411h);
        sb2.append(", paymentTitle=");
        sb2.append(this.f440412i);
        sb2.append(", infoButton=");
        sb2.append(this.f440413j);
        sb2.append(", button=");
        sb2.append(this.f440414k);
        sb2.append(", isLoading=");
        sb2.append(this.f440415l);
        sb2.append(", isError=");
        sb2.append(this.f440416m);
        sb2.append(", shouldShowAnimation=");
        return r.x(sb2, this.f440417n, ')');
    }

    public C49152c(@k List<String> list, @k String str, @k AttributedText attributedText, @k String str2, @k AttributedText attributedText2, @k String str3, @k String str4, @k List<UiProgressStep> list2, @l String str5, @l d dVar, @l d dVar2, boolean z12, boolean z13, boolean z14) {
        this.f440404a = list;
        this.f440405b = str;
        this.f440406c = attributedText;
        this.f440407d = str2;
        this.f440408e = attributedText2;
        this.f440409f = str3;
        this.f440410g = str4;
        this.f440411h = list2;
        this.f440412i = str5;
        this.f440413j = dVar;
        this.f440414k = dVar2;
        this.f440415l = z12;
        this.f440416m = z13;
        this.f440417n = z14;
    }

    public C49152c(List list, String str, AttributedText attributedText, String str2, AttributedText attributedText2, String str3, String str4, List list2, String str5, d dVar, d dVar2, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText2, (i12 & 32) != 0 ? "" : str3, (i12 & 64) == 0 ? str4 : "", (i12 & 128) != 0 ? C42784z0.f406748b : list2, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : dVar, (i12 & 1024) == 0 ? dVar2 : null, (i12 & 2048) != 0 ? true : z12, (i12 & 4096) != 0 ? false : z13, (i12 & 8192) == 0 ? z14 : false);
    }
}
