package com.avito.android.messenger.channels.mvi.header_feature;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeEmployeeModeChanges$$inlined$transform$1", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31760l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FY.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187562q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187563r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f187564s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f187565t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.l$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<FY.b> f187566b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C f187567c;

        public a(InterfaceC43172j interfaceC43172j, C c12) {
            this.f187567c = c12;
            this.f187566b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
            this.f187567c.f187470k.e(false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31760l(InterfaceC43160i interfaceC43160i, Continuation continuation, C c12) {
        super(2, continuation);
        this.f187564s = interfaceC43160i;
        this.f187565t = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31760l c31760l = new C31760l(this.f187564s, continuation, this.f187565t);
        c31760l.f187563r = obj;
        return c31760l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FY.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31760l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187562q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f187563r, this.f187565t);
            this.f187562q = 1;
            if (this.f187564s.collect(aVar, this) == coroutine_suspended) {
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
