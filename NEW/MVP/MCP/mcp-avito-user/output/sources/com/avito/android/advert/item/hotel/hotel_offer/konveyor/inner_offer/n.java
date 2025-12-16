package com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer;

import VU.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsInnerOfferView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/inner_offer/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f76065b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f76066c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f76067d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f76068e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f76069f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f76070g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f76071h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f76072i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f76073j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f76074k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f76075l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f76076m;

    /* compiled from: AdvertDetailsInnerOfferView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76077a;

        static {
            int[] iArr = new int[AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.values().length];
            try {
                AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.a aVar = AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.f75876b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f76077a = iArr;
        }
    }

    public n(@Y61.k View view, int i12) {
        super(view);
        this.f76065b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        this.f76066c = imageView;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76067d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.amenities);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76068e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f76069f = button;
        View viewFindViewById5 = view.findViewById(R.id.installments);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById5;
        this.f76070g = linearLayout;
        View viewFindViewById6 = view.findViewById(R.id.installments_left_part);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76071h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.installments_right_part);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76072i = (TextView) viewFindViewById7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i12;
        view.setLayoutParams(layoutParams);
        imageView.setClipToOutline(true);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f76064c;

            {
                this.f76064c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f76064c.f76073j;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f76064c.f76074k;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f76064c.f76075l;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f76064c.f76076m;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f76064c;

            {
                this.f76064c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        Y41.a<G0> aVar = this.f76064c.f76073j;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f76064c.f76074k;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f76064c.f76075l;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f76064c.f76076m;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f76064c;

            {
                this.f76064c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        Y41.a<G0> aVar = this.f76064c.f76073j;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f76064c.f76074k;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f76064c.f76075l;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f76064c.f76076m;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i16 = 3;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f76064c;

            {
                this.f76064c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        Y41.a<G0> aVar = this.f76064c.f76073j;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f76064c.f76074k;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    case 2:
                        Y41.a<G0> aVar3 = this.f76064c.f76075l;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar4 = this.f76064c.f76076m;
                        if (aVar4 != null) {
                            aVar4.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void B80(TextView textView, AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType highlightType) {
        int i12 = highlightType == null ? -1 : a.f76077a[highlightType.ordinal()];
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

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void L(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f76067d, attributedText, null);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void Lc(@Y61.k Y41.a<G0> aVar) {
        this.f76073j = aVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void U(@Y61.k Y41.a<G0> aVar) {
        this.f76074k = aVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void bX(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f76068e, attributedText, null);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void eQ(@Y61.l AdvertDetailsHotelOffer.Installment installment) {
        AdvertDetailsHotelOffer.InstallmentEntryPoint installmentEntryPoint;
        Integer num;
        AdvertDetailsHotelOffer.InstallmentEntryPoint installmentEntryPoint2;
        AdvertDetailsHotelOffer.InstallmentEntryPointPart installmentEntryPointPart;
        AdvertDetailsHotelOffer.InstallmentEntryPoint installmentEntryPoint3;
        AdvertDetailsHotelOffer.InstallmentEntryPointPart installmentEntryPointPart2;
        AdvertDetailsHotelOffer.InstallmentEntryPoint installmentEntryPoint4;
        AdvertDetailsHotelOffer.InstallmentEntryPointPart installmentEntryPointPart3;
        AdvertDetailsHotelOffer.InstallmentEntryPoint installmentEntryPoint5;
        AdvertDetailsHotelOffer.InstallmentEntryPointPart installmentEntryPointPart4;
        int iB2 = 0;
        this.f76070g.setVisibility(installment != null ? 0 : 8);
        AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType highlightType = null;
        AttributedText attributedText = (installment == null || (installmentEntryPoint5 = installment.f75870c) == null || (installmentEntryPointPart4 = installmentEntryPoint5.f75871b) == null) ? null : installmentEntryPointPart4.f75874b;
        TextView textView = this.f76071h;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        AttributedText attributedText2 = (installment == null || (installmentEntryPoint4 = installment.f75870c) == null || (installmentEntryPointPart3 = installmentEntryPoint4.f75872c) == null) ? null : installmentEntryPointPart3.f75874b;
        TextView textView2 = this.f76072i;
        com.avito.android.util.text.j.a(textView2, attributedText2, null);
        B80(textView, (installment == null || (installmentEntryPoint3 = installment.f75870c) == null || (installmentEntryPointPart2 = installmentEntryPoint3.f75871b) == null) ? null : installmentEntryPointPart2.f75875c);
        if (installment != null && (installmentEntryPoint2 = installment.f75870c) != null && (installmentEntryPointPart = installmentEntryPoint2.f75872c) != null) {
            highlightType = installmentEntryPointPart.f75875c;
        }
        B80(textView2, highlightType);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (installment != null && (installmentEntryPoint = installment.f75870c) != null && (num = installmentEntryPoint.f75873d) != null) {
            iB2 = y6.b(num.intValue());
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, iB2, marginLayoutParams.bottomMargin);
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void gl(@Y61.k Y41.a<G0> aVar) {
        this.f76075l = aVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void h4(@Y61.k Y41.a<G0> aVar) {
        this.f76076m = aVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void l(@Y61.l Image image) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        ImageView imageView = this.f76066c;
        com.avito.android.image_loader.glide.utils.b.b(imageView, aVarB.a(imageView), R.drawable.bg_preview_hotel_image, y6.b(16));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.inner_offer.l
    public final void pO(@Y61.k AdvertDetailsHotelOffer.Action action) {
        String str = action.f75866b;
        Button button = this.f76069f;
        if (str != null) {
            b.a aVar = VU.b.f17147t;
            Context context = this.f76065b.getContext();
            aVar.getClass();
            button.setStyle(b.a.b(context, str));
        }
        com.avito.android.lib.design.button.b.a(button, action.f75867c, false);
    }
}
