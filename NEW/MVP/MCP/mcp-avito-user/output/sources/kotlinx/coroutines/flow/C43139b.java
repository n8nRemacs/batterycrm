package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43139b<T> extends C43151f<T> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<kotlinx.coroutines.channels.I0<? super T>, Continuation<? super kotlin.G0>, Object> f411331f;

    /* compiled from: Builders.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.b$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public kotlinx.coroutines.channels.I0 f411332q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411333r;

        /* renamed from: t, reason: collision with root package name */
        public int f411335t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411333r = obj;
            this.f411335t |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43139b.this.b(null, this);
        }
    }

    public /* synthetic */ C43139b(Y41.p pVar, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(pVar, (i13 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 4) != 0 ? -2 : i12, (i13 & 8) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C43151f, kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlinx.coroutines.channels.I0<? super T> r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C43139b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.C43139b.a) r0
            int r1 = r0.f411335t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411335t = r1
            goto L1a
        L13:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f411333r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411335t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.channels.I0 r5 = r0.f411332q
            kotlin.C42729a0.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r0.f411332q = r5
            r0.f411335t = r3
            java.lang.Object r6 = super.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.l()
            if (r5 == 0) goto L4c
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43139b.b(kotlinx.coroutines.channels.I0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.C43151f, kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new C43139b(this.f411331f, coroutineContext, i12, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43139b(@Y61.k Y41.p<? super kotlinx.coroutines.channels.I0<? super T>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i12, bufferOverflow);
        this.f411331f = pVar;
    }
}
