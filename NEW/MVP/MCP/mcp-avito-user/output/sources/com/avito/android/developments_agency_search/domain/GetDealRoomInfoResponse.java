package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetDealRoomInfoResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003+,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006."}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "client", "", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "deals", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "selection", "<init>", "(Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;)V", "component1", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "copy", "(Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "getClient", "Ljava/util/List;", "getDeals", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "getSelection", "ClientInfo", "Deal", "Selection", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetDealRoomInfoResponse implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetDealRoomInfoResponse> CREATOR = new a();

    @c("clientInfo")
    @k
    private final ClientInfo client;

    @c("deals")
    @k
    private final List<Deal> deals;

    @c("selection")
    @l
    private final Selection selection;

    /* compiled from: GetDealRoomInfoResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ^\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/Image;", "avatar", "email", "firstName", "lastName", "middleName", "phone", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$ClientInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/Image;", "getAvatar", "getEmail", "getFirstName", "getLastName", "getMiddleName", "getPhone", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ClientInfo implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<ClientInfo> CREATOR = new a();

        @c("avatarURL")
        @l
        private final Image avatar;

        @c("email")
        @l
        private final String email;

        @c("firstName")
        @k
        private final String firstName;

        @c("id")
        @k
        private final String id;

        @c("lastName")
        @k
        private final String lastName;

        @c("middleName")
        @l
        private final String middleName;

        @c("phone")
        @l
        private final String phone;

        /* compiled from: GetDealRoomInfoResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClientInfo> {
            @Override // android.os.Parcelable.Creator
            public final ClientInfo createFromParcel(Parcel parcel) {
                return new ClientInfo(parcel.readString(), (Image) parcel.readParcelable(ClientInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ClientInfo[] newArray(int i12) {
                return new ClientInfo[i12];
            }
        }

        public ClientInfo(@k String str, @l Image image, @l String str2, @k String str3, @k String str4, @l String str5, @l String str6) {
            this.id = str;
            this.avatar = image;
            this.email = str2;
            this.firstName = str3;
            this.lastName = str4;
            this.middleName = str5;
            this.phone = str6;
        }

        public static /* synthetic */ ClientInfo copy$default(ClientInfo clientInfo, String str, Image image, String str2, String str3, String str4, String str5, String str6, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = clientInfo.id;
            }
            if ((i12 & 2) != 0) {
                image = clientInfo.avatar;
            }
            Image image2 = image;
            if ((i12 & 4) != 0) {
                str2 = clientInfo.email;
            }
            String str7 = str2;
            if ((i12 & 8) != 0) {
                str3 = clientInfo.firstName;
            }
            String str8 = str3;
            if ((i12 & 16) != 0) {
                str4 = clientInfo.lastName;
            }
            String str9 = str4;
            if ((i12 & 32) != 0) {
                str5 = clientInfo.middleName;
            }
            String str10 = str5;
            if ((i12 & 64) != 0) {
                str6 = clientInfo.phone;
            }
            return clientInfo.copy(str, image2, str7, str8, str9, str10, str6);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getMiddleName() {
            return this.middleName;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final ClientInfo copy(@k String id2, @l Image avatar, @l String email, @k String firstName, @k String lastName, @l String middleName, @l String phone) {
            return new ClientInfo(id2, avatar, email, firstName, lastName, middleName, phone);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientInfo)) {
                return false;
            }
            ClientInfo clientInfo = (ClientInfo) other;
            return L.f(this.id, clientInfo.id) && L.f(this.avatar, clientInfo.avatar) && L.f(this.email, clientInfo.email) && L.f(this.firstName, clientInfo.firstName) && L.f(this.lastName, clientInfo.lastName) && L.f(this.middleName, clientInfo.middleName) && L.f(this.phone, clientInfo.phone);
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        public final String getEmail() {
            return this.email;
        }

        @k
        public final String getFirstName() {
            return this.firstName;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getLastName() {
            return this.lastName;
        }

        @l
        public final String getMiddleName() {
            return this.middleName;
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Image image = this.avatar;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            String str = this.email;
            int iD2 = H.d(H.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.firstName), 31, this.lastName);
            String str2 = this.middleName;
            int iHashCode3 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ClientInfo(id=");
            sb2.append(this.id);
            sb2.append(", avatar=");
            sb2.append(this.avatar);
            sb2.append(", email=");
            sb2.append(this.email);
            sb2.append(", firstName=");
            sb2.append(this.firstName);
            sb2.append(", lastName=");
            sb2.append(this.lastName);
            sb2.append(", middleName=");
            sb2.append(this.middleName);
            sb2.append(", phone=");
            return C22026a.c(sb2, this.phone, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeParcelable(this.avatar, flags);
            parcel.writeString(this.email);
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.middleName);
            parcel.writeString(this.phone);
        }
    }

    /* compiled from: GetDealRoomInfoResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0005PQRSTB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b)\u0010*J\u009c\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0019J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020.HÖ\u0001¢\u0006\u0004\b6\u00100J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020.HÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b@\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010#R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010'R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bM\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010*¨\u0006U"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "Landroid/os/Parcelable;", "", "id", "title", "notes", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;", "progress", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;", "revenue", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;", "bookings", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;", "selectionHistory", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "preferences", "Lcom/avito/android/deep_linking/links/DeepLink;", "preferencesUri", "preferencesIds", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;", "recalculatedConfirmedLot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;", "component5", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;", "component6", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;", "component7", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;", "component8", "()Ljava/util/List;", "component9", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component10", "component11", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getNotes", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;", "getProgress", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;", "getRevenue", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;", "getBookings", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;", "getSelectionHistory", "Ljava/util/List;", "getPreferences", "Lcom/avito/android/deep_linking/links/DeepLink;", "getPreferencesUri", "getPreferencesIds", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;", "getRecalculatedConfirmedLot", "Bookings", "Progress", "RecalculatedConfirmedLot", "Revenue", "SelectionHistory", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Deal implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Deal> CREATOR = new a();

        @c("bookings")
        @l
        private final Bookings bookings;

        @c("id")
        @k
        private final String id;

        @c("notes")
        @l
        private final String notes;

        @c("preferences")
        @l
        private final List<ParameterSlot> preferences;

        @c("preferencesIds")
        @l
        private final List<String> preferencesIds;

        @c("preferencesUri")
        @l
        private final DeepLink preferencesUri;

        @c("progress")
        @l
        private final Progress progress;

        @c("recalculatedConfirmedLot")
        @l
        private final RecalculatedConfirmedLot recalculatedConfirmedLot;

        @c("revenue")
        @l
        private final Revenue revenue;

        @c("selectionHistory")
        @l
        private final SelectionHistory selectionHistory;

        @c("title")
        @k
        private final String title;

        /* compiled from: GetDealRoomInfoResponse.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006("}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;", "Landroid/os/Parcelable;", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;", "confirmed", "", "pending", "declined", "<init>", "(Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;", "getConfirmed", "Ljava/util/List;", "getPending", "getDeclined", "BookingItem", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Bookings implements Parcelable {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<Bookings> CREATOR = new a();

            @c("confirmed")
            @l
            private final BookingItem confirmed;

            @c("declined")
            @l
            private final List<BookingItem> declined;

            @c("pending")
            @l
            private final List<BookingItem> pending;

            /* compiled from: GetDealRoomInfoResponse.kt */
            @P
            @Keep
            @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\\]B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b4\u00105JÖ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010\u001fJ\u001a\u0010<\u001a\u00020\u001a2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010\u001fJ \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010!R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010%R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bM\u0010%R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bN\u0010%R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bO\u0010%R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bP\u0010%R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bQ\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bR\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bS\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bT\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bU\u0010%R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u00100R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bX\u0010#R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bZ\u00103R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010[\u001a\u0004\b\u001b\u00105¨\u0006^"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "", "id", "", "Lcom/avito/android/remote/model/Image;", "images", "", "title", "price", "flatNumber", "roomType", "totalArea", "floor", "agentCommission", "agentCommissionPercent", "agentCommissionColor", "bookingConditionUrl", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;", "developmentInfo", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$Document;", "documents", "Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "priceTooltip", "", "isFakeLot", "<init>", "(IJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/PriceTooltip;Ljava/lang/Boolean;)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;", "component15", "component16", "()Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "component17", "()Ljava/lang/Boolean;", "copy", "(IJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/PriceTooltip;Ljava/lang/Boolean;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getLocationId", "J", "getId", "Ljava/util/List;", "getImages", "Ljava/lang/String;", "getTitle", "getPrice", "getFlatNumber", "getRoomType", "getTotalArea", "getFloor", "getAgentCommission", "getAgentCommissionPercent", "getAgentCommissionColor", "getBookingConditionUrl", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;", "getDevelopmentInfo", "getDocuments", "Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "getPriceTooltip", "Ljava/lang/Boolean;", "DevelopmentInfo", "Document", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class BookingItem implements Parcelable {
                public static final int $stable = 8;

                @k
                public static final Parcelable.Creator<BookingItem> CREATOR = new a();

                @c("agentCommission")
                @l
                private final String agentCommission;

                @c("agentCommissionColor")
                @l
                private final String agentCommissionColor;

                @c("agentCommissionPercent")
                @l
                private final String agentCommissionPercent;

                @c("bookingConditionURL")
                @l
                private final String bookingConditionUrl;

                @c("developmentInfo")
                @k
                private final DevelopmentInfo developmentInfo;

                @c("documents")
                @l
                private final List<Document> documents;

                @c("flatNumber")
                @k
                private final String flatNumber;

                @c("floor")
                @k
                private final String floor;

                @c("id")
                private final long id;

                @c("images")
                @l
                private final List<Image> images;

                @c("isFakeLot")
                @l
                private final Boolean isFakeLot;

                @c(SearchParamsConverterKt.LOCATION_ID)
                private final int locationId;

                @c("price")
                @k
                private final String price;

                @c("priceTooltip")
                @l
                private final PriceTooltip priceTooltip;

                @c("roomType")
                @k
                private final String roomType;

                @c("title")
                @k
                private final String title;

                @c("totalArea")
                @k
                private final String totalArea;

                /* compiled from: GetDealRoomInfoResponse.kt */
                @P
                @Keep
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\rR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;", "Landroid/os/Parcelable;", "", "developmentName", "developerName", "developmentAddress", DistrictParameter.TYPE, "", "Lcom/avito/android/developments_agency_search/domain/Metro;", MetroParameter.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$DevelopmentInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDevelopmentName", "getDeveloperName", "getDevelopmentAddress", "getDistrict", "Ljava/util/List;", "getMetro", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class DevelopmentInfo implements Parcelable {
                    public static final int $stable = 8;

                    @k
                    public static final Parcelable.Creator<DevelopmentInfo> CREATOR = new a();

                    @c("developerName")
                    @k
                    private final String developerName;

                    @c("developmentAddress")
                    @k
                    private final String developmentAddress;

                    @c("developmentName")
                    @k
                    private final String developmentName;

                    @c(DistrictParameter.TYPE)
                    @l
                    private final String district;

                    @c(MetroParameter.TYPE)
                    @l
                    private final List<Metro> metro;

                    /* compiled from: GetDealRoomInfoResponse.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<DevelopmentInfo> {
                        @Override // android.os.Parcelable.Creator
                        public final DevelopmentInfo createFromParcel(Parcel parcel) {
                            ArrayList arrayList;
                            String string = parcel.readString();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            String string4 = parcel.readString();
                            if (parcel.readInt() == 0) {
                                arrayList = null;
                            } else {
                                int i12 = parcel.readInt();
                                arrayList = new ArrayList(i12);
                                int iC2 = 0;
                                while (iC2 != i12) {
                                    iC2 = com.avito.android.actions_sheet.a.c(Metro.CREATOR, parcel, arrayList, iC2, 1);
                                }
                            }
                            return new DevelopmentInfo(string, string2, string3, string4, arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final DevelopmentInfo[] newArray(int i12) {
                            return new DevelopmentInfo[i12];
                        }
                    }

                    public DevelopmentInfo(@k String str, @k String str2, @k String str3, @l String str4, @l List<Metro> list) {
                        this.developmentName = str;
                        this.developerName = str2;
                        this.developmentAddress = str3;
                        this.district = str4;
                        this.metro = list;
                    }

                    public static /* synthetic */ DevelopmentInfo copy$default(DevelopmentInfo developmentInfo, String str, String str2, String str3, String str4, List list, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = developmentInfo.developmentName;
                        }
                        if ((i12 & 2) != 0) {
                            str2 = developmentInfo.developerName;
                        }
                        String str5 = str2;
                        if ((i12 & 4) != 0) {
                            str3 = developmentInfo.developmentAddress;
                        }
                        String str6 = str3;
                        if ((i12 & 8) != 0) {
                            str4 = developmentInfo.district;
                        }
                        String str7 = str4;
                        if ((i12 & 16) != 0) {
                            list = developmentInfo.metro;
                        }
                        return developmentInfo.copy(str, str5, str6, str7, list);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getDevelopmentName() {
                        return this.developmentName;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final String getDeveloperName() {
                        return this.developerName;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final String getDevelopmentAddress() {
                        return this.developmentAddress;
                    }

                    @l
                    /* renamed from: component4, reason: from getter */
                    public final String getDistrict() {
                        return this.district;
                    }

                    @l
                    public final List<Metro> component5() {
                        return this.metro;
                    }

                    @k
                    public final DevelopmentInfo copy(@k String developmentName, @k String developerName, @k String developmentAddress, @l String district, @l List<Metro> metro) {
                        return new DevelopmentInfo(developmentName, developerName, developmentAddress, district, metro);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof DevelopmentInfo)) {
                            return false;
                        }
                        DevelopmentInfo developmentInfo = (DevelopmentInfo) other;
                        return L.f(this.developmentName, developmentInfo.developmentName) && L.f(this.developerName, developmentInfo.developerName) && L.f(this.developmentAddress, developmentInfo.developmentAddress) && L.f(this.district, developmentInfo.district) && L.f(this.metro, developmentInfo.metro);
                    }

                    @k
                    public final String getDeveloperName() {
                        return this.developerName;
                    }

                    @k
                    public final String getDevelopmentAddress() {
                        return this.developmentAddress;
                    }

                    @k
                    public final String getDevelopmentName() {
                        return this.developmentName;
                    }

                    @l
                    public final String getDistrict() {
                        return this.district;
                    }

                    @l
                    public final List<Metro> getMetro() {
                        return this.metro;
                    }

                    public int hashCode() {
                        int iD2 = H.d(H.d(this.developmentName.hashCode() * 31, 31, this.developerName), 31, this.developmentAddress);
                        String str = this.district;
                        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                        List<Metro> list = this.metro;
                        return iHashCode + (list != null ? list.hashCode() : 0);
                    }

                    @k
                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("DevelopmentInfo(developmentName=");
                        sb2.append(this.developmentName);
                        sb2.append(", developerName=");
                        sb2.append(this.developerName);
                        sb2.append(", developmentAddress=");
                        sb2.append(this.developmentAddress);
                        sb2.append(", district=");
                        sb2.append(this.district);
                        sb2.append(", metro=");
                        return H.p(sb2, this.metro, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.developmentName);
                        parcel.writeString(this.developerName);
                        parcel.writeString(this.developmentAddress);
                        parcel.writeString(this.district);
                        List<Metro> list = this.metro;
                        if (list == null) {
                            parcel.writeInt(0);
                            return;
                        }
                        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            ((Metro) itA.next()).writeToParcel(parcel, flags);
                        }
                    }
                }

                /* compiled from: GetDealRoomInfoResponse.kt */
                @P
                @Keep
                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$Document;", "Landroid/os/Parcelable;", "", "name", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Bookings$BookingItem$Document;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getUrl", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Document implements Parcelable {
                    public static final int $stable = 0;

                    @k
                    public static final Parcelable.Creator<Document> CREATOR = new a();

                    @c("name")
                    @k
                    private final String name;

                    @c(ContextActionHandler.Link.URL)
                    @k
                    private final String url;

                    /* compiled from: GetDealRoomInfoResponse.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Document> {
                        @Override // android.os.Parcelable.Creator
                        public final Document createFromParcel(Parcel parcel) {
                            return new Document(parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Document[] newArray(int i12) {
                            return new Document[i12];
                        }
                    }

                    public Document(@k String str, @k String str2) {
                        this.name = str;
                        this.url = str2;
                    }

                    public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            str = document.name;
                        }
                        if ((i12 & 2) != 0) {
                            str2 = document.url;
                        }
                        return document.copy(str, str2);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final String getUrl() {
                        return this.url;
                    }

                    @k
                    public final Document copy(@k String name, @k String url) {
                        return new Document(name, url);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Document)) {
                            return false;
                        }
                        Document document = (Document) other;
                        return L.f(this.name, document.name) && L.f(this.url, document.url);
                    }

                    @k
                    public final String getName() {
                        return this.name;
                    }

                    @k
                    public final String getUrl() {
                        return this.url;
                    }

                    public int hashCode() {
                        return this.url.hashCode() + (this.name.hashCode() * 31);
                    }

                    @k
                    public String toString() {
                        StringBuilder sb2 = new StringBuilder("Document(name=");
                        sb2.append(this.name);
                        sb2.append(", url=");
                        return C22026a.c(sb2, this.url, ')');
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeString(this.name);
                        parcel.writeString(this.url);
                    }
                }

                /* compiled from: GetDealRoomInfoResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<BookingItem> {
                    @Override // android.os.Parcelable.Creator
                    public final BookingItem createFromParcel(Parcel parcel) {
                        ArrayList arrayList;
                        String str;
                        String str2;
                        ArrayList arrayList2;
                        Boolean boolValueOf;
                        int i12 = parcel.readInt();
                        long j12 = parcel.readLong();
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int i13 = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(i13);
                            int iL2 = 0;
                            while (iL2 != i13) {
                                iL2 = com.avito.android.actions_sheet.a.l(BookingItem.class, parcel, arrayList3, iL2, 1);
                            }
                            arrayList = arrayList3;
                        }
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        String string5 = parcel.readString();
                        String string6 = parcel.readString();
                        String string7 = parcel.readString();
                        String string8 = parcel.readString();
                        String string9 = parcel.readString();
                        String string10 = parcel.readString();
                        DevelopmentInfo developmentInfoCreateFromParcel = DevelopmentInfo.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            str2 = string8;
                            str = string9;
                            arrayList2 = null;
                        } else {
                            int i14 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(i14);
                            str = string9;
                            int iC2 = 0;
                            while (iC2 != i14) {
                                iC2 = com.avito.android.actions_sheet.a.c(Document.CREATOR, parcel, arrayList4, iC2, 1);
                                i14 = i14;
                                string8 = string8;
                            }
                            str2 = string8;
                            arrayList2 = arrayList4;
                        }
                        PriceTooltip priceTooltipCreateFromParcel = parcel.readInt() == 0 ? null : PriceTooltip.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new BookingItem(i12, j12, arrayList, string, string2, string3, string4, string5, string6, string7, str2, str, string10, developmentInfoCreateFromParcel, arrayList2, priceTooltipCreateFromParcel, boolValueOf);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final BookingItem[] newArray(int i12) {
                        return new BookingItem[i12];
                    }
                }

                public BookingItem(int i12, long j12, @l List<Image> list, @k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @l String str7, @l String str8, @l String str9, @l String str10, @k DevelopmentInfo developmentInfo, @l List<Document> list2, @l PriceTooltip priceTooltip, @l Boolean bool) {
                    this.locationId = i12;
                    this.id = j12;
                    this.images = list;
                    this.title = str;
                    this.price = str2;
                    this.flatNumber = str3;
                    this.roomType = str4;
                    this.totalArea = str5;
                    this.floor = str6;
                    this.agentCommission = str7;
                    this.agentCommissionPercent = str8;
                    this.agentCommissionColor = str9;
                    this.bookingConditionUrl = str10;
                    this.developmentInfo = developmentInfo;
                    this.documents = list2;
                    this.priceTooltip = priceTooltip;
                    this.isFakeLot = bool;
                }

                /* renamed from: component1, reason: from getter */
                public final int getLocationId() {
                    return this.locationId;
                }

                @l
                /* renamed from: component10, reason: from getter */
                public final String getAgentCommission() {
                    return this.agentCommission;
                }

                @l
                /* renamed from: component11, reason: from getter */
                public final String getAgentCommissionPercent() {
                    return this.agentCommissionPercent;
                }

                @l
                /* renamed from: component12, reason: from getter */
                public final String getAgentCommissionColor() {
                    return this.agentCommissionColor;
                }

                @l
                /* renamed from: component13, reason: from getter */
                public final String getBookingConditionUrl() {
                    return this.bookingConditionUrl;
                }

                @k
                /* renamed from: component14, reason: from getter */
                public final DevelopmentInfo getDevelopmentInfo() {
                    return this.developmentInfo;
                }

                @l
                public final List<Document> component15() {
                    return this.documents;
                }

                @l
                /* renamed from: component16, reason: from getter */
                public final PriceTooltip getPriceTooltip() {
                    return this.priceTooltip;
                }

                @l
                /* renamed from: component17, reason: from getter */
                public final Boolean getIsFakeLot() {
                    return this.isFakeLot;
                }

                /* renamed from: component2, reason: from getter */
                public final long getId() {
                    return this.id;
                }

                @l
                public final List<Image> component3() {
                    return this.images;
                }

                @k
                /* renamed from: component4, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @k
                /* renamed from: component5, reason: from getter */
                public final String getPrice() {
                    return this.price;
                }

                @k
                /* renamed from: component6, reason: from getter */
                public final String getFlatNumber() {
                    return this.flatNumber;
                }

                @k
                /* renamed from: component7, reason: from getter */
                public final String getRoomType() {
                    return this.roomType;
                }

                @k
                /* renamed from: component8, reason: from getter */
                public final String getTotalArea() {
                    return this.totalArea;
                }

                @k
                /* renamed from: component9, reason: from getter */
                public final String getFloor() {
                    return this.floor;
                }

                @k
                public final BookingItem copy(int locationId, long id2, @l List<Image> images, @k String title, @k String price, @k String flatNumber, @k String roomType, @k String totalArea, @k String floor, @l String agentCommission, @l String agentCommissionPercent, @l String agentCommissionColor, @l String bookingConditionUrl, @k DevelopmentInfo developmentInfo, @l List<Document> documents, @l PriceTooltip priceTooltip, @l Boolean isFakeLot) {
                    return new BookingItem(locationId, id2, images, title, price, flatNumber, roomType, totalArea, floor, agentCommission, agentCommissionPercent, agentCommissionColor, bookingConditionUrl, developmentInfo, documents, priceTooltip, isFakeLot);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BookingItem)) {
                        return false;
                    }
                    BookingItem bookingItem = (BookingItem) other;
                    return this.locationId == bookingItem.locationId && this.id == bookingItem.id && L.f(this.images, bookingItem.images) && L.f(this.title, bookingItem.title) && L.f(this.price, bookingItem.price) && L.f(this.flatNumber, bookingItem.flatNumber) && L.f(this.roomType, bookingItem.roomType) && L.f(this.totalArea, bookingItem.totalArea) && L.f(this.floor, bookingItem.floor) && L.f(this.agentCommission, bookingItem.agentCommission) && L.f(this.agentCommissionPercent, bookingItem.agentCommissionPercent) && L.f(this.agentCommissionColor, bookingItem.agentCommissionColor) && L.f(this.bookingConditionUrl, bookingItem.bookingConditionUrl) && L.f(this.developmentInfo, bookingItem.developmentInfo) && L.f(this.documents, bookingItem.documents) && L.f(this.priceTooltip, bookingItem.priceTooltip) && L.f(this.isFakeLot, bookingItem.isFakeLot);
                }

                @l
                public final String getAgentCommission() {
                    return this.agentCommission;
                }

                @l
                public final String getAgentCommissionColor() {
                    return this.agentCommissionColor;
                }

                @l
                public final String getAgentCommissionPercent() {
                    return this.agentCommissionPercent;
                }

                @l
                public final String getBookingConditionUrl() {
                    return this.bookingConditionUrl;
                }

                @k
                public final DevelopmentInfo getDevelopmentInfo() {
                    return this.developmentInfo;
                }

                @l
                public final List<Document> getDocuments() {
                    return this.documents;
                }

                @k
                public final String getFlatNumber() {
                    return this.flatNumber;
                }

                @k
                public final String getFloor() {
                    return this.floor;
                }

                public final long getId() {
                    return this.id;
                }

                @l
                public final List<Image> getImages() {
                    return this.images;
                }

                public final int getLocationId() {
                    return this.locationId;
                }

                @k
                public final String getPrice() {
                    return this.price;
                }

                @l
                public final PriceTooltip getPriceTooltip() {
                    return this.priceTooltip;
                }

                @k
                public final String getRoomType() {
                    return this.roomType;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                @k
                public final String getTotalArea() {
                    return this.totalArea;
                }

                public int hashCode() {
                    int iG2 = r.g(Integer.hashCode(this.locationId) * 31, 31, this.id);
                    List<Image> list = this.images;
                    int iD2 = H.d(H.d(H.d(H.d(H.d(H.d((iG2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.title), 31, this.price), 31, this.flatNumber), 31, this.roomType), 31, this.totalArea), 31, this.floor);
                    String str = this.agentCommission;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.agentCommissionPercent;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.agentCommissionColor;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.bookingConditionUrl;
                    int iHashCode4 = (this.developmentInfo.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
                    List<Document> list2 = this.documents;
                    int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    PriceTooltip priceTooltip = this.priceTooltip;
                    int iHashCode6 = (iHashCode5 + (priceTooltip == null ? 0 : priceTooltip.hashCode())) * 31;
                    Boolean bool = this.isFakeLot;
                    return iHashCode6 + (bool != null ? bool.hashCode() : 0);
                }

                @l
                public final Boolean isFakeLot() {
                    return this.isFakeLot;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("BookingItem(locationId=");
                    sb2.append(this.locationId);
                    sb2.append(", id=");
                    sb2.append(this.id);
                    sb2.append(", images=");
                    sb2.append(this.images);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", price=");
                    sb2.append(this.price);
                    sb2.append(", flatNumber=");
                    sb2.append(this.flatNumber);
                    sb2.append(", roomType=");
                    sb2.append(this.roomType);
                    sb2.append(", totalArea=");
                    sb2.append(this.totalArea);
                    sb2.append(", floor=");
                    sb2.append(this.floor);
                    sb2.append(", agentCommission=");
                    sb2.append(this.agentCommission);
                    sb2.append(", agentCommissionPercent=");
                    sb2.append(this.agentCommissionPercent);
                    sb2.append(", agentCommissionColor=");
                    sb2.append(this.agentCommissionColor);
                    sb2.append(", bookingConditionUrl=");
                    sb2.append(this.bookingConditionUrl);
                    sb2.append(", developmentInfo=");
                    sb2.append(this.developmentInfo);
                    sb2.append(", documents=");
                    sb2.append(this.documents);
                    sb2.append(", priceTooltip=");
                    sb2.append(this.priceTooltip);
                    sb2.append(", isFakeLot=");
                    return C0.g(sb2, this.isFakeLot, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.locationId);
                    parcel.writeLong(this.id);
                    List<Image> list = this.images;
                    if (list == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            parcel.writeParcelable((Parcelable) itA.next(), flags);
                        }
                    }
                    parcel.writeString(this.title);
                    parcel.writeString(this.price);
                    parcel.writeString(this.flatNumber);
                    parcel.writeString(this.roomType);
                    parcel.writeString(this.totalArea);
                    parcel.writeString(this.floor);
                    parcel.writeString(this.agentCommission);
                    parcel.writeString(this.agentCommissionPercent);
                    parcel.writeString(this.agentCommissionColor);
                    parcel.writeString(this.bookingConditionUrl);
                    this.developmentInfo.writeToParcel(parcel, flags);
                    List<Document> list2 = this.documents;
                    if (list2 == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                        while (itA2.hasNext()) {
                            ((Document) itA2.next()).writeToParcel(parcel, flags);
                        }
                    }
                    PriceTooltip priceTooltip = this.priceTooltip;
                    if (priceTooltip == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        priceTooltip.writeToParcel(parcel, flags);
                    }
                    Boolean bool = this.isFakeLot;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool);
                    }
                }
            }

            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Bookings> {
                @Override // android.os.Parcelable.Creator
                public final Bookings createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2 = null;
                    BookingItem bookingItemCreateFromParcel = parcel.readInt() == 0 ? null : BookingItem.CREATOR.createFromParcel(parcel);
                    int iC2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iC3 = 0;
                        while (iC3 != i12) {
                            iC3 = com.avito.android.actions_sheet.a.c(BookingItem.CREATOR, parcel, arrayList, iC3, 1);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        int i13 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i13);
                        while (iC2 != i13) {
                            iC2 = com.avito.android.actions_sheet.a.c(BookingItem.CREATOR, parcel, arrayList3, iC2, 1);
                        }
                        arrayList2 = arrayList3;
                    }
                    return new Bookings(bookingItemCreateFromParcel, arrayList, arrayList2);
                }

                @Override // android.os.Parcelable.Creator
                public final Bookings[] newArray(int i12) {
                    return new Bookings[i12];
                }
            }

            public Bookings(@l BookingItem bookingItem, @l List<BookingItem> list, @l List<BookingItem> list2) {
                this.confirmed = bookingItem;
                this.pending = list;
                this.declined = list2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Bookings copy$default(Bookings bookings, BookingItem bookingItem, List list, List list2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    bookingItem = bookings.confirmed;
                }
                if ((i12 & 2) != 0) {
                    list = bookings.pending;
                }
                if ((i12 & 4) != 0) {
                    list2 = bookings.declined;
                }
                return bookings.copy(bookingItem, list, list2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final BookingItem getConfirmed() {
                return this.confirmed;
            }

            @l
            public final List<BookingItem> component2() {
                return this.pending;
            }

            @l
            public final List<BookingItem> component3() {
                return this.declined;
            }

            @k
            public final Bookings copy(@l BookingItem confirmed, @l List<BookingItem> pending, @l List<BookingItem> declined) {
                return new Bookings(confirmed, pending, declined);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bookings)) {
                    return false;
                }
                Bookings bookings = (Bookings) other;
                return L.f(this.confirmed, bookings.confirmed) && L.f(this.pending, bookings.pending) && L.f(this.declined, bookings.declined);
            }

            @l
            public final BookingItem getConfirmed() {
                return this.confirmed;
            }

            @l
            public final List<BookingItem> getDeclined() {
                return this.declined;
            }

            @l
            public final List<BookingItem> getPending() {
                return this.pending;
            }

            public int hashCode() {
                BookingItem bookingItem = this.confirmed;
                int iHashCode = (bookingItem == null ? 0 : bookingItem.hashCode()) * 31;
                List<BookingItem> list = this.pending;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                List<BookingItem> list2 = this.declined;
                return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Bookings(confirmed=");
                sb2.append(this.confirmed);
                sb2.append(", pending=");
                sb2.append(this.pending);
                sb2.append(", declined=");
                return H.p(sb2, this.declined, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                BookingItem bookingItem = this.confirmed;
                if (bookingItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    bookingItem.writeToParcel(parcel, flags);
                }
                List<BookingItem> list = this.pending;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((BookingItem) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                List<BookingItem> list2 = this.declined;
                if (list2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((BookingItem) itA2.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: GetDealRoomInfoResponse.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000234B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0018¨\u00065"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;", "Landroid/os/Parcelable;", "", "color", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;", "currentState", "", "currentStep", "", "currentStepValue", "", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$Step;", "steps", "<init>", "(Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;IDLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;", "component3", "()I", "component4", "()D", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;IDLjava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;", "getCurrentState", "I", "getCurrentStep", "D", "getCurrentStepValue", "Ljava/util/List;", "getSteps", "State", "Step", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Progress implements Parcelable {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<Progress> CREATOR = new a();

            @c("color")
            @k
            private final String color;

            @c("currentState")
            @k
            private final State currentState;

            @c("currentStep")
            private final int currentStep;

            @c("currentStepValue")
            private final double currentStepValue;

            @c("steps")
            @k
            private final List<Step> steps;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$State;", "", "", "analyticsId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "SELECTION", "BINDING", "BOOKING", "DEAL", "REVENUE", "COMPLETED", "DECLINED", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class State {

                @c("binding")
                public static final State BINDING;

                @c("booking")
                public static final State BOOKING;

                @c("completed")
                public static final State COMPLETED;

                @c("deal")
                public static final State DEAL;

                @c("declined")
                public static final State DECLINED;

                @c("revenue")
                public static final State REVENUE;

                @c("selection")
                public static final State SELECTION;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ State[] f136511c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f136512d;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f136513b;

                static {
                    State state = new State("SELECTION", 0, "selection");
                    SELECTION = state;
                    State state2 = new State("BINDING", 1, "binding");
                    BINDING = state2;
                    State state3 = new State("BOOKING", 2, "booking");
                    BOOKING = state3;
                    State state4 = new State("DEAL", 3, "deal");
                    DEAL = state4;
                    State state5 = new State("REVENUE", 4, "revenue");
                    REVENUE = state5;
                    State state6 = new State("COMPLETED", 5, "completed");
                    COMPLETED = state6;
                    State state7 = new State("DECLINED", 6, "declined");
                    DECLINED = state7;
                    State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
                    f136511c = stateArr;
                    f136512d = kotlin.enums.c.a(stateArr);
                }

                private State(String str, int i12, String str2) {
                    this.f136513b = str2;
                }

                public static State valueOf(String str) {
                    return (State) Enum.valueOf(State.class, str);
                }

                public static State[] values() {
                    return (State[]) f136511c.clone();
                }
            }

            /* compiled from: GetDealRoomInfoResponse.kt */
            @P
            @Keep
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$Step;", "Landroid/os/Parcelable;", "", "title", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Progress$Step;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Step implements Parcelable {
                public static final int $stable = 0;

                @k
                public static final Parcelable.Creator<Step> CREATOR = new a();

                @c("text")
                @l
                private final String text;

                @c("title")
                @k
                private final String title;

                /* compiled from: GetDealRoomInfoResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Step> {
                    @Override // android.os.Parcelable.Creator
                    public final Step createFromParcel(Parcel parcel) {
                        return new Step(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Step[] newArray(int i12) {
                        return new Step[i12];
                    }
                }

                public Step(@k String str, @l String str2) {
                    this.title = str;
                    this.text = str2;
                }

                public static /* synthetic */ Step copy$default(Step step, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = step.title;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = step.text;
                    }
                    return step.copy(str, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                @k
                public final Step copy(@k String title, @l String text) {
                    return new Step(title, text);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Step)) {
                        return false;
                    }
                    Step step = (Step) other;
                    return L.f(this.title, step.title) && L.f(this.text, step.text);
                }

                @l
                public final String getText() {
                    return this.text;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int iHashCode = this.title.hashCode() * 31;
                    String str = this.text;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Step(title=");
                    sb2.append(this.title);
                    sb2.append(", text=");
                    return C22026a.c(sb2, this.text, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeString(this.text);
                }
            }

            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Progress> {
                @Override // android.os.Parcelable.Creator
                public final Progress createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    State stateValueOf = State.valueOf(parcel.readString());
                    int i12 = parcel.readInt();
                    double d12 = parcel.readDouble();
                    int i13 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = com.avito.android.actions_sheet.a.c(Step.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Progress(string, stateValueOf, i12, d12, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Progress[] newArray(int i12) {
                    return new Progress[i12];
                }
            }

            public Progress(@k String str, @k State state, int i12, double d12, @k List<Step> list) {
                this.color = str;
                this.currentState = state;
                this.currentStep = i12;
                this.currentStepValue = d12;
                this.steps = list;
            }

            public static /* synthetic */ Progress copy$default(Progress progress, String str, State state, int i12, double d12, List list, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = progress.color;
                }
                if ((i13 & 2) != 0) {
                    state = progress.currentState;
                }
                State state2 = state;
                if ((i13 & 4) != 0) {
                    i12 = progress.currentStep;
                }
                int i14 = i12;
                if ((i13 & 8) != 0) {
                    d12 = progress.currentStepValue;
                }
                double d13 = d12;
                if ((i13 & 16) != 0) {
                    list = progress.steps;
                }
                return progress.copy(str, state2, i14, d13, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final State getCurrentState() {
                return this.currentState;
            }

            /* renamed from: component3, reason: from getter */
            public final int getCurrentStep() {
                return this.currentStep;
            }

            /* renamed from: component4, reason: from getter */
            public final double getCurrentStepValue() {
                return this.currentStepValue;
            }

            @k
            public final List<Step> component5() {
                return this.steps;
            }

            @k
            public final Progress copy(@k String color, @k State currentState, int currentStep, double currentStepValue, @k List<Step> steps) {
                return new Progress(color, currentState, currentStep, currentStepValue, steps);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) other;
                return L.f(this.color, progress.color) && this.currentState == progress.currentState && this.currentStep == progress.currentStep && Double.compare(this.currentStepValue, progress.currentStepValue) == 0 && L.f(this.steps, progress.steps);
            }

            @k
            public final String getColor() {
                return this.color;
            }

            @k
            public final State getCurrentState() {
                return this.currentState;
            }

            public final int getCurrentStep() {
                return this.currentStep;
            }

            public final double getCurrentStepValue() {
                return this.currentStepValue;
            }

            @k
            public final List<Step> getSteps() {
                return this.steps;
            }

            public int hashCode() {
                return this.steps.hashCode() + e.d(r.e(this.currentStep, (this.currentState.hashCode() + (this.color.hashCode() * 31)) * 31, 31), 31, this.currentStepValue);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Progress(color=");
                sb2.append(this.color);
                sb2.append(", currentState=");
                sb2.append(this.currentState);
                sb2.append(", currentStep=");
                sb2.append(this.currentStep);
                sb2.append(", currentStepValue=");
                sb2.append(this.currentStepValue);
                sb2.append(", steps=");
                return H.p(sb2, this.steps, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.color);
                parcel.writeString(this.currentState.name());
                parcel.writeInt(this.currentStep);
                parcel.writeDouble(this.currentStepValue);
                Iterator itJ = C0.j(this.steps, parcel);
                while (itJ.hasNext()) {
                    ((Step) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: GetDealRoomInfoResponse.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;", "Landroid/os/Parcelable;", "", "title", "subtitle", "lotPrice", "agentCommission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$RecalculatedConfirmedLot;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getLotPrice", "getAgentCommission", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class RecalculatedConfirmedLot implements Parcelable {
            public static final int $stable = 0;

            @k
            public static final Parcelable.Creator<RecalculatedConfirmedLot> CREATOR = new a();

            @c("agentCommission")
            @k
            private final String agentCommission;

            @c("lotPrice")
            @k
            private final String lotPrice;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RecalculatedConfirmedLot> {
                @Override // android.os.Parcelable.Creator
                public final RecalculatedConfirmedLot createFromParcel(Parcel parcel) {
                    return new RecalculatedConfirmedLot(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RecalculatedConfirmedLot[] newArray(int i12) {
                    return new RecalculatedConfirmedLot[i12];
                }
            }

            public RecalculatedConfirmedLot(@k String str, @k String str2, @k String str3, @k String str4) {
                this.title = str;
                this.subtitle = str2;
                this.lotPrice = str3;
                this.agentCommission = str4;
            }

            public static /* synthetic */ RecalculatedConfirmedLot copy$default(RecalculatedConfirmedLot recalculatedConfirmedLot, String str, String str2, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = recalculatedConfirmedLot.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = recalculatedConfirmedLot.subtitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = recalculatedConfirmedLot.lotPrice;
                }
                if ((i12 & 8) != 0) {
                    str4 = recalculatedConfirmedLot.agentCommission;
                }
                return recalculatedConfirmedLot.copy(str, str2, str3, str4);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getLotPrice() {
                return this.lotPrice;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final String getAgentCommission() {
                return this.agentCommission;
            }

            @k
            public final RecalculatedConfirmedLot copy(@k String title, @k String subtitle, @k String lotPrice, @k String agentCommission) {
                return new RecalculatedConfirmedLot(title, subtitle, lotPrice, agentCommission);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RecalculatedConfirmedLot)) {
                    return false;
                }
                RecalculatedConfirmedLot recalculatedConfirmedLot = (RecalculatedConfirmedLot) other;
                return L.f(this.title, recalculatedConfirmedLot.title) && L.f(this.subtitle, recalculatedConfirmedLot.subtitle) && L.f(this.lotPrice, recalculatedConfirmedLot.lotPrice) && L.f(this.agentCommission, recalculatedConfirmedLot.agentCommission);
            }

            @k
            public final String getAgentCommission() {
                return this.agentCommission;
            }

            @k
            public final String getLotPrice() {
                return this.lotPrice;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.agentCommission.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.lotPrice);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("RecalculatedConfirmedLot(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", lotPrice=");
                sb2.append(this.lotPrice);
                sb2.append(", agentCommission=");
                return C22026a.c(sb2, this.agentCommission, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.lotPrice);
                parcel.writeString(this.agentCommission);
            }
        }

        /* compiled from: GetDealRoomInfoResponse.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000245BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u0018¨\u00066"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;", "Landroid/os/Parcelable;", "", "title", "subtitle", "revenueAmount", "", "allDocumentsUploaded", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;", "status", "", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Document;", "documents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getRevenueAmount", "Z", "getAllDocumentsUploaded", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;", "getStatus", "Ljava/util/List;", "getDocuments", "Document", "Status", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Revenue implements Parcelable {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<Revenue> CREATOR = new a();

            @c("allDocumentsUploaded")
            private final boolean allDocumentsUploaded;

            @c("documents")
            @l
            private final List<Document> documents;

            @c("revenueAmount")
            @k
            private final String revenueAmount;

            @c("status")
            @k
            private final Status status;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: GetDealRoomInfoResponse.kt */
            @P
            @Keep
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ`\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Document;", "Landroid/os/Parcelable;", "", "type", "typeName", "shortTypeName", "typeDescription", "mime", "downloadUrl", "fileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Document;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTypeName", "getShortTypeName", "getTypeDescription", "getMime", "getDownloadUrl", "getFileId", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Document implements Parcelable {
                public static final int $stable = 0;

                @k
                public static final Parcelable.Creator<Document> CREATOR = new a();

                @c("downloadURL")
                @l
                private final String downloadUrl;

                @c("fileID")
                @l
                private final String fileId;

                @c("mime")
                @l
                private final String mime;

                @c("shortTypeName")
                @l
                private final String shortTypeName;

                @c("type")
                @k
                private final String type;

                @c("typeDescription")
                @l
                private final String typeDescription;

                @c("typeName")
                @k
                private final String typeName;

                /* compiled from: GetDealRoomInfoResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Document> {
                    @Override // android.os.Parcelable.Creator
                    public final Document createFromParcel(Parcel parcel) {
                        return new Document(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Document[] newArray(int i12) {
                        return new Document[i12];
                    }
                }

                public Document(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
                    this.type = str;
                    this.typeName = str2;
                    this.shortTypeName = str3;
                    this.typeDescription = str4;
                    this.mime = str5;
                    this.downloadUrl = str6;
                    this.fileId = str7;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = document.type;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = document.typeName;
                    }
                    String str8 = str2;
                    if ((i12 & 4) != 0) {
                        str3 = document.shortTypeName;
                    }
                    String str9 = str3;
                    if ((i12 & 8) != 0) {
                        str4 = document.typeDescription;
                    }
                    String str10 = str4;
                    if ((i12 & 16) != 0) {
                        str5 = document.mime;
                    }
                    String str11 = str5;
                    if ((i12 & 32) != 0) {
                        str6 = document.downloadUrl;
                    }
                    String str12 = str6;
                    if ((i12 & 64) != 0) {
                        str7 = document.fileId;
                    }
                    return document.copy(str, str8, str9, str10, str11, str12, str7);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTypeName() {
                    return this.typeName;
                }

                @l
                /* renamed from: component3, reason: from getter */
                public final String getShortTypeName() {
                    return this.shortTypeName;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getTypeDescription() {
                    return this.typeDescription;
                }

                @l
                /* renamed from: component5, reason: from getter */
                public final String getMime() {
                    return this.mime;
                }

                @l
                /* renamed from: component6, reason: from getter */
                public final String getDownloadUrl() {
                    return this.downloadUrl;
                }

                @l
                /* renamed from: component7, reason: from getter */
                public final String getFileId() {
                    return this.fileId;
                }

                @k
                public final Document copy(@k String type, @k String typeName, @l String shortTypeName, @l String typeDescription, @l String mime, @l String downloadUrl, @l String fileId) {
                    return new Document(type, typeName, shortTypeName, typeDescription, mime, downloadUrl, fileId);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Document)) {
                        return false;
                    }
                    Document document = (Document) other;
                    return L.f(this.type, document.type) && L.f(this.typeName, document.typeName) && L.f(this.shortTypeName, document.shortTypeName) && L.f(this.typeDescription, document.typeDescription) && L.f(this.mime, document.mime) && L.f(this.downloadUrl, document.downloadUrl) && L.f(this.fileId, document.fileId);
                }

                @l
                public final String getDownloadUrl() {
                    return this.downloadUrl;
                }

                @l
                public final String getFileId() {
                    return this.fileId;
                }

                @l
                public final String getMime() {
                    return this.mime;
                }

                @l
                public final String getShortTypeName() {
                    return this.shortTypeName;
                }

                @k
                public final String getType() {
                    return this.type;
                }

                @l
                public final String getTypeDescription() {
                    return this.typeDescription;
                }

                @k
                public final String getTypeName() {
                    return this.typeName;
                }

                public int hashCode() {
                    int iD2 = H.d(this.type.hashCode() * 31, 31, this.typeName);
                    String str = this.shortTypeName;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.typeDescription;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.mime;
                    int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.downloadUrl;
                    int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.fileId;
                    return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Document(type=");
                    sb2.append(this.type);
                    sb2.append(", typeName=");
                    sb2.append(this.typeName);
                    sb2.append(", shortTypeName=");
                    sb2.append(this.shortTypeName);
                    sb2.append(", typeDescription=");
                    sb2.append(this.typeDescription);
                    sb2.append(", mime=");
                    sb2.append(this.mime);
                    sb2.append(", downloadUrl=");
                    sb2.append(this.downloadUrl);
                    sb2.append(", fileId=");
                    return C22026a.c(sb2, this.fileId, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    parcel.writeString(this.typeName);
                    parcel.writeString(this.shortTypeName);
                    parcel.writeString(this.typeDescription);
                    parcel.writeString(this.mime);
                    parcel.writeString(this.downloadUrl);
                    parcel.writeString(this.fileId);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$Revenue$Status;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CREATED", "REQUEST_SENT", "PAY_WAITING", "CONFIRMED", "REJECTED", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Status {

                @c("confirmed")
                public static final Status CONFIRMED;

                @c("created")
                public static final Status CREATED;

                @c("pay_waiting")
                public static final Status PAY_WAITING;

                @c("rejected")
                public static final Status REJECTED;

                @c("request_sent")
                public static final Status REQUEST_SENT;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Status[] f136514b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f136515c;

                static {
                    Status status = new Status("CREATED", 0, "created");
                    CREATED = status;
                    Status status2 = new Status("REQUEST_SENT", 1, "request_sent");
                    REQUEST_SENT = status2;
                    Status status3 = new Status("PAY_WAITING", 2, "pay_waiting");
                    PAY_WAITING = status3;
                    Status status4 = new Status("CONFIRMED", 3, "confirmed");
                    CONFIRMED = status4;
                    Status status5 = new Status("REJECTED", 4, "rejected");
                    REJECTED = status5;
                    Status[] statusArr = {status, status2, status3, status4, status5};
                    f136514b = statusArr;
                    f136515c = kotlin.enums.c.a(statusArr);
                }

                private Status(String str, int i12, String str2) {
                }

                public static Status valueOf(String str) {
                    return (Status) Enum.valueOf(Status.class, str);
                }

                public static Status[] values() {
                    return (Status[]) f136514b.clone();
                }
            }

            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Revenue> {
                @Override // android.os.Parcelable.Creator
                public final Revenue createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int iC2 = 0;
                    boolean z12 = parcel.readInt() != 0;
                    Status statusValueOf = Status.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(Document.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Revenue(string, string2, string3, z12, statusValueOf, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Revenue[] newArray(int i12) {
                    return new Revenue[i12];
                }
            }

            public Revenue(@k String str, @l String str2, @k String str3, boolean z12, @k Status status, @l List<Document> list) {
                this.title = str;
                this.subtitle = str2;
                this.revenueAmount = str3;
                this.allDocumentsUploaded = z12;
                this.status = status;
                this.documents = list;
            }

            public static /* synthetic */ Revenue copy$default(Revenue revenue, String str, String str2, String str3, boolean z12, Status status, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = revenue.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = revenue.subtitle;
                }
                String str4 = str2;
                if ((i12 & 4) != 0) {
                    str3 = revenue.revenueAmount;
                }
                String str5 = str3;
                if ((i12 & 8) != 0) {
                    z12 = revenue.allDocumentsUploaded;
                }
                boolean z13 = z12;
                if ((i12 & 16) != 0) {
                    status = revenue.status;
                }
                Status status2 = status;
                if ((i12 & 32) != 0) {
                    list = revenue.documents;
                }
                return revenue.copy(str, str4, str5, z13, status2, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getRevenueAmount() {
                return this.revenueAmount;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getAllDocumentsUploaded() {
                return this.allDocumentsUploaded;
            }

            @k
            /* renamed from: component5, reason: from getter */
            public final Status getStatus() {
                return this.status;
            }

            @l
            public final List<Document> component6() {
                return this.documents;
            }

            @k
            public final Revenue copy(@k String title, @l String subtitle, @k String revenueAmount, boolean allDocumentsUploaded, @k Status status, @l List<Document> documents) {
                return new Revenue(title, subtitle, revenueAmount, allDocumentsUploaded, status, documents);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Revenue)) {
                    return false;
                }
                Revenue revenue = (Revenue) other;
                return L.f(this.title, revenue.title) && L.f(this.subtitle, revenue.subtitle) && L.f(this.revenueAmount, revenue.revenueAmount) && this.allDocumentsUploaded == revenue.allDocumentsUploaded && this.status == revenue.status && L.f(this.documents, revenue.documents);
            }

            public final boolean getAllDocumentsUploaded() {
                return this.allDocumentsUploaded;
            }

            @l
            public final List<Document> getDocuments() {
                return this.documents;
            }

            @k
            public final String getRevenueAmount() {
                return this.revenueAmount;
            }

            @k
            public final Status getStatus() {
                return this.status;
            }

            @l
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = (this.status.hashCode() + r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.revenueAmount), 31, this.allDocumentsUploaded)) * 31;
                List<Document> list = this.documents;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Revenue(title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", revenueAmount=");
                sb2.append(this.revenueAmount);
                sb2.append(", allDocumentsUploaded=");
                sb2.append(this.allDocumentsUploaded);
                sb2.append(", status=");
                sb2.append(this.status);
                sb2.append(", documents=");
                return H.p(sb2, this.documents, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.revenueAmount);
                parcel.writeInt(this.allDocumentsUploaded ? 1 : 0);
                parcel.writeString(this.status.name());
                List<Document> list = this.documents;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Document) itA.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: GetDealRoomInfoResponse.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item;", "history", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getHistory", "Item", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SelectionHistory implements Parcelable {
            public static final int $stable = 8;

            @k
            public static final Parcelable.Creator<SelectionHistory> CREATOR = new a();

            @c("history")
            @l
            private final List<Item> history;

            @c("title")
            @k
            private final String title;

            /* compiled from: GetDealRoomInfoResponse.kt */
            @P
            @Keep
            @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0002MNB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010)Jª\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001aJ \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bA\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bB\u0010\u001eR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bE\u0010\u001eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bF\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010&R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bI\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bL\u0010)¨\u0006O"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "", "developmentId", "", "developmentName", "developerName", "developmentAddress", "", "Lcom/avito/android/remote/model/Image;", "images", DistrictParameter.TYPE, "Lcom/avito/android/developments_agency_search/domain/Metro;", MetroParameter.TYPE, "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;", "bindingInfo", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$Lot;", "lots", "", "latitude", "longitude", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;", "component10", "component11", "()Ljava/lang/Double;", "component12", "copy", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getLocationId", "J", "getDevelopmentId", "Ljava/lang/String;", "getDevelopmentName", "getDeveloperName", "getDevelopmentAddress", "Ljava/util/List;", "getImages", "getDistrict", "getMetro", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;", "getBindingInfo", "getLots", "Ljava/lang/Double;", "getLatitude", "getLongitude", "BindingInfo", "Lot", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Item implements Parcelable {
                public static final int $stable = 8;

                @k
                public static final Parcelable.Creator<Item> CREATOR = new a();

                @c("bindingInfo")
                @l
                private final BindingInfo bindingInfo;

                @c("developerName")
                @l
                private final String developerName;

                @c("developmentAddress")
                @k
                private final String developmentAddress;

                @c("developmentId")
                private final long developmentId;

                @c("developmentName")
                @k
                private final String developmentName;

                @c(DistrictParameter.TYPE)
                @l
                private final String district;

                @c("images")
                @l
                private final List<Image> images;

                @c("latitude")
                @l
                private final Double latitude;

                @c(SearchParamsConverterKt.LOCATION_ID)
                private final int locationId;

                @c("longitude")
                @l
                private final Double longitude;

                @c("lots")
                @l
                private final List<Lot> lots;

                @c(MetroParameter.TYPE)
                @l
                private final List<Metro> metro;

                /* compiled from: GetDealRoomInfoResponse.kt */
                @P
                @Keep
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\r¨\u0006)"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;", "Landroid/os/Parcelable;", "", "isBound", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;", "title", "subtitle", "text", "<init>", "(ZLcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;)V", "component1", "()Z", "component2", "()Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;", "component3", "component4", "copy", "(ZLcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;", "getTitle", "getSubtitle", "getText", "BindingColoredText", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class BindingInfo implements Parcelable {
                    public static final int $stable = 0;

                    @k
                    public static final Parcelable.Creator<BindingInfo> CREATOR = new a();

                    @c("isBound")
                    private final boolean isBound;

                    @c("subtitle")
                    @l
                    private final BindingColoredText subtitle;

                    @c("text")
                    @l
                    private final BindingColoredText text;

                    @c("title")
                    @l
                    private final BindingColoredText title;

                    /* compiled from: GetDealRoomInfoResponse.kt */
                    @P
                    @Keep
                    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;", "Landroid/os/Parcelable;", "", "text", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$BindingInfo$BindingColoredText;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getColor", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    @d
                    public static final /* data */ class BindingColoredText implements Parcelable {
                        public static final int $stable = 0;

                        @k
                        public static final Parcelable.Creator<BindingColoredText> CREATOR = new a();

                        @c("color")
                        @l
                        private final String color;

                        @c("text")
                        @k
                        private final String text;

                        /* compiled from: GetDealRoomInfoResponse.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<BindingColoredText> {
                            @Override // android.os.Parcelable.Creator
                            public final BindingColoredText createFromParcel(Parcel parcel) {
                                return new BindingColoredText(parcel.readString(), parcel.readString());
                            }

                            @Override // android.os.Parcelable.Creator
                            public final BindingColoredText[] newArray(int i12) {
                                return new BindingColoredText[i12];
                            }
                        }

                        public BindingColoredText(@k String str, @l String str2) {
                            this.text = str;
                            this.color = str2;
                        }

                        public static /* synthetic */ BindingColoredText copy$default(BindingColoredText bindingColoredText, String str, String str2, int i12, Object obj) {
                            if ((i12 & 1) != 0) {
                                str = bindingColoredText.text;
                            }
                            if ((i12 & 2) != 0) {
                                str2 = bindingColoredText.color;
                            }
                            return bindingColoredText.copy(str, str2);
                        }

                        @k
                        /* renamed from: component1, reason: from getter */
                        public final String getText() {
                            return this.text;
                        }

                        @l
                        /* renamed from: component2, reason: from getter */
                        public final String getColor() {
                            return this.color;
                        }

                        @k
                        public final BindingColoredText copy(@k String text, @l String color) {
                            return new BindingColoredText(text, color);
                        }

                        @Override // android.os.Parcelable
                        public int describeContents() {
                            return 0;
                        }

                        public boolean equals(@l Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof BindingColoredText)) {
                                return false;
                            }
                            BindingColoredText bindingColoredText = (BindingColoredText) other;
                            return L.f(this.text, bindingColoredText.text) && L.f(this.color, bindingColoredText.color);
                        }

                        @l
                        public final String getColor() {
                            return this.color;
                        }

                        @k
                        public final String getText() {
                            return this.text;
                        }

                        public int hashCode() {
                            int iHashCode = this.text.hashCode() * 31;
                            String str = this.color;
                            return iHashCode + (str == null ? 0 : str.hashCode());
                        }

                        @k
                        public String toString() {
                            StringBuilder sb2 = new StringBuilder("BindingColoredText(text=");
                            sb2.append(this.text);
                            sb2.append(", color=");
                            return C22026a.c(sb2, this.color, ')');
                        }

                        @Override // android.os.Parcelable
                        public void writeToParcel(@k Parcel parcel, int flags) {
                            parcel.writeString(this.text);
                            parcel.writeString(this.color);
                        }
                    }

                    /* compiled from: GetDealRoomInfoResponse.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<BindingInfo> {
                        @Override // android.os.Parcelable.Creator
                        public final BindingInfo createFromParcel(Parcel parcel) {
                            return new BindingInfo(parcel.readInt() != 0, parcel.readInt() == 0 ? null : BindingColoredText.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BindingColoredText.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BindingColoredText.CREATOR.createFromParcel(parcel) : null);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final BindingInfo[] newArray(int i12) {
                            return new BindingInfo[i12];
                        }
                    }

                    public BindingInfo(boolean z12, @l BindingColoredText bindingColoredText, @l BindingColoredText bindingColoredText2, @l BindingColoredText bindingColoredText3) {
                        this.isBound = z12;
                        this.title = bindingColoredText;
                        this.subtitle = bindingColoredText2;
                        this.text = bindingColoredText3;
                    }

                    public static /* synthetic */ BindingInfo copy$default(BindingInfo bindingInfo, boolean z12, BindingColoredText bindingColoredText, BindingColoredText bindingColoredText2, BindingColoredText bindingColoredText3, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            z12 = bindingInfo.isBound;
                        }
                        if ((i12 & 2) != 0) {
                            bindingColoredText = bindingInfo.title;
                        }
                        if ((i12 & 4) != 0) {
                            bindingColoredText2 = bindingInfo.subtitle;
                        }
                        if ((i12 & 8) != 0) {
                            bindingColoredText3 = bindingInfo.text;
                        }
                        return bindingInfo.copy(z12, bindingColoredText, bindingColoredText2, bindingColoredText3);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final boolean getIsBound() {
                        return this.isBound;
                    }

                    @l
                    /* renamed from: component2, reason: from getter */
                    public final BindingColoredText getTitle() {
                        return this.title;
                    }

                    @l
                    /* renamed from: component3, reason: from getter */
                    public final BindingColoredText getSubtitle() {
                        return this.subtitle;
                    }

                    @l
                    /* renamed from: component4, reason: from getter */
                    public final BindingColoredText getText() {
                        return this.text;
                    }

                    @k
                    public final BindingInfo copy(boolean isBound, @l BindingColoredText title, @l BindingColoredText subtitle, @l BindingColoredText text) {
                        return new BindingInfo(isBound, title, subtitle, text);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof BindingInfo)) {
                            return false;
                        }
                        BindingInfo bindingInfo = (BindingInfo) other;
                        return this.isBound == bindingInfo.isBound && L.f(this.title, bindingInfo.title) && L.f(this.subtitle, bindingInfo.subtitle) && L.f(this.text, bindingInfo.text);
                    }

                    @l
                    public final BindingColoredText getSubtitle() {
                        return this.subtitle;
                    }

                    @l
                    public final BindingColoredText getText() {
                        return this.text;
                    }

                    @l
                    public final BindingColoredText getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int iHashCode = Boolean.hashCode(this.isBound) * 31;
                        BindingColoredText bindingColoredText = this.title;
                        int iHashCode2 = (iHashCode + (bindingColoredText == null ? 0 : bindingColoredText.hashCode())) * 31;
                        BindingColoredText bindingColoredText2 = this.subtitle;
                        int iHashCode3 = (iHashCode2 + (bindingColoredText2 == null ? 0 : bindingColoredText2.hashCode())) * 31;
                        BindingColoredText bindingColoredText3 = this.text;
                        return iHashCode3 + (bindingColoredText3 != null ? bindingColoredText3.hashCode() : 0);
                    }

                    public final boolean isBound() {
                        return this.isBound;
                    }

                    @k
                    public String toString() {
                        return "BindingInfo(isBound=" + this.isBound + ", title=" + this.title + ", subtitle=" + this.subtitle + ", text=" + this.text + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeInt(this.isBound ? 1 : 0);
                        BindingColoredText bindingColoredText = this.title;
                        if (bindingColoredText == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            bindingColoredText.writeToParcel(parcel, flags);
                        }
                        BindingColoredText bindingColoredText2 = this.subtitle;
                        if (bindingColoredText2 == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            bindingColoredText2.writeToParcel(parcel, flags);
                        }
                        BindingColoredText bindingColoredText3 = this.text;
                        if (bindingColoredText3 == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            bindingColoredText3.writeToParcel(parcel, flags);
                        }
                    }
                }

                /* compiled from: GetDealRoomInfoResponse.kt */
                @P
                @Keep
                @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0086\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b:\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b<\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b=\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b\f\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bA\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010#¨\u0006D"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$Lot;", "Landroid/os/Parcelable;", "", "id", "", "price", "roomType", "floor", "totalArea", "agentCommission", "commissionInfoFormatted", "", "isActive", "Lcom/avito/android/remote/model/Image;", "image", "flatNumber", "Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "priceTooltip", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/PriceTooltip;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "()Lcom/avito/android/remote/model/Image;", "component10", "component11", "()Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/PriceTooltip;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Deal$SelectionHistory$Item$Lot;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getPrice", "getRoomType", "getFloor", "getTotalArea", "getAgentCommission", "getCommissionInfoFormatted", "Z", "Lcom/avito/android/remote/model/Image;", "getImage", "getFlatNumber", "Lcom/avito/android/developments_agency_search/domain/PriceTooltip;", "getPriceTooltip", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @d
                public static final /* data */ class Lot implements Parcelable {
                    public static final int $stable = 8;

                    @k
                    public static final Parcelable.Creator<Lot> CREATOR = new a();

                    @c("agentCommission")
                    @l
                    private final String agentCommission;

                    @c("agentCommissionFullValue")
                    @l
                    private final String commissionInfoFormatted;

                    @c("flatNumber")
                    @k
                    private final String flatNumber;

                    @c("floor")
                    @k
                    private final String floor;

                    @c("id")
                    private final long id;

                    @c("image")
                    @l
                    private final Image image;

                    @c("isActive")
                    private final boolean isActive;

                    @c("price")
                    @k
                    private final String price;

                    @c("priceTooltip")
                    @l
                    private final PriceTooltip priceTooltip;

                    @c("roomType")
                    @k
                    private final String roomType;

                    @c("totalArea")
                    @k
                    private final String totalArea;

                    /* compiled from: GetDealRoomInfoResponse.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Lot> {
                        @Override // android.os.Parcelable.Creator
                        public final Lot createFromParcel(Parcel parcel) {
                            return new Lot(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Image) parcel.readParcelable(Lot.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : PriceTooltip.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Lot[] newArray(int i12) {
                            return new Lot[i12];
                        }
                    }

                    public Lot(long j12, @k String str, @k String str2, @k String str3, @k String str4, @l String str5, @l String str6, boolean z12, @l Image image, @k String str7, @l PriceTooltip priceTooltip) {
                        this.id = j12;
                        this.price = str;
                        this.roomType = str2;
                        this.floor = str3;
                        this.totalArea = str4;
                        this.agentCommission = str5;
                        this.commissionInfoFormatted = str6;
                        this.isActive = z12;
                        this.image = image;
                        this.flatNumber = str7;
                        this.priceTooltip = priceTooltip;
                    }

                    /* renamed from: component1, reason: from getter */
                    public final long getId() {
                        return this.id;
                    }

                    @k
                    /* renamed from: component10, reason: from getter */
                    public final String getFlatNumber() {
                        return this.flatNumber;
                    }

                    @l
                    /* renamed from: component11, reason: from getter */
                    public final PriceTooltip getPriceTooltip() {
                        return this.priceTooltip;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final String getPrice() {
                        return this.price;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final String getRoomType() {
                        return this.roomType;
                    }

                    @k
                    /* renamed from: component4, reason: from getter */
                    public final String getFloor() {
                        return this.floor;
                    }

                    @k
                    /* renamed from: component5, reason: from getter */
                    public final String getTotalArea() {
                        return this.totalArea;
                    }

                    @l
                    /* renamed from: component6, reason: from getter */
                    public final String getAgentCommission() {
                        return this.agentCommission;
                    }

                    @l
                    /* renamed from: component7, reason: from getter */
                    public final String getCommissionInfoFormatted() {
                        return this.commissionInfoFormatted;
                    }

                    /* renamed from: component8, reason: from getter */
                    public final boolean getIsActive() {
                        return this.isActive;
                    }

                    @l
                    /* renamed from: component9, reason: from getter */
                    public final Image getImage() {
                        return this.image;
                    }

                    @k
                    public final Lot copy(long id2, @k String price, @k String roomType, @k String floor, @k String totalArea, @l String agentCommission, @l String commissionInfoFormatted, boolean isActive, @l Image image, @k String flatNumber, @l PriceTooltip priceTooltip) {
                        return new Lot(id2, price, roomType, floor, totalArea, agentCommission, commissionInfoFormatted, isActive, image, flatNumber, priceTooltip);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Lot)) {
                            return false;
                        }
                        Lot lot = (Lot) other;
                        return this.id == lot.id && L.f(this.price, lot.price) && L.f(this.roomType, lot.roomType) && L.f(this.floor, lot.floor) && L.f(this.totalArea, lot.totalArea) && L.f(this.agentCommission, lot.agentCommission) && L.f(this.commissionInfoFormatted, lot.commissionInfoFormatted) && this.isActive == lot.isActive && L.f(this.image, lot.image) && L.f(this.flatNumber, lot.flatNumber) && L.f(this.priceTooltip, lot.priceTooltip);
                    }

                    @l
                    public final String getAgentCommission() {
                        return this.agentCommission;
                    }

                    @l
                    public final String getCommissionInfoFormatted() {
                        return this.commissionInfoFormatted;
                    }

                    @k
                    public final String getFlatNumber() {
                        return this.flatNumber;
                    }

                    @k
                    public final String getFloor() {
                        return this.floor;
                    }

                    public final long getId() {
                        return this.id;
                    }

                    @l
                    public final Image getImage() {
                        return this.image;
                    }

                    @k
                    public final String getPrice() {
                        return this.price;
                    }

                    @l
                    public final PriceTooltip getPriceTooltip() {
                        return this.priceTooltip;
                    }

                    @k
                    public final String getRoomType() {
                        return this.roomType;
                    }

                    @k
                    public final String getTotalArea() {
                        return this.totalArea;
                    }

                    public int hashCode() {
                        int iD2 = H.d(H.d(H.d(H.d(Long.hashCode(this.id) * 31, 31, this.price), 31, this.roomType), 31, this.floor), 31, this.totalArea);
                        String str = this.agentCommission;
                        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.commissionInfoFormatted;
                        int i12 = r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isActive);
                        Image image = this.image;
                        int iD3 = H.d((i12 + (image == null ? 0 : image.hashCode())) * 31, 31, this.flatNumber);
                        PriceTooltip priceTooltip = this.priceTooltip;
                        return iD3 + (priceTooltip != null ? priceTooltip.hashCode() : 0);
                    }

                    public final boolean isActive() {
                        return this.isActive;
                    }

                    @k
                    public String toString() {
                        return "Lot(id=" + this.id + ", price=" + this.price + ", roomType=" + this.roomType + ", floor=" + this.floor + ", totalArea=" + this.totalArea + ", agentCommission=" + this.agentCommission + ", commissionInfoFormatted=" + this.commissionInfoFormatted + ", isActive=" + this.isActive + ", image=" + this.image + ", flatNumber=" + this.flatNumber + ", priceTooltip=" + this.priceTooltip + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@k Parcel parcel, int flags) {
                        parcel.writeLong(this.id);
                        parcel.writeString(this.price);
                        parcel.writeString(this.roomType);
                        parcel.writeString(this.floor);
                        parcel.writeString(this.totalArea);
                        parcel.writeString(this.agentCommission);
                        parcel.writeString(this.commissionInfoFormatted);
                        parcel.writeInt(this.isActive ? 1 : 0);
                        parcel.writeParcelable(this.image, flags);
                        parcel.writeString(this.flatNumber);
                        PriceTooltip priceTooltip = this.priceTooltip;
                        if (priceTooltip == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            priceTooltip.writeToParcel(parcel, flags);
                        }
                    }
                }

                /* compiled from: GetDealRoomInfoResponse.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Item> {
                    @Override // android.os.Parcelable.Creator
                    public final Item createFromParcel(Parcel parcel) {
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        ArrayList arrayList3;
                        int i12 = parcel.readInt();
                        long j12 = parcel.readLong();
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        int iC2 = 0;
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int i13 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(i13);
                            int iL2 = 0;
                            while (iL2 != i13) {
                                iL2 = com.avito.android.actions_sheet.a.l(Item.class, parcel, arrayList4, iL2, 1);
                            }
                            arrayList = arrayList4;
                        }
                        String string4 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int i14 = parcel.readInt();
                            arrayList2 = new ArrayList(i14);
                            int iC3 = 0;
                            while (iC3 != i14) {
                                iC3 = com.avito.android.actions_sheet.a.c(Metro.CREATOR, parcel, arrayList2, iC3, 1);
                            }
                        }
                        BindingInfo bindingInfoCreateFromParcel = parcel.readInt() == 0 ? null : BindingInfo.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            arrayList3 = null;
                        } else {
                            int i15 = parcel.readInt();
                            arrayList3 = new ArrayList(i15);
                            while (iC2 != i15) {
                                iC2 = com.avito.android.actions_sheet.a.c(Lot.CREATOR, parcel, arrayList3, iC2, 1);
                            }
                        }
                        return new Item(i12, j12, string, string2, string3, arrayList, string4, arrayList2, bindingInfoCreateFromParcel, arrayList3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Item[] newArray(int i12) {
                        return new Item[i12];
                    }
                }

                public Item(int i12, long j12, @k String str, @l String str2, @k String str3, @l List<Image> list, @l String str4, @l List<Metro> list2, @l BindingInfo bindingInfo, @l List<Lot> list3, @l Double d12, @l Double d13) {
                    this.locationId = i12;
                    this.developmentId = j12;
                    this.developmentName = str;
                    this.developerName = str2;
                    this.developmentAddress = str3;
                    this.images = list;
                    this.district = str4;
                    this.metro = list2;
                    this.bindingInfo = bindingInfo;
                    this.lots = list3;
                    this.latitude = d12;
                    this.longitude = d13;
                }

                /* renamed from: component1, reason: from getter */
                public final int getLocationId() {
                    return this.locationId;
                }

                @l
                public final List<Lot> component10() {
                    return this.lots;
                }

                @l
                /* renamed from: component11, reason: from getter */
                public final Double getLatitude() {
                    return this.latitude;
                }

                @l
                /* renamed from: component12, reason: from getter */
                public final Double getLongitude() {
                    return this.longitude;
                }

                /* renamed from: component2, reason: from getter */
                public final long getDevelopmentId() {
                    return this.developmentId;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final String getDevelopmentName() {
                    return this.developmentName;
                }

                @l
                /* renamed from: component4, reason: from getter */
                public final String getDeveloperName() {
                    return this.developerName;
                }

                @k
                /* renamed from: component5, reason: from getter */
                public final String getDevelopmentAddress() {
                    return this.developmentAddress;
                }

                @l
                public final List<Image> component6() {
                    return this.images;
                }

                @l
                /* renamed from: component7, reason: from getter */
                public final String getDistrict() {
                    return this.district;
                }

                @l
                public final List<Metro> component8() {
                    return this.metro;
                }

                @l
                /* renamed from: component9, reason: from getter */
                public final BindingInfo getBindingInfo() {
                    return this.bindingInfo;
                }

                @k
                public final Item copy(int locationId, long developmentId, @k String developmentName, @l String developerName, @k String developmentAddress, @l List<Image> images, @l String district, @l List<Metro> metro, @l BindingInfo bindingInfo, @l List<Lot> lots, @l Double latitude, @l Double longitude) {
                    return new Item(locationId, developmentId, developmentName, developerName, developmentAddress, images, district, metro, bindingInfo, lots, latitude, longitude);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    return this.locationId == item.locationId && this.developmentId == item.developmentId && L.f(this.developmentName, item.developmentName) && L.f(this.developerName, item.developerName) && L.f(this.developmentAddress, item.developmentAddress) && L.f(this.images, item.images) && L.f(this.district, item.district) && L.f(this.metro, item.metro) && L.f(this.bindingInfo, item.bindingInfo) && L.f(this.lots, item.lots) && L.f(this.latitude, item.latitude) && L.f(this.longitude, item.longitude);
                }

                @l
                public final BindingInfo getBindingInfo() {
                    return this.bindingInfo;
                }

                @l
                public final String getDeveloperName() {
                    return this.developerName;
                }

                @k
                public final String getDevelopmentAddress() {
                    return this.developmentAddress;
                }

                public final long getDevelopmentId() {
                    return this.developmentId;
                }

                @k
                public final String getDevelopmentName() {
                    return this.developmentName;
                }

                @l
                public final String getDistrict() {
                    return this.district;
                }

                @l
                public final List<Image> getImages() {
                    return this.images;
                }

                @l
                public final Double getLatitude() {
                    return this.latitude;
                }

                public final int getLocationId() {
                    return this.locationId;
                }

                @l
                public final Double getLongitude() {
                    return this.longitude;
                }

                @l
                public final List<Lot> getLots() {
                    return this.lots;
                }

                @l
                public final List<Metro> getMetro() {
                    return this.metro;
                }

                public int hashCode() {
                    int iD2 = H.d(r.g(Integer.hashCode(this.locationId) * 31, 31, this.developmentId), 31, this.developmentName);
                    String str = this.developerName;
                    int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.developmentAddress);
                    List<Image> list = this.images;
                    int iHashCode = (iD3 + (list == null ? 0 : list.hashCode())) * 31;
                    String str2 = this.district;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    List<Metro> list2 = this.metro;
                    int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    BindingInfo bindingInfo = this.bindingInfo;
                    int iHashCode4 = (iHashCode3 + (bindingInfo == null ? 0 : bindingInfo.hashCode())) * 31;
                    List<Lot> list3 = this.lots;
                    int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
                    Double d12 = this.latitude;
                    int iHashCode6 = (iHashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.longitude;
                    return iHashCode6 + (d13 != null ? d13.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Item(locationId=");
                    sb2.append(this.locationId);
                    sb2.append(", developmentId=");
                    sb2.append(this.developmentId);
                    sb2.append(", developmentName=");
                    sb2.append(this.developmentName);
                    sb2.append(", developerName=");
                    sb2.append(this.developerName);
                    sb2.append(", developmentAddress=");
                    sb2.append(this.developmentAddress);
                    sb2.append(", images=");
                    sb2.append(this.images);
                    sb2.append(", district=");
                    sb2.append(this.district);
                    sb2.append(", metro=");
                    sb2.append(this.metro);
                    sb2.append(", bindingInfo=");
                    sb2.append(this.bindingInfo);
                    sb2.append(", lots=");
                    sb2.append(this.lots);
                    sb2.append(", latitude=");
                    sb2.append(this.latitude);
                    sb2.append(", longitude=");
                    return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.longitude, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.locationId);
                    parcel.writeLong(this.developmentId);
                    parcel.writeString(this.developmentName);
                    parcel.writeString(this.developerName);
                    parcel.writeString(this.developmentAddress);
                    List<Image> list = this.images;
                    if (list == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            parcel.writeParcelable((Parcelable) itA.next(), flags);
                        }
                    }
                    parcel.writeString(this.district);
                    List<Metro> list2 = this.metro;
                    if (list2 == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                        while (itA2.hasNext()) {
                            ((Metro) itA2.next()).writeToParcel(parcel, flags);
                        }
                    }
                    BindingInfo bindingInfo = this.bindingInfo;
                    if (bindingInfo == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        bindingInfo.writeToParcel(parcel, flags);
                    }
                    List<Lot> list3 = this.lots;
                    if (list3 == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
                        while (itA3.hasNext()) {
                            ((Lot) itA3.next()).writeToParcel(parcel, flags);
                        }
                    }
                    Double d12 = this.latitude;
                    if (d12 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
                    }
                    Double d13 = this.longitude;
                    if (d13 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
                    }
                }
            }

            /* compiled from: GetDealRoomInfoResponse.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SelectionHistory> {
                @Override // android.os.Parcelable.Creator
                public final SelectionHistory createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i12);
                        int iC2 = 0;
                        while (iC2 != i12) {
                            iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList2, iC2, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new SelectionHistory(string, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final SelectionHistory[] newArray(int i12) {
                    return new SelectionHistory[i12];
                }
            }

            public SelectionHistory(@k String str, @l List<Item> list) {
                this.title = str;
                this.history = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SelectionHistory copy$default(SelectionHistory selectionHistory, String str, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = selectionHistory.title;
                }
                if ((i12 & 2) != 0) {
                    list = selectionHistory.history;
                }
                return selectionHistory.copy(str, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @l
            public final List<Item> component2() {
                return this.history;
            }

            @k
            public final SelectionHistory copy(@k String title, @l List<Item> history) {
                return new SelectionHistory(title, history);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectionHistory)) {
                    return false;
                }
                SelectionHistory selectionHistory = (SelectionHistory) other;
                return L.f(this.title, selectionHistory.title) && L.f(this.history, selectionHistory.history);
            }

            @l
            public final List<Item> getHistory() {
                return this.history;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                List<Item> list = this.history;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SelectionHistory(title=");
                sb2.append(this.title);
                sb2.append(", history=");
                return H.p(sb2, this.history, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                List<Item> list = this.history;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Item) itA.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: GetDealRoomInfoResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Deal> {
            @Override // android.os.Parcelable.Creator
            public final Deal createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Progress progressCreateFromParcel = parcel.readInt() == 0 ? null : Progress.CREATOR.createFromParcel(parcel);
                Revenue revenueCreateFromParcel = parcel.readInt() == 0 ? null : Revenue.CREATOR.createFromParcel(parcel);
                Bookings bookingsCreateFromParcel = parcel.readInt() == 0 ? null : Bookings.CREATOR.createFromParcel(parcel);
                SelectionHistory selectionHistoryCreateFromParcel = parcel.readInt() == 0 ? null : SelectionHistory.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Deal.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Deal(string, string2, string3, progressCreateFromParcel, revenueCreateFromParcel, bookingsCreateFromParcel, selectionHistoryCreateFromParcel, arrayList, (DeepLink) parcel.readParcelable(Deal.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0 ? RecalculatedConfirmedLot.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Deal[] newArray(int i12) {
                return new Deal[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Deal(@k String str, @k String str2, @l String str3, @l Progress progress, @l Revenue revenue, @l Bookings bookings, @l SelectionHistory selectionHistory, @l List<? extends ParameterSlot> list, @l DeepLink deepLink, @l List<String> list2, @l RecalculatedConfirmedLot recalculatedConfirmedLot) {
            this.id = str;
            this.title = str2;
            this.notes = str3;
            this.progress = progress;
            this.revenue = revenue;
            this.bookings = bookings;
            this.selectionHistory = selectionHistory;
            this.preferences = list;
            this.preferencesUri = deepLink;
            this.preferencesIds = list2;
            this.recalculatedConfirmedLot = recalculatedConfirmedLot;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        public final List<String> component10() {
            return this.preferencesIds;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final RecalculatedConfirmedLot getRecalculatedConfirmedLot() {
            return this.recalculatedConfirmedLot;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Progress getProgress() {
            return this.progress;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Revenue getRevenue() {
            return this.revenue;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Bookings getBookings() {
            return this.bookings;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final SelectionHistory getSelectionHistory() {
            return this.selectionHistory;
        }

        @l
        public final List<ParameterSlot> component8() {
            return this.preferences;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final DeepLink getPreferencesUri() {
            return this.preferencesUri;
        }

        @k
        public final Deal copy(@k String id2, @k String title, @l String notes, @l Progress progress, @l Revenue revenue, @l Bookings bookings, @l SelectionHistory selectionHistory, @l List<? extends ParameterSlot> preferences, @l DeepLink preferencesUri, @l List<String> preferencesIds, @l RecalculatedConfirmedLot recalculatedConfirmedLot) {
            return new Deal(id2, title, notes, progress, revenue, bookings, selectionHistory, preferences, preferencesUri, preferencesIds, recalculatedConfirmedLot);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deal)) {
                return false;
            }
            Deal deal = (Deal) other;
            return L.f(this.id, deal.id) && L.f(this.title, deal.title) && L.f(this.notes, deal.notes) && L.f(this.progress, deal.progress) && L.f(this.revenue, deal.revenue) && L.f(this.bookings, deal.bookings) && L.f(this.selectionHistory, deal.selectionHistory) && L.f(this.preferences, deal.preferences) && L.f(this.preferencesUri, deal.preferencesUri) && L.f(this.preferencesIds, deal.preferencesIds) && L.f(this.recalculatedConfirmedLot, deal.recalculatedConfirmedLot);
        }

        @l
        public final Bookings getBookings() {
            return this.bookings;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getNotes() {
            return this.notes;
        }

        @l
        public final List<ParameterSlot> getPreferences() {
            return this.preferences;
        }

        @l
        public final List<String> getPreferencesIds() {
            return this.preferencesIds;
        }

        @l
        public final DeepLink getPreferencesUri() {
            return this.preferencesUri;
        }

        @l
        public final Progress getProgress() {
            return this.progress;
        }

        @l
        public final RecalculatedConfirmedLot getRecalculatedConfirmedLot() {
            return this.recalculatedConfirmedLot;
        }

        @l
        public final Revenue getRevenue() {
            return this.revenue;
        }

        @l
        public final SelectionHistory getSelectionHistory() {
            return this.selectionHistory;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            String str = this.notes;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Progress progress = this.progress;
            int iHashCode2 = (iHashCode + (progress == null ? 0 : progress.hashCode())) * 31;
            Revenue revenue = this.revenue;
            int iHashCode3 = (iHashCode2 + (revenue == null ? 0 : revenue.hashCode())) * 31;
            Bookings bookings = this.bookings;
            int iHashCode4 = (iHashCode3 + (bookings == null ? 0 : bookings.hashCode())) * 31;
            SelectionHistory selectionHistory = this.selectionHistory;
            int iHashCode5 = (iHashCode4 + (selectionHistory == null ? 0 : selectionHistory.hashCode())) * 31;
            List<ParameterSlot> list = this.preferences;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            DeepLink deepLink = this.preferencesUri;
            int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            List<String> list2 = this.preferencesIds;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            RecalculatedConfirmedLot recalculatedConfirmedLot = this.recalculatedConfirmedLot;
            return iHashCode8 + (recalculatedConfirmedLot != null ? recalculatedConfirmedLot.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Deal(id=" + this.id + ", title=" + this.title + ", notes=" + this.notes + ", progress=" + this.progress + ", revenue=" + this.revenue + ", bookings=" + this.bookings + ", selectionHistory=" + this.selectionHistory + ", preferences=" + this.preferences + ", preferencesUri=" + this.preferencesUri + ", preferencesIds=" + this.preferencesIds + ", recalculatedConfirmedLot=" + this.recalculatedConfirmedLot + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.notes);
            Progress progress = this.progress;
            if (progress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                progress.writeToParcel(parcel, flags);
            }
            Revenue revenue = this.revenue;
            if (revenue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                revenue.writeToParcel(parcel, flags);
            }
            Bookings bookings = this.bookings;
            if (bookings == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bookings.writeToParcel(parcel, flags);
            }
            SelectionHistory selectionHistory = this.selectionHistory;
            if (selectionHistory == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selectionHistory.writeToParcel(parcel, flags);
            }
            List<ParameterSlot> list = this.preferences;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            parcel.writeParcelable(this.preferencesUri, flags);
            parcel.writeStringList(this.preferencesIds);
            RecalculatedConfirmedLot recalculatedConfirmedLot = this.recalculatedConfirmedLot;
            if (recalculatedConfirmedLot == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                recalculatedConfirmedLot.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: GetDealRoomInfoResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "Landroid/os/Parcelable;", "", "id", "title", ObjectsParameter.TYPE, "updateTime", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/developments_agency_search/domain/GetDealRoomInfoResponse$Selection;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getObjects", "getUpdateTime", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Selection implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Selection> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("image")
        @k
        private final Image image;

        @c("subtitle")
        @k
        private final String objects;

        @c("title")
        @k
        private final String title;

        @c("lastViewedAt")
        @k
        private final String updateTime;

        /* compiled from: GetDealRoomInfoResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Selection> {
            @Override // android.os.Parcelable.Creator
            public final Selection createFromParcel(Parcel parcel) {
                return new Selection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Selection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Selection[] newArray(int i12) {
                return new Selection[i12];
            }
        }

        public Selection(@k String str, @k String str2, @k String str3, @k String str4, @k Image image) {
            this.id = str;
            this.title = str2;
            this.objects = str3;
            this.updateTime = str4;
            this.image = image;
        }

        public static /* synthetic */ Selection copy$default(Selection selection, String str, String str2, String str3, String str4, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = selection.id;
            }
            if ((i12 & 2) != 0) {
                str2 = selection.title;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = selection.objects;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                str4 = selection.updateTime;
            }
            String str7 = str4;
            if ((i12 & 16) != 0) {
                image = selection.image;
            }
            return selection.copy(str, str5, str6, str7, image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getObjects() {
            return this.objects;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getUpdateTime() {
            return this.updateTime;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final Selection copy(@k String id2, @k String title, @k String objects, @k String updateTime, @k Image image) {
            return new Selection(id2, title, objects, updateTime, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) other;
            return L.f(this.id, selection.id) && L.f(this.title, selection.title) && L.f(this.objects, selection.objects) && L.f(this.updateTime, selection.updateTime) && L.f(this.image, selection.image);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @k
        public final String getObjects() {
            return this.objects;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            return this.image.hashCode() + H.d(H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.objects), 31, this.updateTime);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Selection(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", objects=");
            sb2.append(this.objects);
            sb2.append(", updateTime=");
            sb2.append(this.updateTime);
            sb2.append(", image=");
            return AK.c.o(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.objects);
            parcel.writeString(this.updateTime);
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: GetDealRoomInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetDealRoomInfoResponse> {
        @Override // android.os.Parcelable.Creator
        public final GetDealRoomInfoResponse createFromParcel(Parcel parcel) {
            ClientInfo clientInfoCreateFromParcel = ClientInfo.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Deal.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GetDealRoomInfoResponse(clientInfoCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Selection.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GetDealRoomInfoResponse[] newArray(int i12) {
            return new GetDealRoomInfoResponse[i12];
        }
    }

    public GetDealRoomInfoResponse(@k ClientInfo clientInfo, @k List<Deal> list, @l Selection selection) {
        this.client = clientInfo;
        this.deals = list;
        this.selection = selection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDealRoomInfoResponse copy$default(GetDealRoomInfoResponse getDealRoomInfoResponse, ClientInfo clientInfo, List list, Selection selection, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            clientInfo = getDealRoomInfoResponse.client;
        }
        if ((i12 & 2) != 0) {
            list = getDealRoomInfoResponse.deals;
        }
        if ((i12 & 4) != 0) {
            selection = getDealRoomInfoResponse.selection;
        }
        return getDealRoomInfoResponse.copy(clientInfo, list, selection);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ClientInfo getClient() {
        return this.client;
    }

    @k
    public final List<Deal> component2() {
        return this.deals;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Selection getSelection() {
        return this.selection;
    }

    @k
    public final GetDealRoomInfoResponse copy(@k ClientInfo client, @k List<Deal> deals, @l Selection selection) {
        return new GetDealRoomInfoResponse(client, deals, selection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDealRoomInfoResponse)) {
            return false;
        }
        GetDealRoomInfoResponse getDealRoomInfoResponse = (GetDealRoomInfoResponse) other;
        return L.f(this.client, getDealRoomInfoResponse.client) && L.f(this.deals, getDealRoomInfoResponse.deals) && L.f(this.selection, getDealRoomInfoResponse.selection);
    }

    @k
    public final ClientInfo getClient() {
        return this.client;
    }

    @k
    public final List<Deal> getDeals() {
        return this.deals;
    }

    @l
    public final Selection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        int iE2 = H.e(this.client.hashCode() * 31, 31, this.deals);
        Selection selection = this.selection;
        return iE2 + (selection == null ? 0 : selection.hashCode());
    }

    @k
    public String toString() {
        return "GetDealRoomInfoResponse(client=" + this.client + ", deals=" + this.deals + ", selection=" + this.selection + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.client.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.deals, parcel);
        while (itJ.hasNext()) {
            ((Deal) itJ.next()).writeToParcel(parcel, flags);
        }
        Selection selection = this.selection;
        if (selection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selection.writeToParcel(parcel, flags);
        }
    }
}
