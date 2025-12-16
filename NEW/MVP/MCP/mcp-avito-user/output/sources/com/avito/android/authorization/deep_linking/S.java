package com.avito.android.authorization.deep_linking;

import Fc1.E0;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PerformResetPasswordLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/S;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class S extends AbstractC40161a<PerformResetPasswordLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93709f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f93710g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f93711h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.d f93712i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93713j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.reset_password.c f93714k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Resources f93715l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93716m = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UserDialog f93717l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ S f93718m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserDialog userDialog, S s5) {
            super(2);
            this.f93717l = userDialog;
            this.f93718m = s5;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            Action action;
            Action action2;
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            UserDialog userDialog = this.f93717l;
            bVar2.setTitle(userDialog.getTitle());
            bVar2.setSubtitle(userDialog.getMessage());
            bVar2.setButtonsOrientation(1);
            List<Action> actions = userDialog.getActions();
            S s5 = this.f93718m;
            if (actions != null && (action2 = (Action) C42745f0.K(0, actions)) != null) {
                bVar2.L3(action2.getTitle(), new O(dialogInterface2, s5, action2));
            }
            List<Action> actions2 = userDialog.getActions();
            if (actions2 != null && (action = (Action) C42745f0.K(1, actions2)) != null) {
                bVar2.M3(action.getTitle(), new P(dialogInterface2, s5, action));
            }
            bVar2.setCancelable(true);
            bVar2.b(new Q(s5));
            return G0.f406611a;
        }
    }

    @Inject
    public S(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k a.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.authorization.reset_password.c cVar, @Y61.k Resources resources) {
        this.f93709f = interfaceC35745a5;
        this.f93710g = gVar;
        this.f93711h = iVar;
        this.f93712i = dVar;
        this.f93713j = aVar;
        this.f93714k = cVar;
        this.f93715l = resources;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((PerformResetPasswordLink) deepLink).f133933b;
        this.f93716m.b(new C42016n(this.f93714k.a(str2).s(this.f93709f.e()).j(new L(this)), new E0(this, 14)).x(new M(this, str2), new N(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f93716m.e();
    }

    public final void k(DeepLink deepLink) {
        i(PerformResetPasswordLink.b.d.f133937b, this.f93713j, deepLink);
    }

    public final void l(UserDialog userDialog) {
        this.f93712i.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new a(userDialog, this));
    }

    public final void m(PrintableText printableText) {
        f.c.f125255c.getClass();
        a.i.C4057a.d(this.f93711h, printableText, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
        j(PerformResetPasswordLink.b.C4026b.f133935b);
    }
}
