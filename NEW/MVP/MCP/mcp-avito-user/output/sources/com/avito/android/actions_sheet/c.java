package com.avito.android.actions_sheet;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.actions_sheet.ActionsSheetLink;
import com.avito.android.actions_sheet.dialog.ActionsSheetLinkDialog;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: ActionsSheetLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/actions_sheet/c;", "Lev/a;", "Lcom/avito/android/actions_sheet/ActionsSheetLink;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends AbstractC40161a<ActionsSheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f68188f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f68189g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f68190h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f68191i = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.d dVar, @k a.f fVar) {
        this.f68188f = fVar;
        this.f68189g = aVar;
        this.f68190h = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ActionsSheetLinkDialog.a aVar = ActionsSheetLinkDialog.f68198i0;
        String str2 = this.f395444b;
        aVar.getClass();
        ActionsSheetLinkDialog actionsSheetLinkDialog = new ActionsSheetLinkDialog();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("arg.actions_sheet.content", ((ActionsSheetLink) deepLink).f68186b);
        bundle2.putString("arg.actions_sheet.request_key", str2);
        actionsSheetLinkDialog.setArguments(bundle2);
        this.f68190h.w1(actionsSheetLinkDialog, this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f68188f.l1(this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.actions_sheet.c.a
            @Override // l41.g
            public final void accept(Object obj) {
                c cVar = c.this;
                int i12 = Build.VERSION.SDK_INT;
                Bundle bundle = ((C47919b) obj).f437159b;
                ActionsSheetLinkDialog.Result result = (ActionsSheetLinkDialog.Result) (i12 >= 34 ? (Parcelable) bundle.getParcelable("result.key", ActionsSheetLinkDialog.Result.class) : bundle.getParcelable("result.key"));
                if (!(result instanceof ActionsSheetLinkDialog.Result.ActionClicked)) {
                    cVar.j(ActionsSheetLink.b.C2132b.f68187b);
                    return;
                }
                ActionsSheetLinkDialog.Result.ActionClicked actionClicked = (ActionsSheetLinkDialog.Result.ActionClicked) result;
                String str = actionClicked.f68201c;
                cVar.i(new ActionsSheetLink.b.a(), cVar.f68189g, actionClicked.f68200b);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f68191i.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.actions_sheet.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f68191i.e();
    }
}
