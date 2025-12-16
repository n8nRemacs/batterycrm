package androidx.compose.material;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Swipeable.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/y7;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.material.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21419y7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f34418a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34419b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34420c;

    public C21419y7(float f12, float f13, float f14, int i12, C42822w c42822w) {
        f13 = (i12 & 2) != 0 ? 10.0f : f13;
        f14 = (i12 & 4) != 0 ? 10.0f : f14;
        this.f34418a = f12;
        this.f34419b = f13;
        this.f34420c = f14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21419y7)) {
            return false;
        }
        C21419y7 c21419y7 = (C21419y7) obj;
        return this.f34418a == c21419y7.f34418a && this.f34419b == c21419y7.f34419b && this.f34420c == c21419y7.f34420c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34420c) + androidx.appcompat.app.r.d(this.f34419b, Float.hashCode(this.f34418a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResistanceConfig(basis=");
        sb2.append(this.f34418a);
        sb2.append(", factorAtMin=");
        sb2.append(this.f34419b);
        sb2.append(", factorAtMax=");
        return androidx.appcompat.app.r.k(')', this.f34420c, sb2);
    }
}
