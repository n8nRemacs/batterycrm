package com.avito.android.remote.safedeal;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.platform.C22491k0;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import org.webrtc.h;

/* compiled from: SafeDeal.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006%&'()*Bk\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal;", "Landroid/os/Parcelable;", "", "", "orderTypes", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "services", "Lcom/avito/android/remote/safedeal/SafeDeal$Info;", RequestReviewResultKt.INFO_TYPE, "", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData;", "tooltips", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "components", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "returnCheckoutDialog", "", "shouldShowRealOneClickSlider", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/safedeal/SafeDeal$Info;Ljava/util/Map;Ljava/util/List;Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;Ljava/lang/Boolean;)V", "Ljava/util/List;", "getOrderTypes", "()Ljava/util/List;", "f", "Lcom/avito/android/remote/safedeal/SafeDeal$Info;", "d", "()Lcom/avito/android/remote/safedeal/SafeDeal$Info;", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "getComponents", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "e", "()Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "Alignment", "Component", "DiscountLabel", "Info", "ReturnCheckoutDialog", "TooltipData", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SafeDeal implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDeal> CREATOR = new a();

    @c("components")
    @l
    private final List<Component> components;

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final Info info;

    @c("orderTypes")
    @l
    private final List<String> orderTypes;

    @c("returnCheckoutDialog")
    @l
    private final ReturnCheckoutDialog returnCheckoutDialog;

    @c("services")
    @l
    private final List<MyAdvertSafeDeal.Service> services;

    @c("shouldShowRealOneClickSlider")
    @l
    private final Boolean shouldShowRealOneClickSlider;

    @c("tooltips")
    @l
    private final Map<String, TooltipData> tooltips;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Alignment;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        @c("center")
        public static final Alignment CENTER;

        @c("left")
        public static final Alignment LEFT;

        @c("right")
        public static final Alignment RIGHT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f254341b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f254342c;

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            LEFT = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            CENTER = alignment2;
            Alignment alignment3 = new Alignment("RIGHT", 2);
            RIGHT = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            f254341b = alignmentArr;
            f254342c = kotlin.enums.c.a(alignmentArr);
        }

        private Alignment(String str, int i12) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f254341b.clone();
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "Landroid/os/Parcelable;", "<init>", "()V", "BadgeBar", "Button", "CombinedButtons", "ExpandableListItem", "Header", "ListItem", "LocalIcon", "Spacing", "SplitText", "Text", "Voucher", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$ExpandableListItem;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Header;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$ListItem;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Spacing;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$SplitText;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Text;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Component implements Parcelable {

        /* compiled from: SafeDeal.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "title", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar$Style;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar$Style;", "d", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar$Style;", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Style", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class BadgeBar extends Component {

            @k
            public static final Parcelable.Creator<BadgeBar> CREATOR = new a();

            @c("descriptionStr")
            @k
            private final String description;

            @c("id")
            @l
            private final String id;

            @c("image")
            @l
            private final UniversalImage image;

            @c(ContextActionHandler.Link.DEEPLINK)
            @l
            private final DeepLink onTapDeepLink;

            @c("styleBadgeBar")
            @k
            private final Style style;

            @c("title")
            @k
            private final String title;

            /* compiled from: SafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$BadgeBar$Style;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "highlightedBackgroundColor", "textColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "c", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Style implements Parcelable {

                @k
                public static final Parcelable.Creator<Style> CREATOR = new a();

                @c("backgroundColor")
                @k
                private final UniversalColor backgroundColor;

                @c("highlightedBackgroundColor")
                @k
                private final UniversalColor highlightedBackgroundColor;

                @c("textColor")
                @k
                private final UniversalColor textColor;

                /* compiled from: SafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Style> {
                    @Override // android.os.Parcelable.Creator
                    public final Style createFromParcel(Parcel parcel) {
                        return new Style((UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Style.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Style.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Style[] newArray(int i12) {
                        return new Style[i12];
                    }
                }

                public Style(@k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3) {
                    this.backgroundColor = universalColor;
                    this.highlightedBackgroundColor = universalColor2;
                    this.textColor = universalColor3;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final UniversalColor getHighlightedBackgroundColor() {
                    return this.highlightedBackgroundColor;
                }

                @k
                /* renamed from: d, reason: from getter */
                public final UniversalColor getTextColor() {
                    return this.textColor;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Style)) {
                        return false;
                    }
                    Style style = (Style) obj;
                    return L.f(this.backgroundColor, style.backgroundColor) && L.f(this.highlightedBackgroundColor, style.highlightedBackgroundColor) && L.f(this.textColor, style.textColor);
                }

                @k
                public final UniversalColor getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final int hashCode() {
                    return this.textColor.hashCode() + com.avito.android.actions_sheet.a.i(this.highlightedBackgroundColor, this.backgroundColor.hashCode() * 31, 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Style(backgroundColor=");
                    sb2.append(this.backgroundColor);
                    sb2.append(", highlightedBackgroundColor=");
                    sb2.append(this.highlightedBackgroundColor);
                    sb2.append(", textColor=");
                    return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.textColor, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.backgroundColor, i12);
                    parcel.writeParcelable(this.highlightedBackgroundColor, i12);
                    parcel.writeParcelable(this.textColor, i12);
                }
            }

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BadgeBar> {
                @Override // android.os.Parcelable.Creator
                public final BadgeBar createFromParcel(Parcel parcel) {
                    return new BadgeBar(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(BadgeBar.class.getClassLoader()), Style.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(BadgeBar.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final BadgeBar[] newArray(int i12) {
                    return new BadgeBar[i12];
                }
            }

            public BadgeBar(@l String str, @k String str2, @k String str3, @l DeepLink deepLink, @k Style style, @l UniversalImage universalImage) {
                super(null);
                this.id = str;
                this.title = str2;
                this.description = str3;
                this.onTapDeepLink = deepLink;
                this.style = style;
                this.image = universalImage;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final DeepLink getOnTapDeepLink() {
                return this.onTapDeepLink;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final Style getStyle() {
                return this.style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BadgeBar)) {
                    return false;
                }
                BadgeBar badgeBar = (BadgeBar) obj;
                return L.f(this.id, badgeBar.id) && L.f(this.title, badgeBar.title) && L.f(this.description, badgeBar.description) && L.f(this.onTapDeepLink, badgeBar.onTapDeepLink) && L.f(this.style, badgeBar.style) && L.f(this.image, badgeBar.image);
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @l
            public final String getId() {
                return this.id;
            }

            @l
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                String str = this.id;
                int iD2 = H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.description);
                DeepLink deepLink = this.onTapDeepLink;
                int iHashCode = (this.style.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31;
                UniversalImage universalImage = this.image;
                return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BadgeBar(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", onTapDeepLink=");
                sb2.append(this.onTapDeepLink);
                sb2.append(", style=");
                sb2.append(this.style);
                sb2.append(", image=");
                return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeParcelable(this.onTapDeepLink, i12);
                this.style.writeToParcel(parcel, i12);
                parcel.writeParcelable(this.image, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isLoading", "isFloating", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "iconName", "secondaryText", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTheme", "getTitle", "getStyle", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "f", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "d", "Lcom/avito/android/remote/model/ParametrizedEvent;", "e", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button extends Component {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            @c(ContextActionHandler.Link.DEEPLINK)
            @l
            private final DeepLink deepLink;

            @c("iconName")
            @l
            private final String iconName;

            @c("id")
            @l
            private final String id;

            @c("isFloating")
            @l
            private final Boolean isFloating;

            @c("isLoading")
            @l
            private final Boolean isLoading;

            @c("secondaryText")
            @l
            private final String secondaryText;

            @c("onShowEvent")
            @l
            private final ParametrizedEvent showEvent;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final String style;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
            @l
            private final String theme;

            @c("title")
            @k
            private final String title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Button(string, string2, string3, string4, boolValueOf, boolValueOf2, (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(Button.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public /* synthetic */ Button(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, DeepLink deepLink, String str5, String str6, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
                this(str, str2, str3, str4, bool, bool2, deepLink, str5, str6, (i12 & 512) != 0 ? null : parametrizedEvent);
            }

            public static Button a(Button button, Boolean bool) {
                String str = button.id;
                String str2 = button.theme;
                String str3 = button.title;
                String str4 = button.style;
                Boolean bool2 = button.isFloating;
                DeepLink deepLink = button.deepLink;
                String str5 = button.iconName;
                String str6 = button.secondaryText;
                ParametrizedEvent parametrizedEvent = button.showEvent;
                button.getClass();
                return new Button(str, str2, str3, str4, bool, bool2, deepLink, str5, str6, parametrizedEvent);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getIconName() {
                return this.iconName;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final String getSecondaryText() {
                return this.secondaryText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final ParametrizedEvent getShowEvent() {
                return this.showEvent;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.id, button.id) && L.f(this.theme, button.theme) && L.f(this.title, button.title) && L.f(this.style, button.style) && L.f(this.isLoading, button.isLoading) && L.f(this.isFloating, button.isFloating) && L.f(this.deepLink, button.deepLink) && L.f(this.iconName, button.iconName) && L.f(this.secondaryText, button.secondaryText) && L.f(this.showEvent, button.showEvent);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final Boolean getIsFloating() {
                return this.isFloating;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Boolean getIsLoading() {
                return this.isLoading;
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final String getId() {
                return this.id;
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            @l
            public final String getTheme() {
                return this.theme;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.theme;
                int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
                String str3 = this.style;
                int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool = this.isLoading;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isFloating;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                DeepLink deepLink = this.deepLink;
                int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                String str4 = this.iconName;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.secondaryText;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                ParametrizedEvent parametrizedEvent = this.showEvent;
                return iHashCode7 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(id=");
                sb2.append(this.id);
                sb2.append(", theme=");
                sb2.append(this.theme);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", style=");
                sb2.append(this.style);
                sb2.append(", isLoading=");
                sb2.append(this.isLoading);
                sb2.append(", isFloating=");
                sb2.append(this.isFloating);
                sb2.append(", deepLink=");
                sb2.append(this.deepLink);
                sb2.append(", iconName=");
                sb2.append(this.iconName);
                sb2.append(", secondaryText=");
                sb2.append(this.secondaryText);
                sb2.append(", showEvent=");
                return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.showEvent, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeString(this.theme);
                parcel.writeString(this.title);
                parcel.writeString(this.style);
                Boolean bool = this.isLoading;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                Boolean bool2 = this.isFloating;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                parcel.writeParcelable(this.deepLink, i12);
                parcel.writeString(this.iconName);
                parcel.writeString(this.secondaryText);
                parcel.writeParcelable(this.showEvent, i12);
            }

            public Button(@l String str, @l String str2, @k String str3, @l String str4, @l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l String str5, @l String str6, @l ParametrizedEvent parametrizedEvent) {
                super(null);
                this.id = str;
                this.theme = str2;
                this.title = str3;
                this.style = str4;
                this.isLoading = bool;
                this.isFloating = bool2;
                this.deepLink = deepLink;
                this.iconName = str5;
                this.secondaryText = str6;
                this.showEvent = parametrizedEvent;
            }
        }

        /* compiled from: SafeDeal.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\"#$%&B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$WidthStrategy;", "widthStrategy", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$BuyButton;", "buyButton", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton;", "cartButton", "", "isCartButtonOnLeft", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$FreeDeliveryBlock;", "freeDeliveryBlock", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$WidthStrategy;Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$BuyButton;Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton;Ljava/lang/Boolean;Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$FreeDeliveryBlock;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$WidthStrategy;", "f", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$WidthStrategy;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$BuyButton;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$BuyButton;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton;", "d", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$FreeDeliveryBlock;", "e", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$FreeDeliveryBlock;", "a", "BuyButton", "CartButton", "FreeDeliveryBlock", "WidthStrategy", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class CombinedButtons extends Component {

            @k
            public static final Parcelable.Creator<CombinedButtons> CREATOR = new b();

            @c("buyButton")
            @k
            private final BuyButton buyButton;

            @c("cartButton")
            @k
            private final CartButton cartButton;

            @c("freeDeliveryBlock")
            @l
            private final FreeDeliveryBlock freeDeliveryBlock;

            @c("id")
            @l
            private final String id;

            @c("isCartButtonOnLeft")
            @l
            private final Boolean isCartButtonOnLeft;

            @c("widthStrategy")
            @l
            private final WidthStrategy widthStrategy;

            /* compiled from: SafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$BuyButton;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$a;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", "subtitle", "", "isLoading", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "getTheme", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class BuyButton implements a, Parcelable {

                @k
                public static final Parcelable.Creator<BuyButton> CREATOR = new a();

                @c("isLoading")
                @l
                private final Boolean isLoading;

                @c("onTapDeepLink")
                @k
                private final DeepLink onTapDeepLink;

                @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                @k
                private final String style;

                @c("subtitle")
                @l
                private final String subtitle;

                @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
                @k
                private final String theme;

                @c("title")
                @k
                private final String title;

                /* compiled from: SafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<BuyButton> {
                    @Override // android.os.Parcelable.Creator
                    public final BuyButton createFromParcel(Parcel parcel) {
                        Boolean boolValueOf;
                        DeepLink deepLink = (DeepLink) parcel.readParcelable(BuyButton.class.getClassLoader());
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new BuyButton(deepLink, string, string2, string3, string4, boolValueOf);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final BuyButton[] newArray(int i12) {
                        return new BuyButton[i12];
                    }
                }

                public BuyButton(@k DeepLink deepLink, @k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool) {
                    this.onTapDeepLink = deepLink;
                    this.style = str;
                    this.theme = str2;
                    this.title = str3;
                    this.subtitle = str4;
                    this.isLoading = bool;
                }

                public static BuyButton a(BuyButton buyButton, Boolean bool) {
                    DeepLink deepLink = buyButton.onTapDeepLink;
                    String str = buyButton.style;
                    String str2 = buyButton.theme;
                    String str3 = buyButton.title;
                    String str4 = buyButton.subtitle;
                    buyButton.getClass();
                    return new BuyButton(deepLink, str, str2, str3, str4, bool);
                }

                @k
                /* renamed from: c, reason: from getter */
                public final DeepLink getOnTapDeepLink() {
                    return this.onTapDeepLink;
                }

                @l
                /* renamed from: d, reason: from getter */
                public final Boolean getIsLoading() {
                    return this.isLoading;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BuyButton)) {
                        return false;
                    }
                    BuyButton buyButton = (BuyButton) obj;
                    return L.f(this.onTapDeepLink, buyButton.onTapDeepLink) && L.f(this.style, buyButton.style) && L.f(this.theme, buyButton.theme) && L.f(this.title, buyButton.title) && L.f(this.subtitle, buyButton.subtitle) && L.f(this.isLoading, buyButton.isLoading);
                }

                @k
                public final String getStyle() {
                    return this.style;
                }

                @l
                public final String getSubtitle() {
                    return this.subtitle;
                }

                @k
                public final String getTheme() {
                    return this.theme;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                public final int hashCode() {
                    int iD2 = H.d(H.d(H.d(this.onTapDeepLink.hashCode() * 31, 31, this.style), 31, this.theme), 31, this.title);
                    String str = this.subtitle;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.isLoading;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("BuyButton(onTapDeepLink=");
                    sb2.append(this.onTapDeepLink);
                    sb2.append(", style=");
                    sb2.append(this.style);
                    sb2.append(", theme=");
                    sb2.append(this.theme);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", subtitle=");
                    sb2.append(this.subtitle);
                    sb2.append(", isLoading=");
                    return C0.g(sb2, this.isLoading, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.onTapDeepLink, i12);
                    parcel.writeString(this.style);
                    parcel.writeString(this.theme);
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                    Boolean bool = this.isLoading;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool);
                    }
                }
            }

            /* compiled from: SafeDeal.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$AddToCartButton;", "addToCartButton", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$GoToCartButton;", "goToCartButton", "", "maxQuantity", "quantity", "", "", "cartUpdateRequestParams", "<init>", "(Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$AddToCartButton;Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$GoToCartButton;IILjava/util/Map;)V", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$AddToCartButton;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$AddToCartButton;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$GoToCartButton;", "e", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$GoToCartButton;", "I", "getMaxQuantity", "()I", "f", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "AddToCartButton", "GoToCartButton", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class CartButton implements Parcelable {

                @k
                public static final Parcelable.Creator<CartButton> CREATOR = new a();

                @c("addToCartButton")
                @k
                private final AddToCartButton addToCartButton;

                @c("cartUpdateRequestParams")
                @l
                private final Map<String, String> cartUpdateRequestParams;

                @c("goToCartButton")
                @k
                private final GoToCartButton goToCartButton;

                @c("maxQuantity")
                private final int maxQuantity;

                @c("quantity")
                private final int quantity;

                /* compiled from: SafeDeal.kt */
                @d
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$AddToCartButton;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$a;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", "subtitle", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "getTheme", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class AddToCartButton implements a, Parcelable {

                    @k
                    public static final Parcelable.Creator<AddToCartButton> CREATOR = new a();

                    @c("isLoading")
                    @l
                    private final Boolean isLoading;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                    @k
                    private final String style;

                    @c("subtitle")
                    @l
                    private final String subtitle;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
                    @k
                    private final String theme;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: SafeDeal.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<AddToCartButton> {
                        @Override // android.os.Parcelable.Creator
                        public final AddToCartButton createFromParcel(Parcel parcel) {
                            Boolean boolValueOf;
                            String string = parcel.readString();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            String string4 = parcel.readString();
                            if (parcel.readInt() == 0) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            return new AddToCartButton(string, string2, string3, string4, boolValueOf);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final AddToCartButton[] newArray(int i12) {
                            return new AddToCartButton[i12];
                        }
                    }

                    public AddToCartButton(@k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool) {
                        this.style = str;
                        this.theme = str2;
                        this.title = str3;
                        this.subtitle = str4;
                        this.isLoading = bool;
                    }

                    public static AddToCartButton a(AddToCartButton addToCartButton, Boolean bool) {
                        String str = addToCartButton.style;
                        String str2 = addToCartButton.theme;
                        String str3 = addToCartButton.title;
                        String str4 = addToCartButton.subtitle;
                        addToCartButton.getClass();
                        return new AddToCartButton(str, str2, str3, str4, bool);
                    }

                    @l
                    /* renamed from: c, reason: from getter */
                    public final Boolean getIsLoading() {
                        return this.isLoading;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof AddToCartButton)) {
                            return false;
                        }
                        AddToCartButton addToCartButton = (AddToCartButton) obj;
                        return L.f(this.style, addToCartButton.style) && L.f(this.theme, addToCartButton.theme) && L.f(this.title, addToCartButton.title) && L.f(this.subtitle, addToCartButton.subtitle) && L.f(this.isLoading, addToCartButton.isLoading);
                    }

                    @k
                    public final String getStyle() {
                        return this.style;
                    }

                    @l
                    public final String getSubtitle() {
                        return this.subtitle;
                    }

                    @k
                    public final String getTheme() {
                        return this.theme;
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iD2 = H.d(H.d(this.style.hashCode() * 31, 31, this.theme), 31, this.title);
                        String str = this.subtitle;
                        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                        Boolean bool = this.isLoading;
                        return iHashCode + (bool != null ? bool.hashCode() : 0);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("AddToCartButton(style=");
                        sb2.append(this.style);
                        sb2.append(", theme=");
                        sb2.append(this.theme);
                        sb2.append(", title=");
                        sb2.append(this.title);
                        sb2.append(", subtitle=");
                        sb2.append(this.subtitle);
                        sb2.append(", isLoading=");
                        return C0.g(sb2, this.isLoading, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.style);
                        parcel.writeString(this.theme);
                        parcel.writeString(this.title);
                        parcel.writeString(this.subtitle);
                        Boolean bool = this.isLoading;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.l(parcel, 1, bool);
                        }
                    }
                }

                /* compiled from: SafeDeal.kt */
                @d
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$CartButton$GoToCartButton;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$a;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", "subtitle", "", "isLoading", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "getTheme", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class GoToCartButton implements a, Parcelable {

                    @k
                    public static final Parcelable.Creator<GoToCartButton> CREATOR = new a();

                    @c("isLoading")
                    @l
                    private final Boolean isLoading;

                    @c("onTapDeepLink")
                    @k
                    private final DeepLink onTapDeepLink;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
                    @k
                    private final String style;

                    @c("subtitle")
                    @l
                    private final String subtitle;

                    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
                    @k
                    private final String theme;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: SafeDeal.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<GoToCartButton> {
                        @Override // android.os.Parcelable.Creator
                        public final GoToCartButton createFromParcel(Parcel parcel) {
                            Boolean boolValueOf;
                            String string = parcel.readString();
                            String string2 = parcel.readString();
                            String string3 = parcel.readString();
                            String string4 = parcel.readString();
                            if (parcel.readInt() == 0) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            return new GoToCartButton(string, string2, string3, string4, boolValueOf, (DeepLink) parcel.readParcelable(GoToCartButton.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final GoToCartButton[] newArray(int i12) {
                            return new GoToCartButton[i12];
                        }
                    }

                    public GoToCartButton(@k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool, @k DeepLink deepLink) {
                        this.style = str;
                        this.theme = str2;
                        this.title = str3;
                        this.subtitle = str4;
                        this.isLoading = bool;
                        this.onTapDeepLink = deepLink;
                    }

                    public static GoToCartButton a(GoToCartButton goToCartButton, Boolean bool) {
                        String str = goToCartButton.style;
                        String str2 = goToCartButton.theme;
                        String str3 = goToCartButton.title;
                        String str4 = goToCartButton.subtitle;
                        DeepLink deepLink = goToCartButton.onTapDeepLink;
                        goToCartButton.getClass();
                        return new GoToCartButton(str, str2, str3, str4, bool, deepLink);
                    }

                    @k
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getOnTapDeepLink() {
                        return this.onTapDeepLink;
                    }

                    @l
                    /* renamed from: d, reason: from getter */
                    public final Boolean getIsLoading() {
                        return this.isLoading;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof GoToCartButton)) {
                            return false;
                        }
                        GoToCartButton goToCartButton = (GoToCartButton) obj;
                        return L.f(this.style, goToCartButton.style) && L.f(this.theme, goToCartButton.theme) && L.f(this.title, goToCartButton.title) && L.f(this.subtitle, goToCartButton.subtitle) && L.f(this.isLoading, goToCartButton.isLoading) && L.f(this.onTapDeepLink, goToCartButton.onTapDeepLink);
                    }

                    @k
                    public final String getStyle() {
                        return this.style;
                    }

                    @l
                    public final String getSubtitle() {
                        return this.subtitle;
                    }

                    @k
                    public final String getTheme() {
                        return this.theme;
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iD2 = H.d(H.d(this.style.hashCode() * 31, 31, this.theme), 31, this.title);
                        String str = this.subtitle;
                        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                        Boolean bool = this.isLoading;
                        return this.onTapDeepLink.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("GoToCartButton(style=");
                        sb2.append(this.style);
                        sb2.append(", theme=");
                        sb2.append(this.theme);
                        sb2.append(", title=");
                        sb2.append(this.title);
                        sb2.append(", subtitle=");
                        sb2.append(this.subtitle);
                        sb2.append(", isLoading=");
                        sb2.append(this.isLoading);
                        sb2.append(", onTapDeepLink=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.onTapDeepLink, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.style);
                        parcel.writeString(this.theme);
                        parcel.writeString(this.title);
                        parcel.writeString(this.subtitle);
                        Boolean bool = this.isLoading;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.l(parcel, 1, bool);
                        }
                        parcel.writeParcelable(this.onTapDeepLink, i12);
                    }
                }

                /* compiled from: SafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<CartButton> {
                    @Override // android.os.Parcelable.Creator
                    public final CartButton createFromParcel(Parcel parcel) {
                        LinkedHashMap linkedHashMap;
                        AddToCartButton addToCartButtonCreateFromParcel = AddToCartButton.CREATOR.createFromParcel(parcel);
                        GoToCartButton goToCartButtonCreateFromParcel = GoToCartButton.CREATOR.createFromParcel(parcel);
                        int i12 = parcel.readInt();
                        int i13 = parcel.readInt();
                        if (parcel.readInt() == 0) {
                            linkedHashMap = null;
                        } else {
                            int i14 = parcel.readInt();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                            int iA2 = 0;
                            while (iA2 != i14) {
                                iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                            }
                            linkedHashMap = linkedHashMap2;
                        }
                        return new CartButton(addToCartButtonCreateFromParcel, goToCartButtonCreateFromParcel, i12, i13, linkedHashMap);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final CartButton[] newArray(int i12) {
                        return new CartButton[i12];
                    }
                }

                public CartButton(@k AddToCartButton addToCartButton, @k GoToCartButton goToCartButton, int i12, int i13, @l Map<String, String> map) {
                    this.addToCartButton = addToCartButton;
                    this.goToCartButton = goToCartButton;
                    this.maxQuantity = i12;
                    this.quantity = i13;
                    this.cartUpdateRequestParams = map;
                }

                public static CartButton a(CartButton cartButton, AddToCartButton addToCartButton, GoToCartButton goToCartButton, int i12, int i13, int i14) {
                    if ((i14 & 1) != 0) {
                        addToCartButton = cartButton.addToCartButton;
                    }
                    AddToCartButton addToCartButton2 = addToCartButton;
                    if ((i14 & 2) != 0) {
                        goToCartButton = cartButton.goToCartButton;
                    }
                    GoToCartButton goToCartButton2 = goToCartButton;
                    if ((i14 & 4) != 0) {
                        i12 = cartButton.maxQuantity;
                    }
                    int i15 = i12;
                    if ((i14 & 8) != 0) {
                        i13 = cartButton.quantity;
                    }
                    Map<String, String> map = cartButton.cartUpdateRequestParams;
                    cartButton.getClass();
                    return new CartButton(addToCartButton2, goToCartButton2, i15, i13, map);
                }

                @k
                /* renamed from: c, reason: from getter */
                public final AddToCartButton getAddToCartButton() {
                    return this.addToCartButton;
                }

                @l
                public final Map<String, String> d() {
                    return this.cartUpdateRequestParams;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @k
                /* renamed from: e, reason: from getter */
                public final GoToCartButton getGoToCartButton() {
                    return this.goToCartButton;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CartButton)) {
                        return false;
                    }
                    CartButton cartButton = (CartButton) obj;
                    return L.f(this.addToCartButton, cartButton.addToCartButton) && L.f(this.goToCartButton, cartButton.goToCartButton) && this.maxQuantity == cartButton.maxQuantity && this.quantity == cartButton.quantity && L.f(this.cartUpdateRequestParams, cartButton.cartUpdateRequestParams);
                }

                /* renamed from: f, reason: from getter */
                public final int getQuantity() {
                    return this.quantity;
                }

                public final int getMaxQuantity() {
                    return this.maxQuantity;
                }

                public final int hashCode() {
                    int iE2 = r.e(this.quantity, r.e(this.maxQuantity, (this.goToCartButton.hashCode() + (this.addToCartButton.hashCode() * 31)) * 31, 31), 31);
                    Map<String, String> map = this.cartUpdateRequestParams;
                    return iE2 + (map == null ? 0 : map.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("CartButton(addToCartButton=");
                    sb2.append(this.addToCartButton);
                    sb2.append(", goToCartButton=");
                    sb2.append(this.goToCartButton);
                    sb2.append(", maxQuantity=");
                    sb2.append(this.maxQuantity);
                    sb2.append(", quantity=");
                    sb2.append(this.quantity);
                    sb2.append(", cartUpdateRequestParams=");
                    return r.w(sb2, this.cartUpdateRequestParams, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    this.addToCartButton.writeToParcel(parcel, i12);
                    this.goToCartButton.writeToParcel(parcel, i12);
                    parcel.writeInt(this.maxQuantity);
                    parcel.writeInt(this.quantity);
                    Map<String, String> map = this.cartUpdateRequestParams;
                    if (map == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    Iterator itH = C0.h(parcel, 1, map);
                    while (itH.hasNext()) {
                        Map.Entry entry = (Map.Entry) itH.next();
                        parcel.writeString((String) entry.getKey());
                        parcel.writeString((String) entry.getValue());
                    }
                }
            }

            /* compiled from: SafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$FreeDeliveryBlock;", "Landroid/os/Parcelable;", "", "text", "", "isRequested", "isLoading", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Z", "d", "()Z", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class FreeDeliveryBlock implements Parcelable {

                @k
                public static final Parcelable.Creator<FreeDeliveryBlock> CREATOR = new a();

                @c("isLoading")
                @l
                private final Boolean isLoading;

                @c("isRequested")
                private final boolean isRequested;

                @c("text")
                @k
                private final String text;

                /* compiled from: SafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<FreeDeliveryBlock> {
                    @Override // android.os.Parcelable.Creator
                    public final FreeDeliveryBlock createFromParcel(Parcel parcel) {
                        Boolean boolValueOf;
                        String string = parcel.readString();
                        boolean z12 = parcel.readInt() != 0;
                        if (parcel.readInt() == 0) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new FreeDeliveryBlock(string, z12, boolValueOf);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final FreeDeliveryBlock[] newArray(int i12) {
                        return new FreeDeliveryBlock[i12];
                    }
                }

                public FreeDeliveryBlock(@k String str, boolean z12, @l Boolean bool) {
                    this.text = str;
                    this.isRequested = z12;
                    this.isLoading = bool;
                }

                public static FreeDeliveryBlock a(FreeDeliveryBlock freeDeliveryBlock, Boolean bool) {
                    return new FreeDeliveryBlock(freeDeliveryBlock.text, freeDeliveryBlock.isRequested, bool);
                }

                @l
                /* renamed from: c, reason: from getter */
                public final Boolean getIsLoading() {
                    return this.isLoading;
                }

                /* renamed from: d, reason: from getter */
                public final boolean getIsRequested() {
                    return this.isRequested;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FreeDeliveryBlock)) {
                        return false;
                    }
                    FreeDeliveryBlock freeDeliveryBlock = (FreeDeliveryBlock) obj;
                    return L.f(this.text, freeDeliveryBlock.text) && this.isRequested == freeDeliveryBlock.isRequested && L.f(this.isLoading, freeDeliveryBlock.isLoading);
                }

                @k
                public final String getText() {
                    return this.text;
                }

                public final int hashCode() {
                    int i12 = r.i(this.text.hashCode() * 31, 31, this.isRequested);
                    Boolean bool = this.isLoading;
                    return i12 + (bool == null ? 0 : bool.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("FreeDeliveryBlock(text=");
                    sb2.append(this.text);
                    sb2.append(", isRequested=");
                    sb2.append(this.isRequested);
                    sb2.append(", isLoading=");
                    return C0.g(sb2, this.isLoading, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.text);
                    parcel.writeInt(this.isRequested ? 1 : 0);
                    Boolean bool = this.isLoading;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool);
                    }
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: SafeDeal.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$WidthStrategy;", "", "(Ljava/lang/String;I)V", "EQUAL", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class WidthStrategy {

                @c("equal")
                public static final WidthStrategy EQUAL;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ WidthStrategy[] f254346b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f254347c;

                static {
                    WidthStrategy widthStrategy = new WidthStrategy("EQUAL", 0);
                    EQUAL = widthStrategy;
                    WidthStrategy[] widthStrategyArr = {widthStrategy};
                    f254346b = widthStrategyArr;
                    f254347c = kotlin.enums.c.a(widthStrategyArr);
                }

                private WidthStrategy(String str, int i12) {
                }

                public static WidthStrategy valueOf(String str) {
                    return (WidthStrategy) Enum.valueOf(WidthStrategy.class, str);
                }

                public static WidthStrategy[] values() {
                    return (WidthStrategy[]) f254346b.clone();
                }
            }

            /* compiled from: SafeDeal.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$CombinedButtons$a;", "", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface a {
            }

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<CombinedButtons> {
                @Override // android.os.Parcelable.Creator
                public final CombinedButtons createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    WidthStrategy widthStrategyValueOf = parcel.readInt() == 0 ? null : WidthStrategy.valueOf(parcel.readString());
                    BuyButton buyButtonCreateFromParcel = BuyButton.CREATOR.createFromParcel(parcel);
                    CartButton cartButtonCreateFromParcel = CartButton.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new CombinedButtons(string, widthStrategyValueOf, buyButtonCreateFromParcel, cartButtonCreateFromParcel, boolValueOf, parcel.readInt() != 0 ? FreeDeliveryBlock.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final CombinedButtons[] newArray(int i12) {
                    return new CombinedButtons[i12];
                }
            }

            public CombinedButtons(@l String str, @l WidthStrategy widthStrategy, @k BuyButton buyButton, @k CartButton cartButton, @l Boolean bool, @l FreeDeliveryBlock freeDeliveryBlock) {
                super(null);
                this.id = str;
                this.widthStrategy = widthStrategy;
                this.buyButton = buyButton;
                this.cartButton = cartButton;
                this.isCartButtonOnLeft = bool;
                this.freeDeliveryBlock = freeDeliveryBlock;
            }

            public static CombinedButtons a(CombinedButtons combinedButtons, BuyButton buyButton, CartButton cartButton, FreeDeliveryBlock freeDeliveryBlock, int i12) {
                String str = combinedButtons.id;
                WidthStrategy widthStrategy = (i12 & 2) != 0 ? combinedButtons.widthStrategy : null;
                if ((i12 & 4) != 0) {
                    buyButton = combinedButtons.buyButton;
                }
                BuyButton buyButton2 = buyButton;
                if ((i12 & 8) != 0) {
                    cartButton = combinedButtons.cartButton;
                }
                CartButton cartButton2 = cartButton;
                Boolean bool = combinedButtons.isCartButtonOnLeft;
                if ((i12 & 32) != 0) {
                    freeDeliveryBlock = combinedButtons.freeDeliveryBlock;
                }
                combinedButtons.getClass();
                return new CombinedButtons(str, widthStrategy, buyButton2, cartButton2, bool, freeDeliveryBlock);
            }

            @k
            /* renamed from: c, reason: from getter */
            public final BuyButton getBuyButton() {
                return this.buyButton;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final CartButton getCartButton() {
                return this.cartButton;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final FreeDeliveryBlock getFreeDeliveryBlock() {
                return this.freeDeliveryBlock;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CombinedButtons)) {
                    return false;
                }
                CombinedButtons combinedButtons = (CombinedButtons) obj;
                return L.f(this.id, combinedButtons.id) && this.widthStrategy == combinedButtons.widthStrategy && L.f(this.buyButton, combinedButtons.buyButton) && L.f(this.cartButton, combinedButtons.cartButton) && L.f(this.isCartButtonOnLeft, combinedButtons.isCartButtonOnLeft) && L.f(this.freeDeliveryBlock, combinedButtons.freeDeliveryBlock);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final WidthStrategy getWidthStrategy() {
                return this.widthStrategy;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Boolean getIsCartButtonOnLeft() {
                return this.isCartButtonOnLeft;
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                WidthStrategy widthStrategy = this.widthStrategy;
                int iHashCode2 = (this.cartButton.hashCode() + ((this.buyButton.hashCode() + ((iHashCode + (widthStrategy == null ? 0 : widthStrategy.hashCode())) * 31)) * 31)) * 31;
                Boolean bool = this.isCartButtonOnLeft;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                FreeDeliveryBlock freeDeliveryBlock = this.freeDeliveryBlock;
                return iHashCode3 + (freeDeliveryBlock != null ? freeDeliveryBlock.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "CombinedButtons(id=" + this.id + ", widthStrategy=" + this.widthStrategy + ", buyButton=" + this.buyButton + ", cartButton=" + this.cartButton + ", isCartButtonOnLeft=" + this.isCartButtonOnLeft + ", freeDeliveryBlock=" + this.freeDeliveryBlock + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                WidthStrategy widthStrategy = this.widthStrategy;
                if (widthStrategy == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(widthStrategy.name());
                }
                this.buyButton.writeToParcel(parcel, i12);
                this.cartButton.writeToParcel(parcel, i12);
                Boolean bool = this.isCartButtonOnLeft;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                FreeDeliveryBlock freeDeliveryBlock = this.freeDeliveryBlock;
                if (freeDeliveryBlock == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    freeDeliveryBlock.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$ExpandableListItem;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "analyticsId", "", "isExpanded", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "c", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ExpandableListItem extends Component {

            @k
            public static final Parcelable.Creator<ExpandableListItem> CREATOR = new a();

            @c("analyticsId")
            @l
            private final String analyticsId;

            /* renamed from: b, reason: collision with root package name */
            public final transient boolean f254348b;

            @c("description")
            @k
            private final AttributedText description;

            @c("id")
            @l
            private final String id;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ExpandableListItem> {
                @Override // android.os.Parcelable.Creator
                public final ExpandableListItem createFromParcel(Parcel parcel) {
                    return new ExpandableListItem(parcel.readString(), (AttributedText) parcel.readParcelable(ExpandableListItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ExpandableListItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExpandableListItem[] newArray(int i12) {
                    return new ExpandableListItem[i12];
                }
            }

            public /* synthetic */ ExpandableListItem(String str, AttributedText attributedText, AttributedText attributedText2, String str2, boolean z12, int i12, C42822w c42822w) {
                this(str, attributedText, attributedText2, str2, (i12 & 16) != 0 ? false : z12);
            }

            public static ExpandableListItem a(ExpandableListItem expandableListItem, boolean z12) {
                String str = expandableListItem.id;
                AttributedText attributedText = expandableListItem.title;
                AttributedText attributedText2 = expandableListItem.description;
                String str2 = expandableListItem.analyticsId;
                expandableListItem.getClass();
                return new ExpandableListItem(str, attributedText, attributedText2, str2, z12);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExpandableListItem)) {
                    return false;
                }
                ExpandableListItem expandableListItem = (ExpandableListItem) obj;
                return L.f(this.id, expandableListItem.id) && L.f(this.title, expandableListItem.title) && L.f(this.description, expandableListItem.description) && L.f(this.analyticsId, expandableListItem.analyticsId) && this.f254348b == expandableListItem.f254348b;
            }

            @k
            public final AttributedText getDescription() {
                return this.description;
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.description);
                String str2 = this.analyticsId;
                return Boolean.hashCode(this.f254348b) + ((iB2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ExpandableListItem(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", analyticsId=");
                sb2.append(this.analyticsId);
                sb2.append(", isExpanded=");
                return r.x(sb2, this.f254348b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.title, i12);
                parcel.writeParcelable(this.description, i12);
                parcel.writeString(this.analyticsId);
                parcel.writeInt(this.f254348b ? 1 : 0);
            }

            public ExpandableListItem(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l String str2, boolean z12) {
                super(null);
                this.id = str;
                this.title = attributedText;
                this.description = attributedText2;
                this.analyticsId = str2;
                this.f254348b = z12;
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Header;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "infoDeeplink", "titleDeeplink", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "e", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Header extends Component {

            @k
            public static final Parcelable.Creator<Header> CREATOR = new a();

            @c("id")
            @l
            private final String id;

            @c("infoDeepLink")
            @l
            private final DeepLink infoDeeplink;

            @c("title")
            @k
            private final AttributedText title;

            @c("titleDeepLink")
            @l
            private final DeepLink titleDeeplink;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Header> {
                @Override // android.os.Parcelable.Creator
                public final Header createFromParcel(Parcel parcel) {
                    return new Header(parcel.readString(), (AttributedText) parcel.readParcelable(Header.class.getClassLoader()), (DeepLink) parcel.readParcelable(Header.class.getClassLoader()), (DeepLink) parcel.readParcelable(Header.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Header[] newArray(int i12) {
                    return new Header[i12];
                }
            }

            public Header(@l String str, @k AttributedText attributedText, @l DeepLink deepLink, @l DeepLink deepLink2) {
                super(null);
                this.id = str;
                this.title = attributedText;
                this.infoDeeplink = deepLink;
                this.titleDeeplink = deepLink2;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final DeepLink getInfoDeeplink() {
                return this.infoDeeplink;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final DeepLink getTitleDeeplink() {
                return this.titleDeeplink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return L.f(this.id, header.id) && L.f(this.title, header.title) && L.f(this.infoDeeplink, header.infoDeeplink) && L.f(this.titleDeeplink, header.titleDeeplink);
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iB2 = com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                DeepLink deepLink = this.infoDeeplink;
                int iHashCode = (iB2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                DeepLink deepLink2 = this.titleDeeplink;
                return iHashCode + (deepLink2 != null ? deepLink2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Header(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", infoDeeplink=");
                sb2.append(this.infoDeeplink);
                sb2.append(", titleDeeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.titleDeeplink, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.title, i12);
                parcel.writeParcelable(this.infoDeeplink, i12);
                parcel.writeParcelable(this.titleDeeplink, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$ListItem;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$LocalIcon;", "localIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "hintDeepLink", "badgeText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/safedeal/SafeDeal$Component$LocalIcon;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$LocalIcon;", "e", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$LocalIcon;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ListItem extends Component {

            @k
            public static final Parcelable.Creator<ListItem> CREATOR = new a();

            @c("badgeText")
            @l
            private final String badgeText;

            @c("hintDeepLink")
            @l
            private final DeepLink hintDeepLink;

            @c("id")
            @l
            private final String id;

            @c("localIcon")
            @l
            private final LocalIcon localIcon;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ListItem> {
                @Override // android.os.Parcelable.Creator
                public final ListItem createFromParcel(Parcel parcel) {
                    return new ListItem(parcel.readString(), (AttributedText) parcel.readParcelable(ListItem.class.getClassLoader()), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(ListItem.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ListItem[] newArray(int i12) {
                    return new ListItem[i12];
                }
            }

            public /* synthetic */ ListItem(String str, AttributedText attributedText, LocalIcon localIcon, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
                this(str, attributedText, localIcon, deepLink, (i12 & 16) != 0 ? null : str2);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getBadgeText() {
                return this.badgeText;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final DeepLink getHintDeepLink() {
                return this.hintDeepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final LocalIcon getLocalIcon() {
                return this.localIcon;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ListItem)) {
                    return false;
                }
                ListItem listItem = (ListItem) obj;
                return L.f(this.id, listItem.id) && L.f(this.title, listItem.title) && L.f(this.localIcon, listItem.localIcon) && L.f(this.hintDeepLink, listItem.hintDeepLink) && L.f(this.badgeText, listItem.badgeText);
            }

            @k
            /* renamed from: f, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iB2 = com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                LocalIcon localIcon = this.localIcon;
                int iHashCode = (iB2 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
                DeepLink deepLink = this.hintDeepLink;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                String str2 = this.badgeText;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ListItem(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", localIcon=");
                sb2.append(this.localIcon);
                sb2.append(", hintDeepLink=");
                sb2.append(this.hintDeepLink);
                sb2.append(", badgeText=");
                return C22026a.c(sb2, this.badgeText, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.title, i12);
                LocalIcon localIcon = this.localIcon;
                if (localIcon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    localIcon.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.hintDeepLink, i12);
                parcel.writeString(this.badgeText);
            }

            public ListItem(@l String str, @k AttributedText attributedText, @l LocalIcon localIcon, @l DeepLink deepLink, @l String str2) {
                super(null);
                this.id = str;
                this.title = attributedText;
                this.localIcon = localIcon;
                this.hintDeepLink = deepLink;
                this.badgeText = str2;
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$LocalIcon;", "Landroid/os/Parcelable;", "", "name", "color", "", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/lang/Float;", "e", "()Ljava/lang/Float;", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LocalIcon implements Parcelable {

            @k
            public static final Parcelable.Creator<LocalIcon> CREATOR = new a();

            @c("color")
            @l
            private final String color;

            @c("height")
            @l
            private final Float height;

            @c("name")
            @k
            private final String name;

            @c("width")
            @l
            private final Float width;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<LocalIcon> {
                @Override // android.os.Parcelable.Creator
                public final LocalIcon createFromParcel(Parcel parcel) {
                    return new LocalIcon(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final LocalIcon[] newArray(int i12) {
                    return new LocalIcon[i12];
                }
            }

            public LocalIcon(@k String str, @l String str2, @l Float f12, @l Float f13) {
                this.name = str;
                this.color = str2;
                this.width = f12;
                this.height = f13;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final Float getHeight() {
                return this.height;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Float getWidth() {
                return this.width;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LocalIcon)) {
                    return false;
                }
                LocalIcon localIcon = (LocalIcon) obj;
                return L.f(this.name, localIcon.name) && L.f(this.color, localIcon.color) && L.f(this.width, localIcon.width) && L.f(this.height, localIcon.height);
            }

            @k
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                String str = this.color;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Float f12 = this.width;
                int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
                Float f13 = this.height;
                return iHashCode3 + (f13 != null ? f13.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LocalIcon(name=");
                sb2.append(this.name);
                sb2.append(", color=");
                sb2.append(this.color);
                sb2.append(", width=");
                sb2.append(this.width);
                sb2.append(", height=");
                return h.d(sb2, this.height, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.name);
                parcel.writeString(this.color);
                Float f12 = this.width;
                if (f12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.B(parcel, 1, f12);
                }
                Float f13 = this.height;
                if (f13 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.B(parcel, 1, f13);
                }
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Spacing;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "", "height", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Spacing extends Component {

            @k
            public static final Parcelable.Creator<Spacing> CREATOR = new a();

            @c("height")
            @l
            private final Float height;

            @c("id")
            @l
            private final String id;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Spacing> {
                @Override // android.os.Parcelable.Creator
                public final Spacing createFromParcel(Parcel parcel) {
                    return new Spacing(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
                }

                @Override // android.os.Parcelable.Creator
                public final Spacing[] newArray(int i12) {
                    return new Spacing[i12];
                }
            }

            public Spacing(@l String str, @l Float f12) {
                super(null);
                this.id = str;
                this.height = f12;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Float getHeight() {
                return this.height;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Spacing)) {
                    return false;
                }
                Spacing spacing = (Spacing) obj;
                return L.f(this.id, spacing.id) && L.f(this.height, spacing.height);
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Float f12 = this.height;
                return iHashCode + (f12 != null ? f12.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Spacing(id=");
                sb2.append(this.id);
                sb2.append(", height=");
                return h.d(sb2, this.height, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                Float f12 = this.height;
                if (f12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.B(parcel, 1, f12);
                }
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$SplitText;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "leftText", "rightText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SplitText extends Component {

            @k
            public static final Parcelable.Creator<SplitText> CREATOR = new a();

            @c("id")
            @l
            private final String id;

            @c("leftText")
            @l
            private final AttributedText leftText;

            @c("rightText")
            @l
            private final AttributedText rightText;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SplitText> {
                @Override // android.os.Parcelable.Creator
                public final SplitText createFromParcel(Parcel parcel) {
                    return new SplitText(parcel.readString(), (AttributedText) parcel.readParcelable(SplitText.class.getClassLoader()), (AttributedText) parcel.readParcelable(SplitText.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SplitText[] newArray(int i12) {
                    return new SplitText[i12];
                }
            }

            public SplitText(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2) {
                super(null);
                this.id = str;
                this.leftText = attributedText;
                this.rightText = attributedText2;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final AttributedText getLeftText() {
                return this.leftText;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final AttributedText getRightText() {
                return this.rightText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SplitText)) {
                    return false;
                }
                SplitText splitText = (SplitText) obj;
                return L.f(this.id, splitText.id) && L.f(this.leftText, splitText.leftText) && L.f(this.rightText, splitText.rightText);
            }

            @l
            public final String getId() {
                return this.id;
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AttributedText attributedText = this.leftText;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                AttributedText attributedText2 = this.rightText;
                return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SplitText(id=");
                sb2.append(this.id);
                sb2.append(", leftText=");
                sb2.append(this.leftText);
                sb2.append(", rightText=");
                return com.avito.android.actions_sheet.a.w(sb2, this.rightText, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.leftText, i12);
                parcel.writeParcelable(this.rightText, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Text;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/safedeal/SafeDeal$Alignment;", "alignment", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "numberOfLines", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/safedeal/SafeDeal$Alignment;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/safedeal/SafeDeal$Alignment;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$Alignment;", "getStyle", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Text extends Component {

            @k
            public static final Parcelable.Creator<Text> CREATOR = new a();

            @c("alignment")
            @l
            private final Alignment alignment;

            @c("attributedText")
            @k
            private final AttributedText attributedText;

            @c("id")
            @l
            private final String id;

            @c("numberOfLines")
            @l
            private final Integer numberOfLines;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final String style;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Text> {
                @Override // android.os.Parcelable.Creator
                public final Text createFromParcel(Parcel parcel) {
                    return new Text(parcel.readString(), (AttributedText) parcel.readParcelable(Text.class.getClassLoader()), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Text[] newArray(int i12) {
                    return new Text[i12];
                }
            }

            public Text(@l String str, @k AttributedText attributedText, @l Alignment alignment, @l String str2, @l Integer num) {
                super(null);
                this.id = str;
                this.attributedText = attributedText;
                this.alignment = alignment;
                this.style = str2;
                this.numberOfLines = num;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Alignment getAlignment() {
                return this.alignment;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getAttributedText() {
                return this.attributedText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Integer getNumberOfLines() {
                return this.numberOfLines;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return L.f(this.id, text.id) && L.f(this.attributedText, text.attributedText) && this.alignment == text.alignment && L.f(this.style, text.style) && L.f(this.numberOfLines, text.numberOfLines);
            }

            @l
            public final String getId() {
                return this.id;
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            public final int hashCode() {
                String str = this.id;
                int iB2 = com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.attributedText);
                Alignment alignment = this.alignment;
                int iHashCode = (iB2 + (alignment == null ? 0 : alignment.hashCode())) * 31;
                String str2 = this.style;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.numberOfLines;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Text(id=");
                sb2.append(this.id);
                sb2.append(", attributedText=");
                sb2.append(this.attributedText);
                sb2.append(", alignment=");
                sb2.append(this.alignment);
                sb2.append(", style=");
                sb2.append(this.style);
                sb2.append(", numberOfLines=");
                return s.j(sb2, this.numberOfLines, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.attributedText, i12);
                Alignment alignment = this.alignment;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
                parcel.writeString(this.style);
                Integer num = this.numberOfLines;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }
        }

        /* compiled from: SafeDeal.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher$Button;", "button", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher$Button;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher$Button;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher$Button;", "Button", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Voucher extends Component {

            @k
            public static final Parcelable.Creator<Voucher> CREATOR = new a();

            @c("backgroundColor")
            @k
            private final UniversalColor backgroundColor;

            @c("button")
            @k
            private final Button button;

            @c("id")
            @l
            private final String id;

            @c("image")
            @k
            private final UniversalImage image;

            @c("subtitle")
            @k
            private final AttributedText subtitle;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: SafeDeal.kt */
            @d
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Component$Voucher$Button;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "highlightedBackgroundColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Button implements Parcelable {

                @k
                public static final Parcelable.Creator<Button> CREATOR = new a();

                @c("backgroundColor")
                @k
                private final UniversalColor backgroundColor;

                @c("highlightedBackgroundColor")
                @k
                private final UniversalColor highlightedBackgroundColor;

                @c("onTapDeepLink")
                @l
                private final DeepLink onTapDeepLink;

                /* compiled from: SafeDeal.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Button> {
                    @Override // android.os.Parcelable.Creator
                    public final Button createFromParcel(Parcel parcel) {
                        return new Button((UniversalColor) parcel.readParcelable(Button.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Button.class.getClassLoader()), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Button[] newArray(int i12) {
                        return new Button[i12];
                    }
                }

                public Button(@k UniversalColor universalColor, @k UniversalColor universalColor2, @l DeepLink deepLink) {
                    this.backgroundColor = universalColor;
                    this.highlightedBackgroundColor = universalColor2;
                    this.onTapDeepLink = deepLink;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final UniversalColor getHighlightedBackgroundColor() {
                    return this.highlightedBackgroundColor;
                }

                @l
                /* renamed from: d, reason: from getter */
                public final DeepLink getOnTapDeepLink() {
                    return this.onTapDeepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return L.f(this.backgroundColor, button.backgroundColor) && L.f(this.highlightedBackgroundColor, button.highlightedBackgroundColor) && L.f(this.onTapDeepLink, button.onTapDeepLink);
                }

                @k
                public final UniversalColor getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final int hashCode() {
                    int i12 = com.avito.android.actions_sheet.a.i(this.highlightedBackgroundColor, this.backgroundColor.hashCode() * 31, 31);
                    DeepLink deepLink = this.onTapDeepLink;
                    return i12 + (deepLink == null ? 0 : deepLink.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Button(backgroundColor=");
                    sb2.append(this.backgroundColor);
                    sb2.append(", highlightedBackgroundColor=");
                    sb2.append(this.highlightedBackgroundColor);
                    sb2.append(", onTapDeepLink=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.onTapDeepLink, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.backgroundColor, i12);
                    parcel.writeParcelable(this.highlightedBackgroundColor, i12);
                    parcel.writeParcelable(this.onTapDeepLink, i12);
                }
            }

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Voucher> {
                @Override // android.os.Parcelable.Creator
                public final Voucher createFromParcel(Parcel parcel) {
                    return new Voucher(parcel.readString(), (AttributedText) parcel.readParcelable(Voucher.class.getClassLoader()), (AttributedText) parcel.readParcelable(Voucher.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Voucher.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Voucher.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Voucher[] newArray(int i12) {
                    return new Voucher[i12];
                }
            }

            public Voucher(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, @k UniversalImage universalImage, @k UniversalColor universalColor, @k Button button) {
                super(null);
                this.id = str;
                this.title = attributedText;
                this.subtitle = attributedText2;
                this.image = universalImage;
                this.backgroundColor = universalColor;
                this.button = button;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final Button getButton() {
                return this.button;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Voucher)) {
                    return false;
                }
                Voucher voucher = (Voucher) obj;
                return L.f(this.id, voucher.id) && L.f(this.title, voucher.title) && L.f(this.subtitle, voucher.subtitle) && L.f(this.image, voucher.image) && L.f(this.backgroundColor, voucher.backgroundColor) && L.f(this.button, voucher.button);
            }

            @k
            public final UniversalColor getBackgroundColor() {
                return this.backgroundColor;
            }

            @l
            public final String getId() {
                return this.id;
            }

            @k
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            public final int hashCode() {
                String str = this.id;
                return this.button.hashCode() + com.avito.android.actions_sheet.a.i(this.backgroundColor, com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31, this.image), 31);
            }

            @k
            public final String toString() {
                return "Voucher(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", button=" + this.button + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.title, i12);
                parcel.writeParcelable(this.subtitle, i12);
                parcel.writeParcelable(this.image, i12);
                parcel.writeParcelable(this.backgroundColor, i12);
                this.button.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Component(C42822w c42822w) {
            this();
        }

        private Component() {
        }
    }

    /* compiled from: SafeDeal.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$DiscountLabel;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscountLabel implements Parcelable {

        @k
        public static final Parcelable.Creator<DiscountLabel> CREATOR = new a();

        @c("text")
        @k
        private final String text;

        /* compiled from: SafeDeal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DiscountLabel> {
            @Override // android.os.Parcelable.Creator
            public final DiscountLabel createFromParcel(Parcel parcel) {
                return new DiscountLabel(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DiscountLabel[] newArray(int i12) {
                return new DiscountLabel[i12];
            }
        }

        public DiscountLabel(@k String str) {
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DiscountLabel) && L.f(this.text, ((DiscountLabel) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DiscountLabel(text="), this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.text);
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Info;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/safedeal/SafeDeal$Info$OrderType;", "orderType", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/safedeal/SafeDeal$Info$OrderType;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/safedeal/SafeDeal$Info$OrderType;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$Info$OrderType;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "OrderType", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Info implements Parcelable {

        @k
        public static final Parcelable.Creator<Info> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deeplink;

        @c("orderType")
        @l
        private final OrderType orderType;

        @c("title")
        @l
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SafeDeal.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$Info$OrderType;", "", "(Ljava/lang/String;I)V", "DELIVERY", "COURIER", "SAFE_DEAL", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OrderType {

            @c("courier")
            public static final OrderType COURIER;

            @c(NotificationsSettings.Section.SECTION_DELIVERY)
            public static final OrderType DELIVERY;

            @c("safeDeal")
            public static final OrderType SAFE_DEAL;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ OrderType[] f254356b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f254357c;

            static {
                OrderType orderType = new OrderType("DELIVERY", 0);
                DELIVERY = orderType;
                OrderType orderType2 = new OrderType("COURIER", 1);
                COURIER = orderType2;
                OrderType orderType3 = new OrderType("SAFE_DEAL", 2);
                SAFE_DEAL = orderType3;
                OrderType[] orderTypeArr = {orderType, orderType2, orderType3};
                f254356b = orderTypeArr;
                f254357c = kotlin.enums.c.a(orderTypeArr);
            }

            private OrderType(String str, int i12) {
            }

            public static OrderType valueOf(String str) {
                return (OrderType) Enum.valueOf(OrderType.class, str);
            }

            public static OrderType[] values() {
                return (OrderType[]) f254356b.clone();
            }
        }

        /* compiled from: SafeDeal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Info> {
            @Override // android.os.Parcelable.Creator
            public final Info createFromParcel(Parcel parcel) {
                return new Info(parcel.readString(), parcel.readInt() == 0 ? null : OrderType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Info[] newArray(int i12) {
                return new Info[i12];
            }
        }

        public Info(@l String str, @l OrderType orderType, @l DeepLink deepLink) {
            this.title = str;
            this.orderType = orderType;
            this.deeplink = deepLink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final OrderType getOrderType() {
            return this.orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.title, info.title) && this.orderType == info.orderType && L.f(this.deeplink, info.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            OrderType orderType = this.orderType;
            int iHashCode2 = (iHashCode + (orderType == null ? 0 : orderType.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(title=");
            sb2.append(this.title);
            sb2.append(", orderType=");
            sb2.append(this.orderType);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            OrderType orderType = this.orderType;
            if (orderType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(orderType.name());
            }
            parcel.writeParcelable(this.deeplink, i12);
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "Landroid/os/Parcelable;", "()V", "AddToFavoriteDialog", "ChatDialog", "DefaultDialog", "Unknown", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$AddToFavoriteDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$ChatDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$DefaultDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$Unknown;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ReturnCheckoutDialog implements Parcelable {

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$AddToFavoriteDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "Lcom/avito/android/remote/model/Image;", "headerImage", "", "title", "subtitle", "confirmButtonTitle", "blockDialogButtonTitle", "", "blockItemTime", "blockAllItemsTime", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowDialogDeepLink", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/Image;", "f", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getConfirmButtonTitle", "d", "J", "e", "()J", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddToFavoriteDialog extends ReturnCheckoutDialog {

            @k
            public static final Parcelable.Creator<AddToFavoriteDialog> CREATOR = new a();

            @c("blockAllItemsTime")
            private final long blockAllItemsTime;

            @c("blockDialogButtonTitle")
            @k
            private final String blockDialogButtonTitle;

            @c("blockItemTime")
            private final long blockItemTime;

            @c("confirmButtonTitle")
            @k
            private final String confirmButtonTitle;

            @c("headerImage")
            @k
            private final Image headerImage;

            @c("onShowDialogDeepLink")
            @l
            private final DeepLink onShowDialogDeepLink;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AddToFavoriteDialog> {
                @Override // android.os.Parcelable.Creator
                public final AddToFavoriteDialog createFromParcel(Parcel parcel) {
                    return new AddToFavoriteDialog((Image) parcel.readParcelable(AddToFavoriteDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), (DeepLink) parcel.readParcelable(AddToFavoriteDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final AddToFavoriteDialog[] newArray(int i12) {
                    return new AddToFavoriteDialog[i12];
                }
            }

            public AddToFavoriteDialog(@k Image image, @k String str, @k String str2, @k String str3, @k String str4, long j12, long j13, @l DeepLink deepLink) {
                super(null);
                this.headerImage = image;
                this.title = str;
                this.subtitle = str2;
                this.confirmButtonTitle = str3;
                this.blockDialogButtonTitle = str4;
                this.blockItemTime = j12;
                this.blockAllItemsTime = j13;
                this.onShowDialogDeepLink = deepLink;
            }

            /* renamed from: c, reason: from getter */
            public final long getBlockAllItemsTime() {
                return this.blockAllItemsTime;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getBlockDialogButtonTitle() {
                return this.blockDialogButtonTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final long getBlockItemTime() {
                return this.blockItemTime;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddToFavoriteDialog)) {
                    return false;
                }
                AddToFavoriteDialog addToFavoriteDialog = (AddToFavoriteDialog) obj;
                return L.f(this.headerImage, addToFavoriteDialog.headerImage) && L.f(this.title, addToFavoriteDialog.title) && L.f(this.subtitle, addToFavoriteDialog.subtitle) && L.f(this.confirmButtonTitle, addToFavoriteDialog.confirmButtonTitle) && L.f(this.blockDialogButtonTitle, addToFavoriteDialog.blockDialogButtonTitle) && this.blockItemTime == addToFavoriteDialog.blockItemTime && this.blockAllItemsTime == addToFavoriteDialog.blockAllItemsTime && L.f(this.onShowDialogDeepLink, addToFavoriteDialog.onShowDialogDeepLink);
            }

            @k
            /* renamed from: f, reason: from getter */
            public final Image getHeaderImage() {
                return this.headerImage;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final DeepLink getOnShowDialogDeepLink() {
                return this.onShowDialogDeepLink;
            }

            @k
            public final String getConfirmButtonTitle() {
                return this.confirmButtonTitle;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iG2 = r.g(r.g(H.d(H.d(H.d(H.d(this.headerImage.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.confirmButtonTitle), 31, this.blockDialogButtonTitle), 31, this.blockItemTime), 31, this.blockAllItemsTime);
                DeepLink deepLink = this.onShowDialogDeepLink;
                return iG2 + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AddToFavoriteDialog(headerImage=");
                sb2.append(this.headerImage);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", confirmButtonTitle=");
                sb2.append(this.confirmButtonTitle);
                sb2.append(", blockDialogButtonTitle=");
                sb2.append(this.blockDialogButtonTitle);
                sb2.append(", blockItemTime=");
                sb2.append(this.blockItemTime);
                sb2.append(", blockAllItemsTime=");
                sb2.append(this.blockAllItemsTime);
                sb2.append(", onShowDialogDeepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.onShowDialogDeepLink, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.headerImage, i12);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.confirmButtonTitle);
                parcel.writeString(this.blockDialogButtonTitle);
                parcel.writeLong(this.blockItemTime);
                parcel.writeLong(this.blockAllItemsTime);
                parcel.writeParcelable(this.onShowDialogDeepLink, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$ChatDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "Lcom/avito/android/remote/model/Image;", "headerImage", "", "title", "subtitle", "confirmButtonTitle", "blockDialogButtonTitle", "", "blockItemTime", "blockAllItemsTime", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowDialogDeepLink", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/Image;", "f", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getConfirmButtonTitle", "d", "J", "e", "()J", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChatDialog extends ReturnCheckoutDialog {

            @k
            public static final Parcelable.Creator<ChatDialog> CREATOR = new a();

            @c("blockAllItemsTime")
            private final long blockAllItemsTime;

            @c("blockDialogButtonTitle")
            @k
            private final String blockDialogButtonTitle;

            @c("blockItemTime")
            private final long blockItemTime;

            @c("confirmButtonTitle")
            @k
            private final String confirmButtonTitle;

            @c("headerImage")
            @k
            private final Image headerImage;

            @c("onShowDialogDeepLink")
            @l
            private final DeepLink onShowDialogDeepLink;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ChatDialog> {
                @Override // android.os.Parcelable.Creator
                public final ChatDialog createFromParcel(Parcel parcel) {
                    return new ChatDialog((Image) parcel.readParcelable(ChatDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), (DeepLink) parcel.readParcelable(ChatDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ChatDialog[] newArray(int i12) {
                    return new ChatDialog[i12];
                }
            }

            public ChatDialog(@k Image image, @k String str, @k String str2, @k String str3, @k String str4, long j12, long j13, @l DeepLink deepLink) {
                super(null);
                this.headerImage = image;
                this.title = str;
                this.subtitle = str2;
                this.confirmButtonTitle = str3;
                this.blockDialogButtonTitle = str4;
                this.blockItemTime = j12;
                this.blockAllItemsTime = j13;
                this.onShowDialogDeepLink = deepLink;
            }

            /* renamed from: c, reason: from getter */
            public final long getBlockAllItemsTime() {
                return this.blockAllItemsTime;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getBlockDialogButtonTitle() {
                return this.blockDialogButtonTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final long getBlockItemTime() {
                return this.blockItemTime;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChatDialog)) {
                    return false;
                }
                ChatDialog chatDialog = (ChatDialog) obj;
                return L.f(this.headerImage, chatDialog.headerImage) && L.f(this.title, chatDialog.title) && L.f(this.subtitle, chatDialog.subtitle) && L.f(this.confirmButtonTitle, chatDialog.confirmButtonTitle) && L.f(this.blockDialogButtonTitle, chatDialog.blockDialogButtonTitle) && this.blockItemTime == chatDialog.blockItemTime && this.blockAllItemsTime == chatDialog.blockAllItemsTime && L.f(this.onShowDialogDeepLink, chatDialog.onShowDialogDeepLink);
            }

            @k
            /* renamed from: f, reason: from getter */
            public final Image getHeaderImage() {
                return this.headerImage;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final DeepLink getOnShowDialogDeepLink() {
                return this.onShowDialogDeepLink;
            }

            @k
            public final String getConfirmButtonTitle() {
                return this.confirmButtonTitle;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iG2 = r.g(r.g(H.d(H.d(H.d(H.d(this.headerImage.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.confirmButtonTitle), 31, this.blockDialogButtonTitle), 31, this.blockItemTime), 31, this.blockAllItemsTime);
                DeepLink deepLink = this.onShowDialogDeepLink;
                return iG2 + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ChatDialog(headerImage=");
                sb2.append(this.headerImage);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", confirmButtonTitle=");
                sb2.append(this.confirmButtonTitle);
                sb2.append(", blockDialogButtonTitle=");
                sb2.append(this.blockDialogButtonTitle);
                sb2.append(", blockItemTime=");
                sb2.append(this.blockItemTime);
                sb2.append(", blockAllItemsTime=");
                sb2.append(this.blockAllItemsTime);
                sb2.append(", onShowDialogDeepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.onShowDialogDeepLink, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.headerImage, i12);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.confirmButtonTitle);
                parcel.writeString(this.blockDialogButtonTitle);
                parcel.writeLong(this.blockItemTime);
                parcel.writeLong(this.blockAllItemsTime);
                parcel.writeParcelable(this.onShowDialogDeepLink, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$DefaultDialog;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "Lcom/avito/android/remote/model/Image;", "headerImage", "", "title", "subtitle", "confirmButtonTitle", "blockDialogButtonTitle", "", "blockItemTime", "blockAllItemsTime", "Lcom/avito/android/deep_linking/links/DeepLink;", "onConfirmDeeplink", "onShowDialogDeepLink", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/Image;", "f", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getConfirmButtonTitle", "d", "J", "e", "()J", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "h", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DefaultDialog extends ReturnCheckoutDialog {

            @k
            public static final Parcelable.Creator<DefaultDialog> CREATOR = new a();

            @c("blockAllItemsTime")
            private final long blockAllItemsTime;

            @c("blockDialogButtonTitle")
            @k
            private final String blockDialogButtonTitle;

            @c("blockItemTime")
            private final long blockItemTime;

            @c("confirmButtonTitle")
            @k
            private final String confirmButtonTitle;

            @c("headerImage")
            @k
            private final Image headerImage;

            @c("onConfirmDeeplink")
            @k
            private final DeepLink onConfirmDeeplink;

            @c("onShowDialogDeepLink")
            @l
            private final DeepLink onShowDialogDeepLink;

            @c("subtitle")
            @k
            private final String subtitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DefaultDialog> {
                @Override // android.os.Parcelable.Creator
                public final DefaultDialog createFromParcel(Parcel parcel) {
                    return new DefaultDialog((Image) parcel.readParcelable(DefaultDialog.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), (DeepLink) parcel.readParcelable(DefaultDialog.class.getClassLoader()), (DeepLink) parcel.readParcelable(DefaultDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final DefaultDialog[] newArray(int i12) {
                    return new DefaultDialog[i12];
                }
            }

            public DefaultDialog(@k Image image, @k String str, @k String str2, @k String str3, @k String str4, long j12, long j13, @k DeepLink deepLink, @l DeepLink deepLink2) {
                super(null);
                this.headerImage = image;
                this.title = str;
                this.subtitle = str2;
                this.confirmButtonTitle = str3;
                this.blockDialogButtonTitle = str4;
                this.blockItemTime = j12;
                this.blockAllItemsTime = j13;
                this.onConfirmDeeplink = deepLink;
                this.onShowDialogDeepLink = deepLink2;
            }

            /* renamed from: c, reason: from getter */
            public final long getBlockAllItemsTime() {
                return this.blockAllItemsTime;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getBlockDialogButtonTitle() {
                return this.blockDialogButtonTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final long getBlockItemTime() {
                return this.blockItemTime;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DefaultDialog)) {
                    return false;
                }
                DefaultDialog defaultDialog = (DefaultDialog) obj;
                return L.f(this.headerImage, defaultDialog.headerImage) && L.f(this.title, defaultDialog.title) && L.f(this.subtitle, defaultDialog.subtitle) && L.f(this.confirmButtonTitle, defaultDialog.confirmButtonTitle) && L.f(this.blockDialogButtonTitle, defaultDialog.blockDialogButtonTitle) && this.blockItemTime == defaultDialog.blockItemTime && this.blockAllItemsTime == defaultDialog.blockAllItemsTime && L.f(this.onConfirmDeeplink, defaultDialog.onConfirmDeeplink) && L.f(this.onShowDialogDeepLink, defaultDialog.onShowDialogDeepLink);
            }

            @k
            /* renamed from: f, reason: from getter */
            public final Image getHeaderImage() {
                return this.headerImage;
            }

            @k
            /* renamed from: g, reason: from getter */
            public final DeepLink getOnConfirmDeeplink() {
                return this.onConfirmDeeplink;
            }

            @k
            public final String getConfirmButtonTitle() {
                return this.confirmButtonTitle;
            }

            @k
            public final String getSubtitle() {
                return this.subtitle;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            /* renamed from: h, reason: from getter */
            public final DeepLink getOnShowDialogDeepLink() {
                return this.onShowDialogDeepLink;
            }

            public final int hashCode() {
                int iE2 = com.avito.android.actions_sheet.a.e(this.onConfirmDeeplink, r.g(r.g(H.d(H.d(H.d(H.d(this.headerImage.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.confirmButtonTitle), 31, this.blockDialogButtonTitle), 31, this.blockItemTime), 31, this.blockAllItemsTime), 31);
                DeepLink deepLink = this.onShowDialogDeepLink;
                return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DefaultDialog(headerImage=");
                sb2.append(this.headerImage);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", subtitle=");
                sb2.append(this.subtitle);
                sb2.append(", confirmButtonTitle=");
                sb2.append(this.confirmButtonTitle);
                sb2.append(", blockDialogButtonTitle=");
                sb2.append(this.blockDialogButtonTitle);
                sb2.append(", blockItemTime=");
                sb2.append(this.blockItemTime);
                sb2.append(", blockAllItemsTime=");
                sb2.append(this.blockAllItemsTime);
                sb2.append(", onConfirmDeeplink=");
                sb2.append(this.onConfirmDeeplink);
                sb2.append(", onShowDialogDeepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.onShowDialogDeepLink, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.headerImage, i12);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                parcel.writeString(this.confirmButtonTitle);
                parcel.writeString(this.blockDialogButtonTitle);
                parcel.writeLong(this.blockItemTime);
                parcel.writeLong(this.blockAllItemsTime);
                parcel.writeParcelable(this.onConfirmDeeplink, i12);
                parcel.writeParcelable(this.onShowDialogDeepLink, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog$Unknown;", "Lcom/avito/android/remote/safedeal/SafeDeal$ReturnCheckoutDialog;", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unknown extends ReturnCheckoutDialog {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Unknown f254358b = new Unknown();

            @k
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Unknown> {
                @Override // android.os.Parcelable.Creator
                public final Unknown createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Unknown.f254358b;
                }

                @Override // android.os.Parcelable.Creator
                public final Unknown[] newArray(int i12) {
                    return new Unknown[i12];
                }
            }

            public Unknown() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ ReturnCheckoutDialog(C42822w c42822w) {
            this();
        }

        private ReturnCheckoutDialog() {
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData;", "Landroid/os/Parcelable;", "", "title", "label", "text", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Button;", "button", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;", "showEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Button;Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getLabel", "getText", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Button;", "c", "()Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Button;", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;", "d", "()Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;", "Button", "Event", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TooltipData implements Parcelable {

        @k
        public static final Parcelable.Creator<TooltipData> CREATOR = new a();

        @c("button")
        @l
        private final Button button;

        @c("label")
        @k
        private final String label;

        @c("showEvent")
        @l
        private final Event showEvent;

        @c("text")
        @k
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            @c(ContextActionHandler.Link.DEEPLINK)
            @l
            private final DeepLink deepLink;

            @c("text")
            @k
            private final String text;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @l DeepLink deepLink) {
                this.text = str;
                this.deepLink = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.text, button.text) && L.f(this.deepLink, button.deepLink);
            }

            @l
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final String getText() {
                return this.text;
            }

            public final int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                DeepLink deepLink = this.deepLink;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(text=");
                sb2.append(this.text);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.text);
                parcel.writeParcelable(this.deepLink, i12);
            }
        }

        /* compiled from: SafeDeal.kt */
        @d
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "params", "<init>", "(IILjava/util/Map;)V", "I", "c", "()I", "d", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Event implements Parcelable {

            @k
            public static final Parcelable.Creator<Event> CREATOR = new a();

            @c("id")
            private final int id;

            @c("params")
            @l
            private final Map<String, String> params;

            @c("version")
            private final int version;

            /* compiled from: SafeDeal.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Event> {
                @Override // android.os.Parcelable.Creator
                public final Event createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    int i12 = parcel.readInt();
                    int i13 = parcel.readInt();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i14 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                        int iA2 = 0;
                        while (iA2 != i14) {
                            iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Event(i12, i13, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Event[] newArray(int i12) {
                    return new Event[i12];
                }
            }

            public Event(int i12, int i13, @l Map<String, String> map) {
                this.id = i12;
                this.version = i13;
                this.params = map;
            }

            /* renamed from: c, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: d, reason: from getter */
            public final int getVersion() {
                return this.version;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return this.id == event.id && this.version == event.version && L.f(this.params, event.params);
            }

            @l
            public final Map<String, String> getParams() {
                return this.params;
            }

            public final int hashCode() {
                int iE2 = r.e(this.version, Integer.hashCode(this.id) * 31, 31);
                Map<String, String> map = this.params;
                return iE2 + (map == null ? 0 : map.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Event(id=");
                sb2.append(this.id);
                sb2.append(", version=");
                sb2.append(this.version);
                sb2.append(", params=");
                return r.w(sb2, this.params, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.id);
                parcel.writeInt(this.version);
                Map<String, String> map = this.params;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
            }
        }

        /* compiled from: SafeDeal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TooltipData> {
            @Override // android.os.Parcelable.Creator
            public final TooltipData createFromParcel(Parcel parcel) {
                return new TooltipData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Event.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final TooltipData[] newArray(int i12) {
                return new TooltipData[i12];
            }
        }

        public TooltipData(@l String str, @k String str2, @k String str3, @l Button button, @l Event event) {
            this.title = str;
            this.label = str2;
            this.text = str3;
            this.button = button;
            this.showEvent = event;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Event getShowEvent() {
            return this.showEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipData)) {
                return false;
            }
            TooltipData tooltipData = (TooltipData) obj;
            return L.f(this.title, tooltipData.title) && L.f(this.label, tooltipData.label) && L.f(this.text, tooltipData.text) && L.f(this.button, tooltipData.button) && L.f(this.showEvent, tooltipData.showEvent);
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iD2 = H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.label), 31, this.text);
            Button button = this.button;
            int iHashCode = (iD2 + (button == null ? 0 : button.hashCode())) * 31;
            Event event = this.showEvent;
            return iHashCode + (event != null ? event.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "TooltipData(title=" + this.title + ", label=" + this.label + ", text=" + this.text + ", button=" + this.button + ", showEvent=" + this.showEvent + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.label);
            parcel.writeString(this.text);
            Button button = this.button;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
            Event event = this.showEvent;
            if (event == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                event.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDeal> {
        @Override // android.os.Parcelable.Creator
        public final SafeDeal createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SafeDeal.class, parcel, arrayList, iL2, 1);
                }
            }
            Info infoCreateFromParcel = parcel.readInt() == 0 ? null : Info.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap.put(parcel.readString(), TooltipData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iL3 = 0;
                while (iL3 != i15) {
                    iL3 = com.avito.android.actions_sheet.a.l(SafeDeal.class, parcel, arrayList2, iL3, 1);
                }
            }
            return new SafeDeal(arrayListCreateStringArrayList, arrayList, infoCreateFromParcel, linkedHashMap, arrayList2, (ReturnCheckoutDialog) parcel.readParcelable(SafeDeal.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDeal[] newArray(int i12) {
            return new SafeDeal[i12];
        }
    }

    /* compiled from: SafeDeal.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<String, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f254360l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(String str) {
            return C22491k0.a('\'', "'", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeDeal(@l List<String> list, @l List<MyAdvertSafeDeal.Service> list2, @l Info info, @l Map<String, TooltipData> map, @l List<? extends Component> list3, @l ReturnCheckoutDialog returnCheckoutDialog, @l Boolean bool) {
        this.orderTypes = list;
        this.services = list2;
        this.info = info;
        this.tooltips = map;
        this.components = list3;
        this.returnCheckoutDialog = returnCheckoutDialog;
        this.shouldShowRealOneClickSlider = bool;
    }

    @l
    public final String c() {
        List<String> list = this.orderTypes;
        if (list != null) {
            return C42745f0.O(list, null, "[", "]", b.f254360l, 25);
        }
        return null;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Info getInfo() {
        return this.info;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ReturnCheckoutDialog getReturnCheckoutDialog() {
        return this.returnCheckoutDialog;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDeal)) {
            return false;
        }
        SafeDeal safeDeal = (SafeDeal) obj;
        return L.f(this.orderTypes, safeDeal.orderTypes) && L.f(this.services, safeDeal.services) && L.f(this.info, safeDeal.info) && L.f(this.tooltips, safeDeal.tooltips) && L.f(this.components, safeDeal.components) && L.f(this.returnCheckoutDialog, safeDeal.returnCheckoutDialog) && L.f(this.shouldShowRealOneClickSlider, safeDeal.shouldShowRealOneClickSlider);
    }

    @l
    public final List<MyAdvertSafeDeal.Service> f() {
        return this.services;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getShouldShowRealOneClickSlider() {
        return this.shouldShowRealOneClickSlider;
    }

    @l
    public final List<Component> getComponents() {
        return this.components;
    }

    @l
    public final Map<String, TooltipData> h() {
        return this.tooltips;
    }

    public final int hashCode() {
        List<String> list = this.orderTypes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MyAdvertSafeDeal.Service> list2 = this.services;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Info info = this.info;
        int iHashCode3 = (iHashCode2 + (info == null ? 0 : info.hashCode())) * 31;
        Map<String, TooltipData> map = this.tooltips;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        List<Component> list3 = this.components;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ReturnCheckoutDialog returnCheckoutDialog = this.returnCheckoutDialog;
        int iHashCode6 = (iHashCode5 + (returnCheckoutDialog == null ? 0 : returnCheckoutDialog.hashCode())) * 31;
        Boolean bool = this.shouldShowRealOneClickSlider;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeDeal(orderTypes=");
        sb2.append(this.orderTypes);
        sb2.append(", services=");
        sb2.append(this.services);
        sb2.append(", info=");
        sb2.append(this.info);
        sb2.append(", tooltips=");
        sb2.append(this.tooltips);
        sb2.append(", components=");
        sb2.append(this.components);
        sb2.append(", returnCheckoutDialog=");
        sb2.append(this.returnCheckoutDialog);
        sb2.append(", shouldShowRealOneClickSlider=");
        return C0.g(sb2, this.shouldShowRealOneClickSlider, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.orderTypes);
        List<MyAdvertSafeDeal.Service> list = this.services;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Info info = this.info;
        if (info == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            info.writeToParcel(parcel, i12);
        }
        Map<String, TooltipData> map = this.tooltips;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                ((TooltipData) entry.getValue()).writeToParcel(parcel, i12);
            }
        }
        List<Component> list2 = this.components;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.returnCheckoutDialog, i12);
        Boolean bool = this.shouldShowRealOneClickSlider;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
