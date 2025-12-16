package com.avito.android.reward_bug_entry_impl.mvi;

import com.avito.android.reward_bug_entry_impl.mvi.a;
import com.avito.android.reward_bug_entry_impl.mvi.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RewardBugEntryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/reward_bug_entry_impl/mvi/m;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.reward_bug_entry_impl.mvi.RewardBugEntryActor$process$3", f = "RewardBugEntryActor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super m>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f255640q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f255641r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f255642s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f255643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f255642s = fVar;
        this.f255643t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f255642s, this.f255643t, continuation);
        dVar.f255641r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super m> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f255640q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f255641r;
            f fVar = this.f255642s;
            com.avito.android.reward_bug_entry_impl.domain.k kVar = fVar.f255647a;
            a.C7652a c7652a = (a.C7652a) this.f255643t;
            kVar.g(c7652a.f255632a);
            fVar.f255647a.d(c7652a.f255632a);
            m.b bVar = new m.b(c7652a.f255632a);
            this.f255640q = 1;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
