package com.avito.android.remote.model.location_notification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationNotification.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001&BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R(\u0010\u001e\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/location_notification/LocationNotification;", "Lcom/avito/android/remote/model/SerpElement;", "", "title", "confirmText", "changeText", "Lcom/avito/android/remote/model/location_notification/LocationNotification$TooltipType;", "tooltipType", "geoSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/location_notification/LocationNotification$TooltipType;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getConfirmText", "getChangeText", "Lcom/avito/android/remote/model/location_notification/LocationNotification$TooltipType;", "getTooltipType", "()Lcom/avito/android/remote/model/location_notification/LocationNotification$TooltipType;", "getGeoSessionId", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "TooltipType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LocationNotification implements SerpElement {

    @k
    public static final Parcelable.Creator<LocationNotification> CREATOR = new Creator();

    @c("laasChangeButtonTitle")
    @l
    private final String changeText;

    @c("laasConfirmButtonTitle")
    @l
    private final String confirmText;

    @c("laasGeoSessionId")
    @l
    private final String geoSessionId;

    @c("laasTitle")
    @l
    private final String title;

    @c("laasTooltipType")
    @l
    private final TooltipType tooltipType;
    private long uniqueId;

    /* compiled from: LocationNotification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationNotification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocationNotification createFromParcel(@k Parcel parcel) {
            return new LocationNotification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TooltipType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocationNotification[] newArray(int i12) {
            return new LocationNotification[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationNotification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/location_notification/LocationNotification$TooltipType;", "", "(Ljava/lang/String;I)V", "CHANGE", "REGULAR", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TooltipType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TooltipType[] $VALUES;

        @c("change")
        public static final TooltipType CHANGE = new TooltipType("CHANGE", 0);

        @c(FontStyleKt.REGULAR)
        public static final TooltipType REGULAR = new TooltipType("REGULAR", 1);

        private static final /* synthetic */ TooltipType[] $values() {
            return new TooltipType[]{CHANGE, REGULAR};
        }

        static {
            TooltipType[] tooltipTypeArr$values = $values();
            $VALUES = tooltipTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(tooltipTypeArr$values);
        }

        private TooltipType(String str, int i12) {
        }

        @k
        public static a<TooltipType> getEntries() {
            return $ENTRIES;
        }

        public static TooltipType valueOf(String str) {
            return (TooltipType) Enum.valueOf(TooltipType.class, str);
        }

        public static TooltipType[] values() {
            return (TooltipType[]) $VALUES.clone();
        }
    }

    public LocationNotification() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getChangeText() {
        return this.changeText;
    }

    @l
    public final String getConfirmText() {
        return this.confirmText;
    }

    @l
    public final String getGeoSessionId() {
        return this.geoSessionId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final TooltipType getTooltipType() {
        return this.tooltipType;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF105229b() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.confirmText);
        parcel.writeString(this.changeText);
        TooltipType tooltipType = this.tooltipType;
        if (tooltipType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tooltipType.name());
        }
        parcel.writeString(this.geoSessionId);
    }

    public LocationNotification(@l String str, @l String str2, @l String str3, @l TooltipType tooltipType, @l String str4) {
        this.title = str;
        this.confirmText = str2;
        this.changeText = str3;
        this.tooltipType = tooltipType;
        this.geoSessionId = str4;
    }

    public /* synthetic */ LocationNotification(String str, String str2, String str3, TooltipType tooltipType, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? TooltipType.REGULAR : tooltipType, (i12 & 16) != 0 ? "" : str4);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
