package com.akita.compose.component.badge;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: BadgePulsationAnimation.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/badge/g;", "", "badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class g {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(2.0f, 2.0f) == 0 && Float.compare(0.1f, 0.1f) == 0 && Float.compare(0.25f, 0.25f) == 0 && Float.compare(0.75f, 0.75f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.75f) + r.d(0.25f, r.d(0.1f, r.d(2.0f, r.d(1.0f, r.e(3, r.g(Integer.hashCode(600) * 31, 31, 3000L), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "BadgePulsationAnimation(duration=600, delay=3000, repeatCount=3, scaleFromValue=1.0, scaleToValue=2.0, opacityFromValue=0.1, opacityToValue=0.25, expansionFraction=0.75)";
    }
}
