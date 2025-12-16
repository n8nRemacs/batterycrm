package com.facebook.drawee.controller;

import I41.h;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.r;
import com.facebook.datasource.j;
import com.facebook.datasource.m;
import com.facebook.datasource.n;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import fX0.u;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Nullsafe
/* loaded from: classes.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements IW0.d {

    /* renamed from: f, reason: collision with root package name */
    public static final e<Object> f339980f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final NullPointerException f339981g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLong f339982h;

    /* renamed from: a, reason: collision with root package name */
    @h
    public ImageRequest f339983a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public ImageRequest f339984b;

    /* renamed from: c, reason: collision with root package name */
    @h
    public n f339985c;

    /* renamed from: d, reason: collision with root package name */
    @h
    public d f339986d;

    /* renamed from: e, reason: collision with root package name */
    @h
    public IW0.a f339987e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CacheLevel {

        /* renamed from: b, reason: collision with root package name */
        public static final CacheLevel f339988b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CacheLevel[] f339989c;

        static {
            CacheLevel cacheLevel = new CacheLevel("FULL_FETCH", 0);
            f339988b = cacheLevel;
            f339989c = new CacheLevel[]{cacheLevel, new CacheLevel("DISK_CACHE", 1), new CacheLevel("BITMAP_MEMORY_CACHE", 2)};
        }

        public CacheLevel() {
            throw null;
        }

        public static CacheLevel valueOf(String str) {
            return (CacheLevel) Enum.valueOf(CacheLevel.class, str);
        }

        public static CacheLevel[] values() {
            return (CacheLevel[]) f339989c.clone();
        }
    }

    public static class a extends d<Object> {
        @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
        public final void f(String str, @h Object obj, @h Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    static {
        new a();
        f339981g = new NullPointerException("No image request was specified!");
        f339982h = new AtomicLong();
    }

    public final b a() {
        ImageRequest imageRequest;
        if (!(this.f339985c == null || (this.f339983a == null && this.f339984b == null))) {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
        if (this.f339983a == null && (imageRequest = this.f339984b) != null) {
            this.f339983a = imageRequest;
            this.f339984b = null;
        }
        com.facebook.imagepipeline.systrace.b.a();
        com.facebook.drawee.backends.pipeline.e eVarC = c();
        d dVar = this.f339986d;
        if (dVar != null) {
            eVarC.a(dVar);
        }
        com.facebook.imagepipeline.systrace.b.a();
        return eVarC;
    }

    public abstract com.facebook.datasource.c b(com.facebook.drawee.backends.pipeline.e eVar, String str, Object obj, CacheLevel cacheLevel);

    @u
    public abstract com.facebook.drawee.backends.pipeline.e c();

    public final r d(com.facebook.drawee.backends.pipeline.e eVar, String str) {
        n nVar = this.f339985c;
        if (nVar != null) {
            return nVar;
        }
        ImageRequest imageRequest = this.f339983a;
        CacheLevel cacheLevel = CacheLevel.f339988b;
        r cVar = imageRequest != null ? new c(this, eVar, str, imageRequest, cacheLevel) : null;
        if (cVar != null && this.f339984b != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cVar);
            arrayList.add(new c(this, eVar, str, this.f339984b, cacheLevel));
            cVar = new m(arrayList);
        }
        return cVar == null ? j.a(f339981g) : cVar;
    }
}
