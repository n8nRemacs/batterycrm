package com.facebook.imagepipeline.core;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: DefaultExecutorSupplier.java */
@Nullsafe
/* loaded from: classes12.dex */
public class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f340283b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f340284c;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f340286e;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f340282a = Executors.newFixedThreadPool(2, new y("FrescoIoBoundExecutor"));

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f340285d = Executors.newFixedThreadPool(1, new y("FrescoLightWeightBackgroundExecutor"));

    public b(int i12) {
        this.f340283b = Executors.newFixedThreadPool(i12, new y("FrescoDecodeExecutor"));
        this.f340284c = Executors.newFixedThreadPool(i12, new y("FrescoBackgroundExecutor"));
        this.f340286e = Executors.newScheduledThreadPool(i12, new y("FrescoBackgroundExecutor"));
    }

    @Override // com.facebook.imagepipeline.core.f
    public final ExecutorService a() {
        return this.f340284c;
    }

    @Override // com.facebook.imagepipeline.core.f
    public final ExecutorService b() {
        return this.f340282a;
    }

    @Override // com.facebook.imagepipeline.core.f
    public final ExecutorService c() {
        return this.f340285d;
    }

    @Override // com.facebook.imagepipeline.core.f
    public final ExecutorService d() {
        return this.f340282a;
    }

    @Override // com.facebook.imagepipeline.core.f
    public final ExecutorService e() {
        return this.f340283b;
    }
}
