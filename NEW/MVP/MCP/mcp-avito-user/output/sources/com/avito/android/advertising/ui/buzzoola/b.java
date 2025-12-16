package com.avito.android.advertising.ui.buzzoola;

import Ba.ViewOnClickListenerC13121a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.a;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.drawable.s;
import j.InterfaceC42161q;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdBuzzoola.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/b;", "Lcom/avito/android/advertising/ui/buzzoola/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.advertising.ui.buzzoola.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f88558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f88559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88561e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88562f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f88563g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f88564h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f88565i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Button f88566j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f88567k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f88568l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f88569m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final RatingBar f88570n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final TextView f88571o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final ImageView f88572p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f88573q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f88574r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final View f88575s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88576t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f88577u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public h f88578v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final ShimmerLayout f88579w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final View f88580x;

    /* compiled from: AdBuzzoola.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/advertising/ui/buzzoola/b$a", "Lcom/facebook/drawee/controller/d;", "LYW0/f;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.facebook.drawee.controller.d<YW0.f> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference<ShimmerLayout> f88581c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<YW0.f, G0> f88582d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(WeakReference<ShimmerLayout> weakReference, Y41.l<? super YW0.f, G0> lVar) {
            this.f88581c = weakReference;
            this.f88582d = lVar;
        }

        @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
        public final void f(String str, Object obj, Animatable animatable) {
            YW0.f fVar = (YW0.f) obj;
            ShimmerLayout shimmerLayout = this.f88581c.get();
            if (shimmerLayout != null) {
                D6.w(shimmerLayout);
            }
            Y41.l<YW0.f, G0> lVar = this.f88582d;
            if (lVar != null) {
                lVar.invoke(fVar);
            }
        }
    }

    public b(@Y61.k View view, @Y61.k AdStyle adStyle) {
        this.f88558b = view;
        this.f88559c = adStyle;
        this.f88560d = C35835l0.d(R.attr.gray8, view.getContext());
        View viewFindViewById = view.findViewById(R.id.buzzoola_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f88561e = (ViewGroup) viewFindViewById;
        this.f88562f = (ViewGroup) view.findViewById(R.id.media_view_container);
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88563g = (TextView) viewFindViewById2;
        this.f88564h = (TextView) view.findViewById(R.id.description);
        this.f88565i = (TextView) view.findViewById(R.id.call_to_action);
        this.f88566j = (Button) view.findViewById(R.id.call_to_action_button);
        this.f88567k = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f88568l = (LinearLayout) view.findViewById(R.id.additional_info);
        this.f88569m = (TextView) view.findViewById(R.id.price);
        this.f88570n = (RatingBar) view.findViewById(R.id.rating_bar);
        this.f88571o = (TextView) view.findViewById(R.id.rating_count);
        this.f88572p = (ImageView) view.findViewById(R.id.close_button);
        this.f88573q = (ViewGroup) view.findViewById(R.id.text_container);
        this.f88574r = (ViewGroup) view.findViewById(R.id.call_to_action_container);
        this.f88575s = view.findViewById(R.id.ad_placeholder);
        this.f88576t = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f88577u = (TextView) view.findViewById(R.id.info_menu);
        this.f88579w = (ShimmerLayout) view.findViewById(R.id.media_view_placeholder);
        this.f88580x = view.findViewById(R.id.text_gradient);
    }

    @Override // com.avito.android.advertising.ui.a
    public final void BN(@Y61.l Float f12, @Y61.k AdStyle adStyle) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void E8(@Y61.l String str) {
        TextView textView = this.f88565i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        ViewGroup viewGroup = this.f88574r;
        if (viewGroup != null) {
            D6.G(viewGroup, true ^ (str == null || str.length() == 0));
        }
        Button button = this.f88566j;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void H60(@InterfaceC42161q int i12) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void HE(@Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k String str, boolean z12) {
        TextView textView = this.f88577u;
        if (z12) {
            Context context = this.f88558b.getContext();
            h hVar = new h(context, 0, 2, null);
            String string = context.getString(R.string.buzzoola_info_menu_main_title);
            String string2 = context.getString(R.string.buzzoola_info_about_ad);
            hVar.D(R.layout.buzzoola_info_menu, true);
            com.avito.android.lib.design.bottom_sheet.d.M(hVar, string, false, true, 6);
            com.avito.android.lib.design.bottom_sheet.d.I(hVar, true);
            com.avito.android.advertising.ui.h.f88704a.getClass();
            Integer numE = com.avito.android.advertising.ui.h.e(R.attr.ic_arrowBack24, context);
            if (numE != null) {
                hVar.y(numE.intValue());
            }
            hVar.N(true);
            hVar.f88591E = (LinearLayout) hVar.findViewById(R.id.main_text_view);
            hVar.f88592F = (TextView) hVar.findViewById(R.id.ad_on_buzzoola_text_view);
            hVar.f88593G = (TextView) hVar.findViewById(R.id.hide_ad_view);
            hVar.f88594H = (TextView) hVar.findViewById(R.id.ad_on_buzzoola_view);
            hVar.R(new g(hVar, string));
            TextView textView2 = (TextView) hVar.findViewById(R.id.about_ad_view);
            if (textView2 != null) {
                textView2.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(2, hVar, string2));
            }
            this.f88578v = hVar;
            textView.setOnClickListener(new com.avito.android.advert_core.advert.f(1, str, this, aVar, aVar2));
        }
        D6.G(textView, z12);
    }

    @Override // com.avito.android.advertising.ui.a
    public final void IS(int i12, @Y61.l Float f12) {
        a.C2614a.d(this, f12, i12);
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: Ik, reason: from getter */
    public final RatingBar getF7308m() {
        return this.f88570n;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        e.a.a(this, R.dimen.ad_image_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF4091d() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void OB(@Y61.k AdStyle adStyle) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: Qw, reason: from getter */
    public final TextView getF7302g() {
        return this.f88564h;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: T1, reason: from getter */
    public final ViewGroup getF7299d() {
        return this.f88561e;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.k
    public final String U30() {
        return this.f88558b.getContext().getString(R.string.buzzoola_default_call_to_action);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void Xa(boolean z12) {
        D6.G(this.f88575s, !z12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f88562f.setOnClickListener(new ViewOnClickListenerC13121a(10, aVar));
        this.f88563g.setOnClickListener(new ViewOnClickListenerC13121a(11, aVar));
        TextView textView = this.f88564h;
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC13121a(12, aVar));
        }
        TextView textView2 = this.f88565i;
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC13121a(13, aVar));
        }
        Button button = this.f88566j;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC13121a(14, aVar));
        }
        ViewGroup viewGroup = this.f88574r;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new ViewOnClickListenerC13121a(15, aVar));
        }
        SimpleDraweeView simpleDraweeView = this.f88567k;
        if (simpleDraweeView != null) {
            simpleDraweeView.setOnClickListener(new ViewOnClickListenerC13121a(16, aVar));
        }
        TextView textView3 = this.f88569m;
        if (textView3 != null) {
            textView3.setOnClickListener(new ViewOnClickListenerC13121a(17, aVar));
        }
        RatingBar ratingBar = this.f88570n;
        if (ratingBar != null) {
            ratingBar.setOnClickListener(new ViewOnClickListenerC13121a(18, aVar));
        }
        TextView textView4 = this.f88571o;
        if (textView4 != null) {
            textView4.setOnClickListener(new ViewOnClickListenerC13121a(19, aVar));
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        ViewGroup f88562f = getF7305j();
        if (f88562f != null) {
            v.b(f88562f, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@Y61.l TextView textView, @Y61.l String str) {
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: getCallToActionView, reason: from getter */
    public final TextView getF7303h() {
        return this.f88565i;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF7298c() {
        return this.f88559c;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF7297b() {
        return this.f88558b;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void h(@Y61.l String str) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: hh, reason: from getter */
    public final LinearLayout getF7306k() {
        return this.f88568l;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: j70, reason: from getter */
    public final ViewGroup getF7319x() {
        return this.f88573q;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void n4(@Y61.l String str) {
        f20(this.f88577u, str);
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: oX, reason: from getter */
    public final TextView getF7309n() {
        return this.f88571o;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: od, reason: from getter */
    public final ViewGroup getF7305j() {
        return this.f88562f;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.l
    public final View ou() {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void p(@Y61.l String str) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    public final ImageView pi() {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void px(@Y61.l Uri uri, @Y61.k s.c cVar, @Y61.l Y41.l<? super YW0.f, G0> lVar) {
        ShimmerLayout shimmerLayout = this.f88579w;
        boolean z12 = (lVar == null && shimmerLayout == null) ? false : true;
        SimpleDraweeView simpleDraweeView = this.f88576t;
        simpleDraweeView.getHierarchy().n(cVar);
        if (!z12) {
            simpleDraweeView.e(uri);
            return;
        }
        if (shimmerLayout != null) {
            D6.G(shimmerLayout, true);
        }
        WeakReference weakReference = new WeakReference(shimmerLayout);
        com.facebook.drawee.backends.pipeline.f fVar = com.facebook.drawee.backends.pipeline.d.f339915a.get();
        fVar.e(uri);
        fVar.f339987e = simpleDraweeView.getController();
        fVar.f339986d = new a(weakReference, lVar);
        simpleDraweeView.setController(fVar.a());
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: qs, reason: from getter */
    public final TextView getF7311p() {
        return this.f88563g;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void setTitle(@Y61.l String str) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.a
    @Y61.l
    /* renamed from: sq, reason: from getter */
    public final TextView getF7307l() {
        return this.f88569m;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    @Y61.k
    public final TextView t6() {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final View uC() {
        return this.f88567k;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.a
    public final void uF(@Y61.l Integer num) {
        this.f88576t.setBackgroundColor(num.intValue() == -1 ? this.f88560d : num.intValue());
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: wV */
    public final TextView getF7312q() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void y9(@Y61.l Uri uri) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
