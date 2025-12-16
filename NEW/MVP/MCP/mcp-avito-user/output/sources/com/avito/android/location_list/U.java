package com.avito.android.location_list;

import android.location.Location;
import kotlin.Metadata;

/* compiled from: LocationListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class U<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f181894b;

    public U(a0 a0Var) {
        this.f181894b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Location location = (Location) obj;
        a0 a0Var = this.f181894b;
        a0Var.f181917q.f(location, null);
        String strValueOf = String.valueOf(location.getLatitude());
        String strValueOf2 = String.valueOf(location.getLongitude());
        k0 k0Var = a0Var.f181920t;
        if (k0Var != null) {
            k0Var.a();
        }
        a0Var.f181919s.b(a0Var.f181901a.c(strValueOf, strValueOf2).j0(a0Var.f181903c.e()).t0(new W(a0Var)));
    }
}
