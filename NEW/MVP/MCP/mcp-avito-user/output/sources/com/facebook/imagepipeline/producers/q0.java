package com.facebook.imagepipeline.producers;

import cX0.C27119b;
import cX0.C27123f;
import cX0.InterfaceC27120c;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes15.dex */
class q0 implements I.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0.a f340715a;

    public q0(s0.a aVar) {
        this.f340715a = aVar;
    }

    @Override // com.facebook.imagepipeline.producers.I.b
    public final void a(YW0.d dVar, int i12) throws Throwable {
        UW0.d dVar2;
        C27119b c27119bB;
        int i13;
        s0.a aVar = this.f340715a;
        C27123f c27123f = aVar.f340729d;
        dVar.m();
        InterfaceC27120c interfaceC27120cCreateImageTranscoder = c27123f.createImageTranscoder(dVar.f19499c, aVar.f340728c);
        InterfaceC36410l<O> interfaceC36410l = aVar.f340716b;
        k0 k0Var = aVar.f340730e;
        k0Var.i().c(k0Var, "ResizeAndRotateProducer");
        ImageRequest imageRequestJ = k0Var.j();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStreamC = s0.this.f340724b.c();
        try {
            try {
                UW0.e eVar = imageRequestJ.f340787g;
                dVar2 = imageRequestJ.f340786f;
                c27119bB = interfaceC27120cCreateImageTranscoder.b(dVar, memoryPooledByteBufferOutputStreamC, eVar, dVar2);
                i13 = c27119bB.f57918a;
            } catch (Exception e12) {
                k0Var.i().h(k0Var, "ResizeAndRotateProducer", e12, null);
                if (AbstractC36395b.e(i12)) {
                    interfaceC36410l.a(e12);
                }
            }
            if (i13 == 2) {
                throw new RuntimeException("Error while transcoding the image");
            }
            com.facebook.common.internal.k kVarM = aVar.m(dVar, dVar2, c27119bB, interfaceC27120cCreateImageTranscoder.a());
            com.facebook.common.references.a aVarM = com.facebook.common.references.a.m(memoryPooledByteBufferOutputStreamC.a());
            try {
                YW0.d dVar3 = new YW0.d(aVarM);
                dVar3.f19499c = RW0.b.f14495a;
                try {
                    dVar3.h();
                    k0Var.i().j(k0Var, "ResizeAndRotateProducer", kVarM);
                    if (i13 != 1) {
                        i12 |= 16;
                    }
                    interfaceC36410l.c(i12, dVar3);
                } finally {
                    YW0.d.b(dVar3);
                }
            } finally {
                com.facebook.common.references.a.c(aVarM);
            }
        } finally {
            memoryPooledByteBufferOutputStreamC.close();
        }
    }
}
