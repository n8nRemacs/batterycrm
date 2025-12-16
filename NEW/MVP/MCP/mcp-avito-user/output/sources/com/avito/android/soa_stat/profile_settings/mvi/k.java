package com.avito.android.soa_stat.profile_settings.mvi;

import Vw0.InterfaceC15722a;
import com.avito.android.soa_stat.profile_settings.mvi.entity.SoaStatSettingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.mvi.SoaStatSettingActor$processLoadingActions$$inlined$flatMapLatest$1", f = "SoaStatSettingActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class k extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SoaStatSettingInternalAction>, InterfaceC15722a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284185q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f284186r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f284187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f284188t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f284189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Continuation continuation, a aVar, Y41.a aVar2) {
        super(3, continuation);
        this.f284188t = aVar;
        this.f284189u = aVar2;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super SoaStatSettingInternalAction> interfaceC43172j, InterfaceC15722a interfaceC15722a, Continuation<? super G0> continuation) {
        k kVar = new k(continuation, this.f284188t, this.f284189u);
        kVar.f284186r = interfaceC43172j;
        kVar.f284187s = interfaceC15722a;
        return kVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284185q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f284186r;
            InterfaceC15722a interfaceC15722a = (InterfaceC15722a) this.f284187s;
            InterfaceC43160i interfaceC43160iC = this.f284188t.c(interfaceC15722a);
            this.f284185q = 1;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
