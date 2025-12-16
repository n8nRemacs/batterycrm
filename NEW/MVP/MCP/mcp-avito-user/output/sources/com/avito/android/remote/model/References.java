package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: References.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/References;", "Landroid/os/Parcelable;", "", "", "location", MetroParameter.TYPE, DistrictParameter.TYPE, "direction", "category", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getLocation", "()Ljava/util/Map;", "getMetro", "getDistrict", "getDirection", "getCategory", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class References implements Parcelable {

    @k
    public static final Parcelable.Creator<References> CREATOR = new Creator();

    @l
    private final Map<String, String> category;

    @l
    private final Map<String, String> direction;

    @l
    private final Map<String, String> district;

    @l
    private final Map<String, String> location;

    @l
    private final Map<String, String> metro;

    /* compiled from: References.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<References> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final References createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            int iA2 = 0;
            LinkedHashMap linkedHashMap5 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i12);
                int iA3 = 0;
                while (iA3 != i12) {
                    iA3 = C0.a(parcel, linkedHashMap6, parcel.readString(), iA3, 1);
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(i13);
                int iA4 = 0;
                while (iA4 != i13) {
                    iA4 = C0.a(parcel, linkedHashMap7, parcel.readString(), iA4, 1);
                }
                linkedHashMap2 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(i14);
                int iA5 = 0;
                while (iA5 != i14) {
                    iA5 = C0.a(parcel, linkedHashMap8, parcel.readString(), iA5, 1);
                }
                linkedHashMap3 = linkedHashMap8;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap4 = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(i15);
                int iA6 = 0;
                while (iA6 != i15) {
                    iA6 = C0.a(parcel, linkedHashMap9, parcel.readString(), iA6, 1);
                }
                linkedHashMap4 = linkedHashMap9;
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                linkedHashMap5 = new LinkedHashMap(i16);
                while (iA2 != i16) {
                    iA2 = C0.a(parcel, linkedHashMap5, parcel.readString(), iA2, 1);
                }
            }
            return new References(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final References[] newArray(int i12) {
            return new References[i12];
        }
    }

    public References(@l Map<String, String> map, @l Map<String, String> map2, @l Map<String, String> map3, @l Map<String, String> map4, @l Map<String, String> map5) {
        this.location = map;
        this.metro = map2;
        this.district = map3;
        this.direction = map4;
        this.category = map5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Map<String, String> getCategory() {
        return this.category;
    }

    @l
    public final Map<String, String> getDirection() {
        return this.direction;
    }

    @l
    public final Map<String, String> getDistrict() {
        return this.district;
    }

    @l
    public final Map<String, String> getLocation() {
        return this.location;
    }

    @l
    public final Map<String, String> getMetro() {
        return this.metro;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, String> map = this.location;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.metro;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
        Map<String, String> map3 = this.district;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH3 = C0.h(parcel, 1, map3);
            while (itH3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) itH3.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeString((String) entry3.getValue());
            }
        }
        Map<String, String> map4 = this.direction;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH4 = C0.h(parcel, 1, map4);
            while (itH4.hasNext()) {
                Map.Entry entry4 = (Map.Entry) itH4.next();
                parcel.writeString((String) entry4.getKey());
                parcel.writeString((String) entry4.getValue());
            }
        }
        Map<String, String> map5 = this.category;
        if (map5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH5 = C0.h(parcel, 1, map5);
        while (itH5.hasNext()) {
            Map.Entry entry5 = (Map.Entry) itH5.next();
            parcel.writeString((String) entry5.getKey());
            parcel.writeString((String) entry5.getValue());
        }
    }
}
