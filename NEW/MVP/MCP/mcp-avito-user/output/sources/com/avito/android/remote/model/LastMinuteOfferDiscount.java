package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0018R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001a¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/LastMinuteOfferDiscount;", "Landroid/os/Parcelable;", "", "isEnabled", "", "enabledText", "title", "Lcom/avito/android/remote/model/LastMinuteOfferLimits;", "limits", "", "value", "", "Lcom/avito/android/remote/model/LastMinuteOfferOption;", "options", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferLimits;ILjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/LastMinuteOfferLimits;", "component5", "()I", "component6", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferLimits;ILjava/util/List;)Lcom/avito/android/remote/model/LastMinuteOfferDiscount;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getEnabledText", "getTitle", "Lcom/avito/android/remote/model/LastMinuteOfferLimits;", "getLimits", "I", "getValue", "Ljava/util/List;", "getOptions", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LastMinuteOfferDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<LastMinuteOfferDiscount> CREATOR = new Creator();

    @c("enabledText")
    @k
    private final String enabledText;

    @c("isEnabled")
    private final boolean isEnabled;

    @c("limits")
    @k
    private final LastMinuteOfferLimits limits;

    @c("options")
    @k
    private final List<LastMinuteOfferOption> options;

    @c("title")
    @k
    private final String title;

    @c("value")
    private final int value;

    /* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LastMinuteOfferDiscount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferDiscount createFromParcel(@k Parcel parcel) {
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            LastMinuteOfferLimits lastMinuteOfferLimitsCreateFromParcel = LastMinuteOfferLimits.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(LastMinuteOfferOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LastMinuteOfferDiscount(z12, string, string2, lastMinuteOfferLimitsCreateFromParcel, i12, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferDiscount[] newArray(int i12) {
            return new LastMinuteOfferDiscount[i12];
        }
    }

    public LastMinuteOfferDiscount(boolean z12, @k String str, @k String str2, @k LastMinuteOfferLimits lastMinuteOfferLimits, int i12, @k List<LastMinuteOfferOption> list) {
        this.isEnabled = z12;
        this.enabledText = str;
        this.title = str2;
        this.limits = lastMinuteOfferLimits;
        this.value = i12;
        this.options = list;
    }

    public static /* synthetic */ LastMinuteOfferDiscount copy$default(LastMinuteOfferDiscount lastMinuteOfferDiscount, boolean z12, String str, String str2, LastMinuteOfferLimits lastMinuteOfferLimits, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z12 = lastMinuteOfferDiscount.isEnabled;
        }
        if ((i13 & 2) != 0) {
            str = lastMinuteOfferDiscount.enabledText;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = lastMinuteOfferDiscount.title;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            lastMinuteOfferLimits = lastMinuteOfferDiscount.limits;
        }
        LastMinuteOfferLimits lastMinuteOfferLimits2 = lastMinuteOfferLimits;
        if ((i13 & 16) != 0) {
            i12 = lastMinuteOfferDiscount.value;
        }
        int i14 = i12;
        if ((i13 & 32) != 0) {
            list = lastMinuteOfferDiscount.options;
        }
        return lastMinuteOfferDiscount.copy(z12, str3, str4, lastMinuteOfferLimits2, i14, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getEnabledText() {
        return this.enabledText;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final LastMinuteOfferLimits getLimits() {
        return this.limits;
    }

    /* renamed from: component5, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @k
    public final List<LastMinuteOfferOption> component6() {
        return this.options;
    }

    @k
    public final LastMinuteOfferDiscount copy(boolean isEnabled, @k String enabledText, @k String title, @k LastMinuteOfferLimits limits, int value, @k List<LastMinuteOfferOption> options) {
        return new LastMinuteOfferDiscount(isEnabled, enabledText, title, limits, value, options);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastMinuteOfferDiscount)) {
            return false;
        }
        LastMinuteOfferDiscount lastMinuteOfferDiscount = (LastMinuteOfferDiscount) other;
        return this.isEnabled == lastMinuteOfferDiscount.isEnabled && L.f(this.enabledText, lastMinuteOfferDiscount.enabledText) && L.f(this.title, lastMinuteOfferDiscount.title) && L.f(this.limits, lastMinuteOfferDiscount.limits) && this.value == lastMinuteOfferDiscount.value && L.f(this.options, lastMinuteOfferDiscount.options);
    }

    @k
    public final String getEnabledText() {
        return this.enabledText;
    }

    @k
    public final LastMinuteOfferLimits getLimits() {
        return this.limits;
    }

    @k
    public final List<LastMinuteOfferOption> getOptions() {
        return this.options;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.options.hashCode() + r.e(this.value, (this.limits.hashCode() + H.d(H.d(Boolean.hashCode(this.isEnabled) * 31, 31, this.enabledText), 31, this.title)) * 31, 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastMinuteOfferDiscount(isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", enabledText=");
        sb2.append(this.enabledText);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", limits=");
        sb2.append(this.limits);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.enabledText);
        parcel.writeString(this.title);
        this.limits.writeToParcel(parcel, flags);
        parcel.writeInt(this.value);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((LastMinuteOfferOption) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
