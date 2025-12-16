package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.Background;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.Icons;
import com.avito.android.remote.model.fmp.util.Margin;
import com.avito.android.remote.model.fmp.util.Padding;
import com.avito.android.remote.model.fmp.util.Size;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProducts.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J¸\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b3\u0010#J\u0010\u00104\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b;\u00105J \u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b@\u0010AR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bD\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bK\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bL\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010+R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010-R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bU\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bW\u00100¨\u0006X"}, d2 = {"Lcom/avito/android/remote/model/fmp/MortgageTile;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "position", "Lcom/avito/android/remote/model/fmp/util/Icons;", "icons", "", "errorOffersTitle", "paymentTemplate", Constants.DEEPLINK, "Lcom/avito/android/remote/model/fmp/util/Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/fmp/util/Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/remote/model/fmp/util/Margin;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onClick", "onAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "size", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Lcom/avito/android/remote/model/fmp/util/Icons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/avito/android/remote/model/fmp/util/Icons;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/fmp/util/Background;", "component9", "()Lcom/avito/android/remote/model/fmp/util/Padding;", "component10", "()Lcom/avito/android/remote/model/fmp/util/Margin;", "component11", "()Ljava/util/List;", "component12", "component13", "()Lcom/avito/android/remote/model/fmp/util/Size;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Lcom/avito/android/remote/model/fmp/util/Icons;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)Lcom/avito/android/remote/model/fmp/MortgageTile;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Ljava/lang/Integer;", "getPosition", "Lcom/avito/android/remote/model/fmp/util/Icons;", "getIcons", "Ljava/lang/String;", "getErrorOffersTitle", "getPaymentTemplate", "getDeeplink", "Lcom/avito/android/remote/model/fmp/util/Background;", "getBackground", "Lcom/avito/android/remote/model/fmp/util/Padding;", "getPadding", "Lcom/avito/android/remote/model/fmp/util/Margin;", "getMargin", "Ljava/util/List;", "getOnClick", "getOnAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MortgageTile implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageTile> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final Background background;

    @c(Constants.DEEPLINK)
    @l
    private final String deeplink;

    @c("errorOffersTitle")
    @l
    private final String errorOffersTitle;

    @c("icons")
    @l
    private final Icons icons;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @l
    private final Margin margin;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c("onClick")
    @l
    private final List<FmpAnalyticsEvent> onClick;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final Padding padding;

    @c("paymentTemplate")
    @l
    private final String paymentTemplate;

    @c("position")
    @l
    private final Integer position;

    @c("size")
    @l
    private final Size size;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: FmpProducts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MortgageTile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageTile createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MortgageTile.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(MortgageTile.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Icons iconsCreateFromParcel = parcel.readInt() == 0 ? null : Icons.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Background backgroundCreateFromParcel = parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel);
            Padding paddingCreateFromParcel = parcel.readInt() == 0 ? null : Padding.CREATOR.createFromParcel(parcel);
            Margin marginCreateFromParcel = parcel.readInt() == 0 ? null : Margin.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList3, iC3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList3;
            }
            return new MortgageTile(attributedText, attributedText2, numValueOf, iconsCreateFromParcel, string, string2, string3, backgroundCreateFromParcel, paddingCreateFromParcel, marginCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageTile[] newArray(int i12) {
            return new MortgageTile[i12];
        }
    }

    public MortgageTile(@l AttributedText attributedText, @l AttributedText attributedText2, @l Integer num, @l Icons icons, @l String str, @l String str2, @l String str3, @l Background background, @l Padding padding, @l Margin margin, @l List<FmpAnalyticsEvent> list, @l List<FmpAnalyticsEvent> list2, @l Size size) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.position = num;
        this.icons = icons;
        this.errorOffersTitle = str;
        this.paymentTemplate = str2;
        this.deeplink = str3;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.onClick = list;
        this.onAppear = list2;
        this.size = size;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    public final List<FmpAnalyticsEvent> component11() {
        return this.onClick;
    }

    @l
    public final List<FmpAnalyticsEvent> component12() {
        return this.onAppear;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Icons getIcons() {
        return this.icons;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getErrorOffersTitle() {
        return this.errorOffersTitle;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getPaymentTemplate() {
        return this.paymentTemplate;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @k
    public final MortgageTile copy(@l AttributedText title, @l AttributedText subtitle, @l Integer position, @l Icons icons, @l String errorOffersTitle, @l String paymentTemplate, @l String deeplink, @l Background background, @l Padding padding, @l Margin margin, @l List<FmpAnalyticsEvent> onClick, @l List<FmpAnalyticsEvent> onAppear, @l Size size) {
        return new MortgageTile(title, subtitle, position, icons, errorOffersTitle, paymentTemplate, deeplink, background, padding, margin, onClick, onAppear, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MortgageTile)) {
            return false;
        }
        MortgageTile mortgageTile = (MortgageTile) other;
        return L.f(this.title, mortgageTile.title) && L.f(this.subtitle, mortgageTile.subtitle) && L.f(this.position, mortgageTile.position) && L.f(this.icons, mortgageTile.icons) && L.f(this.errorOffersTitle, mortgageTile.errorOffersTitle) && L.f(this.paymentTemplate, mortgageTile.paymentTemplate) && L.f(this.deeplink, mortgageTile.deeplink) && L.f(this.background, mortgageTile.background) && L.f(this.padding, mortgageTile.padding) && L.f(this.margin, mortgageTile.margin) && L.f(this.onClick, mortgageTile.onClick) && L.f(this.onAppear, mortgageTile.onAppear) && L.f(this.size, mortgageTile.size);
    }

    @l
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final String getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getErrorOffersTitle() {
        return this.errorOffersTitle;
    }

    @l
    public final Icons getIcons() {
        return this.icons;
    }

    @l
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnClick() {
        return this.onClick;
    }

    @l
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    public final String getPaymentTemplate() {
        return this.paymentTemplate;
    }

    @l
    public final Integer getPosition() {
        return this.position;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Integer num = this.position;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Icons icons = this.icons;
        int iHashCode4 = (iHashCode3 + (icons == null ? 0 : icons.hashCode())) * 31;
        String str = this.errorOffersTitle;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentTemplate;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Background background = this.background;
        int iHashCode8 = (iHashCode7 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode9 = (iHashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.margin;
        int iHashCode10 = (iHashCode9 + (margin == null ? 0 : margin.hashCode())) * 31;
        List<FmpAnalyticsEvent> list = this.onClick;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Size size = this.size;
        return iHashCode12 + (size != null ? size.hashCode() : 0);
    }

    @k
    public String toString() {
        return "MortgageTile(title=" + this.title + ", subtitle=" + this.subtitle + ", position=" + this.position + ", icons=" + this.icons + ", errorOffersTitle=" + this.errorOffersTitle + ", paymentTemplate=" + this.paymentTemplate + ", deeplink=" + this.deeplink + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", onClick=" + this.onClick + ", onAppear=" + this.onAppear + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Icons icons = this.icons;
        if (icons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icons.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.errorOffersTitle);
        parcel.writeString(this.paymentTemplate);
        parcel.writeString(this.deeplink);
        Background background = this.background;
        if (background == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            background.writeToParcel(parcel, flags);
        }
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, flags);
        }
        Margin margin = this.margin;
        if (margin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            margin.writeToParcel(parcel, flags);
        }
        List<FmpAnalyticsEvent> list = this.onClick;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FmpAnalyticsEvent) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((FmpAnalyticsEvent) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
    }
}
