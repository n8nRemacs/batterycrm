package com.avito.android.search.filter.adapter.chips;

import androidx.compose.runtime.C22026a;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipsSingleSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/chips/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f262140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CharSequence f262141c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f262142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f262143e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f262144f;

    public a(@Y61.k String str, @Y61.k CharSequence charSequence, boolean z12, boolean z13, @Y61.l String str2) {
        this.f262140b = str;
        this.f262141c = charSequence;
        this.f262142d = z12;
        this.f262143e = z13;
        this.f262144f = str2;
    }

    public static a a(a aVar, CharSequence charSequence) {
        return new a(aVar.f262140b, charSequence, aVar.f262142d, aVar.f262143e, aVar.f262144f);
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
            return false;
        }
        CharSequence charSequence = this.f262141c;
        if (charSequence.length() > 0) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
            if (hVar.getF199741b().length() > 0) {
                return L.f(charSequence.toString(), hVar.getF199741b().toString());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W, reason: from getter */
    public final CharSequence getF199741b() {
        return this.f262141c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f262140b, aVar.f262140b) && L.f(this.f262141c, aVar.f262141c) && this.f262142d == aVar.f262142d && this.f262143e == aVar.f262143e && L.f(this.f262144f, aVar.f262144f);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF281694e() {
        return this.f262143e;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(com.avito.android.advert.item.delivery_suggests.l.c(this.f262140b.hashCode() * 31, 31, this.f262141c), 31, this.f262142d), 31, this.f262143e);
        String str = this.f262144f;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF281693d() {
        return this.f262142d;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipableValue(stringId=");
        sb2.append(this.f262140b);
        sb2.append(", chipTitle=");
        sb2.append((Object) this.f262141c);
        sb2.append(", isEnabled=");
        sb2.append(this.f262142d);
        sb2.append(", isSelectedChip=");
        sb2.append(this.f262143e);
        sb2.append(", leftIcon=");
        return C22026a.c(sb2, this.f262144f, ')');
    }

    public /* synthetic */ a(String str, CharSequence charSequence, boolean z12, boolean z13, String str2, int i12, C42822w c42822w) {
        this(str, charSequence, z12, z13, (i12 & 16) != 0 ? null : str2);
    }
}
