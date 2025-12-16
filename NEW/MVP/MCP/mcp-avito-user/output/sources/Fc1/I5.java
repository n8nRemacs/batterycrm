package Fc1;

import Fc1.C13593d5;
import androidx.compose.foundation.gestures.C20445d2;
import java.util.ListIterator;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.slider.compose.componets.FeedbackSliderRulerKt$FeedbackSliderRuler$1$1", f = "FeedbackSliderRuler.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class I5 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5017q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D f5019s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C13593d5.b f5020t;

    @kotlin.jvm.internal.s0
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D f5021l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C13593d5.b f5022m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.snapshots.D d12, C13593d5.b bVar) {
            super(1);
            this.f5021l = d12;
            this.f5022m = bVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            ListIterator listIterator = this.f5021l.listIterator();
            while (listIterator.hasNext()) {
                P7 p72 = (P7) listIterator.next();
                p72.getClass();
                if (l0.g.g(j12) > p72.f5148a && l0.g.g(j12) <= p72.f5150c) {
                    this.f5022m.invoke(p72);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5(androidx.compose.runtime.snapshots.D d12, C13593d5.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f5019s = d12;
        this.f5020t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I5 i52 = new I5(this.f5019s, this.f5020t, continuation);
        i52.f5018r = obj;
        return i52;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((I5) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5017q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f5018r;
            a aVar = new a(this.f5019s, this.f5020t);
            this.f5017q = 1;
            if (C20445d2.g(k12, null, null, aVar, this, 7) == coroutine_suspended) {
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
