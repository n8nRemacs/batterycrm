package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: ChangeClipBounds.java */
/* renamed from: androidx.transition.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23495f extends L {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f54758B = {"android:clipBounds:clip"};

    /* compiled from: ChangeClipBounds.java */
    /* renamed from: androidx.transition.f$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f54759a;

        public a(View view) {
            this.f54759a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f54759a.setClipBounds(null);
        }
    }

    public static void M(V v12) {
        View view = v12.f54717b;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        Rect clipBounds = view.getClipBounds();
        HashMap map = v12.f54716a;
        map.put("android:clipBounds:clip", clipBounds);
        if (clipBounds == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.L
    public final void f(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    public final void j(@j.N V v12) {
        M(v12);
    }

    @Override // androidx.transition.L
    @j.P
    public final Animator n(@j.N ViewGroup viewGroup, @j.P V v12, @j.P V v13) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (v12 != null && v13 != null) {
            HashMap map = v12.f54716a;
            if (map.containsKey("android:clipBounds:clip")) {
                HashMap map2 = v13.f54716a;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
                    boolean z12 = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    View view = v13.f54717b;
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    view.setClipBounds(rect);
                    Rect rect3 = new Rect();
                    G g12 = new G();
                    g12.f54647a = rect3;
                    objectAnimatorOfObject = ObjectAnimator.ofObject(v13.f54717b, (Property<View, V>) h0.f54767c, (TypeEvaluator) g12, (Object[]) new Rect[]{rect, rect2});
                    if (z12) {
                        objectAnimatorOfObject.addListener(new a(v13.f54717b));
                    }
                }
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.L
    @j.N
    public final String[] v() {
        return f54758B;
    }
}
