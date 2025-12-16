package com.avito.android.saved_searches.presentation.items.banner;

import Eo0.InterfaceC13515a;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.saved_searches.presentation.items.CommunicationType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/banner/f;", "Lcom/avito/android/saved_searches/presentation/items/banner/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13515a, G0> f258433b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f258434c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f258435d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k View view, @k l<? super InterfaceC13515a, G0> lVar) {
        super(view);
        this.f258433b = lVar;
        this.f258434c = (Banner) view.findViewById(R.id.banner);
        this.f258435d = (LinearLayout) view.findViewById(R.id.content_root);
    }

    @Override // com.avito.android.saved_searches.presentation.items.banner.e
    public final void vM(@k g gVar) throws Resources.NotFoundException {
        Banner banner = this.f258434c;
        banner.setAppearance(C35835l0.j(gVar.f258438b, banner.getContext()));
        LinearLayout linearLayout = this.f258435d;
        I5.a((TextView) linearLayout.findViewById(R.id.warning_title), gVar.f258437a, false);
        Button button = (Button) linearLayout.findViewById(R.id.warning_button);
        String str = gVar.f258439c;
        if (str != null) {
            button.setText(str);
        }
        String str2 = gVar.f258440d;
        if (str2 != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str2));
        }
        CommunicationType communicationType = CommunicationType.f258417b;
        CommunicationType communicationType2 = gVar.f258442f;
        DeepLink deepLink = gVar.f258441e;
        button.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(22, this, communicationType2 == communicationType ? new InterfaceC13515a.m(deepLink) : new InterfaceC13515a.e(deepLink)));
        D6.H(banner);
    }
}
