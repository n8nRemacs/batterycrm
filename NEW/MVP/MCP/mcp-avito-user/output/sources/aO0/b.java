package AO0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItemImpl;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItemImpl;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VisualRubricatorDefaultModelsFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAO0/b;", "", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: VisualRubricatorDefaultModelsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ VisualRubricatorWidgetItem b(b bVar, String str, List list, int i12) {
            Space space = Space.f327306l;
            if ((i12 & 4) != 0) {
                space = Space.f327296b;
            }
            return bVar.a(str, list, space);
        }
    }

    @Y61.k
    VisualRubricatorWidgetItemImpl a(@Y61.k String str, @Y61.k List list, @Y61.k Space space);

    @Y61.k
    VisualRubricatorWidgetElementItemImpl b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k DeepLink deepLink, @Y61.l Integer num, @Y61.l UniversalImage universalImage, @Y61.k VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout, @Y61.l Integer num2, boolean z12, @Y61.k Space space, @Y61.k Space space2, @Y61.l Integer num3);
}
