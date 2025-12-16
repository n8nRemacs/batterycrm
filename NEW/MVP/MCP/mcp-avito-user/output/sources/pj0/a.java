package PJ0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricDialogData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPJ0/a;", "LPJ0/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12964b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12965c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f12966d;

    public a(@k String str, @k String str2) {
        this.f12964b = str;
        this.f12965c = str2;
        this.f12966d = str;
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
        if (!(obj instanceof h) || getF262141c().length() <= 0) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar.getF262141c().length() > 0) {
            return L.f(getF262141c(), hVar.getF262141c());
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF262141c() {
        return this.f12966d;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12964b, aVar.f12964b) && L.f(this.f12965c, aVar.f12965c);
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
        return this.f12965c.hashCode() + (this.f12964b.hashCode() * 31);
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
    public final e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricSuggestChip(name=");
        sb2.append(this.f12964b);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.f12965c, ')');
    }
}
