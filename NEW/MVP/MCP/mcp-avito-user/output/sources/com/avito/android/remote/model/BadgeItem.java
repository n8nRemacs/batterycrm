package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/BadgeItem;", "Landroid/os/Parcelable;", "", "icon", "Lcom/avito/android/remote/model/BadgeItemSize;", "size", "title", "Lcom/avito/android/remote/model/BadgeItemHint;", "hint", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/BadgeItemSize;Ljava/lang/String;Lcom/avito/android/remote/model/BadgeItemHint;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/BadgeItemSize;", "component3", "component4", "()Lcom/avito/android/remote/model/BadgeItemHint;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/BadgeItemSize;Ljava/lang/String;Lcom/avito/android/remote/model/BadgeItemHint;)Lcom/avito/android/remote/model/BadgeItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIcon", "Lcom/avito/android/remote/model/BadgeItemSize;", "getSize", "getTitle", "Lcom/avito/android/remote/model/BadgeItemHint;", "getHint", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BadgeItem implements Parcelable {

    @k
    public static final Parcelable.Creator<BadgeItem> CREATOR = new Creator();

    @c("hint")
    @l
    private final BadgeItemHint hint;

    @c("icon")
    @l
    private final String icon;

    @c("size")
    @l
    private final BadgeItemSize size;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BadgeItem createFromParcel(@k Parcel parcel) {
            return new BadgeItem(parcel.readString(), parcel.readInt() == 0 ? null : BadgeItemSize.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? BadgeItemHint.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BadgeItem[] newArray(int i12) {
            return new BadgeItem[i12];
        }
    }

    public BadgeItem(@l String str, @l BadgeItemSize badgeItemSize, @l String str2, @l BadgeItemHint badgeItemHint) {
        this.icon = str;
        this.size = badgeItemSize;
        this.title = str2;
        this.hint = badgeItemHint;
    }

    public static /* synthetic */ BadgeItem copy$default(BadgeItem badgeItem, String str, BadgeItemSize badgeItemSize, String str2, BadgeItemHint badgeItemHint, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = badgeItem.icon;
        }
        if ((i12 & 2) != 0) {
            badgeItemSize = badgeItem.size;
        }
        if ((i12 & 4) != 0) {
            str2 = badgeItem.title;
        }
        if ((i12 & 8) != 0) {
            badgeItemHint = badgeItem.hint;
        }
        return badgeItem.copy(str, badgeItemSize, str2, badgeItemHint);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BadgeItemSize getSize() {
        return this.size;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BadgeItemHint getHint() {
        return this.hint;
    }

    @k
    public final BadgeItem copy(@l String icon, @l BadgeItemSize size, @l String title, @l BadgeItemHint hint) {
        return new BadgeItem(icon, size, title, hint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeItem)) {
            return false;
        }
        BadgeItem badgeItem = (BadgeItem) other;
        return L.f(this.icon, badgeItem.icon) && this.size == badgeItem.size && L.f(this.title, badgeItem.title) && L.f(this.hint, badgeItem.hint);
    }

    @l
    public final BadgeItemHint getHint() {
        return this.hint;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final BadgeItemSize getSize() {
        return this.size;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BadgeItemSize badgeItemSize = this.size;
        int iHashCode2 = (iHashCode + (badgeItemSize == null ? 0 : badgeItemSize.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeItemHint badgeItemHint = this.hint;
        return iHashCode3 + (badgeItemHint != null ? badgeItemHint.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BadgeItem(icon=" + this.icon + ", size=" + this.size + ", title=" + this.title + ", hint=" + this.hint + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.icon);
        BadgeItemSize badgeItemSize = this.size;
        if (badgeItemSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeItemSize.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        BadgeItemHint badgeItemHint = this.hint;
        if (badgeItemHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeItemHint.writeToParcel(parcel, flags);
        }
    }
}
