package com.avito.android.publish.screen.step.params.view.actions;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishDetailsNavigationButtonsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/r;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface r {
    void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill);

    void n(@Y61.k DeepLink deepLink);
}
