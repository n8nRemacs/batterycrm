package com.avito.android.favorite_sellers;

import FC.a;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.favorite_sellers.InterfaceC30574a;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: FavoriteSellersView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$2", f = "FavoriteSellersView.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.favorite_sellers.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30599x extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f156162q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f156163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H f156164s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d2<InterfaceC30574a> f156165t;

    /* compiled from: FavoriteSellersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$2$1", f = "FavoriteSellersView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.favorite_sellers.x$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f156166q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ H f156167r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d2<InterfaceC30574a> f156168s;

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$2$1$1", f = "FavoriteSellersView.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.x$a$a, reason: collision with other inner class name */
        public static final class C4576a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156169q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ H f156170r;

            /* compiled from: FavoriteSellersView.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.favorite_sellers.x$a$a$a, reason: collision with other inner class name */
            public static final class C4577a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f156171b;

                public C4577a(H h12) {
                    this.f156171b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    if (((Number) obj).intValue() > 2) {
                        this.f156171b.f155430d.accept(a.j.f4608a);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4576a(H h12, Continuation<? super C4576a> continuation) {
                super(2, continuation);
                this.f156170r = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4576a(this.f156170r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((C4576a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156169q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    H h12 = this.f156170r;
                    InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(h12.f155437k.getF123751f());
                    C4577a c4577a = new C4577a(h12);
                    this.f156169q = 1;
                    if (((AbstractC43168f) interfaceC43160iA).collect(c4577a, this) == coroutine_suspended) {
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

        /* compiled from: FavoriteSellersView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.favorite_sellers.FavoriteSellersMviViewImpl$2$2$1$2", f = "FavoriteSellersView.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.favorite_sellers.x$a$b */
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f156172q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d2<InterfaceC30574a> f156173r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ H f156174s;

            /* compiled from: FavoriteSellersView.kt */
            @s0
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/a;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/favorite_sellers/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.favorite_sellers.x$a$b$a, reason: collision with other inner class name */
            public static final class C4578a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ H f156175b;

                public C4578a(H h12) {
                    this.f156175b = h12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC30574a interfaceC30574a = (InterfaceC30574a) obj;
                    boolean z12 = interfaceC30574a instanceof InterfaceC30574a.C4553a;
                    H h12 = this.f156175b;
                    if (z12) {
                        Bundle bundle = new Bundle();
                        InterfaceC30574a.C4553a c4553a = (InterfaceC30574a.C4553a) interfaceC30574a;
                        bundle.putString("title", c4553a.f155490a.f268428d);
                        AdvertItem advertItem = c4553a.f155490a;
                        bundle.putString("key_category_id", advertItem.f268420a0);
                        bundle.putLong("click_time", SystemClock.elapsedRealtime());
                        String str = advertItem.f268440i;
                        if (str != null) {
                            bundle.putString("price", str);
                        }
                        String str2 = advertItem.f268446l;
                        if (str2 != null) {
                            bundle.putString("old_price", str2);
                        }
                        DimmedImage dimmedImage = advertItem.f268368A;
                        if (dimmedImage != null) {
                            bundle.putParcelable("image", dimmedImage);
                        }
                        h12.f155430d.accept(new a.c(advertItem.f268396O, bundle));
                    } else if (interfaceC30574a instanceof InterfaceC30574a.b) {
                        InterfaceC30574a.b bVar = (InterfaceC30574a.b) interfaceC30574a;
                        h12.f155435i.Ld(bVar.f155492a, null);
                        h12.f155436j.c(bVar.f155492a);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(H h12, Continuation continuation, d2 d2Var) {
                super(2, continuation);
                this.f156173r = d2Var;
                this.f156174s = h12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f156174s, continuation, this.f156173r);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f156172q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C4578a c4578a = new C4578a(this.f156174s);
                    this.f156172q = 1;
                    if (this.f156173r.collect(c4578a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h12, Continuation continuation, d2 d2Var) {
            super(2, continuation);
            this.f156167r = h12;
            this.f156168s = d2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f156167r, continuation, this.f156168s);
            aVar.f156166q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f156166q;
            H h12 = this.f156167r;
            C43259k.d(t12, null, null, new C4576a(h12, null), 3);
            C43259k.d(t12, null, null, new b(h12, null, this.f156168s), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30599x(InterfaceC22983P interfaceC22983P, H h12, d2<? extends InterfaceC30574a> d2Var, Continuation<? super C30599x> continuation) {
        super(2, continuation);
        this.f156163r = interfaceC22983P;
        this.f156164s = h12;
        this.f156165t = d2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C30599x(this.f156163r, this.f156164s, this.f156165t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C30599x) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f156162q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            a aVar = new a(this.f156164s, null, this.f156165t);
            this.f156162q = 1;
            if (C23056p0.b(this.f156163r, state, aVar, this) == coroutine_suspended) {
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
