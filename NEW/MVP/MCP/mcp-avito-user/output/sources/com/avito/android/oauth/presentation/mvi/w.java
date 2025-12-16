package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthBootstrap_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/w;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/mvi/v;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208375c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.account.plugin.rx.a> f208376a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f208377b;

    /* compiled from: OAuthBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/w$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f208376a = provider;
        this.f208377b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.plugin.rx.a aVar = this.f208376a.get();
        A a12 = (A) this.f208377b.get();
        f208375c.getClass();
        return new v(aVar, a12);
    }
}
