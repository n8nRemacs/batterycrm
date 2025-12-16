package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.A;
import com.facebook.imagepipeline.producers.V;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;

/* compiled from: PriorityNetworkFetcher.java */
@Nullsafe
/* loaded from: classes15.dex */
public class g0<FETCH_STATE extends A> implements V<b<FETCH_STATE>> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f340672a = 0;

    /* compiled from: PriorityNetworkFetcher.java */
    public static class a extends Throwable {
    }

    /* compiled from: PriorityNetworkFetcher.java */
    public static class b<FETCH_STATE extends A> extends A {

        /* renamed from: f, reason: collision with root package name */
        public final FETCH_STATE f340673f;

        public b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC36410l interfaceC36410l, k0 k0Var, A a12, long j12, int i12, int i13, int i14, C36402e0 c36402e0) {
            super(interfaceC36410l, k0Var);
            this.f340673f = a12;
            k0Var.getPriority();
        }
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final A a(InterfaceC36410l interfaceC36410l, k0 k0Var) {
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final void b(A a12) {
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final boolean c(A a12) {
        FETCH_STATE fetch_state = ((b) a12).f340673f;
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.V
    @I41.h
    public final Map d(A a12, int i12) {
        FETCH_STATE fetch_state = ((b) a12).f340673f;
        throw null;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final void e(A a12, V.a aVar) {
        b bVar = (b) a12;
        bVar.f340513b.b(new C36402e0(this, bVar, aVar));
        throw null;
    }
}
