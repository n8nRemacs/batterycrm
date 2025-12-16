package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.V;
import androidx.transition.o0;
import com.google.android.material.transition.E;
import j.InterfaceC42150f;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import lY0.C43707b;
import lY0.C43708c;
import wY0.C49576a;

/* compiled from: MaterialVisibility.java */
/* loaded from: classes6.dex */
abstract class u<P extends E> extends o0 {

    /* renamed from: D, reason: collision with root package name */
    public final P f357984D;

    /* renamed from: E, reason: collision with root package name */
    @P
    public final w f357985E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f357986F = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public u(E e12, @P w wVar) {
        this.f357984D = e12;
        this.f357985E = wVar;
    }

    public static void T(ArrayList arrayList, @P E e12, ViewGroup viewGroup, View view, boolean z12) {
        if (e12 == null) {
            return;
        }
        Animator animatorB = z12 ? e12.b(view) : e12.a(view);
        if (animatorB != null) {
            arrayList.add(animatorB);
        }
    }

    @Override // androidx.transition.o0
    public Animator O(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, true);
    }

    @Override // androidx.transition.o0
    public Animator Q(ViewGroup viewGroup, View view, V v12, V v13) {
        return U(view, viewGroup, false);
    }

    public final AnimatorSet U(@N View view, @N ViewGroup viewGroup, boolean z12) {
        int iC2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        T(arrayList, this.f357984D, viewGroup, view, z12);
        T(arrayList, this.f357985E, viewGroup, view, z12);
        Iterator it = this.f357986F.iterator();
        while (it.hasNext()) {
            T(arrayList, (E) it.next(), viewGroup, view, z12);
        }
        Context context = viewGroup.getContext();
        int iW2 = W(z12);
        RectF rectF = D.f357749a;
        if (iW2 != 0 && this.f54667d == -1 && (iC2 = C49576a.c(context, iW2, -1)) != -1) {
            E(iC2);
        }
        int iX2 = X(z12);
        TimeInterpolator timeInterpolatorV = V();
        if (iX2 != 0 && this.f54668e == null) {
            G(C49576a.d(context, iX2, timeInterpolatorV));
        }
        C43708c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @N
    public TimeInterpolator V() {
        return C43707b.f413880b;
    }

    @InterfaceC42150f
    public int W(boolean z12) {
        return 0;
    }

    @InterfaceC42150f
    public int X(boolean z12) {
        return 0;
    }
}
