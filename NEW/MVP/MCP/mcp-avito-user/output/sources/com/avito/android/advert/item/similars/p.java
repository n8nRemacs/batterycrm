package com.avito.android.advert.item.similars;

import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParamsConverterKt;
import io.reactivex.rxjava3.core.z;
import java.util.Collections;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.D1;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ComplementaryInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.similars.ComplementaryInteractorImpl$getLocation$2", f = "ComplementaryInteractor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super Map<String, ? extends String>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80320q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f80321r;

    /* compiled from: ComplementaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.similars.ComplementaryInteractorImpl$getLocation$2$1", f = "ComplementaryInteractor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super Map<String, ? extends String>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f80322q;

        /* renamed from: r, reason: collision with root package name */
        public int f80323r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ q f80324s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f80324s = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f80324s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Map<String, ? extends String>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f80323r;
            if (i12 == 0) {
                C42729a0.b(obj);
                z zVarB = r.a.b(this.f80324s.f80328d, false, 3);
                this.f80322q = SearchParamsConverterKt.LOCATION_ID;
                this.f80323r = 1;
                obj = C43292o.c(zVarB, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = SearchParamsConverterKt.LOCATION_ID;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f80322q;
                C42729a0.b(obj);
            }
            return Collections.singletonMap(str, ((Location) obj).getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f80321r = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new p(this.f80321r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Map<String, ? extends String>> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80320q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f80321r, null);
                this.f80320q = 1;
                obj = D1.b(500L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return (Map) obj;
        } catch (Throwable unused) {
            return P0.c();
        }
    }
}
