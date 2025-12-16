package com.avito.android.rating.user_contacts.adapter.contact;

import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/contact/h;", "Lcom/avito/android/rating/user_contacts/adapter/contact/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.rating.user_contacts.mvi.entity.a, G0> f247702b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super com.avito.android.rating.user_contacts.mvi.entity.a, G0> lVar) {
        this.f247702b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ContactItem contactItem = (ContactItem) aVar;
        jVar.Zu(contactItem.f247682e);
        Image image = contactItem.f247684g;
        jVar.VM(image != null ? com.avito.android.image_loader.b.b(image) : null);
        jVar.UI(contactItem.f247685h);
        jVar.t9(contactItem.f247686i);
        jVar.Y10();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        jVar.d(new d(jVar, cVar));
        cVar.b(jVar.Ma().t0(new e(this, contactItem)));
        cVar.b(jVar.NM().t0(new f(this, contactItem)));
        cVar.b(jVar.Rh().t0(new g(this, contactItem)));
    }
}
