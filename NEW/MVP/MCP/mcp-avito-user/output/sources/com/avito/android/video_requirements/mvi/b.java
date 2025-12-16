package com.avito.android.video_requirements.mvi;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoRequirementsActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_requirements/mvi/b;", "Ldagger/internal/h;", "Lcom/avito/android/video_requirements/mvi/a;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<com.avito.android.video_requirements.mvi.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f326018b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f326019a;

    /* compiled from: VideoRequirementsActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_requirements/mvi/b$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k u uVar) {
        this.f326019a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.video_requirements.domain.a aVar = (com.avito.android.video_requirements.domain.a) this.f326019a.get();
        f326018b.getClass();
        return new com.avito.android.video_requirements.mvi.a(aVar);
    }
}
