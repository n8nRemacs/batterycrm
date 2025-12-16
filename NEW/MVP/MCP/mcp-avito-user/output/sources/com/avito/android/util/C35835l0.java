package com.avito.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.avito.android.R;
import j.InterfaceC42147c;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Contexts.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: com.avito.android.util.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35835l0 {
    @Y61.l
    public static final Activity a(@Y61.k Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static final int b(@Y61.k Context context, int i12, @Y61.l PowerManager powerManager) {
        if (i12 == 1) {
            return 16;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            }
            if (powerManager == null || !powerManager.isPowerSaveMode()) {
                return 16;
            }
        }
        return 32;
    }

    @Y61.l
    public static final androidx.appcompat.app.m c(@Y61.k Context context) {
        if (context instanceof androidx.appcompat.app.m) {
            return (androidx.appcompat.app.m) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @InterfaceC42156l
    public static final int d(@InterfaceC42150f int i12, @Y61.k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            throw new Resources.NotFoundException(AK.c.k("Resource with name = ", context.getResources().getResourceName(i12), " is not defined"));
        }
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Y61.k
    public static final ColorStateList e(@InterfaceC42150f int i12, @Y61.k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList == null) {
            throw new Resources.NotFoundException(AK.c.k("Resource with id = ", context.getResources().getResourceName(i12), " is not defined"));
        }
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    @j.r
    public static final int f(@InterfaceC42150f int i12, @Y61.k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            throw new Resources.NotFoundException(AK.c.k("Resource with name = ", context.getResources().getResourceName(i12), " is not defined"));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return (int) dimension;
    }

    public static final Point g(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    @Y61.l
    public static final Drawable h(@InterfaceC42150f int i12, @Y61.k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            throw new Resources.NotFoundException(AK.c.k("Resource with name = ", context.getResources().getResourceName(i12), " is not defined"));
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static final DisplayMetrics i(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    @InterfaceC42147c
    public static final int j(@InterfaceC42150f int i12, @Y61.k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i12});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @Y61.l
    public static final Drawable k(@InterfaceC42165v int i12, @Y61.k Context context) {
        Drawable drawable = context.getDrawable(i12);
        if (drawable == null) {
            return null;
        }
        V0.d(drawable, androidx.core.content.d.getColor(context, R.color.common_black));
        return drawable;
    }

    @Y61.l
    public static final Drawable l(@Y61.l Drawable drawable, @InterfaceC42156l int i12) {
        if (i12 == 0) {
            return drawable;
        }
        if (drawable == null) {
            return null;
        }
        V0.d(drawable, i12);
        return drawable;
    }

    @Y61.l
    public static final Drawable m(@Y61.k Context context, @InterfaceC42150f int i12, @InterfaceC42150f int i13) {
        return n(context, i12, d(i13, context));
    }

    @Y61.l
    public static final Drawable n(@Y61.k Context context, @InterfaceC42150f int i12, @InterfaceC42156l int i13) {
        Drawable drawableMutate;
        Drawable drawableH = h(i12, context);
        if (drawableH == null || (drawableMutate = drawableH.mutate()) == null) {
            return null;
        }
        drawableMutate.setTint(i13);
        return drawableMutate;
    }

    @j.a0
    @InterfaceC42830m
    public static final boolean o(@Y61.k Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        return networkInfo2 != null && networkInfo2.isConnectedOrConnecting();
    }

    public static final boolean p(@Y61.k Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
