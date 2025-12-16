package com.avito.android.remote.model.messenger.attach_menu;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AttachMenu.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020)HÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020)HÖ\u0001¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010#¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "file", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "image", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "video", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "item", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "location", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", AttachMenuItem.Replies.KEY, "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "voice", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", AttachMenuItem.Support.KEY, "<init>", "(Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;)V", "component1", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "component2", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "component3", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "component4", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "component5", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "component6", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", "component7", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "component8", "()Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", "copy", "(Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;)Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$File;", "getFile", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Image;", "getImage", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Video;", "getVideo", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Item;", "getItem", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Location;", "getLocation", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Replies;", "getReplies", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Voice;", "getVoice", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenuItem$Support;", "getSupport", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AttachMenu implements Parcelable {

    @k
    public static final Parcelable.Creator<AttachMenu> CREATOR = new Creator();

    @l
    private final AttachMenuItem.File file;

    @l
    private final AttachMenuItem.Image image;

    @l
    private final AttachMenuItem.Item item;

    @l
    private final AttachMenuItem.Location location;

    @l
    private final AttachMenuItem.Replies replies;

    @l
    private final AttachMenuItem.Support support;

    @l
    private final AttachMenuItem.Video video;

    @l
    private final AttachMenuItem.Voice voice;

    /* compiled from: AttachMenu.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttachMenu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttachMenu createFromParcel(@k Parcel parcel) {
            return new AttachMenu(parcel.readInt() == 0 ? null : AttachMenuItem.File.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Video.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Item.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Location.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Replies.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttachMenuItem.Voice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttachMenuItem.Support.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttachMenu[] newArray(int i12) {
            return new AttachMenu[i12];
        }
    }

    public AttachMenu(@l AttachMenuItem.File file, @l AttachMenuItem.Image image, @l AttachMenuItem.Video video, @l AttachMenuItem.Item item, @l AttachMenuItem.Location location, @l AttachMenuItem.Replies replies, @l AttachMenuItem.Voice voice, @l AttachMenuItem.Support support) {
        this.file = file;
        this.image = image;
        this.video = video;
        this.item = item;
        this.location = location;
        this.replies = replies;
        this.voice = voice;
        this.support = support;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttachMenuItem.File getFile() {
        return this.file;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttachMenuItem.Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttachMenuItem.Video getVideo() {
        return this.video;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttachMenuItem.Item getItem() {
        return this.item;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttachMenuItem.Location getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttachMenuItem.Replies getReplies() {
        return this.replies;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttachMenuItem.Voice getVoice() {
        return this.voice;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AttachMenuItem.Support getSupport() {
        return this.support;
    }

    @k
    public final AttachMenu copy(@l AttachMenuItem.File file, @l AttachMenuItem.Image image, @l AttachMenuItem.Video video, @l AttachMenuItem.Item item, @l AttachMenuItem.Location location, @l AttachMenuItem.Replies replies, @l AttachMenuItem.Voice voice, @l AttachMenuItem.Support support) {
        return new AttachMenu(file, image, video, item, location, replies, voice, support);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachMenu)) {
            return false;
        }
        AttachMenu attachMenu = (AttachMenu) other;
        return L.f(this.file, attachMenu.file) && L.f(this.image, attachMenu.image) && L.f(this.video, attachMenu.video) && L.f(this.item, attachMenu.item) && L.f(this.location, attachMenu.location) && L.f(this.replies, attachMenu.replies) && L.f(this.voice, attachMenu.voice) && L.f(this.support, attachMenu.support);
    }

    @l
    public final AttachMenuItem.File getFile() {
        return this.file;
    }

    @l
    public final AttachMenuItem.Image getImage() {
        return this.image;
    }

    @l
    public final AttachMenuItem.Item getItem() {
        return this.item;
    }

    @l
    public final AttachMenuItem.Location getLocation() {
        return this.location;
    }

    @l
    public final AttachMenuItem.Replies getReplies() {
        return this.replies;
    }

    @l
    public final AttachMenuItem.Support getSupport() {
        return this.support;
    }

    @l
    public final AttachMenuItem.Video getVideo() {
        return this.video;
    }

    @l
    public final AttachMenuItem.Voice getVoice() {
        return this.voice;
    }

    public int hashCode() {
        AttachMenuItem.File file = this.file;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        AttachMenuItem.Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        AttachMenuItem.Video video = this.video;
        int iHashCode3 = (iHashCode2 + (video == null ? 0 : video.hashCode())) * 31;
        AttachMenuItem.Item item = this.item;
        int iHashCode4 = (iHashCode3 + (item == null ? 0 : item.hashCode())) * 31;
        AttachMenuItem.Location location = this.location;
        int iHashCode5 = (iHashCode4 + (location == null ? 0 : location.hashCode())) * 31;
        AttachMenuItem.Replies replies = this.replies;
        int iHashCode6 = (iHashCode5 + (replies == null ? 0 : replies.hashCode())) * 31;
        AttachMenuItem.Voice voice = this.voice;
        int iHashCode7 = (iHashCode6 + (voice == null ? 0 : voice.hashCode())) * 31;
        AttachMenuItem.Support support = this.support;
        return iHashCode7 + (support != null ? support.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AttachMenu(file=" + this.file + ", image=" + this.image + ", video=" + this.video + ", item=" + this.item + ", location=" + this.location + ", replies=" + this.replies + ", voice=" + this.voice + ", support=" + this.support + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AttachMenuItem.File file = this.file;
        if (file == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            file.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Image image = this.image;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Item item = this.item;
        if (item == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            item.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Location location = this.location;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Replies replies = this.replies;
        if (replies == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            replies.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Voice voice = this.voice;
        if (voice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voice.writeToParcel(parcel, flags);
        }
        AttachMenuItem.Support support = this.support;
        if (support == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            support.writeToParcel(parcel, flags);
        }
    }
}
