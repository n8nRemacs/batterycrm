package com.avito.android.referral_program.di;

import X41.n;
import Y61.k;
import com.avito.android.referral_program.ReferralPageDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ReferralPageDeepLinkModule_ProvideReferralPageMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/di/g;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f252666b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.referral_program.deeplinks.g f252667a;

    /* compiled from: ReferralPageDeepLinkModule_ProvideReferralPageMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/di/g$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.referral_program.deeplinks.g gVar) {
            f.f252665a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(ReferralPageDeepLink.class, new com.avito.android.referral_program.deeplinks.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ReferralPageDeepLink.class), gVar));
        }

        public a() {
        }
    }

    public g(@k com.avito.android.referral_program.deeplinks.g gVar) {
        this.f252667a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.referral_program.deeplinks.g gVar = this.f252667a;
        f252666b.getClass();
        return a.a(gVar);
    }
}
