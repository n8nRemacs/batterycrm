package com.avito.android.anonymous_number_dialog;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.W0;
import com.avito.android.anonymous_number_dialog.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47919b;

/* compiled from: AnonymousNumberDialogHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/e;", "Lev/a;", "Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogLink;", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC40161a<AnonymousNumberDialogLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f91278g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.anonymous_number_dialog.a f91279h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f91280i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.d f91281j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AK0.l f91282k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f91283l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public String f91284m;

    @Inject
    public e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k a.f fVar, @Y61.k com.avito.android.anonymous_number_dialog.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.d dVar, @Y61.k AK0.l lVar) {
        this.f91277f = interfaceC28373a;
        this.f91278g = fVar;
        this.f91279h = aVar;
        this.f91280i = aVar2;
        this.f91281j = dVar;
        this.f91282k = lVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String string;
        String string2;
        AnonymousNumberDialogLink anonymousNumberDialogLink = (AnonymousNumberDialogLink) deepLink;
        if (bundle != null && (string = bundle.getString("key_advert_id")) != null && (string2 = bundle.getString("key_source_name")) != null) {
            this.f91277f.c(new W0(string, string2));
        }
        this.f91284m = anonymousNumberDialogLink.f91274g;
        this.f91281j.D0("AnonymousNumberDialogHandler", new d(this, anonymousNumberDialogLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f91278g.l1("AnonymousNumberDialogHandler");
        l41.g gVar = new l41.g() { // from class: com.avito.android.anonymous_number_dialog.e.a
            @Override // l41.g
            public final void accept(Object obj) {
                e eVar = e.this;
                DeepLink deepLink = (DeepLink) ((C47919b) obj).f437159b.getParcelable("AnonymousNumberDialogResult");
                if (deepLink == null) {
                    eVar.j(k.a.f91297b);
                    return;
                }
                String str = eVar.f91284m;
                if (str != null) {
                    AK0.l lVar = eVar.f91282k;
                    if (lVar.getInt(str, 0) == 0) {
                        lVar.a(1, str);
                    }
                }
                eVar.i(k.b.f91298b, eVar.f91280i, deepLink);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f91283l.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.anonymous_number_dialog.e.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f91283l.e();
    }
}
