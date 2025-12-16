package kn0;

import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.reward_bug_entry_impl.domain.PositionOnScreen;
import com.avito.android.reward_bug_entry_impl.domain.h;
import com.avito.android.reward_bug_entry_impl.domain.i;
import com.avito.android.reward_bug_entry_impl.domain.j;
import com.avito.android.reward_bug_entry_impl.domain.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RewardsBugEntryInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkn0/a;", "Lcom/avito/android/reward_bug_entry_impl/domain/k;", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kn0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42717a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f406591a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f406592b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.reward_bug_entry_impl.domain.a f406593c;

    @Inject
    public C42717a(@Y61.k h hVar, @Y61.k i iVar, @Y61.k com.avito.android.reward_bug_entry_impl.domain.a aVar) {
        this.f406591a = hVar;
        this.f406592b = iVar;
        this.f406593c = aVar;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    public final void a() {
        this.f406593c.c();
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    @Y61.k
    public final PositionOnScreen b() {
        return this.f406591a.getPosition();
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    @l
    public final Object c(@Y61.k Continuation<? super TypedResult<j>> continuation) {
        return this.f406592b.b((ContinuationImpl) continuation);
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    public final void d(@Y61.k PositionOnScreen positionOnScreen) {
        this.f406593c.b(positionOnScreen);
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    @l
    public final Object e(@Y61.k Continuation<? super G0> continuation) {
        Object objA = this.f406592b.a((ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    public final void f() {
        this.f406593c.a();
    }

    @Override // com.avito.android.reward_bug_entry_impl.domain.k
    public final void g(@Y61.k PositionOnScreen positionOnScreen) {
        this.f406591a.a(positionOnScreen);
    }
}
