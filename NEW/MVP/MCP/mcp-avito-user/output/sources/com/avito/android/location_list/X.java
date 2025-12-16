package com.avito.android.location_list;

import com.avito.android.remote.model.Location;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: LocationListPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class X<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f181897b;

    public X(a0 a0Var) {
        this.f181897b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String id2;
        P2 p22 = (P2) obj;
        a0 a0Var = this.f181897b;
        Location location = a0Var.f181912l;
        if (location == null || (id2 = location.getId()) == null) {
            id2 = "stub";
        }
        a0.n(a0Var, p22, new C31518l(id2, a0Var.f181908h, null, false, 8, null));
    }
}
