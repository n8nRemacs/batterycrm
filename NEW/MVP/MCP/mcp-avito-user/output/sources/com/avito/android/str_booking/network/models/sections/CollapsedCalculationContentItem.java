package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/CollapsedCalculationContentItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "value", "", "hint", "Lcom/avito/android/str_booking/network/models/sections/Icon;", "icon", "Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "onboardingTooltip", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/Icon;Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Ljava/lang/String;", "getHint", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/models/sections/Icon;", "getIcon", "()Lcom/avito/android/str_booking/network/models/sections/Icon;", "Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "c", "()Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CollapsedCalculationContentItem implements Parcelable {

    @k
    public static final Parcelable.Creator<CollapsedCalculationContentItem> CREATOR = new a();

    @c("hint")
    @l
    private final String hint;

    @c("icon")
    @l
    private final Icon icon;

    @c("onboardingTooltip")
    @l
    private final OnboardingTooltip onboardingTooltip;

    @c("title")
    @l
    private final AttributedText title;

    @c("value")
    @l
    private final AttributedText value;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CollapsedCalculationContentItem> {
        @Override // android.os.Parcelable.Creator
        public final CollapsedCalculationContentItem createFromParcel(Parcel parcel) {
            return new CollapsedCalculationContentItem((AttributedText) parcel.readParcelable(CollapsedCalculationContentItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(CollapsedCalculationContentItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OnboardingTooltip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CollapsedCalculationContentItem[] newArray(int i12) {
            return new CollapsedCalculationContentItem[i12];
        }
    }

    public CollapsedCalculationContentItem(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l Icon icon, @l OnboardingTooltip onboardingTooltip) {
        this.title = attributedText;
        this.value = attributedText2;
        this.hint = str;
        this.icon = icon;
        this.onboardingTooltip = onboardingTooltip;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final OnboardingTooltip getOnboardingTooltip() {
        return this.onboardingTooltip;
    }

    @l
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
    public final AttributedText getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollapsedCalculationContentItem)) {
            return false;
        }
        CollapsedCalculationContentItem collapsedCalculationContentItem = (CollapsedCalculationContentItem) obj;
        return L.f(this.title, collapsedCalculationContentItem.title) && L.f(this.value, collapsedCalculationContentItem.value) && L.f(this.hint, collapsedCalculationContentItem.hint) && L.f(this.icon, collapsedCalculationContentItem.icon) && L.f(this.onboardingTooltip, collapsedCalculationContentItem.onboardingTooltip);
    }

    public final int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.value;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        OnboardingTooltip onboardingTooltip = this.onboardingTooltip;
        return iHashCode4 + (onboardingTooltip != null ? onboardingTooltip.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CollapsedCalculationContentItem(title=" + this.title + ", value=" + this.value + ", hint=" + this.hint + ", icon=" + this.icon + ", onboardingTooltip=" + this.onboardingTooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.value, i12);
        parcel.writeString(this.hint);
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i12);
        }
        OnboardingTooltip onboardingTooltip = this.onboardingTooltip;
        if (onboardingTooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboardingTooltip.writeToParcel(parcel, i12);
        }
    }
}
