package com.avito.android.remote.model.inset;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ItemsCarouselWidget.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/inset/AdditionalItem;", "Landroid/os/Parcelable;", "backgroundColor", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "position", "Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "getPosition", "()Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "Image", "Position", "ShowMore", "Lcom/avito/android/remote/model/inset/AdditionalItem$Image;", "Lcom/avito/android/remote/model/inset/AdditionalItem$ShowMore;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AdditionalItem extends Parcelable {

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/inset/AdditionalItem$Image;", "Lcom/avito/android/remote/model/inset/AdditionalItem;", "Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "position", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/inset/AdditionalItem$Position;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/inset/AdditionalItem$Position;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/inset/AdditionalItem$Image;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "getPosition", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements AdditionalItem {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deeplink;

        @c("image")
        @k
        private final UniversalImage image;

        @c("position")
        @l
        private final Position position;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image(parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(Image.class.getClassLoader()), (DeepLink) parcel.readParcelable(Image.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Image.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@l Position position, @l UniversalColor universalColor, @l DeepLink deepLink, @k UniversalImage universalImage) {
            this.position = position;
            this.backgroundColor = universalColor;
            this.deeplink = deepLink;
            this.image = universalImage;
        }

        public static /* synthetic */ Image copy$default(Image image, Position position, UniversalColor universalColor, DeepLink deepLink, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                position = image.position;
            }
            if ((i12 & 2) != 0) {
                universalColor = image.backgroundColor;
            }
            if ((i12 & 4) != 0) {
                deepLink = image.deeplink;
            }
            if ((i12 & 8) != 0) {
                universalImage = image.image;
            }
            return image.copy(position, universalColor, deepLink, universalImage);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final Image copy(@l Position position, @l UniversalColor backgroundColor, @l DeepLink deeplink, @k UniversalImage image) {
            return new Image(position, backgroundColor, deeplink, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return this.position == image.position && L.f(this.backgroundColor, image.backgroundColor) && L.f(this.deeplink, image.deeplink) && L.f(this.image, image.image);
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @l
        public UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @l
        public DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @l
        public Position getPosition() {
            return this.position;
        }

        public int hashCode() {
            Position position = this.position;
            int iHashCode = (position == null ? 0 : position.hashCode()) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            return this.image.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Image(position=");
            sb2.append(this.position);
            sb2.append(", backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Position position = this.position;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemsCarouselWidget.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "START", "END", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Position implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @k
        public static final Parcelable.Creator<Position> CREATOR;

        @k
        private final String value;
        public static final Position START = new Position("START", 0, "start");
        public static final Position END = new Position("END", 1, "end");

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position createFromParcel(@k Parcel parcel) {
                return Position.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Position[] newArray(int i12) {
                return new Position[i12];
            }
        }

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{START, END};
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = kotlin.enums.c.a(positionArr$values);
            CREATOR = new Creator();
        }

        private Position(String str, int i12, String str2) {
            this.value = str2;
        }

        @k
        public static a<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010JH\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0010¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/inset/AdditionalItem$ShowMore;", "Lcom/avito/android/remote/model/inset/AdditionalItem;", "Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "position", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "textColor", "<init>", "(Lcom/avito/android/remote/model/inset/AdditionalItem$Position;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/avito/android/remote/model/inset/AdditionalItem$Position;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/inset/AdditionalItem$ShowMore;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/inset/AdditionalItem$Position;", "getPosition", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Ljava/lang/String;", "getTitle", "getTextColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowMore implements AdditionalItem {

        @k
        public static final Parcelable.Creator<ShowMore> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        @c("position")
        @l
        private final Position position;

        @c("textColor")
        @l
        private final UniversalColor textColor;

        @c("title")
        @k
        private final String title;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowMore> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ShowMore createFromParcel(@k Parcel parcel) {
                return new ShowMore(parcel.readInt() == 0 ? null : Position.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(ShowMore.class.getClassLoader()), (DeepLink) parcel.readParcelable(ShowMore.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(ShowMore.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ShowMore[] newArray(int i12) {
                return new ShowMore[i12];
            }
        }

        public ShowMore(@l Position position, @l UniversalColor universalColor, @k DeepLink deepLink, @k String str, @l UniversalColor universalColor2) {
            this.position = position;
            this.backgroundColor = universalColor;
            this.deeplink = deepLink;
            this.title = str;
            this.textColor = universalColor2;
        }

        public static /* synthetic */ ShowMore copy$default(ShowMore showMore, Position position, UniversalColor universalColor, DeepLink deepLink, String str, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                position = showMore.position;
            }
            if ((i12 & 2) != 0) {
                universalColor = showMore.backgroundColor;
            }
            UniversalColor universalColor3 = universalColor;
            if ((i12 & 4) != 0) {
                deepLink = showMore.deeplink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 8) != 0) {
                str = showMore.title;
            }
            String str2 = str;
            if ((i12 & 16) != 0) {
                universalColor2 = showMore.textColor;
            }
            return showMore.copy(position, universalColor3, deepLink2, str2, universalColor2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        public final ShowMore copy(@l Position position, @l UniversalColor backgroundColor, @k DeepLink deeplink, @k String title, @l UniversalColor textColor) {
            return new ShowMore(position, backgroundColor, deeplink, title, textColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowMore)) {
                return false;
            }
            ShowMore showMore = (ShowMore) other;
            return this.position == showMore.position && L.f(this.backgroundColor, showMore.backgroundColor) && L.f(this.deeplink, showMore.deeplink) && L.f(this.title, showMore.title) && L.f(this.textColor, showMore.textColor);
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @l
        public UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @k
        public DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Override // com.avito.android.remote.model.inset.AdditionalItem
        @l
        public Position getPosition() {
            return this.position;
        }

        @l
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Position position = this.position;
            int iHashCode = (position == null ? 0 : position.hashCode()) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iD2 = H.d(com.avito.android.actions_sheet.a.e(this.deeplink, (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31, 31), 31, this.title);
            UniversalColor universalColor2 = this.textColor;
            return iD2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowMore(position=");
            sb2.append(this.position);
            sb2.append(", backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", textColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.textColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Position position = this.position;
            if (position == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                position.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.textColor, flags);
        }
    }

    @l
    UniversalColor getBackgroundColor();

    @l
    DeepLink getDeeplink();

    @l
    Position getPosition();
}
