package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.usecase.GetObjectItemsUseCase$invoke$$inlined$transform$1", f = "GetObjectItemsUseCase.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ObjectFillFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f240095q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f240096r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f240097s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f240098t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f240099u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ObjectFillFormInternalAction> f240100b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f240101c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f240102d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.usecase.GetObjectItemsUseCase$invoke$$inlined$transform$1$1", f = "GetObjectItemsUseCase.kt", i = {0, 0, 0}, l = {219, 220}, m = "emit", n = {"this", "items", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: com.avito.android.publish.screen.objects.domain.usecase.g$a$a, reason: collision with other inner class name */
        public static final class C7211a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f240103q;

            /* renamed from: r, reason: collision with root package name */
            public int f240104r;

            /* renamed from: t, reason: collision with root package name */
            public a f240106t;

            /* renamed from: u, reason: collision with root package name */
            public UV0.a f240107u;

            /* renamed from: v, reason: collision with root package name */
            public InterfaceC43172j f240108v;

            public C7211a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f240103q = obj;
                this.f240104r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, e eVar, AtomicBoolean atomicBoolean) {
            this.f240101c = eVar;
            this.f240102d = atomicBoolean;
            this.f240100b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
            /*
                r10 = this;
                r0 = 1
                boolean r1 = r12 instanceof com.avito.android.publish.screen.objects.domain.usecase.g.a.C7211a
                if (r1 == 0) goto L14
                r1 = r12
                com.avito.android.publish.screen.objects.domain.usecase.g$a$a r1 = (com.avito.android.publish.screen.objects.domain.usecase.g.a.C7211a) r1
                int r2 = r1.f240104r
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L14
                int r2 = r2 - r3
                r1.f240104r = r2
                goto L19
            L14:
                com.avito.android.publish.screen.objects.domain.usecase.g$a$a r1 = new com.avito.android.publish.screen.objects.domain.usecase.g$a$a
                r1.<init>(r12)
            L19:
                java.lang.Object r12 = r1.f240103q
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.f240104r
                r4 = 2
                if (r3 == 0) goto L3f
                if (r3 == r0) goto L35
                if (r3 != r4) goto L2d
                kotlin.C42729a0.b(r12)
                goto Lbe
            L2d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L35:
                kotlinx.coroutines.flow.j r11 = r1.f240108v
                UV0.a r3 = r1.f240107u
                com.avito.android.publish.screen.objects.domain.usecase.g$a r5 = r1.f240106t
                kotlin.C42729a0.b(r12)
                goto L5d
            L3f:
                kotlin.C42729a0.b(r12)
                r3 = r11
                UV0.a r3 = (UV0.a) r3
                com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$ItemsUpdate r11 = new com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$ItemsUpdate
                r11.<init>(r3)
                r1.f240106t = r10
                r1.f240107u = r3
                kotlinx.coroutines.flow.j<com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction> r12 = r10.f240100b
                r1.f240108v = r12
                r1.f240104r = r0
                java.lang.Object r11 = r12.emit(r11, r1)
                if (r11 != r2) goto L5b
                return r2
            L5b:
                r5 = r10
                r11 = r12
            L5d:
                com.avito.android.publish.screen.objects.domain.usecase.e r12 = r5.f240101c
                r6 = 0
                r1.f240106t = r6
                r1.f240107u = r6
                r1.f240108v = r6
                r1.f240104r = r4
                int r4 = com.avito.android.publish.screen.objects.domain.usecase.e.f240088b
                r12.getClass()
                UV0.b r12 = com.avito.konveyor.util.g.b(r3)
                java.util.Iterator r12 = r12.iterator()
                r3 = 0
                r4 = r3
            L77:
                boolean r7 = r12.hasNext()
                r8 = -1
                if (r7 == 0) goto L9b
                java.lang.Object r7 = r12.next()
                if (r4 < 0) goto L97
                com.avito.conveyor_item.a r7 = (com.avito.conveyor_item.a) r7
                boolean r9 = r7 instanceof com.avito.android.items.ItemWithState
                if (r9 == 0) goto L95
                com.avito.android.items.ItemWithState r7 = (com.avito.android.items.ItemWithState) r7
                com.avito.android.items.ItemWithState$State r7 = r7.getF173943c()
                boolean r7 = r7 instanceof com.avito.android.items.ItemWithState.State.Normal
                if (r7 != 0) goto L95
                goto L9c
            L95:
                int r4 = r4 + r0
                goto L77
            L97:
                kotlin.collections.C42745f0.H0()
                throw r6
            L9b:
                r4 = r8
            L9c:
                java.util.concurrent.atomic.AtomicBoolean r12 = r5.f240102d
                boolean r12 = r12.getAndSet(r3)
                if (r12 == 0) goto Lb9
                if (r4 == r8) goto Lb9
                com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$ScrollToItem r12 = new com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$ScrollToItem
                r12.<init>(r4)
                java.lang.Object r11 = r11.emit(r12, r1)
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r11 != r12) goto Lb6
                goto Lbb
            Lb6:
                kotlin.G0 r11 = kotlin.G0.f406611a
                goto Lbb
            Lb9:
                kotlin.G0 r11 = kotlin.G0.f406611a
            Lbb:
                if (r11 != r2) goto Lbe
                return r2
            Lbe:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.usecase.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC43160i interfaceC43160i, Continuation continuation, e eVar, AtomicBoolean atomicBoolean) {
        super(2, continuation);
        this.f240097s = interfaceC43160i;
        this.f240098t = eVar;
        this.f240099u = atomicBoolean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f240097s, continuation, this.f240098t, this.f240099u);
        gVar.f240096r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f240095q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f240096r, this.f240098t, this.f240099u);
            this.f240095q = 1;
            if (this.f240097s.collect(aVar, this) == coroutine_suspended) {
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
