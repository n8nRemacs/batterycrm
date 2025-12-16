package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/ButtonAction;", "positiveButton", "negativeButton", "Lcom/avito/android/deep_linking/links/DeepLink;", "closeDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/ButtonAction;", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/advert_details/realty/QiuzPromo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/ButtonAction;", "getPositiveButton", "getNegativeButton", "Lcom/avito/android/deep_linking/links/DeepLink;", "getCloseDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class QiuzPromo implements Parcelable {

    @k
    public static final Parcelable.Creator<QiuzPromo> CREATOR = new Creator();

    @c("closePromoUri")
    @l
    private final DeepLink closeDeeplink;

    @c("description")
    @l
    private final String description;

    @c("disagreeButton")
    @l
    private final ButtonAction negativeButton;

    @c("agreeButton")
    @l
    private final ButtonAction positiveButton;

    @c("title")
    @l
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QiuzPromo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QiuzPromo createFromParcel(@k Parcel parcel) {
            return new QiuzPromo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonAction.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(QiuzPromo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QiuzPromo[] newArray(int i12) {
            return new QiuzPromo[i12];
        }
    }

    public QiuzPromo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ QiuzPromo copy$default(QiuzPromo qiuzPromo, String str, String str2, ButtonAction buttonAction, ButtonAction buttonAction2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = qiuzPromo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = qiuzPromo.description;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            buttonAction = qiuzPromo.positiveButton;
        }
        ButtonAction buttonAction3 = buttonAction;
        if ((i12 & 8) != 0) {
            buttonAction2 = qiuzPromo.negativeButton;
        }
        ButtonAction buttonAction4 = buttonAction2;
        if ((i12 & 16) != 0) {
            deepLink = qiuzPromo.closeDeeplink;
        }
        return qiuzPromo.copy(str, str3, buttonAction3, buttonAction4, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ButtonAction getPositiveButton() {
        return this.positiveButton;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ButtonAction getNegativeButton() {
        return this.negativeButton;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeepLink getCloseDeeplink() {
        return this.closeDeeplink;
    }

    @k
    public final QiuzPromo copy(@l String title, @l String description, @l ButtonAction positiveButton, @l ButtonAction negativeButton, @l DeepLink closeDeeplink) {
        return new QiuzPromo(title, description, positiveButton, negativeButton, closeDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QiuzPromo)) {
            return false;
        }
        QiuzPromo qiuzPromo = (QiuzPromo) other;
        return L.f(this.title, qiuzPromo.title) && L.f(this.description, qiuzPromo.description) && L.f(this.positiveButton, qiuzPromo.positiveButton) && L.f(this.negativeButton, qiuzPromo.negativeButton) && L.f(this.closeDeeplink, qiuzPromo.closeDeeplink);
    }

    @l
    public final DeepLink getCloseDeeplink() {
        return this.closeDeeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final ButtonAction getNegativeButton() {
        return this.negativeButton;
    }

    @l
    public final ButtonAction getPositiveButton() {
        return this.positiveButton;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonAction buttonAction = this.positiveButton;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.negativeButton;
        int iHashCode4 = (iHashCode3 + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
        DeepLink deepLink = this.closeDeeplink;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QiuzPromo(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", positiveButton=");
        sb2.append(this.positiveButton);
        sb2.append(", negativeButton=");
        sb2.append(this.negativeButton);
        sb2.append(", closeDeeplink=");
        return a.v(sb2, this.closeDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        ButtonAction buttonAction = this.positiveButton;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        ButtonAction buttonAction2 = this.negativeButton;
        if (buttonAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.closeDeeplink, flags);
    }

    public QiuzPromo(@l String str, @l String str2, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l DeepLink deepLink) {
        this.title = str;
        this.description = str2;
        this.positiveButton = buttonAction;
        this.negativeButton = buttonAction2;
        this.closeDeeplink = deepLink;
    }

    public /* synthetic */ QiuzPromo(String str, String str2, ButtonAction buttonAction, ButtonAction buttonAction2, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : buttonAction, (i12 & 8) != 0 ? null : buttonAction2, (i12 & 16) != 0 ? null : deepLink);
    }
}
