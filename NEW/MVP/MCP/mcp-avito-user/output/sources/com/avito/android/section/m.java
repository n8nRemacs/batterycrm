package com.avito.android.section;

import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.section.horizontal.adapter.HorizontalSectionAdapterItem;
import com.avito.android.section.title.with_action.SectionTitleWithActionItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.recomendations.ExpandableSectionItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.t0;

/* compiled from: SectionItemConverter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "items", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f264836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SectionTypeItem f264837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SectionItemConverter.Params f264838d;

    public m(f fVar, SectionTypeItem sectionTypeItem, SectionItemConverter.Params params) {
        this.f264836b = fVar;
        this.f264837c = sectionTypeItem;
        this.f264838d = params;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object objSingletonList;
        boolean z12;
        List list = (List) obj;
        int i12 = f.f264654k;
        f fVar = this.f264836b;
        fVar.getClass();
        SectionTypeItem sectionTypeItem = this.f264837c;
        boolean zN2 = f.n(sectionTypeItem);
        SectionItemConverter.Params params = this.f264838d;
        com.avito.android.serp.adapter.recomendations.j jVar = fVar.f264662h;
        if (zN2) {
            Action action = sectionTypeItem.getAction();
            List listK = f.k(list, params);
            if (listK.isEmpty()) {
                return C42784z0.f406748b;
            }
            List listL = f.l(listK, params, sectionTypeItem.getSectionId());
            if (!L.f(sectionTypeItem.getIsAvailableToHide(), Boolean.TRUE) || !params.f264608j) {
                SectionTitleWithActionItem sectionTitleWithActionItem = new SectionTitleWithActionItem(sectionTypeItem.getSectionId(), sectionTypeItem.getTitle(), sectionTypeItem.getSubtitle(), params.f264600b, action, null, false, 96, null);
                t0 t0Var = new t0(2);
                t0Var.a(sectionTitleWithActionItem);
                t0Var.b(listL.toArray(new PersistableSpannedItem[0]));
                ArrayList<Object> arrayList = t0Var.f406850a;
                return C42745f0.U(arrayList.toArray(new PersistableSpannedItem[arrayList.size()]));
            }
            Boolean isCollapsed = sectionTypeItem.getIsCollapsed();
            boolean zBooleanValue = isCollapsed != null ? isCollapsed.booleanValue() : true;
            String title = sectionTypeItem.getTitle();
            if (title == null) {
                title = "";
            }
            f.m(jVar, title, zBooleanValue);
            String title2 = sectionTypeItem.getTitle();
            String str = title2 == null ? "" : title2;
            String f264597e = sectionTypeItem.getF264597e();
            String title3 = sectionTypeItem.getTitle();
            if (title3 == null) {
                title3 = "";
            }
            Boolean boolB = jVar.b(title3);
            if (boolB != null) {
                zBooleanValue = boolB.booleanValue();
            }
            return f.j(new ExpandableSectionItem(params.f264600b, str, f264597e, zBooleanValue, false, sectionTypeItem.getSectionId(), listL, params.f264605g, 16, null), listL);
        }
        Action action2 = sectionTypeItem.getAction();
        String sectionId = sectionTypeItem.getSectionId();
        Boolean isAvailableToHide = sectionTypeItem.getIsAvailableToHide();
        Boolean bool = Boolean.TRUE;
        HorizontalSectionAdapterItem horizontalSectionAdapterItem = new HorizontalSectionAdapterItem(sectionId, L.f(isAvailableToHide, bool) ? null : sectionTypeItem.getTitle(), sectionTypeItem.getSubtitle(), params.f264600b, null, action2, list, sectionTypeItem.getContext(), sectionTypeItem.getDisplaying(), false, 528, null);
        if (L.f(sectionTypeItem.getIsAvailableToHide(), bool)) {
            Boolean isCollapsed2 = sectionTypeItem.getIsCollapsed();
            boolean zBooleanValue2 = isCollapsed2 != null ? isCollapsed2.booleanValue() : true;
            String title4 = sectionTypeItem.getTitle();
            if (title4 == null) {
                title4 = "";
            }
            f.m(jVar, title4, zBooleanValue2);
            String title5 = sectionTypeItem.getTitle();
            String str2 = title5 == null ? "" : title5;
            String f264597e2 = sectionTypeItem.getF264597e();
            if (params.f()) {
                z12 = zBooleanValue;
                objSingletonList = f.j(new ExpandableSectionItem(params.f264600b, str2, f264597e2, z12, false, sectionTypeItem.getSectionId(), Collections.singletonList(horizontalSectionAdapterItem), params.f264605g, 16, null), Collections.singletonList(horizontalSectionAdapterItem));
            } else {
                String title6 = sectionTypeItem.getTitle();
                if (title6 == null) {
                    title6 = "";
                }
                Boolean boolB2 = jVar.b(title6);
                if (boolB2 != null) {
                    zBooleanValue = boolB2.booleanValue();
                    z12 = zBooleanValue;
                    objSingletonList = f.j(new ExpandableSectionItem(params.f264600b, str2, f264597e2, z12, false, sectionTypeItem.getSectionId(), Collections.singletonList(horizontalSectionAdapterItem), params.f264605g, 16, null), Collections.singletonList(horizontalSectionAdapterItem));
                } else {
                    z12 = zBooleanValue2;
                    objSingletonList = f.j(new ExpandableSectionItem(params.f264600b, str2, f264597e2, z12, false, sectionTypeItem.getSectionId(), Collections.singletonList(horizontalSectionAdapterItem), params.f264605g, 16, null), Collections.singletonList(horizontalSectionAdapterItem));
                }
            }
        } else {
            objSingletonList = params.f() ? C42784z0.f406748b : Collections.singletonList(horizontalSectionAdapterItem);
        }
        return objSingletonList;
    }
}
