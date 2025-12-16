package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J`\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b1\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010\u0018¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/CollectionInfo;", "Landroid/os/Parcelable;", "", "isOwner", "", "name", "subtitle", "description", "Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;", "moderationStatus", "likesCount", "isLiked", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/CollectionInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getName", "getSubtitle", "getDescription", "Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;", "getModerationStatus", "getLikesCount", "Ljava/lang/Boolean;", "ModerationStatusInfo", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CollectionInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CollectionInfo> CREATOR = new Creator();

    @c("description")
    @l
    private final String description;

    @c("isFavorite")
    @l
    private final Boolean isLiked;

    @c("isOwner")
    private final boolean isOwner;

    @c("counterAddToFavorites")
    @l
    private final String likesCount;

    @c("badge")
    @l
    private final ModerationStatusInfo moderationStatus;

    @c("name")
    @k
    private final String name;

    @c("subtitle")
    @l
    private final String subtitle;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectionInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CollectionInfo createFromParcel(@k Parcel parcel) {
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = null;
            ModerationStatusInfo moderationStatusInfoCreateFromParcel = parcel.readInt() == 0 ? null : ModerationStatusInfo.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CollectionInfo(z12, string, string2, string3, moderationStatusInfoCreateFromParcel, string4, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CollectionInfo[] newArray(int i12) {
            return new CollectionInfo[i12];
        }
    }

    /* compiled from: FavoriteItemsWidgets.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;", "Landroid/os/Parcelable;", "", "text", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/CollectionInfo$ModerationStatusInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getColor", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationStatusInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ModerationStatusInfo> CREATOR = new Creator();

        @c("color")
        @k
        private final String color;

        @c("text")
        @k
        private final String text;

        /* compiled from: FavoriteItemsWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ModerationStatusInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ModerationStatusInfo createFromParcel(@k Parcel parcel) {
                return new ModerationStatusInfo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ModerationStatusInfo[] newArray(int i12) {
                return new ModerationStatusInfo[i12];
            }
        }

        public ModerationStatusInfo(@k String str, @k String str2) {
            this.text = str;
            this.color = str2;
        }

        public static /* synthetic */ ModerationStatusInfo copy$default(ModerationStatusInfo moderationStatusInfo, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = moderationStatusInfo.text;
            }
            if ((i12 & 2) != 0) {
                str2 = moderationStatusInfo.color;
            }
            return moderationStatusInfo.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final ModerationStatusInfo copy(@k String text, @k String color) {
            return new ModerationStatusInfo(text, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModerationStatusInfo)) {
                return false;
            }
            ModerationStatusInfo moderationStatusInfo = (ModerationStatusInfo) other;
            return L.f(this.text, moderationStatusInfo.text) && L.f(this.color, moderationStatusInfo.color);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationStatusInfo(text=");
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

    public CollectionInfo(boolean z12, @k String str, @l String str2, @l String str3, @l ModerationStatusInfo moderationStatusInfo, @l String str4, @l Boolean bool) {
        this.isOwner = z12;
        this.name = str;
        this.subtitle = str2;
        this.description = str3;
        this.moderationStatus = moderationStatusInfo;
        this.likesCount = str4;
        this.isLiked = bool;
    }

    public static /* synthetic */ CollectionInfo copy$default(CollectionInfo collectionInfo, boolean z12, String str, String str2, String str3, ModerationStatusInfo moderationStatusInfo, String str4, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = collectionInfo.isOwner;
        }
        if ((i12 & 2) != 0) {
            str = collectionInfo.name;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = collectionInfo.subtitle;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            str3 = collectionInfo.description;
        }
        String str7 = str3;
        if ((i12 & 16) != 0) {
            moderationStatusInfo = collectionInfo.moderationStatus;
        }
        ModerationStatusInfo moderationStatusInfo2 = moderationStatusInfo;
        if ((i12 & 32) != 0) {
            str4 = collectionInfo.likesCount;
        }
        String str8 = str4;
        if ((i12 & 64) != 0) {
            bool = collectionInfo.isLiked;
        }
        return collectionInfo.copy(z12, str5, str6, str7, moderationStatusInfo2, str8, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOwner() {
        return this.isOwner;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ModerationStatusInfo getModerationStatus() {
        return this.moderationStatus;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getLikesCount() {
        return this.likesCount;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsLiked() {
        return this.isLiked;
    }

    @k
    public final CollectionInfo copy(boolean isOwner, @k String name, @l String subtitle, @l String description, @l ModerationStatusInfo moderationStatus, @l String likesCount, @l Boolean isLiked) {
        return new CollectionInfo(isOwner, name, subtitle, description, moderationStatus, likesCount, isLiked);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionInfo)) {
            return false;
        }
        CollectionInfo collectionInfo = (CollectionInfo) other;
        return this.isOwner == collectionInfo.isOwner && L.f(this.name, collectionInfo.name) && L.f(this.subtitle, collectionInfo.subtitle) && L.f(this.description, collectionInfo.description) && L.f(this.moderationStatus, collectionInfo.moderationStatus) && L.f(this.likesCount, collectionInfo.likesCount) && L.f(this.isLiked, collectionInfo.isLiked);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getLikesCount() {
        return this.likesCount;
    }

    @l
    public final ModerationStatusInfo getModerationStatus() {
        return this.moderationStatus;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iD2 = H.d(Boolean.hashCode(this.isOwner) * 31, 31, this.name);
        String str = this.subtitle;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModerationStatusInfo moderationStatusInfo = this.moderationStatus;
        int iHashCode3 = (iHashCode2 + (moderationStatusInfo == null ? 0 : moderationStatusInfo.hashCode())) * 31;
        String str3 = this.likesCount;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isLiked;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isLiked() {
        return this.isLiked;
    }

    public final boolean isOwner() {
        return this.isOwner;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(isOwner=");
        sb2.append(this.isOwner);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", moderationStatus=");
        sb2.append(this.moderationStatus);
        sb2.append(", likesCount=");
        sb2.append(this.likesCount);
        sb2.append(", isLiked=");
        return C0.g(sb2, this.isLiked, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isOwner ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.description);
        ModerationStatusInfo moderationStatusInfo = this.moderationStatus;
        if (moderationStatusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moderationStatusInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.likesCount);
        Boolean bool = this.isLiked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
