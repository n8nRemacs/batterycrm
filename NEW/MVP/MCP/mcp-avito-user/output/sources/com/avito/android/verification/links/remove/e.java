package com.avito.android.verification.links.remove;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerificationRemoveLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/remove/e;", "Lev/a;", "Lcom/avito/android/verification/links/remove/VerificationRemoveLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC40161a<VerificationRemoveLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g f324371f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f324372g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f324373h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f324374i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324375j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324376k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public e(@k g gVar, @k a.g gVar2, @k InterfaceC35745a5 interfaceC35745a5, @k a.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f324371f = gVar;
        this.f324372g = gVar2;
        this.f324373h = interfaceC35745a5;
        this.f324374i = iVar;
        this.f324375j = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        g gVar = this.f324371f;
        this.f324376k.b(new C42017o(g1.a(gVar.f324382a.l(((VerificationRemoveLink) deepLink).f324367b)).z(gVar.f324383b.a()).s(this.f324373h.e()).j(new a(this)), new C31684n(this, 25)).x(new c(this), new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324376k.e();
    }
}
