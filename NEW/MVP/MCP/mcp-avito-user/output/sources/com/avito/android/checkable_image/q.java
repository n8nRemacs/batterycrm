package com.avito.android.checkable_image;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.C27296p;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CheckableImageButton;
import j.V;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableImageWithAnimation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_checkable-image_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q {
    public static final ViewGroup a(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            if (((parent instanceof RecyclerView) && !(parent instanceof NoTouchEventRecyclerView)) || (parent instanceof ScrollView)) {
                return (ViewGroup) parent;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (!(viewGroup.getParent() instanceof ViewGroup) || ((ViewGroup) viewGroup.getParent()).getId() != 16908290) {
                if (parent instanceof AppBarLayout) {
                    break;
                }
                parent = viewGroup.getParent();
            } else {
                return viewGroup;
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) view.getRootView().findViewById(R.id.content);
        View childAt = viewGroup2 != null ? viewGroup2.getChildAt(0) : null;
        ViewGroup viewGroup3 = childAt instanceof ViewGroup ? childAt : null;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        return viewGroup2 == null ? (ViewGroup) view.getRootView() : viewGroup2;
    }

    public static Y41.a b(View view) {
        g gVar = g.f118085l;
        h hVar = h.f118086b;
        if (view == null) {
            return i.f118087l;
        }
        Object tag = view.getTag(com.avito.android.R.id.tag_favorite_lottie_enabled);
        Boolean bool = Boolean.TRUE;
        if (L.f(tag, bool)) {
            return j.f118088l;
        }
        view.setTag(com.avito.android.R.id.tag_favorite_lottie_enabled, bool);
        view.getContext();
        gVar.getClass();
        int i12 = com.avito.android.lib.util.darkTheme.c.b(view.getContext()) ? com.avito.android.R.raw.avito_favorite_shown_light : com.avito.android.R.raw.avito_favorite_shown_dark;
        l0.h hVar2 = new l0.h();
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new e(view, hVar2, view, i12));
        } else if (hVar2.f406842b == 0) {
            Context context = view.getContext();
            C27296p.f(context, i12, C27296p.l(i12, context)).b(new b(hVar2, 0));
        }
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new f(view, hVar2, view));
        } else {
            hVar2.f406842b = null;
            view.setTag(com.avito.android.R.id.tag_favorite_lottie_enabled, null);
        }
        return new k(hVar, view, hVar2, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.view.ViewTreeObserver$OnPreDrawListener, com.avito.android.checkable_image.a] */
    public static final void c(final View view, final ViewGroup viewGroup, C27291k c27291k, @V int i12) {
        Object bVar;
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        if (c27291k == null) {
            try {
                int i13 = Z.f406624c;
                Context context = view.getContext();
                bVar = C27296p.g(context, i12, C27296p.l(i12, context)).f59108a;
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            c27291k = (C27291k) bVar;
        }
        if (c27291k == null) {
            return;
        }
        final B b12 = new B();
        com.airbnb.lottie.utils.h hVar = b12.f59036c;
        hVar.setRepeatCount(0);
        b12.r(c27291k);
        b12.q(false);
        ?? r52 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.avito.android.checkable_image.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                q.d(view, viewGroup, b12);
                return true;
            }
        };
        overlay.add(b12);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(r52);
        hVar.addListener(new l(overlay, b12, viewGroup, r52));
        d(view, viewGroup, b12);
        b12.n();
    }

    public static final void d(View view, ViewGroup viewGroup, B b12) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
            if (Build.VERSION.SDK_INT >= 29) {
                Matrix matrix = new Matrix();
                view.transformMatrixToGlobal(matrix);
                Matrix matrix2 = new Matrix();
                viewGroup.transformMatrixToLocal(matrix2);
                Matrix matrix3 = new Matrix();
                matrix3.setConcat(matrix2, matrix);
                matrix3.mapRect(rectF);
            } else {
                view.getLocationInWindow(new int[2]);
                viewGroup.getLocationInWindow(new int[2]);
                rectF.offset(r2[0] - r1[0], r2[1] - r1[1]);
                if (view.getTranslationX() != 0.0f || view.getTranslationY() != 0.0f) {
                    rectF.offset(view.getTranslationX(), view.getTranslationY());
                }
            }
            float f12 = -24;
            rectF.inset(f12, f12);
            Rect rect = new Rect();
            rectF.roundOut(rect);
            b12.setBounds(rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View$OnTouchListener, com.avito.android.checkable_image.c] */
    public static void e(final CheckableImageButton checkableImageButton) {
        o oVar = o.f118105l;
        final p pVar = p.f118106b;
        Object tag = checkableImageButton.getTag(com.avito.android.R.id.tag_favorite_lottie_enabled);
        Boolean bool = Boolean.TRUE;
        if (L.f(tag, bool)) {
            return;
        }
        checkableImageButton.setTag(com.avito.android.R.id.tag_favorite_lottie_enabled, bool);
        checkableImageButton.getContext();
        oVar.getClass();
        final int i12 = com.avito.android.lib.util.darkTheme.c.b(checkableImageButton.getContext()) ? com.avito.android.R.raw.avito_favorite_shown_light : com.avito.android.R.raw.avito_favorite_shown_dark;
        final l0.h hVar = new l0.h();
        ?? r62 = new View.OnTouchListener() { // from class: com.avito.android.checkable_image.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 1 || motionEvent.getX() < 0.0f || motionEvent.getX() >= view.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= view.getHeight() || !view.isEnabled() || !view.isClickable()) {
                    return false;
                }
                view.post(new d(checkableImageButton, pVar, hVar, i12, 0));
                return false;
            }
        };
        if (checkableImageButton.isAttachedToWindow()) {
            if (hVar.f406842b == 0) {
                Context context = checkableImageButton.getContext();
                C27296p.f(context, i12, C27296p.l(i12, context)).b(new b(hVar, 1));
            }
            checkableImageButton.setOnTouchListener(r62);
        } else {
            checkableImageButton.addOnAttachStateChangeListener(new m(checkableImageButton, checkableImageButton, r62, hVar, i12));
        }
        if (checkableImageButton.isAttachedToWindow()) {
            checkableImageButton.addOnAttachStateChangeListener(new n(checkableImageButton, checkableImageButton, hVar));
            return;
        }
        checkableImageButton.setOnTouchListener(null);
        hVar.f406842b = null;
        checkableImageButton.setTag(com.avito.android.R.id.tag_favorite_lottie_enabled, null);
    }
}
