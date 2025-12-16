package com.avito.android.remote.model.seller_addresses;

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
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerAddressesInfo.kt */
@d
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0004TUVWB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b.\u0010/Jª\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u0010*J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000203HÖ\u0001¢\u0006\u0004\b:\u00105J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000203HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010 R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010$R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\b\u000e\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\b\u000f\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bO\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bP\u0010*R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bQ\u0010\"R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010R\u001a\u0004\bS\u0010/¨\u0006X"}, d2 = {"Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Coordinates;", "coordsToShowOnMap", "", "circleRadius", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;", "geoReferencesLayout", "", "Lcom/avito/android/remote/model/GeoReference;", "geoReference", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;", "fullAddress", "", "isExpandable", "isWithDelivery", "", "workingHoursTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "workingHours", "detailsTitle", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellersAddressDetail;", "details", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;", "additionalInfo", "<init>", "(Lcom/avito/android/remote/model/Coordinates;Ljava/lang/Double;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;Ljava/util/List;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;)V", "component1", "()Lcom/avito/android/remote/model/Coordinates;", "component2", "()Ljava/lang/Double;", "component3", "()Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;", "component6", "()Z", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "()Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;", "copy", "(Lcom/avito/android/remote/model/Coordinates;Ljava/lang/Double;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;Ljava/util/List;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;)Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Coordinates;", "getCoordsToShowOnMap", "Ljava/lang/Double;", "getCircleRadius", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;", "getGeoReferencesLayout", "Ljava/util/List;", "getGeoReference", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;", "getFullAddress", "Z", "Ljava/lang/Boolean;", "Ljava/lang/String;", "getWorkingHoursTitle", "getWorkingHours", "getDetailsTitle", "getDetails", "Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;", "getAdditionalInfo", "FullAddress", "GeoReferencesLayout", "SellerAddressesAdditionalInfo", "SellersAddressDetail", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SellerAddressesInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerAddressesInfo> CREATOR = new Creator();

    @c("additionalInfo")
    @l
    private final SellerAddressesAdditionalInfo additionalInfo;

    @c("circleRadius")
    @l
    private final Double circleRadius;

    @c("coordsToShowOnMap")
    @k
    private final Coordinates coordsToShowOnMap;

    @c("details")
    @l
    private final List<SellersAddressDetail> details;

    @c("detailsTitle")
    @l
    private final String detailsTitle;

    @c("fullAddress")
    @k
    private final FullAddress fullAddress;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReference;

    @c("geoReferencesLayout")
    @k
    private final GeoReferencesLayout geoReferencesLayout;

    @c("isExpandable")
    private final boolean isExpandable;

    @c("isWithDelivery")
    @l
    private final Boolean isWithDelivery;

    @c("workingHours")
    @l
    private final List<AttributedText> workingHours;

    @c("workingHoursTitle")
    @l
    private final String workingHoursTitle;

    /* compiled from: SellerAddressesInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerAddressesInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerAddressesInfo createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Coordinates coordinatesCreateFromParcel = Coordinates.CREATOR.createFromParcel(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            GeoReferencesLayout geoReferencesLayoutCreateFromParcel = GeoReferencesLayout.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(GeoReference.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            FullAddress fullAddressCreateFromParcel = FullAddress.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(SellerAddressesInfo.class, parcel, arrayList4, iL2, 1);
                }
                arrayList2 = arrayList4;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = a.c(SellersAddressDetail.CREATOR, parcel, arrayList5, iC2, 1);
                }
                arrayList3 = arrayList5;
            }
            return new SellerAddressesInfo(coordinatesCreateFromParcel, dValueOf, geoReferencesLayoutCreateFromParcel, arrayList, fullAddressCreateFromParcel, z12, boolValueOf, string, arrayList2, string2, arrayList3, parcel.readInt() == 0 ? null : SellerAddressesAdditionalInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerAddressesInfo[] newArray(int i12) {
            return new SellerAddressesInfo[i12];
        }
    }

    /* compiled from: SellerAddressesInfo.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;", "Landroid/os/Parcelable;", "", "locality", "house", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$FullAddress;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocality", "getHouse", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullAddress implements Parcelable {

        @k
        public static final Parcelable.Creator<FullAddress> CREATOR = new Creator();

        @c("house")
        @l
        private final String house;

        @c("locality")
        @k
        private final String locality;

        /* compiled from: SellerAddressesInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FullAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FullAddress createFromParcel(@k Parcel parcel) {
                return new FullAddress(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FullAddress[] newArray(int i12) {
                return new FullAddress[i12];
            }
        }

        public FullAddress(@k String str, @l String str2) {
            this.locality = str;
            this.house = str2;
        }

        public static /* synthetic */ FullAddress copy$default(FullAddress fullAddress, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fullAddress.locality;
            }
            if ((i12 & 2) != 0) {
                str2 = fullAddress.house;
            }
            return fullAddress.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getHouse() {
            return this.house;
        }

        @k
        public final FullAddress copy(@k String locality, @l String house) {
            return new FullAddress(locality, house);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullAddress)) {
                return false;
            }
            FullAddress fullAddress = (FullAddress) other;
            return L.f(this.locality, fullAddress.locality) && L.f(this.house, fullAddress.house);
        }

        @l
        public final String getHouse() {
            return this.house;
        }

        @k
        public final String getLocality() {
            return this.locality;
        }

        public int hashCode() {
            int iHashCode = this.locality.hashCode() * 31;
            String str = this.house;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FullAddress(locality=");
            sb2.append(this.locality);
            sb2.append(", house=");
            return C22026a.c(sb2, this.house, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.locality);
            parcel.writeString(this.house);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SellerAddressesInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$GeoReferencesLayout;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "DEFAULT", "COMPACT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class GeoReferencesLayout implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ GeoReferencesLayout[] $VALUES;

        @k
        public static final Parcelable.Creator<GeoReferencesLayout> CREATOR;

        @c("default")
        public static final GeoReferencesLayout DEFAULT = new GeoReferencesLayout("DEFAULT", 0);

        @c("compact")
        public static final GeoReferencesLayout COMPACT = new GeoReferencesLayout("COMPACT", 1);

        /* compiled from: SellerAddressesInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GeoReferencesLayout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GeoReferencesLayout createFromParcel(@k Parcel parcel) {
                return GeoReferencesLayout.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final GeoReferencesLayout[] newArray(int i12) {
                return new GeoReferencesLayout[i12];
            }
        }

        private static final /* synthetic */ GeoReferencesLayout[] $values() {
            return new GeoReferencesLayout[]{DEFAULT, COMPACT};
        }

        static {
            GeoReferencesLayout[] geoReferencesLayoutArr$values = $values();
            $VALUES = geoReferencesLayoutArr$values;
            $ENTRIES = kotlin.enums.c.a(geoReferencesLayoutArr$values);
            CREATOR = new Creator();
        }

        private GeoReferencesLayout(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<GeoReferencesLayout> getEntries() {
            return $ENTRIES;
        }

        public static GeoReferencesLayout valueOf(String str) {
            return (GeoReferencesLayout) Enum.valueOf(GeoReferencesLayout.class, str);
        }

        public static GeoReferencesLayout[] values() {
            return (GeoReferencesLayout[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SellerAddressesInfo.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;", "Landroid/os/Parcelable;", "", "title", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellerAddressesAdditionalInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SellerAddressesAdditionalInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<SellerAddressesAdditionalInfo> CREATOR = new Creator();

        @c("description")
        @k
        private final AttributedText description;

        @c("text")
        @k
        private final String text;

        @c("title")
        @k
        private final String title;

        /* compiled from: SellerAddressesInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SellerAddressesAdditionalInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerAddressesAdditionalInfo createFromParcel(@k Parcel parcel) {
                return new SellerAddressesAdditionalInfo(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SellerAddressesAdditionalInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerAddressesAdditionalInfo[] newArray(int i12) {
                return new SellerAddressesAdditionalInfo[i12];
            }
        }

        public SellerAddressesAdditionalInfo(@k String str, @k String str2, @k AttributedText attributedText) {
            this.title = str;
            this.text = str2;
            this.description = attributedText;
        }

        public static /* synthetic */ SellerAddressesAdditionalInfo copy$default(SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo, String str, String str2, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = sellerAddressesAdditionalInfo.title;
            }
            if ((i12 & 2) != 0) {
                str2 = sellerAddressesAdditionalInfo.text;
            }
            if ((i12 & 4) != 0) {
                attributedText = sellerAddressesAdditionalInfo.description;
            }
            return sellerAddressesAdditionalInfo.copy(str, str2, attributedText);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final SellerAddressesAdditionalInfo copy(@k String title, @k String text, @k AttributedText description) {
            return new SellerAddressesAdditionalInfo(title, text, description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerAddressesAdditionalInfo)) {
                return false;
            }
            SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo = (SellerAddressesAdditionalInfo) other;
            return L.f(this.title, sellerAddressesAdditionalInfo.title) && L.f(this.text, sellerAddressesAdditionalInfo.text) && L.f(this.description, sellerAddressesAdditionalInfo.description);
        }

        @k
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.description.hashCode() + H.d(this.title.hashCode() * 31, 31, this.text);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SellerAddressesAdditionalInfo(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", description=");
            return a.w(sb2, this.description, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.description, flags);
        }
    }

    /* compiled from: SellerAddressesInfo.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellersAddressDetail;", "Landroid/os/Parcelable;", "", "icon", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/seller_addresses/SellerAddressesInfo$SellersAddressDetail;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SellersAddressDetail implements Parcelable {

        @k
        public static final Parcelable.Creator<SellersAddressDetail> CREATOR = new Creator();

        @c("icon")
        @l
        private final String icon;

        @c("text")
        @k
        private final String text;

        /* compiled from: SellerAddressesInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SellersAddressDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellersAddressDetail createFromParcel(@k Parcel parcel) {
                return new SellersAddressDetail(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellersAddressDetail[] newArray(int i12) {
                return new SellersAddressDetail[i12];
            }
        }

        public SellersAddressDetail(@l String str, @k String str2) {
            this.icon = str;
            this.text = str2;
        }

        public static /* synthetic */ SellersAddressDetail copy$default(SellersAddressDetail sellersAddressDetail, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = sellersAddressDetail.icon;
            }
            if ((i12 & 2) != 0) {
                str2 = sellersAddressDetail.text;
            }
            return sellersAddressDetail.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final SellersAddressDetail copy(@l String icon, @k String text) {
            return new SellersAddressDetail(icon, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellersAddressDetail)) {
                return false;
            }
            SellersAddressDetail sellersAddressDetail = (SellersAddressDetail) other;
            return L.f(this.icon, sellersAddressDetail.icon) && L.f(this.text, sellersAddressDetail.text);
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.icon;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SellersAddressDetail(icon=");
            sb2.append(this.icon);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.icon);
            parcel.writeString(this.text);
        }
    }

    public SellerAddressesInfo(@k Coordinates coordinates, @l Double d12, @k GeoReferencesLayout geoReferencesLayout, @l List<GeoReference> list, @k FullAddress fullAddress, boolean z12, @l Boolean bool, @l String str, @l List<AttributedText> list2, @l String str2, @l List<SellersAddressDetail> list3, @l SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo) {
        this.coordsToShowOnMap = coordinates;
        this.circleRadius = d12;
        this.geoReferencesLayout = geoReferencesLayout;
        this.geoReference = list;
        this.fullAddress = fullAddress;
        this.isExpandable = z12;
        this.isWithDelivery = bool;
        this.workingHoursTitle = str;
        this.workingHours = list2;
        this.detailsTitle = str2;
        this.details = list3;
        this.additionalInfo = sellerAddressesAdditionalInfo;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Coordinates getCoordsToShowOnMap() {
        return this.coordsToShowOnMap;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getDetailsTitle() {
        return this.detailsTitle;
    }

    @l
    public final List<SellersAddressDetail> component11() {
        return this.details;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final SellerAddressesAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Double getCircleRadius() {
        return this.circleRadius;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final GeoReferencesLayout getGeoReferencesLayout() {
        return this.geoReferencesLayout;
    }

    @l
    public final List<GeoReference> component4() {
        return this.geoReference;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final FullAddress getFullAddress() {
        return this.fullAddress;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsExpandable() {
        return this.isExpandable;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsWithDelivery() {
        return this.isWithDelivery;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getWorkingHoursTitle() {
        return this.workingHoursTitle;
    }

    @l
    public final List<AttributedText> component9() {
        return this.workingHours;
    }

    @k
    public final SellerAddressesInfo copy(@k Coordinates coordsToShowOnMap, @l Double circleRadius, @k GeoReferencesLayout geoReferencesLayout, @l List<GeoReference> geoReference, @k FullAddress fullAddress, boolean isExpandable, @l Boolean isWithDelivery, @l String workingHoursTitle, @l List<AttributedText> workingHours, @l String detailsTitle, @l List<SellersAddressDetail> details, @l SellerAddressesAdditionalInfo additionalInfo) {
        return new SellerAddressesInfo(coordsToShowOnMap, circleRadius, geoReferencesLayout, geoReference, fullAddress, isExpandable, isWithDelivery, workingHoursTitle, workingHours, detailsTitle, details, additionalInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerAddressesInfo)) {
            return false;
        }
        SellerAddressesInfo sellerAddressesInfo = (SellerAddressesInfo) other;
        return L.f(this.coordsToShowOnMap, sellerAddressesInfo.coordsToShowOnMap) && L.f(this.circleRadius, sellerAddressesInfo.circleRadius) && this.geoReferencesLayout == sellerAddressesInfo.geoReferencesLayout && L.f(this.geoReference, sellerAddressesInfo.geoReference) && L.f(this.fullAddress, sellerAddressesInfo.fullAddress) && this.isExpandable == sellerAddressesInfo.isExpandable && L.f(this.isWithDelivery, sellerAddressesInfo.isWithDelivery) && L.f(this.workingHoursTitle, sellerAddressesInfo.workingHoursTitle) && L.f(this.workingHours, sellerAddressesInfo.workingHours) && L.f(this.detailsTitle, sellerAddressesInfo.detailsTitle) && L.f(this.details, sellerAddressesInfo.details) && L.f(this.additionalInfo, sellerAddressesInfo.additionalInfo);
    }

    @l
    public final SellerAddressesAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    public final Double getCircleRadius() {
        return this.circleRadius;
    }

    @k
    public final Coordinates getCoordsToShowOnMap() {
        return this.coordsToShowOnMap;
    }

    @l
    public final List<SellersAddressDetail> getDetails() {
        return this.details;
    }

    @l
    public final String getDetailsTitle() {
        return this.detailsTitle;
    }

    @k
    public final FullAddress getFullAddress() {
        return this.fullAddress;
    }

    @l
    public final List<GeoReference> getGeoReference() {
        return this.geoReference;
    }

    @k
    public final GeoReferencesLayout getGeoReferencesLayout() {
        return this.geoReferencesLayout;
    }

    @l
    public final List<AttributedText> getWorkingHours() {
        return this.workingHours;
    }

    @l
    public final String getWorkingHoursTitle() {
        return this.workingHoursTitle;
    }

    public int hashCode() {
        int iHashCode = this.coordsToShowOnMap.hashCode() * 31;
        Double d12 = this.circleRadius;
        int iHashCode2 = (this.geoReferencesLayout.hashCode() + ((iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31)) * 31;
        List<GeoReference> list = this.geoReference;
        int i12 = r.i((this.fullAddress.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.isExpandable);
        Boolean bool = this.isWithDelivery;
        int iHashCode3 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.workingHoursTitle;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<AttributedText> list2 = this.workingHours;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.detailsTitle;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SellersAddressDetail> list3 = this.details;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo = this.additionalInfo;
        return iHashCode7 + (sellerAddressesAdditionalInfo != null ? sellerAddressesAdditionalInfo.hashCode() : 0);
    }

    public final boolean isExpandable() {
        return this.isExpandable;
    }

    @l
    public final Boolean isWithDelivery() {
        return this.isWithDelivery;
    }

    @k
    public String toString() {
        return "SellerAddressesInfo(coordsToShowOnMap=" + this.coordsToShowOnMap + ", circleRadius=" + this.circleRadius + ", geoReferencesLayout=" + this.geoReferencesLayout + ", geoReference=" + this.geoReference + ", fullAddress=" + this.fullAddress + ", isExpandable=" + this.isExpandable + ", isWithDelivery=" + this.isWithDelivery + ", workingHoursTitle=" + this.workingHoursTitle + ", workingHours=" + this.workingHours + ", detailsTitle=" + this.detailsTitle + ", details=" + this.details + ", additionalInfo=" + this.additionalInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.coordsToShowOnMap.writeToParcel(parcel, flags);
        Double d12 = this.circleRadius;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        this.geoReferencesLayout.writeToParcel(parcel, flags);
        List<GeoReference> list = this.geoReference;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((GeoReference) itA.next()).writeToParcel(parcel, flags);
            }
        }
        this.fullAddress.writeToParcel(parcel, flags);
        parcel.writeInt(this.isExpandable ? 1 : 0);
        Boolean bool = this.isWithDelivery;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.workingHoursTitle);
        List<AttributedText> list2 = this.workingHours;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeString(this.detailsTitle);
        List<SellersAddressDetail> list3 = this.details;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((SellersAddressDetail) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo = this.additionalInfo;
        if (sellerAddressesAdditionalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerAddressesAdditionalInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SellerAddressesInfo(Coordinates coordinates, Double d12, GeoReferencesLayout geoReferencesLayout, List list, FullAddress fullAddress, boolean z12, Boolean bool, String str, List list2, String str2, List list3, SellerAddressesAdditionalInfo sellerAddressesAdditionalInfo, int i12, C42822w c42822w) {
        this(coordinates, d12, geoReferencesLayout, (i12 & 8) != 0 ? null : list, fullAddress, z12, (i12 & 64) != 0 ? null : bool, str, list2, str2, list3, sellerAddressesAdditionalInfo);
    }
}
