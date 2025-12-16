package com.avito.android.feed_shortcuts.element;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedShortcut.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/feed_shortcuts/element/FeedShortcut;", "Landroid/os/Parcelable;", "Lcom/avito/android/feed_shortcuts/element/ShortcutAction;", "action", "", "title", "subtitle", "", "microCategoryId", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/feed_shortcuts/element/ShortcutAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/feed_shortcuts/element/ShortcutAction;", "c", "()Lcom/avito/android/feed_shortcuts/element/ShortcutAction;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/lang/Integer;", "getMicroCategoryId", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_bx-content_widget_feed-shortcuts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedShortcut implements Parcelable {

    @k
    public static final Parcelable.Creator<FeedShortcut> CREATOR = new a();

    @com.google.gson.annotations.c("action")
    @l
    private final ShortcutAction action;

    @com.google.gson.annotations.c("image")
    @l
    private final UniversalImage image;

    @com.google.gson.annotations.c("mcid")
    @l
    private final Integer microCategoryId;

    @com.google.gson.annotations.c("description")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: FeedShortcut.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeedShortcut> {
        @Override // android.os.Parcelable.Creator
        public final FeedShortcut createFromParcel(Parcel parcel) {
            return new FeedShortcut(parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalImage) parcel.readParcelable(FeedShortcut.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeedShortcut[] newArray(int i12) {
            return new FeedShortcut[i12];
        }
    }

    public FeedShortcut(@l ShortcutAction shortcutAction, @l String str, @l String str2, @l Integer num, @l UniversalImage universalImage) {
        this.action = shortcutAction;
        this.title = str;
        this.subtitle = str2;
        this.microCategoryId = num;
        this.image = universalImage;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ShortcutAction getAction() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedShortcut)) {
            return false;
        }
        FeedShortcut feedShortcut = (FeedShortcut) obj;
        return L.f(this.action, feedShortcut.action) && L.f(this.title, feedShortcut.title) && L.f(this.subtitle, feedShortcut.subtitle) && L.f(this.microCategoryId, feedShortcut.microCategoryId) && L.f(this.image, feedShortcut.image);
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final Integer getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        ShortcutAction shortcutAction = this.action;
        int iHashCode = (shortcutAction == null ? 0 : shortcutAction.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.microCategoryId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return iHashCode4 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedShortcut(action=");
        sb2.append(this.action);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", microCategoryId=");
        sb2.append(this.microCategoryId);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ShortcutAction shortcutAction = this.action;
        if (shortcutAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortcutAction.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Integer num = this.microCategoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.image, i12);
    }
}
