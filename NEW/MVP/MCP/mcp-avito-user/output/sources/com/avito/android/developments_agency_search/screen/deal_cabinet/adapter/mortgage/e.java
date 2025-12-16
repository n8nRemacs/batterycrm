package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage;

import Xw.C17056c;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search_impl.generated.api.api_1_nd_trx_mortgage_list_post.MortgageApplicationView;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35787f0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/mortgage/e;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/mortgage/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<zw.b, G0> f136846b;

    /* compiled from: MortgageItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[GetMortgageListRequestStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GetMortgageListRequestStatus.a aVar = GetMortgageListRequestStatus.f136527c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super zw.b, G0> lVar) {
        this.f136846b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GetMortgageListRequestStatus getMortgageListRequestStatus;
        int i13;
        h hVar = (h) eVar;
        GetMortgageListRequestStatus.a aVar2 = GetMortgageListRequestStatus.f136527c;
        MortgageApplicationView mortgageApplicationView = ((com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage.a) aVar).f136840b;
        MortgageApplicationView.Status status = mortgageApplicationView.getStatus();
        aVar2.getClass();
        int i14 = GetMortgageListRequestStatus.a.C4119a.f136533a[status.ordinal()];
        if (i14 == 1) {
            getMortgageListRequestStatus = GetMortgageListRequestStatus.f136528d;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getMortgageListRequestStatus = GetMortgageListRequestStatus.f136529e;
        }
        Xw.e avatar = mortgageApplicationView.getAvatar();
        hVar.i6(avatar != null ? avatar.getValue() : null, mortgageApplicationView.getName());
        hVar.F1(mortgageApplicationView.getName());
        int iOrdinal = getMortgageListRequestStatus.ordinal();
        if (iOrdinal == 0) {
            i13 = R.color.mortgage_item_default_name;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.color.mortgage_item_disabled_name;
        }
        hVar.Ww(i13);
        hVar.b5(mortgageApplicationView.getPhone());
        hVar.KN(mortgageApplicationView.getCurrentStep().getText());
        float progress = mortgageApplicationView.getCurrentStep().getProgress() / 100.0f;
        C17056c progressColor = mortgageApplicationView.getCurrentStep().getProgressColor();
        String valueName = progressColor.getValueName();
        Integer numA = C35787f0.a(progressColor.getValue());
        Color color = numA != null ? new Color(numA.intValue()) : null;
        Integer numA2 = C35787f0.a(progressColor.getValueDark());
        hVar.J70(progress, new UniversalColor(valueName, numA2 != null ? new Color(numA2.intValue()) : null, color));
        hVar.Za(mortgageApplicationView.getPreferences());
        hVar.a(new f(this, mortgageApplicationView, getMortgageListRequestStatus));
    }
}
