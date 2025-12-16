package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ThreadHandoffProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public class w0<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final i0<T> f340752a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f340753b;

    /* compiled from: ThreadHandoffProducer.java */
    public class b extends C36401e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f340758a;

        public b(u0 u0Var) {
            this.f340758a = u0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
        public final void c() {
            u0 u0Var = this.f340758a;
            u0Var.a();
            y0 y0Var = w0.this.f340753b;
            synchronized (y0Var) {
                y0Var.f340773a.remove(u0Var);
            }
        }
    }

    public w0(i0 i0Var, y0 y0Var) {
        i0Var.getClass();
        this.f340752a = i0Var;
        this.f340753b = y0Var;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<T> interfaceC36410l, k0 k0Var) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            m0 m0VarI = k0Var.i();
            k0Var.c().a().getClass();
            a aVar = new a(interfaceC36410l, m0VarI, k0Var, m0VarI, k0Var, interfaceC36410l);
            k0Var.b(new b(aVar));
            y0 y0Var = this.f340753b;
            synchronized (y0Var) {
                y0Var.f340774b.execute(aVar);
            }
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }

    /* compiled from: ThreadHandoffProducer.java */
    public class a extends u0<T> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f340754g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k0 f340755h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36410l f340756i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, m0 m0Var2, k0 k0Var2, InterfaceC36410l interfaceC36410l2) {
            super(interfaceC36410l, m0Var, k0Var, "BackgroundThreadHandoffProducer");
            this.f340754g = m0Var2;
            this.f340755h = k0Var2;
            this.f340756i = interfaceC36410l2;
        }

        @Override // com.facebook.common.executors.h
        @I41.h
        public final T c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.u0, com.facebook.common.executors.h
        public final void f(@I41.h T t12) {
            m0 m0Var = this.f340754g;
            k0 k0Var = this.f340755h;
            m0Var.j(k0Var, "BackgroundThreadHandoffProducer", null);
            w0.this.f340752a.b(this.f340756i, k0Var);
        }

        @Override // com.facebook.common.executors.h
        public final void b(@I41.h T t12) {
        }
    }
}
