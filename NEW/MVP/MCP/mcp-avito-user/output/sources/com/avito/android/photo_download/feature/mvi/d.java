package com.avito.android.photo_download.feature.mvi;

import com.avito.android.util.C;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoDownloadActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/d;", "Ldagger/internal/h;", "Lcom/avito/android/photo_download/feature/mvi/c;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f216453d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_download.f f216454a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f216455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f216456c;

    /* compiled from: PhotoDownloadActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/d$a;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k com.avito.android.photo_download.f fVar, @Y61.k u uVar, @Y61.k u uVar2) {
        this.f216454a = fVar;
        this.f216455b = uVar;
        this.f216456c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.photo_download.d dVar = (com.avito.android.photo_download.d) this.f216454a.get();
        com.avito.android.permissions.u uVar = (com.avito.android.permissions.u) this.f216455b.get();
        C c12 = (C) this.f216456c.get();
        f216453d.getClass();
        return new c(dVar, uVar, c12);
    }
}
