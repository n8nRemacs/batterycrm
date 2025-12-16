package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;

/* compiled from: DelayProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36415q implements i0<com.facebook.common.references.a<YW0.b>> {

    /* compiled from: DelayProducer.java */
    /* renamed from: com.facebook.imagepipeline.producers.q$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36410l f340712b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f340713c;

        public a(InterfaceC36410l interfaceC36410l, k0 k0Var) {
            this.f340712b = interfaceC36410l;
            this.f340713c = k0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C36415q.this.getClass();
            throw null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<com.facebook.common.references.a<YW0.b>> interfaceC36410l, k0 k0Var) {
        ImageRequest imageRequestJ = k0Var.j();
        Object obj = null;
        obj.getClass();
        new a(interfaceC36410l, k0Var);
        imageRequestJ.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        throw null;
    }
}
