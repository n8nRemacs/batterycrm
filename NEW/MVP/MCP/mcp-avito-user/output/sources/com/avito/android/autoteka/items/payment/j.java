package com.avito.android.autoteka.items.payment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.autoteka.model.DiscountWidget;
import com.avito.android.remote.autoteka.model.PriceWidget;
import com.avito.android.remote.autoteka.model.PromoCodeStatus;
import com.avito.android.remote.autoteka.model.PromoCodeWidget;
import com.avito.android.remote.autoteka.model.TotalWidget;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/payment/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/payment/g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f96866t = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f96867b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f96868c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f96869d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f96870e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f96871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f96872g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f96873h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final StrikethroughTextView f96874i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f96875j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f96876k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LinearLayout f96877l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f96878m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final View f96879n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Input f96880o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Button f96881p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f96882q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public b f96883r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final h f96884s;

    /* compiled from: PaymentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96885a;

        static {
            int[] iArr = new int[PromoCodeStatus.values().length];
            try {
                iArr[PromoCodeStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoCodeStatus.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96885a = iArr;
            int[] iArr2 = new int[PaymentItem.LoadingVariant.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PaymentItem.LoadingVariant loadingVariant = PaymentItem.LoadingVariant.f96848b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PaymentItem.LoadingVariant loadingVariant2 = PaymentItem.LoadingVariant.f96848b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: PaymentView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/autoteka/items/payment/j$b", "Lcom/avito/android/util/u5;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC35956u5 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PaymentItem.PromoCodeState f96886b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f96887c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f96888d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(PaymentItem.PromoCodeState promoCodeState, j jVar, Y41.l<? super String, G0> lVar) {
            this.f96886b = promoCodeState;
            this.f96887c = jVar;
            this.f96888d = lVar;
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) throws Resources.NotFoundException {
            boolean zF2 = L.f(this.f96886b.f96853b, charSequence.toString());
            j jVar = this.f96887c;
            if (!zF2) {
                Input input = jVar.f96880o;
                Input.f179303W.getClass();
                input.setState(Input.f179304a0);
                jVar.B80("", PromoCodeStatus.INITIAL);
            }
            this.f96888d.invoke(charSequence.toString());
            jVar.f96881p.setAppearance(R.style.Re23_Button_PrimarySmall);
            jVar.f96881p.setText(R.string.autoteka_apply);
            if (charSequence.toString().length() == 0) {
                jVar.f96881p.setEnabled(false);
                jVar.f96881p.setClickable(false);
            } else {
                jVar.f96881p.setEnabled(true);
                jVar.f96881p.setClickable(true);
            }
        }
    }

    public j(@k View view) {
        super(view);
        this.f96867b = (TextView) this.itemView.findViewById(R.id.autoteka_payment_title);
        this.f96868c = (TextView) this.itemView.findViewById(R.id.autoteka_payment_description);
        this.f96869d = (DescriptionParameterItem) this.itemView.findViewById(R.id.autoteka_payment_price);
        this.f96870e = (LinearLayout) this.itemView.findViewById(R.id.autoteka_payment_discounts);
        this.f96871f = (LinearLayout) this.itemView.findViewById(R.id.autoteka_payment_dynamic_discounts);
        this.f96872g = (SimpleDraweeView) this.itemView.findViewById(R.id.autoteka_payment_image);
        View viewFindViewById = this.itemView.findViewById(R.id.total_container);
        this.f96873h = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.strike_through_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f96874i = (StrikethroughTextView) viewFindViewById2;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.discount_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f96875j = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.total);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f96876k = (DescriptionParameterItem) viewFindViewById4;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.autoteka_payment_total_skeleton_view_root);
        this.f96877l = linearLayout;
        View viewFindViewById5 = linearLayout.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f96878m = (DescriptionParameterItem) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.autoteka_payment_promocode_view_root);
        this.f96879n = viewFindViewById6;
        this.f96880o = (Input) viewFindViewById6.findViewById(R.id.input);
        this.f96881p = (Button) viewFindViewById6.findViewById(R.id.button);
        this.f96882q = view.getContext();
        this.f96884s = new h(0);
    }

    public final void B80(String str, PromoCodeStatus promoCodeStatus) {
        TextView textView = (TextView) this.f96879n.findViewById(R.id.hint);
        if (str == null || str.length() == 0) {
            D6.w(textView);
            return;
        }
        textView.setText(str);
        D6.G(textView, true);
        int i12 = a.f96885a[promoCodeStatus.ordinal()];
        Context context = this.f96882q;
        textView.setTextColor(i12 != 1 ? i12 != 2 ? C35835l0.d(R.attr.black, context) : C35835l0.d(R.attr.red600, context) : C35835l0.d(R.attr.green800, context));
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void YN(@k PriceWidget priceWidget) {
        DescriptionParameterItem descriptionParameterItem = this.f96869d;
        descriptionParameterItem.getLeftTextView().setText(priceWidget.getLabel());
        descriptionParameterItem.getRightTextView().setText(priceWidget.getValue());
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void Zt(boolean z12, @k List<DiscountWidget> list, @k PaymentItem.LoadingVariant loadingVariant) {
        LinearLayout linearLayout = z12 ? this.f96871f : this.f96870e;
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        if (list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        if (z12 && loadingVariant == PaymentItem.LoadingVariant.f96849c) {
            return;
        }
        for (DiscountWidget discountWidget : list) {
            Context context = this.f96882q;
            DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(context, null, 0, 0, 14, null);
            descriptionParameterItem.getLeftTextView().setText(discountWidget.getLabel());
            descriptionParameterItem.getLeftTextView().setTextAppearance(C35835l0.j(R.attr.textM1, context));
            descriptionParameterItem.getRightTextView().setText(discountWidget.getValue());
            descriptionParameterItem.getRightTextView().setTextAppearance(C35835l0.j(R.attr.textM1, context));
            descriptionParameterItem.getRightTextView().setTextColor(C35835l0.d(R.attr.green800, context));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, y6.b(5), 0, y6.b(5));
            linearLayout.addView(descriptionParameterItem, layoutParams);
        }
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void b(@k String str) {
        this.f96867b.setText(str);
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void hw(@k TotalWidget totalWidget, @k PaymentItem.LoadingVariant loadingVariant) {
        this.f96878m.getLeftTextView().setText(this.f96882q.getString(R.string.autoteka_payment_total));
        PaymentItem.LoadingVariant loadingVariant2 = PaymentItem.LoadingVariant.f96849c;
        View view = this.f96873h;
        LinearLayout linearLayout = this.f96877l;
        if (loadingVariant == loadingVariant2) {
            linearLayout.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        this.f96874i.setText(totalWidget.getStrikeThrough());
        this.f96875j.setText(totalWidget.getValue());
        this.f96876k.getLeftTextView().setText(totalWidget.getLabel());
        linearLayout.setVisibility(8);
        view.setVisibility(0);
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void q(@l AttributedText attributedText) {
        String text = attributedText != null ? attributedText.getText() : null;
        int i12 = (text == null || text.length() == 0) ? 8 : 0;
        TextView textView = this.f96868c;
        textView.setVisibility(i12);
        if (attributedText != null) {
            com.avito.android.util.text.j.c(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void yA(@k PaymentItem.PromoCodeState promoCodeState, @l PromoCodeWidget promoCodeWidget, @k PaymentItem.LoadingVariant loadingVariant, @k final Y41.a<G0> aVar, @k Y41.l<? super String, G0> lVar) throws Resources.NotFoundException {
        G0 g02 = null;
        View view = this.f96879n;
        if (promoCodeWidget != null) {
            b bVar = this.f96883r;
            Input input = this.f96880o;
            if (bVar != null) {
                input.h(bVar);
            }
            this.f96883r = new b(promoCodeState, this, lVar);
            D6.G(view, true);
            String title = promoCodeWidget.getTitle();
            TextView textView = (TextView) view.findViewById(R.id.title);
            if (title == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(title);
            }
            B80(promoCodeState.f96854c, promoCodeWidget.getStatus());
            String str = promoCodeState.f96853b;
            String str2 = promoCodeState.f96854c;
            Input.t(input, str, false, 6);
            input.setHint(promoCodeWidget.getPlaceholder());
            input.setEnabled(loadingVariant == PaymentItem.LoadingVariant.f96850d && promoCodeWidget.getStatus() != PromoCodeStatus.SUCCESS);
            if (promoCodeWidget.getStatus() != PromoCodeStatus.ERROR || str2.length() <= 0) {
                Input.f179303W.getClass();
                input.setState(Input.f179304a0);
            } else {
                Input.f179303W.getClass();
                input.setState(Input.f179305b0);
            }
            input.a(new InputFilter.AllCaps());
            input.a(this.f96884s);
            String str3 = promoCodeState.f96853b;
            PromoCodeStatus status = promoCodeWidget.getStatus();
            Button button = this.f96881p;
            button.setEnabled(false);
            button.setClickable(false);
            button.setLoading(false);
            int iOrdinal = loadingVariant.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    button.setAppearance(R.style.Re23_Button_PrimarySmall);
                    button.setText(R.string.autoteka_delete);
                    button.setLoading(true);
                    button.setEnabled(true);
                } else if (iOrdinal == 2) {
                    if (str3.length() == 0) {
                        button.setAppearance(R.style.Re23_Button_PrimarySmall);
                        button.setText(R.string.autoteka_apply);
                    } else {
                        if (status == PromoCodeStatus.SUCCESS) {
                            button.setAppearance(R.style.Re23_Button_SecondarySmall);
                            button.setText(R.string.autoteka_delete);
                        } else {
                            button.setAppearance(R.style.Re23_Button_PrimarySmall);
                            button.setText(R.string.autoteka_apply);
                        }
                        button.setEnabled(true);
                        button.setClickable(true);
                    }
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.autoteka.items.payment.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            j jVar = this.f96864b;
                            jVar.f96880o.f();
                            ((c) aVar).invoke();
                            K2.f(jVar.f96881p, 3);
                        }
                    });
                }
            } else if (status == PromoCodeStatus.SUCCESS) {
                button.setAppearance(R.style.Re23_Button_SecondarySmall);
                button.setText(R.string.autoteka_delete);
            } else {
                button.setAppearance(R.style.Re23_Button_PrimarySmall);
                button.setText(R.string.autoteka_apply);
            }
            b bVar2 = this.f96883r;
            if (bVar2 != null) {
                input.b(bVar2);
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            D6.w(view);
        }
    }

    @Override // com.avito.android.autoteka.items.payment.g
    public final void z1(@l Image image) {
        this.f96872g.setVisibility(image != null ? 0 : 8);
        if (image != null) {
            C35949t5.c(this.f96872g, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        }
    }
}
