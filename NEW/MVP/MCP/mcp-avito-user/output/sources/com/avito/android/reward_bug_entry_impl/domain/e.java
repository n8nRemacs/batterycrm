package com.avito.android.reward_bug_entry_impl.domain;

import com.avito.android.account.E;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ln0.C43803a;
import ln0.C43805c;

/* compiled from: RewardBugEntryPollingUseCaseImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/e;", "Ldagger/internal/h;", "Lcom/avito/android/reward_bug_entry_impl/domain/d;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f255615e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<k> f255616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f255617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f255618c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43805c f255619d;

    /* compiled from: RewardBugEntryPollingUseCaseImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/e$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C43805c c43805c) {
        this.f255616a = provider;
        this.f255617b = provider2;
        this.f255618c = provider3;
        this.f255619d = c43805c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = this.f255616a.get();
        R0 r02 = this.f255617b.get();
        E e12 = this.f255618c.get();
        C43803a c43803a = (C43803a) this.f255619d.get();
        f255615e.getClass();
        return new d(kVar, r02, e12, c43803a);
    }
}
