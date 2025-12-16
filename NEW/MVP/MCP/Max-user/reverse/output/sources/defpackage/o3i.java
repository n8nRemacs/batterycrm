package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public final class o3i extends r3i {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final xq5 f = new xq5(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, s3i s3iVar) {
        wa2 wa2VarJ = j(view);
        if (wa2VarJ != null) {
            wa2VarJ.b(s3iVar);
            if (wa2VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), s3iVar);
            }
        }
    }

    public static void f(View view, s3i s3iVar, WindowInsets windowInsets, boolean z) {
        wa2 wa2VarJ = j(view);
        if (wa2VarJ != null) {
            wa2VarJ.b = windowInsets;
            if (!z) {
                wa2VarJ.c(s3iVar);
                z = wa2VarJ.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), s3iVar, windowInsets, z);
            }
        }
    }

    public static void g(View view, g4i g4iVar, List list) {
        wa2 wa2VarJ = j(view);
        if (wa2VarJ != null) {
            g4iVar = wa2VarJ.d(g4iVar, list);
            if (wa2VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), g4iVar, list);
            }
        }
    }

    public static void h(View view, s3i s3iVar, ssb ssbVar) {
        wa2 wa2VarJ = j(view);
        if (wa2VarJ != null) {
            wa2VarJ.e(s3iVar, ssbVar);
            if (wa2VarJ.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), s3iVar, ssbVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(gzc.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static wa2 j(View view) {
        Object tag = view.getTag(gzc.tag_window_insets_animation_callback);
        if (tag instanceof n3i) {
            return ((n3i) tag).a;
        }
        return null;
    }
}
