package com.avito.android.geo_common.interactor;

import com.avito.android.geo_common.interactor.C30718d.a;
import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import mF.InterfaceC43955a;
import pF.InterfaceC46942a;
import rF.C47532a;
import rF.C47533b;
import rF.C47534c;

/* compiled from: LocationDirectionsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/interactor/d;", "Lcom/avito/android/geo_common/interactor/a;", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: com.avito.android.geo_common.interactor.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30718d implements InterfaceC30715a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC46942a> f159329a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43955a> f159330b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y1<List<Direction>> f159331c = p2.a(C42784z0.f406748b);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f159332d;

    /* compiled from: LocationDirectionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationDirectionsInteractorImpl$getDistricts$1$1", f = "LocationDirectionsInteractor.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.geo_common.interactor.d$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159333q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f159335s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ K<DistrictsWithRegions> f159336t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, K<DistrictsWithRegions> k12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f159335s = str;
            this.f159336t = k12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C30718d.this.new a(this.f159335s, this.f159336t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159333q;
            C30718d c30718d = C30718d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC46942a interfaceC46942a = c30718d.f159329a.get();
                long j12 = Long.parseLong(this.f159335s);
                this.f159333q = 1;
                obj = interfaceC46942a.a(j12, this);
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
            boolean z12 = typedResult instanceof TypedResult.Success;
            K<DistrictsWithRegions> k12 = this.f159336t;
            ArrayList arrayList = null;
            if (z12) {
                C47532a c47532a = (C47532a) ((TypedResult.Success) typedResult).getResult();
                c30718d.getClass();
                List<C47533b> listA = c47532a.a();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
                for (C47533b c47533b : listA) {
                    arrayList2.add(new District(String.valueOf(c47533b.getId()), c47533b.getName(), c47533b.getAltName(), Long.valueOf(c47533b.getId())));
                }
                List<C47534c> listB = c47532a.b();
                if (listB != null) {
                    List<C47534c> list = listB;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    for (C47534c c47534c : list) {
                        arrayList.add(new DistrictsWithRegions.DistrictRegion(c47534c.a(), c47534c.getFullName(), c47534c.getId(), c47534c.getShortName()));
                    }
                }
                Boolean shouldShowNewUI = c47532a.getShouldShowNewUI();
                k12.onSuccess(new DistrictsWithRegions(arrayList2, arrayList, (shouldShowNewUI != null ? shouldShowNewUI.booleanValue() : false) && arrayList != null));
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
                k12.onError(apiExceptionA);
                V2.f318762a.e("LocationDirectionsInteractor got error: " + apiExceptionA.getMessage(), null);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C30718d(@Y61.k R0 r02, @Y61.k h31.e<InterfaceC46942a> eVar, @Y61.k h31.e<InterfaceC43955a> eVar2) {
        this.f159329a = eVar;
        this.f159330b = eVar2;
        this.f159332d = U.a(r02.a());
    }

    @Override // com.avito.android.geo_common.interactor.InterfaceC30715a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DistrictsWithRegions> a(@Y61.k final String str) {
        return new C42006d(new M() { // from class: com.avito.android.geo_common.interactor.b
            @Override // io.reactivex.rxjava3.core.M
            public final void j(K k12) {
                C30718d c30718d = this.f159322b;
                C43259k.d(c30718d.f159332d, null, null, c30718d.new a(str, k12, null), 3);
            }
        }).F();
    }

    @Override // com.avito.android.geo_common.interactor.InterfaceC30715a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> b(@Y61.k String str) {
        return this.f159330b.get().b(str);
    }

    @Override // com.avito.android.geo_common.interactor.InterfaceC30715a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<Metro>> h(@Y61.k String str) {
        return this.f159330b.get().h(str);
    }

    @Override // com.avito.android.geo_common.interactor.InterfaceC30715a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C i(@Y61.k String str) {
        C43259k.d(this.f159332d, null, null, new C30717c(this, str, null), 3);
        return kotlinx.coroutines.rx3.y.b(this.f159331c);
    }
}
