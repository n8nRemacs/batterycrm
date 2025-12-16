package com.google.android.renderscript;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Toolkit.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/renderscript/Range2d;", "", "<init>", "()V", "_design-modules_renderscript-toolkit"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Range2d {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range2d)) {
            return false;
        }
        ((Range2d) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r.e(0, r.e(0, Integer.hashCode(0) * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "Range2d(startX=0, endX=0, startY=0, endY=0)";
    }
}
