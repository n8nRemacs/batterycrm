package com.avito.android.mortgage.sign.motions;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.C;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.v;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DragModifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {

    /* compiled from: DragModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<C, G0> f203750b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<C, G0> f203751c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<C, G0> f203752d;

        /* compiled from: DragModifier.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.sign.motions.DragModifierKt$dragMotionEvents$4$1", f = "DragModifier.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.mortgage.sign.motions.j$a$a, reason: collision with other inner class name */
        public static final class C6073a extends SuspendLambda implements p<K, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f203753q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f203754r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l<C, G0> f203755s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l<C, G0> f203756t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ l<C, G0> f203757u;

            /* compiled from: DragModifier.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.sign.motions.DragModifierKt$dragMotionEvents$4$1$1", f = "DragModifier.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.sign.motions.j$a$a$a, reason: collision with other inner class name */
            public static final class C6074a extends RestrictedSuspendLambda implements p<InterfaceC22325c, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f203758q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f203759r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l<C, G0> f203760s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l<C, G0> f203761t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ l<C, G0> f203762u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C6074a(l<? super C, G0> lVar, l<? super C, G0> lVar2, l<? super C, G0> lVar3, Continuation<? super C6074a> continuation) {
                    super(2, continuation);
                    this.f203760s = lVar;
                    this.f203761t = lVar2;
                    this.f203762u = lVar3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    C6074a c6074a = new C6074a(this.f203760s, this.f203761t, this.f203762u, continuation);
                    c6074a.f203759r = obj;
                    return c6074a;
                }

                @Override // Y41.p
                public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
                    return ((C6074a) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f203758q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC22325c interfaceC22325c = (InterfaceC22325c) this.f203759r;
                        this.f203758q = 1;
                        if (j.a(interfaceC22325c, this.f203760s, this.f203761t, this.f203762u, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6073a(l<? super C, G0> lVar, l<? super C, G0> lVar2, l<? super C, G0> lVar3, Continuation<? super C6073a> continuation) {
                super(2, continuation);
                this.f203755s = lVar;
                this.f203756t = lVar2;
                this.f203757u = lVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                C6073a c6073a = new C6073a(this.f203755s, this.f203756t, this.f203757u, continuation);
                c6073a.f203754r = obj;
                return c6073a;
            }

            @Override // Y41.p
            public final Object invoke(K k12, Continuation<? super G0> continuation) {
                return ((C6073a) create(k12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f203753q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    K k12 = (K) this.f203754r;
                    C6074a c6074a = new C6074a(this.f203755s, this.f203756t, this.f203757u, null);
                    this.f203753q = 1;
                    if (k12.N0(c6074a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super C, G0> lVar, l<? super C, G0> lVar2, l<? super C, G0> lVar3) {
            this.f203750b = lVar;
            this.f203751c = lVar2;
            this.f203752d = lVar3;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        @Y61.l
        public final Object invoke(@k K k12, @k Continuation<? super G0> continuation) {
            Object objD = C20444d1.d(k12, new C6073a(this.f203750b, this.f203751c, this.f203752d, null), continuation);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009f -> B:25:0x00a2). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r7, @Y61.k Y41.l r8, @Y61.k Y41.l r9, @Y61.k Y41.l r10, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.sign.motions.j.a(androidx.compose.ui.input.pointer.c, Y41.l, Y41.l, Y41.l, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @k
    public static final v b(@k v vVar, @k l<? super C, G0> lVar, @k l<? super C, G0> lVar2, @k l<? super C, G0> lVar3) {
        return Z.e(vVar, G0.f406611a, new a(lVar, lVar2, lVar3));
    }
}
