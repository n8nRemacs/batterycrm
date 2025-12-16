package com.avito.android.password_tip;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: PasswordTipExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/password_tip/b;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f213964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f213965b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f213966c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f213967d;

    public b(boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f213964a = z12;
        this.f213965b = z13;
        this.f213966c = z14;
        this.f213967d = z15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f213964a == bVar.f213964a && this.f213965b == bVar.f213965b && this.f213966c == bVar.f213966c && this.f213967d == bVar.f213967d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213967d) + r.i(r.i(Boolean.hashCode(this.f213964a) * 31, 31, this.f213965b), 31, this.f213966c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordTip(length=");
        sb2.append(this.f213964a);
        sb2.append(", digits=");
        sb2.append(this.f213965b);
        sb2.append(", latin=");
        sb2.append(this.f213966c);
        sb2.append(", special=");
        return r.x(sb2, this.f213967d, ')');
    }
}
