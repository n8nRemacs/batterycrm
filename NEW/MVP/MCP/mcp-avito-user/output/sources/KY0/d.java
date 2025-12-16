package Ky0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LastMinuteOfferState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKy0/d;", "Lcom/avito/android/lib/design/chips/h;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public final int f9741b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9742c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9743d;

    public d(int i12, @k String str, boolean z12) {
        this.f9741b = i12;
        this.f9742c = str;
        this.f9743d = z12;
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
        h hVar = obj instanceof h ? (h) obj : null;
        return L.f(hVar != null ? hVar.getF278901b() : null, this.f9742c);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF278901b() {
        return this.f9742c;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9741b == dVar.f9741b && L.f(this.f9742c, dVar.f9742c) && this.f9743d == dVar.f9743d;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF249891e() {
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
        return Boolean.hashCode(this.f9743d) + H.d(Integer.hashCode(this.f9741b) * 31, 31, this.f9742c);
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
    @l
    public final e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Option(value=");
        sb2.append(this.f9741b);
        sb2.append(", chipTitle=");
        sb2.append(this.f9742c);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f9743d, ')');
    }
}
