package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import Fc1.G3;
import Rh.C15041a;
import VU.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.hotel.model.HotelOfferDiscount;
import com.avito.android.hotel.model.HotelOfferInstallments;
import com.avito.android.hotel.model.HotelOfferInstallmentsEntryPoint;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48065c;

/* compiled from: AdvertDetailsHotelOfferView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/r;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f76149A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super HotelActionButton, G0> f76150B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f76151C;

    /* renamed from: D, reason: collision with root package name */
    public final int f76152D;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f76153b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f76154c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f76155d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f76156e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f76157f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f76158g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Group f76159h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f76160i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f76161j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f76162k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f76163l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final StrikethroughTextView f76164m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f76165n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f76166o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f76167p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f76168q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f76169r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f76170s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Input f76171t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Input f76172u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Button f76173v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Group f76174w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f76175x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f76176y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f76177z;

    /* compiled from: AdvertDetailsHotelOfferView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76178a;

        static {
            int[] iArr = new int[HotelOfferInstallmentsEntryPoint.HighlightType.values().length];
            try {
                iArr[HotelOfferInstallmentsEntryPoint.HighlightType.FLAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f76178a = iArr;
        }
    }

    public r(@Y61.k View view, @Y61.k Resources resources) {
        super(view);
        this.f76153b = view;
        this.f76154c = resources;
        View viewFindViewById = view.findViewById(R.id.price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76155d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.details);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76156e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f76157f = textView;
        View viewFindViewById4 = view.findViewById(R.id.preview);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f76158g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.hotel_offer_group);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f76159h = (Group) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.installments);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f76160i = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.installments_left_part);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76161j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.installments_right_part);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76162k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.discount_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f76163l = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.original_price);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f76164m = (StrikethroughTextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.percent);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76165n = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.title);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76166o = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.selected_dates);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76167p = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.more_button);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f76168q = (Button) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.offers);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById15;
        this.f76169r = recyclerView;
        View viewFindViewById16 = view.findViewById(R.id.filters);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f76170s = (FlexboxLayout) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.date_filter);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f76171t = (Input) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.guest_filter);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f76172u = (Input) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.refresh);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f76173v = (Button) viewFindViewById19;
        View viewFindViewById20 = view.findViewById(R.id.error_group);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f76174w = (Group) viewFindViewById20;
        View viewFindViewById21 = view.findViewById(R.id.actions);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f76175x = (LinearLayout) viewFindViewById21;
        View viewFindViewById22 = view.findViewById(R.id.shimmer);
        if (viewFindViewById22 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f76176y = (ShimmerFrameLayout) viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.redesign_shimmer);
        if (viewFindViewById23 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f76177z = (ShimmerFrameLayout) viewFindViewById23;
        this.f76152D = y6.b(20);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.content_horizontal_padding) - view.getResources().getDimensionPixelSize(R.dimen.advert_details_hotel_offer_item_horizontal_margin);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, recyclerView.getPaddingBottom());
        recyclerView.setItemAnimator(null);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }

    public static void B80(TextView textView, HotelOfferInstallmentsEntryPoint.HighlightType highlightType) {
        int i12 = highlightType == null ? -1 : a.f76178a[highlightType.ordinal()];
        if (i12 == -1) {
            D6.f(textView, 0, 0, 0, 0, 10);
            textView.setBackground(null);
        } else {
            if (i12 != 1) {
                return;
            }
            D6.f(textView, y6.b(4), 0, y6.b(4), 0, 10);
            textView.setBackgroundResource(R.drawable.bg_offer_flag);
        }
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Bm(@Y61.k PrintableText printableText) {
        this.f76171t.setHint(com.avito.android.printable_text.b.g(printableText, this.f76154c));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void CL(@Y61.k RecyclerView.r rVar) {
        this.f76169r.o(rVar);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void EG(@Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f76169r.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void EV(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f76157f, attributedText, null);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new C15041a(this, 2));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Gz(@Y61.l AttributedText attributedText) {
        TextView textView = this.f76155d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.post(new G3(this, 20));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Lc(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76158g);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Ni() {
        this.f76171t.setVisibility(0);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void OJ(boolean z12) {
        this.f76166o.setVisibility(z12 ? 0 : 8);
        this.f76167p.setVisibility(z12 ? 0 : 8);
        this.f76169r.setVisibility(z12 ? 0 : 8);
        this.f76168q.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void OR(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f76156e, attributedText, null);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void QI(@Y61.l Image image) {
        int i12 = image != null ? 0 : 8;
        ImageView imageView = this.f76158g;
        imageView.setVisibility(i12);
        com.avito.android.image_loader.glide.utils.b.b(imageView, com.avito.android.image_loader.b.b(image).a(imageView), R.drawable.bg_preview_hotel_image, this.f76152D);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void RM(int i12) throws Resources.NotFoundException {
        Input input = this.f76171t;
        Context context = input.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        input.setAppearanceAndContent(typedValue.resourceId);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Tn(@Y61.k PrintableText printableText) {
        Input.t(this.f76172u, com.avito.android.printable_text.b.g(printableText, this.f76154c), false, 6);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void Tp(@Y61.k PrintableText printableText) {
        this.f76172u.setHint(com.avito.android.printable_text.b.g(printableText, this.f76154c));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void UW(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76172u);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void VK(@Y61.l AdvertDetailsHotelOffer.Action action, @Y61.k Y41.a<G0> aVar) throws Resources.NotFoundException {
        String str;
        String str2;
        Button button = this.f76168q;
        if (action != null && (str2 = action.f75866b) != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(str2), button.getContext()));
        }
        com.avito.android.lib.design.button.b.a(button, (action == null || (str = action.f75867c) == null) ? null : FV.a.f4720a.e(str, this.f76153b.getContext(), R.attr.textIconArrowForward, y6.b(4)), false);
        D6.a(aVar, button);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void ZJ(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76167p);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void dM(int i12) throws Resources.NotFoundException {
        Input input = this.f76172u;
        Context context = input.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        input.setAppearanceAndContent(typedValue.resourceId);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void e4(@Y61.k Y41.l<? super HotelActionButton, G0> lVar) {
        this.f76150B = lVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void eX(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76171t);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f76149A = lVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void ge(boolean z12) {
        this.f76174w.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void go(@Y61.k PrintableText printableText) {
        Input.t(this.f76171t, com.avito.android.printable_text.b.g(printableText, this.f76154c), false, 6);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void gt(boolean z12) {
        this.f76170s.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void h4(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76160i);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f76151C;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void lq() {
        this.f76172u.setVisibility(0);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void m10(boolean z12) {
        this.f76159h.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void ne(@Y61.l List<? extends HotelActionButton> list) {
        int i12 = O2.a(list) ? 0 : 8;
        LinearLayout linearLayout = this.f76175x;
        linearLayout.setVisibility(i12);
        linearLayout.removeAllViews();
        if (list != null) {
            for (HotelActionButton hotelActionButton : list) {
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_hotel_offer_action_item, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.action);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                Button button = (Button) viewFindViewById;
                Integer numC = hotelActionButton.getF162611c();
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    b.a aVar = VU.b.f17147t;
                    Context context = viewInflate.getContext();
                    int iJ2 = C35835l0.j(iIntValue, viewInflate.getContext());
                    aVar.getClass();
                    button.setStyle(b.a.c(iJ2, context));
                }
                button.setText(com.avito.android.printable_text.b.g(hotelActionButton.getF162610b(), this.f76154c));
                Boolean boolIsEnabled = hotelActionButton.getF162612d();
                button.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
                button.setOnClickListener(new com.avito.android.advert.closed.b(26, this, hotelActionButton));
                linearLayout.addView(viewInflate);
            }
        }
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void o10(@Y61.l PrintableText printableText) {
        String strG = printableText != null ? com.avito.android.printable_text.b.g(printableText, this.f76154c) : null;
        CharSequence charSequenceE = strG != null ? FV.a.f4720a.e(strG, this.f76153b.getContext(), R.attr.textIconChevronRight, y6.b(5)) : null;
        TextView textView = this.f76167p;
        textView.setText(charSequenceE);
        textView.setVisibility(strG == null || C43066x.K(strG) ? 8 : 0);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    @Y61.l
    public final Parcelable os() {
        RecyclerView.m layoutManager = this.f76169r.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.Y0();
        }
        return null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void qd(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.f76173v);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void rL(boolean z12) {
        this.f76176y.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void setAdapter(@Y61.l RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter) {
        this.f76169r.setAdapter(adapter);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void setTitle(@Y61.l String str) {
        this.f76166o.setText(str);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f76151C = aVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void uT() {
        this.f76169r.s();
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void wt(@Y61.l HotelOfferInstallments hotelOfferInstallments) {
        HotelOfferInstallmentsEntryPoint entryPoint;
        Integer textPartsSpacing;
        HotelOfferInstallmentsEntryPoint entryPoint2;
        HotelOfferInstallmentsEntryPoint.Part rightPart;
        HotelOfferInstallmentsEntryPoint entryPoint3;
        HotelOfferInstallmentsEntryPoint.Part leftPart;
        HotelOfferInstallmentsEntryPoint entryPoint4;
        HotelOfferInstallmentsEntryPoint.Part rightPart2;
        HotelOfferInstallmentsEntryPoint entryPoint5;
        HotelOfferInstallmentsEntryPoint.Part leftPart2;
        int iB2 = 0;
        this.f76160i.setVisibility(hotelOfferInstallments != null ? 0 : 8);
        HotelOfferInstallmentsEntryPoint.HighlightType highlightType = null;
        AttributedText attributedText = (hotelOfferInstallments == null || (entryPoint5 = hotelOfferInstallments.getEntryPoint()) == null || (leftPart2 = entryPoint5.getLeftPart()) == null) ? null : leftPart2.getAttributedText();
        TextView textView = this.f76161j;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        AttributedText attributedText2 = (hotelOfferInstallments == null || (entryPoint4 = hotelOfferInstallments.getEntryPoint()) == null || (rightPart2 = entryPoint4.getRightPart()) == null) ? null : rightPart2.getAttributedText();
        TextView textView2 = this.f76162k;
        com.avito.android.util.text.j.a(textView2, attributedText2, null);
        B80(textView, (hotelOfferInstallments == null || (entryPoint3 = hotelOfferInstallments.getEntryPoint()) == null || (leftPart = entryPoint3.getLeftPart()) == null) ? null : leftPart.getHighlightType());
        if (hotelOfferInstallments != null && (entryPoint2 = hotelOfferInstallments.getEntryPoint()) != null && (rightPart = entryPoint2.getRightPart()) != null) {
            highlightType = rightPart.getHighlightType();
        }
        B80(textView2, highlightType);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (hotelOfferInstallments != null && (entryPoint = hotelOfferInstallments.getEntryPoint()) != null && (textPartsSpacing = entryPoint.getTextPartsSpacing()) != null) {
            iB2 = y6.b(textPartsSpacing.intValue());
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, iB2, marginLayoutParams.bottomMargin);
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void xK(@Y61.l HotelOfferDiscount hotelOfferDiscount) {
        CharSequence text;
        AttributedText attributedTextC = hotelOfferDiscount != null ? hotelOfferDiscount.getOriginalPrice() : null;
        StrikethroughTextView strikethroughTextView = this.f76164m;
        com.avito.android.util.text.j.a(strikethroughTextView, attributedTextC, null);
        AttributedText attributedTextD = hotelOfferDiscount != null ? hotelOfferDiscount.getPercent() : null;
        TextView textView = this.f76165n;
        com.avito.android.util.text.j.a(textView, attributedTextD, null);
        com.akita.view.foundation.util.e.a(this.f76164m, null, null, Integer.valueOf(y6.b((hotelOfferDiscount != null ? hotelOfferDiscount.getPercentBackgroundColor() : null) != null ? 5 : 2)), null, 11);
        textView.setBackgroundTintList(ColorStateList.valueOf(C48065c.g(hotelOfferDiscount != null ? hotelOfferDiscount.getPercentBackgroundColor() : null, textView.getContext(), "transparentWhite")));
        this.f76163l.setVisibility((hotelOfferDiscount == null || (text = strikethroughTextView.getText()) == null || C43066x.K(text)) ? 8 : 0);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void yk(boolean z12) {
        this.f76177z.setVisibility(z12 ? 0 : 8);
        this.f76169r.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.q
    public final void zB(@Y61.k androidx.recyclerview.widget.P p12) {
        p12.b(this.f76169r);
    }
}
