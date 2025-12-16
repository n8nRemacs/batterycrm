package com.avito.android.reward_bug_entry_impl;

import Y41.l;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.avito.android.reward_bug_entry_impl.mvi.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RewardBugEntryLifecycleCallbacksImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements l<PositionOnScreen, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f255574l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar) {
        super(1);
        this.f255574l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(PositionOnScreen positionOnScreen) {
        this.f255574l.f255629e.accept(new a.C7652a(positionOnScreen));
        return G0.f406611a;
    }
}
