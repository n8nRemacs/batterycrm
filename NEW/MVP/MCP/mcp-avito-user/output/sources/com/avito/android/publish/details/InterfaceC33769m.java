package com.avito.android.publish.details;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ItemDetailsNavigationButtonsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/m;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33769m {

    /* compiled from: ItemDetailsNavigationButtonsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.m$a */
    public static final class a {
    }

    void d(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation);

    void n(@Y61.k List<CategoryPublishStep.Params.NavigationButton> list, @Y61.k CategoryPublishStep.Params.NavigationButtonsOrientation navigationButtonsOrientation, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l Boolean bool);

    @Y61.k
    View p();

    void q();

    void s(boolean z12);
}
