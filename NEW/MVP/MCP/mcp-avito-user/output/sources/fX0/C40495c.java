package fx0;

import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.adapter.vk_group.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkGroupItemModule_ProvidePresenter$_avito_social_network_editor_implFactory.java */
@e
@y
@x
/* renamed from: fx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40495c implements h<com.avito.android.social_management.adapter.vk_group.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<SocialItem>> f396201a;

    public C40495c(Provider<com.jakewharton.rxrelay3.c<SocialItem>> provider) {
        this.f396201a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<SocialItem> cVar = this.f396201a.get();
        int i12 = C40493a.f396199a;
        return new f(cVar);
    }
}
