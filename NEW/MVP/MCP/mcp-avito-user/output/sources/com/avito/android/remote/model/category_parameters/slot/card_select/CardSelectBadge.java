package com.avito.android.remote.model.category_parameters.slot.card_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;", "Landroid/os/Parcelable;", "", "title", "text", "backgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "getBackgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CardSelectBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<CardSelectBadge> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c("image")
    @l
    private final UniversalImage image;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    /* compiled from: CardSelectSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardSelectBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelectBadge createFromParcel(@k Parcel parcel) {
            return new CardSelectBadge(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(CardSelectBadge.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelectBadge[] newArray(int i12) {
            return new CardSelectBadge[i12];
        }
    }

    public CardSelectBadge(@l String str, @l String str2, @l String str3, @l UniversalImage universalImage) {
        this.title = str;
        this.text = str2;
        this.backgroundColor = str3;
        this.image = universalImage;
    }

    public static /* synthetic */ CardSelectBadge copy$default(CardSelectBadge cardSelectBadge, String str, String str2, String str3, UniversalImage universalImage, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cardSelectBadge.title;
        }
        if ((i12 & 2) != 0) {
            str2 = cardSelectBadge.text;
        }
        if ((i12 & 4) != 0) {
            str3 = cardSelectBadge.backgroundColor;
        }
        if ((i12 & 8) != 0) {
            universalImage = cardSelectBadge.image;
        }
        return cardSelectBadge.copy(str, str2, str3, universalImage);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final CardSelectBadge copy(@l String title, @l String text, @l String backgroundColor, @l UniversalImage image) {
        return new CardSelectBadge(title, text, backgroundColor, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSelectBadge)) {
            return false;
        }
        CardSelectBadge cardSelectBadge = (CardSelectBadge) other;
        return L.f(this.title, cardSelectBadge.title) && L.f(this.text, cardSelectBadge.text) && L.f(this.backgroundColor, cardSelectBadge.backgroundColor) && L.f(this.image, cardSelectBadge.image);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardSelectBadge(title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.backgroundColor);
        parcel.writeParcelable(this.image, flags);
    }
}
