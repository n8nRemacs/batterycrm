package Me;

import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TermChipable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/s;", "Lcom/avito/android/lib/design/chips/h;", "_avito_auto-loans-composite-broker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class s implements com.avito.android.lib.design.chips.h {

    /* renamed from: b, reason: collision with root package name */
    public final int f10967b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f10968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10969d;

    public s(int i12, @Y61.k String str, int i13) {
        this.f10967b = i12;
        this.f10968c = str;
        this.f10969d = i13;
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
        if (obj instanceof s) {
            return this.f10967b == ((s) obj).f10967b;
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f10968c;
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
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f10967b == sVar.f10967b && L.f(this.f10968c, sVar.f10968c) && this.f10969d == sVar.f10969d;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
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
        return Integer.hashCode(this.f10969d) + ((this.f10968c.hashCode() + (Integer.hashCode(this.f10967b) * 31)) * 31);
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
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TermChipable(id=");
        sb2.append(this.f10967b);
        sb2.append(", chipTitle=");
        sb2.append((Object) this.f10968c);
        sb2.append(", term=");
        return androidx.appcompat.app.r.t(sb2, this.f10969d, ')');
    }
}
