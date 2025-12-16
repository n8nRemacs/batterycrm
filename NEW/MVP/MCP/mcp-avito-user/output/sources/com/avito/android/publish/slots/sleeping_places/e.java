package com.avito.android.publish.slots.sleeping_places;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SelectedBedTypeState;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesRules;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesSlot;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesSlotConfig;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SleepingPlacesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/e;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/sleeping_places/SleepingPlacesSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends k<SleepingPlacesSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SleepingPlacesSlot f244859b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f244860c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i f244861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f244862e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f244863f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ObjectsParameter f244864g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final IntParameter f244865h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final SelectParameter.Flat f244866i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    @i31.c
    public e(@InterfaceC41220a @Y61.k SleepingPlacesSlot sleepingPlacesSlot, @Y61.k a aVar, @Y61.k i iVar) {
        IntParameter intParameter;
        List<ParameterSlot> params;
        ?? next;
        List<ParameterSlot> params2;
        Object next2;
        this.f244859b = sleepingPlacesSlot;
        this.f244860c = aVar;
        this.f244861d = iVar;
        ObjectsParameter selectedBedTypes = ((SleepingPlacesSlotConfig) sleepingPlacesSlot.getWidget().getConfig()).getSelectedBedTypes();
        this.f244864g = selectedBedTypes;
        if (selectedBedTypes == null || (params2 = selectedBedTypes.getParams()) == null) {
            intParameter = null;
        } else {
            Iterator it = params2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (next2 instanceof IntParameter) {
                        break;
                    }
                }
            }
            intParameter = (IntParameter) (next2 instanceof IntParameter ? next2 : null);
        }
        this.f244865h = intParameter;
        ObjectsParameter objectsParameter = this.f244864g;
        if (objectsParameter != null && (params = objectsParameter.getParams()) != null) {
            Iterator it2 = params.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it2.next();
                    if (next instanceof SelectParameter.Flat) {
                        break;
                    }
                }
            }
            flat = next instanceof SelectParameter.Flat ? next : null;
        }
        this.f244866i = flat;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        Object bVar;
        ArrayList arrayList = this.f244863f;
        SleepingPlacesRules validationRules = ((SleepingPlacesSlotConfig) this.f244859b.getWidget().getConfig()).getValidationRules();
        this.f244861d.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = new P2.b(new SuccessResult(null));
                break;
            }
            if (!L.f(i.a((SelectedBedType) it.next(), validationRules), SelectedBedTypeState.Normal.INSTANCE)) {
                bVar = new P2.a(new SleepingPlacesSlotValidationError());
                break;
            }
        }
        this.f244862e = bVar instanceof P2.a;
        return z.c0(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.ArrayList] */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        C42784z0 c42784z0;
        IntParameter intParameter;
        if (!(aVar instanceof com.avito.android.publish.slots.sleeping_places.item.a)) {
            return f.c.f117644b;
        }
        ArrayList arrayList = this.f244863f;
        ArrayList<SelectedBedType> arrayList2 = ((com.avito.android.publish.slots.sleeping_places.item.a) aVar).f244877i;
        com.avito.android.category_parameters.f bVar = !L.f(arrayList, arrayList2) ? new f.b(SlotType.SLEEPING_PLACES, null) : f.c.f117644b;
        ObjectsParameter objectsParameter = this.f244864g;
        if (objectsParameter != null) {
            this.f244860c.getClass();
            SelectParameter.Flat flat = this.f244866i;
            if (flat == null || (intParameter = this.f244865h) == null) {
                c42784z0 = C42784z0.f406748b;
            } else {
                ?? arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                C42784z0 c42784z02 = arrayList3;
                for (SelectedBedType selectedBedType : arrayList2) {
                    Integer id2 = selectedBedType.getId();
                    int amount = selectedBedType.getAmount();
                    ?? r38 = c42784z02;
                    IntParameter intParameter2 = intParameter;
                    SelectParameter.Flat flatCopy = flat.copy((33554431 & 1) != 0 ? flat.id : null, (33554431 & 2) != 0 ? flat.title : null, (33554431 & 4) != 0 ? flat.subtitle : null, (33554431 & 8) != 0 ? flat.required : false, (33554431 & 16) != 0 ? flat.immutable : false, (33554431 & 32) != 0 ? flat.motivation : null, (33554431 & 64) != 0 ? flat.updatesForm : null, (33554431 & 128) != 0 ? flat.updatesObjectForm : null, (33554431 & 256) != 0 ? flat._value : null, (33554431 & 512) != 0 ? flat.chosenValue : null, (33554431 & 1024) != 0 ? flat._values : null, (33554431 & 2048) != 0 ? flat.displaying : null, (33554431 & 4096) != 0 ? flat.placeholder : null, (33554431 & 8192) != 0 ? flat.attributeId : null, (33554431 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? flat.availableOptions : null, (33554431 & 32768) != 0 ? flat.isEnabled : null, (33554431 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? flat.visible : null, (33554431 & 131072) != 0 ? flat.phantom : null, (33554431 & 262144) != 0 ? flat.resetValue : null, (33554431 & 524288) != 0 ? flat._hasSuggest : null, (33554431 & 1048576) != 0 ? flat.displayTitle : null, (33554431 & 2097152) != 0 ? flat.defaultValue : null, (33554431 & 4194304) != 0 ? flat.resetAreaOnChange : false, (33554431 & 8388608) != 0 ? flat.widget : null, (33554431 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? flat.constraints : null);
                    String string = id2 != null ? id2.toString() : null;
                    if (!L.f(flatCopy.getValue(), string)) {
                        flatCopy.setValue(string);
                        flatCopy.setError(null);
                    }
                    IntParameter intParameterCopy = intParameter2.copy((32766 & 1) != 0 ? intParameter2.id : null, (32766 & 2) != 0 ? intParameter2.title : null, (32766 & 4) != 0 ? intParameter2.required : false, (32766 & 8) != 0 ? intParameter2.immutable : false, (32766 & 16) != 0 ? intParameter2.motivation : null, (32766 & 32) != 0 ? intParameter2.updatesForm : null, (32766 & 64) != 0 ? intParameter2.hint : null, (32766 & 128) != 0 ? intParameter2._value : null, (32766 & 256) != 0 ? intParameter2.constraints : null, (32766 & 512) != 0 ? intParameter2.displayingOptions : null, (32766 & 1024) != 0 ? intParameter2.placeholder : null, (32766 & 2048) != 0 ? intParameter2.button : null, (32766 & 4096) != 0 ? intParameter2.visible : null, (32766 & 8192) != 0 ? intParameter2.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? intParameter2.widget : null);
                    Long lValueOf = Long.valueOf(amount);
                    if (!L.f(intParameterCopy.getValue(), lValueOf)) {
                        intParameterCopy.setValue(lValueOf);
                        intParameterCopy.setError(null);
                    }
                    r38.add(C42745f0.U(flatCopy, intParameterCopy));
                    c42784z02 = r38;
                    intParameter = intParameter2;
                }
                c42784z0 = c42784z02;
            }
            objectsParameter.setValue(c42784z0);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        return bVar;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244859b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        ArrayList arrayList;
        List<? extends List<? extends ParameterSlot>> value;
        String title;
        Object next;
        Object next2;
        Long value2;
        Object next3;
        String value3;
        ArrayList arrayList2 = this.f244863f;
        arrayList2.clear();
        SleepingPlacesSlotConfig sleepingPlacesSlotConfig = (SleepingPlacesSlotConfig) this.f244859b.getWidget().getConfig();
        this.f244860c.getClass();
        ObjectsParameter objectsParameter = this.f244864g;
        if (objectsParameter == null || (value = objectsParameter.getValue()) == null) {
            kotlin.ranges.l lVarR = s.r(0, sleepingPlacesSlotConfig.getValidationRules().getMinGroups());
            arrayList = new ArrayList(C42745f0.q(lVarR, 10));
            kotlin.ranges.k it = lVarR.iterator();
            while (it.f406910d) {
                it.a();
                arrayList.add(new SelectedBedType(null, 0, null, null, null, 31, null));
            }
        } else {
            List<? extends List<? extends ParameterSlot>> list = value;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                Iterator it3 = list2.iterator();
                while (true) {
                    title = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (next instanceof SelectParameter.Flat) {
                        break;
                    }
                }
                if (!(next instanceof SelectParameter.Flat)) {
                    next = null;
                }
                SelectParameter.Flat flat = (SelectParameter.Flat) next;
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    if (next2 instanceof IntParameter) {
                        break;
                    }
                }
                if (!(next2 instanceof IntParameter)) {
                    next2 = null;
                }
                IntParameter intParameter = (IntParameter) next2;
                Integer numY0 = (flat == null || (value3 = flat.getValue()) == null) ? null : C43066x.y0(value3);
                List<SleepingPlacesBedType> options = sleepingPlacesSlotConfig.getSelectBottomSheet().getOptions();
                if (options != null) {
                    Iterator<T> it5 = options.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it5.next();
                        int id2 = ((SleepingPlacesBedType) next3).getId();
                        if (numY0 != null && id2 == numY0.intValue()) {
                            break;
                        }
                    }
                    SleepingPlacesBedType sleepingPlacesBedType = (SleepingPlacesBedType) next3;
                    if (sleepingPlacesBedType != null) {
                        title = sleepingPlacesBedType.getTitle();
                    }
                }
                arrayList.add(new SelectedBedType(numY0, (intParameter == null || (value2 = intParameter.getValue()) == null) ? 0 : (int) value2.longValue(), null, title, null, 20, null));
            }
            if (arrayList.size() < sleepingPlacesSlotConfig.getValidationRules().getMinGroups()) {
                kotlin.ranges.l lVarR2 = s.r(0, sleepingPlacesSlotConfig.getValidationRules().getMinGroups() - arrayList.size());
                ArrayList arrayList3 = new ArrayList(C42745f0.q(lVarR2, 10));
                kotlin.ranges.k it6 = lVarR2.iterator();
                while (it6.f406910d) {
                    it6.a();
                    arrayList3.add(new SelectedBedType(null, 0, null, null, null, 31, null));
                }
                arrayList = C42745f0.h0(arrayList3, arrayList);
            }
        }
        arrayList2.addAll(arrayList);
        return super.h();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        ItemWithState.State normal;
        SelectedBedTypeState selectedBedTypeStateA;
        ArrayList arrayList = this.f244863f;
        boolean z12 = this.f244862e;
        a aVar = this.f244860c;
        aVar.getClass();
        SleepingPlacesSlot sleepingPlacesSlot = this.f244859b;
        SleepingPlacesSlotConfig sleepingPlacesSlotConfig = (SleepingPlacesSlotConfig) sleepingPlacesSlot.getWidget().getConfig();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SelectedBedType selectedBedType = (SelectedBedType) it.next();
            if (z12) {
                SleepingPlacesRules validationRules = sleepingPlacesSlotConfig.getValidationRules();
                aVar.f244857a.getClass();
                selectedBedTypeStateA = i.a(selectedBedType, validationRules);
            } else {
                selectedBedTypeStateA = SelectedBedTypeState.Normal.INSTANCE;
            }
            arrayList2.add(SelectedBedType.copy$default(selectedBedType, null, 0, null, null, selectedBedTypeStateA, 15, null));
        }
        if (arrayList2.isEmpty()) {
            normal = new ItemWithState.State.Normal(null, 1, null);
        } else {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!(((SelectedBedType) it2.next()).getState() instanceof SelectedBedTypeState.Normal)) {
                    normal = ItemWithState.State.Error.ErrorWithoutMessage.f173898b;
                    break;
                }
            }
            normal = new ItemWithState.State.Normal(null, 1, null);
        }
        ItemWithState.State state = normal;
        String id2 = sleepingPlacesSlot.getId();
        String title = sleepingPlacesSlotConfig.getTitle();
        String subtitle = sleepingPlacesSlotConfig.getSubtitle();
        String addActionText = sleepingPlacesSlotConfig.getAddActionText();
        Boolean boolIsNew = sleepingPlacesSlotConfig.isNew();
        return Collections.singletonList(new com.avito.android.publish.slots.sleeping_places.item.a(id2, state, title, subtitle, addActionText, boolIsNew != null ? boolIsNew.booleanValue() : false, sleepingPlacesSlotConfig.getSelectBottomSheet(), arrayList2, sleepingPlacesSlotConfig.getValidationRules()));
    }
}
