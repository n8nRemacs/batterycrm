package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.gestures.C20495q0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: LongPressTextDragObserver.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21057u1 {

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.u1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlinx.coroutines.N0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f32245q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f32246r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ W1 f32247s;

        /* compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.u1$a$a, reason: collision with other inner class name */
        public static final class C1629a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f32248q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f32249r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ W1 f32250s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1629a(androidx.compose.ui.input.pointer.K k12, W1 w12, Continuation<? super C1629a> continuation) {
                super(2, continuation);
                this.f32249r = k12;
                this.f32250s = w12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new C1629a(this.f32249r, this.f32250s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1629a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f32248q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f32248q = 1;
                    Object objC = C20444d1.c(this.f32249r, new D1(this.f32250s, null), this);
                    if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objC = kotlin.G0.f406611a;
                    }
                    if (objC == coroutine_suspended) {
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

        /* compiled from: LongPressTextDragObserver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.u1$a$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f32251q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f32252r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ W1 f32253s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(androidx.compose.ui.input.pointer.K k12, W1 w12, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f32252r = k12;
                this.f32253s = w12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f32252r, this.f32253s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f32251q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f32251q = 1;
                    W1 w12 = this.f32253s;
                    Object objG = C20495q0.g(this.f32252r, new C21077z1(w12), new A1(w12), new B1(w12), new C1(w12), this);
                    if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objG = kotlin.G0.f406611a;
                    }
                    if (objG == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.input.pointer.K k12, W1 w12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32246r = k12;
            this.f32247s = w12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f32246r, this.f32247s, continuation);
            aVar.f32245q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlinx.coroutines.N0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f32245q;
            CoroutineStart coroutineStart = CoroutineStart.f410683e;
            androidx.compose.ui.input.pointer.K k12 = this.f32246r;
            W1 w12 = this.f32247s;
            C43259k.d(t12, null, coroutineStart, new C1629a(k12, w12, null), 1);
            return C43259k.d(t12, null, coroutineStart, new b(k12, w12, null), 1);
        }
    }

    @Y61.l
    public static final Object a(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k W1 w12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(k12, w12, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
