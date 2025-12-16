package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import j.N;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f357028a;

    /* renamed from: b, reason: collision with root package name */
    public final float f357029b;

    public b(float f12, @N e eVar) {
        while (eVar instanceof b) {
            eVar = ((b) eVar).f357028a;
            f12 += ((b) eVar).f357029b;
        }
        this.f357028a = eVar;
        this.f357029b = f12;
    }

    @Override // com.google.android.material.shape.e
    public final float a(@N RectF rectF) {
        return Math.max(0.0f, this.f357028a.a(rectF) + this.f357029b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f357028a.equals(bVar.f357028a) && this.f357029b == bVar.f357029b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f357028a, Float.valueOf(this.f357029b)});
    }
}
