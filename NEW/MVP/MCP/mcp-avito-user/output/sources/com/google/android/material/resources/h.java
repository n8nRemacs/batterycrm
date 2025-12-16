package com.google.android.material.resources;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;

/* compiled from: TypefaceUtils.java */
@RestrictTo
/* loaded from: classes6.dex */
public class h {
    @P
    public static Typeface a(@N Configuration configuration, @N Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, M0.a.b(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
