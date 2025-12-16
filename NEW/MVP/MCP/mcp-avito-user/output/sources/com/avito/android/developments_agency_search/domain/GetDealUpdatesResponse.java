package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GetDealUpdatesResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal;", "updates", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getUpdates", "Client", "UpdatedDeal", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetDealUpdatesResponse implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetDealUpdatesResponse> CREATOR = new a();

    @c("updates")
    @k
    private final List<UpdatedDeal> updates;

    /* compiled from: GetDealUpdatesResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;", "Landroid/os/Parcelable;", "", "id", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Client implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<Client> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("name")
        @k
        private final String name;

        /* compiled from: GetDealUpdatesResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Client> {
            @Override // android.os.Parcelable.Creator
            public final Client createFromParcel(Parcel parcel) {
                return new Client(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Client[] newArray(int i12) {
                return new Client[i12];
            }
        }

        public Client(@k String str, @k String str2) {
            this.id = str;
            this.name = str2;
        }

        public static /* synthetic */ Client copy$default(Client client, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = client.id;
            }
            if ((i12 & 2) != 0) {
                str2 = client.name;
            }
            return client.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final Client copy(@k String id2, @k String name) {
            return new Client(id2, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Client)) {
                return false;
            }
            Client client = (Client) other;
            return L.f(this.id, client.id) && L.f(this.name, client.name);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Client(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: GetDealUpdatesResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0014J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b<\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b=\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b>\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal;", "Landroid/os/Parcelable;", "", "id", "", "dealId", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;", "type", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;", "status", "Lcom/avito/android/remote/model/Image;", "image", "title", "subtitle", "text", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;", "client", "<init>", "(ILjava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;", "component4", "()Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "component7", "component8", "component9", "()Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;", "copy", "(ILjava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;)Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getDealId", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;", "getType", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;", "getStatus", "Lcom/avito/android/remote/model/Image;", "getImage", "getTitle", "getSubtitle", "getText", "Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$Client;", "getClient", "Status", "Type", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class UpdatedDeal implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<UpdatedDeal> CREATOR = new a();

        @c("client")
        @k
        private final Client client;

        @c("dealId")
        @k
        private final String dealId;

        @c("id")
        private final int id;

        @c("image")
        @k
        private final Image image;

        @c("status")
        @k
        private final Status status;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("text")
        @l
        private final String text;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetDealUpdatesResponse.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Status;", "", "(Ljava/lang/String;I)V", "CONFIRMED", "EXPIRING", "REJECTED", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            @c("confirmed")
            public static final Status CONFIRMED;

            @c("expiring")
            public static final Status EXPIRING;

            @c("rejected")
            public static final Status REJECTED;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Status[] f136520b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f136521c;

            static {
                Status status = new Status("CONFIRMED", 0);
                CONFIRMED = status;
                Status status2 = new Status("EXPIRING", 1);
                EXPIRING = status2;
                Status status3 = new Status("REJECTED", 2);
                REJECTED = status3;
                Status[] statusArr = {status, status2, status3};
                f136520b = statusArr;
                f136521c = kotlin.enums.c.a(statusArr);
            }

            private Status(String str, int i12) {
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f136520b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetDealUpdatesResponse.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetDealUpdatesResponse$UpdatedDeal$Type;", "", "(Ljava/lang/String;I)V", "BINDING", "BOOKING", "DEAL", "REVENUE", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("binding")
            public static final Type BINDING;

            @c("booking")
            public static final Type BOOKING;

            @c("deal")
            public static final Type DEAL;

            @c("revenue")
            public static final Type REVENUE;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f136522b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f136523c;

            static {
                Type type = new Type("BINDING", 0);
                BINDING = type;
                Type type2 = new Type("BOOKING", 1);
                BOOKING = type2;
                Type type3 = new Type("DEAL", 2);
                DEAL = type3;
                Type type4 = new Type("REVENUE", 3);
                REVENUE = type4;
                Type[] typeArr = {type, type2, type3, type4};
                f136522b = typeArr;
                f136523c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f136522b.clone();
            }
        }

        /* compiled from: GetDealUpdatesResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdatedDeal> {
            @Override // android.os.Parcelable.Creator
            public final UpdatedDeal createFromParcel(Parcel parcel) {
                return new UpdatedDeal(parcel.readInt(), parcel.readString(), Type.valueOf(parcel.readString()), Status.valueOf(parcel.readString()), (Image) parcel.readParcelable(UpdatedDeal.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), Client.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final UpdatedDeal[] newArray(int i12) {
                return new UpdatedDeal[i12];
            }
        }

        public UpdatedDeal(int i12, @k String str, @k Type type, @k Status status, @k Image image, @k String str2, @k String str3, @l String str4, @k Client client) {
            this.id = i12;
            this.dealId = str;
            this.type = type;
            this.status = status;
            this.image = image;
            this.title = str2;
            this.subtitle = str3;
            this.text = str4;
            this.client = client;
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDealId() {
            return this.dealId;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final Client getClient() {
            return this.client;
        }

        @k
        public final UpdatedDeal copy(int id2, @k String dealId, @k Type type, @k Status status, @k Image image, @k String title, @k String subtitle, @l String text, @k Client client) {
            return new UpdatedDeal(id2, dealId, type, status, image, title, subtitle, text, client);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedDeal)) {
                return false;
            }
            UpdatedDeal updatedDeal = (UpdatedDeal) other;
            return this.id == updatedDeal.id && L.f(this.dealId, updatedDeal.dealId) && this.type == updatedDeal.type && this.status == updatedDeal.status && L.f(this.image, updatedDeal.image) && L.f(this.title, updatedDeal.title) && L.f(this.subtitle, updatedDeal.subtitle) && L.f(this.text, updatedDeal.text) && L.f(this.client, updatedDeal.client);
        }

        @k
        public final Client getClient() {
            return this.client;
        }

        @k
        public final String getDealId() {
            return this.dealId;
        }

        public final int getId() {
            return this.id;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @k
        public final Status getStatus() {
            return this.status;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.g(this.image, (this.status.hashCode() + ((this.type.hashCode() + H.d(Integer.hashCode(this.id) * 31, 31, this.dealId)) * 31)) * 31, 31), 31, this.title), 31, this.subtitle);
            String str = this.text;
            return this.client.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public String toString() {
            return "UpdatedDeal(id=" + this.id + ", dealId=" + this.dealId + ", type=" + this.type + ", status=" + this.status + ", image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", text=" + this.text + ", client=" + this.client + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            parcel.writeString(this.dealId);
            parcel.writeString(this.type.name());
            parcel.writeString(this.status.name());
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.text);
            this.client.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: GetDealUpdatesResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetDealUpdatesResponse> {
        @Override // android.os.Parcelable.Creator
        public final GetDealUpdatesResponse createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UpdatedDeal.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GetDealUpdatesResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GetDealUpdatesResponse[] newArray(int i12) {
            return new GetDealUpdatesResponse[i12];
        }
    }

    public GetDealUpdatesResponse(@k List<UpdatedDeal> list) {
        this.updates = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDealUpdatesResponse copy$default(GetDealUpdatesResponse getDealUpdatesResponse, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getDealUpdatesResponse.updates;
        }
        return getDealUpdatesResponse.copy(list);
    }

    @k
    public final List<UpdatedDeal> component1() {
        return this.updates;
    }

    @k
    public final GetDealUpdatesResponse copy(@k List<UpdatedDeal> updates) {
        return new GetDealUpdatesResponse(updates);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetDealUpdatesResponse) && L.f(this.updates, ((GetDealUpdatesResponse) other).updates);
    }

    @k
    public final List<UpdatedDeal> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return this.updates.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("GetDealUpdatesResponse(updates="), this.updates, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.updates, parcel);
        while (itJ.hasNext()) {
            ((UpdatedDeal) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
