package com.avito.android.advert.item.consultation.secondary;

import Y41.p;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.developments_advice.remote.model.Phone;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_details.realty.InfoCards;
import com.avito.android.remote.model.advert_details.realty.NonNdForm;
import com.avito.android.remote.model.advert_details.realty.NonNdFormInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.P2;
import com.avito.android.util.text.j;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SecondaryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/secondary/h;", "Lcom/avito/android/advert/item/consultation/secondary/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74814b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f74815c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74816d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f74817e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Button f74818f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f74819g;

    /* renamed from: h, reason: collision with root package name */
    public final Input f74820h;

    /* renamed from: i, reason: collision with root package name */
    public final SimpleDraweeView f74821i;

    /* renamed from: j, reason: collision with root package name */
    public final SimpleDraweeView f74822j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f74823k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f74824l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public String f74825m;

    /* compiled from: SecondaryItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Input input = h.this.f74820h;
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        this.f74814b = view;
        this.f74815c = (TextView) view.findViewById(R.id.title);
        this.f74816d = (TextView) view.findViewById(R.id.info_title);
        this.f74817e = (TextView) view.findViewById(R.id.info_subtitle);
        this.f74818f = (Button) view.findViewById(R.id.consultation_button);
        this.f74819g = (TextView) view.findViewById(R.id.consultation_disclaimer);
        Input input = (Input) view.findViewById(R.id.input_phone);
        this.f74820h = input;
        this.f74821i = (SimpleDraweeView) view.findViewById(R.id.first_image);
        this.f74822j = (SimpleDraweeView) view.findViewById(R.id.second_image);
        this.f74823k = (TextView) view.findViewById(R.id.first_subtitle);
        this.f74824l = (TextView) view.findViewById(R.id.second_subtitle);
        this.f74825m = "";
        n.c(input, new a());
    }

    @Override // com.avito.android.advert.item.consultation.secondary.g
    public final void C4(@l AttributedText attributedText) {
        TextView textView = this.f74819g;
        j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.advert.item.consultation.secondary.g
    public final void Ov(@k p pVar, @l String str) {
        Button button = this.f74818f;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.advert.closed.b(18, this, pVar));
        }
    }

    @Override // com.avito.android.advert.item.consultation.secondary.g
    public final void W20(@l NonNdForm nonNdForm) {
        NonNdFormInfo info;
        List<InfoCards> infoCards;
        InfoCards infoCards2;
        NonNdFormInfo info2;
        List<InfoCards> infoCards3;
        InfoCards infoCards4;
        I5.a(this.f74816d, nonNdForm != null ? nonNdForm.getTitle() : null, false);
        I5.a(this.f74817e, nonNdForm != null ? nonNdForm.getDescription() : null, false);
        View view = this.f74814b;
        if (nonNdForm != null && (info2 = nonNdForm.getInfo()) != null && (infoCards3 = info2.getInfoCards()) != null && (infoCards4 = (InfoCards) C42745f0.K(0, infoCards3)) != null) {
            I5.a(this.f74823k, infoCards4.getTitle(), false);
            UniversalImage image = infoCards4.getImage();
            Image imageQ = image != null ? com.avito.android.actions_sheet.a.q(view, image) : null;
            if (imageQ != null) {
                SimpleDraweeView simpleDraweeView = this.f74821i;
                D6.H(simpleDraweeView);
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
            }
        }
        if (nonNdForm == null || (info = nonNdForm.getInfo()) == null || (infoCards = info.getInfoCards()) == null || (infoCards2 = (InfoCards) C42745f0.K(1, infoCards)) == null) {
            return;
        }
        I5.a(this.f74824l, infoCards2.getTitle(), false);
        UniversalImage image2 = infoCards2.getImage();
        Image imageQ2 = image2 != null ? com.avito.android.actions_sheet.a.q(view, image2) : null;
        if (imageQ2 != null) {
            SimpleDraweeView simpleDraweeView2 = this.f74822j;
            D6.H(simpleDraweeView2);
            C35949t5.c(simpleDraweeView2, com.avito.android.image_loader.b.b(imageQ2), null, null, null, 14);
        }
    }

    @Override // com.avito.android.advert.item.consultation.secondary.g
    public final void b(@l String str) {
        I5.a(this.f74815c, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.consultation.secondary.g
    public final void p5(@k P2<? super ContactInfoResponse> p22) {
        if (p22 instanceof P2.c) {
            return;
        }
        if (!(p22 instanceof P2.b)) {
            boolean z12 = p22 instanceof P2.a;
            return;
        }
        ContactInfoResponse contactInfoResponse = (ContactInfoResponse) ((P2.b) p22).f318720a;
        List<Phone> listD = contactInfoResponse.d();
        if (listD != null) {
            Iterator<Phone> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Phone next = it.next();
                if (next.getIsConfirmed()) {
                    Input.t(this.f74820h, C43066x.h0(next.getPhone(), "7", false) ? next.getPhone().substring(1) : next.getPhone(), false, 6);
                }
            }
        }
        this.f74825m = contactInfoResponse.getName();
    }
}
