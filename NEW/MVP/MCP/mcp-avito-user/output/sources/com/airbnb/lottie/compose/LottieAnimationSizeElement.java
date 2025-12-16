package com.airbnb.lottie.compose;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LottieAnimationSizeNode.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/p0;", "Lcom/airbnb/lottie/compose/p;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LottieAnimationSizeElement extends AbstractC22430p0<C27280p> {

    /* renamed from: b, reason: collision with root package name */
    public final int f59392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59393c;

    public LottieAnimationSizeElement(int i12, int i13) {
        this.f59392b = i12;
        this.f59393c = i13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C27280p c27280p = new C27280p();
        c27280p.f59532p = this.f59392b;
        c27280p.f59533q = this.f59393c;
        return c27280p;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C27280p c27280p = (C27280p) dVar;
        c27280p.f59532p = this.f59392b;
        c27280p.f59533q = this.f59393c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.f59392b == lottieAnimationSizeElement.f59392b && this.f59393c == lottieAnimationSizeElement.f59393c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59393c) + (Integer.hashCode(this.f59392b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieAnimationSizeElement(width=");
        sb2.append(this.f59392b);
        sb2.append(", height=");
        return AK.c.i(this.f59393c, ")", sb2);
    }
}
