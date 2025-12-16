package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import j.N;
import java.util.Arrays;

/* compiled from: ClampedCornerSize.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f357030a;

    public c(float f12) {
        this.f357030a = f12;
    }

    @Override // com.google.android.material.shape.e
    public final float a(@N RectF rectF) {
        return Math.min(this.f357030a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f357030a == ((c) obj).f357030a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f357030a)});
    }
}
