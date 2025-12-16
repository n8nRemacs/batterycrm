package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.producers.z0;

/* compiled from: ThrottlingProducer.java */
/* loaded from: classes15.dex */
class A0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f340517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0.b f340518c;

    public A0(z0.b bVar, Pair pair) {
        this.f340518c = bVar;
        this.f340517b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0 z0Var = z0.this;
        Pair pair = this.f340517b;
        InterfaceC36410l interfaceC36410l = (InterfaceC36410l) pair.first;
        k0 k0Var = (k0) pair.second;
        z0Var.getClass();
        k0Var.i().j(k0Var, "ThrottlingProducer", null);
        z0Var.f340775a.b(new z0.b(interfaceC36410l, null), k0Var);
    }
}
