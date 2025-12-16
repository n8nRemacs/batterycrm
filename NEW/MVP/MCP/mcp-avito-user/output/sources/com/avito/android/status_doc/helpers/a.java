package com.avito.android.status_doc.helpers;

import Ax0.C13097a;
import Ax0.C13100d;
import Ax0.C13102f;
import Ax0.InterfaceC13098b;
import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.services_transportation_widget.dialog.h;
import com.avito.android.status_doc.mvi.entities.ButtonStyle;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigStatusDocScreenRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/status_doc/helpers/a;", "", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NavBar f284864a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f284865b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f284866c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f284867d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f284868e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Banner f284869f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f284870g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C42670a f284871h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l<InterfaceC13098b, G0> f284872i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC42726C f284873j = C42727D.c(new C8519a());

    /* compiled from: GigStatusDocScreenRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.status_doc.helpers.a$a, reason: collision with other inner class name */
    public static final class C8519a extends N implements Y41.a<LayoutInflater> {
        public C8519a() {
            super(0);
        }

        @Override // Y41.a
        public final LayoutInflater invoke() {
            return LayoutInflater.from(a.this.f284869f.getThemedContext());
        }
    }

    /* compiled from: GigStatusDocScreenRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f284872i.invoke(InterfaceC13098b.C0030b.f719a);
            return G0.f406611a;
        }
    }

    /* compiled from: GigStatusDocScreenRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C13100d f284876l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f284877m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C13100d c13100d, a aVar) {
            super(1);
            this.f284876l = c13100d;
            this.f284877m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            num.intValue();
            DeepLink deepLink = this.f284876l.f727f;
            if (deepLink != null) {
                this.f284877m.f284872i.invoke(new InterfaceC13098b.d(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigStatusDocScreenRenderer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<ContentPlaceholder, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
            contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.gig_status_error));
            contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getText(R.string.gig_status_retry));
            contentPlaceholder2.setButtonOnClickListener(new h(a.this, 6));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k NavBar navBar, @k SimpleDraweeView simpleDraweeView, @k TextView textView, @k TextView textView2, @k Button button, @k Banner banner, @k LinearLayout linearLayout, @k C42670a c42670a, @k l<? super InterfaceC13098b, G0> lVar) {
        this.f284864a = navBar;
        this.f284865b = simpleDraweeView;
        this.f284866c = textView;
        this.f284867d = textView2;
        this.f284868e = button;
        this.f284869f = banner;
        this.f284870g = linearLayout;
        this.f284871h = c42670a;
        this.f284872i = lVar;
    }

    public final Button a(Button button, C13097a c13097a, boolean z12) {
        D6.H(button);
        com.avito.android.lib.design.button.b.a(button, c13097a.f715b, false);
        ButtonStyle buttonStyle = c13097a.f714a;
        button.setAppearanceFromAttr((z12 && buttonStyle == ButtonStyle.f284906b) ? R.attr.buttonSecondaryLarge : buttonStyle == ButtonStyle.f284906b ? R.attr.buttonSecondaryMedium : (z12 && buttonStyle == ButtonStyle.f284907c) ? R.attr.buttonPrimaryLarge : R.attr.buttonPrimaryMedium);
        button.setOnClickListener(new g(20, this, c13097a));
        return this.f284868e;
    }

    public final void b(@k C13100d c13100d) {
        NavBar navBar = this.f284864a;
        Drawable drawableH = C35835l0.h(R.attr.ic_close24, navBar.getContext());
        b bVar = new b();
        Drawable drawableH2 = C35835l0.h(R.attr.ic_callCenter24, navBar.getContext());
        G0 g02 = null;
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(drawableH, bVar, false, null, null, c13100d.f728g ? C42745f0.V(drawableH2 != null ? new a.C5289a(drawableH2, null, null, 0, 0, 0, 62, null) : null) : null, new c(c13100d, this), 28, null));
        C42670a c42670a = this.f284871h;
        if (c13100d.f730i) {
            c42670a.c(null, new d());
            return;
        }
        if (c13100d.f729h) {
            C42670a.d(c42670a);
            return;
        }
        C35949t5.c(this.f284865b, com.avito.android.image_loader.b.b(c13100d.f723b), null, null, null, 14);
        C13102f c13102f = c13100d.f724c;
        I5.a(this.f284866c, c13102f.f732a, false);
        I5.a(this.f284867d, c13102f.f733b, false);
        Button button = this.f284868e;
        C13097a c13097a = c13102f.f734c;
        if (c13097a != null) {
            a(button, c13097a, false);
        } else {
            D6.w(button);
            G0 g03 = G0.f406611a;
        }
        Banner banner = this.f284869f;
        C13102f c13102f2 = c13100d.f725d;
        if (c13102f2 != null) {
            D6.H(banner);
            banner.setAppearanceFromAttr(R.attr.bannerOrange);
            banner.setTitle(c13102f2.f732a);
            View viewInflate = ((LayoutInflater) this.f284873j.getValue()).inflate(R.layout.gig_status_doc_banner_content, (ViewGroup) null, false);
            ((TextView) viewInflate.findViewById(R.id.banner_text)).setText(c13102f2.f733b);
            Button button2 = (Button) viewInflate.findViewById(R.id.banner_button);
            C13097a c13097a2 = c13102f2.f734c;
            if (c13097a2 != null) {
                D6.H(button2);
                a(button2, c13097a2, false);
                com.avito.android.lib.design.button.b.a(button2, c13097a2.f715b, false);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                D6.w(button2);
            }
            banner.setContentView(viewInflate);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(banner);
        }
        LinearLayout linearLayout = this.f284870g;
        linearLayout.removeAllViews();
        for (C13097a c13097a3 : (Iterable) c13100d.f726e) {
            Button button3 = new Button(banner.getThemedContext(), null, 0, 0, 14, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, y6.b(12), 0, 0);
            button3.setLayoutParams(layoutParams);
            a(button3, c13097a3, true);
            linearLayout.addView(button3);
        }
        c42670a.b();
    }
}
