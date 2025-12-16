package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpCalculatorButton.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/fmp/FmpButtonClick;", "Landroid/os/Parcelable;", "", Constants.DEEPLINK, "", "Lcom/avito/android/remote/fmp/AnalyticsEvent;", "analytics", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpButtonClick implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpButtonClick> CREATOR = new a();

    @c("analytics")
    @l
    private final List<AnalyticsEvent> analytics;

    @c(Constants.DEEPLINK)
    @l
    private final String deeplink;

    /* compiled from: FmpCalculatorButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FmpButtonClick> {
        @Override // android.os.Parcelable.Creator
        public final FmpButtonClick createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AnalyticsEvent.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new FmpButtonClick(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FmpButtonClick[] newArray(int i12) {
            return new FmpButtonClick[i12];
        }
    }

    public FmpButtonClick(@l String str, @l List<AnalyticsEvent> list) {
        this.deeplink = str;
        this.analytics = list;
    }

    @l
    public final List<AnalyticsEvent> c() {
        return this.analytics;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmpButtonClick)) {
            return false;
        }
        FmpButtonClick fmpButtonClick = (FmpButtonClick) obj;
        return L.f(this.deeplink, fmpButtonClick.deeplink) && L.f(this.analytics, fmpButtonClick.analytics);
    }

    public final int hashCode() {
        String str = this.deeplink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AnalyticsEvent> list = this.analytics;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FmpButtonClick(deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", analytics=");
        return H.p(sb2, this.analytics, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.deeplink);
        List<AnalyticsEvent> list = this.analytics;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AnalyticsEvent) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
