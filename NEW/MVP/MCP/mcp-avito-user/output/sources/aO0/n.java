package AO0;

import com.avito.android.visual_rubricator.T;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VisualRubricatorWidgetPresenterFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAO0/n;", "LAO0/m;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f325a;

    @Inject
    public n(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f325a = gVar;
    }

    @Override // AO0.m
    @Y61.k
    public final T a(@Y61.k com.avito.android.visual_rubricator.element.i iVar) {
        return new T(iVar, this.f325a);
    }
}
