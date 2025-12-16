package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.developments_catalog.MetroParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DevelopmentsCatalogInfrastructureLink.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/deep_linking/links/InfrastructureBody;", "Landroid/os/Parcelable;", "", "id", "title", AddressParameter.TYPE, "Lcom/avito/android/remote/model/Coordinates;", "coords", "", "Lcom/avito/android/remote/model/developments_catalog/MetroParam;", "geoReferences", "Lcom/avito/android/remote/model/developments_catalog/AmenityButton;", "amenityButtons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "c", "Lcom/avito/android/remote/model/Coordinates;", "e", "()Lcom/avito/android/remote/model/Coordinates;", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InfrastructureBody implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<InfrastructureBody> CREATOR = new a();

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @Y61.l
    private final String address;

    @com.google.gson.annotations.c("amenityButtons")
    @Y61.l
    private final List<AmenityButton> amenityButtons;

    @com.google.gson.annotations.c("coords")
    @Y61.l
    private final Coordinates coords;

    @com.google.gson.annotations.c("geoReferences")
    @Y61.l
    private final List<MetroParam> geoReferences;

    @com.google.gson.annotations.c("developmentId")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("developmentTitle")
    @Y61.l
    private final String title;

    /* compiled from: DevelopmentsCatalogInfrastructureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfrastructureBody> {
        @Override // android.os.Parcelable.Creator
        public final InfrastructureBody createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            Coordinates coordinatesCreateFromParcel = parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(MetroParam.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(AmenityButton.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new InfrastructureBody(string, string2, string3, coordinatesCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final InfrastructureBody[] newArray(int i12) {
            return new InfrastructureBody[i12];
        }
    }

    public InfrastructureBody(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Coordinates coordinates, @Y61.l List<MetroParam> list, @Y61.l List<AmenityButton> list2) {
        this.id = str;
        this.title = str2;
        this.address = str3;
        this.coords = coordinates;
        this.geoReferences = list;
        this.amenityButtons = list2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Y61.l
    public final List<AmenityButton> d() {
        return this.amenityButtons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Coordinates getCoords() {
        return this.coords;
    }

    @Y61.l
    public final List<MetroParam> f() {
        return this.geoReferences;
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        Coordinates coordinates = this.coords;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, i12);
        }
        List<MetroParam> list = this.geoReferences;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((MetroParam) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<AmenityButton> list2 = this.amenityButtons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((AmenityButton) itA2.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ InfrastructureBody(String str, String str2, String str3, Coordinates coordinates, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : coordinates, (i12 & 16) != 0 ? null : list, (i12 & 32) == 0 ? list2 : null);
    }
}
