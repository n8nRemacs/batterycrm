package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentInfoAnalytic.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0010¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaPaymentInfoAnalytic;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalyticFields;", "", "searchType", "", "reportCount", "", "totalPrice", "<init>", "(IJLjava/lang/String;)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "copy", "(IJLjava/lang/String;)Lcom/avito/android/remote/model/autotekateaser/AutotekaPaymentInfoAnalytic;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getSearchType", "J", "getReportCount", "Ljava/lang/String;", "getTotalPrice", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaPaymentInfoAnalytic implements Parcelable, AutotekaAnalyticFields {

    @k
    public static final Parcelable.Creator<AutotekaPaymentInfoAnalytic> CREATOR = new Creator();

    @c("reportCount")
    private final long reportCount;

    @c("searchType")
    private final int searchType;

    @c("totalPrice")
    @k
    private final String totalPrice;

    /* compiled from: AutotekaPaymentInfoAnalytic.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaPaymentInfoAnalytic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaPaymentInfoAnalytic createFromParcel(@k Parcel parcel) {
            return new AutotekaPaymentInfoAnalytic(parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaPaymentInfoAnalytic[] newArray(int i12) {
            return new AutotekaPaymentInfoAnalytic[i12];
        }
    }

    public AutotekaPaymentInfoAnalytic(int i12, long j12, @k String str) {
        this.searchType = i12;
        this.reportCount = j12;
        this.totalPrice = str;
    }

    public static /* synthetic */ AutotekaPaymentInfoAnalytic copy$default(AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic, int i12, long j12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = autotekaPaymentInfoAnalytic.searchType;
        }
        if ((i13 & 2) != 0) {
            j12 = autotekaPaymentInfoAnalytic.reportCount;
        }
        if ((i13 & 4) != 0) {
            str = autotekaPaymentInfoAnalytic.totalPrice;
        }
        return autotekaPaymentInfoAnalytic.copy(i12, j12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSearchType() {
        return this.searchType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getReportCount() {
        return this.reportCount;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @k
    public final AutotekaPaymentInfoAnalytic copy(int searchType, long reportCount, @k String totalPrice) {
        return new AutotekaPaymentInfoAnalytic(searchType, reportCount, totalPrice);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaPaymentInfoAnalytic)) {
            return false;
        }
        AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic = (AutotekaPaymentInfoAnalytic) other;
        return this.searchType == autotekaPaymentInfoAnalytic.searchType && this.reportCount == autotekaPaymentInfoAnalytic.reportCount && L.f(this.totalPrice, autotekaPaymentInfoAnalytic.totalPrice);
    }

    public final long getReportCount() {
        return this.reportCount;
    }

    @Override // com.avito.android.remote.model.autotekateaser.AutotekaAnalyticFields
    public int getSearchType() {
        return this.searchType;
    }

    @k
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        return this.totalPrice.hashCode() + r.g(Integer.hashCode(this.searchType) * 31, 31, this.reportCount);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaPaymentInfoAnalytic(searchType=");
        sb2.append(this.searchType);
        sb2.append(", reportCount=");
        sb2.append(this.reportCount);
        sb2.append(", totalPrice=");
        return C22026a.c(sb2, this.totalPrice, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.searchType);
        parcel.writeLong(this.reportCount);
        parcel.writeString(this.totalPrice);
    }
}
