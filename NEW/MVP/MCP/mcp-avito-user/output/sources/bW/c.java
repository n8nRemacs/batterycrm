package BW;

import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CommonLoginItemModule_ProvidePresenter$_avito_login_suggests_implFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<com.avito.android.login_suggests_impl.adapter.common_login.b> {

    /* renamed from: a, reason: collision with root package name */
    public final a f1438a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<LoginSuggestsItem>> f1439b;

    public c(a aVar, Provider<com.jakewharton.rxrelay3.c<LoginSuggestsItem>> provider) {
        this.f1438a = aVar;
        this.f1439b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<LoginSuggestsItem> cVar = this.f1439b.get();
        this.f1438a.getClass();
        return new com.avito.android.login_suggests_impl.adapter.common_login.e(cVar);
    }
}
