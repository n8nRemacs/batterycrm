package com.avito.android.code_check.deep_linking;

import Lo.InterfaceC14420a;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UserDialog;
import ev.AbstractC40161a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CodeCheckLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/deep_linking/a;", "Lev/a;", "Lcom/avito/android/code_check_public/CodeCheckLink;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<CodeCheckLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f118808f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f118809g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC14420a f118810h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f118811i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.g f118812j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f118813k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f118814l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CodeCheckLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.code_check.deep_linking.a$a, reason: collision with other inner class name */
    public static final class C3463a<T> implements r {
        public C3463a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: CodeCheckLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String stringExtra;
            f fVarB;
            C47918a c47918a = (C47918a) obj;
            a aVar = a.this;
            aVar.f118812j.g(aVar.d(), false);
            if (c47918a.f437156b != -1) {
                aVar.j(CodeCheckLink.b.a.f119266b);
                return;
            }
            Intent intent = c47918a.f437157c;
            if (intent != null && (stringExtra = intent.getStringExtra("CodeCheckActivity.Result.Toast")) != null) {
                boolean booleanExtra = intent.getBooleanExtra("CodeCheckActivity.Result.Toast.IsError", false);
                PrintableText printableTextF = com.avito.android.printable_text.b.f(stringExtra);
                ToastBarPosition toastBarPosition = booleanExtra ? ToastBarPosition.f181046d : ToastBarPosition.f181047e;
                if (booleanExtra) {
                    f.c.f125255c.getClass();
                    fVarB = f.c.a.b();
                } else {
                    fVarB = f.a.f125253a;
                }
                a.i.C4057a.d(aVar.f118811i, printableTextF, null, null, fVarB, 2750, toastBarPosition, null, null, 1934);
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar.f118813k;
            if (intent != null) {
                UserDialog userDialog = (UserDialog) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("CodeCheckActivity.Result.Dialog", UserDialog.class) : intent.getParcelableExtra("CodeCheckActivity.Result.Dialog"));
                if (userDialog != null) {
                    CodeCheckLink.b.c cVar = CodeCheckLink.b.c.f119268b;
                    DialogDeepLink.ControlsDirection controlsDirection = DialogDeepLink.ControlsDirection.f133265c;
                    String title = userDialog.getTitle();
                    String string = userDialog.getMessage().toString();
                    boolean cancelable = userDialog.getCancelable();
                    kotlin.collections.builders.b bVarT = C42745f0.t();
                    List<Action> actions = userDialog.getActions();
                    if (actions != null) {
                        for (Action action : actions) {
                            DeepLink deepLink = action.getDeepLink();
                            String title2 = action.getTitle();
                            String style = action.getStyle();
                            bVarT.add(new DialogDeepLink.DialogButton(deepLink, title2, L.f(style, "primary") ? DialogDeepLink.DialogButtonStyle.PRIMARY : L.f(style, "danger") ? DialogDeepLink.DialogButtonStyle.DANGER : DialogDeepLink.DialogButtonStyle.SECONDARY));
                        }
                    }
                    aVar.i(cVar, aVar2, new DialogDeepLink(controlsDirection, cancelable, false, string, C42745f0.p(bVarT), title, null, null, null, null, 964, null));
                    return;
                }
            }
            if (intent != null) {
                DeepLink deepLink2 = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("CodeCheckActivity.Result.DeepLink", DeepLink.class) : intent.getParcelableExtra("CodeCheckActivity.Result.DeepLink"));
                if (deepLink2 != null) {
                    aVar.i(CodeCheckLink.b.c.f119268b, aVar2, deepLink2);
                    return;
                }
            }
            aVar.j(new CodeCheckLink.b.C3493b(intent != null ? Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("CodeCheckActivity.Result", Parcelable.class) : intent.getParcelableExtra("CodeCheckActivity.Result") : null));
        }
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC14420a interfaceC14420a, @k a.i iVar, @k a.g gVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f118808f = bVar;
        this.f118809g = interfaceC4053a;
        this.f118810h = interfaceC14420a;
        this.f118811i = iVar;
        this.f118812j = gVar;
        this.f118813k = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CodeCheckLink codeCheckLink = (CodeCheckLink) deepLink;
        this.f118809g.J(this.f118810h.a(codeCheckLink.f119241b, codeCheckLink.f119242c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        this.f118812j.g(d(), true);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f118814l.b(this.f118808f.Q().N(new C3463a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f118814l.e();
    }
}
