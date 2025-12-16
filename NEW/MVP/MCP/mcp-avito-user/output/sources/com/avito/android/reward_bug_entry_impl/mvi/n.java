package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.reward_bug_entry_impl.domain.j;
import com.avito.android.reward_bug_entry_impl.mvi.m;
import com.avito.android.reward_bug_entry_impl.mvi.r;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RewardBugEntryReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<m, r> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final r a(m mVar, r rVar) {
        m mVar2 = mVar;
        r rVar2 = rVar;
        if (mVar2 instanceof m.a) {
            return rVar2 instanceof r.d ? r.d.a((r.d) rVar2, null, 15) : rVar2;
        }
        if (mVar2 instanceof m.d) {
            return r.b.f255673c;
        }
        if (mVar2 instanceof m.f) {
            m.f fVar = (m.f) mVar2;
            j.b bVar = fVar.f255669a;
            return new r.d(bVar.f255623c, bVar.f255621a, bVar.f255622b, fVar.f255670b, !(rVar2 instanceof r.d));
        }
        if (mVar2 instanceof m.b) {
            if (rVar2 instanceof r.d) {
                return r.d.a((r.d) rVar2, ((m.b) mVar2).f255666a, 23);
            }
            if (rVar2 instanceof r.c ? true : rVar2 instanceof r.b) {
                return rVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (mVar2 instanceof m.e) {
            throw null;
        }
        if (mVar2 instanceof m.c) {
            return r.b.f255673c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
