package com.avito.android.sales_items;

import com.avito.android.remote.model.FavoriteSalesItemsCount;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lk0.InterfaceC43786a;
import mk0.C44092a;

/* compiled from: FavoriteSalesCounterLoader.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sales_items/k;", "Lcom/avito/android/sales_items/j;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43786a> f258236a;

    /* compiled from: FavoriteSalesCounterLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/FavoriteSalesItemsCount;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sales_items.FavoriteSalesCounterLoaderImpl$loadCount$1", f = "FavoriteSalesCounterLoader.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FavoriteSalesItemsCount>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258237q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f258238r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f258238r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FavoriteSalesItemsCount> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f258237q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f258238r;
                InterfaceC43786a interfaceC43786a = k.this.f258236a.get();
                this.f258238r = interfaceC43172j;
                this.f258237q = 1;
                obj = interfaceC43786a.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f258238r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                C44092a c44092a = (C44092a) ((TypedResult.Success) typedResult).getResult();
                mk0.b result = c44092a.getResult();
                String salesId = result != null ? result.getSalesId() : null;
                mk0.b result2 = c44092a.getResult();
                FavoriteSalesItemsCount favoriteSalesItemsCount = new FavoriteSalesItemsCount(salesId, result2 != null ? (int) result2.getCount() : 0);
                this.f258238r = null;
                this.f258237q = 2;
                if (interfaceC43172j.emit(favoriteSalesItemsCount, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                C35936s.a(error.getError(), error.getCause());
                FavoriteSalesItemsCount favoriteSalesItemsCountEmpty = FavoriteSalesItemsCount.INSTANCE.empty();
                this.f258238r = null;
                this.f258237q = 3;
                if (interfaceC43172j.emit(favoriteSalesItemsCountEmpty, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k h31.e<InterfaceC43786a> eVar) {
        this.f258236a = eVar;
    }

    @Override // com.avito.android.sales_items.j
    @Y61.k
    public final InterfaceC43160i<FavoriteSalesItemsCount> a() {
        return C43175k.G(new a(null));
    }
}
