package com.avito.android.extended_profile_widgets.adapter.contact_bar;

import Ev.InterfaceC13531b;
import Y41.l;
import Y61.k;
import com.avito.android.component.advert_contact_bar.ContactBar;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import oB.j;

/* compiled from: ContactBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/contact_bar/d;", "Lcom/avito/android/extended_profile_widgets/adapter/contact_bar/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154363b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f154364c = new a();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super oB.k, G0> lVar) {
        this.f154363b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).h30((ContactBarItem) aVar, this.f154364c);
    }

    /* compiled from: ContactBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_widgets/adapter/contact_bar/d$a", "Lcom/avito/android/component/advert_contact_bar/ContactBar$c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ContactBar.c {
        public a() {
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void b(@k ContactBar.Button.Action action) {
            d.this.f154363b.invoke(new j(action.f125041e));
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void a(@k InterfaceC13531b interfaceC13531b) {
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void c(@k ContactBar.Button.Target target) {
        }
    }
}
