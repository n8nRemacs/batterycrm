package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.D0;
import j.N;
import j.P;
import j.g0;
import m.C43852a;

/* compiled from: MaterialResources.java */
@RestrictTo
/* loaded from: classes6.dex */
public class c {
    @P
    public static ColorStateList a(@N Context context, @N D0 d02, @g0 int i12) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = d02.f22121b;
        return (!typedArray.hasValue(i12) || (resourceId = typedArray.getResourceId(i12, 0)) == 0 || (colorStateList = androidx.core.content.d.getColorStateList(context, resourceId)) == null) ? d02.a(i12) : colorStateList;
    }

    @P
    public static ColorStateList b(@N TypedArray typedArray, @N Context context, @g0 int i12) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i12) || (resourceId = typedArray.getResourceId(i12, 0)) == 0 || (colorStateList = androidx.core.content.d.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i12) : colorStateList;
    }

    public static int c(@N Context context, @N TypedArray typedArray, @g0 int i12, int i13) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i12, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i12, i13);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i13);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @P
    public static Drawable d(@N TypedArray typedArray, @N Context context, @g0 int i12) {
        int resourceId;
        Drawable drawableA;
        return (!typedArray.hasValue(i12) || (resourceId = typedArray.getResourceId(i12, 0)) == 0 || (drawableA = C43852a.a(context, resourceId)) == null) ? typedArray.getDrawable(i12) : drawableA;
    }

    public static boolean e(@N Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
