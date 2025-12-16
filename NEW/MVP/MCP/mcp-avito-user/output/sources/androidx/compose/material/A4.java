package androidx.compose.material;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class A4 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32338q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32339r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f32340s;

    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f32341q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f32342r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f32343s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<kotlin.G0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32343s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f32343s, continuation);
            aVar.f32342r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f32341q
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L22
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.C42729a0.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f32342r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r5)
                goto L37
            L22:
                kotlin.C42729a0.b(r5)
                java.lang.Object r5 = r4.f32342r
                r1 = r5
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                r4.f32342r = r1
                r4.f32341q = r2
                java.lang.Object r5 = androidx.compose.foundation.gestures.C20445d2.c(r1, r4, r2)
                if (r5 != r0) goto L37
                return r0
            L37:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                r2 = 0
                r4.f32342r = r2
                r4.f32341q = r3
                java.lang.Object r5 = androidx.compose.foundation.gestures.C20445d2.l(r1, r5, r4)
                if (r5 != r0) goto L45
                return r0
            L45:
                androidx.compose.ui.input.pointer.C r5 = (androidx.compose.ui.input.pointer.C) r5
                if (r5 == 0) goto L4e
                Y41.a<kotlin.G0> r5 = r4.f32343s
                r5.invoke()
            L4e:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.A4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(Y41.a<kotlin.G0> aVar, Continuation<? super A4> continuation) {
        super(2, continuation);
        this.f32340s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        A4 a42 = new A4(this.f32340s, continuation);
        a42.f32339r = obj;
        return a42;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((A4) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32338q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f32339r;
            a aVar = new a(this.f32340s, null);
            this.f32338q = 1;
            if (C20444d1.c(k12, aVar, this) == coroutine_suspended) {
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
