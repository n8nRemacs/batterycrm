package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f356694a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public b f356695b = null;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public ValueAnimator f356696c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f356697d = new a();

    /* compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            A a12 = A.this;
            if (a12.f356696c == animator) {
                a12.f356696c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f356699a;

        /* renamed from: b, reason: collision with root package name */
        public final ValueAnimator f356700b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f356699a = iArr;
            this.f356700b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f356697d);
        this.f356694a.add(bVar);
    }

    public final void b(int[] iArr) {
        b bVar;
        ValueAnimator valueAnimator;
        ArrayList<b> arrayList = this.f356694a;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                bVar = null;
                break;
            }
            bVar = arrayList.get(i12);
            if (StateSet.stateSetMatches(bVar.f356699a, iArr)) {
                break;
            } else {
                i12++;
            }
        }
        b bVar2 = this.f356695b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null && (valueAnimator = this.f356696c) != null) {
            valueAnimator.cancel();
            this.f356696c = null;
        }
        this.f356695b = bVar;
        if (bVar != null) {
            ValueAnimator valueAnimator2 = bVar.f356700b;
            this.f356696c = valueAnimator2;
            valueAnimator2.start();
        }
    }
}
