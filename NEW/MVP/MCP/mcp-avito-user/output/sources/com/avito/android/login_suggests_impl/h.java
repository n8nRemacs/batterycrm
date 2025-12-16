package com.avito.android.login_suggests_impl;

import com.avito.android.account.Z;
import com.avito.android.util.A4;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LoginSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/account/Z;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/login_suggests_impl/Suggest;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f182929b;

    public h(j jVar) {
        this.f182929b = jVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<Z> list = (List) obj;
        j jVar = this.f182929b;
        jVar.getClass();
        if (list.isEmpty()) {
            return I.q(C42784z0.f406748b);
        }
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        for (Z z12 : list) {
            dVar.put(z12.f68096a, z12);
        }
        kotlin.collections.builders.d dVarB = dVar.b();
        A4 a42 = A4.f318516a;
        Set setKeySet = dVarB.keySet();
        a42.getClass();
        return g1.a(jVar.f182932a.i(A4.g("hashUserIds", setKeySet))).r(new i(dVarB, jVar)).u(new com.avito.android.analytics.clickstream.I(26));
    }
}
