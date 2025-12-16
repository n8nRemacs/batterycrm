package Tn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeContentChip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTn0/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15382a implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15840b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15841c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15842d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15843e;

    public C15382a(@k String str, boolean z12) {
        this.f15840b = str;
        this.f15841c = z12;
        this.f15842d = str;
        this.f15843e = z12;
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
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        String str = this.f15842d;
        if (str.length() > 0) {
            h hVar = (h) obj;
            if (hVar.getF114848c().length() > 0) {
                return L.f(str, hVar.getF114848c());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f15842d;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15382a)) {
            return false;
        }
        C15382a c15382a = (C15382a) obj;
        return L.f(this.f15840b, c15382a.f15840b) && this.f15841c == c15382a.f15841c;
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
    public final e getImage() {
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15841c) + (this.f15840b.hashCode() * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF15843e() {
        return this.f15843e;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalDeliveryTypeContentChip(title=");
        sb2.append(this.f15840b);
        sb2.append(", isTabEnabled=");
        return r.x(sb2, this.f15841c, ')');
    }
}
