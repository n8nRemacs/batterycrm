package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadCarouselItems$$inlined$transform$1", f = "BxContentInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.w0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29228w0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.mvi.w0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadCarouselItems$$inlined$transform$1$1", f = "BxContentInteractor.kt", i = {}, l = {226, 228, 234}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.w0$a$a, reason: collision with other inner class name */
        public static final class C3312a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f112616q;

            /* renamed from: r, reason: collision with root package name */
            public int f112617r;

            public C3312a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f112616q = obj;
                this.f112617r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.bxcontent.mvi.C29228w0.a.C3312a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.bxcontent.mvi.w0$a$a r0 = (com.avito.android.bxcontent.mvi.C29228w0.a.C3312a) r0
                int r1 = r0.f112617r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f112617r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.w0$a$a r0 = new com.avito.android.bxcontent.mvi.w0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f112616q
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r0.f112617r
                if (r0 == 0) goto L3c
                r5 = 1
                if (r0 == r5) goto L36
                r5 = 2
                if (r0 == r5) goto L36
                r5 = 3
                if (r0 != r5) goto L2e
                kotlin.C42729a0.b(r6)
                goto L39
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L36:
                kotlin.C42729a0.b(r6)
            L39:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L3c:
                kotlin.C42729a0.b(r6)
                com.avito.android.util.P2 r5 = (com.avito.android.util.P2) r5
                boolean r5 = r5 instanceof com.avito.android.util.P2.b
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29228w0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        throw null;
    }
}
