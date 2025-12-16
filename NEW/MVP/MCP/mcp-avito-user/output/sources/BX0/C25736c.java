package bx0;

import com.avito.android.social_management.adapter.SocialItem;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvailableItemModule_ProvidePresenter$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: bx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25736c implements h<com.avito.android.social_management.adapter.available.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SocialItem>> f57569a;

    public C25736c(Provider<com.jakewharton.rxrelay3.c<SocialItem>> provider) {
        this.f57569a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<SocialItem> cVar = this.f57569a.get();
        int i12 = C25734a.f57567a;
        return new com.avito.android.social_management.adapter.available.e(cVar);
    }
}
