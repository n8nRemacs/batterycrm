package com.avito.android.select.sectioned_multiselect;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.select.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u3.g;

/* compiled from: SectionedMultiselectConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/c;", "Lcom/avito/android/select/sectioned_multiselect/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.select.sectioned_multiselect.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f266408a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.select.glow_animation.d f266410c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g<AutoGlowFiltersTestGroup> f266411d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f266412e = C42727D.c(new a());

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f266413f = C42727D.c(new b());

    /* compiled from: SectionedMultiselectConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/remote/model/Image;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<String, ? extends Image>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends Image> invoke() {
            c cVar = c.this;
            return cVar.f266408a.a(cVar.f266409b);
        }
    }

    /* compiled from: SectionedMultiselectConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Map<String, ? extends UniversalImage>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends UniversalImage> invoke() {
            c cVar = c.this;
            return cVar.f266408a.f(cVar.f266409b);
        }
    }

    @Inject
    public c(@k i iVar, @k @com.avito.android.select.sectioned_multiselect.a String str, @k com.avito.android.select.glow_animation.d dVar, @oD.i @k g<AutoGlowFiltersTestGroup> gVar) {
        this.f266408a = iVar;
        this.f266409b = str;
        this.f266410c = dVar;
        this.f266411d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.select.sectioned_multiselect.b
    @k
    public final List a(@l ArrayList arrayList, @k List list, @k Set set, boolean z12, @k Map map, boolean z13) {
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar;
        UniversalImage universalImage;
        UniversalImage multiThemeImage;
        com.avito.android.select.sectioned_multiselect.Items.section_item.a aVar2;
        String title;
        Object next;
        UniversalImage universalImage2;
        UniversalImage multiThemeImages;
        UniversalImage universalImage3;
        UniversalImage multiThemeImage2;
        if (arrayList.isEmpty()) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean zIsEmpty = map.isEmpty();
        InterfaceC42726C interfaceC42726C = this.f266413f;
        if (zIsEmpty) {
            Set set2 = set;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((ParcelableEntity) it.next()).getId());
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ParcelableEntity parcelableEntity = (ParcelableEntity) it2.next();
                if (parcelableEntity instanceof SectionTitle) {
                    arrayList2.add(new com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a((String) parcelableEntity.getId(), ((SectionTitle) parcelableEntity).getTitle()));
                } else if (parcelableEntity instanceof SelectParameter.Value) {
                    boolean zContains = arrayList3.contains(parcelableEntity.getId());
                    boolean z14 = (!z13 || zContains) && !((SelectParameter.Value) parcelableEntity).getIsDisabled();
                    String str = (String) parcelableEntity.getId();
                    SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
                    String title2 = value.getTitle();
                    SelectParameter.Value.Display display = value.getDisplay();
                    if (display == null || (multiThemeImages = display.getMultiThemeImages()) == null) {
                        Map map2 = (Map) interfaceC42726C.getValue();
                        universalImage2 = map2 != null ? (UniversalImage) map2.get(parcelableEntity.getId()) : null;
                    } else {
                        universalImage2 = multiThemeImages;
                    }
                    arrayList2.add(new com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a(str, title2, universalImage2, zContains, z14));
                } else if (parcelableEntity instanceof SectionedMultiselectParameter.Value) {
                    boolean zContains2 = arrayList3.contains(parcelableEntity.getId());
                    boolean z15 = (!z13 || zContains2) && !((SectionedMultiselectParameter.Value) parcelableEntity).isDisabled();
                    String str2 = (String) parcelableEntity.getId();
                    String title3 = parcelableEntity.getTitle();
                    String str3 = title3 == null ? "" : title3;
                    SectionedMultiselectParameter.Display display2 = ((SectionedMultiselectParameter.Value) parcelableEntity).getDisplay();
                    if (display2 == null || (multiThemeImage2 = display2.getMultiThemeImage()) == null) {
                        Map map3 = (Map) interfaceC42726C.getValue();
                        universalImage3 = map3 != null ? (UniversalImage) map3.get(parcelableEntity.getId()) : null;
                    } else {
                        universalImage3 = multiThemeImage2;
                    }
                    arrayList2.add(new com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a(str2, str3, universalImage3, zContains2, z15));
                }
            }
            return arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            SectionedMultiselectParameter.Tab tab = (SectionedMultiselectParameter.Tab) entry.getKey();
            Set<ParcelableEntity> set3 = (Set) entry.getValue();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(set3, 10));
            for (ParcelableEntity parcelableEntity2 : set3) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (L.f(parcelableEntity2.getId(), ((SectionedMultiselectParameter.Value) next).getId())) {
                        break;
                    }
                }
                arrayList4.add((SectionedMultiselectParameter.Value) next);
            }
            linkedHashMap.put(tab, C42745f0.P0(arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        if (z12) {
            Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
            ArrayList arrayList6 = new ArrayList(C42745f0.q(setEntrySet, 10));
            for (Map.Entry entry2 : setEntrySet) {
                Iterable<SectionedMultiselectParameter.Value> iterable = (Iterable) entry2.getValue();
                ArrayList arrayList7 = new ArrayList();
                for (SectionedMultiselectParameter.Value value2 : iterable) {
                    if (value2 != null) {
                        boolean zContains3 = set.contains(value2);
                        boolean z16 = !(z13 && !zContains3);
                        String id2 = value2.getId();
                        SectionedMultiselectParameter.Display display3 = value2.getDisplay();
                        String str4 = ((display3 == null || (title = display3.getTitle()) == null) && (title = value2.getTitle()) == null) ? "" : title;
                        SectionedMultiselectParameter.Display display4 = value2.getDisplay();
                        String subtitle = display4 != null ? display4.getSubtitle() : null;
                        Map map4 = (Map) this.f266412e.getValue();
                        aVar2 = new com.avito.android.select.sectioned_multiselect.Items.section_item.a(id2, str4, subtitle, false, z16, zContains3, map4 != null ? (Image) map4.get(value2.getId()) : null, 8, null);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList7.add(aVar2);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    arrayList5.add(new com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a(((SectionedMultiselectParameter.Tab) entry2.getKey()).getId(), ((SectionedMultiselectParameter.Tab) entry2.getKey()).getTabTitle()));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add((com.avito.android.select.sectioned_multiselect.Items.section_item.a) it4.next());
                    }
                }
                arrayList6.add(G0.f406611a);
            }
        } else {
            Set<Map.Entry> setEntrySet2 = linkedHashMap.entrySet();
            ArrayList arrayList8 = new ArrayList(C42745f0.q(setEntrySet2, 10));
            for (Map.Entry entry3 : setEntrySet2) {
                Iterable<SectionedMultiselectParameter.Value> iterable2 = (Iterable) entry3.getValue();
                ArrayList arrayList9 = new ArrayList();
                for (SectionedMultiselectParameter.Value value3 : iterable2) {
                    if (value3 != null) {
                        boolean zContains4 = set.contains(value3);
                        boolean z17 = (!z13 || zContains4) && !value3.isDisabled();
                        String id3 = value3.getId();
                        String title4 = value3.getTitle();
                        String str5 = title4 == null ? "" : title4;
                        SectionedMultiselectParameter.Display display5 = value3.getDisplay();
                        if (display5 == null || (multiThemeImage = display5.getMultiThemeImage()) == null) {
                            Map map5 = (Map) interfaceC42726C.getValue();
                            universalImage = map5 != null ? (UniversalImage) map5.get(value3.getId()) : null;
                        } else {
                            universalImage = multiThemeImage;
                        }
                        aVar = new com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a(id3, str5, universalImage, zContains4, z17);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList9.add(aVar);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    arrayList5.add(new com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a(((SectionedMultiselectParameter.Tab) entry3.getKey()).getId(), ((SectionedMultiselectParameter.Tab) entry3.getKey()).getTabTitle()));
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add((com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) it5.next());
                    }
                }
                arrayList8.add(G0.f406611a);
            }
        }
        return arrayList5;
    }

    @Override // com.avito.android.select.sectioned_multiselect.b
    @k
    public final ArrayList b(@k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SelectParameter.Value value = (SelectParameter.Value) it.next();
            String id2 = value.getId();
            String title = value.getTitle();
            MultiselectParameter.Type type = MultiselectParameter.Type.IMAGE_RIGHT;
            SelectParameter.Value.Display display = value.getDisplay();
            arrayList2.add(new SectionedMultiselectParameter.Value(id2, title, new SectionedMultiselectParameter.Display(null, null, null, null, null, null, type, display != null ? display.getMultiThemeImages() : null, null, null, 830, null), null, null, value.getIsDisabled(), 24, null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.select.sectioned_multiselect.b
    @k
    public final ArrayList c(@k List list) {
        SelectParameter.Value.Display.Link link;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        SectionTitle sectionTitle = null;
        while (it.hasNext()) {
            ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
            if (parcelableEntity instanceof SectionTitle) {
                if (sectionTitle != null && !arrayList2.isEmpty()) {
                    arrayList.add(new SectionedMultiselectParameter.Value((String) parcelableEntity.getId(), sectionTitle.getTitle(), null, null, C42745f0.M0(arrayList2), false, 40, null));
                    arrayList2.clear();
                }
                sectionTitle = (SectionTitle) parcelableEntity;
            } else if (parcelableEntity instanceof SelectParameter.Value) {
                String str = (String) parcelableEntity.getId();
                SelectParameter.Value value = (SelectParameter.Value) parcelableEntity;
                String title = value.getTitle();
                MultiselectParameter.Type type = MultiselectParameter.Type.IMAGE_RIGHT;
                SelectParameter.Value.Display display = value.getDisplay();
                UniversalImage multiThemeImages = display != null ? display.getMultiThemeImages() : null;
                SelectParameter.Value.Display display2 = value.getDisplay();
                List<UniversalColor> gradientColors = display2 != null ? display2.getGradientColors() : null;
                SelectParameter.Value.Display display3 = value.getDisplay();
                arrayList2.add(new SectionedMultiselectParameter.Value(str, title, new SectionedMultiselectParameter.Display(null, null, null, null, null, null, type, multiThemeImages, gradientColors, new MultiselectParameter.Value.Display.Link((display3 == null || (link = display3.getLink()) == null) ? null : link.getDeepLink()), 62, null), null, null, value.getIsDisabled(), 24, null));
            }
        }
        if (sectionTitle != null && !arrayList2.isEmpty()) {
            arrayList.add(new SectionedMultiselectParameter.Value(sectionTitle.getId(), sectionTitle.getTitle(), null, null, C42745f0.M0(arrayList2), false, 40, null));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Type inference failed for: r12v23, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.Set] */
    @Override // com.avito.android.select.sectioned_multiselect.b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(@Y61.k java.util.List r25, @Y61.k java.util.Set r26, boolean r27, @Y61.l java.util.List r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.sectioned_multiselect.c.d(java.util.List, java.util.Set, boolean, java.util.List, boolean):java.util.ArrayList");
    }
}
