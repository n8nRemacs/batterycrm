package com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.models.SparePartsGroup;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3Item.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/e;", "Lcom/avito/conveyor_item/a;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f284782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f284783c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f284784d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f284785e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final SparePartsGroup f284786f;

    public e(String str, String str2, String str3, boolean z12, SparePartsGroup sparePartsGroup, int i12, C42822w c42822w) {
        this.f284782b = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
        this.f284783c = str2;
        this.f284784d = str3;
        this.f284785e = z12;
        this.f284786f = sparePartsGroup;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f284782b, eVar.f284782b) && L.f(this.f284783c, eVar.f284783c) && L.f(this.f284784d, eVar.f284784d) && this.f284785e == eVar.f284785e && L.f(this.f284786f, eVar.f284786f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF284782b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF284782b() {
        return this.f284782b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f284782b.hashCode() * 31, 31, this.f284783c);
        String str = this.f284784d;
        int i12 = r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f284785e);
        SparePartsGroup sparePartsGroup = this.f284786f;
        return i12 + (sparePartsGroup != null ? sparePartsGroup.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SparePartsV3Item(stringId=" + this.f284782b + ", title=" + this.f284783c + ", subtitle=" + this.f284784d + ", clickable=" + this.f284785e + ", group=" + this.f284786f + ')';
    }
}
