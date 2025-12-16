package com.avito.android.select.bottom_sheet.blueprints.chips;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.chips.state.ChipsState;
import j.U;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckableChipsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/chips/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f265059b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f265060c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f265061d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ChipsState.DisplayType f265062e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f265063f;

    /* renamed from: g, reason: collision with root package name */
    public final int f265064g;

    /* renamed from: h, reason: collision with root package name */
    public final int f265065h;

    /* renamed from: i, reason: collision with root package name */
    public final int f265066i;

    /* renamed from: j, reason: collision with root package name */
    public final int f265067j;

    public a(@k String str, @l String str2, @k ArrayList arrayList, @k ChipsState.DisplayType displayType, @l String str3, @U int i12, @U int i13, @U int i14, @U int i15) {
        this.f265059b = str;
        this.f265060c = str2;
        this.f265061d = arrayList;
        this.f265062e = displayType;
        this.f265063f = str3;
        this.f265064g = i12;
        this.f265065h = i13;
        this.f265066i = i14;
        this.f265067j = i15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f265059b, aVar.f265059b) && L.f(this.f265060c, aVar.f265060c) && this.f265061d.equals(aVar.f265061d) && this.f265062e == aVar.f265062e && L.f(this.f265063f, aVar.f265063f) && this.f265064g == aVar.f265064g && this.f265065h == aVar.f265065h && this.f265066i == aVar.f265066i && this.f265067j == aVar.f265067j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return getF130049b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130049b() {
        return this.f265059b;
    }

    public final int hashCode() {
        int iHashCode = this.f265059b.hashCode() * 31;
        String str = this.f265060c;
        int iHashCode2 = (this.f265062e.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f265061d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.f265063f;
        return Integer.hashCode(this.f265067j) + r.e(this.f265066i, r.e(this.f265065h, r.e(this.f265064g, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckableChipsItem(stringId=");
        sb2.append(this.f265059b);
        sb2.append(", title=");
        sb2.append(this.f265060c);
        sb2.append(", items=");
        sb2.append(this.f265061d);
        sb2.append(", displayType=");
        sb2.append(this.f265062e);
        sb2.append(", itemsStyleName=");
        sb2.append(this.f265063f);
        sb2.append(", contentInsets=");
        sb2.append(this.f265064g);
        sb2.append(", horizontalMargin=");
        sb2.append(this.f265065h);
        sb2.append(", topMargin=");
        sb2.append(this.f265066i);
        sb2.append(", bottomMargin=");
        return r.t(sb2, this.f265067j, ')');
    }
}
