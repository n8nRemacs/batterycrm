package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandingAdvantages.kt */
@d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/BrandingAdvantagesItem;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/BrandingAdvantagesItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BrandingAdvantagesItem implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandingAdvantagesItem> CREATOR = new Creator();

    @k
    private final UniversalColor backgroundColor;

    @k
    private final UniversalImage icon;

    @k
    private final String title;

    /* compiled from: BrandingAdvantages.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrandingAdvantagesItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantagesItem createFromParcel(@k Parcel parcel) {
            return new BrandingAdvantagesItem(parcel.readString(), (UniversalImage) parcel.readParcelable(BrandingAdvantagesItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BrandingAdvantagesItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BrandingAdvantagesItem[] newArray(int i12) {
            return new BrandingAdvantagesItem[i12];
        }
    }

    public BrandingAdvantagesItem(@k String str, @k UniversalImage universalImage, @k UniversalColor universalColor) {
        this.title = str;
        this.icon = universalImage;
        this.backgroundColor = universalColor;
    }

    public static /* synthetic */ BrandingAdvantagesItem copy$default(BrandingAdvantagesItem brandingAdvantagesItem, String str, UniversalImage universalImage, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = brandingAdvantagesItem.title;
        }
        if ((i12 & 2) != 0) {
            universalImage = brandingAdvantagesItem.icon;
        }
        if ((i12 & 4) != 0) {
            universalColor = brandingAdvantagesItem.backgroundColor;
        }
        return brandingAdvantagesItem.copy(str, universalImage, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final BrandingAdvantagesItem copy(@k String title, @k UniversalImage icon, @k UniversalColor backgroundColor) {
        return new BrandingAdvantagesItem(title, icon, backgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingAdvantagesItem)) {
            return false;
        }
        BrandingAdvantagesItem brandingAdvantagesItem = (BrandingAdvantagesItem) other;
        return L.f(this.title, brandingAdvantagesItem.title) && L.f(this.icon, brandingAdvantagesItem.icon) && L.f(this.backgroundColor, brandingAdvantagesItem.backgroundColor);
    }

    @k
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + a.a(this.title.hashCode() * 31, 31, this.icon);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingAdvantagesItem(title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.icon, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
    }
}
