package com.avito.android.download_deeplink.link;

import Y61.k;
import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DownloadFileLinkAsyncHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/c;", "Ldagger/internal/h;", "Lcom/avito/android/download_deeplink/link/a;", "a", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<com.avito.android.download_deeplink.link.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f144915e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f144916a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f144917b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h f144918c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f144919d;

    /* compiled from: DownloadFileLinkAsyncHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/download_deeplink/link/c$a;", "", "<init>", "()V", "_avito_download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30102l3 c30102l3, @k dv.b bVar, @k h hVar, @k Provider provider) {
        this.f144916a = c30102l3;
        this.f144917b = bVar;
        this.f144918c = hVar;
        this.f144919d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f144916a.get();
        a.h hVar = (a.h) this.f144917b.get();
        d dVar = (d) this.f144918c.get();
        R0 r02 = this.f144919d.get();
        f144915e.getClass();
        return new com.avito.android.download_deeplink.link.a(context, hVar, dVar, r02);
    }
}
