package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import kotlin.Metadata;

/* compiled from: RewardsBugEntryPositionStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/m;", "Lcom/avito/android/reward_bug_entry_impl/domain/l;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements com.avito.android.reward_bug_entry_impl.domain.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f255593a;

    public m(@Y61.k AK0.l lVar) {
        this.f255593a = lVar;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.l
    public final void a(@Y61.k PositionOnScreen positionOnScreen) {
        this.f255593a.putString("rw-position", positionOnScreen.name());
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.l
    @Y61.k
    public final PositionOnScreen getPosition() {
        String string = this.f255593a.getString("rw-position");
        if (string == null) {
            PositionOnScreen.f255594b.getClass();
            return PositionOnScreen.f255595c;
        }
        try {
            return PositionOnScreen.valueOf(string);
        } catch (Exception unused) {
            PositionOnScreen.f255594b.getClass();
            return PositionOnScreen.f255595c;
        }
    }
}
