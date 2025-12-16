package com.avito.android.autoteka.items.purchaseViaPackage;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PurchaseViaPackageView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/purchaseViaPackage/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/purchaseViaPackage/g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f96933f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f96934b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f96935c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f96936d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f96937e;

    public i(@k View view) {
        super(view);
        this.f96934b = (TextView) view.findViewById(R.id.autoteka_title);
        this.f96935c = (TextView) view.findViewById(R.id.autoteka_description);
        this.f96936d = (Button) view.findViewById(R.id.autoteka_primary_button);
        this.f96937e = (Button) view.findViewById(R.id.autoteka_secondary_button);
    }

    @Override // com.avito.android.autoteka.items.purchaseViaPackage.g
    public final void Kv(boolean z12, @l AutotekaAction autotekaAction, @k Y41.l<? super DeepLink, G0> lVar) {
        Button button = this.f96936d;
        if (autotekaAction != null) {
            button.setText(autotekaAction.getText());
            button.setOnClickListener(new h(lVar, autotekaAction, 0));
        } else {
            button.setLoading(z12);
            button.setOnClickListener(new m(7, lVar));
            button.setClickable(!z12);
            button.setText(R.string.autoteka_get_report_from_package_button);
        }
    }

    @Override // com.avito.android.autoteka.items.purchaseViaPackage.g
    public final void b(@k String str) {
        this.f96934b.setText(str);
    }

    @Override // com.avito.android.autoteka.items.purchaseViaPackage.g
    public final void f30(@l AutotekaAction autotekaAction, @k Y41.l<? super DeepLink, G0> lVar) {
        Button button = this.f96937e;
        if (autotekaAction == null) {
            button.setVisibility(8);
            return;
        }
        button.setVisibility(0);
        button.setText(autotekaAction.getText());
        button.setOnClickListener(new h(lVar, autotekaAction, 1));
    }

    @Override // com.avito.android.autoteka.items.purchaseViaPackage.g
    public final void q(@k AttributedText attributedText) {
        j.c(this.f96935c, attributedText, null);
    }
}
