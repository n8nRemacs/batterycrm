package com.avito.android.advert_collection.mvi;

import com.avito.android.account.E;
import com.avito.android.advert_collection.di.A;
import com.avito.android.advert_collection.i;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.H;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements com.avito.android.arch.mvi.b<AdvertCollectionInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection.i f81639a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f81641c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f81642d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f81643e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f81644f;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionBootstrap$produce$$inlined$flatMapLatest$1", f = "AdvertCollectionBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AdvertCollectionInternalAction>, G0, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81645q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f81646r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f81647s;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, G0 g02, Continuation<? super G0> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f81646r = interfaceC43172j;
            aVar.f81647s = g02;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81645q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f81646r;
                h hVar = h.this;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(i.a.a(hVar.f81639a, null, 3), hVar.f81639a.a());
                this.f81645q = 1;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionBootstrap$produce$$inlined$transform$1", f = "AdvertCollectionBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81649q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81650r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.l f81651s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h f81652t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<AdvertCollectionInternalAction> f81653b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f81654c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionBootstrap$produce$$inlined$transform$1$1", f = "AdvertCollectionBootstrap.kt", i = {0, 0, 0}, l = {219, 221}, m = "emit", n = {"this", "it", "$this$produce_u24lambda_u241"}, s = {"L$0", "L$1", "L$2"})
            /* renamed from: com.avito.android.advert_collection.mvi.h$b$a$a, reason: collision with other inner class name */
            public static final class C2418a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f81655q;

                /* renamed from: r, reason: collision with root package name */
                public int f81656r;

                /* renamed from: t, reason: collision with root package name */
                public a f81658t;

                /* renamed from: u, reason: collision with root package name */
                public AdvertCollectionInternalAction f81659u;

                /* renamed from: v, reason: collision with root package name */
                public InterfaceC43172j f81660v;

                public C2418a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f81655q = obj;
                    this.f81656r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, h hVar) {
                this.f81654c = hVar;
                this.f81653b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.avito.android.advert_collection.mvi.h.b.a.C2418a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.avito.android.advert_collection.mvi.h$b$a$a r0 = (com.avito.android.advert_collection.mvi.h.b.a.C2418a) r0
                    int r1 = r0.f81656r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f81656r = r1
                    goto L18
                L13:
                    com.avito.android.advert_collection.mvi.h$b$a$a r0 = new com.avito.android.advert_collection.mvi.h$b$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f81655q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f81656r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r11)
                    goto L94
                L2c:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L34:
                    kotlinx.coroutines.flow.j r10 = r0.f81660v
                    com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction r2 = r0.f81659u
                    com.avito.android.advert_collection.mvi.h$b$a r5 = r0.f81658t
                    kotlin.C42729a0.b(r11)
                    goto L56
                L3e:
                    kotlin.C42729a0.b(r11)
                    r2 = r10
                    com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction r2 = (com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction) r2
                    r0.f81658t = r9
                    r0.f81659u = r2
                    kotlinx.coroutines.flow.j<com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction> r10 = r9.f81653b
                    r0.f81660v = r10
                    r0.f81656r = r4
                    java.lang.Object r11 = r10.emit(r2, r0)
                    if (r11 != r1) goto L55
                    return r1
                L55:
                    r5 = r9
                L56:
                    boolean r11 = r2 instanceof com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction.LoadWidgets
                    if (r11 == 0) goto L94
                    com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$SaveAnalyticsInfo r11 = new com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$SaveAnalyticsInfo
                    com.avito.android.advert_collection.mvi.h r6 = r5.f81654c
                    com.avito.android.account.E r6 = r6.f81642d
                    java.lang.String r6 = r6.a()
                    com.avito.android.advert_collection.mvi.h r5 = r5.f81654c
                    com.avito.android.remote.H r7 = r5.f81641c
                    java.lang.String r7 = r7.getF253025a()
                    com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction$LoadWidgets r2 = (com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction.LoadWidgets) r2
                    com.avito.android.remote.model.FavoriteItemsWidgets r2 = r2.f81588b
                    com.avito.android.remote.model.CollectionInfo r2 = r2.getCollection()
                    r8 = 0
                    if (r2 == 0) goto L7e
                    boolean r2 = r2.isOwner()
                    if (r2 == 0) goto L7e
                    goto L7f
                L7e:
                    r4 = r8
                L7f:
                    java.lang.String r2 = r5.f81643e
                    r11.<init>(r6, r7, r4, r2)
                    r2 = 0
                    r0.f81658t = r2
                    r0.f81659u = r2
                    r0.f81660v = r2
                    r0.f81656r = r3
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L94
                    return r1
                L94:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_collection.mvi.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.flow.internal.l lVar, Continuation continuation, h hVar) {
            super(2, continuation);
            this.f81651s = lVar;
            this.f81652t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f81651s, continuation, this.f81652t);
            bVar.f81650r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81649q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f81650r, this.f81652t);
                this.f81649q = 1;
                if (this.f81651s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: AdvertCollectionBootstrap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionBootstrap$produce$1", f = "AdvertCollectionBootstrap.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super G0>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81661q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f81662r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = h.this.new c(continuation);
            cVar.f81662r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81661q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f81662r;
                h hVar = h.this;
                if (!hVar.f81640b && !hVar.f81644f) {
                    h.this.f81644f = true;
                    G0 g02 = G0.f406611a;
                    this.f81661q = 1;
                    if (interfaceC43172j.emit(g02, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Inject
    public h(@Y61.k com.avito.android.advert_collection.i iVar, boolean z12, @Y61.k H h12, @Y61.k E e12, @A @Y61.k String str) {
        this.f81639a = iVar;
        this.f81640b = z12;
        this.f81641c = h12;
        this.f81642d = e12;
        this.f81643e = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionInternalAction> a() {
        return C43175k.G(new b(C43175k.Y(C43175k.G(new c(null)), new a(null)), null, this));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
