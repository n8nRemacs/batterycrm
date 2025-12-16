package com.akita.compose.component.skeleton;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.animation.core.F;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SkeletonStyle.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/skeleton/d;", "", "skeleton_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f62687a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final F f62688b;

    public d(@k p pVar, @k F f12) {
        this.f62687a = pVar;
        this.f62688b = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f62687a, dVar.f62687a) && Float.compare(0.5f, 0.5f) == 0 && this.f62688b.equals(dVar.f62688b);
    }

    public final int hashCode() {
        return this.f62688b.hashCode() + r.e(1200, r.e(600, r.d(0.5f, this.f62687a.hashCode() * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        return "SkeletonStyle(color=" + this.f62687a + ", pulsateTargetAlpha=0.5, animationDurationMillis=600, animationPeriodMillis=1200, easing=" + this.f62688b + ')';
    }
}
