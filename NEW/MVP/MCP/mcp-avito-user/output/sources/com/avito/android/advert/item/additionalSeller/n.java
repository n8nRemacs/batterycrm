package com.avito.android.advert.item.additionalSeller;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.item.additionalSeller.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AdditionalSellerAdditionalButton;
import com.avito.android.remote.model.AdditionalSellerButton;
import com.avito.android.remote.model.AdditionalSellerButtons;
import kotlin.Metadata;

/* compiled from: AdditionalSelllerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/additionalSeller/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l.b f72602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C29640d f72603c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f72604d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f72605e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f72606f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f72607g;

    public n(@Y61.k View view, @Y61.k l.b bVar, @Y61.k C29640d c29640d) {
        super(view);
        this.f72602b = bVar;
        this.f72603c = c29640d;
        this.f72604d = view.findViewById(R.id.additional_seller_button_container);
        this.f72605e = (Button) view.findViewById(R.id.additional_seller_main_button);
        this.f72606f = (Button) view.findViewById(R.id.additional_seller_secondary_button);
        this.f72607g = (Button) view.findViewById(R.id.additional_seller_additional_button);
    }

    @Override // com.avito.android.advert.item.additionalSeller.l
    public final void GE(@Y61.l AdditionalSellerButtons additionalSellerButtons) {
        AdditionalSellerButton secondary;
        final DeepLink deeplink;
        if (additionalSellerButtons == null) {
            return;
        }
        final DeepLink deeplink2 = additionalSellerButtons.getMain().getDeeplink();
        if (deeplink2 != null) {
            this.f72604d.setVisibility(0);
            String title = additionalSellerButtons.getMain().getTitle();
            Button button = this.f72605e;
            com.avito.android.lib.design.button.b.a(button, title, false);
            final int i12 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.additionalSeller.m

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f72600c;

                {
                    this.f72600c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f72600c.f72602b.j2(deeplink2);
                            break;
                        default:
                            this.f72600c.f72602b.j2(deeplink2);
                            break;
                    }
                }
            });
        }
        C29640d c29640d = this.f72603c;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[43];
        if (((Boolean) c29640d.f132192Q.a().invoke()).booleanValue() && (secondary = additionalSellerButtons.getSecondary()) != null && (deeplink = secondary.getDeeplink()) != null) {
            Button button2 = this.f72606f;
            button2.setVisibility(0);
            AdditionalSellerButton secondary2 = additionalSellerButtons.getSecondary();
            com.avito.android.lib.design.button.b.a(button2, secondary2 != null ? secondary2.getTitle() : null, false);
            final int i13 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.advert.item.additionalSeller.m

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f72600c;

                {
                    this.f72600c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f72600c.f72602b.j2(deeplink);
                            break;
                        default:
                            this.f72600c.f72602b.j2(deeplink);
                            break;
                    }
                }
            });
        }
        AdditionalSellerAdditionalButton additional = additionalSellerButtons.getAdditional();
        if (additional != null) {
            Button button3 = this.f72607g;
            button3.setVisibility(0);
            button3.setOnClickListener(new com.avito.android.advert.closed.b(1, this, additional));
        }
    }
}
