package sH;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/e;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final f f437578a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437579b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f437580c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f437581d;

    public e() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f437578a, eVar.f437578a) && L.f(this.f437579b, eVar.f437579b) && L.f(this.f437580c, eVar.f437580c) && L.f(this.f437581d, eVar.f437581d);
    }

    public final int hashCode() {
        f fVar = this.f437578a;
        int iD2 = H.d((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f437579b);
        DeepLink deepLink = this.f437580c;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.f437581d;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentInfo(requisites=");
        sb2.append(this.f437578a);
        sb2.append(", buttonText=");
        sb2.append(this.f437579b);
        sb2.append(", buttonDeepLink=");
        sb2.append(this.f437580c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f437581d, ')');
    }

    public e(@l f fVar, @k String str, @l DeepLink deepLink, @l AttributedText attributedText) {
        this.f437578a = fVar;
        this.f437579b = str;
        this.f437580c = deepLink;
        this.f437581d = attributedText;
    }

    public /* synthetic */ e(f fVar, String str, DeepLink deepLink, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : fVar, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : attributedText);
    }
}
