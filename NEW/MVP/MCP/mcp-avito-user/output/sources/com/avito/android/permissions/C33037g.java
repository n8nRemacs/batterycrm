package com.avito.android.permissions;

import android.view.View;
import com.avito.android.R;
import com.avito.android.component.snackbar.d;
import com.avito.android.util.ViewOnClickListenerC35977x5;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/snackbar/d;", "invoke", "()Lcom/avito/android/component/snackbar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.permissions.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33037g extends N implements Y41.a<com.avito.android.component.snackbar.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f215122l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C33035e f215123m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33037g(View view, C33035e c33035e) {
        super(0);
        this.f215122l = view;
        this.f215123m = c33035e;
    }

    @Override // Y41.a
    public final com.avito.android.component.snackbar.d invoke() {
        com.avito.android.component.snackbar.d dVarA = d.a.a(com.avito.android.component.snackbar.d.f125235c, this.f215122l, R.string.location_permission_required, 0, null, 0, 1016);
        C33035e c33035e = this.f215123m;
        ViewOnClickListenerC35977x5 viewOnClickListenerC35977x5 = c33035e.f215115b;
        Snackbar snackbar = dVarA.f125236a;
        snackbar.k(snackbar.f357284h.getText(R.string.permission_settings), viewOnClickListenerC35977x5);
        com.avito.android.component.snackbar.h.b(dVarA);
        ViewOnClickListenerC35977x5 viewOnClickListenerC35977x52 = c33035e.f215115b;
        if (viewOnClickListenerC35977x52 == null) {
            snackbar.getClass();
        } else {
            if (snackbar.f357297u == null) {
                snackbar.f357297u = new ArrayList();
            }
            snackbar.f357297u.add(viewOnClickListenerC35977x52);
        }
        com.avito.android.component.snackbar.h.a(dVarA).setMaxLines(3);
        return dVarA;
    }
}
