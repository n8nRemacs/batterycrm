package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchPromoHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002=>BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0011R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0016R(\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "backgroundImage", "", "Lcom/avito/android/remote/model/UniversalColor;", "colors", "Lcom/avito/android/remote/model/ToolbarConfig;", "toolbarConfig", "<init>", "(Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/ToolbarConfig;)V", "component1", "()Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/ToolbarConfig;", "copy", "(Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/ToolbarConfig;)Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getBackgroundImage", "Ljava/util/List;", "getColors", "Lcom/avito/android/remote/model/ToolbarConfig;", "getToolbarConfig", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "HeaderButton", "SearchBarPromoTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SearchPromoHeaderWidget implements SerpElement {

    @k
    public static final Parcelable.Creator<SearchPromoHeaderWidget> CREATOR = new Creator();

    @c("backgroundImage")
    @l
    private final UniversalImage backgroundImage;

    @c("backgroundLinearGradient")
    @l
    private final List<UniversalColor> colors;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @l
    private final SearchBarPromoTitle title;

    @c("toolbarConfig")
    @l
    private final ToolbarConfig toolbarConfig;
    private long uniqueId;

    /* compiled from: SearchPromoHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchPromoHeaderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchPromoHeaderWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            SearchBarPromoTitle searchBarPromoTitleCreateFromParcel = parcel.readInt() == 0 ? null : SearchBarPromoTitle.CREATOR.createFromParcel(parcel);
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SearchPromoHeaderWidget.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(SearchPromoHeaderWidget.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(SearchPromoHeaderWidget.class, parcel, arrayList, iL2, 1);
                }
            }
            return new SearchPromoHeaderWidget(searchBarPromoTitleCreateFromParcel, universalImage, universalImage2, arrayList, parcel.readInt() != 0 ? ToolbarConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchPromoHeaderWidget[] newArray(int i12) {
            return new SearchPromoHeaderWidget[i12];
        }
    }

    /* compiled from: SearchPromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeaderButton implements Parcelable {

        @k
        public static final Parcelable.Creator<HeaderButton> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("color")
        @l
        private final UniversalColor color;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        /* compiled from: SearchPromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HeaderButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeaderButton createFromParcel(@k Parcel parcel) {
                return new HeaderButton(parcel.readString(), (UniversalColor) parcel.readParcelable(HeaderButton.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HeaderButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeaderButton[] newArray(int i12) {
                return new HeaderButton[i12];
            }
        }

        public HeaderButton(@l String str, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.style = str;
            this.backgroundColor = universalColor;
            this.color = universalColor2;
        }

        public static /* synthetic */ HeaderButton copy$default(HeaderButton headerButton, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = headerButton.style;
            }
            if ((i12 & 2) != 0) {
                universalColor = headerButton.backgroundColor;
            }
            if ((i12 & 4) != 0) {
                universalColor2 = headerButton.color;
            }
            return headerButton.copy(str, universalColor, universalColor2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final HeaderButton copy(@l String style, @l UniversalColor backgroundColor, @l UniversalColor color) {
            return new HeaderButton(style, backgroundColor, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderButton)) {
                return false;
            }
            HeaderButton headerButton = (HeaderButton) other;
            return L.f(this.style, headerButton.style) && L.f(this.backgroundColor, headerButton.backgroundColor) && L.f(this.color, headerButton.color);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            String str = this.style;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.color;
            return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HeaderButton(style=");
            sb2.append(this.style);
            sb2.append(", backgroundColor=");
            sb2.append(this.backgroundColor);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.style);
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* compiled from: SearchPromoHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;", "headerButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;)Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$SearchBarPromoTitle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/serp/SearchPromoHeaderWidget$HeaderButton;", "getHeaderButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchBarPromoTitle implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchBarPromoTitle> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deeplink;

        @c("headerButton")
        @l
        private final HeaderButton headerButton;

        @c("text")
        @l
        private final AttributedText text;

        /* compiled from: SearchPromoHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchBarPromoTitle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchBarPromoTitle createFromParcel(@k Parcel parcel) {
                return new SearchBarPromoTitle((AttributedText) parcel.readParcelable(SearchBarPromoTitle.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchBarPromoTitle.class.getClassLoader()), parcel.readInt() == 0 ? null : HeaderButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchBarPromoTitle[] newArray(int i12) {
                return new SearchBarPromoTitle[i12];
            }
        }

        public SearchBarPromoTitle(@l AttributedText attributedText, @l DeepLink deepLink, @l HeaderButton headerButton) {
            this.text = attributedText;
            this.deeplink = deepLink;
            this.headerButton = headerButton;
        }

        public static /* synthetic */ SearchBarPromoTitle copy$default(SearchBarPromoTitle searchBarPromoTitle, AttributedText attributedText, DeepLink deepLink, HeaderButton headerButton, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = searchBarPromoTitle.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = searchBarPromoTitle.deeplink;
            }
            if ((i12 & 4) != 0) {
                headerButton = searchBarPromoTitle.headerButton;
            }
            return searchBarPromoTitle.copy(attributedText, deepLink, headerButton);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final HeaderButton getHeaderButton() {
            return this.headerButton;
        }

        @k
        public final SearchBarPromoTitle copy(@l AttributedText text, @l DeepLink deeplink, @l HeaderButton headerButton) {
            return new SearchBarPromoTitle(text, deeplink, headerButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchBarPromoTitle)) {
                return false;
            }
            SearchBarPromoTitle searchBarPromoTitle = (SearchBarPromoTitle) other;
            return L.f(this.text, searchBarPromoTitle.text) && L.f(this.deeplink, searchBarPromoTitle.deeplink) && L.f(this.headerButton, searchBarPromoTitle.headerButton);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final HeaderButton getHeaderButton() {
            return this.headerButton;
        }

        @l
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            AttributedText attributedText = this.text;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            HeaderButton headerButton = this.headerButton;
            return iHashCode2 + (headerButton != null ? headerButton.hashCode() : 0);
        }

        @k
        public String toString() {
            return "SearchBarPromoTitle(text=" + this.text + ", deeplink=" + this.deeplink + ", headerButton=" + this.headerButton + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.deeplink, flags);
            HeaderButton headerButton = this.headerButton;
            if (headerButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerButton.writeToParcel(parcel, flags);
            }
        }
    }

    public SearchPromoHeaderWidget(@l SearchBarPromoTitle searchBarPromoTitle, @l UniversalImage universalImage, @l UniversalImage universalImage2, @l List<UniversalColor> list, @l ToolbarConfig toolbarConfig) {
        this.title = searchBarPromoTitle;
        this.image = universalImage;
        this.backgroundImage = universalImage2;
        this.colors = list;
        this.toolbarConfig = toolbarConfig;
    }

    public static /* synthetic */ SearchPromoHeaderWidget copy$default(SearchPromoHeaderWidget searchPromoHeaderWidget, SearchBarPromoTitle searchBarPromoTitle, UniversalImage universalImage, UniversalImage universalImage2, List list, ToolbarConfig toolbarConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            searchBarPromoTitle = searchPromoHeaderWidget.title;
        }
        if ((i12 & 2) != 0) {
            universalImage = searchPromoHeaderWidget.image;
        }
        UniversalImage universalImage3 = universalImage;
        if ((i12 & 4) != 0) {
            universalImage2 = searchPromoHeaderWidget.backgroundImage;
        }
        UniversalImage universalImage4 = universalImage2;
        if ((i12 & 8) != 0) {
            list = searchPromoHeaderWidget.colors;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            toolbarConfig = searchPromoHeaderWidget.toolbarConfig;
        }
        return searchPromoHeaderWidget.copy(searchBarPromoTitle, universalImage3, universalImage4, list2, toolbarConfig);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SearchBarPromoTitle getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final List<UniversalColor> component4() {
        return this.colors;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @k
    public final SearchPromoHeaderWidget copy(@l SearchBarPromoTitle title, @l UniversalImage image, @l UniversalImage backgroundImage, @l List<UniversalColor> colors, @l ToolbarConfig toolbarConfig) {
        return new SearchPromoHeaderWidget(title, image, backgroundImage, colors, toolbarConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchPromoHeaderWidget)) {
            return false;
        }
        SearchPromoHeaderWidget searchPromoHeaderWidget = (SearchPromoHeaderWidget) other;
        return L.f(this.title, searchPromoHeaderWidget.title) && L.f(this.image, searchPromoHeaderWidget.image) && L.f(this.backgroundImage, searchPromoHeaderWidget.backgroundImage) && L.f(this.colors, searchPromoHeaderWidget.colors) && L.f(this.toolbarConfig, searchPromoHeaderWidget.toolbarConfig);
    }

    @l
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final List<UniversalColor> getColors() {
        return this.colors;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final SearchBarPromoTitle getTitle() {
        return this.title;
    }

    @l
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        SearchBarPromoTitle searchBarPromoTitle = this.title;
        int iHashCode = (searchBarPromoTitle == null ? 0 : searchBarPromoTitle.hashCode()) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.backgroundImage;
        int iHashCode3 = (iHashCode2 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        List<UniversalColor> list = this.colors;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        return iHashCode4 + (toolbarConfig != null ? toolbarConfig.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        return "SearchPromoHeaderWidget(title=" + this.title + ", image=" + this.image + ", backgroundImage=" + this.backgroundImage + ", colors=" + this.colors + ", toolbarConfig=" + this.toolbarConfig + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SearchBarPromoTitle searchBarPromoTitle = this.title;
        if (searchBarPromoTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchBarPromoTitle.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.backgroundImage, flags);
        List<UniversalColor> list = this.colors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarConfig.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
