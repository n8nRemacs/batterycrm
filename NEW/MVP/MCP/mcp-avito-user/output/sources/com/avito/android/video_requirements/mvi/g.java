package com.avito.android.video_requirements.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoRequirementsFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_requirements/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/video_requirements/mvi/f;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f326027e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f326028a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f326029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f326030c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f326031d;

    /* compiled from: VideoRequirementsFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_requirements/mvi/g$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k d dVar, @Y61.k b bVar, @Y61.k i iVar, @Y61.k k kVar) {
        this.f326028a = dVar;
        this.f326029b = bVar;
        this.f326030c = iVar;
        this.f326031d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f326028a.getClass();
        c cVar = new c();
        com.avito.android.video_requirements.mvi.a aVar = (com.avito.android.video_requirements.mvi.a) this.f326029b.get();
        this.f326030c.getClass();
        h hVar = new h();
        this.f326031d.getClass();
        j jVar = new j();
        f326027e.getClass();
        pN0.d.f428514b.getClass();
        return new f("VideoRequirements", pN0.d.f428515c, new e(cVar, aVar, jVar, hVar));
    }
}
