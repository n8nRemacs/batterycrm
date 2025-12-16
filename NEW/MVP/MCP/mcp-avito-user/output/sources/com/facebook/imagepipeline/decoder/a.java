package com.facebook.imagepipeline.decoder;

import I41.h;
import YW0.g;
import YW0.i;
import com.facebook.common.internal.u;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DefaultImageDecoder.java */
@Nullsafe
/* loaded from: classes12.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @h
    public final b f340394a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final b f340395b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.platform.d f340396c;

    /* renamed from: d, reason: collision with root package name */
    public final b f340397d = new C10535a();

    /* compiled from: DefaultImageDecoder.java */
    /* renamed from: com.facebook.imagepipeline.decoder.a$a, reason: collision with other inner class name */
    public class C10535a implements b {
        public C10535a() {
        }

        @Override // com.facebook.imagepipeline.decoder.b
        public final YW0.b a(YW0.d dVar, int i12, i iVar, UW0.b bVar) throws Throwable {
            dVar.m();
            RW0.c cVar = dVar.f19499c;
            RW0.c cVar2 = RW0.b.f14495a;
            a aVar = a.this;
            if (cVar == cVar2) {
                aVar.getClass();
                com.facebook.common.references.a aVarB = aVar.f340396c.b(dVar, bVar.f16408a, i12);
                try {
                    dVar.m();
                    int i13 = dVar.f19500d;
                    dVar.m();
                    YW0.c cVar3 = new YW0.c(aVarB, iVar, i13, dVar.f19501e);
                    Boolean bool = Boolean.FALSE;
                    if (YW0.b.f19491c.contains("is_rounded")) {
                        cVar3.f19492b.put("is_rounded", bool);
                    }
                    return cVar3;
                } finally {
                    aVarB.close();
                }
            }
            if (cVar != RW0.b.f14497c) {
                if (cVar != RW0.b.f14504j) {
                    if (cVar != RW0.c.f14507b) {
                        return aVar.b(dVar, bVar);
                    }
                    throw new DecodeException("unknown image format", dVar);
                }
                b bVar2 = aVar.f340395b;
                if (bVar2 != null) {
                    return bVar2.a(dVar, i12, iVar, bVar);
                }
                throw new DecodeException("Animated WebP support not set up!", dVar);
            }
            aVar.getClass();
            dVar.m();
            if (dVar.f19502f != -1) {
                dVar.m();
                if (dVar.f19503g != -1) {
                    bVar.getClass();
                    b bVar3 = aVar.f340394a;
                    return bVar3 != null ? bVar3.a(dVar, i12, iVar, bVar) : aVar.b(dVar, bVar);
                }
            }
            throw new DecodeException("image width or height is incorrect", dVar);
        }
    }

    public a(@h b bVar, @h b bVar2, com.facebook.imagepipeline.platform.d dVar) {
        this.f340394a = bVar;
        this.f340395b = bVar2;
        this.f340396c = dVar;
    }

    @Override // com.facebook.imagepipeline.decoder.b
    public final YW0.b a(YW0.d dVar, int i12, i iVar, UW0.b bVar) throws Throwable {
        InputStream inputStreamF;
        bVar.getClass();
        dVar.m();
        RW0.c cVar = dVar.f19499c;
        if ((cVar == null || cVar == RW0.c.f14507b) && (inputStreamF = dVar.f()) != null) {
            try {
                dVar.f19499c = RW0.d.a(inputStreamF);
            } catch (IOException e12) {
                u.a(e12);
                throw null;
            }
        }
        return ((C10535a) this.f340397d).a(dVar, i12, iVar, bVar);
    }

    public final YW0.c b(YW0.d dVar, UW0.b bVar) {
        com.facebook.common.references.a aVarA = this.f340396c.a(dVar, bVar.f16408a);
        try {
            g gVar = g.f19507d;
            dVar.m();
            int i12 = dVar.f19500d;
            dVar.m();
            YW0.c cVar = new YW0.c(aVarA, gVar, i12, dVar.f19501e);
            Boolean bool = Boolean.FALSE;
            if (YW0.b.f19491c.contains("is_rounded")) {
                cVar.f19492b.put("is_rounded", bool);
            }
            return cVar;
        } finally {
            aVarA.close();
        }
    }
}
