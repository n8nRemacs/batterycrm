package ir;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: ProfileSnippet.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lir/g;", "Lir/e;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f405292a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f405293b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f405294c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f405295d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f405296e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f405297f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f405298g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CompactFlexibleLayout f405299h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f405300i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f405301j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f405302k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ViewGroup f405303l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final View f405304m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final RatingBar f405305n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f405306o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f405307p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final ImageView f405308q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final TextView f405309r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final ViewGroup f405310s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f405311t;

    /* compiled from: ProfileSnippet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f405312a;

        static {
            int[] iArr = new int[UserIconType.values().length];
            try {
                iArr[UserIconType.SHOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserIconType.COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f405312a = iArr;
        }
    }

    public g(@k View view, @k d dVar) {
        this.f405292a = view;
        this.f405293b = dVar;
        this.f405294c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f405295d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405296e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.company_name);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405297f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405298g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.seller_badge_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout");
        }
        this.f405299h = (CompactFlexibleLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.summary);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405300i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.contact_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405301j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.contact_subtitle);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405302k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.contact_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f405303l = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.rating_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f405304m = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.rating);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f405305n = (RatingBar) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.rating_text);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405306o = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.rating_number);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405307p = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.seller_type_icon);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f405308q = (ImageView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.seller_type_text);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f405309r = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.seller_type_container);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f405310s = (ViewGroup) viewFindViewById16;
    }

    @Override // ir.e
    public final void P3(@l List<SerpBadge> list) {
        Q81.b.a(this.f405299h, list, 0);
    }

    @Override // ir.e
    public final void a(@l Y41.a<G0> aVar) {
        this.f405292a.setOnClickListener(new A(25, aVar));
    }

    @Override // ir.e
    public final void b(@l com.avito.android.image_loader.a aVar, @k UserIconType userIconType, @l AvatarShape avatarShape) {
        int i12 = a.f405312a[userIconType.ordinal()];
        Context context = this.f405294c;
        this.f405293b.a(this.f405295d, aVar, userIconType, i12 != 1 ? i12 != 2 ? null : C35835l0.l(context.getDrawable(R.drawable.ic_company_40), C35835l0.d(R.attr.gray28, context)) : C35835l0.l(context.getDrawable(R.drawable.ic_shop_40), C35835l0.d(R.attr.gray28, context)));
    }

    @Override // ir.e
    public final void c(@l Float f12, @l CharSequence charSequence) {
        D6.G(this.f405304m, (f12 == null && charSequence == null) ? false : true);
        RatingBar ratingBar = this.f405305n;
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        D6.G(ratingBar, ((f12 == null || (f12.floatValue() > 0.0f ? 1 : (f12.floatValue() == 0.0f ? 0 : -1)) <= 0) ? null : f12) != null);
        I5.a(this.f405306o, charSequence, false);
        boolean z12 = ((f12 == null || (f12.floatValue() > 0.0f ? 1 : (f12.floatValue() == 0.0f ? 0 : -1)) <= 0) ? null : f12) != null;
        TextView textView = this.f405307p;
        D6.G(textView, z12);
        textView.setText(f12 != null ? C35852n1.a(f12.floatValue()) : null);
    }

    @Override // ir.e
    public final void e(@l CharSequence charSequence) {
        I5.a(this.f405297f, charSequence, false);
    }

    @Override // ir.e
    public final void f(@l CharSequence charSequence, @l Integer num) {
        D6.G(this.f405303l, (charSequence == null || charSequence.length() == 0) ? false : true);
        I5.a(this.f405301j, charSequence, false);
        I5.a(this.f405302k, this.f405294c.getString(R.string.profile_snippet_contact_name), false);
    }

    @Override // ir.e
    public final void g(@l CharSequence charSequence) {
        I5.a(this.f405300i, charSequence, false);
    }

    @Override // ir.e
    public final void gb(@l String str, @l String str2, @l UniversalColor universalColor) {
        D6.G(this.f405310s, true ^ (str == null || str.length() == 0));
        TextView textView = this.f405309r;
        I5.a(textView, str, false);
        Integer numA = str2 != null ? q.a(str2) : null;
        Context context = this.f405294c;
        C35821j2.a(this.f405308q, numA != null ? C35835l0.n(context, numA.intValue(), C48065c.b(context, universalColor, R.attr.blue)) : null);
        if (textView.getVisibility() == 0) {
            textView.addOnLayoutChangeListener(new h(this));
        }
    }

    @Override // ir.e
    public final void hb(@l Y41.l<? super Integer, G0> lVar) {
        this.f405311t = lVar;
    }

    @Override // ir.e
    public final void setSubtitle(@l CharSequence charSequence) {
        I5.a(this.f405298g, charSequence, false);
    }

    @Override // ir.e
    public final void setTitle(@l CharSequence charSequence) {
        I5.a(this.f405296e, charSequence, false);
    }

    @Override // ir.e
    public final void d(@l Y41.a<G0> aVar) {
    }

    @Override // ir.e
    public final void h(@l CharSequence charSequence) {
    }
}
