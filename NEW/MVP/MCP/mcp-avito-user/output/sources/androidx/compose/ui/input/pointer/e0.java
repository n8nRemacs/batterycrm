package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.g0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {883, 884}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class e0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f40212q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f40213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0.a<Object> f40214s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j12, g0.a<Object> aVar, Continuation<? super e0> continuation) {
        super(2, continuation);
        this.f40213r = j12;
        this.f40214s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new e0(this.f40213r, this.f40214s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((e0) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f40212q
            r2 = 8
            long r4 = r10.f40213r
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L22
            if (r1 == r7) goto L1e
            if (r1 != r6) goto L16
            kotlin.C42729a0.b(r11)
            goto L39
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            kotlin.C42729a0.b(r11)
            goto L30
        L22:
            kotlin.C42729a0.b(r11)
            long r8 = r4 - r2
            r10.f40212q = r7
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r8, r10)
            if (r11 != r0) goto L30
            return r0
        L30:
            r10.f40212q = r6
            java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r2, r10)
            if (r11 != r0) goto L39
            return r0
        L39:
            androidx.compose.ui.input.pointer.g0$a<java.lang.Object> r11 = r10.f40214s
            kotlinx.coroutines.r r11 = r11.f40243d
            if (r11 == 0) goto L4e
            int r0 = kotlin.Z.f406624c
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r4)
            kotlin.Z$b r1 = new kotlin.Z$b
            r1.<init>(r0)
            r11.resumeWith(r1)
        L4e:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
