package com.avito.android.bxcontent;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.bxcontent.C28969d;

/* compiled from: BxContentCombinationFeatureManager_Factory_Impl.java */
@dagger.internal.e
/* renamed from: com.avito.android.bxcontent.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29096k implements C28969d.a {

    /* renamed from: a, reason: collision with root package name */
    public final C29093j f111137a;

    public C29096k(C29093j c29093j) {
        this.f111137a = c29093j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.bxcontent.C28969d.a
    public final C28969d a(A1.a aVar, com.avito.android.advertising.loaders.beduin.H h12) {
        C29093j c29093j = this.f111137a;
        return new C28969d((C29090i) c29093j.f111129a.get(), (com.avito.android.arch.mvi.q) c29093j.f111130b.get(), dagger.internal.g.b(c29093j.f111131c), dagger.internal.g.b(c29093j.f111132d), (Screen) c29093j.f111133e.f393949a, aVar, h12);
    }
}
