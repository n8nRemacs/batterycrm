package com.avito.android.advert.item;

import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$observeComplementaryBottomSheetState$1$1", f = "AdvertDetailsView.kt", i = {}, l = {899}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class B1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f71592q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f71593r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I1 f71594s;

    /* compiled from: AdvertDetailsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$observeComplementaryBottomSheetState$1$1$1", f = "AdvertDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f71595q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ I1 f71596r;

        /* compiled from: AdvertDetailsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsViewImpl$observeComplementaryBottomSheetState$1$1$1$1", f = "AdvertDetailsView.kt", i = {}, l = {901}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.item.B1$a$a, reason: collision with other inner class name */
        public static final class C2174a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f71597q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ I1 f71598r;

            /* compiled from: AdvertDetailsView.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/similars/m;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/advert/item/similars/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.advert.item.B1$a$a$a, reason: collision with other inner class name */
            public static final class C2175a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I1 f71599b;

                public C2175a(I1 i12) {
                    this.f71599b = i12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    com.avito.android.advert.item.similars.m mVar = (com.avito.android.advert.item.similars.m) obj;
                    I1 i12 = this.f71599b;
                    if (mVar != null) {
                        com.avito.android.advert.item.complementary.b bVar = i12.f71719j1;
                        if (bVar == null) {
                            bVar = i12.f71696c.get();
                            bVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC28158p1(0, i12));
                            i12.f71719j1 = bVar;
                        }
                        if (!bVar.isShowing()) {
                            com.avito.android.lib.util.g.a(bVar);
                        }
                        bVar.V(mVar);
                    } else {
                        com.avito.android.util.N0.a(i12.f71719j1);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2174a(I1 i12, Continuation<? super C2174a> continuation) {
                super(2, continuation);
                this.f71598r = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2174a(this.f71598r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C2174a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f71597q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    I1 i13 = this.f71598r;
                    InterfaceC43160i<com.avito.android.advert.item.similars.m> interfaceC43160iN = i13.f71681V.n();
                    C2175a c2175a = new C2175a(i13);
                    this.f71597q = 1;
                    if (interfaceC43160iN.collect(c2175a, this) == coroutine_suspended) {
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
        public a(I1 i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f71596r = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f71596r, continuation);
            aVar.f71595q = obj;
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
            C43259k.d((kotlinx.coroutines.T) this.f71595q, null, null, new C2174a(this.f71596r, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(InterfaceC22983P interfaceC22983P, I1 i12, Continuation<? super B1> continuation) {
        super(2, continuation);
        this.f71593r = interfaceC22983P;
        this.f71594s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B1(this.f71593r, this.f71594s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((B1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f71592q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22983P interfaceC22983P = this.f71593r;
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f71594s, null);
            this.f71592q = 1;
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
