package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.InterfaceC27663a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthActor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/u;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/mvi/a;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<C32904a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f208364d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final cv.e f208365a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27663a> f208366b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<A> f208367c;

    /* compiled from: OAuthActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/u$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public u(@Y61.k cv.e eVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f208365a = eVar;
        this.f208366b = provider;
        this.f208367c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f208365a.get();
        InterfaceC27663a interfaceC27663a = this.f208366b.get();
        A a12 = this.f208367c.get();
        f208364d.getClass();
        return new C32904a(aVar, interfaceC27663a, a12);
    }
}
