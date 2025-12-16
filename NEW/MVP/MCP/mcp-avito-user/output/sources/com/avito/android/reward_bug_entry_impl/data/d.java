package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RewardBugEntryPositionRepositoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/d;", "Lcom/avito/android/reward_bug_entry_impl/domain/h;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.reward_bug_entry_impl.domain.h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.reward_bug_entry_impl.domain.l f255579a;

    @Inject
    public d(@Y61.k com.avito.android.reward_bug_entry_impl.domain.l lVar) {
        this.f255579a = lVar;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.h
    public final void a(@Y61.k PositionOnScreen positionOnScreen) {
        this.f255579a.a(positionOnScreen);
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.h
    @Y61.k
    public final PositionOnScreen getPosition() {
        return this.f255579a.getPosition();
    }
}
