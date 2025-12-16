package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileFloatingBuyBlock.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJP\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileFloatingBuyBlock;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "title", "price", "imagePreviewUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "buyButtonDeepLink", "widgetType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileFloatingBuyBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "getTitle", "getPrice", "getImagePreviewUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "getBuyButtonDeepLink", "getWidgetType", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileFloatingBuyBlock implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileFloatingBuyBlock> CREATOR = new Creator();

    @c("buyButtonDeepLink")
    @k
    private final DeepLink buyButtonDeepLink;

    @c("imagePreviewUrl")
    @k
    private final String imagePreviewUrl;

    @c("price")
    @k
    private final String price;

    @c("title")
    @k
    private final String title;

    @c("widgetName")
    @l
    private final String widgetName;

    @c("widgetType")
    @l
    private final String widgetType;

    /* compiled from: ExtendedProfileFloatingBuyBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileFloatingBuyBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileFloatingBuyBlock createFromParcel(@k Parcel parcel) {
            return new ExtendedProfileFloatingBuyBlock(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ExtendedProfileFloatingBuyBlock.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileFloatingBuyBlock[] newArray(int i12) {
            return new ExtendedProfileFloatingBuyBlock[i12];
        }
    }

    public ExtendedProfileFloatingBuyBlock(@l String str, @k String str2, @k String str3, @k String str4, @k DeepLink deepLink, @l String str5) {
        this.widgetName = str;
        this.title = str2;
        this.price = str3;
        this.imagePreviewUrl = str4;
        this.buyButtonDeepLink = deepLink;
        this.widgetType = str5;
    }

    public static /* synthetic */ ExtendedProfileFloatingBuyBlock copy$default(ExtendedProfileFloatingBuyBlock extendedProfileFloatingBuyBlock, String str, String str2, String str3, String str4, DeepLink deepLink, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileFloatingBuyBlock.widgetName;
        }
        if ((i12 & 2) != 0) {
            str2 = extendedProfileFloatingBuyBlock.title;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = extendedProfileFloatingBuyBlock.price;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = extendedProfileFloatingBuyBlock.imagePreviewUrl;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            deepLink = extendedProfileFloatingBuyBlock.buyButtonDeepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 32) != 0) {
            str5 = extendedProfileFloatingBuyBlock.widgetType;
        }
        return extendedProfileFloatingBuyBlock.copy(str, str6, str7, str8, deepLink2, str5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getImagePreviewUrl() {
        return this.imagePreviewUrl;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeepLink getBuyButtonDeepLink() {
        return this.buyButtonDeepLink;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    @k
    public final ExtendedProfileFloatingBuyBlock copy(@l String widgetName, @k String title, @k String price, @k String imagePreviewUrl, @k DeepLink buyButtonDeepLink, @l String widgetType) {
        return new ExtendedProfileFloatingBuyBlock(widgetName, title, price, imagePreviewUrl, buyButtonDeepLink, widgetType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileFloatingBuyBlock)) {
            return false;
        }
        ExtendedProfileFloatingBuyBlock extendedProfileFloatingBuyBlock = (ExtendedProfileFloatingBuyBlock) other;
        return L.f(this.widgetName, extendedProfileFloatingBuyBlock.widgetName) && L.f(this.title, extendedProfileFloatingBuyBlock.title) && L.f(this.price, extendedProfileFloatingBuyBlock.price) && L.f(this.imagePreviewUrl, extendedProfileFloatingBuyBlock.imagePreviewUrl) && L.f(this.buyButtonDeepLink, extendedProfileFloatingBuyBlock.buyButtonDeepLink) && L.f(this.widgetType, extendedProfileFloatingBuyBlock.widgetType);
    }

    @k
    public final DeepLink getBuyButtonDeepLink() {
        return this.buyButtonDeepLink;
    }

    @k
    public final String getImagePreviewUrl() {
        return this.imagePreviewUrl;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        String str = this.widgetName;
        int iE2 = a.e(this.buyButtonDeepLink, H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.price), 31, this.imagePreviewUrl), 31);
        String str2 = this.widgetType;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileFloatingBuyBlock(widgetName=");
        sb2.append(this.widgetName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", imagePreviewUrl=");
        sb2.append(this.imagePreviewUrl);
        sb2.append(", buyButtonDeepLink=");
        sb2.append(this.buyButtonDeepLink);
        sb2.append(", widgetType=");
        return C22026a.c(sb2, this.widgetType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeString(this.imagePreviewUrl);
        parcel.writeParcelable(this.buyButtonDeepLink, flags);
        parcel.writeString(this.widgetType);
    }
}
