package com.google.android.material.shape;

import android.graphics.RectF;
import j.InterfaceC42167x;
import j.N;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes6.dex */
public final class o implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f357078a;

    public o(@InterfaceC42167x float f12) {
        this.f357078a = f12;
    }

    @Override // com.google.android.material.shape.e
    public final float a(@N RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f357078a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f357078a == ((o) obj).f357078a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f357078a)});
    }
}
