package com.avito.android.mandatory_verification.items.accountVerification;

import LV.c;
import VU.a;
import VU.b;
import Y41.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mandatory_verification.items.accountVerification.MandatoryVerificationAccountVerificationItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MandatoryVerificationAccountVerificationItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/accountVerification/k;", "Lcom/avito/android/mandatory_verification/items/accountVerification/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f184625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f184626c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f184627d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f184628e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f184629f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f184630g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f184631h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f184632i;

    /* compiled from: MandatoryVerificationAccountVerificationItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MandatoryVerificationAccountVerificationItem.Button f184633l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f184634m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MandatoryVerificationAccountVerificationItem.Button button, l<? super DeepLink, G0> lVar) {
            super(0);
            this.f184633l = button;
            this.f184634m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f184633l.f184612c;
            if (deepLink != null) {
                this.f184634m.invoke(deepLink);
            }
            return G0.f406611a;
        }
    }

    public k(@Y61.k Y41.a aVar, @Y61.k View view) {
        super(view);
        this.f184625b = view;
        this.f184626c = aVar;
        this.f184627d = view.getContext();
        this.f184628e = (TextView) view.findViewById(R.id.account_verification_title);
        this.f184629f = (TextView) view.findViewById(R.id.account_verification_checkmark);
        this.f184630g = (TextView) view.findViewById(R.id.account_verification_description);
        this.f184631h = (Button) view.findViewById(R.id.account_verification_button);
        this.f184632i = (TextView) view.findViewById(R.id.error_message);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f184626c.invoke();
    }

    @Override // com.avito.android.mandatory_verification.items.accountVerification.j
    public final void v80(@Y61.k MandatoryVerificationAccountVerificationItem mandatoryVerificationAccountVerificationItem, @Y61.k l<? super DeepLink, G0> lVar) {
        G0 g02;
        I5.a(this.f184628e, mandatoryVerificationAccountVerificationItem.f184605c, false);
        I5.a(this.f184630g, mandatoryVerificationAccountVerificationItem.f184606d, false);
        if (mandatoryVerificationAccountVerificationItem.f184608f) {
            TextView textView = this.f184629f;
            D6.H(textView);
            FV.a.f4720a.getClass();
            FV.a.c(textView, R.attr.textIconDoneFilled);
        }
        Button button = this.f184631h;
        String str = mandatoryVerificationAccountVerificationItem.f184609g;
        MandatoryVerificationAccountVerificationItem.Button button2 = mandatoryVerificationAccountVerificationItem.f184607e;
        if (button2 != null) {
            button.setState(new UU.a(button2.f184611b, null, false, false, false, new a(button2, lVar), null, null, null, false, 990, null));
            b.a aVar = VU.b.f17147t;
            int iD2 = com.avito.android.lib.util.f.d(button2.f184613d);
            aVar.getClass();
            Context context = this.f184627d;
            VU.b bVar = (VU.b) c.a.a(aVar, context, iD2);
            button.setStyle(VU.b.a(bVar, str != null ? new a.C1180a(androidx.core.content.d.getDrawable(context, R.drawable.bg_button_error)) : bVar.f17149a, null, null, null, null, 0, 0, 0, 0, null, 262142));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(button);
        }
        I5.a(this.f184632i, str, false);
        Integer num = mandatoryVerificationAccountVerificationItem.f184610h;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.f184625b;
            D6.c(view, null, Integer.valueOf(D6.j(view, iIntValue)), null, null, 13);
        }
    }
}
