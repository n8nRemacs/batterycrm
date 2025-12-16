package com.avito.android.verification.links.tinkoff_finish;

import android.net.Uri;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.serp.adapter.U;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.verification.links.tinkoff_finish.l;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import ru.tinkoff.core.tinkoffId.TinkoffIdStatusCode;

/* compiled from: VerificationTinkoffFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/tinkoff_finish/b;", "Lev/a;", "Lcom/avito/android/verification/links/tinkoff_finish/VerificationTinkoffFinishLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VerificationTinkoffFinishLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final i f324559f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f324560g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f324561h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324562i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f324563j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.links.tinkoff_documents.f f324564k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324565l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final vM0.f f324566m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f324567n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f324568o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f324569p;

    /* compiled from: VerificationTinkoffFinishLinkAsyncHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f324570a;

        static {
            int[] iArr = new int[TinkoffIdStatusCode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f324570a = iArr;
        }
    }

    @Inject
    public b(@Y61.k i iVar, @Y61.k a.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.i iVar2, @Y61.k com.avito.android.verification.links.tinkoff_documents.f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k vM0.f fVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f324559f = iVar;
        this.f324560g = gVar;
        this.f324561h = interfaceC35745a5;
        this.f324562i = aVar;
        this.f324563j = iVar2;
        this.f324564k = fVar;
        this.f324565l = interfaceC4053a;
        this.f324566m = fVar2;
        this.f324567n = interfaceC28373a;
        this.f324569p = iVar.f324589c.c();
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TinkoffIdStatusCode tinkoffIdStatusCode;
        VerificationTinkoffFinishLink verificationTinkoffFinishLink = (VerificationTinkoffFinishLink) deepLink;
        i iVar = this.f324559f;
        boolean zF2 = L.f(iVar.f324590d.e().getUserHashId(), iVar.f324589c.k());
        vM0.f fVar = this.f324566m;
        if (!zF2) {
            iVar.a();
            PrintableText f323384d = fVar.getF323384d();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324563j, f323384d, null, null, f.c.a.b(), 0, null, null, null, 2030);
            k(verificationTinkoffFinishLink, "Неправильный юзер хэш");
            j(new l.a("Wrong user hash"));
            return;
        }
        ru.tinkoff.core.tinkoffId.g gVar = this.f324564k.f324554a;
        Uri uri = verificationTinkoffFinishLink.f324556b;
        if (gVar != null) {
            ru.tinkoff.core.tinkoffId.a aVar = gVar.f437040f;
            aVar.getClass();
            tinkoffIdStatusCode = (TinkoffIdStatusCode) aVar.f437025c.get(uri.getQueryParameter("auth_status_code"));
        } else {
            tinkoffIdStatusCode = null;
        }
        int i12 = tinkoffIdStatusCode == null ? -1 : a.f324570a[tinkoffIdStatusCode.ordinal()];
        if (i12 == -1) {
            iVar.a();
            PrintableText f323384d2 = fVar.getF323384d();
            f.c.f125255c.getClass();
            a.i.C4057a.d(this.f324563j, f323384d2, null, null, f.c.a.b(), 0, null, null, null, 2030);
            k(verificationTinkoffFinishLink, "Unknown error");
            j(new l.a("Unknown error"));
            return;
        }
        if (i12 == 1) {
            this.f324568o.b(new C42017o(new C42017o(new G(new U(gVar.c(uri), 5)), new g(iVar, 0)).n(new h(iVar)).z(iVar.f324587a.a()).s(this.f324561h.e()).j(new c(this)), new C31684n(this, 29)).x(new d(this), new e(this, verificationTinkoffFinishLink)));
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVar.a();
            k(verificationTinkoffFinishLink, "SDK cancelled by user");
            j(new l.a("SDK cancelled by user"));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324568o.e();
    }

    public final void k(VerificationTinkoffFinishLink verificationTinkoffFinishLink, String str) {
        this.f324567n.c(new com.avito.android.verification.links.tinkoff_finish.a(verificationTinkoffFinishLink.f324556b.toString(), this.f324569p, str));
    }
}
