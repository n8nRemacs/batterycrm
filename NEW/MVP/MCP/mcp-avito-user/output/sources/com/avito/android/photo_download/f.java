package com.avito.android.photo_download;

import Y61.k;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoDownloadManagerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/f;", "Ldagger/internal/h;", "Lcom/avito/android/photo_download/e;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f216440d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f216441a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f216442b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f216443c;

    /* compiled from: PhotoDownloadManagerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/f$a;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k u uVar, @k c cVar, @k u uVar2) {
        this.f216441a = uVar;
        this.f216442b = cVar;
        this.f216443c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SharedPhotosStorage sharedPhotosStorage = (SharedPhotosStorage) this.f216441a.get();
        this.f216442b.getClass();
        com.avito.android.photo_download.a aVar = new com.avito.android.photo_download.a();
        R0 r02 = (R0) this.f216443c.get();
        f216440d.getClass();
        return new e(sharedPhotosStorage, aVar, r02);
    }
}
