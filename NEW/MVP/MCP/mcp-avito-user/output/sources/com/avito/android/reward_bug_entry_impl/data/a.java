package com.avito.android.reward_bug_entry_impl.data;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.squareup.anvil.annotations.ContributesBinding;
import in0.C41429a;
import in0.C41430b;
import in0.C41431c;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: RewardBugEntryAnalyticsRepositoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/data/a;", "Lcom/avito/android/reward_bug_entry_impl/domain/a;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.reward_bug_entry_impl.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f255576a;

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f255576a = interfaceC28373a;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.a
    public final void a() {
        this.f255576a.c(new C41431c());
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.a
    public final void b(@Y61.k PositionOnScreen positionOnScreen) {
        this.f255576a.c(new C41430b(positionOnScreen.name()));
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.a
    public final void c() {
        this.f255576a.c(new C41429a());
    }
}
