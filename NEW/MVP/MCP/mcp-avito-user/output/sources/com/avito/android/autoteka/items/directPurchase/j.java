package com.avito.android.autoteka.items.directPurchase;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DirectPurchaseView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/directPurchase/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/directPurchase/h;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f96750f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f96751b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f96752c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f96753d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f96754e;

    public j(@k View view) {
        super(view);
        this.f96751b = (TextView) this.itemView.findViewById(R.id.title);
        this.f96752c = (TextView) this.itemView.findViewById(R.id.description);
        this.f96753d = (Button) this.itemView.findViewById(R.id.primaryButton);
        this.f96754e = (Button) this.itemView.findViewById(R.id.secondaryButton);
    }

    @Override // com.avito.android.autoteka.items.directPurchase.h
    public final void HF(@l DirectPurchaseDetails.Button button, @k Y41.l<? super DeepLink, G0> lVar) {
        Button button2 = this.f96753d;
        if (button == null) {
            button2.setVisibility(8);
            return;
        }
        button2.setVisibility(0);
        button2.setText(button.f96240b);
        button2.setOnClickListener(new i(lVar, button, 0));
    }

    @Override // com.avito.android.autoteka.items.directPurchase.h
    public final void IV(@l DirectPurchaseDetails.Button button, @k Y41.l<? super DeepLink, G0> lVar) {
        Button button2 = this.f96754e;
        if (button == null) {
            button2.setVisibility(8);
            return;
        }
        button2.setVisibility(0);
        button2.setText(button.f96240b);
        button2.setOnClickListener(new i(lVar, button, 1));
    }

    @Override // com.avito.android.autoteka.items.directPurchase.h
    public final void b(@k String str) {
        this.f96751b.setText(str);
    }

    @Override // com.avito.android.autoteka.items.directPurchase.h
    public final void q(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f96752c, attributedText, null);
    }
}
