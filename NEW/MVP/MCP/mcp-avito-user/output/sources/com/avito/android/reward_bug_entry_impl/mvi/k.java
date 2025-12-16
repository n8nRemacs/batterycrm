package com.avito.android.reward_bug_entry_impl.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RewardBugEntryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/k;", "Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "Lkotlin/G0;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k extends com.avito.android.arch.mvi.q<com.avito.android.reward_bug_entry_impl.mvi.a, m, r, G0> {

    /* compiled from: RewardBugEntryFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.reward_bug_entry_impl.mvi.a, m, r, G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f255662l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f255663m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ f f255664n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, n nVar, f fVar) {
            super(1);
            this.f255662l = hVar;
            this.f255663m = nVar;
            this.f255664n = fVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.reward_bug_entry_impl.mvi.a, m, r, G0> qVar) {
            com.avito.android.arch.mvi.q<com.avito.android.reward_bug_entry_impl.mvi.a, m, r, G0> qVar2 = qVar;
            qVar2.f92008d = this.f255662l;
            qVar2.f92011g = this.f255663m;
            qVar2.f92009e = this.f255664n;
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public k(@Y61.k h hVar, @Y61.k n nVar, @Y61.k f fVar) {
        super("RewardBugEntry", r.f255672b, new a(hVar, nVar, fVar));
        r.f255671a.getClass();
    }
}
