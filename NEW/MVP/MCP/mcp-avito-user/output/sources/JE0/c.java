package Je0;

import Ie0.InterfaceC14065a;
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

/* compiled from: PublishItemDetailsPresenterCompat.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LJe0/c;", "Lcom/avito/android/publish/details/ItemDetailsView$b;", "Lcom/avito/android/publish/screen/step/params/view/actions/r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements ItemDetailsView.b, r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14065a, G0> f9079b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super InterfaceC14065a, G0> lVar) {
        this.f9079b = lVar;
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
        this.f9079b.invoke(new InterfaceC14065a.d.C0475d(kVar));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void O5() {
        this.f9079b.invoke(InterfaceC14065a.d.o.f8315a);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        this.f9079b.invoke(new InterfaceC14065a.InterfaceC0468a.b(navigationButtonAction, confirmation, deepLink, list, paramsToFill));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void k2(boolean z12) {
        this.f9079b.invoke(new InterfaceC14065a.d.C14075b(z12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void n(@k DeepLink deepLink) {
        this.f9079b.invoke(new InterfaceC14065a.c.C0473c(deepLink, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void nb() {
        this.f9079b.invoke(InterfaceC14065a.d.l.f8312a);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void j2() {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void Zc(@k String str) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void s(@k BubbleInfo bubbleInfo) {
    }
}
