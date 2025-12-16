package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class eod {
    public static eod g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public cb6 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final hp0 h = new hp0(6, 2);

    public static synchronized eod b() {
        try {
            if (g == null) {
                g = new eod();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        hp0 hp0Var = h;
        hp0Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) hp0Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            ek8 ek8Var = (ek8) this.b.get(context);
            drawableNewDrawable = null;
            if (ek8Var != null && (weakReference = (WeakReference) ek8Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    ek8Var.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableG = null;
        if (this.e != null) {
            if (i == oxc.abc_cab_background_top_material) {
                layerDrawableG = new LayerDrawable(new Drawable[]{d(context, oxc.abc_cab_background_internal_bg), d(context, oxc.abc_cab_background_top_mtrl_alpha)});
            } else if (i == oxc.abc_ratingbar_material) {
                layerDrawableG = cb6.g(this, context, hwc.abc_star_big);
            } else if (i == oxc.abc_ratingbar_indicator_material) {
                layerDrawableG = cb6.g(this, context, hwc.abc_star_medium);
            } else if (i == oxc.abc_ratingbar_small_material) {
                layerDrawableG = cb6.g(this, context, hwc.abc_star_small);
            }
        }
        if (layerDrawableG == null) {
            return layerDrawableG;
        }
        layerDrawableG.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableG.getConstantState();
                if (constantState2 != null) {
                    ek8 ek8Var2 = (ek8) this.b.get(context);
                    if (ek8Var2 == null) {
                        ek8Var2 = new ek8((Object) null);
                        this.b.put(context, ek8Var2);
                    }
                    ek8Var2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableG;
    }

    public final synchronized Drawable c(int i, Context context, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, swc.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof izg) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = r34.b(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                d45.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized Drawable d(Context context, int i) {
        return c(i, context, false);
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        r7f r7fVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListH = null;
        colorStateList = (weakHashMap == null || (r7fVar = (r7f) weakHashMap.get(context)) == null) ? null : (ColorStateList) r7fVar.b(i);
        if (colorStateList == null) {
            cb6 cb6Var = this.e;
            if (cb6Var != null) {
                colorStateListH = cb6Var.h(context, i);
            }
            if (colorStateListH != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                r7f r7fVar2 = (r7f) this.a.get(context);
                if (r7fVar2 == null) {
                    r7fVar2 = new r7f(0);
                    this.a.put(context, r7fVar2);
                }
                r7fVar2.a(i, colorStateListH);
            }
            colorStateList = colorStateListH;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eod.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
