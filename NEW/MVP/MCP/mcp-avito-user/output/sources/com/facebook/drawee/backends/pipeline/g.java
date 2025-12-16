package com.facebook.drawee.backends.pipeline;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import cX0.C27123f;
import com.facebook.common.internal.o;
import com.facebook.common.internal.r;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.cache.D;
import com.facebook.imagepipeline.cache.L;
import com.facebook.imagepipeline.core.A;
import com.facebook.imagepipeline.core.p;
import com.facebook.imagepipeline.core.t;
import com.facebook.imagepipeline.core.u;
import com.facebook.imagepipeline.core.z;
import com.facebook.imagepipeline.memory.E;
import com.facebook.imagepipeline.memory.F;
import com.facebook.imagepipeline.producers.y0;
import java.util.Collections;
import java.util.Set;

/* compiled from: PipelineDraweeControllerBuilderSupplier.java */
/* loaded from: classes.dex */
public class g implements r<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f339930a;

    /* renamed from: b, reason: collision with root package name */
    public final p f339931b;

    /* renamed from: c, reason: collision with root package name */
    public final h f339932c;

    public g() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.facebook.common.internal.r<java.lang.Boolean>] */
    public g(Context context, @I41.h c cVar) {
        WW0.a aVar;
        WW0.a aVar2;
        WW0.a aVar3;
        com.facebook.imagepipeline.decoder.b bVarC;
        com.facebook.imagepipeline.decoder.b bVarB;
        u uVar = u.f340344t;
        o.c(uVar, "ImagePipelineFactory was not initialized!");
        this.f339930a = context;
        if (uVar.f340355k == null) {
            com.facebook.imagepipeline.core.r rVar = uVar.f340346b;
            rVar.f340322u.getClass();
            A a12 = uVar.f340358n;
            y0 y0Var = uVar.f340345a;
            L l12 = rVar.f340310i;
            t tVar = rVar.f340322u;
            if (a12 == null) {
                ContentResolver contentResolver = rVar.f340305d.getApplicationContext().getContentResolver();
                if (uVar.f340357m == null) {
                    t.c cVar2 = tVar.f340335a;
                    F f12 = rVar.f340316o;
                    if (f12.f340442h == null) {
                        E e12 = f12.f340435a;
                        f12.f340442h = new com.facebook.imagepipeline.memory.t(e12.f340428d, e12.f340431g, e12.f340432h);
                    }
                    com.facebook.imagepipeline.memory.t tVar2 = f12.f340442h;
                    if (uVar.f340354j == null) {
                        TW0.a aVarA = uVar.a();
                        if (aVarA != null) {
                            bVarB = aVarA.b();
                            bVarC = aVarA.c();
                        } else {
                            bVarC = null;
                            bVarB = null;
                        }
                        uVar.f340354j = new com.facebook.imagepipeline.decoder.a(bVarB, bVarC, uVar.e());
                    }
                    com.facebook.imagepipeline.decoder.b bVar = uVar.f340354j;
                    com.facebook.imagepipeline.decoder.f fVar = rVar.f340317p;
                    com.facebook.imagepipeline.core.b bVar2 = rVar.f340309h;
                    wW0.g gVarB = f12.b(rVar.f340314m);
                    f12.c();
                    if (uVar.f340349e == null) {
                        uVar.f340349e = D.a(uVar.b(), l12);
                    }
                    B<com.facebook.cache.common.c, YW0.b> b12 = uVar.f340349e;
                    B<com.facebook.cache.common.c, PooledByteBuffer> bC2 = uVar.c();
                    C36378k c36378kD = uVar.d();
                    C36378k c36378kF = uVar.f();
                    if (uVar.f340361q == null) {
                        uVar.e();
                        uVar.f340361q = new com.facebook.imagepipeline.bitmaps.a(f12.a(), uVar.f340347c);
                    }
                    com.facebook.imagepipeline.bitmaps.a aVar4 = uVar.f340361q;
                    cVar2.getClass();
                    uVar.f340357m = new z(rVar.f340305d, tVar2, bVar, fVar, rVar.f340306e, rVar.f340320s, bVar2, gVarB, b12, bC2, c36378kD, c36378kF, rVar.f340304c, aVar4, uVar.f340347c, tVar.f340339e);
                }
                z zVar = uVar.f340357m;
                tVar.getClass();
                if (uVar.f340356l == null) {
                    aVar3 = null;
                    uVar.f340356l = new C27123f(null, null, tVar.f340338d);
                } else {
                    aVar3 = null;
                }
                uVar.f340358n = new A(contentResolver, zVar, rVar.f340315n, rVar.f340320s, y0Var, rVar.f340306e, rVar.f340323v, uVar.f340356l);
                aVar2 = aVar3;
            } else {
                aVar2 = null;
            }
            A a13 = uVar.f340358n;
            Set setUnmodifiableSet = Collections.unmodifiableSet(rVar.f340318q);
            Set setUnmodifiableSet2 = Collections.unmodifiableSet(rVar.f340319r);
            r<Boolean> rVar2 = rVar.f340311j;
            if (uVar.f340349e == null) {
                uVar.f340349e = D.a(uVar.b(), l12);
            }
            B<com.facebook.cache.common.c, YW0.b> b13 = uVar.f340349e;
            B<com.facebook.cache.common.c, PooledByteBuffer> bC3 = uVar.c();
            uVar.d();
            uVar.f340355k = new p(a13, setUnmodifiableSet, setUnmodifiableSet2, rVar2, b13, bC3, uVar.f(), rVar.f340304c, y0Var, tVar.f340336b, null, rVar);
            aVar = aVar2;
        } else {
            aVar = null;
        }
        p pVar = uVar.f340355k;
        this.f339931b = pVar;
        h hVar = new h();
        this.f339932c = hVar;
        Resources resources = context.getResources();
        com.facebook.drawee.components.a aVarB = com.facebook.drawee.components.a.b();
        TW0.a aVarA2 = uVar.a();
        WW0.a aVarA3 = aVarA2 == null ? aVar : aVarA2.a();
        com.facebook.common.executors.i iVarA = com.facebook.common.executors.i.a();
        B b14 = pVar.f340294e;
        ?? r52 = cVar != null ? cVar.f339913a : aVar;
        hVar.f339933a = resources;
        hVar.f339934b = aVarB;
        hVar.f339935c = aVarA3;
        hVar.f339936d = iVarA;
        hVar.f339937e = b14;
        hVar.f339938f = r52;
    }

    @Override // com.facebook.common.internal.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f get() {
        return new f(this.f339930a, this.f339932c, this.f339931b);
    }
}
