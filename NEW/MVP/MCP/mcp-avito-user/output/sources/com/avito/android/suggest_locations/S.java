package com.avito.android.suggest_locations;

import android.content.res.Resources;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.suggest_locations.W;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/suggest_locations/W;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/suggest_locations/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class S<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292121b;

    public S(T t12) {
        this.f292121b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        W w12 = (W) obj;
        boolean z12 = w12 instanceof W.c;
        T t12 = this.f292121b;
        if (!z12) {
            if (w12 instanceof W.b) {
                ScreenPerformanceTracker.a.d(t12.f292181n, null, null, new J.a(((W.b) w12).f292206a), null, 11);
                d0 d0Var = t12.f292182o;
                if (d0Var != null) {
                    d0Var.c();
                    return;
                }
                return;
            }
            if (!(w12 instanceof W.a)) {
                boolean z13 = w12 instanceof W.d;
                return;
            }
            ScreenPerformanceTracker.a.d(t12.f292181n, null, null, new J.a(((W.a) w12).f292205a), null, 11);
            d0 d0Var2 = t12.f292182o;
            if (d0Var2 != null) {
                d0Var2.b();
                return;
            }
            return;
        }
        ScreenPerformanceTracker.a.d(t12.f292181n, null, null, null, null, 15);
        ScreenPerformanceTracker screenPerformanceTracker = t12.f292181n;
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        W.c cVar = (W.c) w12;
        ArrayList arrayList = cVar.f292207a;
        Iterator<T> it = arrayList.iterator();
        boolean z14 = false;
        SuggestLocationItem suggestLocationItem = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z14) {
                    break;
                }
            } else {
                T next = it.next();
                SuggestLocationItem suggestLocationItem2 = (SuggestLocationItem) next;
                if (suggestLocationItem2.f292216d == null) {
                    String name = suggestLocationItem2.f292215c.getName();
                    Locale locale = Locale.ROOT;
                    if (!name.toLowerCase(locale).equals(cVar.f292208b.toLowerCase(locale))) {
                        continue;
                    } else {
                        if (z14) {
                            break;
                        }
                        z14 = true;
                        suggestLocationItem = next;
                    }
                }
            }
        }
        suggestLocationItem = null;
        t12.f292187t = suggestLocationItem;
        t12.f292188u = arrayList;
        d0 d0Var3 = t12.f292182o;
        if (d0Var3 != null) {
            d0Var3.f(arrayList);
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }
}
