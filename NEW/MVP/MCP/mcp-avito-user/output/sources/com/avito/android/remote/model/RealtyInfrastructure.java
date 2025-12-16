package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.developments_catalog.MapPreview;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealtyInfrastructure.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/RealtyInfrastructure;", "Landroid/os/Parcelable;", "", "splitTestGroup", "", "Lcom/avito/android/remote/model/developments_catalog/AmenityButton;", "amenityButtons", "Lcom/avito/android/remote/model/developments_catalog/MapPreview;", "mapPreview", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/developments_catalog/MapPreview;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/developments_catalog/MapPreview;", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/developments_catalog/MapPreview;)Lcom/avito/android/remote/model/RealtyInfrastructure;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getSplitTestGroup", "Ljava/util/List;", "getAmenityButtons", "Lcom/avito/android/remote/model/developments_catalog/MapPreview;", "getMapPreview", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RealtyInfrastructure implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyInfrastructure> CREATOR = new Creator();

    @c("layersButtons")
    @l
    private final List<AmenityButton> amenityButtons;

    @c("mapPreview")
    @l
    private final MapPreview mapPreview;

    @c("splitTestGroup")
    @l
    private final Integer splitTestGroup;

    /* compiled from: RealtyInfrastructure.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RealtyInfrastructure> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyInfrastructure createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(RealtyInfrastructure.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new RealtyInfrastructure(numValueOf, arrayList, (MapPreview) parcel.readParcelable(RealtyInfrastructure.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RealtyInfrastructure[] newArray(int i12) {
            return new RealtyInfrastructure[i12];
        }
    }

    public RealtyInfrastructure() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealtyInfrastructure copy$default(RealtyInfrastructure realtyInfrastructure, Integer num, List list, MapPreview mapPreview, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = realtyInfrastructure.splitTestGroup;
        }
        if ((i12 & 2) != 0) {
            list = realtyInfrastructure.amenityButtons;
        }
        if ((i12 & 4) != 0) {
            mapPreview = realtyInfrastructure.mapPreview;
        }
        return realtyInfrastructure.copy(num, list, mapPreview);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getSplitTestGroup() {
        return this.splitTestGroup;
    }

    @l
    public final List<AmenityButton> component2() {
        return this.amenityButtons;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final MapPreview getMapPreview() {
        return this.mapPreview;
    }

    @k
    public final RealtyInfrastructure copy(@l Integer splitTestGroup, @l List<AmenityButton> amenityButtons, @l MapPreview mapPreview) {
        return new RealtyInfrastructure(splitTestGroup, amenityButtons, mapPreview);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtyInfrastructure)) {
            return false;
        }
        RealtyInfrastructure realtyInfrastructure = (RealtyInfrastructure) other;
        return L.f(this.splitTestGroup, realtyInfrastructure.splitTestGroup) && L.f(this.amenityButtons, realtyInfrastructure.amenityButtons) && L.f(this.mapPreview, realtyInfrastructure.mapPreview);
    }

    @l
    public final List<AmenityButton> getAmenityButtons() {
        return this.amenityButtons;
    }

    @l
    public final MapPreview getMapPreview() {
        return this.mapPreview;
    }

    @l
    public final Integer getSplitTestGroup() {
        return this.splitTestGroup;
    }

    public int hashCode() {
        Integer num = this.splitTestGroup;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AmenityButton> list = this.amenityButtons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        MapPreview mapPreview = this.mapPreview;
        return iHashCode2 + (mapPreview != null ? mapPreview.hashCode() : 0);
    }

    @k
    public String toString() {
        return "RealtyInfrastructure(splitTestGroup=" + this.splitTestGroup + ", amenityButtons=" + this.amenityButtons + ", mapPreview=" + this.mapPreview + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.splitTestGroup;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<AmenityButton> list = this.amenityButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.mapPreview, flags);
    }

    public RealtyInfrastructure(@l Integer num, @l List<AmenityButton> list, @l MapPreview mapPreview) {
        this.splitTestGroup = num;
        this.amenityButtons = list;
        this.mapPreview = mapPreview;
    }

    public /* synthetic */ RealtyInfrastructure(Integer num, List list, MapPreview mapPreview, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : mapPreview);
    }
}
