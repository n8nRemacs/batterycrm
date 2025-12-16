package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: FloatingBuyBlock.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/FloatingBuyBlock;", "Landroid/os/Parcelable;", "", "title", "price", "imagePreviewUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "buyButtonDeepLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/FloatingBuyBlock;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getPrice", "getImagePreviewUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "getBuyButtonDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC47204b
/* loaded from: classes17.dex */
public final /* data */ class FloatingBuyBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<FloatingBuyBlock> CREATOR = new Creator();

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

    /* compiled from: FloatingBuyBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FloatingBuyBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FloatingBuyBlock createFromParcel(@k Parcel parcel) {
            return new FloatingBuyBlock(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(FloatingBuyBlock.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FloatingBuyBlock[] newArray(int i12) {
            return new FloatingBuyBlock[i12];
        }
    }

    public FloatingBuyBlock(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.title = str;
        this.price = str2;
        this.imagePreviewUrl = str3;
        this.buyButtonDeepLink = deepLink;
    }

    public static /* synthetic */ FloatingBuyBlock copy$default(FloatingBuyBlock floatingBuyBlock, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = floatingBuyBlock.title;
        }
        if ((i12 & 2) != 0) {
            str2 = floatingBuyBlock.price;
        }
        if ((i12 & 4) != 0) {
            str3 = floatingBuyBlock.imagePreviewUrl;
        }
        if ((i12 & 8) != 0) {
            deepLink = floatingBuyBlock.buyButtonDeepLink;
        }
        return floatingBuyBlock.copy(str, str2, str3, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getImagePreviewUrl() {
        return this.imagePreviewUrl;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeepLink getBuyButtonDeepLink() {
        return this.buyButtonDeepLink;
    }

    @k
    public final FloatingBuyBlock copy(@k String title, @k String price, @k String imagePreviewUrl, @k DeepLink buyButtonDeepLink) {
        return new FloatingBuyBlock(title, price, imagePreviewUrl, buyButtonDeepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatingBuyBlock)) {
            return false;
        }
        FloatingBuyBlock floatingBuyBlock = (FloatingBuyBlock) other;
        return L.f(this.title, floatingBuyBlock.title) && L.f(this.price, floatingBuyBlock.price) && L.f(this.imagePreviewUrl, floatingBuyBlock.imagePreviewUrl) && L.f(this.buyButtonDeepLink, floatingBuyBlock.buyButtonDeepLink);
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

    public int hashCode() {
        return this.buyButtonDeepLink.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.price), 31, this.imagePreviewUrl);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FloatingBuyBlock(title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", imagePreviewUrl=");
        sb2.append(this.imagePreviewUrl);
        sb2.append(", buyButtonDeepLink=");
        return a.v(sb2, this.buyButtonDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeString(this.imagePreviewUrl);
        parcel.writeParcelable(this.buyButtonDeepLink, flags);
    }
}
