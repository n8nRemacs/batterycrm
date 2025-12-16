package com.avito.android.comfortable_deal.deal.item.digitalregistration.big;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.btob_business_trip.screens.selectItemScreen.t;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xp.C49980a;

/* compiled from: DigitalRegistrationBigBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/k;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f121389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f121390c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f121391d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f121392e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f121393f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f121394g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f121395h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121396i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final c f121397j;

    /* compiled from: DigitalRegistrationBigBannerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = m.this.f121395h;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DigitalRegistrationBigBannerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = m.this.f121395h;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public m(@Y61.k View view) {
        super(view);
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.submit_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f121389b = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.phone_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f121390c = input;
        View viewFindViewById3 = view.findViewById(R.id.text_disclaimer);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recall_description_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.digital_registration_card);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f121391d = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.safe_deal_card);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f121392e = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.agents_card);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f121393f = viewFindViewById7;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        c cVar = new c(input, this);
        input.b(cVar);
        this.f121397j = cVar;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        com.avito.android.util.text.j.a(textView, C49980a.a(context, new a()), null);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        b bVar = new b();
        AttributedText attributedText = new AttributedText(context.getString(R.string.client_room_digital_registration_description_attributed_base), C42745f0.U(new FontAttribute("text1", context.getString(R.string.client_room_digital_registration_big_banner_description), C42745f0.U(new FontParameter.TextStyleParameter(null, "m20"), new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK))), new LinkAttribute("link1", context.getString(R.string.client_room_digital_registration_additional_description), context.getString(R.string.client_room_digital_registration_banner_additional_link_description), C42745f0.U(new FontParameter.TextStyleParameter(null, "m20"), new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), FontParameter.UnderlineParameter.INSTANCE))), 1);
        attributedText.setOnUrlClickListener(new t(6, bVar));
        com.avito.android.util.text.j.a(textView2, attributedText, null);
        final String string = context.getString(R.string.client_room_digital_registration_dialog_cards_link);
        final int i12 = 0;
        viewFindViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.digitalregistration.big.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f121387c;

            {
                this.f121387c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        m mVar = this.f121387c;
                        Y41.l<? super String, G0> lVar = mVar.f121395h;
                        if (lVar != null) {
                            lVar.invoke(string);
                        }
                        Y41.a<G0> aVar = mVar.f121396i;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        m mVar2 = this.f121387c;
                        Y41.l<? super String, G0> lVar2 = mVar2.f121395h;
                        if (lVar2 != null) {
                            lVar2.invoke(string);
                        }
                        Y41.a<G0> aVar2 = mVar2.f121396i;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        m mVar3 = this.f121387c;
                        Y41.l<? super String, G0> lVar3 = mVar3.f121395h;
                        if (lVar3 != null) {
                            lVar3.invoke(string);
                        }
                        Y41.a<G0> aVar3 = mVar3.f121396i;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        viewFindViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.digitalregistration.big.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f121387c;

            {
                this.f121387c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        m mVar = this.f121387c;
                        Y41.l<? super String, G0> lVar = mVar.f121395h;
                        if (lVar != null) {
                            lVar.invoke(string);
                        }
                        Y41.a<G0> aVar = mVar.f121396i;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        m mVar2 = this.f121387c;
                        Y41.l<? super String, G0> lVar2 = mVar2.f121395h;
                        if (lVar2 != null) {
                            lVar2.invoke(string);
                        }
                        Y41.a<G0> aVar2 = mVar2.f121396i;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        m mVar3 = this.f121387c;
                        Y41.l<? super String, G0> lVar3 = mVar3.f121395h;
                        if (lVar3 != null) {
                            lVar3.invoke(string);
                        }
                        Y41.a<G0> aVar3 = mVar3.f121396i;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        viewFindViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.digitalregistration.big.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f121387c;

            {
                this.f121387c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        m mVar = this.f121387c;
                        Y41.l<? super String, G0> lVar = mVar.f121395h;
                        if (lVar != null) {
                            lVar.invoke(string);
                        }
                        Y41.a<G0> aVar = mVar.f121396i;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        m mVar2 = this.f121387c;
                        Y41.l<? super String, G0> lVar2 = mVar2.f121395h;
                        if (lVar2 != null) {
                            lVar2.invoke(string);
                        }
                        Y41.a<G0> aVar2 = mVar2.f121396i;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        m mVar3 = this.f121387c;
                        Y41.l<? super String, G0> lVar3 = mVar3.f121395h;
                        if (lVar3 != null) {
                            lVar3.invoke(string);
                        }
                        Y41.a<G0> aVar3 = mVar3.f121396i;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.k
    public final void LZ(@Y61.k Y41.a<G0> aVar) {
        this.f121396i = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.k
    public final void ep(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f121395h = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f121394g = null;
        this.f121395h = null;
        this.f121396i = null;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.k
    public final void q6(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f121389b.setOnClickListener(new com.avito.android.body_condition.h(18, lVar, this));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.k
    public final void rs(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f121394g = lVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.k
    public final void z4(@Y61.k String str) {
        Input input = this.f121390c;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        c cVar = this.f121397j;
        input.h(cVar);
        Input.t(input, str, false, 6);
        input.b(cVar);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f121400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f121401c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f121402d;

        public c(Input input, m mVar) {
            this.f121401c = input;
            this.f121402d = mVar;
            this.f121400b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f121401c.getDeformattedText();
            if (L.f(deformattedText, this.f121400b)) {
                return;
            }
            Y41.l<? super String, G0> lVar = this.f121402d.f121394g;
            if (lVar != null) {
                lVar.invoke(deformattedText);
            }
            this.f121400b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
