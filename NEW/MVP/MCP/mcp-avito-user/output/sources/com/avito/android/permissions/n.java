package com.avito.android.permissions;

import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.SnackBarCallbackType;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/SnackBarCallbackType;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/SnackBarCallbackType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33035e f215130b;

    public n(C33035e c33035e) {
        this.f215130b = c33035e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC33034d.c cVar;
        SnackBarCallbackType snackBarCallbackType = (SnackBarCallbackType) obj;
        SnackBarCallbackType snackBarCallbackType2 = SnackBarCallbackType.f318736b;
        C33035e c33035e = this.f215130b;
        if (snackBarCallbackType == snackBarCallbackType2 && (cVar = c33035e.f215117d) != null) {
            cVar.N0();
        }
        if (snackBarCallbackType == SnackBarCallbackType.f318737c) {
            InterfaceC42726C<com.avito.android.component.snackbar.d> interfaceC42726C = c33035e.f215118e;
            if (interfaceC42726C == null) {
                interfaceC42726C = null;
            }
            interfaceC42726C.getValue().a();
        }
    }
}
