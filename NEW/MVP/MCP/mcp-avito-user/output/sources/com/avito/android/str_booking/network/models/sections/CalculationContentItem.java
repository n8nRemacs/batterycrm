package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/CalculationContentItem;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "value", "hint", "Lcom/avito/android/str_booking/network/models/sections/Icon;", "icon", "", "Lcom/avito/android/str_booking/network/models/sections/CollapsedCalculationContentItem;", "_collapsedItems", "", "collapsed", "Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "onboardingTooltip", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/str_booking/network/models/sections/Icon;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "h", "()Lcom/avito/android/remote/model/text/AttributedText;", "i", "e", "Lcom/avito/android/str_booking/network/models/sections/Icon;", "f", "()Lcom/avito/android/str_booking/network/models/sections/Icon;", "Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "g", "()Lcom/avito/android/str_booking/network/models/sections/OnboardingTooltip;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalculationContentItem implements Parcelable {

    @k
    public static final Parcelable.Creator<CalculationContentItem> CREATOR = new a();

    @c("collapsedItems")
    @l
    private final List<CollapsedCalculationContentItem> _collapsedItems;

    @c("collapsed")
    @l
    private final Boolean collapsed;

    @c("hint")
    @l
    private final String hint;

    @c("icon")
    @l
    private final Icon icon;

    @c("id")
    @l
    private final String id;

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
    public static final class a implements Parcelable.Creator<CalculationContentItem> {
        @Override // android.os.Parcelable.Creator
        public final CalculationContentItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CalculationContentItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(CalculationContentItem.class.getClassLoader());
            String string2 = parcel.readString();
            Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CollapsedCalculationContentItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CalculationContentItem(string, attributedText, attributedText2, string2, iconCreateFromParcel, arrayList, boolValueOf, parcel.readInt() != 0 ? OnboardingTooltip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CalculationContentItem[] newArray(int i12) {
            return new CalculationContentItem[i12];
        }
    }

    public CalculationContentItem(@l String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str2, @l Icon icon, @l List<CollapsedCalculationContentItem> list, @l Boolean bool, @l OnboardingTooltip onboardingTooltip) {
        this.id = str;
        this.title = attributedText;
        this.value = attributedText2;
        this.hint = str2;
        this.icon = icon;
        this._collapsedItems = list;
        this.collapsed = bool;
        this.onboardingTooltip = onboardingTooltip;
    }

    public static CalculationContentItem a(CalculationContentItem calculationContentItem, Boolean bool) {
        return new CalculationContentItem(calculationContentItem.id, calculationContentItem.title, calculationContentItem.value, calculationContentItem.hint, calculationContentItem.icon, calculationContentItem._collapsedItems, bool, calculationContentItem.onboardingTooltip);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getCollapsed() {
        return this.collapsed;
    }

    @k
    public final List<CollapsedCalculationContentItem> d() {
        List<CollapsedCalculationContentItem> list = this._collapsedItems;
        return list == null ? C42784z0.f406748b : list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculationContentItem)) {
            return false;
        }
        CalculationContentItem calculationContentItem = (CalculationContentItem) obj;
        return L.f(this.id, calculationContentItem.id) && L.f(this.title, calculationContentItem.title) && L.f(this.value, calculationContentItem.value) && L.f(this.hint, calculationContentItem.hint) && L.f(this.icon, calculationContentItem.icon) && L.f(this._collapsedItems, calculationContentItem._collapsedItems) && L.f(this.collapsed, calculationContentItem.collapsed) && L.f(this.onboardingTooltip, calculationContentItem.onboardingTooltip);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final OnboardingTooltip getOnboardingTooltip() {
        return this.onboardingTooltip;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.title;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.value;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode5 = (iHashCode4 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<CollapsedCalculationContentItem> list = this._collapsedItems;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.collapsed;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnboardingTooltip onboardingTooltip = this.onboardingTooltip;
        return iHashCode7 + (onboardingTooltip != null ? onboardingTooltip.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final AttributedText getValue() {
        return this.value;
    }

    @k
    public final String toString() {
        return "CalculationContentItem(id=" + this.id + ", title=" + this.title + ", value=" + this.value + ", hint=" + this.hint + ", icon=" + this.icon + ", _collapsedItems=" + this._collapsedItems + ", collapsed=" + this.collapsed + ", onboardingTooltip=" + this.onboardingTooltip + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
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
        List<CollapsedCalculationContentItem> list = this._collapsedItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CollapsedCalculationContentItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.collapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
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
