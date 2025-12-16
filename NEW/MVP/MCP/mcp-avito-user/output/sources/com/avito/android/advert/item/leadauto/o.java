package com.avito.android.advert.item.leadauto;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.P2;
import j30.C42188a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: AutoNewCarsLeadFormItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leadauto/o;", "Lcom/avito/android/advert/item/leadauto/n;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f77304j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f77305b;

    /* renamed from: c, reason: collision with root package name */
    public final Input f77306c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f77307d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f77308e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f77309f;

    /* renamed from: g, reason: collision with root package name */
    public final Button f77310g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f77311h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f77312i;

    /* compiled from: AutoNewCarsLeadFormItemView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert/item/leadauto/o$a;", "", "<init>", "()V", "", "PHONE_NUMBER_PREFIX", "Ljava/lang/String;", "", "VALID_PHONE_LENGTH", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public o(@Y61.k View view) {
        super(view);
        this.f77305b = view;
        this.f77306c = (Input) view.findViewById(R.id.input_phone);
        this.f77307d = (TextView) view.findViewById(R.id.info_title);
        this.f77308e = (TextView) view.findViewById(R.id.info_subtitle);
        this.f77309f = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f77310g = (Button) view.findViewById(R.id.consultation_button);
        this.f77311h = (TextView) view.findViewById(R.id.agreement);
        this.f77312i = (TextView) view.findViewById(R.id.leave_request);
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void Jm(@Y61.l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.f77305b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f77309f;
        Uri uriD = C35829k2.c(imageQ, simpleDraweeView, 1, 22).d();
        C35949t5.a(simpleDraweeView).b();
        if (uriD == null) {
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.advert.item.leadauto.n
    @Y61.k
    public final String OI() {
        return this.f77306c.getDeformattedText();
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void Y0(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f77310g;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.advert.closed.b(29, this, aVar));
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void Z60(@Y61.k Y41.a<G0> aVar) {
        this.f77306c.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(20, aVar));
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void b(@Y61.k String str) {
        this.f77307d.setText(str);
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void iN(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f77311h, attributedText, null);
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void in(@Y61.k String str) {
        this.f77312i.setText(str);
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final void j(@Y61.k String str) {
        this.f77308e.setText(str);
    }

    @Override // com.avito.android.advert.item.leadauto.n
    public final boolean o30() {
        return this.f77306c.getDeformattedText().length() == 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.leadauto.n
    public final void p5(@Y61.k P2<? super C42188a> p22) {
        if (p22 instanceof P2.b) {
            String phone = ((C42188a) ((P2.b) p22).f318720a).getPhone();
            if (C43066x.h0(phone, "7", false)) {
                phone = phone.substring(1);
            }
            Input.t(this.f77306c, phone, false, 6);
        }
    }
}
