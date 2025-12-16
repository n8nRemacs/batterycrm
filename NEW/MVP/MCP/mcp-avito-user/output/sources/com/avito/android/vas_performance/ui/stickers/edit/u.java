package com.avito.android.vas_performance.ui.stickers.edit;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickersEditVasViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/u;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f322061a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.conveyor_item.a> f322062b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<EL0.a> f322063c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f322064d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322065e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.vas_performance.ui.a f322066f;

    public u() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public static u a(u uVar, Float f12, List list, String str, com.avito.android.vas_performance.ui.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            f12 = uVar.f322061a;
        }
        Float f13 = f12;
        if ((i12 & 8) != 0) {
            str = uVar.f322064d;
        }
        String str2 = str;
        if ((i12 & 32) != 0) {
            aVar = uVar.f322066f;
        }
        return new u(f13, list, uVar.f322063c, str2, uVar.f322065e, aVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f322061a, uVar.f322061a) && L.f(this.f322062b, uVar.f322062b) && L.f(this.f322063c, uVar.f322063c) && L.f(this.f322064d, uVar.f322064d) && this.f322065e == uVar.f322065e && L.f(this.f322066f, uVar.f322066f);
    }

    public final int hashCode() {
        Float f12 = this.f322061a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        List<com.avito.conveyor_item.a> list = this.f322062b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<EL0.a> list2 = this.f322063c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f322064d;
        int iE2 = androidx.appcompat.app.r.e(this.f322065e, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        com.avito.android.vas_performance.ui.a aVar = this.f322066f;
        return iE2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "StickersEditVasViewState(progress=" + this.f322061a + ", items=" + this.f322062b + ", selectedStickers=" + this.f322063c + ", alertMessage=" + this.f322064d + ", difCount=" + this.f322065e + ", buttonState=" + this.f322066f + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@Y61.l Float f12, @Y61.l List<? extends com.avito.conveyor_item.a> list, @Y61.l List<EL0.a> list2, @Y61.l String str, int i12, @Y61.l com.avito.android.vas_performance.ui.a aVar) {
        this.f322061a = f12;
        this.f322062b = list;
        this.f322063c = list2;
        this.f322064d = str;
        this.f322065e = i12;
        this.f322066f = aVar;
    }

    public /* synthetic */ u(Float f12, List list, List list2, String str, int i12, com.avito.android.vas_performance.ui.a aVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : f12, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? null : list2, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? null : aVar);
    }
}
