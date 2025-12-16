package com.avito.android.comfortable_deal.deal.item.mortgage;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/mortgage/c;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a, b.InterfaceC10495b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f121433b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CurrentStage f121434c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f121435d;

    public c(@Y61.k DeepLink deepLink, @l CurrentStage currentStage, @l String str) {
        this.f121433b = deepLink;
        this.f121434c = currentStage;
        this.f121435d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f121433b, cVar.f121433b) && this.f121434c == cVar.f121434c && L.f(this.f121435d, cVar.f121435d);
    }

    @Override // TV0.a
    public final long getId() {
        return 330881315;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF281447b() {
        return "mortgage_banner_item";
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF270103g() {
        return 330881315;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f121433b, 1667386173, 31);
        CurrentStage currentStage = this.f121434c;
        int iHashCode = (iE2 + (currentStage == null ? 0 : currentStage.hashCode())) * 31;
        String str = this.f121435d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageBannerItem(stringId=mortgage_banner_item, mortgageLink=");
        sb2.append(this.f121433b);
        sb2.append(", dealStage=");
        sb2.append(this.f121434c);
        sb2.append(", agentFullName=");
        return C22026a.c(sb2, this.f121435d, ')');
    }
}
