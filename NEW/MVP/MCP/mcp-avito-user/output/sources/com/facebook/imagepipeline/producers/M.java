package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalFetchProducer.java */
@Nullsafe
/* loaded from: classes15.dex */
public abstract class M implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f340575a;

    /* renamed from: b, reason: collision with root package name */
    public final wW0.g f340576b;

    /* compiled from: LocalFetchProducer.java */
    public class a extends u0<YW0.d> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f340577g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ m0 f340578h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ k0 f340579i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36410l interfaceC36410l, m0 m0Var, k0 k0Var, String str, ImageRequest imageRequest, m0 m0Var2, k0 k0Var2) {
            super(interfaceC36410l, m0Var, k0Var, str);
            this.f340577g = imageRequest;
            this.f340578h = m0Var2;
            this.f340579i = k0Var2;
        }

        @Override // com.facebook.common.executors.h
        public final void b(Object obj) {
            YW0.d.b((YW0.d) obj);
        }

        @Override // com.facebook.common.executors.h
        @I41.h
        public final Object c() throws Throwable {
            ImageRequest imageRequest = this.f340577g;
            M m12 = M.this;
            YW0.d dVarD = m12.d(imageRequest);
            m0 m0Var = this.f340578h;
            k0 k0Var = this.f340579i;
            if (dVarD == null) {
                m0Var.b(k0Var, m12.e(), false);
                k0Var.l("local");
                return null;
            }
            dVarD.h();
            m0Var.b(k0Var, m12.e(), true);
            k0Var.l("local");
            return dVarD;
        }
    }

    /* compiled from: LocalFetchProducer.java */
    public class b extends C36401e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u0 f340581a;

        public b(u0 u0Var) {
            this.f340581a = u0Var;
        }

        @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
        public final void c() {
            this.f340581a.a();
        }
    }

    public M(Executor executor, wW0.g gVar) {
        this.f340575a = executor;
        this.f340576b = gVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        m0 m0VarI = k0Var.i();
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.k("local", "fetch");
        a aVar = new a(interfaceC36410l, m0VarI, k0Var, e(), imageRequestJ, m0VarI, k0Var);
        k0Var.b(new b(aVar));
        this.f340575a.execute(aVar);
    }

    public final YW0.d c(int i12, InputStream inputStream) {
        wW0.g gVar = this.f340576b;
        com.facebook.common.references.a aVarM = null;
        try {
            aVarM = i12 <= 0 ? com.facebook.common.references.a.m(gVar.a(inputStream)) : com.facebook.common.references.a.m(gVar.b(i12, inputStream));
            YW0.d dVar = new YW0.d(aVarM);
            com.facebook.common.internal.e.b(inputStream);
            com.facebook.common.references.a.c(aVarM);
            return dVar;
        } catch (Throwable th2) {
            com.facebook.common.internal.e.b(inputStream);
            com.facebook.common.references.a.c(aVarM);
            throw th2;
        }
    }

    @I41.h
    public abstract YW0.d d(ImageRequest imageRequest);

    public abstract String e();
}
