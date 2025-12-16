package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileCategorizer.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileCategorizerItem;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "backgroundColor", "titleWithTransfer", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileCategorizerItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getBackgroundColor", "getTitleWithTransfer", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileCategorizerItem implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileCategorizerItem> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @k
    private final String title;

    @c("titleWithTransfer")
    @l
    private final String titleWithTransfer;

    /* compiled from: ExtendedProfileCategorizer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileCategorizerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategorizerItem createFromParcel(@k Parcel parcel) {
            return new ExtendedProfileCategorizerItem(parcel.readString(), (DeepLink) parcel.readParcelable(ExtendedProfileCategorizerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ExtendedProfileCategorizerItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategorizerItem[] newArray(int i12) {
            return new ExtendedProfileCategorizerItem[i12];
        }
    }

    public ExtendedProfileCategorizerItem(@k String str, @k DeepLink deepLink, @l UniversalImage universalImage, @l String str2, @l String str3) {
        this.title = str;
        this.deepLink = deepLink;
        this.image = universalImage;
        this.backgroundColor = str2;
        this.titleWithTransfer = str3;
    }

    public static /* synthetic */ ExtendedProfileCategorizerItem copy$default(ExtendedProfileCategorizerItem extendedProfileCategorizerItem, String str, DeepLink deepLink, UniversalImage universalImage, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileCategorizerItem.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = extendedProfileCategorizerItem.deepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            universalImage = extendedProfileCategorizerItem.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            str2 = extendedProfileCategorizerItem.backgroundColor;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            str3 = extendedProfileCategorizerItem.titleWithTransfer;
        }
        return extendedProfileCategorizerItem.copy(str, deepLink2, universalImage2, str4, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitleWithTransfer() {
        return this.titleWithTransfer;
    }

    @k
    public final ExtendedProfileCategorizerItem copy(@k String title, @k DeepLink deepLink, @l UniversalImage image, @l String backgroundColor, @l String titleWithTransfer) {
        return new ExtendedProfileCategorizerItem(title, deepLink, image, backgroundColor, titleWithTransfer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileCategorizerItem)) {
            return false;
        }
        ExtendedProfileCategorizerItem extendedProfileCategorizerItem = (ExtendedProfileCategorizerItem) other;
        return L.f(this.title, extendedProfileCategorizerItem.title) && L.f(this.deepLink, extendedProfileCategorizerItem.deepLink) && L.f(this.image, extendedProfileCategorizerItem.image) && L.f(this.backgroundColor, extendedProfileCategorizerItem.backgroundColor) && L.f(this.titleWithTransfer, extendedProfileCategorizerItem.titleWithTransfer);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTitleWithTransfer() {
        return this.titleWithTransfer;
    }

    public int hashCode() {
        int iE2 = a.e(this.deepLink, this.title.hashCode() * 31, 31);
        UniversalImage universalImage = this.image;
        int iHashCode = (iE2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleWithTransfer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileCategorizerItem(title=");
        sb2.append(this.title);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", titleWithTransfer=");
        return C22026a.c(sb2, this.titleWithTransfer, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.titleWithTransfer);
    }
}
