package com.avito.android.esia_redirect_screen.buttons_list.secondary_item;

import Y41.l;
import Y61.k;
import com.avito.android.crm_candidates.view.dialogs.f;
import com.avito.android.esia_redirect_screen.buttons_list.EsiaRedirectButtonsBaseItem;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EsiaRedirectButtonsSecondaryPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/esia_redirect_screen/buttons_list/secondary_item/d;", "LTV0/d;", "Lcom/avito/android/esia_redirect_screen/buttons_list/secondary_item/c;", "Lcom/avito/android/esia_redirect_screen/buttons_list/secondary_item/EsiaRedirectButtonsSecondaryItem;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<c, EsiaRedirectButtonsSecondaryItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<EsiaRedirectButtonsBaseItem, G0> f147967b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super EsiaRedirectButtonsBaseItem, G0> lVar) {
        this.f147967b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        EsiaRedirectButtonsSecondaryItem esiaRedirectButtonsSecondaryItem = (EsiaRedirectButtonsSecondaryItem) aVar;
        Button button = ((c) eVar).f147966b;
        button.setText(esiaRedirectButtonsSecondaryItem.f147958b);
        button.setOnClickListener(new f(19, this.f147967b, esiaRedirectButtonsSecondaryItem));
    }
}
