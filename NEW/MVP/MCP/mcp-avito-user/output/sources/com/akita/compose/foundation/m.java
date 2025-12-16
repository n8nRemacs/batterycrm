package com.akita.compose.foundation;

import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.w0;

/* compiled from: Ripple.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/akita/compose/foundation/m;", "", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(JLandroidx/compose/material/ripple/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f63596a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.material.ripple.l f63597b;

    public m(long j12, androidx.compose.material.ripple.l lVar, C42822w c42822w) {
        this.f63596a = j12;
        this.f63597b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return T.d(this.f63596a, mVar.f63596a) && L.f(this.f63597b, mVar.f63597b);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return this.f63597b.hashCode() + (Long.hashCode(this.f63596a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        H.z(this.f63596a, ", rippleAlpha=", sb2);
        sb2.append(this.f63597b);
        sb2.append(')');
        return sb2.toString();
    }
}
