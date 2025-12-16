package com.avito.android.remote.model.price_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.price_list.PriceList;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertPriceListPreviewResponse.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00012BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0016¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;", "Landroid/os/Parcelable;", "", "title", "buttonTitle", "", "Lcom/avito/android/remote/model/price_list/PriceList$Value;", "values", "Lcom/avito/android/remote/model/price_list/PriceList;", "priceList", "Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;", "buttonClickedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/price_list/PriceList;Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/price_list/PriceList;", "component5", "()Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/price_list/PriceList;Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;)Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getButtonTitle", "Ljava/util/List;", "getValues", "Lcom/avito/android/remote/model/price_list/PriceList;", "getPriceList", "Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;", "getButtonClickedEvent", "Event", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertPriceListPreviewResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertPriceListPreviewResponse> CREATOR = new Creator();

    @c("event")
    @l
    private final Event buttonClickedEvent;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("priceList")
    @l
    private final PriceList priceList;

    @c("title")
    @l
    private final String title;

    @c("values")
    @l
    private final List<PriceList.Value> values;

    /* compiled from: AdvertPriceListPreviewResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertPriceListPreviewResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPriceListPreviewResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(PriceList.Value.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertPriceListPreviewResponse(string, string2, arrayList, parcel.readInt() == 0 ? null : PriceList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Event.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPriceListPreviewResponse[] newArray(int i12) {
            return new AdvertPriceListPreviewResponse[i12];
        }
    }

    /* compiled from: AdvertPriceListPreviewResponse.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;", "Landroid/os/Parcelable;", "", "id", "version", "", "uid", "mcid", "iid", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/price_list/AdvertPriceListPreviewResponse$Event;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/lang/String;", "getUid", "getMcid", "getIid", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Event implements Parcelable {

        @k
        public static final Parcelable.Creator<Event> CREATOR = new Creator();

        @c("id")
        private final int id;

        @c("iid")
        @l
        private final String iid;

        @c("mcid")
        @l
        private final String mcid;

        @c("uid")
        @l
        private final String uid;

        @c("version")
        private final int version;

        /* compiled from: AdvertPriceListPreviewResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Event> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Event createFromParcel(@k Parcel parcel) {
                return new Event(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Event[] newArray(int i12) {
                return new Event[i12];
            }
        }

        public Event(int i12, int i13, @l String str, @l String str2, @l String str3) {
            this.id = i12;
            this.version = i13;
            this.uid = str;
            this.mcid = str2;
            this.iid = str3;
        }

        public static /* synthetic */ Event copy$default(Event event, int i12, int i13, String str, String str2, String str3, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = event.id;
            }
            if ((i14 & 2) != 0) {
                i13 = event.version;
            }
            int i15 = i13;
            if ((i14 & 4) != 0) {
                str = event.uid;
            }
            String str4 = str;
            if ((i14 & 8) != 0) {
                str2 = event.mcid;
            }
            String str5 = str2;
            if ((i14 & 16) != 0) {
                str3 = event.iid;
            }
            return event.copy(i12, i15, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getUid() {
            return this.uid;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getMcid() {
            return this.mcid;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getIid() {
            return this.iid;
        }

        @k
        public final Event copy(int id2, int version, @l String uid, @l String mcid, @l String iid) {
            return new Event(id2, version, uid, mcid, iid);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return this.id == event.id && this.version == event.version && L.f(this.uid, event.uid) && L.f(this.mcid, event.mcid) && L.f(this.iid, event.iid);
        }

        public final int getId() {
            return this.id;
        }

        @l
        public final String getIid() {
            return this.iid;
        }

        @l
        public final String getMcid() {
            return this.mcid;
        }

        @l
        public final String getUid() {
            return this.uid;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
            String str = this.uid;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mcid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iid;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Event(id=");
            sb2.append(this.id);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", uid=");
            sb2.append(this.uid);
            sb2.append(", mcid=");
            sb2.append(this.mcid);
            sb2.append(", iid=");
            return C22026a.c(sb2, this.iid, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.id);
            parcel.writeInt(this.version);
            parcel.writeString(this.uid);
            parcel.writeString(this.mcid);
            parcel.writeString(this.iid);
        }
    }

    public AdvertPriceListPreviewResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AdvertPriceListPreviewResponse copy$default(AdvertPriceListPreviewResponse advertPriceListPreviewResponse, String str, String str2, List list, PriceList priceList, Event event, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertPriceListPreviewResponse.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertPriceListPreviewResponse.buttonTitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            list = advertPriceListPreviewResponse.values;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            priceList = advertPriceListPreviewResponse.priceList;
        }
        PriceList priceList2 = priceList;
        if ((i12 & 16) != 0) {
            event = advertPriceListPreviewResponse.buttonClickedEvent;
        }
        return advertPriceListPreviewResponse.copy(str, str3, list2, priceList2, event);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final List<PriceList.Value> component3() {
        return this.values;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final PriceList getPriceList() {
        return this.priceList;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Event getButtonClickedEvent() {
        return this.buttonClickedEvent;
    }

    @k
    public final AdvertPriceListPreviewResponse copy(@l String title, @l String buttonTitle, @l List<PriceList.Value> values, @l PriceList priceList, @l Event buttonClickedEvent) {
        return new AdvertPriceListPreviewResponse(title, buttonTitle, values, priceList, buttonClickedEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertPriceListPreviewResponse)) {
            return false;
        }
        AdvertPriceListPreviewResponse advertPriceListPreviewResponse = (AdvertPriceListPreviewResponse) other;
        return L.f(this.title, advertPriceListPreviewResponse.title) && L.f(this.buttonTitle, advertPriceListPreviewResponse.buttonTitle) && L.f(this.values, advertPriceListPreviewResponse.values) && L.f(this.priceList, advertPriceListPreviewResponse.priceList) && L.f(this.buttonClickedEvent, advertPriceListPreviewResponse.buttonClickedEvent);
    }

    @l
    public final Event getButtonClickedEvent() {
        return this.buttonClickedEvent;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final PriceList getPriceList() {
        return this.priceList;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<PriceList.Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PriceList.Value> list = this.values;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PriceList priceList = this.priceList;
        int iHashCode4 = (iHashCode3 + (priceList == null ? 0 : priceList.hashCode())) * 31;
        Event event = this.buttonClickedEvent;
        return iHashCode4 + (event != null ? event.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertPriceListPreviewResponse(title=" + this.title + ", buttonTitle=" + this.buttonTitle + ", values=" + this.values + ", priceList=" + this.priceList + ", buttonClickedEvent=" + this.buttonClickedEvent + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.buttonTitle);
        List<PriceList.Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PriceList.Value) itA.next()).writeToParcel(parcel, flags);
            }
        }
        PriceList priceList = this.priceList;
        if (priceList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceList.writeToParcel(parcel, flags);
        }
        Event event = this.buttonClickedEvent;
        if (event == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            event.writeToParcel(parcel, flags);
        }
    }

    public AdvertPriceListPreviewResponse(@l String str, @l String str2, @l List<PriceList.Value> list, @l PriceList priceList, @l Event event) {
        this.title = str;
        this.buttonTitle = str2;
        this.values = list;
        this.priceList = priceList;
        this.buttonClickedEvent = event;
    }

    public /* synthetic */ AdvertPriceListPreviewResponse(String str, String str2, List list, PriceList priceList, Event event, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : list, (i12 & 8) != 0 ? null : priceList, (i12 & 16) != 0 ? null : event);
    }
}
