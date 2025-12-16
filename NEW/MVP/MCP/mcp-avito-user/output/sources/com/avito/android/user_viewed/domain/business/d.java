package com.avito.android.user_viewed.domain.business;

import Y41.p;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import com.avito.android.user_viewed.domain.model.UserViewedData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: UserViewedCommonInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/advert/viewed/persistance/a;", "items", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_viewed/domain/model/UserViewedData;", "<anonymous>", "(Ljava/util/List;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.domain.business.UserViewedCommonInteractorImpl$observe$2$1", f = "UserViewedCommonInteractor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<List<? extends com.avito.android.advert.viewed.persistance.a>, Continuation<? super TypedResult<UserViewedData>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318336q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f318337r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f318338s;

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/d", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Long.valueOf(((UserViewedAdvert) t13).f318372f), Long.valueOf(((UserViewedAdvert) t12).f318372f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f318338s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f318338s, continuation);
        dVar.f318337r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(List<? extends com.avito.android.advert.viewed.persistance.a> list, Continuation<? super TypedResult<UserViewedData>> continuation) {
        return ((d) create(list, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318336q;
        f fVar = this.f318338s;
        if (i12 == 0) {
            C42729a0.b(obj);
            List list = (List) this.f318337r;
            if (list.isEmpty()) {
                return new TypedResult.Success(new UserViewedData(null, null, 3, null));
            }
            k kVar = fVar.f318343b;
            this.f318336q = 1;
            obj = kVar.a(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        UserViewedData userViewedData = (UserViewedData) ((TypedResult.Success) typedResult).getResult();
        com.avito.android.favorite.h hVar = fVar.f318344c;
        List<UserViewedAdvert> list2 = userViewedData.f318385b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserViewedAdvert) it.next()).f318368b);
        }
        Map<String, Boolean> mapF = hVar.f(arrayList);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (UserViewedAdvert userViewedAdvertA : list2) {
            Boolean bool = mapF.get(userViewedAdvertA.f318368b);
            if (bool != null) {
                userViewedAdvertA = UserViewedAdvert.a(userViewedAdvertA, bool.booleanValue());
            }
            arrayList2.add(userViewedAdvertA);
        }
        return new TypedResult.Success(new UserViewedData(C42745f0.B0(arrayList2, new a()), userViewedData.f318386c));
    }
}
