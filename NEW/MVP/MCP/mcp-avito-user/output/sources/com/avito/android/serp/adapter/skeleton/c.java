package com.avito.android.serp.adapter.skeleton;

import AO0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem;
import com.avito.android.serp.adapter.mini_menu.item.Badge;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.android.shortcut_navigation_bar.adapter.SkeletonItem;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import shark.AndroidResourceIdNames;

/* compiled from: SkeletonGenerator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/skeleton/c;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SkeletonGenerator.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/skeleton/c$a;", "Lcom/avito/android/serp/adapter/skeleton/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AO0.b f272235a;

        @Inject
        public a(@Y61.k AO0.b bVar) {
            this.f272235a = bVar;
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final MiniMenuBlockItem a() {
            MiniMenuItem[] miniMenuItemArr = new MiniMenuItem[6];
            for (int i12 = 0; i12 < 6; i12++) {
                miniMenuItemArr[i12] = new MiniMenuItem("SKELETON_MINI_MENU", "", new NoMatchLink(), new Badge.TextBadge("", "", ""), null, true);
            }
            return new MiniMenuBlockItem("SKELETON_MINI_MENU_BLOCK", C42756l.g0(miniMenuItemArr), 0, 0, 0, null, null, 124, null);
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final j b() {
            return new j();
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 1; i12 < 11; i12++) {
                arrayList.add(new SkeletonItem(String.valueOf(i12), false, false, 6, null));
            }
            return arrayList;
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final ArrayList d(int i12) {
            ArrayList arrayList = new ArrayList();
            int i13 = i12 * 10;
            int i14 = 1;
            if (1 <= i13) {
                while (true) {
                    arrayList.add(new f(String.valueOf(i14)));
                    if (i14 == i13) {
                        break;
                    }
                    i14++;
                }
            }
            return arrayList;
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final VisualRubricatorWidgetItem e() {
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = VisualRubricatorWidgetElementLayout.LARGE;
            VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItemG = g(visualRubricatorWidgetElementLayout, 1);
            VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItemG2 = g(visualRubricatorWidgetElementLayout, 2);
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout2 = VisualRubricatorWidgetElementLayout.SMALL;
            return b.a.b(this.f272235a, "SKELETON_RUBRICATOR", C42745f0.U(visualRubricatorWidgetElementItemG, visualRubricatorWidgetElementItemG2, g(visualRubricatorWidgetElementLayout2, 1), g(visualRubricatorWidgetElementLayout2, 2), g(visualRubricatorWidgetElementLayout2, 1), g(visualRubricatorWidgetElementLayout2, 2), g(visualRubricatorWidgetElementLayout2, 1), g(visualRubricatorWidgetElementLayout2, 2)), 252);
        }

        @Override // com.avito.android.serp.adapter.skeleton.c
        @Y61.k
        public final ArrayList f() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SkeletonItem("1", true, false, 4, null));
            for (int i12 = 2; i12 < 11; i12++) {
                arrayList.add(new SkeletonItem(String.valueOf(i12), false, false, 6, null));
            }
            return arrayList;
        }

        public final VisualRubricatorWidgetElementItem g(VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout, int i12) {
            NoMatchLink noMatchLink = new NoMatchLink();
            UniversalImage universalImage = new UniversalImage(null, null);
            Space space = Space.f327296b;
            return this.f272235a.b("SKELETON_ITEM", "", "", noMatchLink, null, universalImage, visualRubricatorWidgetElementLayout, (474400 & 512) != 0 ? null : Integer.valueOf(i12), (474400 & 1024) == 0, space, space, (474400 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : 114);
        }
    }

    @Y61.k
    MiniMenuBlockItem a();

    @Y61.k
    j b();

    @Y61.k
    ArrayList c();

    @Y61.k
    ArrayList d(int i12);

    @Y61.k
    VisualRubricatorWidgetItem e();

    @Y61.k
    ArrayList f();
}
