package com.avito.android.permissions;

import android.view.View;
import com.avito.android.R;
import com.avito.android.component.snackbar.d;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/snackbar/d;", "invoke", "()Lcom/avito/android/component/snackbar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.permissions.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33036f extends N implements Y41.a<com.avito.android.component.snackbar.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f215121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33036f(View view) {
        super(0);
        this.f215121l = view;
    }

    @Override // Y41.a
    public final com.avito.android.component.snackbar.d invoke() {
        com.avito.android.component.snackbar.d dVarA = d.a.a(com.avito.android.component.snackbar.d.f125235c, this.f215121l, R.string.loc_providers_unavailable_message, 0, null, 0, 1016);
        dVarA.f125236a.k(null, null);
        return dVarA;
    }
}
