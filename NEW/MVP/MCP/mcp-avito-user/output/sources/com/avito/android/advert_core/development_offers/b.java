package com.avito.android.advert_core.development_offers;

import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.remote.model.DevelopmentOffer;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.SimpleBanner;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentOffersCarouselAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "b", "c", "d", "e", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends RecyclerView.Adapter<RecyclerView.C> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<DevelopmentOffer> f83296c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Z0 f83297d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f83298e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleBanner f83299f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleAdvertAction f83300g;

    /* compiled from: DevelopmentOffersCarouselAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f83301b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f83302c;

        public a(@Y61.k View view) {
            super(view);
            this.f83301b = (TextView) view.findViewById(R.id.development_offers_carousel_banner_title);
            this.f83302c = (TextView) view.findViewById(R.id.development_offers_carousel_banner_description);
        }
    }

    /* compiled from: DevelopmentOffersCarouselAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.development_offers.b$b, reason: collision with other inner class name */
    public static final class C2466b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f83303b;

        public C2466b(@Y61.k View view) {
            super(view);
            this.f83303b = (TextView) view.findViewById(R.id.development_offers_carousel_call_title);
        }
    }

    /* compiled from: DevelopmentOffersCarouselAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b$c;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f83304b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f83305c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final SimpleDraweeView f83306d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ImageView f83307e;

        public c(@Y61.k View view) {
            super(view);
            this.f83304b = (TextView) view.findViewById(R.id.development_offers_carousel_offer_title);
            this.f83305c = (TextView) view.findViewById(R.id.development_offers_carousel_offer_date);
            this.f83306d = (SimpleDraweeView) view.findViewById(R.id.development_offers_icon);
            View viewFindViewById = view.findViewById(R.id.development_offers_gradient);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.f83307e = (ImageView) viewFindViewById;
        }
    }

    /* compiled from: DevelopmentOffersCarouselAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b$d;", "", "<init>", "()V", "", "ITEM_TYPE_BRANDSPACE", "I", "ITEM_TYPE_CAll_BANNER", "ITEM_TYPE_CAll_BUTTON", "ITEM_TYPE_OFFER", "", "OFFER_TYPE_BRANDSPACE", "Ljava/lang/String;", "OFFER_TYPE_MORTGAGE", "OFFER_TYPE_MOZNOTEKA", "OFFER_TYPE_OFFER", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: DevelopmentOffersCarouselAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/b$e;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f83308b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f83309c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ImageView f83310d;

        public e(@Y61.k View view) {
            super(view);
            this.f83308b = (TextView) view.findViewById(R.id.development_offers_carousel_offer_title);
            this.f83309c = (TextView) view.findViewById(R.id.development_offers_carousel_offer_date);
            this.f83310d = (ImageView) view.findViewById(R.id.development_offers_additional_info);
        }
    }

    static {
        new d(null);
    }

    public b(@Y61.k List list, @l Z0 z02, @Y61.k Y41.l lVar, @Y61.k SimpleBanner simpleBanner, @Y61.k SimpleAdvertAction simpleAdvertAction) {
        this.f83296c = list;
        this.f83297d = z02;
        this.f83298e = lVar;
        this.f83299f = simpleBanner;
        this.f83300g = simpleAdvertAction;
    }

    public static com.avito.android.lib.design.gradient.a j(b bVar, Context context, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        a.C5276a.C5277a c5277a = new a.C5276a.C5277a(context, i12, (i13 & 4) == 0 ? R.style.GradientRadial_MoznotekaOfferViewHolder : 0);
        c5277a.f179264a = y6.b(12);
        return new com.avito.android.lib.design.gradient.a(context, c5277a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f83296c.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (i12 == getItemCount() - 1) {
            return 2;
        }
        if (i12 == getItemCount() - 2) {
            return 1;
        }
        return L.f(this.f83296c.get(i12).getType(), "co-promo") ? 3 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@Y61.k RecyclerView.C c12, final int i12) throws Resources.NotFoundException {
        int itemViewType = c12.getItemViewType();
        if (itemViewType == 1) {
            a aVar = (a) c12;
            SimpleBanner simpleBanner = this.f83299f;
            aVar.f83301b.setText(simpleBanner.getTitle());
            aVar.f83302c.setText(simpleBanner.getDescription());
            return;
        }
        if (itemViewType == 2) {
            C2466b c2466b = (C2466b) c12;
            c2466b.f83303b.setText(this.f83300g.getTitle());
            c2466b.itemView.setOnClickListener(new B(this, 10));
            return;
        }
        aVarJ = null;
        aVarJ = null;
        aVarJ = null;
        aVarJ = null;
        com.avito.android.lib.design.gradient.a aVarJ = null;
        List<DevelopmentOffer> list = this.f83296c;
        if (itemViewType == 3) {
            DevelopmentOffer developmentOffer = list.get(i12);
            c cVar = (c) c12;
            cVar.f83304b.setText(developmentOffer.getTitle());
            String dateTo = developmentOffer.getDateTo();
            if (dateTo == null) {
                dateTo = cVar.itemView.getResources().getString(R.string.advert_core_developments_offers_no_end);
            }
            cVar.f83305c.setText(dateTo);
            cVar.itemView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            cVar.itemView.setClipToOutline(true);
            UniversalImage universalImage = developmentOffer.getUniversalImage();
            SimpleDraweeView simpleDraweeView = cVar.f83306d;
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null), null, null, null, 14);
            Context context = cVar.itemView.getContext();
            String gradient = developmentOffer.getGradient();
            if (gradient == null) {
                gradient = "";
            }
            Integer numH = com.avito.android.lib.util.f.h(gradient);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(context, numH != null ? numH.intValue() : R.attr.gradientLinearMonoHorizontalGreen, 0, 4, null);
            c5275a.f179264a = y6.b(12);
            cVar.f83307e.setImageDrawable(new AvitoLinearGradientDrawable(c5275a.a()));
            final int i13 = 0;
            cVar.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert_core.development_offers.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f83290c;

                {
                    this.f83290c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f83290c.f83298e.invoke(Integer.valueOf(i12));
                            break;
                        default:
                            this.f83290c.f83298e.invoke(Integer.valueOf(i12));
                            break;
                    }
                }
            });
            return;
        }
        DevelopmentOffer developmentOffer2 = list.get(i12);
        e eVar = (e) c12;
        String title = developmentOffer2.getTitle();
        TextView textView = eVar.f83308b;
        textView.setText(title);
        textView.setTextColor(L.f(developmentOffer2.getType(), DevelopmentOffer.MOZNOTEKA_TYPE) ? androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.development_offers_carousel_offer_title_moznoteka) : androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.development_offers_carousel_offer_title));
        String dateTo2 = developmentOffer2.getDateTo();
        if (dateTo2 == null) {
            dateTo2 = eVar.itemView.getResources().getString(R.string.advert_core_developments_offers_no_end);
        }
        TextView textView2 = eVar.f83309c;
        textView2.setText(dateTo2);
        textView2.setTextColor(L.f(developmentOffer2.getType(), DevelopmentOffer.MOZNOTEKA_TYPE) ? androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.development_offers_carousel_offer_date_moznoteka) : androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.development_offers_carousel_offer_date));
        eVar.f83310d.setColorFilter(L.f(developmentOffer2.getType(), DevelopmentOffer.MOZNOTEKA_TYPE) ? androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.ic_development_sales_offer_info_moznoteka) : androidx.core.content.d.getColor(eVar.itemView.getContext(), R.color.ic_development_sales_offer_info));
        View view = eVar.itemView;
        String type = developmentOffer2.getType();
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -204524388) {
                if (iHashCode != 105650780) {
                    if (iHashCode == 595951072 && type.equals(DevelopmentOffer.MOZNOTEKA_TYPE)) {
                        aVarJ = j(this, eVar.itemView.getContext(), 0, 2);
                    }
                } else if (type.equals("offer")) {
                    aVarJ = j(this, eVar.itemView.getContext(), R.attr.gradientRadialTopLeftGreenRed, 4);
                }
            } else if (type.equals("mortgage")) {
                aVarJ = j(this, eVar.itemView.getContext(), R.attr.gradientRadialTopLeftVioletGreen, 4);
            }
        }
        view.setBackground(aVarJ);
        final int i14 = 1;
        eVar.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert_core.development_offers.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f83290c;

            {
                this.f83290c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f83290c.f83298e.invoke(Integer.valueOf(i12));
                        break;
                    default:
                        this.f83290c.f83298e.invoke(Integer.valueOf(i12));
                        break;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Y61.k
    public final RecyclerView.C onCreateViewHolder(@Y61.k ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? new e(layoutInflaterFrom.inflate(R.layout.development_offers_carousel_offer, viewGroup, false)) : new c(layoutInflaterFrom.inflate(R.layout.development_offers_co_promo, viewGroup, false)) : new C2466b(layoutInflaterFrom.inflate(R.layout.development_offers_carousel_call_button, viewGroup, false)) : new a(layoutInflaterFrom.inflate(R.layout.development_offers_carousel_banner, viewGroup, false));
    }
}
