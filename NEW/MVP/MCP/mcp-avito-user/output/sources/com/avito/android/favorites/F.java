package com.avito.android.favorites;

import com.avito.android.util.A4;
import com.avito.android.util.Y5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import qu.C47445a;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lqu/a;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class F<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f156215b;

    public F(A a12) {
        this.f156215b = a12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        C47445a c47445a = (C47445a) q12.f406619b;
        List list = (List) q12.f406620c;
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.core.I.q(C42784z0.f406748b);
        }
        A a12 = this.f156215b;
        ZC.c cVar = a12.f156182a;
        A4 a42 = A4.f318516a;
        List listK = C42745f0.k(list);
        a42.getClass();
        return Y5.a(cVar.e(A4.f("ids", listK), c47445a.f429466a, c47445a.f429467b)).S().r(new D(a12, list)).i(new E(a12)).u(new com.avito.android.analytics.clickstream.I(13));
    }
}
