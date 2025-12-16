package com.avito.android.vas_performance.ui.stickers.buy;

import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickersBuyVasViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/z;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f321997a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.conveyor_item.a> f321998b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<EL0.a> f321999c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final FL0.b f322000d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.vas_performance.ui.a f322001e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final MnzFloatingFooter f322002f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final MnzFloatingFooterContact f322003g;

    public z() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static z a(z zVar, Float f12, List list, FL0.b bVar, com.avito.android.vas_performance.ui.a aVar, MnzFloatingFooter mnzFloatingFooter, int i12) {
        if ((i12 & 1) != 0) {
            f12 = zVar.f321997a;
        }
        Float f13 = f12;
        if ((i12 & 8) != 0) {
            bVar = zVar.f322000d;
        }
        FL0.b bVar2 = bVar;
        if ((i12 & 16) != 0) {
            aVar = zVar.f322001e;
        }
        com.avito.android.vas_performance.ui.a aVar2 = aVar;
        if ((i12 & 32) != 0) {
            mnzFloatingFooter = zVar.f322002f;
        }
        return new z(f13, list, zVar.f321999c, bVar2, aVar2, mnzFloatingFooter, zVar.f322003g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f321997a, zVar.f321997a) && L.f(this.f321998b, zVar.f321998b) && L.f(this.f321999c, zVar.f321999c) && L.f(this.f322000d, zVar.f322000d) && L.f(this.f322001e, zVar.f322001e) && L.f(this.f322002f, zVar.f322002f) && L.f(this.f322003g, zVar.f322003g);
    }

    public final int hashCode() {
        Float f12 = this.f321997a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        List<com.avito.conveyor_item.a> list = this.f321998b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<EL0.a> list2 = this.f321999c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FL0.b bVar = this.f322000d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        com.avito.android.vas_performance.ui.a aVar = this.f322001e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f322002f;
        int iHashCode6 = (iHashCode5 + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31;
        MnzFloatingFooterContact mnzFloatingFooterContact = this.f322003g;
        return iHashCode6 + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "StickersBuyVasViewState(progress=" + this.f321997a + ", items=" + this.f321998b + ", selectedStickers=" + this.f321999c + ", infoSection=" + this.f322000d + ", buttonState=" + this.f322001e + ", bblModel=" + this.f322002f + ", currentContact=" + this.f322003g + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@Y61.l Float f12, @Y61.l List<? extends com.avito.conveyor_item.a> list, @Y61.l List<EL0.a> list2, @Y61.l FL0.b bVar, @Y61.l com.avito.android.vas_performance.ui.a aVar, @Y61.l MnzFloatingFooter mnzFloatingFooter, @Y61.l MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.f321997a = f12;
        this.f321998b = list;
        this.f321999c = list2;
        this.f322000d = bVar;
        this.f322001e = aVar;
        this.f322002f = mnzFloatingFooter;
        this.f322003g = mnzFloatingFooterContact;
    }

    public /* synthetic */ z(Float f12, List list, List list2, FL0.b bVar, com.avito.android.vas_performance.ui.a aVar, MnzFloatingFooter mnzFloatingFooter, MnzFloatingFooterContact mnzFloatingFooterContact, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : f12, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? null : aVar, (i12 & 32) != 0 ? null : mnzFloatingFooter, (i12 & 64) != 0 ? null : mnzFloatingFooterContact);
    }
}
