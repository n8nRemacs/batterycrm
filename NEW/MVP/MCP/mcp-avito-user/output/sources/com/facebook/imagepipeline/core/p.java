package com.facebook.imagepipeline.core;

import aX0.C19832c;
import aX0.C19833d;
import aX0.InterfaceC19835f;
import com.avito.android.remote.notification.C34338e;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.producers.F;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import qW0.InterfaceC47354a;

/* compiled from: ImagePipeline.java */
@J41.d
/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final A f340290a;

    /* renamed from: b, reason: collision with root package name */
    public final C19833d f340291b;

    /* renamed from: c, reason: collision with root package name */
    public final C19832c f340292c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.common.internal.r<Boolean> f340293d;

    /* renamed from: e, reason: collision with root package name */
    public final B f340294e;

    /* renamed from: f, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340295f;

    /* renamed from: g, reason: collision with root package name */
    public final com.facebook.common.internal.r<Boolean> f340296g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f340297h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    @I41.h
    public final InterfaceC47354a f340298i;

    /* renamed from: j, reason: collision with root package name */
    public final r f340299j;

    /* compiled from: ImagePipeline.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340300a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            f340300a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340300a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new CancellationException("Prefetching is not enabled");
    }

    public p(A a12, Set set, Set set2, com.facebook.common.internal.r rVar, B b12, B b13, C36378k c36378k, com.facebook.imagepipeline.cache.o oVar, y0 y0Var, com.facebook.common.internal.r rVar2, @I41.h InterfaceC47354a interfaceC47354a, r rVar3) {
        this.f340290a = a12;
        this.f340291b = new C19833d((Set<InterfaceC19835f>) set);
        this.f340292c = new C19832c(set2);
        this.f340293d = rVar;
        this.f340294e = b12;
        this.f340295f = oVar;
        this.f340296g = rVar2;
        this.f340298i = interfaceC47354a;
        this.f340299j = rVar3;
    }

    public final com.facebook.datasource.c a(ImageRequest imageRequest, @I41.h C34338e c34338e) {
        return b(imageRequest, c34338e, ImageRequest.RequestLevel.FULL_FETCH, null, null);
    }

    public final com.facebook.datasource.c b(ImageRequest imageRequest, @I41.h C34338e c34338e, ImageRequest.RequestLevel requestLevel, @I41.h InterfaceC19835f interfaceC19835f, @I41.h String str) {
        try {
            return d(this.f340290a.c(imageRequest), imageRequest, requestLevel, c34338e, interfaceC19835f, str);
        } catch (Exception e12) {
            com.facebook.datasource.o oVar = new com.facebook.datasource.o();
            oVar.k(e12, null);
            return oVar;
        }
    }

    public final com.facebook.common.internal.r c(ImageRequest imageRequest) {
        return new h(this, imageRequest);
    }

    public final com.facebook.datasource.c d(i0 i0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, @I41.h C34338e c34338e, @I41.h InterfaceC19835f interfaceC19835f, @I41.h String str) {
        C19833d c19833d;
        com.facebook.imagepipeline.systrace.b.a();
        C19833d c19833d2 = this.f340291b;
        if (interfaceC19835f == null) {
            InterfaceC19835f interfaceC19835f2 = imageRequest.f340794n;
            if (interfaceC19835f2 != null) {
                c19833d = new C19833d(c19833d2, interfaceC19835f2);
                c19833d2 = c19833d;
            }
        } else {
            InterfaceC19835f interfaceC19835f3 = imageRequest.f340794n;
            if (interfaceC19835f3 == null) {
                c19833d2 = new C19833d(c19833d2, interfaceC19835f);
            } else {
                c19833d = new C19833d(c19833d2, interfaceC19835f, interfaceC19835f3);
                c19833d2 = c19833d;
            }
        }
        F f12 = new F(c19833d2, this.f340292c);
        InterfaceC47354a interfaceC47354a = this.f340298i;
        if (interfaceC47354a != null) {
            interfaceC47354a.a();
        }
        try {
            ImageRequest.RequestLevel requestLevel2 = imageRequest.f340790j;
            t0 t0Var = new t0(imageRequest, String.valueOf(this.f340297h.getAndIncrement()), str, f12, c34338e, requestLevel2.f340802b > requestLevel.f340802b ? requestLevel2 : requestLevel, false, !com.facebook.common.util.g.c(imageRequest.f340782b), imageRequest.f340789i, this.f340299j);
            com.facebook.imagepipeline.systrace.b.a();
            com.facebook.imagepipeline.datasource.f fVar = new com.facebook.imagepipeline.datasource.f(i0Var, t0Var, f12);
            com.facebook.imagepipeline.systrace.b.a();
            return fVar;
        } catch (Exception e12) {
            com.facebook.datasource.o oVar = new com.facebook.datasource.o();
            oVar.k(e12, null);
            return oVar;
        } finally {
            com.facebook.imagepipeline.systrace.b.a();
        }
    }
}
