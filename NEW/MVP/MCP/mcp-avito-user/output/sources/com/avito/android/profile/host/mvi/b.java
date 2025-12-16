package com.avito.android.profile.host.mvi;

import Y41.q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import q90.InterfaceC47262a;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.host.mvi.UserProfileHostActor$processProfileChangedAction$$inlined$flatMapLatest$1", f = "UserProfileHostActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class b extends SuspendLambda implements q<InterfaceC43172j<? super q90.b>, InterfaceC47262a.C12306a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f222362q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f222363r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f222364s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f222365t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f222366u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Continuation continuation, e eVar, Y41.a aVar) {
        super(3, continuation);
        this.f222365t = eVar;
        this.f222366u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super q90.b> interfaceC43172j, InterfaceC47262a.C12306a c12306a, Continuation<? super G0> continuation) {
        b bVar = new b(continuation, this.f222365t, this.f222366u);
        bVar.f222363r = interfaceC43172j;
        bVar.f222364s = c12306a;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f222362q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f222363r;
            InterfaceC47262a.C12306a c12306a = (InterfaceC47262a.C12306a) this.f222364s;
            e eVar = this.f222365t;
            if (c12306a == null) {
                throw new NoWhenBranchMatchedException();
            }
            C1 c1A = eVar.f222402a.a();
            this.f222362q = 1;
            if (C43175k.u(this, c1A, interfaceC43172j) == coroutine_suspended) {
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
