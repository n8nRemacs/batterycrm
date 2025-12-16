package com.avito.android.brand_global_rubricator;

import AO0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Shortcuts;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: BrandGlobalRubricatorConverterImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_rubricator/d;", "Lcom/avito/android/brand_global_rubricator/c;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AO0.c f107449a;

    @Inject
    public d(@Y61.k AO0.c cVar) {
        this.f107449a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    @Override // com.avito.android.brand_global_rubricator.c
    @Y61.l
    public final VisualRubricatorWidgetItem b(@Y61.k Shortcuts shortcuts) {
        ?? arrayList;
        Space space = Space.f327296b;
        List<Action> list = shortcuts.getList();
        AO0.c cVar = this.f107449a;
        if (list != null) {
            List<Action> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (Action action : list2) {
                String str = "brandGlobalRubricatorItem-" + action.getTitle();
                String title = action.getTitle();
                String title2 = action.getTitle();
                DeepLink deepLink = action.getDeepLink();
                UniversalImage image = action.getImage();
                VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = VisualRubricatorWidgetElementLayout.SMALL;
                Space space2 = Space.f327306l;
                arrayList.add(cVar.b(str, title, title2, deepLink, null, image, visualRubricatorWidgetElementLayout, (474400 & 512) != 0 ? null : 1, (474400 & 1024) == 0, space2, space2, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return b.a.b(cVar, "rubricatorWidget", arrayList, 248);
    }
}
