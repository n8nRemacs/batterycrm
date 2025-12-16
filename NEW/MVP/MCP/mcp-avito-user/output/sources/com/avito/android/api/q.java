package com.avito.android.api;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserDialog f91340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f91341m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f91342n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f91343o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(UserDialog userDialog, r rVar, androidx.appcompat.app.m mVar, Y41.l<? super DeepLink, G0> lVar) {
        super(2);
        this.f91340l = userDialog;
        this.f91341m = rVar;
        this.f91342n = mVar;
        this.f91343o = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        Action action;
        Action action2;
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        UserDialog userDialog = this.f91340l;
        bVar2.setTitle(userDialog.getTitle());
        bVar2.setSubtitle(userDialog.getMessage());
        bVar2.setCancelable(userDialog.getCancelable());
        bVar2.setButtonsOrientation(1);
        List<Action> actions = userDialog.getActions();
        Y41.l<DeepLink, G0> lVar = this.f91343o;
        if (actions != null && (action2 = (Action) C42745f0.K(0, actions)) != null) {
            bVar2.L3(action2.getTitle(), new o(dialogInterface2, this.f91341m, this.f91342n, action2, lVar));
        }
        List<Action> actions2 = userDialog.getActions();
        if (actions2 != null && (action = (Action) C42745f0.K(1, actions2)) != null) {
            bVar2.M3(action.getTitle(), new p(dialogInterface2, this.f91341m, this.f91342n, action, lVar));
        }
        return G0.f406611a;
    }
}
