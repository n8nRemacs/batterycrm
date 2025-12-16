package com.avito.android.esia_redirect_screen.buttons_list.link_item;

import Y41.l;
import Y61.k;
import android.widget.TextView;
import com.avito.android.crm_candidates.view.dialogs.f;
import com.avito.android.esia_redirect_screen.buttons_list.EsiaRedirectButtonsBaseItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EsiaRedirectButtonsLinkPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/esia_redirect_screen/buttons_list/link_item/d;", "LTV0/d;", "Lcom/avito/android/esia_redirect_screen/buttons_list/link_item/c;", "Lcom/avito/android/esia_redirect_screen/buttons_list/link_item/EsiaRedirectButtonsLinkItem;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<c, EsiaRedirectButtonsLinkItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<EsiaRedirectButtonsBaseItem, G0> f147945b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super EsiaRedirectButtonsBaseItem, G0> lVar) {
        this.f147945b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        EsiaRedirectButtonsLinkItem esiaRedirectButtonsLinkItem = (EsiaRedirectButtonsLinkItem) aVar;
        TextView textView = ((c) eVar).f147944b;
        textView.setText(esiaRedirectButtonsLinkItem.f147936b);
        textView.setOnClickListener(new f(17, this.f147945b, esiaRedirectButtonsLinkItem));
    }
}
