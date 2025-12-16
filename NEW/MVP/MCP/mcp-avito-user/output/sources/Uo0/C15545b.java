package Uo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUo0/b;", "LUo0/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15545b implements InterfaceC15544a {

    /* renamed from: b, reason: collision with root package name */
    public final long f16598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16599c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f16600d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16601e;

    public C15545b(long j12, boolean z12) {
        this.f16598b = j12;
        this.f16599c = z12;
        this.f16600d = String.valueOf(j12);
        this.f16601e = j12;
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
        if (!(obj instanceof com.avito.android.lib.design.chips.h) || ((String) getF114848c()).length() <= 0) {
            return false;
        }
        com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
        if (hVar.getF114848c().length() > 0) {
            return L.f(getF114848c(), hVar.getF114848c());
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f16600d;
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
        if (!(obj instanceof C15545b)) {
            return false;
        }
        C15545b c15545b = (C15545b) obj;
        return this.f16598b == c15545b.f16598b && this.f16599c == c15545b.f16599c;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF262143e() {
        return this.f16599c;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // Uo0.InterfaceC15544a
    /* renamed from: getId, reason: from getter */
    public final long getF16601e() {
        return this.f16601e;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16599c) + (Long.hashCode(this.f16598b) * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF287110c() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoDispatchDurationChip(ttlDays=");
        sb2.append(this.f16598b);
        sb2.append(", isSelectedChip=");
        return r.x(sb2, this.f16599c, ')');
    }
}
