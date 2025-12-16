package com.avito.android.dialog;

import android.app.Activity;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import io.reactivex.rxjava3.internal.operators.maybe.Y;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/dialog/n;", "Lcom/avito/android/dialog/a;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements InterfaceC30274a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f144789a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.dialog.a f144790b;

    @Inject
    public n(@Y61.k Activity activity, @Y61.k com.avito.android.lib.deprecated_design.dialog.a aVar) {
        this.f144789a = activity;
        this.f144790b = aVar;
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @InterfaceC42830m
    public final void a(@Y61.k String str, @Y61.k CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        this.f144790b.a(str, charSequence, charSequence2);
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final C41916j b(@Y61.k CharSequence charSequence, @Y61.l String str, @Y61.l String str2, boolean z12) {
        return e(str, charSequence, str2, z12 ? this.f144789a.getString(R.string.cancel) : null, z12);
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final io.reactivex.rxjava3.core.q<DeepLink> c(@Y61.k Action action) {
        Action.Confirmation confirmation = action.getConfirmation();
        return confirmation != null ? g(new UserDialog(confirmation.getTitle(), confirmation.getDescription(), Collections.singletonList(new Action(confirmation.getOk(), action.getDeepLink(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null)), false, 8, null)) : com.avito.android.util.rx3.A.a(action.getDeepLink());
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final C41916j d(@Y61.k CharSequence charSequence, @Y61.l String str) {
        return e(str, charSequence, this.f144789a.getString(R.string.ok), null, true);
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final C41916j e(@Y61.l final String str, @Y61.l CharSequence charSequence, @Y61.l final String str2, @Y61.l final String str3, final boolean z12) {
        final f fVar = new f(charSequence);
        return new C41916j(new io.reactivex.rxjava3.core.u() { // from class: com.avito.android.dialog.c
            @Override // io.reactivex.rxjava3.core.u
            public final void a(io.reactivex.rxjava3.core.s sVar) {
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f144757b.f144789a, new j(z12, str, fVar, str2, str3, sVar));
                aVarC.setOnDismissListener(new d(sVar, 0));
                com.avito.android.lib.util.g.a(aVarC);
                sVar.f(new e(aVarC, 0));
            }
        });
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final io.reactivex.rxjava3.core.q f(@Y61.k final UserDialog userDialog) {
        List<Action> actions = userDialog.getActions();
        if (actions == null || actions.size() < 2) {
            return g(userDialog);
        }
        final Action action = actions.get(0);
        final Action action2 = actions.get(1);
        return new C41916j(new io.reactivex.rxjava3.core.u() { // from class: com.avito.android.dialog.b
            @Override // io.reactivex.rxjava3.core.u
            public final void a(io.reactivex.rxjava3.core.s sVar) {
                a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
                Action action3 = action2;
                UserDialog userDialog2 = userDialog;
                Action action4 = action;
                n nVar = this.f144753b;
                com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(c5284a, nVar.f144789a, new m(userDialog2, action4, nVar, action3, sVar));
                aVarC.setOnDismissListener(new d(sVar, 1));
                com.avito.android.lib.util.g.a(aVarC);
                sVar.f(new e(aVarC, 1));
            }
        });
    }

    @Override // com.avito.android.dialog.InterfaceC30274a
    @Y61.k
    public final Y g(@Y61.k UserDialog userDialog) {
        C41916j c41916jB;
        List<Action> actions = userDialog.getActions();
        Action action = actions != null ? (Action) C42745f0.G(actions) : null;
        if (action == null || (action.getDeepLink() instanceof NoMatchLink)) {
            c41916jB = b(userDialog.getMessage(), userDialog.getTitle(), this.f144789a.getString(R.string.ok), userDialog.getCancelable());
        } else {
            c41916jB = b(userDialog.getMessage(), userDialog.getTitle(), action.getTitle(), userDialog.getCancelable());
        }
        return c41916jB.j(new g(action));
    }
}
