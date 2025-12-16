package com.google.android.material.shape;

import android.graphics.RectF;
import j.N;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes6.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f357027a;

    public a(float f12) {
        this.f357027a = f12;
    }

    @Override // com.google.android.material.shape.e
    public final float a(@N RectF rectF) {
        return this.f357027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f357027a == ((a) obj).f357027a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f357027a)});
    }
}
