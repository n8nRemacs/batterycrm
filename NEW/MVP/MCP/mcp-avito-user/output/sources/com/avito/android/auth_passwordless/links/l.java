package com.avito.android.auth_passwordless.links;

import Ju.AbstractC14250d;
import android.os.Bundle;
import com.avito.android.auth_passwordless.AuthPasswordlessEntryLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AuthPasswordlessEntryDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auth_passwordless/links/l;", "Lev/a;", "Lcom/avito/android/auth_passwordless/AuthPasswordlessEntryLink;", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends AbstractC40161a<AuthPasswordlessEntryLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f92644f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h f92645g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92646h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public l(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k h hVar) {
        this.f92644f = aVar;
        this.f92645g = hVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f92644f.r6(bundle, this.f92645g.a((AuthPasswordlessEntryLink) deepLink), str);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f92646h.b(this.f92644f.V9().t0(new l41.g() { // from class: com.avito.android.auth_passwordless.links.l.a
            @Override // l41.g
            public final void accept(Object obj) {
                l lVar = l.this;
                Objects.toString(((C43501a) obj).f413261b);
                lVar.j(AbstractC14250d.c.f9171c);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f92646h.e();
    }
}
