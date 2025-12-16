package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OtherCategories.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/OtherCategory;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "rightEdgeIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/OtherCategory;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getRightEdgeIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OtherCategory implements Parcelable {

    @k
    public static final Parcelable.Creator<OtherCategory> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("image")
    @k
    private final UniversalImage image;

    @c("rightEdgeIcon")
    @l
    private final String rightEdgeIcon;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: OtherCategories.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtherCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OtherCategory createFromParcel(@k Parcel parcel) {
            return new OtherCategory(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(OtherCategory.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(OtherCategory.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OtherCategory[] newArray(int i12) {
            return new OtherCategory[i12];
        }
    }

    public OtherCategory(@k String str, @l String str2, @k UniversalImage universalImage, @l String str3, @k DeepLink deepLink) {
        this.title = str;
        this.subtitle = str2;
        this.image = universalImage;
        this.rightEdgeIcon = str3;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ OtherCategory copy$default(OtherCategory otherCategory, String str, String str2, UniversalImage universalImage, String str3, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = otherCategory.title;
        }
        if ((i12 & 2) != 0) {
            str2 = otherCategory.subtitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            universalImage = otherCategory.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            str3 = otherCategory.rightEdgeIcon;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            deepLink = otherCategory.deepLink;
        }
        return otherCategory.copy(str, str4, universalImage2, str5, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getRightEdgeIcon() {
        return this.rightEdgeIcon;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final OtherCategory copy(@k String title, @l String subtitle, @k UniversalImage image, @l String rightEdgeIcon, @k DeepLink deepLink) {
        return new OtherCategory(title, subtitle, image, rightEdgeIcon, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherCategory)) {
            return false;
        }
        OtherCategory otherCategory = (OtherCategory) other;
        return L.f(this.title, otherCategory.title) && L.f(this.subtitle, otherCategory.subtitle) && L.f(this.image, otherCategory.image) && L.f(this.rightEdgeIcon, otherCategory.rightEdgeIcon) && L.f(this.deepLink, otherCategory.deepLink);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getRightEdgeIcon() {
        return this.rightEdgeIcon;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iA2 = a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.image);
        String str2 = this.rightEdgeIcon;
        return this.deepLink.hashCode() + ((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OtherCategory(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", rightEdgeIcon=");
        sb2.append(this.rightEdgeIcon);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.rightEdgeIcon);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
