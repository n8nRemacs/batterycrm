package com.avito.android.multigeo_flow.links;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobMultiGeoLink.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "AddAddress", "Address", "EditAddress", "FlowType", "FullList", "a", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$AddAddress;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$EditAddress;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FullList;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class JobMultiGeoLink extends DeepLink {

    /* compiled from: JobMultiGeoLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$AddAddress;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink;", "", AddressParameter.Value.JSON_WEB_TOKEN, "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "flowType", "<init>", "(Ljava/lang/String;Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "f", "()Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class AddAddress extends JobMultiGeoLink {

        @k
        public static final Parcelable.Creator<AddAddress> CREATOR = new a();

        @c("FLOW_TYPE")
        @k
        private final FlowType flowType;

        @c("ADDRESS_JWT")
        @k
        private final String jwt;

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddAddress> {
            @Override // android.os.Parcelable.Creator
            public final AddAddress createFromParcel(Parcel parcel) {
                return new AddAddress(parcel.readString(), FlowType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddAddress[] newArray(int i12) {
                return new AddAddress[i12];
            }
        }

        public AddAddress(@k String str, @k FlowType flowType) {
            super(null);
            this.jwt = str;
            this.flowType = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final FlowType getFlowType() {
            return this.flowType;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.jwt);
            parcel.writeString(this.flowType.name());
        }
    }

    /* compiled from: JobMultiGeoLink.kt */
    @d
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "", "addressId", SearchParamsConverterKt.LOCATION_ID, "", "longitude", "latitude", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;DD)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "I", "d", "()I", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "D", "g", "()D", "e", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Address implements Parcelable {

        @k
        public static final Parcelable.Creator<Address> CREATOR = new a();

        @c("ADDRESS_TITLE")
        @k
        private final String address;

        @c("ADDRESS_ID")
        private final int addressId;

        @c("ADDRESS_LATITUDE")
        private final double latitude;

        @c("LOCATION_ID")
        @l
        private final Integer locationId;

        @c("ADDRESS_LONGITUDE")
        private final double longitude;

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        public Address(@k String str, int i12, @l Integer num, double d12, double d13) {
            this.address = str;
            this.addressId = i12;
            this.locationId = num;
            this.longitude = d12;
            this.latitude = d13;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: d, reason: from getter */
        public final int getAddressId() {
            return this.addressId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Integer getLocationId() {
            return this.locationId;
        }

        /* renamed from: g, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.address);
            parcel.writeInt(this.addressId);
            Integer num = this.locationId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeDouble(this.longitude);
            parcel.writeDouble(this.latitude);
        }
    }

    /* compiled from: JobMultiGeoLink.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$EditAddress;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink;", "", AddressParameter.Value.JSON_WEB_TOKEN, "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;", AddressParameter.TYPE, "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "flowType", "<init>", "(Ljava/lang/String;Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;)V", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;", "f", "()Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "g", "()Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class EditAddress extends JobMultiGeoLink {

        @k
        public static final Parcelable.Creator<EditAddress> CREATOR = new a();

        @c("ADDRESS_ITEM")
        @k
        private final Address address;

        @c("FLOW_TYPE")
        @k
        private final FlowType flowType;

        @c("ADDRESS_JWT")
        @k
        private final String jwt;

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EditAddress> {
            @Override // android.os.Parcelable.Creator
            public final EditAddress createFromParcel(Parcel parcel) {
                return new EditAddress(parcel.readString(), Address.CREATOR.createFromParcel(parcel), FlowType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final EditAddress[] newArray(int i12) {
                return new EditAddress[i12];
            }
        }

        public EditAddress(@k String str, @k Address address, @k FlowType flowType) {
            super(null);
            this.jwt = str;
            this.address = address;
            this.flowType = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final FlowType getFlowType() {
            return this.flowType;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.jwt);
            this.address.writeToParcel(parcel, i12);
            parcel.writeString(this.flowType.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobMultiGeoLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlowType {

        /* renamed from: b, reason: collision with root package name */
        public static final FlowType f206967b;

        /* renamed from: c, reason: collision with root package name */
        public static final FlowType f206968c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FlowType[] f206969d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f206970e;

        static {
            FlowType flowType = new FlowType("DEFAULT", 0);
            f206967b = flowType;
            FlowType flowType2 = new FlowType("VACANCY", 1);
            f206968c = flowType2;
            FlowType[] flowTypeArr = {flowType, flowType2};
            f206969d = flowTypeArr;
            f206970e = kotlin.enums.c.a(flowTypeArr);
        }

        public FlowType() {
            throw null;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) f206969d.clone();
        }
    }

    /* compiled from: JobMultiGeoLink.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FullList;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink;", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$Address;", "list", "fullListTitle", "fullListButtonTitle", "", "maxListLimit", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "flowType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Ljava/util/List;", "j", "()Ljava/util/List;", "h", "g", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "f", "()Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FlowType;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class FullList extends JobMultiGeoLink {

        @k
        public static final Parcelable.Creator<FullList> CREATOR = new a();

        @c("FLOW_TYPE")
        @k
        private final FlowType flowType;

        @c("ADDRESS_FULL_LIST_BUTTON")
        @k
        private final String fullListButtonTitle;

        @c("ADDRESS_FULL_LIST_TITLE")
        @k
        private final String fullListTitle;

        @c("ADDRESS_JWT")
        @k
        private final String jwt;

        @c("ADDRESS_LIST")
        @k
        private final List<Address> list;

        @c("ADDRESS_MAX_LIST_LIMIT")
        @l
        private final Integer maxListLimit;

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FullList> {
            @Override // android.os.Parcelable.Creator
            public final FullList createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Address.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new FullList(string, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), FlowType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final FullList[] newArray(int i12) {
                return new FullList[i12];
            }
        }

        public /* synthetic */ FullList(String str, List list, String str2, String str3, Integer num, FlowType flowType, int i12, C42822w c42822w) {
            this(str, list, str2, str3, (i12 & 16) != 0 ? null : num, flowType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: f, reason: from getter */
        public final FlowType getFlowType() {
            return this.flowType;
        }

        @k
        /* renamed from: g, reason: from getter */
        public final String getFullListButtonTitle() {
            return this.fullListButtonTitle;
        }

        @k
        /* renamed from: h, reason: from getter */
        public final String getFullListTitle() {
            return this.fullListTitle;
        }

        @k
        /* renamed from: i, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        @k
        public final List<Address> j() {
            return this.list;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final Integer getMaxListLimit() {
            return this.maxListLimit;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.jwt);
            Iterator itJ = C0.j(this.list, parcel);
            while (itJ.hasNext()) {
                ((Address) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.fullListTitle);
            parcel.writeString(this.fullListButtonTitle);
            Integer num = this.maxListLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.flowType.name());
        }

        public FullList(@k String str, @k List<Address> list, @k String str2, @k String str3, @l Integer num, @k FlowType flowType) {
            super(null);
            this.jwt = str;
            this.list = list;
            this.fullListTitle = str2;
            this.fullListButtonTitle = str3;
            this.maxListLimit = num;
            this.flowType = flowType;
        }
    }

    /* compiled from: JobMultiGeoLink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a;", "LJu/c$b;", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$d;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$f;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$g;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends InterfaceC14249c.b {

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$f;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$g;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.multigeo_flow.links.JobMultiGeoLink$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6170a implements h, f, g {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f206971b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f206972c;

            /* renamed from: d, reason: collision with root package name */
            public final int f206973d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Integer f206974e;

            public C6170a(int i12, @l Integer num, @k String str, @k String str2) {
                this.f206971b = str;
                this.f206972c = str2;
                this.f206973d = i12;
                this.f206974e = num;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            /* renamed from: c, reason: from getter */
            public final int getF206981d() {
                return this.f206973d;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.h
            @k
            /* renamed from: d, reason: from getter */
            public final String getF206984b() {
                return this.f206971b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6170a)) {
                    return false;
                }
                C6170a c6170a = (C6170a) obj;
                return L.f(this.f206971b, c6170a.f206971b) && L.f(this.f206972c, c6170a.f206972c) && this.f206973d == c6170a.f206973d && L.f(this.f206974e, c6170a.f206974e);
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.f
            @k
            /* renamed from: getAddress, reason: from getter */
            public final String getF206980c() {
                return this.f206972c;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            @l
            /* renamed from: getLocationId, reason: from getter */
            public final Integer getF206982e() {
                return this.f206974e;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f206973d, H.d(this.f206971b.hashCode() * 31, 31, this.f206972c), 31);
                Integer num = this.f206974e;
                return iE2 + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AddressAdded(jwt=");
                sb2.append(this.f206971b);
                sb2.append(", address=");
                sb2.append(this.f206972c);
                sb2.append(", addressId=");
                sb2.append(this.f206973d);
                sb2.append(", locationId=");
                return s.j(sb2, this.f206974e, ')');
            }
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$b;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$f;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$g;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements h, f, g {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f206975b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f206976c;

            /* renamed from: d, reason: collision with root package name */
            public final int f206977d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Integer f206978e;

            public b(int i12, @l Integer num, @k String str, @k String str2) {
                this.f206975b = str;
                this.f206976c = str2;
                this.f206977d = i12;
                this.f206978e = num;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            /* renamed from: c, reason: from getter */
            public final int getF206981d() {
                return this.f206977d;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.h
            @k
            /* renamed from: d, reason: from getter */
            public final String getF206984b() {
                return this.f206975b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f206975b, bVar.f206975b) && L.f(this.f206976c, bVar.f206976c) && this.f206977d == bVar.f206977d && L.f(this.f206978e, bVar.f206978e);
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.f
            @k
            /* renamed from: getAddress, reason: from getter */
            public final String getF206980c() {
                return this.f206976c;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            @l
            /* renamed from: getLocationId, reason: from getter */
            public final Integer getF206982e() {
                return this.f206978e;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f206977d, H.d(this.f206975b.hashCode() * 31, 31, this.f206976c), 31);
                Integer num = this.f206978e;
                return iE2 + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AddressDeleted(jwt=");
                sb2.append(this.f206975b);
                sb2.append(", address=");
                sb2.append(this.f206976c);
                sb2.append(", addressId=");
                sb2.append(this.f206977d);
                sb2.append(", locationId=");
                return s.j(sb2, this.f206978e, ')');
            }
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$c;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$f;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$g;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements h, f, g {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f206979b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f206980c;

            /* renamed from: d, reason: collision with root package name */
            public final int f206981d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Integer f206982e;

            public c(int i12, @l Integer num, @k String str, @k String str2) {
                this.f206979b = str;
                this.f206980c = str2;
                this.f206981d = i12;
                this.f206982e = num;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            /* renamed from: c, reason: from getter */
            public final int getF206981d() {
                return this.f206981d;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.h
            @k
            /* renamed from: d, reason: from getter */
            public final String getF206984b() {
                return this.f206979b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f206979b, cVar.f206979b) && L.f(this.f206980c, cVar.f206980c) && this.f206981d == cVar.f206981d && L.f(this.f206982e, cVar.f206982e);
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.f
            @k
            /* renamed from: getAddress, reason: from getter */
            public final String getF206980c() {
                return this.f206980c;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.g
            @l
            /* renamed from: getLocationId, reason: from getter */
            public final Integer getF206982e() {
                return this.f206982e;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f206981d, H.d(this.f206979b.hashCode() * 31, 31, this.f206980c), 31);
                Integer num = this.f206982e;
                return iE2 + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AddressEdited(jwt=");
                sb2.append(this.f206979b);
                sb2.append(", address=");
                sb2.append(this.f206980c);
                sb2.append(", addressId=");
                sb2.append(this.f206981d);
                sb2.append(", locationId=");
                return s.j(sb2, this.f206982e, ')');
            }
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$d;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a;", "<init>", "()V", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f206983b = new d();
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$e;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements h {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f206984b;

            public e(@k String str) {
                this.f206984b = str;
            }

            @Override // com.avito.android.multigeo_flow.links.JobMultiGeoLink.a.h
            @k
            /* renamed from: d, reason: from getter */
            public final String getF206984b() {
                return this.f206984b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && L.f(this.f206984b, ((e) obj).f206984b);
            }

            public final int hashCode() {
                return this.f206984b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ListUpdated(jwt="), this.f206984b, ')');
            }
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$f;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface f extends a {
            @k
            /* renamed from: getAddress */
            String getF206980c();
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$g;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface g extends a {
            /* renamed from: c */
            int getF206981d();

            @l
            /* renamed from: getLocationId */
            Integer getF206982e();
        }

        /* compiled from: JobMultiGeoLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a$h;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$a;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface h extends a {
            @k
            /* renamed from: d */
            String getF206984b();
        }
    }

    public /* synthetic */ JobMultiGeoLink(C42822w c42822w) {
        this();
    }

    private JobMultiGeoLink() {
    }
}
