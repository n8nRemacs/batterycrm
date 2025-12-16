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
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$1", f = "CreateDiscountDispatchActor.kt", i = {0}, l = {344}, m = "invokeSuspend", n = {"$this$handle_u24lambda_u245"}, s = {"L$0"})
/* renamed from: com.avito.android.sbc.create.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34481g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259797q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259799s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.l f259800t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259801u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.g$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34481g(com.avito.android.arch.mvi.utils.o oVar, e.l lVar, Continuation continuation, C34469a c34469a) {
        super(2, continuation);
        this.f259799s = oVar;
        this.f259800t = lVar;
        this.f259801u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34481g c34481g = new C34481g(this.f259799s, this.f259800t, continuation, this.f259801u);
        c34481g.f259798r = obj;
        return c34481g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34481g) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x005c, B:19:0x0062, B:21:0x0078, B:26:0x00bc, B:30:0x00db, B:22:0x007d, B:24:0x008f, B:25:0x00b8, B:27:0x00c0, B:29:0x00c4, B:31:0x00e3, B:32:0x00e8), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x005c, B:19:0x0062, B:21:0x0078, B:26:0x00bc, B:30:0x00db, B:22:0x007d, B:24:0x008f, B:25:0x00b8, B:27:0x00c0, B:29:0x00c4, B:31:0x00e3, B:32:0x00e8), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.C34481g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
