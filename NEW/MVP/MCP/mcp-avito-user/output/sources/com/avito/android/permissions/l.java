package com.avito.android.permissions;

import android.view.View;
import com.avito.android.permissions.InterfaceC33034d;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33035e f215128b;

    public l(C33035e c33035e) {
        this.f215128b = c33035e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C33035e c33035e = this.f215128b;
        if (zBooleanValue) {
            InterfaceC33034d.c cVar = c33035e.f215117d;
            if (cVar != null) {
                cVar.d(null);
                return;
            }
            return;
        }
        View view = c33035e.f215119f;
        if (view != null) {
            InterfaceC42726C<com.avito.android.component.snackbar.d> interfaceC42726CC = C42727D.c(new C33037g(view, c33035e));
            c33035e.f215118e = interfaceC42726CC;
            interfaceC42726CC.getValue().b();
        }
    }
}
