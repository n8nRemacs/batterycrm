package com.avito.android.photo_download.feature.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoDownloadFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/photo_download/feature/mvi/f;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f216459c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f216460a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f216461b;

    /* compiled from: PhotoDownloadFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/g$a;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k d dVar, @Y61.k i iVar) {
        this.f216460a = dVar;
        this.f216461b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f216460a.get();
        this.f216461b.getClass();
        h hVar = new h();
        f216459c.getClass();
        return new f("PhotoDownload", G0.f406611a, new e(cVar, hVar));
    }
}
