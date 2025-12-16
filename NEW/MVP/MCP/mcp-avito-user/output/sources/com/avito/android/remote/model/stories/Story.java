package com.avito.android.remote.model.stories;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Story.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0011R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00107\u001a\u0004\b\r\u0010\u001b\"\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/stories/Story;", "Landroid/os/Parcelable;", "", "id", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/Color;", "backgroundColor", "Lcom/avito/android/remote/model/Image;", "image", "badgeText", "", "isViewed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/Color;", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/stories/Story;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/Color;", "getBackgroundColor", "Lcom/avito/android/remote/model/Image;", "getImage", "getBadgeText", "Ljava/lang/Boolean;", "setViewed", "(Ljava/lang/Boolean;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Story implements Parcelable {

    @k
    public static final Parcelable.Creator<Story> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final Color backgroundColor;

    @c("badge")
    @l
    private final String badgeText;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("id")
    @l
    private final String id;

    @c("image")
    @l
    private final Image image;

    @c("viewed")
    @l
    private Boolean isViewed;

    @c("title")
    @l
    private final String title;

    /* compiled from: Story.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Story> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Story createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(Story.class.getClassLoader());
            Color color = (Color) parcel.readParcelable(Story.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(Story.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Story(string, string2, deepLink, color, image, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Story[] newArray(int i12) {
            return new Story[i12];
        }
    }

    public Story() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Story copy$default(Story story, String str, String str2, DeepLink deepLink, Color color, Image image, String str3, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = story.id;
        }
        if ((i12 & 2) != 0) {
            str2 = story.title;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            deepLink = story.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            color = story.backgroundColor;
        }
        Color color2 = color;
        if ((i12 & 16) != 0) {
            image = story.image;
        }
        Image image2 = image;
        if ((i12 & 32) != 0) {
            str3 = story.badgeText;
        }
        String str5 = str3;
        if ((i12 & 64) != 0) {
            bool = story.isViewed;
        }
        return story.copy(str, str4, deepLink2, color2, image2, str5, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsViewed() {
        return this.isViewed;
    }

    @k
    public final Story copy(@l String id2, @l String title, @l DeepLink deeplink, @l Color backgroundColor, @l Image image, @l String badgeText, @l Boolean isViewed) {
        return new Story(id2, title, deeplink, backgroundColor, image, badgeText, isViewed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Story)) {
            return false;
        }
        Story story = (Story) other;
        return L.f(this.id, story.id) && L.f(this.title, story.title) && L.f(this.deeplink, story.deeplink) && L.f(this.backgroundColor, story.backgroundColor) && L.f(this.image, story.image) && L.f(this.badgeText, story.badgeText) && L.f(this.isViewed, story.isViewed);
    }

    @l
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Color color = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.image;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.badgeText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isViewed;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isViewed() {
        return this.isViewed;
    }

    public final void setViewed(@l Boolean bool) {
        this.isViewed = bool;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Story(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", badgeText=");
        sb2.append(this.badgeText);
        sb2.append(", isViewed=");
        return C0.g(sb2, this.isViewed, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.badgeText);
        Boolean bool = this.isViewed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public Story(@l String str, @l String str2, @l DeepLink deepLink, @l Color color, @l Image image, @l String str3, @l Boolean bool) {
        this.id = str;
        this.title = str2;
        this.deeplink = deepLink;
        this.backgroundColor = color;
        this.image = image;
        this.badgeText = str3;
        this.isViewed = bool;
    }

    public /* synthetic */ Story(String str, String str2, DeepLink deepLink, Color color, Image image, String str3, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : color, (i12 & 16) != 0 ? null : image, (i12 & 32) == 0 ? str3 : null, (i12 & 64) != 0 ? Boolean.FALSE : bool);
    }
}
