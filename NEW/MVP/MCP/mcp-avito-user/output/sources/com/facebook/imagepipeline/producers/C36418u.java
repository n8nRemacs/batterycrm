package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DiskCacheReadProducer.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36418u implements i0<YW0.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C36378k f340735a;

    /* renamed from: b, reason: collision with root package name */
    public final C36378k f340736b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340737c;

    /* renamed from: d, reason: collision with root package name */
    public final C36419v f340738d;

    public C36418u(C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, C36419v c36419v) {
        this.f340735a = c36378k;
        this.f340736b = c36378k2;
        this.f340737c = oVar;
        this.f340738d = c36419v;
    }

    @j.k0
    @I41.h
    public static Map<String, String> c(m0 m0Var, k0 k0Var, boolean z12, int i12) {
        if (m0Var.d(k0Var, "DiskCacheProducer")) {
            return z12 ? com.facebook.common.internal.k.b("cached_value_found", String.valueOf(z12), "encodedImageSize", String.valueOf(i12)) : com.facebook.common.internal.k.a("cached_value_found", String.valueOf(z12));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    public final void b(InterfaceC36410l<YW0.d> interfaceC36410l, k0 k0Var) {
        ImageRequest imageRequestJ = k0Var.j();
        k0Var.j().getClass();
        k0Var.i().c(k0Var, "DiskCacheProducer");
        com.facebook.cache.common.j jVarB = this.f340737c.b(imageRequestJ, k0Var.a());
        C36378k c36378k = imageRequestJ.f340781a == ImageRequest.CacheChoice.f340795b ? this.f340736b : this.f340735a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c36378k.c(jVarB, atomicBoolean).b(new C36416s(this, k0Var.i(), k0Var, interfaceC36410l));
        k0Var.b(new C36417t(atomicBoolean));
    }
}
