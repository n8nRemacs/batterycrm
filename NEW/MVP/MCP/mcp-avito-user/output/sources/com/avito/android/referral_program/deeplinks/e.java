package com.avito.android.referral_program.deeplinks;

import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReferralPageBaseDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/e;", "Ldagger/internal/h;", "Lcom/avito/android/referral_program/deeplinks/d;", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f252651e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f252652a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.referral_program.e f252653b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f252654c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f252655d;

    /* compiled from: ReferralPageBaseDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/e$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k dv.b bVar, @k com.avito.android.referral_program.e eVar, @k dv.b bVar2, @k Provider provider) {
        this.f252652a = bVar;
        this.f252653b = eVar;
        this.f252654c = bVar2;
        this.f252655d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f252652a.get();
        com.avito.android.referral_program.c cVar = (com.avito.android.referral_program.c) this.f252653b.get();
        a.b bVar = (a.b) this.f252654c.get();
        R0 r02 = this.f252655d.get();
        f252651e.getClass();
        return new d(interfaceC4053a, cVar, bVar, r02);
    }
}
