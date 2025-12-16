package com.avito.android.autoteka.items.reportGenerationResponse;

import Dj0.C13407a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReportGenerationResponseItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/reportGenerationResponse/c;", "Lcom/avito/conveyor_item/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96989b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f96990c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f96991d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GetStepReportStatusApiResponse.Status f96992e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C13407a f96993f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f96994g;

    public c(String str, String str2, AttributedText attributedText, GetStepReportStatusApiResponse.Status status, C13407a c13407a, String str3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_REPORT_GENERATION_RESPONSE";
        }
        this.f96989b = str;
        this.f96990c = str2;
        this.f96991d = attributedText;
        this.f96992e = status;
        this.f96993f = c13407a;
        this.f96994g = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f96989b, cVar.f96989b) && L.f(this.f96990c, cVar.f96990c) && L.f(this.f96991d, cVar.f96991d) && this.f96992e == cVar.f96992e && L.f(this.f96993f, cVar.f96993f) && L.f(this.f96994g, cVar.f96994g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF281670b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281670b() {
        return this.f96989b;
    }

    public final int hashCode() {
        int iHashCode = this.f96989b.hashCode() * 31;
        String str = this.f96990c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f96991d;
        int iHashCode3 = (this.f96992e.hashCode() + ((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        C13407a c13407a = this.f96993f;
        int iHashCode4 = (iHashCode3 + (c13407a == null ? 0 : c13407a.hashCode())) * 31;
        String str2 = this.f96994g;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportGenerationResponseItem(stringId=");
        sb2.append(this.f96989b);
        sb2.append(", title=");
        sb2.append(this.f96990c);
        sb2.append(", description=");
        sb2.append(this.f96991d);
        sb2.append(", generationStatus=");
        sb2.append(this.f96992e);
        sb2.append(", action=");
        sb2.append(this.f96993f);
        sb2.append(", reportPublicId=");
        return C22026a.c(sb2, this.f96994g, ')');
    }
}
