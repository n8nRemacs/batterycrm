package com.avito.android.location_list;

import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Location;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: LocationListPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class W<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f181896b;

    public W(a0 a0Var) {
        this.f181896b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        k0 k0Var;
        P2 p22 = (P2) obj;
        a0 a0Var = this.f181896b;
        a0Var.getClass();
        if (!(p22 instanceof P2.b)) {
            if (!(p22 instanceof P2.a)) {
                kotlin.jvm.internal.L.f(p22, P2.c.f318721a);
                return;
            }
            if ((((P2.a) p22).f318719a instanceof ApiError.NetworkIOError) && (k0Var = a0Var.f181920t) != null) {
                k0Var.f182061h.a("");
                D6.w(k0Var.f182055b.findViewById(R.id.content));
            }
            k0 k0Var2 = a0Var.f181920t;
            if (k0Var2 != null) {
                k0Var2.a();
                return;
            }
            return;
        }
        k0 k0Var3 = a0Var.f181920t;
        if (k0Var3 != null) {
            k0Var3.a();
        }
        Location location = (Location) ((P2.b) p22).f318720a;
        k0 k0Var4 = a0Var.f181920t;
        if (k0Var4 != null) {
            k0Var4.a();
        }
        LocationListFragment locationListFragment = a0Var.f181921u;
        if (locationListFragment != null) {
            T t12 = locationListFragment.f181879p0;
            if (t12 == null) {
                t12 = null;
            }
            LocationConfirmDialog locationConfirmDialog = new LocationConfirmDialog();
            C35966w1.a(locationConfirmDialog, -1, new C31507a(location));
            locationConfirmDialog.f181875h0 = t12;
            locationConfirmDialog.show(locationListFragment.getChildFragmentManager(), "tag_dialog_location");
        }
    }
}
