package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectValue.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJF\u0010\r\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/network/model/SelectValue;", "Landroid/os/Parcelable;", "", "", "", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/avito/android/beduin/network/model/SelectValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getConstraints", "getParameters", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectValue implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectValue> CREATOR = new a();

    @l
    private final Map<String, List<Constraint>> constraints;

    @l
    private final Map<String, String> parameters;

    /* compiled from: SelectValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectValue> {
        @Override // android.os.Parcelable.Creator
        public final SelectValue createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            int iA2 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    String string = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i14);
                    int iL2 = 0;
                    while (iL2 != i14) {
                        iL2 = com.avito.android.actions_sheet.a.l(SelectValue.class, parcel, arrayList, iL2, 1);
                    }
                    linkedHashMap.put(string, arrayList);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                while (iA2 != i15) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
            }
            return new SelectValue(linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectValue[] newArray(int i12) {
            return new SelectValue[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectValue(@l Map<String, ? extends List<? extends Constraint>> map, @l Map<String, String> map2) {
        this.constraints = map;
        this.parameters = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectValue copy$default(SelectValue selectValue, Map map, Map map2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = selectValue.constraints;
        }
        if ((i12 & 2) != 0) {
            map2 = selectValue.parameters;
        }
        return selectValue.copy(map, map2);
    }

    @l
    public final Map<String, List<Constraint>> component1() {
        return this.constraints;
    }

    @l
    public final Map<String, String> component2() {
        return this.parameters;
    }

    @k
    public final SelectValue copy(@l Map<String, ? extends List<? extends Constraint>> constraints, @l Map<String, String> parameters) {
        return new SelectValue(constraints, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectValue)) {
            return false;
        }
        SelectValue selectValue = (SelectValue) other;
        return L.f(this.constraints, selectValue.constraints) && L.f(this.parameters, selectValue.parameters);
    }

    @l
    public final Map<String, List<Constraint>> getConstraints() {
        return this.constraints;
    }

    @l
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        Map<String, List<Constraint>> map = this.constraints;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.parameters;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectValue(constraints=");
        sb2.append(this.constraints);
        sb2.append(", parameters=");
        return r.w(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, List<Constraint>> map = this.constraints;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                Iterator itJ = C0.j((List) entry.getValue(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }
        Map<String, String> map2 = this.parameters;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH2 = C0.h(parcel, 1, map2);
        while (itH2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itH2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
