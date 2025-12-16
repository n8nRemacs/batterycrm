package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.oauth.presentation.OAuthDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthInteractorImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/E;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/presentation/mvi/B;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<B> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f208268c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.oauth.repository.d f208269a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f208270b;

    /* compiled from: OAuthInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/E$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E(@Y61.k com.avito.android.oauth.repository.d dVar, @Y61.k dagger.internal.l lVar) {
        this.f208269a = dVar;
        this.f208270b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.oauth.repository.c cVar = (com.avito.android.oauth.repository.c) this.f208269a.get();
        OAuthDetails oAuthDetails = (OAuthDetails) this.f208270b.f393949a;
        f208268c.getClass();
        return new B(cVar, oAuthDetails);
    }
}
