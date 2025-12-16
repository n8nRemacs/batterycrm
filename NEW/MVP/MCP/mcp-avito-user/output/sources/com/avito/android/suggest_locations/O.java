package com.avito.android.suggest_locations;

import android.content.res.Resources;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.model.AddressSuggestionV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import tF.AbstractC48544a;

/* compiled from: SuggestLocationsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LtF/a;", "result", "Lkotlin/G0;", "accept", "(LtF/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class O<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292116b;

    public O(T t12) {
        this.f292116b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        d0 d0Var;
        AbstractC48544a abstractC48544a = (AbstractC48544a) obj;
        boolean z12 = abstractC48544a instanceof AbstractC48544a.C12665a;
        T t12 = this.f292116b;
        if (z12) {
            ScreenPerformanceTracker screenPerformanceTracker = t12.f292181n;
            Throwable th2 = ((AbstractC48544a.C12665a) abstractC48544a).f439205b;
            if (th2 == null) {
                th2 = new Throwable("error stub");
            }
            ScreenPerformanceTracker.a.d(screenPerformanceTracker, null, null, new J.a(th2), null, 11);
            d0 d0Var2 = t12.f292182o;
            if (d0Var2 != null) {
                d0Var2.b();
                return;
            }
            return;
        }
        if (abstractC48544a instanceof AbstractC48544a.b) {
            ScreenPerformanceTracker screenPerformanceTracker2 = t12.f292181n;
            Throwable th3 = ((AbstractC48544a.b) abstractC48544a).f439206a;
            if (th3 == null) {
                th3 = new Throwable("network error stub");
            }
            ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, new J.a(th3), null, 11);
            d0 d0Var3 = t12.f292182o;
            if (d0Var3 != null) {
                d0Var3.c();
                return;
            }
            return;
        }
        if (abstractC48544a instanceof AbstractC48544a.c) {
            ScreenPerformanceTracker.a.d(t12.f292181n, null, null, null, null, 15);
            ScreenPerformanceTracker screenPerformanceTracker3 = t12.f292181n;
            screenPerformanceTracker3.m(screenPerformanceTracker3.getF90716d());
            List<AddressSuggestionV2> listA = ((AbstractC48544a.c) abstractC48544a).a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((AddressSuggestionV2) it.next()).d());
            }
            t12.f292189v = arrayList;
            d0 d0Var4 = t12.f292182o;
            if (d0Var4 != null) {
                d0Var4.e(arrayList);
            }
            if (arrayList.isEmpty() && (d0Var = t12.f292182o) != null) {
                d0Var.a();
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker3, null, null, null, 7);
        }
    }
}
