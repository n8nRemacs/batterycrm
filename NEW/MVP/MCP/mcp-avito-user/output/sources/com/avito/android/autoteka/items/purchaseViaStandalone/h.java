package com.avito.android.autoteka.items.purchaseViaStandalone;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PurchaseViaStandaloneView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/purchaseViaStandalone/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/purchaseViaStandalone/g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f96947f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f96948b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f96949c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f96950d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f96951e;

    public h(@k View view) {
        super(view);
        this.f96948b = (TextView) view.findViewById(R.id.autoteka_title);
        this.f96949c = (TextView) view.findViewById(R.id.autoteka_description);
        this.f96950d = (Button) view.findViewById(R.id.autoteka_to_standalone);
        this.f96951e = (Button) view.findViewById(R.id.autoteka_buy_new_report);
    }

    @Override // com.avito.android.autoteka.items.purchaseViaStandalone.g
    public final void Ci(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f96950d;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(11, aVar));
    }

    @Override // com.avito.android.autoteka.items.purchaseViaStandalone.g
    public final void b(@k String str) {
        this.f96948b.setText(str);
    }

    @Override // com.avito.android.autoteka.items.purchaseViaStandalone.g
    public final void fi(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f96951e;
        button.setText(str);
        button.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(10, aVar));
    }

    @Override // com.avito.android.autoteka.items.purchaseViaStandalone.g
    public final void q(@k AttributedText attributedText) {
        j.c(this.f96949c, attributedText, null);
    }
}
