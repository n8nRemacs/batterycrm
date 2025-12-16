package io.ktor.utils.io;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ByteChannelSequential.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "", "size", "Lio/ktor/utils/io/core/x;", "<anonymous>", "(I)Lio/ktor/utils/io/core/x;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase$readUTF8LineTo$2", f = "ByteChannelSequential.kt", i = {}, l = {721}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class A0 extends SuspendLambda implements Y41.p<Integer, Continuation<? super io.ktor.utils.io.core.x>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f400562q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f400563r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400564s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(AbstractC41660h0 abstractC41660h0, Continuation<? super A0> continuation) {
        super(2, continuation);
        this.f400564s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A0 a02 = new A0(this.f400564s, continuation);
        a02.f400563r = ((Number) obj).intValue();
        return a02;
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super io.ktor.utils.io.core.x> continuation) {
        return ((A0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400562q;
        AbstractC41660h0 abstractC41660h0 = this.f400564s;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = this.f400563r;
            this.f400562q = 1;
            obj = abstractC41660h0.b(i13, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return abstractC41660h0.f400980d;
        }
        return null;
    }
}
