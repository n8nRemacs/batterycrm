package com.avito.android.publish.slots.sleeping_places.item;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBottomSheetData;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesRules;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SleepingPlacesSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/items/ItemWithState;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, ItemWithState {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244870b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public ItemWithState.State f244871c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f244872d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f244873e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f244874f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f244875g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SleepingPlacesBottomSheetData f244876h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f244877i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SleepingPlacesRules f244878j;

    public a(@Y61.k String str, @Y61.k ItemWithState.State state, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12, @Y61.k SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData, @Y61.k ArrayList arrayList, @Y61.k SleepingPlacesRules sleepingPlacesRules) {
        this.f244870b = str;
        this.f244871c = state;
        this.f244872d = str2;
        this.f244873e = str3;
        this.f244874f = str4;
        this.f244875g = z12;
        this.f244876h = sleepingPlacesBottomSheetData;
        this.f244877i = arrayList;
        this.f244878j = sleepingPlacesRules;
    }

    public static a a(a aVar, ArrayList arrayList) {
        String str = aVar.f244870b;
        ItemWithState.State state = aVar.f244871c;
        String str2 = aVar.f244872d;
        String str3 = aVar.f244873e;
        String str4 = aVar.f244874f;
        boolean z12 = aVar.f244875g;
        SleepingPlacesBottomSheetData sleepingPlacesBottomSheetData = aVar.f244876h;
        SleepingPlacesRules sleepingPlacesRules = aVar.f244878j;
        aVar.getClass();
        return new a(str, state, str2, str3, str4, z12, sleepingPlacesBottomSheetData, arrayList, sleepingPlacesRules);
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@Y61.k ItemWithState.State state) {
        this.f244871c = state;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f244870b, aVar.f244870b) && L.f(this.f244871c, aVar.f244871c) && L.f(this.f244872d, aVar.f244872d) && L.f(this.f244873e, aVar.f244873e) && L.f(this.f244874f, aVar.f244874f) && this.f244875g == aVar.f244875g && L.f(this.f244876h, aVar.f244876h) && this.f244877i.equals(aVar.f244877i) && L.f(this.f244878j, aVar.f244878j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return getF242945b().hashCode();
    }

    @Override // com.avito.android.items.ItemWithState
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF244871c() {
        return this.f244871c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF242945b() {
        return this.f244870b;
    }

    public final int hashCode() {
        int iHashCode = (this.f244871c.hashCode() + (this.f244870b.hashCode() * 31)) * 31;
        String str = this.f244872d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f244873e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f244874f;
        return this.f244878j.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f244877i, (this.f244876h.hashCode() + r.i((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f244875g)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "SleepingPlacesSlotItem(stringId=" + this.f244870b + ", state=" + this.f244871c + ", title=" + this.f244872d + ", subtitle=" + this.f244873e + ", addActionText=" + this.f244874f + ", isNew=" + this.f244875g + ", selectBottomSheet=" + this.f244876h + ", selectedBedTypes=" + this.f244877i + ", validationRules=" + this.f244878j + ')';
    }
}
