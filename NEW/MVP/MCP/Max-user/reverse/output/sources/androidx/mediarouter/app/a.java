package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import defpackage.k69;
import defpackage.pkb;
import defpackage.xo8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap map, HashMap map2) {
        this.c = dVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        pkb pkbVar;
        k69 k69Var;
        d dVar = this.c;
        dVar.N0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.Q0;
        if (hashSet == null || dVar.R0 == null) {
            return;
        }
        int size = hashSet.size() - dVar.R0.size();
        b bVar = new b(dVar);
        int firstVisiblePosition = dVar.N0.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = dVar.N0.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = dVar.N0.getChildAt(i);
            k69 k69Var2 = (k69) dVar.O0.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(k69Var2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (dVar.X0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dVar.Q0;
            if (hashSet2 == null || !hashSet2.contains(k69Var2)) {
                k69Var = k69Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                k69Var = k69Var2;
                alphaAnimation.setDuration(dVar.r1);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(dVar.q1);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dVar.t1);
            if (!z) {
                animationSet.setAnimationListener(bVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            k69 k69Var3 = k69Var;
            map.remove(k69Var3);
            map2.remove(k69Var3);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            k69 k69Var4 = (k69) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(k69Var4);
            if (dVar.R0.contains(k69Var4)) {
                pkbVar = new pkb(bitmapDrawable, rect2);
                pkbVar.h = 0.0f;
                pkbVar.e = dVar.s1;
                pkbVar.d = dVar.t1;
            } else {
                int i3 = dVar.X0 * size;
                pkb pkbVar2 = new pkb(bitmapDrawable, rect2);
                pkbVar2.g = i3;
                pkbVar2.e = dVar.q1;
                pkbVar2.d = dVar.t1;
                pkbVar2.l = new xo8((Object) dVar, (Object) k69Var4, false, 24);
                dVar.S0.add(k69Var4);
                pkbVar = pkbVar2;
            }
            dVar.N0.a.add(pkbVar);
        }
    }
}
