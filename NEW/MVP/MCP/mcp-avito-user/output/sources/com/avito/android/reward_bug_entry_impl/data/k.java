package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.account.E;
import dagger.internal.u;
import dagger.internal.w;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RewardBugEntryRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/k;", "Ldagger/internal/h;", "Lcom/avito/android/reward_bug_entry_impl/data/i;", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f255590c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f255591a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f255592b;

    /* compiled from: RewardBugEntryRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/k$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f255591a = provider;
        this.f255592b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f255591a.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f255592b));
        f255590c.getClass();
        return new i(e12, eVarA);
    }
}
