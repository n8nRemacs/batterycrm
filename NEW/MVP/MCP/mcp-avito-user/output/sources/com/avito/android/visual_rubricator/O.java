package com.avito.android.visual_rubricator;

import android.graphics.Color;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Shortcuts;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SaleShortcuts;
import com.avito.android.util.V2;
import com.avito.android.visual_rubricator.ab.NewRubricatorAbTestGroup;
import com.avito.android.visual_rubricator.element.CategoryBadge;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItemImpl;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ur.C49102c;

/* compiled from: VisualRubricatorWidgetConverterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/O;", "Lcom/avito/android/visual_rubricator/N;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f327289a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C49102c f327290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<NewRubricatorAbTestGroup> f327291c;

    /* compiled from: VisualRubricatorWidgetConverterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327292a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f327293b;

        static {
            int[] iArr = new int[Shortcuts.ListPresentationType.values().length];
            try {
                iArr[Shortcuts.ListPresentationType.NO_MAIN_RECS_V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shortcuts.ListPresentationType.REDESIGN_V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shortcuts.ListPresentationType.REDESIGN_SMALL_BTN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Shortcuts.ListPresentationType.REDESIGN_TINY_BTN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Shortcuts.ListPresentationType.REDESIGN_FIRST_ALL_CAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f327292a = iArr;
            int[] iArr2 = new int[SaleShortcuts.RubricatorType.values().length];
            try {
                iArr2[SaleShortcuts.RubricatorType.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SaleShortcuts.RubricatorType.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f327293b = iArr2;
        }
    }

    public O(@Y61.k J0 j02, @Y61.k C49102c c49102c, @Y61.k u3.l lVar) {
        this.f327289a = j02;
        this.f327290b = c49102c;
        this.f327291c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    @Override // com.avito.android.visual_rubricator.N
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.visual_rubricator.VisualRubricatorWidgetItemImpl a(@Y61.k com.avito.android.remote.model.Shortcuts r35, @Y61.l java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.visual_rubricator.O.a(com.avito.android.remote.model.Shortcuts, java.lang.String):com.avito.android.visual_rubricator.VisualRubricatorWidgetItemImpl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.visual_rubricator.N
    @Y61.l
    public final VisualRubricatorWidgetItemImpl b(@Y61.k SaleShortcuts saleShortcuts) {
        Space space;
        VisualRubricatorWidgetElementItemImpl visualRubricatorWidgetElementItemImpl;
        ArrayList arrayList;
        J0 j02;
        List<SaleShortcuts.Tile> tiles = saleShortcuts.getTiles();
        VisualRubricatorWidgetItemImpl visualRubricatorWidgetItemImpl = null;
        if (tiles == null) {
            return null;
        }
        SaleShortcuts.RubricatorType rubricatorType = saleShortcuts.getRubricatorType();
        if (rubricatorType == null) {
            rubricatorType = SaleShortcuts.RubricatorType.DYNAMIC;
        }
        int i12 = a.f327293b[rubricatorType.ordinal()];
        if (i12 == 1) {
            space = Space.f327299e;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            space = Space.f327298d;
        }
        List<SaleShortcuts.Tile> list = tiles;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            J0 j03 = this.f327289a;
            if (!zHasNext) {
                ArrayList arrayList3 = arrayList2;
                if (arrayList3.isEmpty()) {
                    return null;
                }
                SaleShortcuts.AllCategoriesItem allCategories = saleShortcuts.getAllCategories();
                if (allCategories == null) {
                    arrayList = arrayList3;
                    j02 = j03;
                    visualRubricatorWidgetElementItemImpl = null;
                } else {
                    VisualRubricatorWidgetElementLayout.a aVar = VisualRubricatorWidgetElementLayout.f327381b;
                    String layout = allCategories.getLayout();
                    aVar.getClass();
                    VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayoutA = VisualRubricatorWidgetElementLayout.a.a(layout);
                    if (visualRubricatorWidgetElementLayoutA == null) {
                        visualRubricatorWidgetElementLayoutA = VisualRubricatorWidgetElementLayout.SMALL;
                    }
                    String title = allCategories.getTitle();
                    String titleWithTransfer = allCategories.getTitleWithTransfer();
                    UniversalColor titleColor = allCategories.getTitleColor();
                    DeepLink deepLink = allCategories.getAction().getDeepLink();
                    Integer numA = allCategories.getBackgroundColor() == null ? com.avito.android.lib.util.e.a("gray8") : null;
                    UniversalColor backgroundColor = allCategories.getBackgroundColor();
                    String icon = allCategories.getIcon();
                    arrayList = arrayList3;
                    VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = visualRubricatorWidgetElementLayoutA;
                    j02 = j03;
                    visualRubricatorWidgetElementItemImpl = new VisualRubricatorWidgetElementItemImpl("item_all_categories", title, titleWithTransfer, deepLink, numA, null, null, visualRubricatorWidgetElementLayout, icon != null ? com.avito.android.lib.util.q.a(icon) : null, null, false, null, backgroundColor, titleColor, space, space, null, null, null, 462368, null);
                }
                String strK = com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("salesHeader_widget"));
                ArrayList arrayListI0 = arrayList;
                if (visualRubricatorWidgetElementItemImpl != null) {
                    arrayListI0 = C42745f0.i0(visualRubricatorWidgetElementItemImpl, arrayListI0);
                }
                return new VisualRubricatorWidgetItemImpl(strK, arrayListI0, space, space, false, false, null, null, null, 496, null);
            }
            SaleShortcuts.Tile tile = (SaleShortcuts.Tile) it.next();
            VisualRubricatorWidgetElementLayout.a aVar2 = VisualRubricatorWidgetElementLayout.f327381b;
            String layout2 = tile.getLayout();
            aVar2.getClass();
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayoutA2 = VisualRubricatorWidgetElementLayout.a.a(layout2);
            if (visualRubricatorWidgetElementLayoutA2 == null) {
                visualRubricatorWidgetElementLayoutA2 = VisualRubricatorWidgetElementLayout.SMALL;
            }
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout2 = visualRubricatorWidgetElementLayoutA2;
            if (rubricatorType == SaleShortcuts.RubricatorType.DYNAMIC && tile.getRowLine() == null) {
                return visualRubricatorWidgetItemImpl;
            }
            String strK2 = com.avito.android.bxcontent.mvi.entity.f.k(j03, new StringBuilder("salesHeader_tile"));
            String title2 = tile.getTitle();
            String titleWithTransfer2 = tile.getTitleWithTransfer();
            UniversalColor titleColor2 = tile.getTitleColor();
            DeepLink deepLink2 = tile.getDeepLink();
            UniversalColor backgroundColor2 = tile.getBackgroundColor();
            UniversalImage image = tile.getImage();
            Integer rowLine = tile.getRowLine();
            SaleShortcuts.Badge badge = tile.getBadge();
            ArrayList arrayList4 = arrayList2;
            arrayList4.add(new VisualRubricatorWidgetElementItemImpl(strK2, title2, titleWithTransfer2, deepLink2, null, null, image, visualRubricatorWidgetElementLayout2, null, rowLine, false, badge != null ? new CategoryBadge(badge.getText(), badge.getBackgroundColor(), badge.getTextColor()) : visualRubricatorWidgetItemImpl, backgroundColor2, titleColor2, space, space, null, null, null, 460064, null));
            arrayList2 = arrayList4;
            visualRubricatorWidgetItemImpl = null;
        }
    }

    @Override // com.avito.android.visual_rubricator.N
    @Y61.l
    public final VisualRubricatorWidgetItemImpl c(@Y61.k ShortcutsWidget shortcutsWidget, @Y61.l String str) {
        J0 j02;
        Integer numA;
        O o12 = this;
        ArrayList arrayList = new ArrayList();
        List<VisualShortcut> items = shortcutsWidget.getItems();
        Integer num = null;
        if (items == null) {
            return null;
        }
        Boolean isScrollable = shortcutsWidget.getIsScrollable();
        C49102c c49102c = o12.f327290b;
        Space space = c49102c.c() ? Space.f327307m : kotlin.jvm.internal.L.f(isScrollable, Boolean.TRUE) ? Space.f327296b : Space.f327297c;
        Space space2 = c49102c.d() ? Space.f327297c : Space.f327307m;
        Iterator<T> it = items.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j02 = o12.f327289a;
            if (!zHasNext) {
                break;
            }
            VisualShortcut visualShortcut = (VisualShortcut) it.next();
            String strK = kotlin.jvm.internal.L.f(visualShortcut.getIsAllCategoriesItem(), Boolean.TRUE) ? "item_all_categories" : com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("visual_rubric_tile"));
            VisualRubricatorWidgetElementLayout.a aVar = VisualRubricatorWidgetElementLayout.f327381b;
            String layout = visualShortcut.getLayout();
            aVar.getClass();
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayoutA = VisualRubricatorWidgetElementLayout.a.a(layout);
            if (visualRubricatorWidgetElementLayoutA == null) {
                visualRubricatorWidgetElementLayoutA = VisualRubricatorWidgetElementLayout.SMALL;
            }
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = visualRubricatorWidgetElementLayoutA;
            String textColor = visualShortcut.getTextColor();
            if (textColor == null || (numA = com.avito.android.lib.util.e.a(textColor)) == null) {
                numA = com.avito.android.lib.util.e.a(AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            }
            Integer num2 = numA;
            String backgroundColor = visualShortcut.getBackgroundColor();
            Integer numA2 = backgroundColor != null ? com.avito.android.lib.util.e.a(backgroundColor) : num;
            if (numA2 == null) {
                try {
                    String backgroundColor2 = visualShortcut.getBackgroundColor();
                    numA2 = backgroundColor2 != null ? Integer.valueOf(Color.parseColor(backgroundColor2)) : num;
                } catch (Exception unused) {
                    V2.f318762a.d("BIG_VISUAL_RUBRICATOR_ITEM_CONVERTER", "Color " + visualShortcut.getBackgroundColor() + " didn't matched any attr and could not be parsed as hex");
                }
            }
            arrayList.add(new VisualRubricatorWidgetElementItemImpl(strK, visualShortcut.getTitle(), visualShortcut.getTitleWithTransfer(), visualShortcut.getDeepLink(), numA2, num2, visualShortcut.getImage(), visualRubricatorWidgetElementLayout, kotlin.jvm.internal.L.f(visualShortcut.getIsAllCategoriesItem(), Boolean.TRUE) ? Integer.valueOf(R.attr.ic_arrowForward14) : null, visualShortcut.getRowLine(), false, null, null, null, space2, space2, null, shortcutsWidget.getAnalytics(), str != null ? Collections.singletonMap("mcid", str) : null, 80896, null));
            o12 = this;
            num = null;
        }
        if (items.isEmpty()) {
            return null;
        }
        return new VisualRubricatorWidgetItemImpl(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("shortcuts_widget")), arrayList, space, space2, false, false, shortcutsWidget.getAnalytics(), shortcutsWidget.getSettings(), str != null ? Collections.singletonMap("mcid", str) : null, 48, null);
    }
}
