package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: ByteChannelSequential.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/b2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/b2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2", f = "ByteChannelSequential.kt", i = {0}, l = {822}, m = "invokeSuspend", n = {"$this$readSuspendableSession"}, s = {"L$0"})
/* renamed from: io.ktor.utils.io.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41669k0 extends SuspendLambda implements Y41.p<b2, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f401178q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f401179r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f401180s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.g f401181t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f401182u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f401183v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f401184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41669k0(long j12, l0.g gVar, long j13, ByteBuffer byteBuffer, long j14, Continuation continuation) {
        super(2, continuation);
        this.f401180s = j12;
        this.f401181t = gVar;
        this.f401182u = j13;
        this.f401183v = byteBuffer;
        this.f401184w = j14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C41669k0 c41669k0 = new C41669k0(this.f401180s, this.f401181t, this.f401182u, this.f401183v, this.f401184w, continuation);
        c41669k0.f401179r = obj;
        return c41669k0;
    }

    @Override // Y41.p
    public final Object invoke(b2 b2Var, Continuation<? super kotlin.G0> continuation) {
        return ((C41669k0) create(b2Var, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        b2 b2Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401178q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b2 b2Var2 = (b2) this.f401179r;
            int iD2 = (int) kotlin.ranges.s.d(this.f401180s, 4088L);
            this.f401179r = b2Var2;
            this.f401178q = 1;
            if (b2Var2.b(iD2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            b2Var = b2Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b2Var = (b2) this.f401179r;
            C42729a0.b(obj);
        }
        io.ktor.utils.io.core.internal.b bVarA = b2Var.a(1);
        if (bVarA == null) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            bVarA = io.ktor.utils.io.core.internal.b.f400886o;
        }
        long j12 = bVarA.f400876c - bVarA.f400875b;
        if (j12 > 0) {
            long jMin = Math.min(j12, Math.min(this.f401182u, this.f401183v.limit() - this.f401184w));
            this.f401181t.f406841b = jMin;
            V31.e.c(bVarA.f400874a, this.f401183v, 0L, jMin, this.f401184w);
        }
        return kotlin.G0.f406611a;
    }
}
