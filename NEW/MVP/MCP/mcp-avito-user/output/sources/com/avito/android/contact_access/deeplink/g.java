package com.avito.android.contact_access.deeplink;

import Gr.InterfaceC13909a;
import android.os.Bundle;
import com.avito.android.contact_access.links.ContactsPackagesBuyLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ContactsPackagesBuyLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/deeplink/g;", "Lev/a;", "Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends AbstractC40161a<ContactsPackagesBuyLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f126077f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13909a f126078g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f126079h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f126080i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ContactsPackagesBuyLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(g.this);
        }
    }

    @Inject
    public g(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC13909a interfaceC13909a, @Y61.k a.b bVar) {
        this.f126077f = interfaceC4053a;
        this.f126078g = interfaceC13909a;
        this.f126079h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ContactsPackagesBuyLink contactsPackagesBuyLink = (ContactsPackagesBuyLink) deepLink;
        this.f126077f.J(this.f126078g.a(contactsPackagesBuyLink.f126158b, contactsPackagesBuyLink.f126159c, contactsPackagesBuyLink.f126160d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f126080i.b(this.f126079h.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.contact_access.deeplink.g.b
            @Override // l41.g
            public final void accept(Object obj) {
                g.this.j(((C47918a) obj).f437156b == -1 ? ContactsPackagesBuyLink.b.C3747b.f126162b : ContactsPackagesBuyLink.b.a.f126161b);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f126080i.e();
    }
}
