package com.avito.android.referral_program.di;

import Y61.k;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.t;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;

/* compiled from: ReferralBeduinOkHttpModule_ProvideBeduinOkHttpClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/di/d;", "Ldagger/internal/h;", "Lokhttp3/OkHttpClient;", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<OkHttpClient> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f252662c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<OkHttpClient> f252663a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C30102l3 f252664b;

    /* compiled from: ReferralBeduinOkHttpModule_ProvideBeduinOkHttpClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/di/d$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k C30102l3 c30102l3, @k Provider provider) {
        this.f252663a = provider;
        this.f252664b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f252663a.get();
        Context context = (Context) this.f252664b.get();
        f252662c.getClass();
        c.f252661a.getClass();
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().addInterceptor(new com.avito.android.referral_program.di.a(C42727D.c(new b(context)))).build();
        t.b(okHttpClientBuild, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuild;
    }
}
