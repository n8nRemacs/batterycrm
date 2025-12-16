package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutoPickerBanner.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;)Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;", "getButton", "AutoPickerButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsAutoPickerBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutoPickerBanner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("button")
    @l
    private final AutoPickerButton button;

    @c("image")
    @l
    private final Image image;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertDetailsAutoPickerBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsAutoPickerBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsAutoPickerBanner createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsAutoPickerBanner(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(AdvertDetailsAutoPickerBanner.class.getClassLoader()), (Image) parcel.readParcelable(AdvertDetailsAutoPickerBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : AutoPickerButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsAutoPickerBanner[] newArray(int i12) {
            return new AdvertDetailsAutoPickerBanner[i12];
        }
    }

    public AdvertDetailsAutoPickerBanner(@l String str, @l String str2, @l UniversalColor universalColor, @l Image image, @l AutoPickerButton autoPickerButton) {
        this.title = str;
        this.subtitle = str2;
        this.backgroundColor = universalColor;
        this.image = image;
        this.button = autoPickerButton;
    }

    public static /* synthetic */ AdvertDetailsAutoPickerBanner copy$default(AdvertDetailsAutoPickerBanner advertDetailsAutoPickerBanner, String str, String str2, UniversalColor universalColor, Image image, AutoPickerButton autoPickerButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertDetailsAutoPickerBanner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertDetailsAutoPickerBanner.subtitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            universalColor = advertDetailsAutoPickerBanner.backgroundColor;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 8) != 0) {
            image = advertDetailsAutoPickerBanner.image;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            autoPickerButton = advertDetailsAutoPickerBanner.button;
        }
        return advertDetailsAutoPickerBanner.copy(str, str3, universalColor2, image2, autoPickerButton);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AutoPickerButton getButton() {
        return this.button;
    }

    @k
    public final AdvertDetailsAutoPickerBanner copy(@l String title, @l String subtitle, @l UniversalColor backgroundColor, @l Image image, @l AutoPickerButton button) {
        return new AdvertDetailsAutoPickerBanner(title, subtitle, backgroundColor, image, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsAutoPickerBanner)) {
            return false;
        }
        AdvertDetailsAutoPickerBanner advertDetailsAutoPickerBanner = (AdvertDetailsAutoPickerBanner) other;
        return L.f(this.title, advertDetailsAutoPickerBanner.title) && L.f(this.subtitle, advertDetailsAutoPickerBanner.subtitle) && L.f(this.backgroundColor, advertDetailsAutoPickerBanner.backgroundColor) && L.f(this.image, advertDetailsAutoPickerBanner.image) && L.f(this.button, advertDetailsAutoPickerBanner.button);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final AutoPickerButton getButton() {
        return this.button;
    }

    @l
    public final Image getImage() {
        return this.image;
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
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        AutoPickerButton autoPickerButton = this.button;
        return iHashCode4 + (autoPickerButton != null ? autoPickerButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertDetailsAutoPickerBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", backgroundColor=" + this.backgroundColor + ", image=" + this.image + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.image, flags);
        AutoPickerButton autoPickerButton = this.button;
        if (autoPickerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoPickerButton.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: AdvertDetailsAutoPickerBanner.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsAutoPickerBanner$AutoPickerButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AutoPickerButton implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoPickerButton> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: AdvertDetailsAutoPickerBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoPickerButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPickerButton createFromParcel(@k Parcel parcel) {
                return new AutoPickerButton(parcel.readString(), (DeepLink) parcel.readParcelable(AutoPickerButton.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoPickerButton[] newArray(int i12) {
                return new AutoPickerButton[i12];
            }
        }

        public AutoPickerButton(@k String str, @l DeepLink deepLink, @l String str2) {
            this.title = str;
            this.deepLink = deepLink;
            this.style = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeString(this.style);
        }

        public /* synthetic */ AutoPickerButton(String str, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : str2);
        }
    }
}
