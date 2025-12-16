package com.avito.android.blueprints.withSuggestedOptions;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectWithSuggestedOptionsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/withSuggestedOptions/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f106769c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106770d;

    public a(@k String str, @k String str2, boolean z12) {
        this.f106768b = str;
        this.f106769c = str2;
        this.f106770d = z12;
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
        String str = this.f106769c;
        if (str.length() > 0) {
            com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
            if (hVar.getF199741b().length() > 0) {
                return L.f(str, hVar.getF199741b());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f106769c;
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
        return L.f(this.f106768b, aVar.f106768b) && L.f(this.f106769c, aVar.f106769c) && this.f106770d == aVar.f106770d;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF106770d() {
        return this.f106770d;
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
        return Boolean.hashCode(this.f106770d) + H.d(this.f106768b.hashCode() * 31, 31, this.f106769c);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF171727d() {
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
        sb2.append(this.f106768b);
        sb2.append(", chipTitle=");
        sb2.append(this.f106769c);
        sb2.append(", isSelectedChip=");
        return r.x(sb2, this.f106770d, ')');
    }
}
