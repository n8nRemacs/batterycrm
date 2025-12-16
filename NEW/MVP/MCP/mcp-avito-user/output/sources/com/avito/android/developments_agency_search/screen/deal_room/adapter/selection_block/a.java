package com.avito.android.developments_agency_search.screen.deal_room.adapter.selection_block;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/selection_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137430b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137431c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f137432d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f137433e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Image f137434f;

    public a(@k String str, @k String str2, @k String str3, @k String str4, @k Image image) {
        this.f137430b = str;
        this.f137431c = str2;
        this.f137432d = str3;
        this.f137433e = str4;
        this.f137434f = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f137430b, aVar.f137430b) && L.f(this.f137431c, aVar.f137431c) && L.f(this.f137432d, aVar.f137432d) && L.f(this.f137433e, aVar.f137433e) && L.f(this.f137434f, aVar.f137434f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return -1198886092;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF314301b() {
        return "selection-block-item";
    }

    public final int hashCode() {
        return this.f137434f.hashCode() + H.d(H.d(H.d(H.d(1489236812, 31, this.f137430b), 31, this.f137431c), 31, this.f137432d), 31, this.f137433e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionBlockItem(stringId=selection-block-item, selectionId=");
        sb2.append(this.f137430b);
        sb2.append(", title=");
        sb2.append(this.f137431c);
        sb2.append(", objects=");
        sb2.append(this.f137432d);
        sb2.append(", updateTime=");
        sb2.append(this.f137433e);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f137434f, ')');
    }
}
