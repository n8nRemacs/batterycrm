package com.avito.android.advert_core.contactbar;

import android.view.View;
import android.view.ViewStub;
import com.avito.android.component.advert_contact_bar.C29563j;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.component.advert_contact_bar.J;
import kotlin.Metadata;

/* compiled from: ContactBarProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/I;", "Lcom/avito/android/advert_core/contactbar/H;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f83137a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ViewStub f83138b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83139c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83140d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83141e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f83142f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83143g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f83144h;

    public I(@Y61.k View view, @Y61.l ViewStub viewStub, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f83137a = view;
        this.f83138b = viewStub;
        this.f83139c = z12;
        this.f83140d = z13;
        this.f83141e = z14;
        this.f83142f = z15;
        this.f83143g = z16;
        this.f83144h = z17;
    }

    @Override // com.avito.android.advert_core.contactbar.H
    @Y61.k
    public final ContactBar a(boolean z12, boolean z13) {
        View view = this.f83137a;
        ViewStub viewStub = this.f83138b;
        boolean z14 = this.f83140d;
        if (z14 && viewStub == null) {
            return new J(view, this.f83141e, z13);
        }
        if (!z14 || viewStub == null) {
            return viewStub != null ? new com.avito.android.component.advert_contact_bar.w(viewStub.inflate(), this.f83142f, z12, this.f83144h) : new C29563j(view, this.f83139c);
        }
        return new com.avito.android.component.advert_contact_bar.A(viewStub.inflate(), this.f83141e, this.f83142f, z12, this.f83143g, this.f83144h);
    }
}
