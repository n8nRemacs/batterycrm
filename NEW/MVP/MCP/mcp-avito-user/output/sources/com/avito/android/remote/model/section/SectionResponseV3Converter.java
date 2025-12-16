package com.avito.android.remote.model.section;

import Y61.k;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.section.complementary_v3.SectionElementV3;
import com.avito.android.remote.model.section.complementary_v3.SectionResponseV3;
import com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionResponseV3Converter.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/section/SectionResponseV3Converter;", "", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/util/C;)V", "Lcom/avito/android/remote/model/section/complementary_v3/SectionTypeElementV3;", "Lcom/avito/android/remote/model/section/SectionTypeItem;", "toSectionTypeElement", "(Lcom/avito/android/remote/model/section/complementary_v3/SectionTypeElementV3;)Lcom/avito/android/remote/model/section/SectionTypeItem;", "Lcom/avito/android/remote/model/section/SectionTypeItemV3;", "toSectionTypeItem", "(Lcom/avito/android/remote/model/section/SectionTypeItemV3;)Lcom/avito/android/remote/model/section/SectionTypeItem;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionElementV3;", "Lcom/avito/android/remote/model/section/SectionElement;", "toSectionElement", "(Lcom/avito/android/remote/model/section/complementary_v3/SectionElementV3;)Lcom/avito/android/remote/model/section/SectionElement;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionResponseV3;", "sectionResponseV3", "Lcom/avito/android/remote/model/section/SectionResponse;", "toSectionResponse", "(Lcom/avito/android/remote/model/section/complementary_v3/SectionResponseV3;)Lcom/avito/android/remote/model/section/SectionResponse;", "Lcom/avito/android/util/C;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SectionResponseV3Converter {

    @k
    private final C buildInfo;

    @Inject
    public SectionResponseV3Converter(@k C c12) {
        this.buildInfo = c12;
    }

    private final SectionElement toSectionElement(SectionElementV3 sectionElementV3) throws Throwable {
        if (sectionElementV3 instanceof ConstructorAdvertNetworkModel) {
            return (SectionElement) sectionElementV3;
        }
        V2.f318762a.m(new IllegalArgumentException("Unsupported SectionElementV3: " + sectionElementV3), !this.buildInfo.l());
        return null;
    }

    private final SectionTypeItem toSectionTypeElement(SectionTypeElementV3 sectionTypeElementV3) throws Throwable {
        if (sectionTypeElementV3 instanceof SectionTypeItemV3) {
            return toSectionTypeItem((SectionTypeItemV3) sectionTypeElementV3);
        }
        V2.f318762a.m(new IllegalArgumentException("Unsupported SectionTypeElementV3: " + sectionTypeElementV3), !this.buildInfo.l());
        return null;
    }

    private final SectionTypeItem toSectionTypeItem(SectionTypeItemV3 sectionTypeItemV3) throws Throwable {
        String title = sectionTypeItemV3.getTitle();
        String subtitle = sectionTypeItemV3.getSubtitle();
        Boolean isAvailableToHide = sectionTypeItemV3.getIsAvailableToHide();
        Boolean isCollapsed = sectionTypeItemV3.getIsCollapsed();
        Action action = sectionTypeItemV3.getAction();
        List<SectionElementV3> items = sectionTypeItemV3.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            SectionElement sectionElement = toSectionElement((SectionElementV3) it.next());
            if (sectionElement != null) {
                arrayList.add(sectionElement);
            }
        }
        SectionTypeItem sectionTypeItem = new SectionTypeItem(title, subtitle, isAvailableToHide, isCollapsed, action, arrayList, sectionTypeItemV3.getDisplaying(), sectionTypeItemV3.getContext(), sectionTypeItemV3.getEngine(), sectionTypeItemV3.getDisplayType());
        sectionTypeItem.setId(sectionTypeItemV3.getId());
        sectionTypeItem.setIconUri(sectionTypeItemV3.getIconUri());
        return sectionTypeItem;
    }

    @k
    public final SectionResponse toSectionResponse(@k SectionResponseV3 sectionResponseV3) throws Throwable {
        List<SectionTypeElementV3> sections = sectionResponseV3.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            SectionTypeItem sectionTypeElement = toSectionTypeElement((SectionTypeElementV3) it.next());
            if (sectionTypeElement != null) {
                arrayList.add(sectionTypeElement);
            }
        }
        return new SectionResponse(arrayList);
    }
}
