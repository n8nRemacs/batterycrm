package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.FavoriteElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesPromoWidget.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u00013Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b/\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget;", "Lcom/avito/android/remote/model/FavoriteElement;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "link", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "backgroundGradient", "backgroundImage", "Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;", "analyticalParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "getLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundGradient", "getBackgroundImage", "Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;", "getAnalyticalParams", "()Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;", "AnalyticalParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SalesPromoWidget implements FavoriteElement {

    @k
    public static final Parcelable.Creator<SalesPromoWidget> CREATOR = new Creator();

    @c("analyticalParams")
    @l
    private final AnalyticalParams analyticalParams;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("backgroundGradient")
    @l
    private final String backgroundGradient;

    @c("backgroundImage")
    @l
    private final UniversalImage backgroundImage;

    @c("id")
    @l
    private final String id;

    @c("image")
    @l
    private final UniversalImage image;

    @c("link")
    @l
    private final String link;

    @c("subtitle")
    @k
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: SalesPromoWidget.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;", "Landroid/os/Parcelable;", "", "fromPage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/vertical_main/SalesPromoWidget$AnalyticalParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFromPage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnalyticalParams implements Parcelable {

        @k
        public static final Parcelable.Creator<AnalyticalParams> CREATOR = new Creator();

        @c("fromPage")
        @l
        private final String fromPage;

        /* compiled from: SalesPromoWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AnalyticalParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticalParams createFromParcel(@k Parcel parcel) {
                return new AnalyticalParams(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AnalyticalParams[] newArray(int i12) {
                return new AnalyticalParams[i12];
            }
        }

        public AnalyticalParams(@l String str) {
            this.fromPage = str;
        }

        public static /* synthetic */ AnalyticalParams copy$default(AnalyticalParams analyticalParams, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = analyticalParams.fromPage;
            }
            return analyticalParams.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getFromPage() {
            return this.fromPage;
        }

        @k
        public final AnalyticalParams copy(@l String fromPage) {
            return new AnalyticalParams(fromPage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnalyticalParams) && L.f(this.fromPage, ((AnalyticalParams) other).fromPage);
        }

        @l
        public final String getFromPage() {
            return this.fromPage;
        }

        public int hashCode() {
            String str = this.fromPage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("AnalyticalParams(fromPage="), this.fromPage, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.fromPage);
        }
    }

    /* compiled from: SalesPromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalesPromoWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesPromoWidget createFromParcel(@k Parcel parcel) {
            return new SalesPromoWidget(parcel.readString(), (AttributedText) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), (AttributedText) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(SalesPromoWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : AnalyticalParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesPromoWidget[] newArray(int i12) {
            return new SalesPromoWidget[i12];
        }
    }

    public SalesPromoWidget(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l UniversalImage universalImage, @l String str2, @l DeepLink deepLink, @l UniversalColor universalColor, @l String str3, @l UniversalImage universalImage2, @l AnalyticalParams analyticalParams) {
        this.id = str;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.image = universalImage;
        this.link = str2;
        this.uri = deepLink;
        this.backgroundColor = universalColor;
        this.backgroundGradient = str3;
        this.backgroundImage = universalImage2;
        this.analyticalParams = analyticalParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AnalyticalParams getAnalyticalParams() {
        return this.analyticalParams;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @l
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getLink() {
        return this.link;
    }

    @k
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.link);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeString(this.backgroundGradient);
        parcel.writeParcelable(this.backgroundImage, flags);
        AnalyticalParams analyticalParams = this.analyticalParams;
        if (analyticalParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticalParams.writeToParcel(parcel, flags);
        }
    }
}
