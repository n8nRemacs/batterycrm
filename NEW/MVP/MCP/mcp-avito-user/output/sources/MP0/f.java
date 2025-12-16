package MP0;

import Y61.k;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.Category;
import com.avito.android.widget_filters.remote.model.widgets.CategoryContent;
import com.avito.android.widget_filters.remote.model.widgets.CategoryParameter;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersCategoryWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersWidgetsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMP0/f;", "LMP0/e;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f10681a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.widget_filters.utils.b f10682b;

    @Inject
    public f(@k com.avito.android.server_time.f fVar, @k com.avito.android.widget_filters.utils.b bVar) {
        this.f10681a = fVar;
        this.f10682b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        r9.add(new NP0.f(r8, r13.f11419b, r10.getAgeId()));
        r8 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    @Override // MP0.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.widget_filters.mvi.entity.d.c a(@Y61.k com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersGuestsWidget r42, int r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MP0.f.a(com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersGuestsWidget, int, boolean):com.avito.android.widget_filters.mvi.entity.d$c");
    }

    @Override // MP0.e
    @k
    public final d.a b(@k WidgetFiltersCategoryWidget widgetFiltersCategoryWidget, int i12, boolean z12) {
        NP0.d dVar;
        String str;
        PrintableText printableTextF;
        List<NP0.c> list;
        NP0.c cVar;
        CategoryParameter category;
        ArrayList arrayList;
        Object next;
        CategoryContent content = widgetFiltersCategoryWidget.getContent();
        if (content == null || (category = content.getCategory()) == null) {
            dVar = null;
        } else {
            Boolean isMultiselect = category.getIsMultiselect();
            boolean zBooleanValue = isMultiselect != null ? isMultiselect.booleanValue() : false;
            List<Category> listC = category.c();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
            for (Category category2 : listC) {
                String id2 = category2.getId();
                String title = category2.getTitle();
                UniversalImage imageActive = category2.getImageActive();
                UniversalImage imageInactive = category2.getImageInactive();
                Boolean isSelected = category2.getIsSelected();
                arrayList2.add(new NP0.c(id2, title, imageActive, imageInactive, isSelected != null ? isSelected.booleanValue() : false));
            }
            if (zBooleanValue) {
                arrayList = arrayList2;
            } else {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((NP0.c) next).f11431f) {
                        break;
                    }
                }
                NP0.c cVar2 = (NP0.c) next;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    NP0.c cVar3 = (NP0.c) it2.next();
                    arrayList3.add(NP0.c.b(cVar3, L.f(cVar3, cVar2)));
                }
                arrayList = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (((NP0.c) obj).f11431f) {
                    arrayList4.add(obj);
                }
            }
            String id3 = category.getId();
            Boolean isRequired = category.getIsRequired();
            boolean zBooleanValue2 = isRequired != null ? isRequired.booleanValue() : true;
            Boolean updatesForm = category.getUpdatesForm();
            boolean zBooleanValue3 = updatesForm != null ? updatesForm.booleanValue() : true;
            Boolean isVisible = category.getIsVisible();
            dVar = new NP0.d(id3, zBooleanValue2, zBooleanValue3, isVisible != null ? isVisible.booleanValue() : true, category.getNotSelectedErrorText(), arrayList, arrayList4, zBooleanValue, category.getHintText());
        }
        List<NP0.c> list2 = dVar != null ? dVar.f11438g : null;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.size() > 1) {
            printableTextF = this.f10682b.p(list2.size());
        } else {
            if (dVar == null || (list = dVar.f11438g) == null || (cVar = (NP0.c) C42745f0.G(list)) == null || (str = cVar.f11428c) == null) {
                str = "";
            }
            printableTextF = com.avito.android.printable_text.b.f(str);
        }
        com.avito.android.widget_filters.ui.items.category.a aVar = new com.avito.android.widget_filters.ui.items.category.a(printableTextF, widgetFiltersCategoryWidget.getDefaultPlaceholder(), list2.isEmpty());
        String id4 = widgetFiltersCategoryWidget.getId();
        String title2 = widgetFiltersCategoryWidget.getTitle();
        Boolean isNew = widgetFiltersCategoryWidget.getIsNew();
        return new d.a(id4, title2, aVar, i12, z12, isNew != null ? isNew.booleanValue() : false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    @Override // MP0.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.widget_filters.mvi.entity.d.C10254d c(@Y61.k com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersLocationWidget r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MP0.f.c(com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersLocationWidget, int, boolean):com.avito.android.widget_filters.mvi.entity.d$d");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    @Override // MP0.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.widget_filters.mvi.entity.d.b d(@Y61.k com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersDatesWidget r28, int r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: MP0.f.d(com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersDatesWidget, int, boolean):com.avito.android.widget_filters.mvi.entity.d$b");
    }
}
