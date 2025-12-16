package com.avito.android.oauth.repository;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.R6;
import com.avito.android.remote.X;
import dagger.internal.h;
import f40.InterfaceC40231a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthRepository_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/repository/d;", "Ldagger/internal/h;", "Lcom/avito/android/oauth/repository/c;", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f208464c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC40231a> f208465a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R6 f208466b;

    /* compiled from: OAuthRepository_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/repository/d$a;", "", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k Provider provider, @k R6 r62) {
        this.f208465a = provider;
        this.f208466b = r62;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40231a interfaceC40231a = this.f208465a.get();
        X x12 = (X) this.f208466b.get();
        f208464c.getClass();
        return new c(interfaceC40231a, x12);
    }
}
