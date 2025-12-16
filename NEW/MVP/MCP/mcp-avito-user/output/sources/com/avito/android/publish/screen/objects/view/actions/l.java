package com.avito.android.publish.screen.objects.view.actions;

import Ge0.InterfaceC13872a;
import He0.C13982a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.details.C33775o;
import com.avito.android.publish.details.InterfaceC33769m;
import com.avito.android.publish.details.r;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObjectNavigationButtonsView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/objects/view/actions/l;", "Lcom/avito/android/publish/screen/objects/view/actions/k;", "Lcom/avito/android/publish/details/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements k, InterfaceC33769m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33775o f240278b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k View view, @Y61.k r rVar, @Y61.k Y41.l<? super InterfaceC13872a, G0> lVar) {
        this.f240277a = lVar;
        this.f240278b = new C33775o(view, rVar, new C13982a(lVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation) {
        this.f240278b.d(list, navigationButtonsOrientation);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool) {
        this.f240278b.n(list, navigationButtonsOrientation, attributedText, deepLink, navigationButtonAction, bool);
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    @Y61.k
    public final View p() {
        return this.f240278b.f234860d;
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void q() {
        this.f240278b.q();
    }

    @Override // com.avito.android.publish.details.InterfaceC33769m
    public final void s(boolean z12) {
        this.f240278b.s(z12);
    }
}
