package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.reward_bug_entry_impl.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RewardBugEntryActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/a;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lcom/avito/android/reward_bug_entry_impl/mvi/r;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.a<a, m, r> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.reward_bug_entry_impl.domain.k f255647a;

    @Inject
    public f(@Y61.k com.avito.android.reward_bug_entry_impl.domain.k kVar) {
        this.f255647a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<m> b(a aVar, r rVar) {
        a aVar2 = aVar;
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(this, null));
        }
        if (aVar2 instanceof a.d) {
            return C43175k.G(new c(this, null));
        }
        if (aVar2 instanceof a.C7652a) {
            return C43175k.G(new d(this, aVar2, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new e(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
