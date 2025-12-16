package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DistrictsWithRegions.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002()B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/DistrictsWithRegions;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/District;", "districts", "Lcom/avito/android/remote/model/DistrictsWithRegions$DistrictRegion;", "regions", "", "shouldShowNewUI", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "copy", "(Ljava/util/List;Ljava/util/List;Z)Lcom/avito/android/remote/model/DistrictsWithRegions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDistricts", "getRegions", "Z", "getShouldShowNewUI", "Companion", "DistrictRegion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DistrictsWithRegions implements Parcelable {

    @k
    private final List<District> districts;

    @l
    private final List<DistrictRegion> regions;
    private final boolean shouldShowNewUI;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<DistrictsWithRegions> CREATOR = new Creator();

    @k
    private static final DistrictsWithRegions EMPTY = new DistrictsWithRegions(C42784z0.f406748b, null, false);

    /* compiled from: DistrictsWithRegions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/DistrictsWithRegions$Companion;", "", "()V", "EMPTY", "Lcom/avito/android/remote/model/DistrictsWithRegions;", "getEMPTY", "()Lcom/avito/android/remote/model/DistrictsWithRegions;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final DistrictsWithRegions getEMPTY() {
            return DistrictsWithRegions.EMPTY;
        }

        private Companion() {
        }
    }

    /* compiled from: DistrictsWithRegions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DistrictsWithRegions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DistrictsWithRegions createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(District.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(DistrictRegion.CREATOR, parcel, arrayList3, iC3, 1);
                }
                arrayList = arrayList3;
            }
            return new DistrictsWithRegions(arrayList2, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DistrictsWithRegions[] newArray(int i12) {
            return new DistrictsWithRegions[i12];
        }
    }

    /* compiled from: DistrictsWithRegions.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ>\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/DistrictsWithRegions$DistrictRegion;", "Landroid/os/Parcelable;", "", "", "districtIds", "", "fullName", "id", "shortName", "<init>", "(Ljava/util/List;Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;JLjava/lang/String;)Lcom/avito/android/remote/model/DistrictsWithRegions$DistrictRegion;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDistrictIds", "Ljava/lang/String;", "getFullName", "J", "getId", "getShortName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DistrictRegion implements Parcelable {

        @k
        public static final Parcelable.Creator<DistrictRegion> CREATOR = new Creator();

        @k
        private final List<Long> districtIds;

        @k
        private final String fullName;
        private final long id;

        @k
        private final String shortName;

        /* compiled from: DistrictsWithRegions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DistrictRegion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DistrictRegion createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new DistrictRegion(arrayList, parcel.readString(), parcel.readLong(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DistrictRegion[] newArray(int i12) {
                return new DistrictRegion[i12];
            }
        }

        public DistrictRegion(@k List<Long> list, @k String str, long j12, @k String str2) {
            this.districtIds = list;
            this.fullName = str;
            this.id = j12;
            this.shortName = str2;
        }

        public static /* synthetic */ DistrictRegion copy$default(DistrictRegion districtRegion, List list, String str, long j12, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = districtRegion.districtIds;
            }
            if ((i12 & 2) != 0) {
                str = districtRegion.fullName;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                j12 = districtRegion.id;
            }
            long j13 = j12;
            if ((i12 & 8) != 0) {
                str2 = districtRegion.shortName;
            }
            return districtRegion.copy(list, str3, j13, str2);
        }

        @k
        public final List<Long> component1() {
            return this.districtIds;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* renamed from: component3, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getShortName() {
            return this.shortName;
        }

        @k
        public final DistrictRegion copy(@k List<Long> districtIds, @k String fullName, long id2, @k String shortName) {
            return new DistrictRegion(districtIds, fullName, id2, shortName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DistrictRegion)) {
                return false;
            }
            DistrictRegion districtRegion = (DistrictRegion) other;
            return L.f(this.districtIds, districtRegion.districtIds) && L.f(this.fullName, districtRegion.fullName) && this.id == districtRegion.id && L.f(this.shortName, districtRegion.shortName);
        }

        @k
        public final List<Long> getDistrictIds() {
            return this.districtIds;
        }

        @k
        public final String getFullName() {
            return this.fullName;
        }

        public final long getId() {
            return this.id;
        }

        @k
        public final String getShortName() {
            return this.shortName;
        }

        public int hashCode() {
            return this.shortName.hashCode() + r.g(H.d(this.districtIds.hashCode() * 31, 31, this.fullName), 31, this.id);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DistrictRegion(districtIds=");
            sb2.append(this.districtIds);
            sb2.append(", fullName=");
            sb2.append(this.fullName);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", shortName=");
            return C22026a.c(sb2, this.shortName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.districtIds, parcel);
            while (itJ.hasNext()) {
                parcel.writeLong(((Number) itJ.next()).longValue());
            }
            parcel.writeString(this.fullName);
            parcel.writeLong(this.id);
            parcel.writeString(this.shortName);
        }
    }

    public DistrictsWithRegions(@k List<District> list, @l List<DistrictRegion> list2, boolean z12) {
        this.districts = list;
        this.regions = list2;
        this.shouldShowNewUI = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictsWithRegions copy$default(DistrictsWithRegions districtsWithRegions, List list, List list2, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = districtsWithRegions.districts;
        }
        if ((i12 & 2) != 0) {
            list2 = districtsWithRegions.regions;
        }
        if ((i12 & 4) != 0) {
            z12 = districtsWithRegions.shouldShowNewUI;
        }
        return districtsWithRegions.copy(list, list2, z12);
    }

    @k
    public final List<District> component1() {
        return this.districts;
    }

    @l
    public final List<DistrictRegion> component2() {
        return this.regions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowNewUI() {
        return this.shouldShowNewUI;
    }

    @k
    public final DistrictsWithRegions copy(@k List<District> districts, @l List<DistrictRegion> regions, boolean shouldShowNewUI) {
        return new DistrictsWithRegions(districts, regions, shouldShowNewUI);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistrictsWithRegions)) {
            return false;
        }
        DistrictsWithRegions districtsWithRegions = (DistrictsWithRegions) other;
        return L.f(this.districts, districtsWithRegions.districts) && L.f(this.regions, districtsWithRegions.regions) && this.shouldShowNewUI == districtsWithRegions.shouldShowNewUI;
    }

    @k
    public final List<District> getDistricts() {
        return this.districts;
    }

    @l
    public final List<DistrictRegion> getRegions() {
        return this.regions;
    }

    public final boolean getShouldShowNewUI() {
        return this.shouldShowNewUI;
    }

    public int hashCode() {
        int iHashCode = this.districts.hashCode() * 31;
        List<DistrictRegion> list = this.regions;
        return Boolean.hashCode(this.shouldShowNewUI) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DistrictsWithRegions(districts=");
        sb2.append(this.districts);
        sb2.append(", regions=");
        sb2.append(this.regions);
        sb2.append(", shouldShowNewUI=");
        return r.x(sb2, this.shouldShowNewUI, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.districts, parcel);
        while (itJ.hasNext()) {
            ((District) itJ.next()).writeToParcel(parcel, flags);
        }
        List<DistrictRegion> list = this.regions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DistrictRegion) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.shouldShowNewUI ? 1 : 0);
    }

    public /* synthetic */ DistrictsWithRegions(List list, List list2, boolean z12, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : list2, (i12 & 4) != 0 ? false : z12);
    }
}
