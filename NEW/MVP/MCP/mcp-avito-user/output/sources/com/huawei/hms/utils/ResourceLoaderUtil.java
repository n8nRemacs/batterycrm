package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;

/* loaded from: classes7.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a, reason: collision with root package name */
    public static Context f363723a;

    /* renamed from: b, reason: collision with root package name */
    public static String f363724b;

    public static int getAnimId(String str) {
        return f363723a.getResources().getIdentifier(str, "anim", f363724b);
    }

    public static int getColorId(String str) {
        return f363723a.getResources().getIdentifier(str, "color", f363724b);
    }

    public static Drawable getDrawable(String str) {
        return f363723a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f363723a.getResources().getIdentifier(str, "drawable", f363724b);
    }

    public static int getIdId(String str) {
        return f363723a.getResources().getIdentifier(str, "id", f363724b);
    }

    public static int getLayoutId(String str) {
        return f363723a.getResources().getIdentifier(str, "layout", f363724b);
    }

    public static String getString(String str) {
        return f363723a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return f363723a.getResources().getIdentifier(str, "string", f363724b);
    }

    public static int getStyleId(String str) {
        return f363723a.getResources().getIdentifier(str, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, f363724b);
    }

    public static Context getmContext() {
        return f363723a;
    }

    public static void setmContext(Context context) {
        f363723a = context;
        f363724b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return f363723a.getResources().getString(getStringId(str), objArr);
    }
}
