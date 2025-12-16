package com.avito.android.messenger.channels.mvi.list_feature;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToTypingEvents$$inlined$flatMapLatest$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class U0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super HY.g>, Boolean, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187854q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f187855r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f187856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f187857t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(W w12, Continuation continuation) {
        super(3, continuation);
        this.f187857t = w12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super HY.g> interfaceC43172j, Boolean bool, Continuation<? super kotlin.G0> continuation) {
        U0 u02 = new U0(this.f187857t, continuation);
        u02.f187855r = interfaceC43172j;
        u02.f187856s = bool;
        return u02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187854q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f187855r;
            boolean zBooleanValue = ((Boolean) this.f187856s).booleanValue();
            W w12 = this.f187857t;
            if (zBooleanValue) {
                InterfaceC47842z interfaceC47842z = w12.f187865b;
                interfaceC43160iW = C43175k.C(new C31775b0(2, null), com.avito.android.arch.mvi.utils.h.a(C43175k.N(new Y(kotlinx.coroutines.rx3.y.a(interfaceC47842z.C(X81.i.class))), new Z(kotlinx.coroutines.rx3.y.a(interfaceC47842z.D()))), C31773a0.f187954l));
            } else {
                interfaceC43160iW = C43175k.w();
            }
            w12.getClass();
            C43152f0 c43152f0D = W.d(interfaceC43160iW, "typing events");
            this.f187854q = 1;
            if (C43175k.u(this, c43152f0D, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
