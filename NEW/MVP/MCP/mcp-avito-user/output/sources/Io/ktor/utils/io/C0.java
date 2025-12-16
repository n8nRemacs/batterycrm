package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequential.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", i = {0, 0, 0, 0}, l = {780, 781}, m = "writeAvailableSuspend", n = {"this", "src", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class C0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public AbstractC41660h0 f400572q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400573r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC41660h0 f400574s;

    /* renamed from: t, reason: collision with root package name */
    public int f400575t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(AbstractC41660h0 abstractC41660h0, Continuation<? super C0> continuation) {
        super(continuation);
        this.f400574s = abstractC41660h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C0 c02;
        this.f400573r = obj;
        this.f400575t |= BeduinInputModel.MIN_TEXT_VERSION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AbstractC41660h0.f400973h;
        AbstractC41660h0 abstractC41660h0 = this.f400574s;
        abstractC41660h0.getClass();
        int i12 = this.f400575t;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            this.f400575t = i12 - BeduinInputModel.MIN_TEXT_VERSION;
            c02 = this;
        } else {
            c02 = new C0(abstractC41660h0, this);
        }
        Object objBoxInt = c02.f400573r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c02.f400575t;
        if (i13 == 0) {
            C42729a0.b(objBoxInt);
            c02.f400572q = abstractC41660h0;
            c02.f400575t = 1;
            if (abstractC41660h0.P(1, c02) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(objBoxInt);
                return objBoxInt;
            }
            abstractC41660h0 = c02.f400572q;
            C42729a0.b(objBoxInt);
        }
        c02.f400572q = null;
        c02.f400575t = 2;
        abstractC41660h0.getClass();
        objBoxInt = Boxing.boxInt(0);
        if (objBoxInt == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objBoxInt;
    }
}
