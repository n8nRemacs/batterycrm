package com.avito.android.section.item.redesign;

import aV.C19818a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.deprecated_design.CheckableImageView;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jr0.C42418a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: ComplementaryAdvertRedesignItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/item/redesign/m;", "Lcom/avito/android/section/item/redesign/l;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f264788x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f264789b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f264790c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f264791d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f264792e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f264793f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f264794g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DockingBadgeContainer f264795h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f264796i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CheckableImageView f264797j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f264798k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f264799l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f264800m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f264801n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f264802o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f264803p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f264804q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f264805r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f264806s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.c f264807t;

    /* renamed from: u, reason: collision with root package name */
    public final float f264808u;

    /* renamed from: v, reason: collision with root package name */
    public final float f264809v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f264810w;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f264811b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.q f264812c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f264813d;

        public a(View view, Y41.q qVar, m mVar) {
            this.f264811b = view;
            this.f264812c = qVar;
            this.f264813d = mVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            m mVar = this.f264813d;
            this.f264812c.invoke(Integer.valueOf(mVar.f264793f.getWidth()), Integer.valueOf(mVar.f264793f.getHeight()), mVar.f264791d);
            this.f264811b.removeOnLayoutChangeListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@Y61.k View view, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) throws Resources.NotFoundException {
        super(view);
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
        this.f264789b = view;
        this.f264790c = aVar;
        this.f264791d = viewContext;
        View viewFindViewById = view.findViewById(R.id.advert_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f264792e = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f264793f = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.card_info_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264794g = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.badge_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f264795h = (DockingBadgeContainer) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.delivery);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f264796i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.btn_favorite);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.CheckableImageView");
        }
        this.f264797j = (CheckableImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264798k = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.price);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264799l = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.delivery_terms_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f264800m = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.delivery_terms);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264801n = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.location_container);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f264802o = (LinearLayout) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.location);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264803p = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.date);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264804q = (TextView) viewFindViewById13;
        this.f264810w = new com.avito.android.image_loader.e().a(view.getContext());
        TypedValue typedValue = new TypedValue();
        view.getResources().getValue(R.dimen.inactive_alpha_old, typedValue, true);
        this.f264808u = typedValue.getFloat();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        this.f264809v = typedValue.getFloat();
        this.f264807t = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void B1(long j12) {
        String strA;
        if (j12 > 0) {
            strA = this.f264807t.a(Long.valueOf(j12), TimeUnit.SECONDS);
        } else {
            strA = null;
        }
        I5.a(this.f264804q, strA, false);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        Drawable drawableA = d.a.a(this.f264810w, this.f264789b.getContext(), aVar, from, null, 24);
        ImageRequest.a aVarA = C35949t5.a(this.f264793f);
        aVarA.d(aVar);
        aVarA.f169501s = drawableA;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.f169498p = str;
        aVarA.f169497o = new n(this);
        aVarA.c();
    }

    public final void B80() {
        boolean z12 = this.f264806s;
        TextView textView = this.f264794g;
        ViewGroup viewGroup = this.f264792e;
        if (z12) {
            boolean z13 = this.f264805r;
            float f12 = this.f264809v;
            if (z13) {
                viewGroup.setAlpha(f12);
                D6.G(textView, true);
            } else {
                viewGroup.setAlpha(f12);
                D6.w(textView);
            }
        } else {
            viewGroup.setAlpha(this.f264808u);
            D6.w(textView);
        }
        boolean z14 = this.f264806s;
        this.f264798k.setEnabled(z14);
        this.f264799l.setEnabled(z14);
        this.f264800m.setEnabled(z14);
        this.f264802o.setEnabled(z14);
        this.f264804q.setEnabled(z14);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void F0(@Y61.k Y41.a<G0> aVar) {
        this.f264797j.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(23, aVar));
    }

    @Override // com.avito.android.section.item.redesign.l
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f264793f);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        LinearLayout linearLayout = this.f264800m;
        if (deliveryTerms == null) {
            D6.w(linearLayout);
            return;
        }
        D6.G(linearLayout, true);
        Q81.e eVar = Q81.e.f13555a;
        Context context = this.f264789b.getContext();
        eVar.getClass();
        this.f264801n.setText(Q81.e.a(context, deliveryTerms));
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void V(@Y61.l String str) {
        LinearLayout linearLayout = this.f264802o;
        if (str == null) {
            D6.w(linearLayout);
        } else {
            D6.G(linearLayout, true);
            this.f264803p.setText(str);
        }
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        SimpleDraweeView simpleDraweeView = this.f264793f;
        simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, qVar, this));
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f264792e.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(22, aVar));
    }

    public final void hf(float f12) {
        SimpleDraweeView simpleDraweeView = this.f264793f;
        simpleDraweeView.getLayoutParams().height = -2;
        simpleDraweeView.setAspectRatio(1.0f);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        List<SerpBadge> badges;
        SerpBadge serpBadge;
        this.f264795h.setState(new C19818a((serpBadgeBar == null || (badges = serpBadgeBar.getBadges()) == null || (serpBadge = (SerpBadge) C42745f0.G(badges)) == null) ? C42784z0.f406748b : Collections.singletonList(C42418a.a(serpBadge, this.f264789b.getContext())), 0, 0, 6, null));
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void p(@Y61.l String str) {
        I5.a(this.f264799l, str, false);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void qJ(boolean z12) {
        D6.G(this.f264796i, z12);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void setActive(boolean z12) {
        this.f264806s = z12;
        B80();
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void setFavorite(boolean z12) {
        this.f264797j.setChecked(z12);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void setTitle(@Y61.k String str) {
        this.f264798k.setText(str);
    }

    @Override // com.avito.android.section.item.redesign.l
    public final void setViewed(boolean z12) {
        this.f264805r = z12;
        B80();
    }
}
