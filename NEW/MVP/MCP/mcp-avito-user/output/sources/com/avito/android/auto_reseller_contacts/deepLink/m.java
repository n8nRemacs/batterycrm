package com.avito.android.auto_reseller_contacts.deepLink;

import Ju.AbstractC14250d;
import Ue.C15512a;
import Ve.InterfaceC15669a;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.analytics.H;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RequestMessageLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.t1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import xl0.InterfaceC49964a;

/* compiled from: RequestMessageLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/deepLink/m;", "Lev/a;", "Lcom/avito/android/deep_linking/links/RequestMessageLink;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends AbstractC40161a<RequestMessageLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC49964a> f95746f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15669a> f95747g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f95748h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f95749i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C25719a f95750j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f95751k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f95752l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final x f95753m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C15512a f95754n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final H f95755o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final t1 f95756p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f95757q;

    @Inject
    public m(@Y61.k h31.e<InterfaceC49964a> eVar, @Y61.k h31.e<InterfaceC15669a> eVar2, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k C25719a c25719a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar, @Y61.k C15512a c15512a, @Y61.k H h12, @Y61.k t1 t1Var) {
        this.f95746f = eVar;
        this.f95747g = eVar2;
        this.f95748h = gVar;
        this.f95749i = iVar;
        this.f95750j = c25719a;
        this.f95751k = interfaceC35745a5;
        this.f95752l = aVar;
        this.f95753m = xVar;
        this.f95754n = c15512a;
        this.f95755o = h12;
        this.f95756p = t1Var;
    }

    public static final void k(m mVar, ApiError apiError) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(apiError.getF244063c());
        f.c.f125255c.getClass();
        a.i.C4057a.d(mVar.f95749i, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        mVar.j(AbstractC14250d.b.f9170c);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RequestMessageLink requestMessageLink = (RequestMessageLink) deepLink;
        this.f95750j.b(requestMessageLink, this, null, new l(this, requestMessageLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f95757q;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }
}
