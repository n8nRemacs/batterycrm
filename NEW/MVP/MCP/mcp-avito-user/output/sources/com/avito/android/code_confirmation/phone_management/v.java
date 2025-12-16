package com.avito.android.code_confirmation.phone_management;

import android.view.View;
import com.avito.android.R;
import com.avito.android.code_confirmation.code_confirmation.CodeAlreadyConfirmedException;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PhoneManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f119705b;

    public v(w wVar) {
        this.f119705b = wVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<Action> actions;
        Action action;
        Throwable th2 = (Throwable) obj;
        w wVar = this.f119705b;
        wVar.getClass();
        if (th2 instanceof CodeAlreadyConfirmedException) {
            wVar.b(((CodeAlreadyConfirmedException) th2).f119395b.f119575b);
            return;
        }
        if (!(th2 instanceof ApiException)) {
            E e12 = wVar.f119713h;
            if (e12 != null) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                View view = e12.f119652b;
                com.avito.android.component.toast.c.b(cVar, view, com.avito.android.printable_text.b.f(view.getContext().getString(R.string.unknown_server_error)), null, null, null, null, 0, null, null, false, false, null, null, 4094);
                return;
            }
            return;
        }
        ApiError apiError = ((ApiException) th2).f318522b;
        if (!(apiError instanceof ApiError.ErrorDialog)) {
            com.avito.android.error.z.g(apiError, new p(wVar), new q(wVar), null, null, null, 28);
            return;
        }
        UserDialog userDialog = ((ApiError.ErrorDialog) apiError).getUserDialog();
        List<Action> actions2 = userDialog.getActions();
        InterfaceC30274a interfaceC30274a = wVar.f119710e;
        if (actions2 == null || (actions = userDialog.getActions()) == null || !(!actions.isEmpty())) {
            interfaceC30274a.d(userDialog.getMessage(), userDialog.getTitle()).n(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c);
            return;
        }
        List<Action> actions3 = userDialog.getActions();
        if (actions3 == null || (action = (Action) C42745f0.E(actions3)) == null) {
            return;
        }
        interfaceC30274a.b(userDialog.getMessage(), userDialog.getTitle(), action.getTitle(), true).n(new r(action, wVar), s.f119702b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
