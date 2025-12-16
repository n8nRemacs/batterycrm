package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickerChipable.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f320661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f320662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f320663d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f320664e;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        this.f320661b = str;
        this.f320662c = str2;
        this.f320663d = bool;
        this.f320664e = str3;
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
        if (!(obj instanceof a)) {
            return false;
        }
        return L.f(this.f320661b, ((a) obj).f320661b);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF278901b() {
        return this.f320662c;
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
        return L.f(this.f320661b, aVar.f320661b) && L.f(this.f320662c, aVar.f320662c) && L.f(this.f320663d, aVar.f320663d) && L.f(this.f320664e, aVar.f320664e);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF249891e() {
        return false;
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
        int iD2 = H.d(this.f320661b.hashCode() * 31, 31, this.f320662c);
        Boolean bool = this.f320663d;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f320664e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF249892f() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickerChipable(stringId=");
        sb2.append(this.f320661b);
        sb2.append(", chipTitle=");
        sb2.append(this.f320662c);
        sb2.append(", isSelected=");
        sb2.append(this.f320663d);
        sb2.append(", descriptionForSeller=");
        return C22026a.c(sb2, this.f320664e, ')');
    }

    public /* synthetic */ a(String str, String str2, Boolean bool, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? Boolean.FALSE : bool, (i12 & 8) != 0 ? null : str3);
    }
}
