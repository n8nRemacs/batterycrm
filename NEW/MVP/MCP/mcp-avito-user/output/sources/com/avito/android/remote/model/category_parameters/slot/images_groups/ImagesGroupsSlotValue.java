package com.avito.android.remote.model.category_parameters.slot.images_groups;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsSlotValue.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "", ImagesGroupsSlot.f253817ID, "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotValue;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getImagesGroups", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImagesGroupsSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<ImagesGroupsSlotValue> CREATOR = new Creator();

    @c(ImagesGroupsSlot.f253817ID)
    @l
    private final Map<String, String> imagesGroups;

    /* compiled from: ImagesGroupsSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImagesGroupsSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsSlotValue createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ImagesGroupsSlotValue(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImagesGroupsSlotValue[] newArray(int i12) {
            return new ImagesGroupsSlotValue[i12];
        }
    }

    public ImagesGroupsSlotValue(@l Map<String, String> map) {
        this.imagesGroups = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesGroupsSlotValue copy$default(ImagesGroupsSlotValue imagesGroupsSlotValue, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = imagesGroupsSlotValue.imagesGroups;
        }
        return imagesGroupsSlotValue.copy(map);
    }

    @l
    public final Map<String, String> component1() {
        return this.imagesGroups;
    }

    @k
    public final ImagesGroupsSlotValue copy(@l Map<String, String> imagesGroups) {
        return new ImagesGroupsSlotValue(imagesGroups);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImagesGroupsSlotValue) && L.f(this.imagesGroups, ((ImagesGroupsSlotValue) other).imagesGroups);
    }

    @l
    public final Map<String, String> getImagesGroups() {
        return this.imagesGroups;
    }

    public int hashCode() {
        Map<String, String> map = this.imagesGroups;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @k
    public String toString() {
        return r.w(new StringBuilder("ImagesGroupsSlotValue(imagesGroups="), this.imagesGroups, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, String> map = this.imagesGroups;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
