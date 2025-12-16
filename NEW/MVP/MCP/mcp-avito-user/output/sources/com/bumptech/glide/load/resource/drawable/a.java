package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.res.i;
import j.InterfaceC42165v;
import j.P;
import m.C43852a;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f339421a = true;

    public static Drawable a(Context context, Context context2, @InterfaceC42165v int i12, @P Resources.Theme theme) {
        Context context3;
        try {
            if (f339421a) {
                if (theme != null) {
                    androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2);
                    dVar.f21658b = theme;
                    context3 = dVar;
                } else {
                    context3 = context2;
                }
                return C43852a.a(context3, i12);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e12) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e12;
            }
            return androidx.core.content.d.getDrawable(context2, i12);
        } catch (NoClassDefFoundError unused2) {
            f339421a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return resources.getDrawable(i12, theme);
    }
}
