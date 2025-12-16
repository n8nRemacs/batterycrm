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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import lr0.InterfaceC43821a;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/bxcontent/mvi/w0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadCarouselItems$lambda$7$$inlined$loadCarouselItems$1", f = "BxContentInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.y0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29232y0 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112623q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112624r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f112625s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43821a f112626t;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/avito/android/bxcontent/mvi/w0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.mvi.y0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<BxContentInternalAction> f112627b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43821a f112628c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadCarouselItems$lambda$7$$inlined$loadCarouselItems$1$1", f = "BxContentInteractor.kt", i = {}, l = {226, 229, 233}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.y0$a$a, reason: collision with other inner class name */
        public static final class C3313a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f112629q;

            /* renamed from: r, reason: collision with root package name */
            public int f112630r;

            public C3313a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f112629q = obj;
                this.f112630r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, InterfaceC43821a interfaceC43821a) {
            this.f112628c = interfaceC43821a;
            this.f112627b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.bxcontent.mvi.C29232y0.a.C3313a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.bxcontent.mvi.y0$a$a r0 = (com.avito.android.bxcontent.mvi.C29232y0.a.C3313a) r0
                int r1 = r0.f112630r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f112630r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.y0$a$a r0 = new com.avito.android.bxcontent.mvi.y0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f112629q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f112630r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L38
                if (r2 == r5) goto L34
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                goto L34
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                kotlin.C42729a0.b(r9)
                goto La3
            L38:
                kotlin.C42729a0.b(r9)
                com.avito.android.util.P2 r8 = (com.avito.android.util.P2) r8
                boolean r9 = r8 instanceof com.avito.android.util.P2.b
                lr0.a r2 = r7.f112628c
                kotlinx.coroutines.flow.j<com.avito.android.bxcontent.mvi.entity.BxContentInternalAction> r6 = r7.f112627b
                if (r9 == 0) goto L7f
                com.avito.android.util.P2$b r8 = (com.avito.android.util.P2.b) r8
                T r9 = r8.f318720a
                com.avito.android.carousel_items.domain.g r9 = (com.avito.android.carousel_items.domain.g) r9
                java.util.ArrayList r9 = r9.f115285a
                boolean r9 = com.avito.android.util.O2.a(r9)
                if (r9 == 0) goto L6d
                T r8 = r8.f318720a
                com.avito.android.carousel_items.domain.g r8 = (com.avito.android.carousel_items.domain.g) r8
                java.util.ArrayList r9 = r8.f115285a
                com.avito.android.deep_linking.links.DeepLink r8 = r8.f115286b
                com.avito.android.serp.adapter.carousel_widget.CarouselWidgetItem r8 = r2.y0(r9, r8)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateItem r9 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateItem
                r9.<init>(r8)
                r0.f112630r = r5
                java.lang.Object r8 = r6.emit(r9, r0)
                if (r8 != r1) goto La3
                return r1
            L6d:
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId r8 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId
                java.lang.String r9 = r2.getF223441b()
                r8.<init>(r9)
                r0.f112630r = r4
                java.lang.Object r8 = r6.emit(r8, r0)
                if (r8 != r1) goto La3
                return r1
            L7f:
                boolean r9 = r8 instanceof com.avito.android.util.P2.a
                if (r9 == 0) goto L9e
                com.avito.android.util.V2 r8 = com.avito.android.util.V2.f318762a
                java.lang.String r9 = "BxContentInteractor"
                java.lang.String r4 = "Error loading itemsCarouselWidget"
                r8.d(r9, r4)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId r8 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId
                java.lang.String r9 = r2.getF223441b()
                r8.<init>(r9)
                r0.f112630r = r3
                java.lang.Object r8 = r6.emit(r8, r0)
                if (r8 != r1) goto La3
                return r1
            L9e:
                com.avito.android.util.P2$c r9 = com.avito.android.util.P2.c.f318721a
                kotlin.jvm.internal.L.f(r8, r9)
            La3:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29232y0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29232y0(InterfaceC43160i interfaceC43160i, Continuation continuation, InterfaceC43821a interfaceC43821a) {
        super(2, continuation);
        this.f112625s = interfaceC43160i;
        this.f112626t = interfaceC43821a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29232y0 c29232y0 = new C29232y0(this.f112625s, continuation, this.f112626t);
        c29232y0.f112624r = obj;
        return c29232y0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29232y0) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f112623q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f112624r, this.f112626t);
            this.f112623q = 1;
            if (((AbstractC43168f) this.f112625s).collect(aVar, this) == coroutine_suspended) {
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
