package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C22767g;
import j.F;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;

/* compiled from: MaterialColors.java */
/* loaded from: classes6.dex */
public class k {
    @InterfaceC42156l
    public static int a(@InterfaceC42156l int i12, @F int i13) {
        return C22767g.i(i12, (Color.alpha(i12) * i13) / 255);
    }

    @InterfaceC42156l
    public static int b(@N Context context, @InterfaceC42150f int i12, @InterfaceC42156l int i13) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(i12, context);
        if (typedValueA == null) {
            return i13;
        }
        int i14 = typedValueA.resourceId;
        return i14 != 0 ? androidx.core.content.d.getColor(context, i14) : typedValueA.data;
    }

    @InterfaceC42156l
    public static int c(Context context, @InterfaceC42150f int i12, String str) {
        TypedValue typedValueC = com.google.android.material.resources.b.c(context, i12, str);
        int i13 = typedValueC.resourceId;
        return i13 != 0 ? androidx.core.content.d.getColor(context, i13) : typedValueC.data;
    }

    @InterfaceC42156l
    public static int d(@N View view, @InterfaceC42150f int i12) {
        Context context = view.getContext();
        TypedValue typedValueC = com.google.android.material.resources.b.c(view.getContext(), i12, view.getClass().getCanonicalName());
        int i13 = typedValueC.resourceId;
        return i13 != 0 ? androidx.core.content.d.getColor(context, i13) : typedValueC.data;
    }

    public static boolean e(@InterfaceC42156l int i12) {
        return i12 != 0 && C22767g.e(i12) > 0.5d;
    }

    @InterfaceC42156l
    public static int f(@InterfaceC42167x float f12, @InterfaceC42156l int i12, @InterfaceC42156l int i13) {
        return C22767g.g(C22767g.i(i13, Math.round(Color.alpha(i13) * f12)), i12);
    }
}
