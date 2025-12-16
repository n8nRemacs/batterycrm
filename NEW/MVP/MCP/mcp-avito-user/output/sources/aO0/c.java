package AO0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItemImpl;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItemImpl;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VisualRubricatorDefaultModelsFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAO0/c;", "LAO0/b;", "<init>", "()V", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // AO0.b
    @Y61.k
    public final VisualRubricatorWidgetItemImpl a(@Y61.k String str, @Y61.k List list, @Y61.k Space space) {
        return new VisualRubricatorWidgetItemImpl(str, list, space, Space.f327296b, false, true, null, null, null, 128, null);
    }

    @Override // AO0.b
    @Y61.k
    public final VisualRubricatorWidgetElementItemImpl b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k DeepLink deepLink, @Y61.l Integer num, @Y61.l UniversalImage universalImage, @Y61.k VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout, @Y61.l Integer num2, boolean z12, @Y61.k Space space, @Y61.k Space space2, @Y61.l Integer num3) {
        return new VisualRubricatorWidgetElementItemImpl(str, str2, str3, deepLink, null, num, universalImage, visualRubricatorWidgetElementLayout, null, num2, z12, null, null, null, space, space2, num3, null, null);
    }
}
