package com.avito.android.advert.item.consultation;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.advert_details.realty.IncomingLineButton;
import com.avito.android.remote.model.advert_details.realty.Landing;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsConsultationView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/consultation/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.consultation.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28108n extends com.avito.konveyor.adapter.b implements InterfaceC28106l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f74782g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f74783b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f74784c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74785d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Button f74786e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Button f74787f;

    public C28108n(@Y61.k View view) {
        super(view);
        this.f74783b = (TextView) view.findViewById(R.id.title);
        this.f74784c = (TextView) view.findViewById(R.id.subtitle);
        this.f74785d = (TextView) view.findViewById(R.id.about_consultation);
        this.f74786e = (Button) view.findViewById(R.id.consultation_button);
        this.f74787f = (Button) view.findViewById(R.id.incoming_line_button);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void IZ(@Y61.l IncomingLineButton incomingLineButton, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        Button button;
        if (incomingLineButton != null && (button = this.f74786e) != null) {
            button.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
        }
        Button button2 = this.f74787f;
        if (button2 != null) {
            com.avito.android.lib.design.button.b.a(button2, incomingLineButton != null ? incomingLineButton.getTitle() : null, false);
        }
        if (button2 != null) {
            button2.setOnClickListener(new com.avito.android.advert.closed.b(14, lVar, incomingLineButton));
        }
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void R9(@Y61.l Landing landing, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        String text = landing.getText();
        TextView textView = this.f74785d;
        I5.a(textView, text, false);
        textView.setOnClickListener(new ViewOnClickListenerC28107m(lVar, landing, 0));
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void Tf(@Y61.k Y41.l<? super View, G0> lVar) {
        Button button = this.f74786e;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.advert.closed.b(13, lVar, this));
        }
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void b(@Y61.l String str) {
        I5.a(this.f74783b, str, false);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void j(@Y61.k String str) {
        I5.a(this.f74784c, str, false);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l
    public final void sm(@Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2) {
        Button button = this.f74786e;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        if (button != null) {
            button.setAppearanceFromAttr(num != null ? num.intValue() : R.attr.buttonSecondaryLarge);
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (button != null) {
                com.avito.android.lib.util.v.a(button, iIntValue);
            }
        }
    }
}
