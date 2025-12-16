package Je0;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import kotlin.G;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishItemDetailsViewCompat.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJe0/d;", "Lcom/avito/android/publish/details/ItemDetailsView;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements ItemDetailsView {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<PublishDetailsInternalAction, G0> f9080a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super PublishDetailsInternalAction, G0> lVar) {
        this.f9080a = lVar;
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void C0() {
        this.f9080a.invoke(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void W() {
        this.f9080a.invoke(PublishDetailsInternalAction.InternalViewAction.HideKeyboard.f241455b);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void a() {
        this.f9080a.invoke(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void c(@k l lVar, @k String str, @k String str2) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalStateAction.ShowLoading(lVar, str, str2));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void d(@k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
        throw new G(null, 1, null);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void e(int i12, boolean z12) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalViewAction.ScrollToItem(i12, z12));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void f(@k ru.avito.component.toolbar.d dVar) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalViewAction.ShowAppBarOnboarding(dVar));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void g() {
        throw new G(null, 1, null);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void h() {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(true));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void i() {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(false));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void j(int i12, @Y61.l TooltipOptions tooltipOptions, @Y61.l Y41.a<G0> aVar) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalViewAction.ShowTooltipForItem(i12, tooltipOptions, null));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void j3(@k String str) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalViewAction.ShowErrorAlert(str));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void k(@k String str) {
        this.f9080a.invoke(new PublishDetailsInternalAction.InternalStateAction.ErrorAutoDescription(str));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void l() {
        this.f9080a.invoke(PublishDetailsInternalAction.InternalStateAction.ShowRetry.f241448b);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView
    public final void q1() {
        this.f9080a.invoke(PublishDetailsInternalAction.InternalStateAction.HideLoading.f241441b);
    }
}
