package If;

import Cj0.g;
import Y61.k;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import com.avito.android.remote.autoteka.model.StandaloneAutotekaBlock;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.autotekateaser.AutotekaAnalytic;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseResultMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIf/d;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C14097b f8462a;

    @Inject
    public d(@k C14097b c14097b) {
        this.f8462a = c14097b;
    }

    @k
    public final AutotekaChoosingPurchaseInternalAction a(@k TypedResult<Cj0.g> typedResult) {
        AutotekaChoosingPurchaseInternalAction error;
        if (typedResult instanceof TypedResult.Success) {
            Cj0.g gVar = (Cj0.g) ((TypedResult.Success) typedResult).getResult();
            if (gVar instanceof g.b) {
                g.b bVar = (g.b) gVar;
                return L.f(bVar.getCode(), "previewBySearchKeyNotAvailable") ? AutotekaChoosingPurchaseInternalAction.OpenPreviewSearch.f97167b : new AutotekaChoosingPurchaseInternalAction.Error(new ApiError.UnknownError(bVar.getCode(), null, null, 6, null));
            }
            if (!(gVar instanceof g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g.a aVar = (g.a) gVar;
            AutotekaAnalytic autotekaAnalytic = new AutotekaAnalytic(aVar.getAnalytics().getSearchType().ordinal());
            Cj0.b activePackage = aVar.getActivePackage();
            if (activePackage != null) {
                new C14096a();
                String title = activePackage.getTitle();
                AttributedText description = activePackage.getDescription();
                Cj0.i primaryAction = activePackage.getPrimaryAction();
                AutotekaAction autotekaAction = primaryAction != null ? new AutotekaAction(primaryAction.getText(), primaryAction.getDeepLink()) : null;
                Cj0.i secondaryAction = activePackage.getSecondaryAction();
                error = new AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageState(new ChoosingTypePurchaseState.PurchaseViaPackageState(null, title, description, false, autotekaAction, secondaryAction != null ? new AutotekaAction(secondaryAction.getText(), secondaryAction.getDeepLink()) : null, activePackage.getNextUsagePublicId(), 1, null), autotekaAnalytic);
            } else {
                Cj0.c activeStandalonePackage = aVar.getActiveStandalonePackage();
                if (activeStandalonePackage != null) {
                    new j();
                    error = new AutotekaChoosingPurchaseInternalAction.PurchaseViaStandaloneState(new ChoosingTypePurchaseState.PurchaseViaStandaloneState(null, activeStandalonePackage.getTitle(), activeStandalonePackage.getDescription(), new AutotekaAction(activeStandalonePackage.getToProductListAction().getText(), activeStandalonePackage.getToProductListAction().getDeepLink()), new StandaloneAutotekaBlock.StandaloneAutotekaLink(activeStandalonePackage.getStandaloneLink().getTitle(), activeStandalonePackage.getStandaloneLink().getUrl()), 1, null), autotekaAnalytic);
                } else {
                    error = null;
                }
            }
            if (error == null) {
                return this.f8462a.a(typedResult);
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new AutotekaChoosingPurchaseInternalAction.Error(((TypedResult.Error) typedResult).getError());
        }
        return error;
    }
}
