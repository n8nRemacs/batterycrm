package com.avito.android.sbc.create.mvi;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handleConfirmButtonClicked$$inlined$flowWithAccessToMutableStateFrom$1", f = "CreateDiscountDispatchActor.kt", i = {5}, l = {363, 368, 373, 378, 383, 388, 389, 394, Constants.MINIMAL_ERROR_STATUS_CODE}, m = "invokeSuspend", n = {"emit"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class N extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259461q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259462r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259463s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uo0.j f259464t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259465u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f259466v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f259467w;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N(com.avito.android.arch.mvi.utils.o oVar, Uo0.j jVar, Continuation continuation, C34469a c34469a, Integer num, Y41.q qVar) {
        super(2, continuation);
        this.f259463s = oVar;
        this.f259464t = jVar;
        this.f259465u = c34469a;
        this.f259466v = num;
        this.f259467w = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ?? r62 = this.f259467w;
        N n12 = new N(this.f259463s, this.f259464t, continuation, this.f259465u, this.f259466v, r62);
        n12.f259462r = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((N) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249  */
    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
