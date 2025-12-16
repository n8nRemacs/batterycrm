package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ThumbnailBranchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class B0 implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C0<YW0.d>[] f340522a;

    /* compiled from: ThumbnailBranchProducer.java */
    public class a extends r<YW0.d, YW0.d> {

        /* renamed from: c, reason: collision with root package name */
        public final k0 f340523c;

        /* renamed from: d, reason: collision with root package name */
        public final int f340524d;

        /* renamed from: e, reason: collision with root package name */
        @I41.h
        public final UW0.d f340525e;

        public a(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var, int i12) {
            super(interfaceC36410l);
            this.f340523c = k0Var;
            this.f340524d = i12;
            this.f340525e = k0Var.j().f340786f;
        }

        @Override // com.facebook.imagepipeline.producers.r, com.facebook.imagepipeline.producers.AbstractC36395b
        public final void h(Throwable th2) {
            int i12 = this.f340524d + 1;
            B0 b02 = B0.this;
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (b02.c(i12, interfaceC36410l, this.f340523c)) {
                return;
            }
            interfaceC36410l.a(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC36395b
        public final void i(int i12, @I41.h Object obj) {
            YW0.d dVar = (YW0.d) obj;
            InterfaceC36410l<O> interfaceC36410l = this.f340716b;
            if (dVar != null && (AbstractC36395b.f(i12) || D0.b(dVar, this.f340525e))) {
                interfaceC36410l.c(i12, dVar);
                return;
            }
            if (AbstractC36395b.e(i12)) {
                YW0.d.b(dVar);
                if (B0.this.c(this.f340524d + 1, interfaceC36410l, this.f340523c)) {
                    return;
                }
                interfaceC36410l.c(1, null);
            }
        }
    }

    public B0(C0<YW0.d>... c0Arr) {
        C0<YW0.d>[] c0Arr2 = c0Arr;
        this.f340522a = c0Arr2;
        int length = c0Arr2.length;
        if (length <= 0) {
            if (length < 0) {
                throw new IllegalArgumentException(AK.c.g(length, "negative size: "));
            }
            throw new IndexOutOfBoundsException(com.facebook.common.internal.o.e("%s (%s) must be less than size (%s)", "index", 0, Integer.valueOf(length)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        if (k0Var.j().f340786f == null) {
            interfaceC36410l.c(1, null);
        } else {
            if (c(0, interfaceC36410l, k0Var)) {
                return;
            }
            interfaceC36410l.c(1, null);
        }
    }

    public final boolean c(int i12, InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        C0<YW0.d>[] c0Arr;
        UW0.d dVar = k0Var.j().f340786f;
        while (true) {
            c0Arr = this.f340522a;
            if (i12 >= c0Arr.length) {
                i12 = -1;
                break;
            }
            if (c0Arr[i12].a(dVar)) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return false;
        }
        c0Arr[i12].b(new a(interfaceC36410l, k0Var, i12), k0Var);
        return true;
    }
}
