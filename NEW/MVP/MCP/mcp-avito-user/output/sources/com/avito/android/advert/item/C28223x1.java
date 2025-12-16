package com.avito.android.advert.item;

import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import k4.InterfaceC42497a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1", f = "AdvertDetailsView.kt", i = {}, l = {802}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.x1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28223x1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80743q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f80744r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I1 f80745s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsWithMeta f80746t;

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1$1", f = "AdvertDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.x1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f80747q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ I1 f80748r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsWithMeta f80749s;

        /* compiled from: AdvertDetailsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1$1$1", f = "AdvertDetailsView.kt", i = {}, l = {813}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.item.x1$a$a, reason: collision with other inner class name */
        public static final class C2393a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f80750q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ I1 f80751r;

            /* compiled from: AdvertDetailsView.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1$1$1$1", f = "AdvertDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert.item.x1$a$a$a, reason: collision with other inner class name */
            public static final class C2394a extends SuspendLambda implements Y41.p<List<? extends PersistableSpannedItem>, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f80752q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ I1 f80753r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2394a(I1 i12, Continuation<? super C2394a> continuation) {
                    super(2, continuation);
                    this.f80753r = i12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C2394a c2394a = new C2394a(this.f80753r, continuation);
                    c2394a.f80752q = obj;
                    return c2394a;
                }

                @Override // Y41.p
                public final Object invoke(List<? extends PersistableSpannedItem> list, Continuation<? super kotlin.G0> continuation) {
                    return ((C2394a) create(list, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f80753r.f71691a0.accept(new InterfaceC42497a.l(AdvertDetailsBlockIdKt.COMPLEMENTARY_ITEMS_BLOCK, (List) this.f80752q));
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2393a(I1 i12, Continuation<? super C2393a> continuation) {
                super(2, continuation);
                this.f80751r = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2393a(this.f80751r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C2393a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f80750q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    I1 i13 = this.f80751r;
                    C43197r1 c43197r1 = new C43197r1(new C2394a(i13, null), i13.f71681V.getF80229r());
                    this.f80750q = 1;
                    if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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

        /* compiled from: AdvertDetailsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1$1$2", f = "AdvertDetailsView.kt", i = {}, l = {840}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.item.x1$a$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f80754q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ I1 f80755r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AdvertDetailsWithMeta f80756s;

            /* compiled from: AdvertDetailsView.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/commercials/a;", AdFormat.BANNER, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/commercials/a;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$initializeBeduin$1$1$1$2$1", f = "AdvertDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert.item.x1$a$b$a, reason: collision with other inner class name */
            public static final class C2395a extends SuspendLambda implements Y41.p<com.avito.android.advert.item.commercials.a, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f80757q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertDetailsWithMeta f80758r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ I1 f80759s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2395a(I1 i12, AdvertDetailsWithMeta advertDetailsWithMeta, Continuation continuation) {
                    super(2, continuation);
                    this.f80758r = advertDetailsWithMeta;
                    this.f80759s = i12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C2395a c2395a = new C2395a(this.f80759s, this.f80758r, continuation);
                    c2395a.f80757q = obj;
                    return c2395a;
                }

                @Override // Y41.p
                public final Object invoke(com.avito.android.advert.item.commercials.a aVar, Continuation<? super kotlin.G0> continuation) {
                    return ((C2395a) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    AdvertSerpCommercialBanner advertSerpCommercialBanner;
                    AdvertSerpCommercialBanner advertSerpCommercialBanner2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    com.avito.android.advert.item.commercials.a aVar = (com.avito.android.advert.item.commercials.a) this.f80757q;
                    if (this.f80758r.f82645b.getAdvertisingDisabled()) {
                        return kotlin.G0.f406611a;
                    }
                    com.avito.android.serp.adapter.l1 commercialSerpItem = null;
                    com.avito.android.serp.adapter.l1 commercialSerpItem2 = (aVar == null || (advertSerpCommercialBanner2 = aVar.f74323a) == null) ? null : advertSerpCommercialBanner2.getCommercialSerpItem();
                    I1 i12 = this.f80759s;
                    i12.f71691a0.accept(new InterfaceC42497a.l(AdvertDetailsBlockIdKt.COMMERCIALS_BANNER_BLOCK, C42745f0.V(commercialSerpItem2)));
                    if (aVar != null && (advertSerpCommercialBanner = aVar.f74324b) != null) {
                        commercialSerpItem = advertSerpCommercialBanner.getCommercialSerpItem();
                    }
                    i12.f71691a0.accept(new InterfaceC42497a.l(AdvertDetailsBlockIdKt.COMMERCIALS_PROFILE_PROMO_GALLERY_BLOCK, C42745f0.V(commercialSerpItem)));
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(I1 i12, AdvertDetailsWithMeta advertDetailsWithMeta, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f80755r = i12;
                this.f80756s = advertDetailsWithMeta;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f80755r, this.f80756s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f80754q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    I1 i13 = this.f80755r;
                    C43197r1 c43197r1 = new C43197r1(new C2395a(i13, this.f80756s, null), i13.f71685X.getF74337f());
                    this.f80754q = 1;
                    if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
        public a(I1 i12, AdvertDetailsWithMeta advertDetailsWithMeta, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f80748r = i12;
            this.f80749s = advertDetailsWithMeta;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f80748r, this.f80749s, continuation);
            aVar.f80747q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f80747q;
            I1 i12 = this.f80748r;
            C43259k.d(t12, null, null, new C2393a(i12, null), 3);
            C43259k.d(t12, null, null, new b(i12, this.f80749s, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28223x1(InterfaceC22983P interfaceC22983P, I1 i12, AdvertDetailsWithMeta advertDetailsWithMeta, Continuation<? super C28223x1> continuation) {
        super(2, continuation);
        this.f80744r = interfaceC22983P;
        this.f80745s = i12;
        this.f80746t = advertDetailsWithMeta;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28223x1(this.f80744r, this.f80745s, this.f80746t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C28223x1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80743q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22983P interfaceC22983P = this.f80744r;
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f80745s, this.f80746t, null);
            this.f80743q = 1;
            if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
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
