package dx0;

import com.avito.android.social_management.adapter.SocialItem;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderItemModule_ProvidePresenter$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: dx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39824c implements h<com.avito.android.social_management.adapter.header.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SocialItem>> f394182a;

    public C39824c(Provider<com.jakewharton.rxrelay3.c<SocialItem>> provider) {
        this.f394182a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<SocialItem> cVar = this.f394182a.get();
        int i12 = C39822a.f394180a;
        return new com.avito.android.social_management.adapter.header.e(cVar);
    }
}
