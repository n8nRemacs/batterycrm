package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsCost.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u000e¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/SparePartsCost;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;", "firstButton", "secondButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;)Lcom/avito/android/remote/model/SparePartsCost;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;", "getFirstButton", "getSecondButton", "SparePartsCostButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SparePartsCost implements Parcelable {

    @k
    public static final Parcelable.Creator<SparePartsCost> CREATOR = new Creator();

    @c("firstButton")
    @l
    private final SparePartsCostButton firstButton;

    @c("secondButton")
    @l
    private final SparePartsCostButton secondButton;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: SparePartsCost.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SparePartsCost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SparePartsCost createFromParcel(@k Parcel parcel) {
            return new SparePartsCost(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SparePartsCostButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SparePartsCostButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SparePartsCost[] newArray(int i12) {
            return new SparePartsCost[i12];
        }
    }

    /* compiled from: SparePartsCost.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/SparePartsCost$SparePartsCostButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SparePartsCostButton implements Parcelable {

        @k
        public static final Parcelable.Creator<SparePartsCostButton> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("text")
        @k
        private final String text;

        /* compiled from: SparePartsCost.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SparePartsCostButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SparePartsCostButton createFromParcel(@k Parcel parcel) {
                return new SparePartsCostButton(parcel.readString(), (DeepLink) parcel.readParcelable(SparePartsCostButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SparePartsCostButton[] newArray(int i12) {
                return new SparePartsCostButton[i12];
            }
        }

        public SparePartsCostButton(@k String str, @k DeepLink deepLink) {
            this.text = str;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ SparePartsCostButton copy$default(SparePartsCostButton sparePartsCostButton, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = sparePartsCostButton.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = sparePartsCostButton.deeplink;
            }
            return sparePartsCostButton.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final SparePartsCostButton copy(@k String text, @k DeepLink deeplink) {
            return new SparePartsCostButton(text, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SparePartsCostButton)) {
                return false;
            }
            SparePartsCostButton sparePartsCostButton = (SparePartsCostButton) other;
            return L.f(this.text, sparePartsCostButton.text) && L.f(this.deeplink, sparePartsCostButton.deeplink);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SparePartsCostButton(text=");
            sb2.append(this.text);
            sb2.append(", deeplink=");
            return a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    public SparePartsCost(@k String str, @l String str2, @l SparePartsCostButton sparePartsCostButton, @l SparePartsCostButton sparePartsCostButton2) {
        this.title = str;
        this.subtitle = str2;
        this.firstButton = sparePartsCostButton;
        this.secondButton = sparePartsCostButton2;
    }

    public static /* synthetic */ SparePartsCost copy$default(SparePartsCost sparePartsCost, String str, String str2, SparePartsCostButton sparePartsCostButton, SparePartsCostButton sparePartsCostButton2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sparePartsCost.title;
        }
        if ((i12 & 2) != 0) {
            str2 = sparePartsCost.subtitle;
        }
        if ((i12 & 4) != 0) {
            sparePartsCostButton = sparePartsCost.firstButton;
        }
        if ((i12 & 8) != 0) {
            sparePartsCostButton2 = sparePartsCost.secondButton;
        }
        return sparePartsCost.copy(str, str2, sparePartsCostButton, sparePartsCostButton2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SparePartsCostButton getFirstButton() {
        return this.firstButton;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final SparePartsCostButton getSecondButton() {
        return this.secondButton;
    }

    @k
    public final SparePartsCost copy(@k String title, @l String subtitle, @l SparePartsCostButton firstButton, @l SparePartsCostButton secondButton) {
        return new SparePartsCost(title, subtitle, firstButton, secondButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparePartsCost)) {
            return false;
        }
        SparePartsCost sparePartsCost = (SparePartsCost) other;
        return L.f(this.title, sparePartsCost.title) && L.f(this.subtitle, sparePartsCost.subtitle) && L.f(this.firstButton, sparePartsCost.firstButton) && L.f(this.secondButton, sparePartsCost.secondButton);
    }

    @l
    public final SparePartsCostButton getFirstButton() {
        return this.firstButton;
    }

    @l
    public final SparePartsCostButton getSecondButton() {
        return this.secondButton;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SparePartsCostButton sparePartsCostButton = this.firstButton;
        int iHashCode3 = (iHashCode2 + (sparePartsCostButton == null ? 0 : sparePartsCostButton.hashCode())) * 31;
        SparePartsCostButton sparePartsCostButton2 = this.secondButton;
        return iHashCode3 + (sparePartsCostButton2 != null ? sparePartsCostButton2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "SparePartsCost(title=" + this.title + ", subtitle=" + this.subtitle + ", firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        SparePartsCostButton sparePartsCostButton = this.firstButton;
        if (sparePartsCostButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sparePartsCostButton.writeToParcel(parcel, flags);
        }
        SparePartsCostButton sparePartsCostButton2 = this.secondButton;
        if (sparePartsCostButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sparePartsCostButton2.writeToParcel(parcel, flags);
        }
    }
}
