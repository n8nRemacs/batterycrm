package com.avito.android.authorization.confirm_3fa.adapter.email;

import Y41.l;
import Y61.k;
import ge.InterfaceC40665a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EmailItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/adapter/email/e;", "Lcom/avito/android/authorization/confirm_3fa/adapter/email/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40665a, G0> f93568b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40665a, G0> lVar) {
        this.f93568b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        EmailItem emailItem = (EmailItem) aVar;
        gVar.a(new d(this, emailItem));
        gVar.Mr(emailItem.f93560b);
    }
}
