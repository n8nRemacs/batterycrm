package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.platform.I;
import j.InterfaceC42150f;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Iterator;
import lY0.C43707b;
import lY0.C43708c;
import wY0.C49576a;

/* compiled from: MaterialVisibility.java */
@X
/* loaded from: classes6.dex */
abstract class y<P extends I> extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    public final P f357970b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final A f357971c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f357972d = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public y(I i12, @P A a12) {
        this.f357970b = i12;
        this.f357971c = a12;
    }

    public static void a(ArrayList arrayList, @P I i12, ViewGroup viewGroup, View view, boolean z12) {
        if (i12 == null) {
            return;
        }
        Animator animatorB = z12 ? i12.b(view) : i12.a(view);
        if (animatorB != null) {
            arrayList.add(animatorB);
        }
    }

    public final AnimatorSet b(@N View view, @N ViewGroup viewGroup, boolean z12) {
        int iC2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.f357970b, viewGroup, view, z12);
        a(arrayList, this.f357971c, viewGroup, view, z12);
        Iterator it = this.f357972d.iterator();
        while (it.hasNext()) {
            a(arrayList, (I) it.next(), viewGroup, view, z12);
        }
        Context context = viewGroup.getContext();
        int iF2 = f(z12);
        RectF rectF = H.f357855a;
        if (iF2 != 0 && getDuration() == -1 && (iC2 = C49576a.c(context, iF2, -1)) != -1) {
            setDuration(iC2);
        }
        int iG2 = g(z12);
        TimeInterpolator timeInterpolatorE = e();
        if (iG2 != 0 && getInterpolator() == null) {
            setInterpolator(C49576a.d(context, iG2, timeInterpolatorE));
        }
        C43708c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @N
    public TimeInterpolator e() {
        return C43707b.f413880b;
    }

    @InterfaceC42150f
    public int f(boolean z12) {
        return 0;
    }

    @InterfaceC42150f
    public int g(boolean z12) {
        return 0;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(view, viewGroup, false);
    }
}
