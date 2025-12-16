package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertNavBar.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/AdvertCardNavBarContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertCardNavBarContentType;", "type", "", "title", "Lcom/avito/android/remote/model/AdvertLastPriceChange;", "lastPriceChange", "subtitle", "<init>", "(Lcom/avito/android/remote/model/AdvertCardNavBarContentType;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertLastPriceChange;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/AdvertCardNavBarContentType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/AdvertLastPriceChange;", "component4", "copy", "(Lcom/avito/android/remote/model/AdvertCardNavBarContentType;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertLastPriceChange;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertCardNavBarContent;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertCardNavBarContentType;", "getType", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/AdvertLastPriceChange;", "getLastPriceChange", "getSubtitle", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertCardNavBarContent implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCardNavBarContent> CREATOR = new Creator();

    @c("lastPriceChange")
    @l
    private final AdvertLastPriceChange lastPriceChange;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final AdvertCardNavBarContentType type;

    /* compiled from: AdvertNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCardNavBarContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCardNavBarContent createFromParcel(@k Parcel parcel) {
            return new AdvertCardNavBarContent(parcel.readInt() == 0 ? null : AdvertCardNavBarContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? AdvertLastPriceChange.valueOf(parcel.readString()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCardNavBarContent[] newArray(int i12) {
            return new AdvertCardNavBarContent[i12];
        }
    }

    public AdvertCardNavBarContent(@l AdvertCardNavBarContentType advertCardNavBarContentType, @l String str, @l AdvertLastPriceChange advertLastPriceChange, @l String str2) {
        this.type = advertCardNavBarContentType;
        this.title = str;
        this.lastPriceChange = advertLastPriceChange;
        this.subtitle = str2;
    }

    public static /* synthetic */ AdvertCardNavBarContent copy$default(AdvertCardNavBarContent advertCardNavBarContent, AdvertCardNavBarContentType advertCardNavBarContentType, String str, AdvertLastPriceChange advertLastPriceChange, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            advertCardNavBarContentType = advertCardNavBarContent.type;
        }
        if ((i12 & 2) != 0) {
            str = advertCardNavBarContent.title;
        }
        if ((i12 & 4) != 0) {
            advertLastPriceChange = advertCardNavBarContent.lastPriceChange;
        }
        if ((i12 & 8) != 0) {
            str2 = advertCardNavBarContent.subtitle;
        }
        return advertCardNavBarContent.copy(advertCardNavBarContentType, str, advertLastPriceChange, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AdvertCardNavBarContentType getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AdvertLastPriceChange getLastPriceChange() {
        return this.lastPriceChange;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AdvertCardNavBarContent copy(@l AdvertCardNavBarContentType type, @l String title, @l AdvertLastPriceChange lastPriceChange, @l String subtitle) {
        return new AdvertCardNavBarContent(type, title, lastPriceChange, subtitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertCardNavBarContent)) {
            return false;
        }
        AdvertCardNavBarContent advertCardNavBarContent = (AdvertCardNavBarContent) other;
        return this.type == advertCardNavBarContent.type && L.f(this.title, advertCardNavBarContent.title) && this.lastPriceChange == advertCardNavBarContent.lastPriceChange && L.f(this.subtitle, advertCardNavBarContent.subtitle);
    }

    @l
    public final AdvertLastPriceChange getLastPriceChange() {
        return this.lastPriceChange;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final AdvertCardNavBarContentType getType() {
        return this.type;
    }

    public int hashCode() {
        AdvertCardNavBarContentType advertCardNavBarContentType = this.type;
        int iHashCode = (advertCardNavBarContentType == null ? 0 : advertCardNavBarContentType.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdvertLastPriceChange advertLastPriceChange = this.lastPriceChange;
        int iHashCode3 = (iHashCode2 + (advertLastPriceChange == null ? 0 : advertLastPriceChange.hashCode())) * 31;
        String str2 = this.subtitle;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCardNavBarContent(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", lastPriceChange=");
        sb2.append(this.lastPriceChange);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AdvertCardNavBarContentType advertCardNavBarContentType = this.type;
        if (advertCardNavBarContentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertCardNavBarContentType.name());
        }
        parcel.writeString(this.title);
        AdvertLastPriceChange advertLastPriceChange = this.lastPriceChange;
        if (advertLastPriceChange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertLastPriceChange.name());
        }
        parcel.writeString(this.subtitle);
    }
}
