package com.avito.android.krop.util;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;

/* compiled from: KPoint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/util/c;", "", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f174850a;

    /* renamed from: b, reason: collision with root package name */
    public final float f174851b;

    public c(float f12, float f13) {
        this.f174850a = f12;
        this.f174851b = f13;
    }

    @k
    public final c a(float f12, float f13) {
        return new c(this.f174850a + f12, this.f174851b + f13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f174850a, cVar.f174850a) == 0 && Float.compare(this.f174851b, cVar.f174851b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f174851b) + (Float.floatToIntBits(this.f174850a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KPoint(x=");
        sb2.append(this.f174850a);
        sb2.append(", y=");
        return G.d(this.f174851b, ")", sb2);
    }
}
