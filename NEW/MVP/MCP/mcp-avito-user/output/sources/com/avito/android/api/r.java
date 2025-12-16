package com.avito.android.api;

import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/api/r;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r {
    @Inject
    public r() {
    }

    public static final void a(r rVar, androidx.appcompat.app.m mVar, Action action, Y41.l lVar) {
        G0 g02;
        rVar.getClass();
        Action.Confirmation confirmation = action.getConfirmation();
        if (confirmation != null) {
            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, mVar, new q(new UserDialog(confirmation.getTitle(), confirmation.getDescription(), Collections.singletonList(new Action(confirmation.getOk(), action.getDeepLink(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null)), true), rVar, mVar, lVar)));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            ((c) lVar).invoke(action.getDeepLink());
        }
    }
}
