package com.avito.android.passport.profile_switch;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UserDialog;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserDialog f213683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f213684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(UserDialog userDialog, j jVar) {
        super(2);
        this.f213683l = userDialog;
        this.f213684m = jVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        Action action;
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        UserDialog userDialog = this.f213683l;
        bVar2.setCancelable(userDialog.getCancelable());
        bVar2.setTitle(userDialog.getTitle());
        bVar2.setSubtitle(userDialog.getMessage());
        bVar2.setButtonsOrientation(1);
        bVar2.setCloseButtonVisible(userDialog.getCancelable());
        List<Action> actions = userDialog.getActions();
        j jVar = this.f213684m;
        if (actions != null && (action = (Action) C42745f0.G(actions)) != null) {
            bVar2.L3(action.getTitle(), new g(jVar, action, dialogInterface2));
        }
        bVar2.b(new h(jVar));
        return G0.f406611a;
    }
}
