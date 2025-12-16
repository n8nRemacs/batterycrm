package com.avito.android.bottom_sheet_group;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.di.B;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BottomSheetGroupParameterWrapper.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/BottomSheetGroupParameterWrapper;", "", "ParameterState", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetGroupParameterWrapper {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BottomSheetGroupParameter f107183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f107184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<String> f107185c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f107186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Map<String, Boolean> f107187e;

    /* compiled from: BottomSheetGroupParameterWrapper.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/BottomSheetGroupParameterWrapper$ParameterState;", "Landroid/os/Parcelable;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParameterState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ParameterState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BottomSheetGroupParameter f107188b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Set<String> f107189c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Map<String, Boolean> f107190d;

        /* compiled from: BottomSheetGroupParameterWrapper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ParameterState> {
            @Override // android.os.Parcelable.Creator
            public final ParameterState createFromParcel(Parcel parcel) {
                BottomSheetGroupParameter bottomSheetGroupParameter = (BottomSheetGroupParameter) parcel.readParcelable(ParameterState.class.getClassLoader());
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readString());
                }
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new ParameterState(bottomSheetGroupParameter, linkedHashSet, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ParameterState[] newArray(int i12) {
                return new ParameterState[i12];
            }
        }

        public ParameterState(@Y61.k BottomSheetGroupParameter bottomSheetGroupParameter, @Y61.k Set<String> set, @Y61.k Map<String, Boolean> map) {
            this.f107188b = bottomSheetGroupParameter;
            this.f107189c = set;
            this.f107190d = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParameterState)) {
                return false;
            }
            ParameterState parameterState = (ParameterState) obj;
            return L.f(this.f107188b, parameterState.f107188b) && L.f(this.f107189c, parameterState.f107189c) && L.f(this.f107190d, parameterState.f107190d);
        }

        public final int hashCode() {
            return this.f107190d.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f107189c, this.f107188b.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ParameterState(parameter=");
            sb2.append(this.f107188b);
            sb2.append(", flatInitValues=");
            sb2.append(this.f107189c);
            sb2.append(", expandedParameters=");
            return androidx.appcompat.app.r.w(sb2, this.f107190d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f107188b, i12);
            Set<String> set = this.f107189c;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            Iterator itI = C0.i(parcel, this.f107190d);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
        }
    }

    @Inject
    public BottomSheetGroupParameterWrapper(@Y61.k BottomSheetGroupParameter bottomSheetGroupParameter, @Y61.l ParameterState parameterState) {
        BottomSheetGroupParameter bottomSheetGroupParameterCopy;
        Map<String, Boolean> map;
        Set<String> set;
        if (parameterState == null || (bottomSheetGroupParameterCopy = parameterState.f107188b) == null) {
            List<MultiselectParameter> parameters = bottomSheetGroupParameter.getParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
            for (MultiselectParameter multiselectParameter : parameters) {
                List<? extends String> list = multiselectParameter.get_value();
                arrayList.add(multiselectParameter.copy((4194175 & 1) != 0 ? multiselectParameter.id : null, (4194175 & 2) != 0 ? multiselectParameter.title : null, (4194175 & 4) != 0 ? multiselectParameter.required : false, (4194175 & 8) != 0 ? multiselectParameter.immutable : false, (4194175 & 16) != 0 ? multiselectParameter.motivation : null, (4194175 & 32) != 0 ? multiselectParameter.updatesForm : null, (4194175 & 64) != 0 ? multiselectParameter.updatesObjectForm : null, (4194175 & 128) != 0 ? multiselectParameter._value : list != null ? C42745f0.M0(list) : null, (4194175 & 256) != 0 ? multiselectParameter.displaying : null, (4194175 & 512) != 0 ? multiselectParameter.values : null, (4194175 & 1024) != 0 ? multiselectParameter.selectedValues : null, (4194175 & 2048) != 0 ? multiselectParameter.placeholder : null, (4194175 & 4096) != 0 ? multiselectParameter.attributeId : null, (4194175 & 8192) != 0 ? multiselectParameter.maxSelected : null, (4194175 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? multiselectParameter.subtitle : null, (4194175 & 32768) != 0 ? multiselectParameter.availableOptions : null, (4194175 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? multiselectParameter.hint : null, (4194175 & 131072) != 0 ? multiselectParameter.visible : null, (4194175 & 262144) != 0 ? multiselectParameter.phantom : null, (4194175 & 524288) != 0 ? multiselectParameter.hasSuggest : null, (4194175 & 1048576) != 0 ? multiselectParameter.resetAreaOnChange : false, (4194175 & 2097152) != 0 ? multiselectParameter.constraints : null));
            }
            bottomSheetGroupParameterCopy = bottomSheetGroupParameter.copy((255 & 1) != 0 ? bottomSheetGroupParameter.id : null, (255 & 2) != 0 ? bottomSheetGroupParameter.title : null, (255 & 4) != 0 ? bottomSheetGroupParameter.immutable : false, (255 & 8) != 0 ? bottomSheetGroupParameter.required : false, (255 & 16) != 0 ? bottomSheetGroupParameter.motivation : null, (255 & 32) != 0 ? bottomSheetGroupParameter.payload : null, (255 & 64) != 0 ? bottomSheetGroupParameter.visible : null, (255 & 128) != 0 ? bottomSheetGroupParameter.phantom : null, (255 & 256) != 0 ? bottomSheetGroupParameter.parameters : arrayList);
        }
        this.f107183a = bottomSheetGroupParameterCopy;
        this.f107184b = bottomSheetGroupParameterCopy.getId();
        this.f107185c = (parameterState == null || (set = parameterState.f107189c) == null) ? b(bottomSheetGroupParameterCopy) : set;
        this.f107186d = b(bottomSheetGroupParameterCopy);
        this.f107187e = (parameterState == null || (map = parameterState.f107190d) == null) ? new LinkedHashMap<>() : map;
    }

    public static MultiselectParameter a(BottomSheetGroupParameter bottomSheetGroupParameter, String str) {
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

    public static LinkedHashSet b(BottomSheetGroupParameter bottomSheetGroupParameter) {
        List<MultiselectParameter> parameters = bottomSheetGroupParameter.getParameters();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            List<? extends String> value = ((MultiselectParameter) it.next()).getValue();
            C42745f0.h(value != null ? value : B0.f406639b, arrayList);
        }
        return C42745f0.O0(arrayList);
    }
}
