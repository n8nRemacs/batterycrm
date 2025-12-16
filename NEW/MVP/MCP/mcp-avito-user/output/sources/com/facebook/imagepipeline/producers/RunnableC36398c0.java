package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C36394a0;

/* compiled from: PostprocessorProducer.java */
/* renamed from: com.facebook.imagepipeline.producers.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class RunnableC36398c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36394a0.b f340652b;

    public RunnableC36398c0(C36394a0.b bVar) {
        this.f340652b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.common.references.a<YW0.b> aVar;
        int i12;
        boolean zQ2;
        synchronized (this.f340652b) {
            C36394a0.b bVar = this.f340652b;
            aVar = bVar.f340643g;
            i12 = bVar.f340644h;
            bVar.f340643g = null;
            bVar.f340645i = false;
        }
        if (com.facebook.common.references.a.k(aVar)) {
            try {
                C36394a0.b.m(this.f340652b, aVar, i12);
            } finally {
                com.facebook.common.references.a.c(aVar);
            }
        }
        C36394a0.b bVar2 = this.f340652b;
        synchronized (bVar2) {
            bVar2.f340646j = false;
            zQ2 = bVar2.q();
        }
        if (zQ2) {
            C36394a0.this.f340638c.execute(new RunnableC36398c0(bVar2));
        }
    }
}
