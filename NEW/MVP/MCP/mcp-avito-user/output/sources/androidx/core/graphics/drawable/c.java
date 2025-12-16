package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.X;

/* compiled from: DrawableCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: DrawableCompat.java */
    @X
    public static class a {
    }

    /* compiled from: DrawableCompat.java */
    @X
    public static class b {
    }

    public static void a(@N Drawable drawable, @InterfaceC42156l int i12) {
        drawable.setTint(i12);
    }

    public static void b(@N Drawable drawable, @P ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void c(@N Drawable drawable, @P PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
