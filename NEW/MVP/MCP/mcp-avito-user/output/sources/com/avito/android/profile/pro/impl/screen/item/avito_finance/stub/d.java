package com.avito.android.profile.pro.impl.screen.item.avito_finance.stub;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProAvitoFinanceStubItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/d;", "LTV0/d;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/g;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub/ProfileProAvitoFinanceStubItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<g, ProfileProAvitoFinanceStubItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<D90.a, G0> f223041b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super D90.a, G0> lVar) {
        this.f223041b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        final g gVar = (g) eVar;
        Context context = gVar.f223047d;
        gVar.f223048e.setText(context.getString(R.string.profile_pro_avito_finance_stub_title));
        gVar.f223051h.setText(context.getString(R.string.profile_pro_avito_finance_stub_text));
        final int i13 = 0;
        gVar.f223049f.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        g gVar2 = gVar;
                        b.a.a(gVar2.f223046c, gVar2.f223052i, null, null, 6);
                        break;
                    default:
                        g gVar3 = gVar;
                        b.a.a(gVar3.f223046c, gVar3.f223052i, null, null, 6);
                        break;
                }
            }
        });
        final int i14 = 1;
        gVar.f223050g.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g gVar2 = gVar;
                        b.a.a(gVar2.f223046c, gVar2.f223052i, null, null, 6);
                        break;
                    default:
                        g gVar3 = gVar;
                        b.a.a(gVar3.f223046c, gVar3.f223052i, null, null, 6);
                        break;
                }
            }
        });
    }
}
