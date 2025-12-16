package com.avito.android.screens.bbip_private.ui.items.duration;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateDurationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/duration/b;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260831b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f260832c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f260833d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f260834e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f260835f;

    /* renamed from: g, reason: collision with root package name */
    public final int f260836g;

    /* renamed from: h, reason: collision with root package name */
    public final int f260837h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f260838i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f260839j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f260840k;

    public b(@Y61.k String str, boolean z12, @Y61.k ArrayList arrayList, @Y61.k List list, @Y61.k List list2, int i12, int i13, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f260831b = str;
        this.f260832c = z12;
        this.f260833d = arrayList;
        this.f260834e = list;
        this.f260835f = list2;
        this.f260836g = i12;
        this.f260837h = i13;
        this.f260838i = str2;
        this.f260839j = str3;
        this.f260840k = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f260831b, bVar.f260831b) && this.f260832c == bVar.f260832c && this.f260833d.equals(bVar.f260833d) && L.f(this.f260834e, bVar.f260834e) && L.f(this.f260835f, bVar.f260835f) && this.f260836g == bVar.f260836g && this.f260837h == bVar.f260837h && L.f(this.f260838i, bVar.f260838i) && L.f(this.f260839j, bVar.f260839j) && L.f(this.f260840k, bVar.f260840k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return 1639403688;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF246493b() {
        return "bbip_private_duration";
    }

    public final int hashCode() {
        return this.f260840k.hashCode() + H.d(H.d(r.e(this.f260837h, r.e(this.f260836g, H.e(H.e(androidx.compose.ui.graphics.colorspace.e.g(this.f260833d, r.i(H.d(-718093224, 31, this.f260831b), 31, this.f260832c), 31), 31, this.f260834e), 31, this.f260835f), 31), 31), 31, this.f260838i), 31, this.f260839j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateDurationItem(stringId=bbip_private_duration, title=");
        sb2.append(this.f260831b);
        sb2.append(", useWidgetTextStyle=");
        sb2.append(this.f260832c);
        sb2.append(", allDurations=");
        sb2.append(this.f260833d);
        sb2.append(", recommended=");
        sb2.append(this.f260834e);
        sb2.append(", shownDurations=");
        sb2.append(this.f260835f);
        sb2.append(", preselected=");
        sb2.append(this.f260836g);
        sb2.append(", selected=");
        sb2.append(this.f260837h);
        sb2.append(", moreButtonLabel=");
        sb2.append(this.f260838i);
        sb2.append(", selectTitle=");
        sb2.append(this.f260839j);
        sb2.append(", selectButtonText=");
        return C22026a.c(sb2, this.f260840k, ')');
    }
}
