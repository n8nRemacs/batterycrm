package com.avito.android.advert_core.pp_recall_promo;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsPpRecallPromoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/n;", "Lcom/avito/android/advert_core/pp_recall_promo/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f83986n = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f83987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f83988c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f83989d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageButton f83990e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f83991f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f83992g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f83993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f83994i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f83995j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f83996k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f83997l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a f83998m;

    public n(@Y61.k View view) {
        super(view);
        this.f83987b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.recall_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f83988c = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.phone_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f83989d = input;
        View viewFindViewById3 = view.findViewById(R.id.image_close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f83990e = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recall_policy);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83991f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83992g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.description_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83993h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.subtitle_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83994i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.advert_details_pp_recall_promoblock_root);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f83995j = (ViewGroup) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.image);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f83996k = (SimpleDraweeView) viewFindViewById9;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        a aVar = new a(input, this);
        input.b(aVar);
        this.f83998m = aVar;
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void Gt(@Y61.k final List list, final boolean z12) {
        this.f83990e.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_core.pp_recall_promo.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z13 = z12;
                n nVar = this.f83980b;
                if (z13) {
                    Y41.l<? super DeepLink, G0> lVar = nVar.f83997l;
                    if (lVar != null) {
                        ((g) lVar).invoke(new NoMatchLink());
                        return;
                    }
                    return;
                }
                int i12 = n.f83986n;
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(nVar.f83987b, 0, 2, null);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 3);
                dVar.setCancelable(true);
                dVar.setCanceledOnTouchOutside(true);
                dVar.C(R.layout.advert_details_pp_recall_dialog_layout, new m(dVar, list, nVar));
                com.avito.android.lib.util.g.a(dVar);
            }
        });
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void Zk(@Y61.k Y41.l lVar, @Y61.k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new SE0.a(8, lVar));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f83991f;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void b(@Y61.k String str) {
        I5.a(this.f83992g, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f83997l = null;
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void jD(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l UniversalColor universalColor) {
        G0 g02;
        Color colorDark;
        ViewGroup viewGroup = this.f83995j;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = this.itemView.getContext();
            a.C5276a.C5277a c5277a = new a.C5276a.C5277a(this.itemView.getContext(), iIntValue, 0, 4, null);
            c5277a.f179264a = y6.b(20);
            viewGroup.setBackground(new com.avito.android.lib.design.gradient.a(context, c5277a.a()));
            g02 = G0.f406611a;
        } else if (num2 != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.itemView.getContext(), num2.intValue(), 0, 4, null);
            c5275a.f179264a = y6.b(20);
            viewGroup.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            g02 = G0.f406611a;
        } else {
            g02 = null;
            gradientDrawableE = null;
            GradientDrawable gradientDrawableE = null;
            if (universalColor != null) {
                int iB2 = y6.b(20);
                Color color = universalColor.getColor();
                if (color != null && (colorDark = universalColor.getColorDark()) != null) {
                    if (!com.avito.android.lib.util.darkTheme.c.b(this.f83987b)) {
                        color = colorDark;
                    }
                    gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
                    gradientDrawableE.setColor(color.getValue());
                    gradientDrawableE.setCornerRadius(iB2);
                }
                viewGroup.setBackground(gradientDrawableE);
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            D6.D(viewGroup, R.drawable.pp_recall_bg);
        }
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void kg(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f83997l = lVar;
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void na(@Y61.k UniversalImage universalImage, int i12, int i13, int i14, int i15) {
        SimpleDraweeView simpleDraweeView = this.f83996k;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        com.avito.android.image_loader.a aVarB = imageDependsOnThemeOrDefault != null ? com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault) : null;
        if (aVarB == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        C35949t5.c(this.f83996k, aVarB, null, null, null, 14);
        D6.b(simpleDraweeView, Integer.valueOf(y6.b(i14)), Integer.valueOf(y6.b(i12)), Integer.valueOf(y6.b(i15)), Integer.valueOf(y6.b(i13)));
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void pn(@Y61.k String str, @Y61.k Y41.l<? super String, G0> lVar) {
        Button button = this.f83988c;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(14, lVar, this));
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void q9(@Y61.k String str) {
        this.f83994i.setText(str);
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void setLoading(boolean z12) {
        Button button = this.f83988c;
        button.setLoading(z12);
        button.setEnabled(!z12);
        this.f83989d.setEnabled(!z12);
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void tb(@Y61.k Y41.l lVar, @Y61.k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new SE0.a(9, lVar));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f83993h;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.k
    public final void z4(@Y61.k String str) {
        Input input = this.f83989d;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        a aVar = this.f83998m;
        input.h(aVar);
        Input.t(input, str, false, 6);
        input.b(aVar);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f83999b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f84000c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f84001d;

        public a(Input input, n nVar) {
            this.f84000c = input;
            this.f84001d = nVar;
            this.f83999b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f84000c.getDeformattedText();
            if (L.f(deformattedText, this.f83999b)) {
                return;
            }
            int i12 = n.f83986n;
            this.f84001d.getClass();
            this.f83999b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
