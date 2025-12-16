package com.avito.android.user_advert.advert.items.reject;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.evidence.EvidenceData;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RejectReasonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reject/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f309981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f309982e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f309983f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Action f309984g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final EvidenceData f309985h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f309986i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f309987j;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l AttributedText attributedText, @Y61.l Action action, @Y61.l EvidenceData evidenceData, boolean z12, @Y61.l String str5) {
        this.f309979b = str;
        this.f309980c = str2;
        this.f309981d = str3;
        this.f309982e = str4;
        this.f309983f = attributedText;
        this.f309984g = action;
        this.f309985h = evidenceData;
        this.f309986i = z12;
        this.f309987j = str5;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309979b, aVar.f309979b) && L.f(this.f309980c, aVar.f309980c) && L.f(this.f309981d, aVar.f309981d) && L.f(this.f309982e, aVar.f309982e) && L.f(this.f309983f, aVar.f309983f) && L.f(this.f309984g, aVar.f309984g) && L.f(this.f309985h, aVar.f309985h) && this.f309986i == aVar.f309986i && L.f(this.f309987j, aVar.f309987j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268775b() {
        return getF268777c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268777c() {
        return this.f309979b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f309979b.hashCode() * 31, 31, this.f309980c);
        String str = this.f309981d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f309982e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f309983f;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Action action = this.f309984g;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        EvidenceData evidenceData = this.f309985h;
        int i12 = r.i((iHashCode4 + (evidenceData == null ? 0 : evidenceData.hashCode())) * 31, 31, this.f309986i);
        String str3 = this.f309987j;
        return i12 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RejectReasonItem(stringId=");
        sb2.append(this.f309979b);
        sb2.append(", name=");
        sb2.append(this.f309980c);
        sb2.append(", title=");
        sb2.append(this.f309981d);
        sb2.append(", description=");
        sb2.append(this.f309982e);
        sb2.append(", support=");
        sb2.append(this.f309983f);
        sb2.append(", action=");
        sb2.append(this.f309984g);
        sb2.append(", evidenceData=");
        sb2.append(this.f309985h);
        sb2.append(", orangeBackground=");
        sb2.append(this.f309986i);
        sb2.append(", promoBlockStyle=");
        return C22026a.c(sb2, this.f309987j, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, AttributedText attributedText, Action action, EvidenceData evidenceData, boolean z12, String str5, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : action, (i12 & 64) != 0 ? null : evidenceData, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? null : str5);
    }
}
