package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/ItemValueStats;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "icon", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ItemValueStats implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemValueStats> CREATOR = new a();

    @c("icon")
    @l
    private final Image icon;

    @c("id")
    @l
    private final String id;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: ConfigStatsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemValueStats> {
        @Override // android.os.Parcelable.Creator
        public final ItemValueStats createFromParcel(Parcel parcel) {
            return new ItemValueStats((Image) parcel.readParcelable(ItemValueStats.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ItemValueStats.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ItemValueStats[] newArray(int i12) {
            return new ItemValueStats[i12];
        }
    }

    public ItemValueStats(@l Image image, @l String str, @l AttributedText attributedText) {
        this.icon = image;
        this.id = str;
        this.title = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemValueStats)) {
            return false;
        }
        ItemValueStats itemValueStats = (ItemValueStats) obj;
        return L.f(this.icon, itemValueStats.icon) && L.f(this.id, itemValueStats.id) && L.f(this.title, itemValueStats.title);
    }

    @l
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        Image image = this.icon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.title;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemValueStats(icon=");
        sb2.append(this.icon);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, i12);
    }
}
