package com.avito.android.loyalty_program.loyalty_entry_view.domain;

import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yX.C50195a;

/* compiled from: LoyaltyEntryViewInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/domain/c;", "Ldagger/internal/h;", "Lcom/avito/android/loyalty_program/loyalty_entry_view/domain/b;", "a", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f184164c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C50195a> f184165a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<FX.a> f184166b;

    /* compiled from: LoyaltyEntryViewInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/domain/c$a;", "", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<C50195a> provider, @k Provider<FX.a> provider2) {
        this.f184165a = provider;
        this.f184166b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C50195a c50195a = this.f184165a.get();
        FX.a aVar = this.f184166b.get();
        f184164c.getClass();
        return new b(c50195a, aVar);
    }
}
