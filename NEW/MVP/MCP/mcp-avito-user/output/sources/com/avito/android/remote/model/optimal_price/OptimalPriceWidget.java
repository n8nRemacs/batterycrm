package com.avito.android.remote.model.optimal_price;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OptimalPriceWidget.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0012¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "text", "", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem;", "scale", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;)Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getText", "Ljava/util/List;", "getScale", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;", "getButton", "OptimalPriceButton", "OptimalPriceScaleItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptimalPriceWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<OptimalPriceWidget> CREATOR = new Creator();

    @c("button")
    @l
    private final OptimalPriceButton button;

    @c("scale")
    @l
    private final List<OptimalPriceScaleItem> scale;

    @c("text")
    @l
    private final AttributedText text;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: OptimalPriceWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OptimalPriceWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OptimalPriceWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(OptimalPriceWidget.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(OptimalPriceWidget.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(OptimalPriceScaleItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OptimalPriceWidget(attributedText, attributedText2, arrayList, parcel.readInt() != 0 ? OptimalPriceButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OptimalPriceWidget[] newArray(int i12) {
            return new OptimalPriceWidget[i12];
        }
    }

    /* compiled from: OptimalPriceWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptimalPriceButton implements Parcelable {

        @k
        public static final Parcelable.Creator<OptimalPriceButton> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("title")
        @l
        private final String title;

        /* compiled from: OptimalPriceWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptimalPriceButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptimalPriceButton createFromParcel(@k Parcel parcel) {
                return new OptimalPriceButton(parcel.readString(), (DeepLink) parcel.readParcelable(OptimalPriceButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptimalPriceButton[] newArray(int i12) {
                return new OptimalPriceButton[i12];
            }
        }

        public OptimalPriceButton(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ OptimalPriceButton copy$default(OptimalPriceButton optimalPriceButton, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = optimalPriceButton.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = optimalPriceButton.deeplink;
            }
            return optimalPriceButton.copy(str, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final OptimalPriceButton copy(@l String title, @l DeepLink deeplink) {
            return new OptimalPriceButton(title, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptimalPriceButton)) {
                return false;
            }
            OptimalPriceButton optimalPriceButton = (OptimalPriceButton) other;
            return L.f(this.title, optimalPriceButton.title) && L.f(this.deeplink, optimalPriceButton.deeplink);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.deeplink;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OptimalPriceButton(title=");
            sb2.append(this.title);
            sb2.append(", deeplink=");
            return a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: OptimalPriceWidget.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem;", "Landroid/os/Parcelable;", "", "width", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "", "Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem$OptimalPriceMarker;", "markers", "<init>", "(ILcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Ljava/util/List;", "copy", "(ILcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "Lcom/avito/android/remote/model/text/AttributedText;", "getName", "Ljava/util/List;", "getMarkers", "OptimalPriceMarker", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class OptimalPriceScaleItem implements Parcelable {

        @k
        public static final Parcelable.Creator<OptimalPriceScaleItem> CREATOR = new Creator();

        @c("color")
        @k
        private final UniversalColor color;

        @c("markers")
        @l
        private final List<OptimalPriceMarker> markers;

        @c("name")
        @l
        private final AttributedText name;

        @c("width")
        private final int width;

        /* compiled from: OptimalPriceWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptimalPriceScaleItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptimalPriceScaleItem createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                int i12 = parcel.readInt();
                UniversalColor universalColor = (UniversalColor) parcel.readParcelable(OptimalPriceScaleItem.class.getClassLoader());
                AttributedText attributedText = (AttributedText) parcel.readParcelable(OptimalPriceScaleItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = a.c(OptimalPriceMarker.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OptimalPriceScaleItem(i12, universalColor, attributedText, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptimalPriceScaleItem[] newArray(int i12) {
                return new OptimalPriceScaleItem[i12];
            }
        }

        /* compiled from: OptimalPriceWidget.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem$OptimalPriceMarker;", "Landroid/os/Parcelable;", "", "position", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(ILcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/optimal_price/OptimalPriceWidget$OptimalPriceScaleItem$OptimalPriceMarker;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPosition", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OptimalPriceMarker implements Parcelable {

            @k
            public static final Parcelable.Creator<OptimalPriceMarker> CREATOR = new Creator();

            @c("position")
            private final int position;

            @c("title")
            @l
            private final AttributedText title;

            /* compiled from: OptimalPriceWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OptimalPriceMarker> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OptimalPriceMarker createFromParcel(@k Parcel parcel) {
                    return new OptimalPriceMarker(parcel.readInt(), (AttributedText) parcel.readParcelable(OptimalPriceMarker.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OptimalPriceMarker[] newArray(int i12) {
                    return new OptimalPriceMarker[i12];
                }
            }

            public OptimalPriceMarker(int i12, @l AttributedText attributedText) {
                this.position = i12;
                this.title = attributedText;
            }

            public static /* synthetic */ OptimalPriceMarker copy$default(OptimalPriceMarker optimalPriceMarker, int i12, AttributedText attributedText, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = optimalPriceMarker.position;
                }
                if ((i13 & 2) != 0) {
                    attributedText = optimalPriceMarker.title;
                }
                return optimalPriceMarker.copy(i12, attributedText);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @k
            public final OptimalPriceMarker copy(int position, @l AttributedText title) {
                return new OptimalPriceMarker(position, title);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptimalPriceMarker)) {
                    return false;
                }
                OptimalPriceMarker optimalPriceMarker = (OptimalPriceMarker) other;
                return this.position == optimalPriceMarker.position && L.f(this.title, optimalPriceMarker.title);
            }

            public final int getPosition() {
                return this.position;
            }

            @l
            public final AttributedText getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.position) * 31;
                AttributedText attributedText = this.title;
                return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OptimalPriceMarker(position=");
                sb2.append(this.position);
                sb2.append(", title=");
                return a.w(sb2, this.title, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.position);
                parcel.writeParcelable(this.title, flags);
            }
        }

        public OptimalPriceScaleItem(int i12, @k UniversalColor universalColor, @l AttributedText attributedText, @l List<OptimalPriceMarker> list) {
            this.width = i12;
            this.color = universalColor;
            this.name = attributedText;
            this.markers = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptimalPriceScaleItem copy$default(OptimalPriceScaleItem optimalPriceScaleItem, int i12, UniversalColor universalColor, AttributedText attributedText, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = optimalPriceScaleItem.width;
            }
            if ((i13 & 2) != 0) {
                universalColor = optimalPriceScaleItem.color;
            }
            if ((i13 & 4) != 0) {
                attributedText = optimalPriceScaleItem.name;
            }
            if ((i13 & 8) != 0) {
                list = optimalPriceScaleItem.markers;
            }
            return optimalPriceScaleItem.copy(i12, universalColor, attributedText, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getName() {
            return this.name;
        }

        @l
        public final List<OptimalPriceMarker> component4() {
            return this.markers;
        }

        @k
        public final OptimalPriceScaleItem copy(int width, @k UniversalColor color, @l AttributedText name, @l List<OptimalPriceMarker> markers) {
            return new OptimalPriceScaleItem(width, color, name, markers);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptimalPriceScaleItem)) {
                return false;
            }
            OptimalPriceScaleItem optimalPriceScaleItem = (OptimalPriceScaleItem) other;
            return this.width == optimalPriceScaleItem.width && L.f(this.color, optimalPriceScaleItem.color) && L.f(this.name, optimalPriceScaleItem.name) && L.f(this.markers, optimalPriceScaleItem.markers);
        }

        @k
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final List<OptimalPriceMarker> getMarkers() {
            return this.markers;
        }

        @l
        public final AttributedText getName() {
            return this.name;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            int i12 = a.i(this.color, Integer.hashCode(this.width) * 31, 31);
            AttributedText attributedText = this.name;
            int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            List<OptimalPriceMarker> list = this.markers;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("OptimalPriceScaleItem(width=");
            sb2.append(this.width);
            sb2.append(", color=");
            sb2.append(this.color);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", markers=");
            return H.p(sb2, this.markers, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.width);
            parcel.writeParcelable(this.color, flags);
            parcel.writeParcelable(this.name, flags);
            List<OptimalPriceMarker> list = this.markers;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OptimalPriceMarker) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    public OptimalPriceWidget(@l AttributedText attributedText, @l AttributedText attributedText2, @l List<OptimalPriceScaleItem> list, @l OptimalPriceButton optimalPriceButton) {
        this.title = attributedText;
        this.text = attributedText2;
        this.scale = list;
        this.button = optimalPriceButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptimalPriceWidget copy$default(OptimalPriceWidget optimalPriceWidget, AttributedText attributedText, AttributedText attributedText2, List list, OptimalPriceButton optimalPriceButton, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = optimalPriceWidget.title;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = optimalPriceWidget.text;
        }
        if ((i12 & 4) != 0) {
            list = optimalPriceWidget.scale;
        }
        if ((i12 & 8) != 0) {
            optimalPriceButton = optimalPriceWidget.button;
        }
        return optimalPriceWidget.copy(attributedText, attributedText2, list, optimalPriceButton);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final List<OptimalPriceScaleItem> component3() {
        return this.scale;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final OptimalPriceButton getButton() {
        return this.button;
    }

    @k
    public final OptimalPriceWidget copy(@l AttributedText title, @l AttributedText text, @l List<OptimalPriceScaleItem> scale, @l OptimalPriceButton button) {
        return new OptimalPriceWidget(title, text, scale, button);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimalPriceWidget)) {
            return false;
        }
        OptimalPriceWidget optimalPriceWidget = (OptimalPriceWidget) other;
        return L.f(this.title, optimalPriceWidget.title) && L.f(this.text, optimalPriceWidget.text) && L.f(this.scale, optimalPriceWidget.scale) && L.f(this.button, optimalPriceWidget.button);
    }

    @l
    public final OptimalPriceButton getButton() {
        return this.button;
    }

    @l
    public final List<OptimalPriceScaleItem> getScale() {
        return this.scale;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.text;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        List<OptimalPriceScaleItem> list = this.scale;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        OptimalPriceButton optimalPriceButton = this.button;
        return iHashCode3 + (optimalPriceButton != null ? optimalPriceButton.hashCode() : 0);
    }

    @k
    public String toString() {
        return "OptimalPriceWidget(title=" + this.title + ", text=" + this.text + ", scale=" + this.scale + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.text, flags);
        List<OptimalPriceScaleItem> list = this.scale;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OptimalPriceScaleItem) itA.next()).writeToParcel(parcel, flags);
            }
        }
        OptimalPriceButton optimalPriceButton = this.button;
        if (optimalPriceButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            optimalPriceButton.writeToParcel(parcel, flags);
        }
    }
}
