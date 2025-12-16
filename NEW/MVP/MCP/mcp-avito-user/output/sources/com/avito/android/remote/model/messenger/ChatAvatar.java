package com.avito.android.remote.model.messenger;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChatAvatar.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/ChatAvatar;", "Landroid/os/Parcelable;", "", "defaultUrl", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/messenger/ChatAvatar;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDefaultUrl", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChatAvatar implements Parcelable {

    @k
    public static final Parcelable.Creator<ChatAvatar> CREATOR = new Creator();

    @k
    private final String defaultUrl;

    @l
    private final Image image;

    /* compiled from: ChatAvatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatAvatar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatAvatar createFromParcel(@k Parcel parcel) {
            return new ChatAvatar(parcel.readString(), (Image) parcel.readParcelable(ChatAvatar.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChatAvatar[] newArray(int i12) {
            return new ChatAvatar[i12];
        }
    }

    public ChatAvatar(@k String str, @l Image image) {
        this.defaultUrl = str;
        this.image = image;
    }

    public static /* synthetic */ ChatAvatar copy$default(ChatAvatar chatAvatar, String str, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = chatAvatar.defaultUrl;
        }
        if ((i12 & 2) != 0) {
            image = chatAvatar.image;
        }
        return chatAvatar.copy(str, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDefaultUrl() {
        return this.defaultUrl;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    public final ChatAvatar copy(@k String defaultUrl, @l Image image) {
        return new ChatAvatar(defaultUrl, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatAvatar)) {
            return false;
        }
        ChatAvatar chatAvatar = (ChatAvatar) other;
        return L.f(this.defaultUrl, chatAvatar.defaultUrl) && L.f(this.image, chatAvatar.image);
    }

    @k
    public final String getDefaultUrl() {
        return this.defaultUrl;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = this.defaultUrl.hashCode() * 31;
        Image image = this.image;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChatAvatar(defaultUrl=");
        sb2.append(this.defaultUrl);
        sb2.append(", image=");
        return c.o(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.defaultUrl);
        parcel.writeParcelable(this.image, flags);
    }
}
