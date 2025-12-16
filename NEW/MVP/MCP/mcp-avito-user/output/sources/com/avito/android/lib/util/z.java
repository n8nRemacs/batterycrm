package com.avito.android.lib.util;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Window;
import androidx.core.view.L0;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WindowAppearanceHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/z;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f181429a = new z();

    public static void a(@Y61.k Window window, @Y61.k Context context, @InterfaceC42150f @Y61.l Integer num) {
        Integer numValueOf;
        int iIntValue;
        if (num != null) {
            iIntValue = C35835l0.d(num.intValue(), context);
        } else {
            Drawable drawableH = C35835l0.h(R.attr.windowBackground, context);
            if (drawableH instanceof ColorDrawable) {
                numValueOf = Integer.valueOf(((ColorDrawable) drawableH).getColor());
            } else if (drawableH instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawableH;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    Drawable drawable = layerDrawable.getDrawable(i12);
                    if (drawable != null && (drawable instanceof ColorDrawable)) {
                        numValueOf = Integer.valueOf(((ColorDrawable) drawable).getColor());
                        break;
                    }
                }
                numValueOf = null;
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return;
            } else {
                iIntValue = numValueOf.intValue();
            }
        }
        window.setBackgroundDrawable(new ColorDrawable(iIntValue));
    }

    public static void b(@Y61.k Window window, @Y61.k Context context, @InterfaceC42150f @Y61.l Integer num, boolean z12) {
        i.f181373a.getClass();
        if (!i.f181377e) {
            window.setNavigationBarColor(C35835l0.d(num != null ? num.intValue() : R.attr.statusBarColor, context));
        }
        new L0(window, window.getDecorView()).d(z12);
    }

    public static void c(z zVar, Window window, Context context, Integer num) {
        boolean z12 = !com.avito.android.lib.util.darkTheme.c.a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.windowLightNavigationBar});
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, z12);
        typedArrayObtainStyledAttributes.recycle();
        zVar.getClass();
        b(window, context, num, z13);
    }

    public static void d(@Y61.k Window window, @Y61.k Context context, @InterfaceC42150f @Y61.l Integer num, boolean z12) {
        i.f181373a.getClass();
        if (!i.f181377e) {
            window.setStatusBarColor(C35835l0.d(num != null ? num.intValue() : R.attr.statusBarColor, context));
        }
        new L0(window, window.getDecorView()).e(z12);
    }

    public static void e(z zVar, Window window, Context context, Integer num) {
        boolean z12 = !com.avito.android.lib.util.darkTheme.c.a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.windowLightStatusBar});
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, z12);
        typedArrayObtainStyledAttributes.recycle();
        zVar.getClass();
        d(window, context, num, z13);
    }
}
