package com.avito.android.reward_bug_entry_impl.data;

import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RewardBugEntryPositionRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/e;", "Ldagger/internal/h;", "Lcom/avito/android/reward_bug_entry_impl/data/d;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f255580b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f255581a;

    /* compiled from: RewardBugEntryPositionRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/e$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k u uVar) {
        this.f255581a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.reward_bug_entry_impl.domain.l lVar = (com.avito.android.reward_bug_entry_impl.domain.l) this.f255581a.get();
        f255580b.getClass();
        return new d(lVar);
    }
}
