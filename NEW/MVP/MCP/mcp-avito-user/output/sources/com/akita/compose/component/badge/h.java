package com.akita.compose.component.badge;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.animation.core.F;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: BadgeShowAnimation.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/badge/h;", "", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f60399a;

    public h(@Y61.k F f12) {
        this.f60399a = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && this.f60399a.equals(hVar.f60399a);
    }

    public final int hashCode() {
        return this.f60399a.hashCode() + r.d(1.0f, r.d(0.0f, Integer.hashCode(300) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "BadgeShowAnimation(duration=300, scaleFromValue=0.0, scaleToValue=1.0, easing=" + this.f60399a + ')';
    }
}
