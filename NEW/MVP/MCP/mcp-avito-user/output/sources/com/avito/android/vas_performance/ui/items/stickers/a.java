package com.avito.android.vas_performance.ui.items.stickers;

import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickerChipable.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f321722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f321723c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Boolean f321724d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f321725e;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        this.f321722b = str;
        this.f321723c = str2;
        this.f321724d = bool;
        this.f321725e = str3;
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
        return L.f(this.f321722b, ((a) obj).f321722b);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF6557d() {
        return this.f321723c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF178766f() {
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

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF178769i() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    public /* synthetic */ a(String str, String str2, Boolean bool, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? Boolean.FALSE : bool, (i12 & 8) != 0 ? null : str3);
    }
}
