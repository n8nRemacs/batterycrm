package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import j.InterfaceC42150f;
import j.N;
import j.P;

/* compiled from: MaterialAttributes.java */
@RestrictTo
/* loaded from: classes6.dex */
public class b {
    @P
    public static TypedValue a(@InterfaceC42150f int i12, @N Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i12, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@N Context context, @InterfaceC42150f int i12, boolean z12) {
        TypedValue typedValueA = a(i12, context);
        return (typedValueA == null || typedValueA.type != 18) ? z12 : typedValueA.data != 0;
    }

    @N
    public static TypedValue c(@N Context context, @InterfaceC42150f int i12, @N String str) {
        TypedValue typedValueA = a(i12, context);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i12)));
    }
}
