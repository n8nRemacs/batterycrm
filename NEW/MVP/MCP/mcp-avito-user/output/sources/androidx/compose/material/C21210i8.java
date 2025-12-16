package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/i8;", "Landroidx/compose/foundation/gestures/Y0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21210i8 implements androidx.compose.foundation.gestures.Y0 {

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {1282}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.i8$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f33651q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f33653s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f33654t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33653s = mutatePriority;
            this.f33654t = (SuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C21210i8.this.new a(this.f33653s, this.f33654t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f33651q;
            C21210i8 c21210i8 = C21210i8.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                c21210i8.getClass();
                throw null;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            c21210i8.getClass();
            throw null;
        }
    }

    @Override // androidx.compose.foundation.gestures.Y0
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.O0, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(mutatePriority, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
