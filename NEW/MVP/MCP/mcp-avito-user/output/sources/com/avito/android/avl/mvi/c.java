package com.avito.android.avl.mvi;

import Mg.InterfaceC14486a;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.advertising.CommercialUnavailableItem;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import zg.f;

/* compiled from: AvlPlayerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/advertising/CommercialLoadingItem;", "<name for destructuring parameter 0>", "Lkotlinx/coroutines/flow/i;", "Lzg/f$h;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$loadAds$3", f = "AvlPlayerActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<Q<? extends Integer, ? extends CommercialLoadingItem>, Continuation<? super InterfaceC43160i<? extends f.h>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f98191q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f98192r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f98193s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f98194t;

    /* compiled from: AvlPlayerActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lzg/f$h;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$loadAds$3$2", f = "AvlPlayerActor.kt", i = {0}, l = {156}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super f.h>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f98195q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Throwable f98196r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n f98197s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CommercialLoadingItem f98198t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, CommercialLoadingItem commercialLoadingItem, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f98197s = nVar;
            this.f98198t = commercialLoadingItem;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super f.h> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = new a(this.f98197s, this.f98198t, continuation);
            aVar.f98196r = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f98195q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Throwable th3 = this.f98196r;
                n nVar = this.f98197s;
                InterfaceC14486a interfaceC14486a = nVar.f98239b;
                CommercialUnavailableItem commercialUnavailableItem = new CommercialUnavailableItem(this.f98198t.f86897b.f86885b);
                this.f98196r = th3;
                this.f98195q = 1;
                if (interfaceC14486a.b(nVar.f98240c, commercialUnavailableItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th2 = th3;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.f98196r;
                C42729a0.b(obj);
            }
            V2.f318762a.c("AvlPlayerActor", "loadAds error=" + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<f.h> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f98199b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f98200c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f98201b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f98202c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$loadAds$3$invokeSuspend$$inlined$map$1$2", f = "AvlPlayerActor.kt", i = {0}, l = {220, 219}, m = "emit", n = {"it"}, s = {"L$1"})
            /* renamed from: com.avito.android.avl.mvi.c$b$a$a, reason: collision with other inner class name */
            public static final class C2946a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f98203q;

                /* renamed from: r, reason: collision with root package name */
                public int f98204r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f98205s;

                /* renamed from: u, reason: collision with root package name */
                public CommercialBanner f98207u;

                public C2946a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f98203q = obj;
                    this.f98204r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, n nVar) {
                this.f98201b = interfaceC43172j;
                this.f98202c = nVar;
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
                    boolean r0 = r9 instanceof com.avito.android.avl.mvi.c.b.a.C2946a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.android.avl.mvi.c$b$a$a r0 = (com.avito.android.avl.mvi.c.b.a.C2946a) r0
                    int r1 = r0.f98204r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f98204r = r1
                    goto L18
                L13:
                    com.avito.android.avl.mvi.c$b$a$a r0 = new com.avito.android.avl.mvi.c$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f98203q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f98204r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r9)
                    goto L6e
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    com.avito.android.advertising.CommercialBanner r8 = r0.f98207u
                    kotlinx.coroutines.flow.j r2 = r0.f98205s
                    kotlin.C42729a0.b(r9)
                    goto L5b
                L3c:
                    kotlin.C42729a0.b(r9)
                    com.avito.android.advertising.CommercialBanner r8 = (com.avito.android.advertising.CommercialBanner) r8
                    com.avito.android.avl.mvi.n r9 = r7.f98202c
                    Mg.a r2 = r9.f98239b
                    com.avito.android.advertising.CommercialItem r5 = com.avito.android.advertising.g.b(r8)
                    kotlinx.coroutines.flow.j r6 = r7.f98201b
                    r0.f98205s = r6
                    r0.f98207u = r8
                    r0.f98204r = r4
                    java.lang.String r9 = r9.f98240c
                    java.lang.Object r9 = r2.b(r9, r5, r0)
                    if (r9 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                L5b:
                    zg.f$h r9 = new zg.f$h
                    r9.<init>(r8)
                    r8 = 0
                    r0.f98205s = r8
                    r0.f98207u = r8
                    r0.f98204r = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L6e
                    return r1
                L6e:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avl.mvi.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, n nVar) {
            this.f98199b = interfaceC43160i;
            this.f98200c = nVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super f.h> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f98199b).collect(new a(interfaceC43172j, this.f98200c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, long j12, int i12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f98192r = nVar;
        this.f98193s = j12;
        this.f98194t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f98192r, this.f98193s, this.f98194t, continuation);
        cVar.f98191q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends Integer, ? extends CommercialLoadingItem> q12, Continuation<? super InterfaceC43160i<? extends f.h>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f98191q;
        int iIntValue = ((Number) q12.f406619b).intValue();
        CommercialLoadingItem commercialLoadingItem = (CommercialLoadingItem) q12.f406620c;
        n nVar = this.f98192r;
        return new C43152f0(new b(y.a(nVar.f98242e.c(commercialLoadingItem.f86897b, this.f98193s, Boxing.boxInt(this.f98194t), Boxing.boxInt(iIntValue))), nVar), new a(nVar, commercialLoadingItem, null));
    }
}
