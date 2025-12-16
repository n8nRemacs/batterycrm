package com.avito.android.remote.model.rich_geo_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RichGeoBlock.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b0\u0010\u000f¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/rich_geo_block/RichGeoBlock;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "", "Lcom/avito/android/remote/model/GeoReference;", "geoReferenceList", "", "str", "Lcom/avito/android/remote/model/UniversalImage;", "pinImage", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)Lcom/avito/android/remote/model/rich_geo_block/RichGeoBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddress", "Ljava/util/List;", "getGeoReferenceList", "Ljava/lang/Boolean;", "getStr", "Lcom/avito/android/remote/model/UniversalImage;", "getPinImage", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RichGeoBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<RichGeoBlock> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferenceList;

    @c("pin")
    @l
    private final UniversalImage pinImage;

    @c("isStrLayout")
    @l
    private final Boolean str;

    @c("title")
    @l
    private final String title;

    /* compiled from: RichGeoBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RichGeoBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RichGeoBlock createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(GeoReference.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RichGeoBlock(string, arrayList, boolValueOf, (UniversalImage) parcel.readParcelable(RichGeoBlock.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RichGeoBlock[] newArray(int i12) {
            return new RichGeoBlock[i12];
        }
    }

    public RichGeoBlock(@l String str, @l List<GeoReference> list, @l Boolean bool, @l UniversalImage universalImage, @l String str2) {
        this.address = str;
        this.geoReferenceList = list;
        this.str = bool;
        this.pinImage = universalImage;
        this.title = str2;
    }

    public static /* synthetic */ RichGeoBlock copy$default(RichGeoBlock richGeoBlock, String str, List list, Boolean bool, UniversalImage universalImage, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = richGeoBlock.address;
        }
        if ((i12 & 2) != 0) {
            list = richGeoBlock.geoReferenceList;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            bool = richGeoBlock.str;
        }
        Boolean bool2 = bool;
        if ((i12 & 8) != 0) {
            universalImage = richGeoBlock.pinImage;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            str2 = richGeoBlock.title;
        }
        return richGeoBlock.copy(str, list2, bool2, universalImage2, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<GeoReference> component2() {
        return this.geoReferenceList;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getStr() {
        return this.str;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getPinImage() {
        return this.pinImage;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final RichGeoBlock copy(@l String address, @l List<GeoReference> geoReferenceList, @l Boolean str, @l UniversalImage pinImage, @l String title) {
        return new RichGeoBlock(address, geoReferenceList, str, pinImage, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichGeoBlock)) {
            return false;
        }
        RichGeoBlock richGeoBlock = (RichGeoBlock) other;
        return L.f(this.address, richGeoBlock.address) && L.f(this.geoReferenceList, richGeoBlock.geoReferenceList) && L.f(this.str, richGeoBlock.str) && L.f(this.pinImage, richGeoBlock.pinImage) && L.f(this.title, richGeoBlock.title);
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<GeoReference> getGeoReferenceList() {
        return this.geoReferenceList;
    }

    @l
    public final UniversalImage getPinImage() {
        return this.pinImage;
    }

    @l
    public final Boolean getStr() {
        return this.str;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GeoReference> list = this.geoReferenceList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.str;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UniversalImage universalImage = this.pinImage;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RichGeoBlock(address=");
        sb2.append(this.address);
        sb2.append(", geoReferenceList=");
        sb2.append(this.geoReferenceList);
        sb2.append(", str=");
        sb2.append(this.str);
        sb2.append(", pinImage=");
        sb2.append(this.pinImage);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.address);
        List<GeoReference> list = this.geoReferenceList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((GeoReference) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.str;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.pinImage, flags);
        parcel.writeString(this.title);
    }

    public /* synthetic */ RichGeoBlock(String str, List list, Boolean bool, UniversalImage universalImage, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, bool, universalImage, str2);
    }
}
