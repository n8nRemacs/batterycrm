package com.avito.android.login_suggests_impl;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.login_suggests_impl.adapter.suggest.SuggestItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/login_suggests_impl/adapter/suggest/SuggestItem;", "it", "Lcom/avito/android/login_suggests_impl/Suggest;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f182945b;

    public q(t tVar) {
        this.f182945b = tVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        t tVar = this.f182945b;
        ScreenPerformanceTracker.a.d(tVar.f182953f, null, null, null, null, 15);
        ScreenPerformanceTracker screenPerformanceTracker = tVar.f182953f;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (T t12 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new SuggestItem(i12, (Suggest) t12));
            i12 = i13;
        }
        return arrayList;
    }
}
