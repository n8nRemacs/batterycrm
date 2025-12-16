package com.avito.android.comparison.data;

import Hq0.C14020b;
import Uq.InterfaceC15558a;
import Y61.k;
import Y61.l;
import com.avito.android.app.task.C28567j1;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.comparison.remote.model.FromPage;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.TypedResultKt;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.F;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;

/* compiled from: ComparisonRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/data/b;", "Lcom/avito/android/comparison/data/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comparison.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15558a f123831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f123832b = new LinkedHashMap();

    /* compiled from: ComparisonRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f123834c;

        public a(String str) {
            this.f123834c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                b.this.f123832b.put(this.f123834c, ((TypedResult.Success) typedResult).getResult());
            }
        }
    }

    /* compiled from: ComparisonRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LVq/d;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comparison.data.b$b, reason: collision with other inner class name */
    public static final class C3700b<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f123836c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f123837d;

        public C3700b(String str, String str2) {
            this.f123836c = str;
            this.f123837d = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return TypedResultKt.toTypedObservable(((TypedResult.Error) typedResult).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            b bVar = b.this;
            bVar.getClass();
            String str = this.f123836c;
            return new io.reactivex.rxjava3.internal.operators.mixed.a(new C41826q(new C28567j1(1, bVar, str, this.f123837d)), new F(new C14020b(7, bVar, str)));
        }
    }

    @Inject
    public b(@k InterfaceC15558a interfaceC15558a) {
        this.f123831a = interfaceC15558a;
    }

    @Override // com.avito.android.comparison.data.a
    @k
    public final z<TypedResult<ComparisonResponse>> a(@k String str, @k String str2, @l String str3) {
        FromPage[] fromPageArr = FromPage.f124197b;
        return this.f123831a.d(str, str2, "comparison", str3).F().T(new C3700b(str, str2), Integer.MAX_VALUE);
    }

    @Override // com.avito.android.comparison.data.a
    @k
    public final z<TypedResult<ComparisonResponse>> b(@k String str, @l String str2, boolean z12) {
        ComparisonResponse comparisonResponse = (ComparisonResponse) this.f123832b.get(str);
        return (comparisonResponse == null || z12) ? this.f123831a.c(str, str2).K(new a(str)) : z.c0(new TypedResult.Success(comparisonResponse));
    }
}
