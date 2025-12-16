package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertEquipments.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AllComplectationsButton;", "Landroid/os/Parcelable;", "", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AllComplectationsButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AllComplectationsButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AllComplectationsButton> CREATOR = new Creator();

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("link")
    @k
    private final DeepLink link;

    /* compiled from: AdvertEquipments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AllComplectationsButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllComplectationsButton createFromParcel(@k Parcel parcel) {
            return new AllComplectationsButton(parcel.readString(), (DeepLink) parcel.readParcelable(AllComplectationsButton.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AllComplectationsButton[] newArray(int i12) {
            return new AllComplectationsButton[i12];
        }
    }

    public AllComplectationsButton(@k String str, @k DeepLink deepLink) {
        this.buttonTitle = str;
        this.link = deepLink;
    }

    public static /* synthetic */ AllComplectationsButton copy$default(AllComplectationsButton allComplectationsButton, String str, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = allComplectationsButton.buttonTitle;
        }
        if ((i12 & 2) != 0) {
            deepLink = allComplectationsButton.link;
        }
        return allComplectationsButton.copy(str, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @k
    public final AllComplectationsButton copy(@k String buttonTitle, @k DeepLink link) {
        return new AllComplectationsButton(buttonTitle, link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllComplectationsButton)) {
            return false;
        }
        AllComplectationsButton allComplectationsButton = (AllComplectationsButton) other;
        return L.f(this.buttonTitle, allComplectationsButton.buttonTitle) && L.f(this.link, allComplectationsButton.link);
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final DeepLink getLink() {
        return this.link;
    }

    public int hashCode() {
        return this.link.hashCode() + (this.buttonTitle.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AllComplectationsButton(buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", link=");
        return a.v(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.link, flags);
    }
}
