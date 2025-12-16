package com.avito.android.advert.item.consultation;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.developments_advice.remote.model.Phone;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.remote.model.advert_details.realty.SuperFormInfo;
import com.avito.android.remote.model.advert_details.realty.SuperFormV4;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ConsultationAfterIceBreakersItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/D;", "Lcom/avito/android/advert/item/consultation/A;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D extends com.avito.konveyor.adapter.b implements A {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f74656l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f74657b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f74658c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74659d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Button f74660e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f74661f;

    /* renamed from: g, reason: collision with root package name */
    public final Input f74662g;

    /* renamed from: h, reason: collision with root package name */
    public final Input f74663h;

    /* renamed from: i, reason: collision with root package name */
    public final Input f74664i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public List<CallInterval> f74665j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public String f74666k;

    /* compiled from: ConsultationAfterIceBreakersItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Input input = D.this.f74662g;
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            return G0.f406611a;
        }
    }

    public D(@Y61.k View view) {
        super(view);
        this.f74657b = view;
        this.f74658c = (TextView) view.findViewById(R.id.title);
        this.f74659d = (TextView) view.findViewById(R.id.subtitle);
        this.f74660e = (Button) view.findViewById(R.id.consultation_button);
        this.f74661f = (TextView) view.findViewById(R.id.consultation_disclaimer);
        Input input = (Input) view.findViewById(R.id.input_phone);
        this.f74662g = input;
        this.f74663h = (Input) view.findViewById(R.id.select_time);
        this.f74664i = (Input) view.findViewById(R.id.input_question);
        this.f74665j = C42784z0.f406748b;
        this.f74666k = "";
        com.avito.android.lib.design.input.n.c(input, new a());
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void C4(@Y61.l AttributedText attributedText) {
        TextView textView = this.f74661f;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void JQ(@Y61.l String str, @Y61.k Y41.r<? super String, ? super String, ? super CallInterval, ? super String, G0> rVar) {
        Button button = this.f74660e;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.advert.closed.b(15, this, rVar));
        }
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void b(@Y61.l String str) {
        I5.a(this.f74658c, str, false);
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void j(@Y61.l String str) {
        I5.a(this.f74659d, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.consultation.A
    public final void p5(@Y61.k P2<? super ContactInfoResponse> p22) {
        boolean z12 = p22 instanceof P2.c;
        Input input = this.f74663h;
        if (z12) {
            Input.t(input, "", false, 6);
            input.setLoading(true);
            return;
        }
        if (!(p22 instanceof P2.b)) {
            if (p22 instanceof P2.a) {
                input.setLoading(false);
                D6.w(input);
                return;
            }
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
                    Input.t(this.f74662g, C43066x.h0(next.getPhone(), "7", false) ? next.getPhone().substring(1) : next.getPhone(), false, 6);
                }
            }
        }
        input.setLoading(false);
        List<CallInterval> listC = contactInfoResponse.c();
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        this.f74665j = listC;
        ((CallInterval) C42745f0.E(listC)).f136192b = true;
        if (O2.a(this.f74665j)) {
            for (CallInterval callInterval : this.f74665j) {
                if (callInterval.f136192b) {
                    Input.t(input, E.a(callInterval), false, 6);
                    D6.H(input);
                    input.setOnClickListener(new B(this, 0));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        D6.w(input);
        this.f74666k = contactInfoResponse.getName();
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void R9(@Y61.l Landing landing, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void kS(@Y61.l SuperFormV4 superFormV4, @Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void mi(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void oW(@Y61.l SuperFormInfo superFormInfo, @Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.advert.item.consultation.A
    public final void ut(@Y61.l AttributedText attributedText, @Y61.k Y41.a<G0> aVar) {
    }
}
