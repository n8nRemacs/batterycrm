package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: ChangeScroll.java */
/* renamed from: androidx.transition.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23497h extends L {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f54764B = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void M(V v12) {
        HashMap map = v12.f54716a;
        map.put("android:changeScroll:x", Integer.valueOf(v12.f54717b.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(v12.f54717b.getScrollY()));
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (v12 == null || v13 == null) {
            return null;
        }
        View view = v13.f54717b;
        HashMap map = v12.f54716a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = v13.f54716a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        boolean z12 = U.f54710a;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // androidx.transition.L
    @j.P
    public final String[] v() {
        return f54764B;
    }
}
