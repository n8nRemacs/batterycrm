package com.avito.android.remote.model.category_parameters.slot.card_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001cJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J¬\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001cJ\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000206HÖ\u0001¢\u0006\u0004\b=\u00108J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000206HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\b\u0007\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010\"R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\b\u0010\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bT\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bU\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u00102¨\u0006Z"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelect;", "Landroid/os/Parcelable;", "", "cardTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "isChecked", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/LinkButton;", "linkButton", "", "paragraphs", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "navigationAction", "Lcom/avito/android/remote/model/text/AttributedText;", "navigationButtonsDisclaimer", "isRedesign", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectHeader;", "header", "titleBadge", "titleBadgeStyle", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectPrice;", "buyoutPrice", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;", "infoBadge", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;ZLcom/avito/android/remote/model/category_parameters/slot/card_select/LinkButton;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectHeader;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectPrice;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Z", "component4", "()Lcom/avito/android/remote/model/category_parameters/slot/card_select/LinkButton;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectHeader;", "component10", "component11", "component12", "()Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectPrice;", "component13", "()Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;ZLcom/avito/android/remote/model/category_parameters/slot/card_select/LinkButton;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectHeader;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectPrice;Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;)Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCardTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Z", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/LinkButton;", "getLinkButton", "Ljava/util/List;", "getParagraphs", "Lcom/avito/android/remote/model/category_parameters/CategoryPublishStep$Params$NavigationButtonAction;", "getNavigationAction", "Lcom/avito/android/remote/model/text/AttributedText;", "getNavigationButtonsDisclaimer", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectHeader;", "getHeader", "getTitleBadge", "getTitleBadgeStyle", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectPrice;", "getBuyoutPrice", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectBadge;", "getInfoBadge", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CardSelect implements Parcelable {

    @k
    public static final Parcelable.Creator<CardSelect> CREATOR = new Creator();

    @c("buyoutPrice")
    @l
    private final CardSelectPrice buyoutPrice;

    @c("title")
    @k
    private final String cardTitle;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("header")
    @l
    private final CardSelectHeader header;

    @c("infoBadge")
    @l
    private final CardSelectBadge infoBadge;

    @c("isChecked")
    private final boolean isChecked;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("linkButton")
    @l
    private final LinkButton linkButton;

    @c("navigationAction")
    @l
    private final CategoryPublishStep.Params.NavigationButtonAction navigationAction;

    @c("navigationButtonsDisclaimer")
    @l
    private final AttributedText navigationButtonsDisclaimer;

    @c("paragraphs")
    @k
    private final List<String> paragraphs;

    @c("titleBadge")
    @l
    private final String titleBadge;

    @c("titleBadgeStyle")
    @l
    private final String titleBadgeStyle;

    /* compiled from: CardSelectSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardSelect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelect createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CardSelect.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            LinkButton linkButtonCreateFromParcel = parcel.readInt() == 0 ? null : LinkButton.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = (CategoryPublishStep.Params.NavigationButtonAction) parcel.readParcelable(CardSelect.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CardSelect.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CardSelect(string, deepLink, z12, linkButtonCreateFromParcel, arrayListCreateStringArrayList, navigationButtonAction, attributedText, boolValueOf, parcel.readInt() == 0 ? null : CardSelectHeader.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CardSelectPrice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CardSelectBadge.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CardSelect[] newArray(int i12) {
            return new CardSelect[i12];
        }
    }

    public CardSelect(@k String str, @l DeepLink deepLink, boolean z12, @l LinkButton linkButton, @k List<String> list, @l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @l AttributedText attributedText, @l Boolean bool, @l CardSelectHeader cardSelectHeader, @l String str2, @l String str3, @l CardSelectPrice cardSelectPrice, @l CardSelectBadge cardSelectBadge) {
        this.cardTitle = str;
        this.deeplink = deepLink;
        this.isChecked = z12;
        this.linkButton = linkButton;
        this.paragraphs = list;
        this.navigationAction = navigationButtonAction;
        this.navigationButtonsDisclaimer = attributedText;
        this.isRedesign = bool;
        this.header = cardSelectHeader;
        this.titleBadge = str2;
        this.titleBadgeStyle = str3;
        this.buyoutPrice = cardSelectPrice;
        this.infoBadge = cardSelectBadge;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getTitleBadge() {
        return this.titleBadge;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getTitleBadgeStyle() {
        return this.titleBadgeStyle;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final CardSelectPrice getBuyoutPrice() {
        return this.buyoutPrice;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final CardSelectBadge getInfoBadge() {
        return this.infoBadge;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final LinkButton getLinkButton() {
        return this.linkButton;
    }

    @k
    public final List<String> component5() {
        return this.paragraphs;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final CategoryPublishStep.Params.NavigationButtonAction getNavigationAction() {
        return this.navigationAction;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttributedText getNavigationButtonsDisclaimer() {
        return this.navigationButtonsDisclaimer;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final CardSelectHeader getHeader() {
        return this.header;
    }

    @k
    public final CardSelect copy(@k String cardTitle, @l DeepLink deeplink, boolean isChecked, @l LinkButton linkButton, @k List<String> paragraphs, @l CategoryPublishStep.Params.NavigationButtonAction navigationAction, @l AttributedText navigationButtonsDisclaimer, @l Boolean isRedesign, @l CardSelectHeader header, @l String titleBadge, @l String titleBadgeStyle, @l CardSelectPrice buyoutPrice, @l CardSelectBadge infoBadge) {
        return new CardSelect(cardTitle, deeplink, isChecked, linkButton, paragraphs, navigationAction, navigationButtonsDisclaimer, isRedesign, header, titleBadge, titleBadgeStyle, buyoutPrice, infoBadge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSelect)) {
            return false;
        }
        CardSelect cardSelect = (CardSelect) other;
        return L.f(this.cardTitle, cardSelect.cardTitle) && L.f(this.deeplink, cardSelect.deeplink) && this.isChecked == cardSelect.isChecked && L.f(this.linkButton, cardSelect.linkButton) && L.f(this.paragraphs, cardSelect.paragraphs) && this.navigationAction == cardSelect.navigationAction && L.f(this.navigationButtonsDisclaimer, cardSelect.navigationButtonsDisclaimer) && L.f(this.isRedesign, cardSelect.isRedesign) && L.f(this.header, cardSelect.header) && L.f(this.titleBadge, cardSelect.titleBadge) && L.f(this.titleBadgeStyle, cardSelect.titleBadgeStyle) && L.f(this.buyoutPrice, cardSelect.buyoutPrice) && L.f(this.infoBadge, cardSelect.infoBadge);
    }

    @l
    public final CardSelectPrice getBuyoutPrice() {
        return this.buyoutPrice;
    }

    @k
    public final String getCardTitle() {
        return this.cardTitle;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final CardSelectHeader getHeader() {
        return this.header;
    }

    @l
    public final CardSelectBadge getInfoBadge() {
        return this.infoBadge;
    }

    @l
    public final LinkButton getLinkButton() {
        return this.linkButton;
    }

    @l
    public final CategoryPublishStep.Params.NavigationButtonAction getNavigationAction() {
        return this.navigationAction;
    }

    @l
    public final AttributedText getNavigationButtonsDisclaimer() {
        return this.navigationButtonsDisclaimer;
    }

    @k
    public final List<String> getParagraphs() {
        return this.paragraphs;
    }

    @l
    public final String getTitleBadge() {
        return this.titleBadge;
    }

    @l
    public final String getTitleBadgeStyle() {
        return this.titleBadgeStyle;
    }

    public int hashCode() {
        int iHashCode = this.cardTitle.hashCode() * 31;
        DeepLink deepLink = this.deeplink;
        int i12 = r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.isChecked);
        LinkButton linkButton = this.linkButton;
        int iE2 = H.e((i12 + (linkButton == null ? 0 : linkButton.hashCode())) * 31, 31, this.paragraphs);
        CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.navigationAction;
        int iHashCode2 = (iE2 + (navigationButtonAction == null ? 0 : navigationButtonAction.hashCode())) * 31;
        AttributedText attributedText = this.navigationButtonsDisclaimer;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.isRedesign;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CardSelectHeader cardSelectHeader = this.header;
        int iHashCode5 = (iHashCode4 + (cardSelectHeader == null ? 0 : cardSelectHeader.hashCode())) * 31;
        String str = this.titleBadge;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleBadgeStyle;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CardSelectPrice cardSelectPrice = this.buyoutPrice;
        int iHashCode8 = (iHashCode7 + (cardSelectPrice == null ? 0 : cardSelectPrice.hashCode())) * 31;
        CardSelectBadge cardSelectBadge = this.infoBadge;
        return iHashCode8 + (cardSelectBadge != null ? cardSelectBadge.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    @l
    public final Boolean isRedesign() {
        return this.isRedesign;
    }

    @k
    public String toString() {
        return "CardSelect(cardTitle=" + this.cardTitle + ", deeplink=" + this.deeplink + ", isChecked=" + this.isChecked + ", linkButton=" + this.linkButton + ", paragraphs=" + this.paragraphs + ", navigationAction=" + this.navigationAction + ", navigationButtonsDisclaimer=" + this.navigationButtonsDisclaimer + ", isRedesign=" + this.isRedesign + ", header=" + this.header + ", titleBadge=" + this.titleBadge + ", titleBadgeStyle=" + this.titleBadgeStyle + ", buyoutPrice=" + this.buyoutPrice + ", infoBadge=" + this.infoBadge + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.cardTitle);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeInt(this.isChecked ? 1 : 0);
        LinkButton linkButton = this.linkButton;
        if (linkButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkButton.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.paragraphs);
        parcel.writeParcelable(this.navigationAction, flags);
        parcel.writeParcelable(this.navigationButtonsDisclaimer, flags);
        Boolean bool = this.isRedesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        CardSelectHeader cardSelectHeader = this.header;
        if (cardSelectHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardSelectHeader.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.titleBadge);
        parcel.writeString(this.titleBadgeStyle);
        CardSelectPrice cardSelectPrice = this.buyoutPrice;
        if (cardSelectPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardSelectPrice.writeToParcel(parcel, flags);
        }
        CardSelectBadge cardSelectBadge = this.infoBadge;
        if (cardSelectBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardSelectBadge.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ CardSelect(String str, DeepLink deepLink, boolean z12, LinkButton linkButton, List list, CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, AttributedText attributedText, Boolean bool, CardSelectHeader cardSelectHeader, String str2, String str3, CardSelectPrice cardSelectPrice, CardSelectBadge cardSelectBadge, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, z12, (i12 & 8) != 0 ? null : linkButton, list, (i12 & 32) != 0 ? null : navigationButtonAction, (i12 & 64) != 0 ? null : attributedText, (i12 & 128) != 0 ? null : bool, (i12 & 256) != 0 ? null : cardSelectHeader, (i12 & 512) != 0 ? null : str2, (i12 & 1024) != 0 ? null : str3, (i12 & 2048) != 0 ? null : cardSelectPrice, (i12 & 4096) != 0 ? null : cardSelectBadge);
    }
}
