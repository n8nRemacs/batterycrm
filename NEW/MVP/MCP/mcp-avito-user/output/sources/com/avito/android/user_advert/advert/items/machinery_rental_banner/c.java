package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: MachineryRentalBannerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/c;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<HX.a> f309571a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f309572b;

    /* compiled from: MachineryRentalBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.items.machinery_rental_banner.MachineryRentalBannerInteractor$sendCloseBannerEvent$2", f = "MachineryRentalBannerInteractor.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f309573q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f309575s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f309575s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return c.this.new a(this.f309575s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f309573q;
            if (i12 == 0) {
                C42729a0.b(obj);
                HX.a aVar = c.this.f309571a.get();
                this.f309573q = 1;
                obj = aVar.b(this.f309575s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: MachineryRentalBannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.items.machinery_rental_banner.MachineryRentalBannerInteractor$setMachineryRentalStateEnabled$2", f = "MachineryRentalBannerInteractor.kt", i = {}, l = {20, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f309576q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f309577r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f309578s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f309579t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, c cVar, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f309577r = z12;
            this.f309578s = cVar;
            this.f309579t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f309577r, this.f309578s, this.f309579t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<Object>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f309576q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return (TypedResult) obj;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return (TypedResult) obj;
            }
            C42729a0.b(obj);
            boolean z12 = this.f309577r;
            String str = this.f309579t;
            c cVar = this.f309578s;
            if (z12) {
                HX.a aVar = cVar.f309571a.get();
                this.f309576q = 1;
                obj = aVar.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (TypedResult) obj;
            }
            HX.a aVar2 = cVar.f309571a.get();
            this.f309576q = 2;
            obj = aVar2.c(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (TypedResult) obj;
        }
    }

    @Inject
    public c(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f309571a = eVar;
        this.f309572b = r02;
    }

    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return C43259k.g(this.f309572b.a(), new a(str, null), continuation);
    }

    @Y61.l
    public final Object b(@Y61.k String str, boolean z12, @Y61.k Continuation continuation) {
        return C43259k.g(this.f309572b.a(), new b(z12, this, str, null), continuation);
    }
}
