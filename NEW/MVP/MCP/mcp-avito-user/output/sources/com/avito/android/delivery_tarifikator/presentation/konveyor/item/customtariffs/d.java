package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CustomTariffsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/d;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f135364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f135365c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f135366d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f135367e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f135368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135369g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f135370h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k String str, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k String str2, @l String str3, @l String str4, boolean z12, boolean z13) {
        this.f135364b = str;
        this.f135365c = list;
        this.f135366d = str2;
        this.f135367e = str3;
        this.f135368f = str4;
        this.f135369g = z12;
        this.f135370h = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f135364b, dVar.f135364b) && L.f(this.f135365c, dVar.f135365c) && L.f(this.f135366d, dVar.f135366d) && L.f(this.f135367e, dVar.f135367e) && L.f(this.f135368f, dVar.f135368f) && this.f135369g == dVar.f135369g && this.f135370h == dVar.f135370h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return getF135364b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136215b() {
        return this.f135364b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(this.f135364b.hashCode() * 31, 31, this.f135365c), 31, this.f135366d);
        String str = this.f135367e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135368f;
        return Boolean.hashCode(this.f135370h) + r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f135369g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomTariffsItem(stringId=");
        sb2.append(this.f135364b);
        sb2.append(", tariffCards=");
        sb2.append(this.f135365c);
        sb2.append(", title=");
        sb2.append(this.f135366d);
        sb2.append(", badgeText=");
        sb2.append(this.f135367e);
        sb2.append(", description=");
        sb2.append(this.f135368f);
        sb2.append(", shouldShowCreateButton=");
        sb2.append(this.f135369g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f135370h, ')');
    }

    public /* synthetic */ d(String str, List list, String str2, String str3, String str4, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, list, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? true : z12, (i12 & 64) != 0 ? false : z13);
    }
}
