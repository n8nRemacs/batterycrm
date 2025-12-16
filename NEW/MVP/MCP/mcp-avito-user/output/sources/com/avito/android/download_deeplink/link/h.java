package com.avito.android.download_deeplink.link;

import Y61.k;
import android.app.DownloadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yM0.C50139h;

/* compiled from: DownloadFileLinkInteractor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/h;", "Ldagger/internal/h;", "Lcom/avito/android/download_deeplink/link/d;", "a", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f144940c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50139h f144941a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Ix.b f144942b;

    /* compiled from: DownloadFileLinkInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/h$a;", "", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k C50139h c50139h, @k Ix.b bVar) {
        this.f144941a = c50139h;
        this.f144942b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        DownloadManager downloadManager = (DownloadManager) this.f144941a.get();
        com.avito.android.cookie_provider.e eVar = (com.avito.android.cookie_provider.e) this.f144942b.get();
        f144940c.getClass();
        return new d(downloadManager, eVar);
    }
}
