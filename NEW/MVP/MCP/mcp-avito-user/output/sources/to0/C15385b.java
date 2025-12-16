package To0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/b;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: To0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15385b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f15882a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f15883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f15884c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f15885d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f15886e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f15887f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f15888g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f15889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AttributedText f15890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f15891j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final AttributedText f15892k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f15893l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f15894m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f15895n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f15896o;

    public C15385b(@k AttributedText attributedText, @k AttributedText attributedText2, @k AttributedText attributedText3, @k g gVar, @k String str, @k String str2, @k String str3, @k String str4, @k AttributedText attributedText4, @k String str5, @k AttributedText attributedText5, @k String str6, @k String str7, @k String str8, @k String str9) {
        this.f15882a = attributedText;
        this.f15883b = attributedText2;
        this.f15884c = attributedText3;
        this.f15885d = gVar;
        this.f15886e = str;
        this.f15887f = str2;
        this.f15888g = str3;
        this.f15889h = str4;
        this.f15890i = attributedText4;
        this.f15891j = str5;
        this.f15892k = attributedText5;
        this.f15893l = str6;
        this.f15894m = str7;
        this.f15895n = str8;
        this.f15896o = str9;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15385b)) {
            return false;
        }
        C15385b c15385b = (C15385b) obj;
        return L.f(this.f15882a, c15385b.f15882a) && L.f(this.f15883b, c15385b.f15883b) && L.f(this.f15884c, c15385b.f15884c) && L.f(this.f15885d, c15385b.f15885d) && L.f(this.f15886e, c15385b.f15886e) && L.f(this.f15887f, c15385b.f15887f) && L.f(this.f15888g, c15385b.f15888g) && L.f(this.f15889h, c15385b.f15889h) && L.f(this.f15890i, c15385b.f15890i) && L.f(this.f15891j, c15385b.f15891j) && L.f(this.f15892k, c15385b.f15892k) && L.f(this.f15893l, c15385b.f15893l) && L.f(this.f15894m, c15385b.f15894m) && L.f(this.f15895n, c15385b.f15895n) && L.f(this.f15896o, c15385b.f15896o);
    }

    public final int hashCode() {
        return this.f15896o.hashCode() + H.d(H.d(H.d(com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.b(H.d(H.d(H.d(H.d((this.f15885d.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.f15882a.hashCode() * 31, 31, this.f15883b), 31, this.f15884c)) * 31, 31, this.f15886e), 31, this.f15887f), 31, this.f15888g), 31, this.f15889h), 31, this.f15890i), 31, this.f15891j), 31, this.f15892k), 31, this.f15893l), 31, this.f15894m), 31, this.f15895n);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Descriptions(audienceExplained=");
        sb2.append(this.f15882a);
        sb2.append(", howItWorks=");
        sb2.append(this.f15883b);
        sb2.append(", noAudience=");
        sb2.append(this.f15884c);
        sb2.append(", previewTitle=");
        sb2.append(this.f15885d);
        sb2.append(", recipients=");
        sb2.append(this.f15886e);
        sb2.append(", title=");
        sb2.append(this.f15887f);
        sb2.append(", offerTypeSubTitle=");
        sb2.append(this.f15888g);
        sb2.append(", autoDispatchSubTitle=");
        sb2.append(this.f15889h);
        sb2.append(", autoDispatchExplained=");
        sb2.append(this.f15890i);
        sb2.append(", autoDispatchRequired=");
        sb2.append(this.f15891j);
        sb2.append(", autoDispatchSummaryExplained=");
        sb2.append(this.f15892k);
        sb2.append(", fastChipsRecommendationSubtitle=");
        sb2.append(this.f15893l);
        sb2.append(", fastChipsRecommendationTitle=");
        sb2.append(this.f15894m);
        sb2.append(", fastChipsSubtitle=");
        sb2.append(this.f15895n);
        sb2.append(", fastChipsTitle=");
        return C22026a.c(sb2, this.f15896o, ')');
    }
}
