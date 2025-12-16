package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import lr0.InterfaceC43821a;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/bxcontent/mvi/w0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$handleBeduinBindBlock$$inlined$loadCarouselItems$1", f = "BxContentInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.d0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29123d0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111768q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f111770s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43821a f111771t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29126a.b f111772u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C29126a.b f111773v;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/bxcontent/mvi/w0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.mvi.d0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<BxContentInternalAction> f111774b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43821a f111775c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C29126a.b f111776d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C29126a.b f111777e;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$handleBeduinBindBlock$$inlined$loadCarouselItems$1$1", f = "BxContentInteractor.kt", i = {}, l = {226, 230, 235}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.d0$a$a, reason: collision with other inner class name */
        public static final class C3297a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f111778q;

            /* renamed from: r, reason: collision with root package name */
            public int f111779r;

            public C3297a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f111778q = obj;
                this.f111779r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, InterfaceC43821a interfaceC43821a, C29126a.b bVar, C29126a.b bVar2) {
            this.f111775c = interfaceC43821a;
            this.f111776d = bVar;
            this.f111777e = bVar2;
            this.f111774b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.avito.android.bxcontent.mvi.C29123d0.a.C3297a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.bxcontent.mvi.d0$a$a r0 = (com.avito.android.bxcontent.mvi.C29123d0.a.C3297a) r0
                int r1 = r0.f111779r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f111779r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.d0$a$a r0 = new com.avito.android.bxcontent.mvi.d0$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f111778q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f111779r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L38
                if (r2 == r5) goto L34
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                goto L34
            L2c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L34:
                kotlin.C42729a0.b(r10)
                goto Lac
            L38:
                kotlin.C42729a0.b(r10)
                com.avito.android.util.P2 r9 = (com.avito.android.util.P2) r9
                boolean r10 = r9 instanceof com.avito.android.util.P2.b
                com.avito.android.bxcontent.mvi.entity.a$b r2 = r8.f111777e
                r6 = 0
                kotlinx.coroutines.flow.j<com.avito.android.bxcontent.mvi.entity.BxContentInternalAction> r7 = r8.f111774b
                if (r10 == 0) goto L88
                com.avito.android.util.P2$b r9 = (com.avito.android.util.P2.b) r9
                T r10 = r9.f318720a
                com.avito.android.carousel_items.domain.g r10 = (com.avito.android.carousel_items.domain.g) r10
                java.util.ArrayList r10 = r10.f115285a
                boolean r10 = com.avito.android.util.O2.a(r10)
                if (r10 == 0) goto L76
                T r9 = r9.f318720a
                com.avito.android.carousel_items.domain.g r9 = (com.avito.android.carousel_items.domain.g) r9
                java.util.ArrayList r10 = r9.f115285a
                com.avito.android.deep_linking.links.DeepLink r9 = r9.f115286b
                lr0.a r2 = r8.f111775c
                com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem r9 = r2.y0(r10, r9)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock r10 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock
                com.avito.android.bxcontent.mvi.entity.a$b r2 = r8.f111776d
                com.avito.android.bxcontent.mvi.entity.a$b r9 = com.avito.android.bxcontent.mvi.entity.C29126a.b.a(r2, r9)
                r10.<init>(r9)
                r0.f111779r = r5
                java.lang.Object r9 = r7.emit(r10, r0)
                if (r9 != r1) goto Lac
                return r1
            L76:
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock r9 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock
                com.avito.android.bxcontent.mvi.entity.a$b r10 = com.avito.android.bxcontent.mvi.entity.C29126a.b.a(r2, r6)
                r9.<init>(r10)
                r0.f111779r = r4
                java.lang.Object r9 = r7.emit(r9, r0)
                if (r9 != r1) goto Lac
                return r1
            L88:
                boolean r10 = r9 instanceof com.avito.android.util.P2.a
                if (r10 == 0) goto La7
                com.avito.android.util.V2 r9 = com.avito.android.util.V2.f318762a
                java.lang.String r10 = "BxContentInteractor"
                java.lang.String r4 = "Error loading itemsCarouselWidget"
                r9.d(r10, r4)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock r9 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock
                com.avito.android.bxcontent.mvi.entity.a$b r10 = com.avito.android.bxcontent.mvi.entity.C29126a.b.a(r2, r6)
                r9.<init>(r10)
                r0.f111779r = r3
                java.lang.Object r9 = r7.emit(r9, r0)
                if (r9 != r1) goto Lac
                return r1
            La7:
                com.avito.android.util.P2$c r10 = com.avito.android.util.P2.c.f318721a
                kotlin.jvm.internal.L.f(r9, r10)
            Lac:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29123d0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29123d0(InterfaceC43160i interfaceC43160i, Continuation continuation, InterfaceC43821a interfaceC43821a, C29126a.b bVar, C29126a.b bVar2) {
        super(2, continuation);
        this.f111770s = interfaceC43160i;
        this.f111771t = interfaceC43821a;
        this.f111772u = bVar;
        this.f111773v = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29123d0 c29123d0 = new C29123d0(this.f111770s, continuation, this.f111771t, this.f111772u, this.f111773v);
        c29123d0.f111769r = obj;
        return c29123d0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29123d0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111768q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f111769r, this.f111771t, this.f111772u, this.f111773v);
            this.f111768q = 1;
            if (((AbstractC43168f) this.f111770s).collect(aVar, this) == coroutine_suspended) {
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
