package com.avito.android.referral_program;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReferralPageViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/k;", "Ldagger/internal/h;", "Lcom/avito/android/referral_program/i;", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f252689h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<n.a> f252690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<B> f252691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Set<FV0.h>> f252692c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31144q0 f252693d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f252694e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f252695f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31151u0 f252696g;

    /* compiled from: ReferralPageViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/k$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C31144q0 c31144q0, @Y61.k Provider provider4, @Y61.k dagger.internal.l lVar, @Y61.k C31151u0 c31151u0) {
        this.f252690a = provider;
        this.f252691b = provider2;
        this.f252692c = provider3;
        this.f252693d = c31144q0;
        this.f252694e = provider4;
        this.f252695f = lVar;
        this.f252696g = c31151u0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVar = this.f252690a.get();
        B b12 = this.f252691b.get();
        Set<FV0.h> set = this.f252692c.get();
        aU0.b bVar = (aU0.b) this.f252693d.get();
        R0 r02 = this.f252694e.get();
        String str = (String) this.f252695f.f393949a;
        ZS.b bVar2 = (ZS.b) this.f252696g.get();
        f252689h.getClass();
        return new i(aVar, b12, set, bVar, r02, str, bVar2);
    }
}
