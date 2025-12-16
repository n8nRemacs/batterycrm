package com.avito.android.sbc.create.mvi;

import Uo0.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handleUsingNewV3Api$$inlined$flowWithAccessToMutableStateFrom$1", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 1}, l = {344, 356}, m = "invokeSuspend", n = {"emit", "$this$handleUsingNewV3Api_u24lambda_u2410", "$this$handleUsingNewV3Api_u24lambda_u2410"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class Q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259484q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259486s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.k f259487t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259488u;

    /* renamed from: v, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259489v;

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
    public Q(com.avito.android.arch.mvi.utils.o oVar, e.k kVar, Continuation continuation, C34469a c34469a) {
        super(2, continuation);
        this.f259486s = oVar;
        this.f259487t = kVar;
        this.f259488u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Q q12 = new Q(this.f259486s, this.f259487t, continuation, this.f259488u);
        q12.f259485r = obj;
        return q12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((Q) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:14:0x002b, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:39:0x00b0, B:41:0x00b4, B:45:0x00d0, B:47:0x00d4, B:51:0x0104, B:52:0x0109), top: B:68:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:14:0x002b, B:32:0x0084, B:34:0x008a, B:36:0x0096, B:39:0x00b0, B:41:0x00b4, B:45:0x00d0, B:47:0x00d4, B:51:0x0104, B:52:0x0109), top: B:68:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.Q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
