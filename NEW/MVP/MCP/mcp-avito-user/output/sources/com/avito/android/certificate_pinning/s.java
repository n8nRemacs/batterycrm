package com.avito.android.certificate_pinning;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UnsafeNetworkView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/s;", "Lcom/avito/android/certificate_pinning/r;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f117856a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f117857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f117858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f117859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f117860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f117861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.button.c f117862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.button.c f117863h;

    public s(@Y61.k View view) {
        this.f117856a = view;
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f117857b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.loading_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f117858c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image_unsafe_network);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f117859d = imageView;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f117860e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f117861f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.button_check_again);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        com.avito.android.lib.deprecated_design.button.c cVar = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById6);
        this.f117862g = cVar;
        View viewFindViewById7 = view.findViewById(R.id.button_authenticate);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        com.avito.android.lib.deprecated_design.button.c cVar2 = new com.avito.android.lib.deprecated_design.button.c(viewFindViewById7);
        this.f117863h = cVar2;
        cVar.b(view.getContext().getText(R.string.unsafe_network_check_again));
        cVar2.b(view.getContext().getText(R.string.public_network_authorise));
        viewFindViewById.post(new RunnableC34589p(20, viewFindViewById, imageView));
    }

    public final void a() {
        this.f117860e.setText(R.string.public_network_auth_title);
        this.f117861f.setText(R.string.public_network_auth_description);
        this.f117859d.setImageDrawable(C35835l0.h(R.attr.img_publicWifi, this.f117857b.getContext()));
        this.f117862g.d(false);
        this.f117863h.d(true);
    }

    public final void b() {
        this.f117860e.setText(R.string.unsafe_network_title);
        this.f117861f.setText(R.string.unsafe_network_description);
        this.f117859d.setImageDrawable(C35835l0.h(R.attr.img_badSsl, this.f117857b.getContext()));
        this.f117862g.d(true);
        this.f117863h.d(false);
    }

    public final void c() {
        D6.H(this.f117858c);
    }

    public final void d() {
        D6.w(this.f117858c);
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f117856a, com.avito.android.printable_text.a.a(R.string.unknown_server_error), null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }

    public final void e() {
        b();
        D6.w(this.f117858c);
    }
}
