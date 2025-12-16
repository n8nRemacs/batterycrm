package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: WorkInitializer.java */
/* loaded from: classes10.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f343222a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.persistence.d f343223b;

    /* renamed from: c, reason: collision with root package name */
    public final m f343224c;

    /* renamed from: d, reason: collision with root package name */
    public final GX0.a f343225d;

    @Inject
    public k(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, m mVar, GX0.a aVar) {
        this.f343222a = executor;
        this.f343223b = dVar;
        this.f343224c = mVar;
        this.f343225d = aVar;
    }
}
