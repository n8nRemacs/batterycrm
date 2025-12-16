package com.avito.android.comfortable_deal.deal.item.stages;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StagesItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/stages/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f121528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalColor f121530d;

    public c(@k ArrayList arrayList, int i12, @k UniversalColor universalColor) {
        this.f121528b = arrayList;
        this.f121529c = i12;
        this.f121530d = universalColor;
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
        return this.f121528b.equals(cVar.f121528b) && this.f121529c == cVar.f121529c && L.f(this.f121530d, cVar.f121530d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77493b() {
        return 906596317;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF77494c() {
        return "stages_item";
    }

    public final int hashCode() {
        return this.f121530d.hashCode() + r.e(this.f121529c, androidx.compose.ui.graphics.colorspace.e.g(this.f121528b, -1960285245, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StagesItem(stringId=stages_item, stages=");
        sb2.append(this.f121528b);
        sb2.append(", selectedStage=");
        sb2.append(this.f121529c);
        sb2.append(", stageColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f121530d, ')');
    }
}
