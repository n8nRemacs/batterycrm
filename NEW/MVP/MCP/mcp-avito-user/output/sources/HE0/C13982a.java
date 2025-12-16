package He0;

import Ee0.C13479a;
import Ge0.InterfaceC13872a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.screen.step.params.view.actions.r;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemDetailsPresenterCompat.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHe0/a;", "Lcom/avito/android/publish/details/ItemDetailsView$b;", "Lcom/avito/android/publish/screen/step/params/view/actions/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: He0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13982a implements ItemDetailsView.b, r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13872a, G0> f7566b;

    /* JADX WARN: Multi-variable type inference failed */
    public C13982a(@k l<? super InterfaceC13872a, G0> lVar) {
        this.f7566b = lVar;
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void O5() {
        this.f7566b.invoke(InterfaceC13872a.n.f6643a);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        this.f7566b.invoke(new InterfaceC13872a.l(new C13479a(navigationButtonAction, confirmation, deepLink, list, paramsToFill)));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void k2(boolean z12) {
        this.f7566b.invoke(new InterfaceC13872a.c(z12));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void n(@k DeepLink deepLink) {
        this.f7566b.invoke(new InterfaceC13872a.e(deepLink));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void nb() {
        this.f7566b.invoke(InterfaceC13872a.k.f6640a);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void j2() {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void Zc(@k String str) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void s(@k BubbleInfo bubbleInfo) {
    }
}
