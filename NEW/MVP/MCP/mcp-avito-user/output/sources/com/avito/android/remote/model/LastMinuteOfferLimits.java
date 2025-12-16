package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/LastMinuteOfferLimits;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/LastMinuteOfferLimit;", "min", "max", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferLimit;Lcom/avito/android/remote/model/LastMinuteOfferLimit;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/LastMinuteOfferLimit;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/LastMinuteOfferLimit;Lcom/avito/android/remote/model/LastMinuteOfferLimit;)Lcom/avito/android/remote/model/LastMinuteOfferLimits;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/LastMinuteOfferLimit;", "getMin", "getMax", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LastMinuteOfferLimits implements Parcelable {

    @k
    public static final Parcelable.Creator<LastMinuteOfferLimits> CREATOR = new Creator();

    @c("max")
    @k
    private final LastMinuteOfferLimit max;

    @c("min")
    @k
    private final LastMinuteOfferLimit min;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LastMinuteOfferLimits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferLimits createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<LastMinuteOfferLimit> creator = LastMinuteOfferLimit.CREATOR;
            return new LastMinuteOfferLimits(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferLimits[] newArray(int i12) {
            return new LastMinuteOfferLimits[i12];
        }
    }

    public LastMinuteOfferLimits(@k String str, @k LastMinuteOfferLimit lastMinuteOfferLimit, @k LastMinuteOfferLimit lastMinuteOfferLimit2) {
        this.title = str;
        this.min = lastMinuteOfferLimit;
        this.max = lastMinuteOfferLimit2;
    }

    public static /* synthetic */ LastMinuteOfferLimits copy$default(LastMinuteOfferLimits lastMinuteOfferLimits, String str, LastMinuteOfferLimit lastMinuteOfferLimit, LastMinuteOfferLimit lastMinuteOfferLimit2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lastMinuteOfferLimits.title;
        }
        if ((i12 & 2) != 0) {
            lastMinuteOfferLimit = lastMinuteOfferLimits.min;
        }
        if ((i12 & 4) != 0) {
            lastMinuteOfferLimit2 = lastMinuteOfferLimits.max;
        }
        return lastMinuteOfferLimits.copy(str, lastMinuteOfferLimit, lastMinuteOfferLimit2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final LastMinuteOfferLimit getMin() {
        return this.min;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final LastMinuteOfferLimit getMax() {
        return this.max;
    }

    @k
    public final LastMinuteOfferLimits copy(@k String title, @k LastMinuteOfferLimit min, @k LastMinuteOfferLimit max) {
        return new LastMinuteOfferLimits(title, min, max);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastMinuteOfferLimits)) {
            return false;
        }
        LastMinuteOfferLimits lastMinuteOfferLimits = (LastMinuteOfferLimits) other;
        return L.f(this.title, lastMinuteOfferLimits.title) && L.f(this.min, lastMinuteOfferLimits.min) && L.f(this.max, lastMinuteOfferLimits.max);
    }

    @k
    public final LastMinuteOfferLimit getMax() {
        return this.max;
    }

    @k
    public final LastMinuteOfferLimit getMin() {
        return this.min;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.max.hashCode() + ((this.min.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        return "LastMinuteOfferLimits(title=" + this.title + ", min=" + this.min + ", max=" + this.max + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.min.writeToParcel(parcel, flags);
        this.max.writeToParcel(parcel, flags);
    }
}
