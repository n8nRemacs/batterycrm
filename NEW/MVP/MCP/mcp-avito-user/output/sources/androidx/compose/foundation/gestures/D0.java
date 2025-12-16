package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {510, 513, 521}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class D0 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27212q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27213r;

    /* compiled from: DragGestureDetector.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, kotlin.G0> {
        public a() {
            throw null;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12) {
            Float.intBitsToFloat((int) (C22341t.f(c12, false) & 4294967295L));
            throw null;
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "", "over", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.e f27214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.e eVar) {
            super(2);
            this.f27214l = eVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, Float f12) {
            float fFloatValue = f12.floatValue();
            c12.a();
            this.f27214l.f406839b = fFloatValue;
            return kotlin.G0.f406611a;
        }
    }

    public D0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f27212q
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 == r4) goto L2f
            if (r1 == r2) goto L27
            r0 = 3
            if (r1 != r0) goto L1f
            kotlin.C42729a0.b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L1e
            throw r3
        L1e:
            throw r3
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            java.lang.Object r0 = r10.f27213r
            androidx.compose.ui.input.pointer.c r0 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r0
            kotlin.C42729a0.b(r11)
            goto L67
        L2f:
            java.lang.Object r1 = r10.f27213r
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r11)
        L36:
            r4 = r1
            goto L4b
        L38:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f27213r
            r1 = r11
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            r10.f27213r = r1
            r10.f27212q = r4
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20445d2.c(r1, r10, r2)
            if (r11 != r0) goto L36
            return r0
        L4b:
            androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11
            kotlin.jvm.internal.l0$e r1 = new kotlin.jvm.internal.l0$e
            r1.<init>()
            long r5 = r11.f40116a
            androidx.compose.foundation.gestures.D0$b r8 = new androidx.compose.foundation.gestures.D0$b
            r8.<init>(r1)
            r10.f27213r = r4
            r10.f27212q = r2
            int r7 = r11.f40124i
            r9 = r10
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.f(r4, r5, r7, r8, r9)
            if (r11 != r0) goto L67
            return r0
        L67:
            androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11
            if (r11 != 0) goto L6e
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        L6e:
            long r0 = r11.f40118c
            l0.g.a(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.D0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
