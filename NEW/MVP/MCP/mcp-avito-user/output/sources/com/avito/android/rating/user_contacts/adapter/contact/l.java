package com.avito.android.rating.user_contacts.adapter.contact;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.rating.user_contacts.UserContactRatingSelectView;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/contact/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/user_contacts/adapter/contact/j;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f247705i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f247706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f247707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f247708d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f247709e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UserContactRatingSelectView f247710f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f247711g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f247712h;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.user_contact_item_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f247706b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.user_contact_item_name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f247707c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.user_contact_item_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f247708d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.user_contact_item_price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f247709e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.user_contact_item_score);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.rating.user_contacts.UserContactRatingSelectView");
        }
        this.f247710f = (UserContactRatingSelectView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.user_contact_item_remove);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f247711g = (Button) viewFindViewById6;
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    @Y61.k
    public final C Ma() {
        return new C(new com.avito.android.offlinization.ui.a(this, 11));
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    @Y61.k
    public final z<G0> NM() {
        return C37722i.a(this.f247711g);
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    @Y61.k
    public final z<G0> Rh() {
        return z.f0(C37722i.a(this.f247706b), C37722i.a(this.f247707c), C37722i.a(this.f247708d), C37722i.a(this.f247709e));
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void UI(@Y61.l String str) {
        I5.a(this.f247708d, str, false);
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void VM(@Y61.l com.avito.android.image_loader.a aVar) {
        C35949t5.c(this.f247706b, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void Y10() {
        UserContactRatingSelectView userContactRatingSelectView = this.f247710f;
        if (userContactRatingSelectView.f247652i != 0) {
            userContactRatingSelectView.f247652i = 0;
            userContactRatingSelectView.invalidate();
        }
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void Zu(@Y61.l String str) {
        I5.a(this.f247707c, str, false);
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f247712h = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f247712h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.rating.user_contacts.adapter.contact.j
    public final void t9(@Y61.l String str) {
        I5.a(this.f247709e, str, false);
    }
}
