package com.avito.android.advert.item.consultation;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.developments_advice.remote.model.Phone;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.advert_details.realty.CountCard;
import com.avito.android.remote.model.advert_details.realty.InfoCards;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.remote.model.advert_details.realty.NonNdFormInfo;
import com.avito.android.remote.model.advert_details.realty.Review;
import com.avito.android.remote.model.advert_details.realty.ReviewsCard;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SuperConsultationAfterIceBreakersItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/S;", "Lcom/avito/android/advert/item/consultation/A;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S extends com.avito.konveyor.adapter.b implements A {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f74691B = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public String f74692A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f74693b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f74694c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74695d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f74696e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Button f74697f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f74698g;

    /* renamed from: h, reason: collision with root package name */
    public final Input f74699h;

    /* renamed from: i, reason: collision with root package name */
    public final BaseSelect f74700i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f74701j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f74702k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f74703l;

    /* renamed from: m, reason: collision with root package name */
    public final View f74704m;

    /* renamed from: n, reason: collision with root package name */
    public final Input f74705n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f74706o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f74707p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f74708q;

    /* renamed from: r, reason: collision with root package name */
    public final SimpleDraweeView f74709r;

    /* renamed from: s, reason: collision with root package name */
    public final SimpleDraweeView f74710s;

    /* renamed from: t, reason: collision with root package name */
    public final SimpleDraweeView f74711t;

    /* renamed from: u, reason: collision with root package name */
    public final SimpleDraweeView f74712u;

    /* renamed from: v, reason: collision with root package name */
    public final SimpleDraweeView f74713v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f74714w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f74715x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public List<CallInterval> f74716y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f74717z;

    /* compiled from: SuperConsultationAfterIceBreakersItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Input input = S.this.f74699h;
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            return G0.f406611a;
        }
    }

    public S(@Y61.k View view) {
        super(view);
        this.f74693b = view;
        this.f74694c = (TextView) view.findViewById(R.id.title);
        this.f74695d = (TextView) view.findViewById(R.id.info_title);
        this.f74696e = (TextView) view.findViewById(R.id.info_subtitle);
        this.f74697f = (Button) view.findViewById(R.id.consultation_button);
        this.f74698g = (TextView) view.findViewById(R.id.consultation_disclaimer);
        Input input = (Input) view.findViewById(R.id.input_phone);
        this.f74699h = input;
        this.f74700i = (BaseSelect) view.findViewById(R.id.select_time);
        this.f74701j = (TextView) view.findViewById(R.id.count_title);
        this.f74702k = (TextView) view.findViewById(R.id.count_subtitle);
        this.f74703l = (ImageView) view.findViewById(R.id.count_image);
        this.f74704m = view.findViewById(R.id.info_card_reviews);
        this.f74705n = (Input) view.findViewById(R.id.input_question);
        this.f74706o = (TextView) view.findViewById(R.id.about_consultation);
        this.f74707p = (TextView) view.findViewById(R.id.reviews_title);
        this.f74708q = (TextView) view.findViewById(R.id.reviews_action);
        this.f74709r = (SimpleDraweeView) view.findViewById(R.id.info_card_review_avatar_1);
        this.f74710s = (SimpleDraweeView) view.findViewById(R.id.info_card_review_avatar_2);
        this.f74711t = (SimpleDraweeView) view.findViewById(R.id.info_card_review_avatar_3);
        this.f74712u = (SimpleDraweeView) view.findViewById(R.id.first_image);
        this.f74713v = (SimpleDraweeView) view.findViewById(R.id.second_image);
        this.f74714w = (TextView) view.findViewById(R.id.first_subtitle);
        this.f74715x = (TextView) view.findViewById(R.id.second_subtitle);
        this.f74716y = C42784z0.f406748b;
        this.f74692A = "";
        com.avito.android.lib.design.input.n.c(input, new a());
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void C4(@Y61.l AttributedText attributedText) {
        TextView textView = this.f74698g;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void JQ(@Y61.l String str, @Y61.k Y41.r<? super String, ? super String, ? super CallInterval, ? super String, G0> rVar) {
        Button button = this.f74697f;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.advert.closed.b(17, this, rVar));
        }
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void R9(@Y61.l Landing landing, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        TextView textView = this.f74706o;
        if (landing == null) {
            D6.w(textView);
            return;
        }
        I5.a(textView, landing.getText(), false);
        FV.a.f4720a.f(textView, R.attr.textIconArrowForwardIos, FV.a.f4721b);
        textView.setOnClickListener(new ViewOnClickListenerC28107m(lVar, landing, 1));
        D6.H(textView);
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void b(@Y61.l String str) {
        I5.a(this.f74694c, str, false);
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void kS(@Y61.l SuperFormV4 superFormV4, @Y61.k Y41.a<G0> aVar) {
        NonNdFormInfo info;
        List<InfoCards> infoCards;
        InfoCards infoCards2;
        NonNdFormInfo info2;
        List<InfoCards> infoCards3;
        InfoCards infoCards4;
        ((C28112s) aVar).invoke();
        I5.a(this.f74695d, superFormV4 != null ? superFormV4.getTitle() : null, false);
        I5.a(this.f74696e, superFormV4 != null ? superFormV4.getDescription() : null, false);
        View view = this.f74693b;
        if (superFormV4 != null && (info2 = superFormV4.getInfo()) != null && (infoCards3 = info2.getInfoCards()) != null && (infoCards4 = (InfoCards) C42745f0.K(0, infoCards3)) != null) {
            I5.a(this.f74714w, infoCards4.getTitle(), false);
            UniversalImage image = infoCards4.getImage();
            Image imageQ = image != null ? com.avito.android.actions_sheet.a.q(view, image) : null;
            if (imageQ != null) {
                SimpleDraweeView simpleDraweeView = this.f74712u;
                D6.H(simpleDraweeView);
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
            }
        }
        if (superFormV4 == null || (info = superFormV4.getInfo()) == null || (infoCards = info.getInfoCards()) == null || (infoCards2 = (InfoCards) C42745f0.K(1, infoCards)) == null) {
            return;
        }
        I5.a(this.f74715x, infoCards2.getTitle(), false);
        UniversalImage image2 = infoCards2.getImage();
        Image imageQ2 = image2 != null ? com.avito.android.actions_sheet.a.q(view, image2) : null;
        if (imageQ2 != null) {
            SimpleDraweeView simpleDraweeView2 = this.f74713v;
            D6.H(simpleDraweeView2);
            C35949t5.c(simpleDraweeView2, com.avito.android.image_loader.b.b(imageQ2), null, null, null, 14);
        }
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void mi(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar) {
        int i12;
        List<Review> reviews;
        Review review;
        List<Review> reviews2;
        Review review2;
        List<Review> reviews3;
        Review review3;
        ReviewsCard reviewsCard;
        ReviewsCard reviewsCard2;
        CountCard countCard;
        CountCard countCard2;
        I5.a(this.f74695d, superFormInfo != null ? superFormInfo.getTitle() : null, false);
        I5.a(this.f74696e, superFormInfo != null ? superFormInfo.getDescription() : null, false);
        I5.a(this.f74701j, (superFormInfo == null || (countCard2 = superFormInfo.getCountCard()) == null) ? null : countCard2.getTitle(), false);
        I5.a(this.f74702k, (superFormInfo == null || (countCard = superFormInfo.getCountCard()) == null) ? null : countCard.getSubtitle(), false);
        int iB2 = y6.b(16);
        if (this.f74693b.getResources().getBoolean(R.bool.is_sw720)) {
            iB2 = y6.b(0);
            i12 = R.drawable.realty_consultation_building_large;
        } else {
            i12 = R.drawable.realty_consultation_building;
        }
        ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(this.f74703l));
        aVar2.f169484b = new ImageRequest.d.c(i12);
        aVar2.e(iB2);
        aVar2.c();
        I5.a(this.f74707p, (superFormInfo == null || (reviewsCard2 = superFormInfo.getReviewsCard()) == null) ? null : reviewsCard2.getTitle(), false);
        I5.a(this.f74708q, (superFormInfo == null || (reviewsCard = superFormInfo.getReviewsCard()) == null) ? null : reviewsCard.getActionText(), false);
        if (superFormInfo != null && (reviews3 = superFormInfo.getReviews()) != null && (review3 = (Review) C42745f0.K(0, reviews3)) != null) {
            ImageRequest.a aVarA = C35949t5.a(this.f74709r);
            aVarA.f(review3.getAvatar());
            aVarA.c();
        }
        if (superFormInfo != null && (reviews2 = superFormInfo.getReviews()) != null && (review2 = (Review) C42745f0.K(1, reviews2)) != null) {
            ImageRequest.a aVarA2 = C35949t5.a(this.f74710s);
            aVarA2.f(review2.getAvatar());
            aVarA2.c();
        }
        if (superFormInfo != null && (reviews = superFormInfo.getReviews()) != null && (review = (Review) C42745f0.K(2, reviews)) != null) {
            ImageRequest.a aVarA3 = C35949t5.a(this.f74711t);
            aVarA3.f(review.getAvatar());
            aVarA3.c();
        }
        if (O2.a(superFormInfo != null ? superFormInfo.getReviews() : null)) {
            this.f74704m.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(9, aVar));
        }
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void oW(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar) {
        int i12;
        List<Review> reviews;
        Review review;
        List<Review> reviews2;
        Review review2;
        List<Review> reviews3;
        Review review3;
        ReviewsCard reviewsCard;
        ReviewsCard reviewsCard2;
        CountCard countCard;
        CountCard countCard2;
        this.f74717z = true;
        I5.a(this.f74695d, superFormInfo != null ? superFormInfo.getTitle() : null, false);
        I5.a(this.f74696e, superFormInfo != null ? superFormInfo.getDescription() : null, false);
        I5.a(this.f74701j, (superFormInfo == null || (countCard2 = superFormInfo.getCountCard()) == null) ? null : countCard2.getTitle(), false);
        I5.a(this.f74702k, (superFormInfo == null || (countCard = superFormInfo.getCountCard()) == null) ? null : countCard.getSubtitle(), false);
        FormInput questionInput = superFormInfo != null ? superFormInfo.getQuestionInput() : null;
        Input input = this.f74705n;
        if (questionInput != null) {
            input.setHint(questionInput.getHint());
            D6.H(input);
        } else {
            D6.w(input);
        }
        int iB2 = y6.b(16);
        if (this.f74693b.getResources().getBoolean(R.bool.is_sw720)) {
            iB2 = y6.b(0);
            i12 = R.drawable.realty_consultation_building_large;
        } else {
            i12 = R.drawable.realty_consultation_building;
        }
        ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(this.f74703l));
        aVar2.f169484b = new ImageRequest.d.c(i12);
        aVar2.e(iB2);
        aVar2.c();
        I5.a(this.f74707p, (superFormInfo == null || (reviewsCard2 = superFormInfo.getReviewsCard()) == null) ? null : reviewsCard2.getTitle(), false);
        I5.a(this.f74708q, (superFormInfo == null || (reviewsCard = superFormInfo.getReviewsCard()) == null) ? null : reviewsCard.getActionText(), false);
        if (superFormInfo != null && (reviews3 = superFormInfo.getReviews()) != null && (review3 = (Review) C42745f0.K(0, reviews3)) != null) {
            ImageRequest.a aVarA = C35949t5.a(this.f74709r);
            aVarA.f(review3.getAvatar());
            aVarA.c();
        }
        if (superFormInfo != null && (reviews2 = superFormInfo.getReviews()) != null && (review2 = (Review) C42745f0.K(1, reviews2)) != null) {
            ImageRequest.a aVarA2 = C35949t5.a(this.f74710s);
            aVarA2.f(review2.getAvatar());
            aVarA2.c();
        }
        if (superFormInfo != null && (reviews = superFormInfo.getReviews()) != null && (review = (Review) C42745f0.K(2, reviews)) != null) {
            ImageRequest.a aVarA3 = C35949t5.a(this.f74711t);
            aVarA3.f(review.getAvatar());
            aVarA3.c();
        }
        if (O2.a(superFormInfo != null ? superFormInfo.getReviews() : null)) {
            this.f74704m.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(8, aVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.consultation.A
    public final void p5(@Y61.k P2<? super ContactInfoResponse> p22) {
        boolean z12 = p22 instanceof P2.c;
        BaseSelect baseSelect = this.f74700i;
        if (z12) {
            if (baseSelect != null) {
                Input.t(baseSelect, "", false, 6);
                baseSelect.setLoading(true);
                return;
            }
            return;
        }
        if (!(p22 instanceof P2.b)) {
            if (!(p22 instanceof P2.a) || baseSelect == null) {
                return;
            }
            baseSelect.setLoading(false);
            D6.w(baseSelect);
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
                    Input.t(this.f74699h, C43066x.h0(next.getPhone(), "7", false) ? next.getPhone().substring(1) : next.getPhone(), false, 6);
                }
            }
        }
        if (baseSelect != null) {
            baseSelect.setLoading(false);
            List<CallInterval> listC = contactInfoResponse.c();
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
            this.f74716y = listC;
            ((CallInterval) C42745f0.E(listC)).f136192b = true;
            if (O2.a(this.f74716y)) {
                for (CallInterval callInterval : this.f74716y) {
                    if (callInterval.f136192b) {
                        Input.t(baseSelect, T.a(callInterval), false, 6);
                        D6.H(baseSelect);
                        baseSelect.setOnClickListener(new B(this, 1));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            D6.w(baseSelect);
        }
        this.f74692A = contactInfoResponse.getName();
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void ut(@Y61.l AttributedText attributedText, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f74706o;
        if (attributedText == null) {
            D6.w(textView);
            return;
        }
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        FV.a.f4720a.f(textView, R.attr.textIconArrowForwardIos, FV.a.f4721b);
        textView.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(10, aVar));
        D6.H(textView);
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void j(@Y61.l String str) {
    }
}
