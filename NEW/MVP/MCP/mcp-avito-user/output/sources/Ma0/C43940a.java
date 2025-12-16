package mA0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.SuggestAddress;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChipableItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmA0/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43940a implements h {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f414357b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414358c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f414359d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f414360e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SuggestAddress.Kind f414361f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f414362g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f414363h;

    public C43940a(@l String str, @k String str2, @k String str3, @k String str4, @k SuggestAddress.Kind kind, @l String str5) {
        this.f414357b = str;
        this.f414358c = str2;
        this.f414359d = str3;
        this.f414360e = str4;
        this.f414361f = kind;
        this.f414362g = str5;
        this.f414363h = str3;
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
        String str = this.f414363h;
        if (str.length() > 0) {
            h hVar = (h) obj;
            if (hVar.getF6557d().length() > 0) {
                return L.f(str, hVar.getF6557d());
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF6557d() {
        return this.f414363h;
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
        if (!(obj instanceof C43940a)) {
            return false;
        }
        C43940a c43940a = (C43940a) obj;
        return L.f(this.f414357b, c43940a.f414357b) && L.f(this.f414358c, c43940a.f414358c) && L.f(this.f414359d, c43940a.f414359d) && L.f(this.f414360e, c43940a.f414360e) && this.f414361f == c43940a.f414361f && L.f(this.f414362g, c43940a.f414362g);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF178766f() {
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
        String str = this.f414357b;
        int iHashCode = (this.f414361f.hashCode() + H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f414358c), 31, this.f414359d), 31, this.f414360e)) * 31;
        String str2 = this.f414362g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
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
    @k
    public final e q1() {
        return new e.c(R.drawable.common_ic_close_16);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipableItem(jsonWebToken=");
        sb2.append(this.f414357b);
        sb2.append(", addressId=");
        sb2.append(this.f414358c);
        sb2.append(", address=");
        sb2.append(this.f414359d);
        sb2.append(", locality=");
        sb2.append(this.f414360e);
        sb2.append(", kind=");
        sb2.append(this.f414361f);
        sb2.append(", paramId=");
        return C22026a.c(sb2, this.f414362g, ')');
    }
}
