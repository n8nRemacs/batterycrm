package com.avito.android.advert.item.realty_imv;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.advert.item.realty_imv.g;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.advert_details.realty.RealtyImvBody;
import com.avito.android.remote.model.advert_details.realty.RealtyImvHint;
import com.avito.android.remote.model.advert_details.realty.RealtyImvPriceRange;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sK0.C48065c;

/* compiled from: RealtyImvView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/realty_imv/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f78331b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.c f78332c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConstraintLayout f78333d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f78334e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f78335f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f78336g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f78337h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f78338i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ImageView f78339j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f78340k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Flow f78341l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f78342m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final TextView f78343n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final View f78344o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f78345p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public d f78346q;

    /* compiled from: RealtyImvView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RealtyImvPriceRange f78347l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RealtyImvPriceRange realtyImvPriceRange) {
            super(1);
            this.f78347l = realtyImvPriceRange;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f78347l.getPointHint());
            return G0.f406611a;
        }
    }

    public h(@k View view, @k g.c cVar) {
        super(view);
        this.f78331b = view;
        this.f78332c = cVar;
        this.f78333d = (ConstraintLayout) view;
        this.f78334e = (TextView) view.findViewById(R.id.title);
        this.f78335f = (TextView) view.findViewById(R.id.hint);
        this.f78336g = (TextView) view.findViewById(R.id.border_value_left);
        this.f78337h = (TextView) view.findViewById(R.id.border_value_right);
        this.f78338i = view.findViewById(R.id.track);
        this.f78339j = (ImageView) view.findViewById(R.id.track_point);
        this.f78340k = (TextView) view.findViewById(R.id.body_title);
        this.f78341l = (Flow) view.findViewById(R.id.body_description_group);
        this.f78342m = (TextView) view.findViewById(R.id.body_description);
        this.f78343n = (TextView) view.findViewById(R.id.body_description_expand);
        this.f78344o = view.findViewById(R.id.body_description_expand_icon);
        this.f78345p = (TextView) view.findViewById(R.id.body_expanded);
    }

    @Override // com.avito.android.advert.item.realty_imv.g
    public final void ZP(@k RealtyImvHint realtyImvHint) {
        SpannableString spannableString = new SpannableString(realtyImvHint.getTitle() + "  ");
        View view = this.f78331b;
        Drawable drawableH = C35835l0.h(R.attr.ic_help20, view.getContext());
        if (drawableH != null) {
            drawableH.setTintList(C35835l0.e(R.attr.gray28, view.getContext()));
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawableH), spannableString.length() - 1, spannableString.length(), 33);
        }
        TextView textView = this.f78335f;
        textView.setText(spannableString);
        textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(1, this, realtyImvHint));
    }

    @Override // com.avito.android.advert.item.realty_imv.g
    public final void df(@k d dVar) {
        this.f78346q = dVar;
    }

    @Override // com.avito.android.advert.item.realty_imv.g
    public final void fU(@k RealtyImvBody realtyImvBody) {
        this.f78340k.setText(realtyImvBody.getTitle());
        j.c(this.f78342m, realtyImvBody.getDescription(), null);
        AttributedText descriptionExpandLink = realtyImvBody.getDescriptionExpandLink();
        TextView textView = this.f78343n;
        j.c(textView, descriptionExpandLink, null);
        textView.setOnClickListener(new B(this, 5));
        j.c(this.f78345p, realtyImvBody.getExpanded(), null);
    }

    @Override // com.avito.android.advert.item.realty_imv.g
    public final void jq(@k RealtyImvPriceRange realtyImvPriceRange) {
        String leftBorder = realtyImvPriceRange.getLeftBorder();
        TextView textView = this.f78336g;
        textView.setText(leftBorder);
        String rightBorder = realtyImvPriceRange.getRightBorder();
        TextView textView2 = this.f78337h;
        textView2.setText(rightBorder);
        View view = this.f78331b;
        int iB2 = C48065c.b(view.getContext(), realtyImvPriceRange.getBorderColor(), R.color.black);
        textView.setTextColor(iB2);
        textView2.setTextColor(iB2);
        this.f78338i.setBackgroundColor(C48065c.b(view.getContext(), realtyImvPriceRange.getTrackColor(), R.color.black));
        int iB3 = C48065c.b(view.getContext(), realtyImvPriceRange.getPointColor(), R.color.black);
        Drawable drawable = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.realty_imv_track_point_foreground);
        ImageView imageView = this.f78339j;
        if (drawable != null) {
            drawable.setTint(iB3);
            imageView.setImageDrawable(drawable);
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = this.f78333d;
        dVar.g(constraintLayout);
        dVar.y(realtyImvPriceRange.getPointPosition(), R.id.track_point);
        dVar.c(constraintLayout);
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
        kVar.f181224j = new r.d(new i.a(new b.a()));
        p.a(kVar, new a(realtyImvPriceRange));
        imageView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(2, this, kVar));
    }

    @Override // com.avito.android.advert.item.realty_imv.g
    public final void nY(int i12, @k String str) {
        TextView textView = this.f78334e;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
        textView.setText(str);
    }
}
