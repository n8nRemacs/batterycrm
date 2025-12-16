package com.avito.android.work_profile.profile.cvs.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.work_profile.profile.cvs.mvi.entity.CvsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mQ0.AbstractC44002a;

/* compiled from: CvsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.work_profile.profile.cvs.mvi.CvsActor$process$2", f = "CvsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super CvsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f331040q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC44002a f331041r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC44002a abstractC44002a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f331040q = dVar;
        this.f331041r = abstractC44002a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f331040q, this.f331041r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CvsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        d.c(this.f331040q, ((AbstractC44002a.b) this.f331041r).f414498a);
        return G0.f406611a;
    }
}
