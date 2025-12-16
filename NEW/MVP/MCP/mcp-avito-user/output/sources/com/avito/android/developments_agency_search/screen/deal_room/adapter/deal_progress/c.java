package com.avito.android.developments_agency_search.screen.deal_room.adapter.deal_progress;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealProgressItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/deal_progress/c;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.android.lib.compose.design.shared.stepsbar.b> f137304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f137305c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f137306d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalColor f137307e;

    public c(@k List list, int i12, @l Float f12, @k UniversalColor universalColor) {
        this.f137304b = list;
        this.f137305c = i12;
        this.f137306d = f12;
        this.f137307e = universalColor;
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
        return L.f(this.f137304b, cVar.f137304b) && this.f137305c == cVar.f137305c && this.f137306d.equals(cVar.f137306d) && L.f(this.f137307e, cVar.f137307e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return -593662190;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF130032d() {
        return "deal-progress-item";
    }

    public final int hashCode() {
        return this.f137307e.hashCode() + ((this.f137306d.hashCode() + r.e(this.f137305c, H.e(-1223658706, 31, this.f137304b), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealProgressItem(stringId=deal-progress-item, steps=");
        sb2.append(this.f137304b);
        sb2.append(", currentStep=");
        sb2.append(this.f137305c);
        sb2.append(", currentStepProgressValue=");
        sb2.append(this.f137306d);
        sb2.append(", progressColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f137307e, ')');
    }
}
