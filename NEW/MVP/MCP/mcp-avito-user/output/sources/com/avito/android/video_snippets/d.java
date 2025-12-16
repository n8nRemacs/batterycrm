package com.avito.android.video_snippets;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoSnippetQueueControllerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_snippets/d;", "Ldagger/internal/h;", "Lcom/avito/android/video_snippets/c;", "a", "_avito_video-snippets_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f326078c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f326079a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.player_holder.a> f326080b;

    /* compiled from: VideoSnippetQueueControllerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_snippets/d$a;", "", "<init>", "()V", "_avito_video-snippets_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k u uVar, @k Provider provider) {
        this.f326079a = uVar;
        this.f326080b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        J80.b bVar = (J80.b) this.f326079a.get();
        com.avito.android.player_holder.a aVar = this.f326080b.get();
        f326078c.getClass();
        return new c(bVar, aVar);
    }
}
