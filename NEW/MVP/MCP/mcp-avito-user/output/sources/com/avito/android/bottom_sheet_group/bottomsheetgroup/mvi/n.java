package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupInternalAction;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity.BottomSheetGroupState;
import com.avito.android.bottom_sheet_group.s;
import com.avito.android.bottom_sheet_group.w;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BottomSheetGroupReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupInternalAction;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements u<BottomSheetGroupInternalAction, BottomSheetGroupState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f107281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f107282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BottomSheetGroupParameter f107283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BottomSheetGroupParameter f107284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f107285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f107286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f107287h;

    @Inject
    public n(@Y61.k w wVar, @Y61.k s sVar, @Y61.k BottomSheetGroupParameter bottomSheetGroupParameter) {
        this.f107281b = wVar;
        this.f107282c = sVar;
        this.f107283d = bottomSheetGroupParameter;
        List<MultiselectParameter> parameters = bottomSheetGroupParameter.getParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
        for (MultiselectParameter multiselectParameter : parameters) {
            List<? extends String> list = multiselectParameter.get_value();
            arrayList.add(multiselectParameter.copy((4194175 & 1) != 0 ? multiselectParameter.id : null, (4194175 & 2) != 0 ? multiselectParameter.title : null, (4194175 & 4) != 0 ? multiselectParameter.required : false, (4194175 & 8) != 0 ? multiselectParameter.immutable : false, (4194175 & 16) != 0 ? multiselectParameter.motivation : null, (4194175 & 32) != 0 ? multiselectParameter.updatesForm : null, (4194175 & 64) != 0 ? multiselectParameter.updatesObjectForm : null, (4194175 & 128) != 0 ? multiselectParameter._value : list != null ? C42745f0.M0(list) : null, (4194175 & 256) != 0 ? multiselectParameter.displaying : null, (4194175 & 512) != 0 ? multiselectParameter.values : null, (4194175 & 1024) != 0 ? multiselectParameter.selectedValues : null, (4194175 & 2048) != 0 ? multiselectParameter.placeholder : null, (4194175 & 4096) != 0 ? multiselectParameter.attributeId : null, (4194175 & 8192) != 0 ? multiselectParameter.maxSelected : null, (4194175 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? multiselectParameter.subtitle : null, (4194175 & 32768) != 0 ? multiselectParameter.availableOptions : null, (4194175 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? multiselectParameter.hint : null, (4194175 & 131072) != 0 ? multiselectParameter.visible : null, (4194175 & 262144) != 0 ? multiselectParameter.phantom : null, (4194175 & 524288) != 0 ? multiselectParameter.hasSuggest : null, (4194175 & 1048576) != 0 ? multiselectParameter.resetAreaOnChange : false, (4194175 & 2097152) != 0 ? multiselectParameter.constraints : null));
        }
        BottomSheetGroupParameter bottomSheetGroupParameterCopy = bottomSheetGroupParameter.copy((255 & 1) != 0 ? bottomSheetGroupParameter.id : null, (255 & 2) != 0 ? bottomSheetGroupParameter.title : null, (255 & 4) != 0 ? bottomSheetGroupParameter.immutable : false, (255 & 8) != 0 ? bottomSheetGroupParameter.required : false, (255 & 16) != 0 ? bottomSheetGroupParameter.motivation : null, (255 & 32) != 0 ? bottomSheetGroupParameter.payload : null, (255 & 64) != 0 ? bottomSheetGroupParameter.visible : null, (255 & 128) != 0 ? bottomSheetGroupParameter.phantom : null, (255 & 256) != 0 ? bottomSheetGroupParameter.parameters : arrayList);
        this.f107284e = bottomSheetGroupParameterCopy;
        this.f107285f = c(bottomSheetGroupParameterCopy);
        this.f107286g = c(bottomSheetGroupParameterCopy);
        this.f107287h = new LinkedHashMap();
    }

    public static MultiselectParameter b(BottomSheetGroupParameter bottomSheetGroupParameter, String str) {
        Object next;
        Iterator<T> it = bottomSheetGroupParameter.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((MultiselectParameter) next).getId(), str)) {
                break;
            }
        }
        return (MultiselectParameter) next;
    }

    public static LinkedHashSet c(BottomSheetGroupParameter bottomSheetGroupParameter) {
        List<MultiselectParameter> parameters = bottomSheetGroupParameter.getParameters();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            List<? extends String> value = ((MultiselectParameter) it.next()).getValue();
            C42745f0.h(value != null ? value : B0.f406639b, arrayList);
        }
        return C42745f0.O0(arrayList);
    }

    @Override // com.avito.android.arch.mvi.u
    public final BottomSheetGroupState a(BottomSheetGroupInternalAction bottomSheetGroupInternalAction, BottomSheetGroupState bottomSheetGroupState) throws Resources.NotFoundException {
        List<? extends String> value;
        BottomSheetGroupInternalAction bottomSheetGroupInternalAction2 = bottomSheetGroupInternalAction;
        BottomSheetGroupState bottomSheetGroupState2 = bottomSheetGroupState;
        boolean z12 = bottomSheetGroupInternalAction2 instanceof BottomSheetGroupInternalAction.InitContent;
        w wVar = this.f107281b;
        LinkedHashSet linkedHashSet = this.f107285f;
        LinkedHashMap linkedHashMap = this.f107287h;
        BottomSheetGroupParameter bottomSheetGroupParameter = this.f107284e;
        LinkedHashSet linkedHashSet2 = this.f107286g;
        if (z12) {
            boolean z13 = !L.f(linkedHashSet, linkedHashSet2);
            s sVar = this.f107282c;
            String string = sVar.f107420a.getString(R.string.accept_button_text);
            String string2 = sVar.f107420a.getString(R.string.reset_button_text);
            boolean z14 = !linkedHashSet2.isEmpty();
            List<MultiselectParameter> parameters = bottomSheetGroupParameter.getParameters();
            wVar.getClass();
            return new BottomSheetGroupState(string, z13, string2, z14, w.a(parameters, linkedHashMap), d(), this.f107283d.getId());
        }
        if (bottomSheetGroupInternalAction2 instanceof BottomSheetGroupInternalAction.OnClearClicked) {
            Iterator<T> it = bottomSheetGroupParameter.getParameters().iterator();
            while (it.hasNext()) {
                ((MultiselectParameter) it.next()).setValue(null);
            }
            linkedHashSet2.clear();
            boolean z15 = !L.f(linkedHashSet, linkedHashSet2);
            boolean z16 = !linkedHashSet2.isEmpty();
            LinkedHashMap linkedHashMapD = d();
            List<MultiselectParameter> parameters2 = bottomSheetGroupParameter.getParameters();
            wVar.getClass();
            return BottomSheetGroupState.a(bottomSheetGroupState2, z15, z16, w.a(parameters2, linkedHashMap), linkedHashMapD, 69);
        }
        if (!(bottomSheetGroupInternalAction2 instanceof BottomSheetGroupInternalAction.OnItemClicked)) {
            if (!(bottomSheetGroupInternalAction2 instanceof BottomSheetGroupInternalAction.OnExpandButtonClicked)) {
                return bottomSheetGroupState2;
            }
            BottomSheetGroupInternalAction.OnExpandButtonClicked onExpandButtonClicked = (BottomSheetGroupInternalAction.OnExpandButtonClicked) bottomSheetGroupInternalAction2;
            linkedHashMap.put(onExpandButtonClicked.f107250b, Boolean.valueOf(onExpandButtonClicked.f107251c));
            List<MultiselectParameter> parameters3 = bottomSheetGroupParameter.getParameters();
            wVar.getClass();
            return BottomSheetGroupState.a(bottomSheetGroupState2, false, false, w.a(parameters3, linkedHashMap), null, 111);
        }
        BottomSheetGroupInternalAction.OnItemClicked onItemClicked = (BottomSheetGroupInternalAction.OnItemClicked) bottomSheetGroupInternalAction2;
        String str = onItemClicked.f107252b;
        boolean z17 = onItemClicked.f107254d;
        String str2 = onItemClicked.f107253c;
        if (z17) {
            MultiselectParameter multiselectParameterB = b(bottomSheetGroupParameter, str2);
            if (multiselectParameterB != null) {
                List<? extends String> value2 = multiselectParameterB.getValue();
                ArrayList arrayList = value2 != null ? new ArrayList(value2) : new ArrayList();
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    if (!L.f(multiselectParameterB.getValue(), arrayList)) {
                        multiselectParameterB.setValue(arrayList);
                        multiselectParameterB.setError(null);
                    }
                    linkedHashSet2.add(str);
                }
            }
        } else {
            MultiselectParameter multiselectParameterB2 = b(bottomSheetGroupParameter, str2);
            if (multiselectParameterB2 != null && (value = multiselectParameterB2.getValue()) != null) {
                ArrayList arrayList2 = new ArrayList(value);
                arrayList2.remove(str);
                if (!L.f(multiselectParameterB2.getValue(), arrayList2)) {
                    multiselectParameterB2.setValue(arrayList2);
                    multiselectParameterB2.setError(null);
                }
                linkedHashSet2.remove(str);
            }
        }
        return BottomSheetGroupState.a(bottomSheetGroupState2, !L.f(linkedHashSet, linkedHashSet2), !linkedHashSet2.isEmpty(), null, d(), 85);
    }

    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MultiselectParameter multiselectParameter : this.f107284e.getParameters()) {
            if (O2.a(multiselectParameter.getValue())) {
                linkedHashMap.put(multiselectParameter.getId(), C42745f0.P0(multiselectParameter.getValue()));
            }
        }
        return linkedHashMap;
    }
}
