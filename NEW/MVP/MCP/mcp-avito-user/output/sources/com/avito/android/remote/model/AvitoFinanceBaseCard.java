package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBaseCard.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/AvitoFinanceBaseCard;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "", "title", "subtitle", "Lcom/avito/android/remote/model/AvitoFinanceBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AvitoFinanceBackground;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/AvitoFinanceBackground;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AvitoFinanceBackground;)Lcom/avito/android/remote/model/AvitoFinanceBaseCard;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/AvitoFinanceBackground;", "getBackground", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoFinanceBaseCard implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceBaseCard> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final AvitoFinanceBackground background;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: AvitoFinanceBaseCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoFinanceBaseCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceBaseCard createFromParcel(@k Parcel parcel) {
            return new AvitoFinanceBaseCard((UniversalImage) parcel.readParcelable(AvitoFinanceBaseCard.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AvitoFinanceBackground.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoFinanceBaseCard[] newArray(int i12) {
            return new AvitoFinanceBaseCard[i12];
        }
    }

    public AvitoFinanceBaseCard(@l UniversalImage universalImage, @l String str, @l String str2, @l AvitoFinanceBackground avitoFinanceBackground) {
        this.icon = universalImage;
        this.title = str;
        this.subtitle = str2;
        this.background = avitoFinanceBackground;
    }

    public static /* synthetic */ AvitoFinanceBaseCard copy$default(AvitoFinanceBaseCard avitoFinanceBaseCard, UniversalImage universalImage, String str, String str2, AvitoFinanceBackground avitoFinanceBackground, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalImage = avitoFinanceBaseCard.icon;
        }
        if ((i12 & 2) != 0) {
            str = avitoFinanceBaseCard.title;
        }
        if ((i12 & 4) != 0) {
            str2 = avitoFinanceBaseCard.subtitle;
        }
        if ((i12 & 8) != 0) {
            avitoFinanceBackground = avitoFinanceBaseCard.background;
        }
        return avitoFinanceBaseCard.copy(universalImage, str, str2, avitoFinanceBackground);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AvitoFinanceBackground getBackground() {
        return this.background;
    }

    @k
    public final AvitoFinanceBaseCard copy(@l UniversalImage icon, @l String title, @l String subtitle, @l AvitoFinanceBackground background) {
        return new AvitoFinanceBaseCard(icon, title, subtitle, background);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoFinanceBaseCard)) {
            return false;
        }
        AvitoFinanceBaseCard avitoFinanceBaseCard = (AvitoFinanceBaseCard) other;
        return L.f(this.icon, avitoFinanceBaseCard.icon) && L.f(this.title, avitoFinanceBaseCard.title) && L.f(this.subtitle, avitoFinanceBaseCard.subtitle) && L.f(this.background, avitoFinanceBaseCard.background);
    }

    @l
    public final AvitoFinanceBackground getBackground() {
        return this.background;
    }

    @l
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        UniversalImage universalImage = this.icon;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AvitoFinanceBackground avitoFinanceBackground = this.background;
        return iHashCode3 + (avitoFinanceBackground != null ? avitoFinanceBackground.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AvitoFinanceBaseCard(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.icon, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        AvitoFinanceBackground avitoFinanceBackground = this.background;
        if (avitoFinanceBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoFinanceBackground.writeToParcel(parcel, flags);
        }
    }
}
