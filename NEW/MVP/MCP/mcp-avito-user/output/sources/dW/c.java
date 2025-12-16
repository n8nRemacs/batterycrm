package DW;

import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import com.avito.android.login_suggests_impl.w;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestItemModule_ProvidePresenter$_avito_login_suggests_implFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<com.avito.android.login_suggests_impl.adapter.suggest.b> {

    /* renamed from: a, reason: collision with root package name */
    public final a f3219a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<LoginSuggestsItem>> f3220b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3221c;

    public c(a aVar, Provider provider, u uVar) {
        this.f3219a = aVar;
        this.f3220b = provider;
        this.f3221c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<LoginSuggestsItem> cVar = this.f3220b.get();
        w wVar = (w) this.f3221c.get();
        this.f3219a.getClass();
        return new com.avito.android.login_suggests_impl.adapter.suggest.e(cVar, wVar);
    }
}
