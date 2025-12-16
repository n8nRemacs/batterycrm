package kf0;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FashionAuthenticationModule_ProvideNotificationBannerItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: kf0.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42687f implements h<com.avito.android.publish.slots.fashion_authentication_check_banner.item.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.fashion_authentication_check_banner.item.a> f406533a;

    public C42687f(Provider<com.avito.android.publish.slots.fashion_authentication_check_banner.item.a> provider) {
        this.f406533a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.fashion_authentication_check_banner.item.a aVar = this.f406533a.get();
        C42686e.f406532a.getClass();
        return new com.avito.android.publish.slots.fashion_authentication_check_banner.item.h(aVar);
    }
}
