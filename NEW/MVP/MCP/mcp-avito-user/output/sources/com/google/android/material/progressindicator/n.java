package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.b;
import j.N;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes6.dex */
abstract class n<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    public o f356956a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f356957b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f356958c;

    public n(int i12) {
        this.f356957b = new float[i12 * 2];
        this.f356958c = new int[i12];
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(@N b.a aVar);

    public abstract void d();

    public abstract void e();

    public abstract void f();
}
