package com.avito.android.blueprints.chips;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipsSelectItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/chips/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f105839c;

    public a(@k String str, @k String str2) {
        this.f105838b = str;
        this.f105839c = str2;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
            return false;
        }
        String str = this.f105839c;
        if (str.length() > 0) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
            if (hVar.getF114848c().length() > 0) {
                return L.f(str, hVar.getF114848c());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f105839c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f105838b, aVar.f105838b) && L.f(this.f105839c, aVar.f105839c);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return this.f105839c.hashCode() + (this.f105838b.hashCode() * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF262142d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipableValue(stringId=");
        sb2.append(this.f105838b);
        sb2.append(", chipTitle=");
        return C22026a.c(sb2, this.f105839c, ')');
    }
}
