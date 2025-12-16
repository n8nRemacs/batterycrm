package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$accountStateFlow$$inlined$flatMapLatest$1", f = "ExtendedProfileActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30452b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150134q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f150135r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f150136s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C30451a f150137t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30452b(C30451a c30451a, Continuation continuation) {
        super(3, continuation);
        this.f150137t = c30451a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
        C30452b c30452b = new C30452b(this.f150137t, continuation);
        c30452b.f150135r = interfaceC43172j;
        c30452b.f150136s = bool;
        return c30452b.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f150135r;
            ((Boolean) this.f150136s).getClass();
            InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iF = this.f150137t.f(true);
            this.f150134q = 1;
            if (C43175k.u(this, interfaceC43160iF, interfaceC43172j) == coroutine_suspended) {
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
