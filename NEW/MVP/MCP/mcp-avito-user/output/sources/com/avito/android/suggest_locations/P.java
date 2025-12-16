package com.avito.android.suggest_locations;

import android.content.res.Resources;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.List;
import kotlin.Metadata;
import uF.d;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LuF/d;", "result", "Lkotlin/G0;", "accept", "(LuF/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292119b;

    public P(T t12) {
        this.f292119b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        d0 d0Var;
        uF.d dVar = (uF.d) obj;
        boolean z12 = dVar instanceof d.c;
        T t12 = this.f292119b;
        if (z12) {
            ScreenPerformanceTracker.a.d(t12.f292181n, null, null, null, null, 15);
            ScreenPerformanceTracker screenPerformanceTracker = t12.f292181n;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            List<AddressSuggestion> listA = ((d.c) dVar).a();
            t12.f292189v = listA;
            d0 d0Var2 = t12.f292182o;
            if (d0Var2 != null) {
                d0Var2.e(listA);
            }
            if (listA.isEmpty() && (d0Var = t12.f292182o) != null) {
                d0Var.a();
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
            return;
        }
        if (dVar instanceof d.b) {
            ScreenPerformanceTracker screenPerformanceTracker2 = t12.f292181n;
            Throwable th2 = ((d.b) dVar).f439868a;
            if (th2 == null) {
                th2 = new Throwable("network error stub");
            }
            ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, new J.a(th2), null, 11);
            d0 d0Var3 = t12.f292182o;
            if (d0Var3 != null) {
                d0Var3.c();
                return;
            }
            return;
        }
        if (dVar instanceof d.a) {
            ScreenPerformanceTracker screenPerformanceTracker3 = t12.f292181n;
            Throwable th3 = ((d.a) dVar).f439867b;
            if (th3 == null) {
                th3 = new Throwable("error stub");
            }
            ScreenPerformanceTracker.a.d(screenPerformanceTracker3, null, null, new J.a(th3), null, 11);
            d0 d0Var4 = t12.f292182o;
            if (d0Var4 != null) {
                d0Var4.b();
            }
        }
    }
}
