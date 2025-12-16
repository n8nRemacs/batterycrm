package com.avito.android.remote.model.map_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* compiled from: MapBanner.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001,BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R(\u0010$\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/map_banner/MapBanner;", "Lcom/avito/android/remote/model/SerpElement;", "", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/map_banner/MapBanner$MapBannerStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/map_banner/MapBanner$MapBannerStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/map_banner/MapBanner$MapBannerStyle;", "getStyle", "()Lcom/avito/android/remote/model/map_banner/MapBanner$MapBannerStyle;", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "MapBannerStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MapBanner implements SerpElement {

    @k
    public static final Parcelable.Creator<MapBanner> CREATOR = new Creator();

    @c("button_text")
    @l
    private final String buttonText;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("image")
    @l
    private final UniversalImage image;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final MapBannerStyle style;

    @c("title")
    @l
    private final String title;
    private long uniqueId;

    /* compiled from: MapBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapBanner createFromParcel(@k Parcel parcel) {
            return new MapBanner(parcel.readString(), (DeepLink) parcel.readParcelable(MapBanner.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(MapBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : MapBannerStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapBanner[] newArray(int i12) {
            return new MapBanner[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapBanner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/map_banner/MapBanner$MapBannerStyle;", "", "(Ljava/lang/String;I)V", "SCREEN_MAP", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MapBannerStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MapBannerStyle[] $VALUES;

        @c("screenMap")
        public static final MapBannerStyle SCREEN_MAP = new MapBannerStyle("SCREEN_MAP", 0);

        private static final /* synthetic */ MapBannerStyle[] $values() {
            return new MapBannerStyle[]{SCREEN_MAP};
        }

        static {
            MapBannerStyle[] mapBannerStyleArr$values = $values();
            $VALUES = mapBannerStyleArr$values;
            $ENTRIES = kotlin.enums.c.a(mapBannerStyleArr$values);
        }

        private MapBannerStyle(String str, int i12) {
        }

        @k
        public static a<MapBannerStyle> getEntries() {
            return $ENTRIES;
        }

        public static MapBannerStyle valueOf(String str) {
            return (MapBannerStyle) Enum.valueOf(MapBannerStyle.class, str);
        }

        public static MapBannerStyle[] values() {
            return (MapBannerStyle[]) $VALUES.clone();
        }
    }

    public MapBanner() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final MapBannerStyle getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, flags);
        MapBannerStyle mapBannerStyle = this.style;
        if (mapBannerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mapBannerStyle.name());
        }
    }

    public MapBanner(@l String str, @l DeepLink deepLink, @l String str2, @l UniversalImage universalImage, @l MapBannerStyle mapBannerStyle) {
        this.buttonText = str;
        this.deepLink = deepLink;
        this.title = str2;
        this.image = universalImage;
        this.style = mapBannerStyle;
    }

    public /* synthetic */ MapBanner(String str, DeepLink deepLink, String str2, UniversalImage universalImage, MapBannerStyle mapBannerStyle, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? null : mapBannerStyle);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
