package com.avito.android.referral_program.deeplinks;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReferralPageDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/g;", "Ldagger/internal/h;", "Lcom/avito/android/referral_program/deeplinks/f;", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f252657b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f252658a;

    /* compiled from: ReferralPageDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/g$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k e eVar) {
        this.f252658a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f252658a.get();
        f252657b.getClass();
        return new f(dVar);
    }
}
