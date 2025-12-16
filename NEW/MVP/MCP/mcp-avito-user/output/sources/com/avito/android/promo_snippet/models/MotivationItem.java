package com.avito.android.promo_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GigPromoSnippetWidget.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b'\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b,\u0010#¨\u0006-"}, d2 = {"Lcom/avito/android/promo_snippet/models/MotivationItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/promo_snippet/models/MotivationItemActionButton;", "actionButton", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/promo_snippet/models/MotivationItemFooterInfo;", "footerInfo", "", "isLocked", "", "price", "", "Lcom/avito/android/promo_snippet/models/MotivationItemProgressItem;", "progress", "showBackgroundColor", "showError", "subtitle", "title", "<init>", "(Lcom/avito/android/promo_snippet/models/MotivationItemActionButton;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/promo_snippet/models/MotivationItemFooterInfo;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/promo_snippet/models/MotivationItemActionButton;", "c", "()Lcom/avito/android/promo_snippet/models/MotivationItemActionButton;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/promo_snippet/models/MotivationItemFooterInfo;", "d", "()Lcom/avito/android/promo_snippet/models/MotivationItemFooterInfo;", "Z", "h", "()Z", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "getSubtitle", "getTitle", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MotivationItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MotivationItem> CREATOR = new a();

    @c("actionButton")
    @l
    private final MotivationItemActionButton actionButton;

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("footerInfo")
    @l
    private final MotivationItemFooterInfo footerInfo;

    @c("isLocked")
    private final boolean isLocked;

    @c("price")
    @l
    private final String price;

    @c("progress")
    @l
    private final List<MotivationItemProgressItem> progress;

    @c("showBackgroundColor")
    private final boolean showBackgroundColor;

    @c("showError")
    @l
    private final Boolean showError;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: GigPromoSnippetWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationItem> {
        @Override // android.os.Parcelable.Creator
        public final MotivationItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            MotivationItemActionButton motivationItemActionButtonCreateFromParcel = parcel.readInt() == 0 ? null : MotivationItemActionButton.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(MotivationItem.class.getClassLoader());
            MotivationItemFooterInfo motivationItemFooterInfoCreateFromParcel = parcel.readInt() == 0 ? null : MotivationItemFooterInfo.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(MotivationItemProgressItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MotivationItem(motivationItemActionButtonCreateFromParcel, deepLink, motivationItemFooterInfoCreateFromParcel, z12, string, arrayList, z13, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationItem[] newArray(int i12) {
            return new MotivationItem[i12];
        }
    }

    public MotivationItem(@l MotivationItemActionButton motivationItemActionButton, @k DeepLink deepLink, @l MotivationItemFooterInfo motivationItemFooterInfo, boolean z12, @l String str, @l List<MotivationItemProgressItem> list, boolean z13, @l Boolean bool, @l String str2, @k String str3) {
        this.actionButton = motivationItemActionButton;
        this.deeplink = deepLink;
        this.footerInfo = motivationItemFooterInfo;
        this.isLocked = z12;
        this.price = str;
        this.progress = list;
        this.showBackgroundColor = z13;
        this.showError = bool;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final MotivationItemActionButton getActionButton() {
        return this.actionButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final MotivationItemFooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<MotivationItemProgressItem> e() {
        return this.progress;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShowBackgroundColor() {
        return this.showBackgroundColor;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getShowError() {
        return this.showError;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        MotivationItemActionButton motivationItemActionButton = this.actionButton;
        if (motivationItemActionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            motivationItemActionButton.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.deeplink, i12);
        MotivationItemFooterInfo motivationItemFooterInfo = this.footerInfo;
        if (motivationItemFooterInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            motivationItemFooterInfo.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isLocked ? 1 : 0);
        parcel.writeString(this.price);
        List<MotivationItemProgressItem> list = this.progress;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((MotivationItemProgressItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.showBackgroundColor ? 1 : 0);
        Boolean bool = this.showError;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
    }
}
