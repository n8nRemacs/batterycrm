package com.avito.android.serp.adapter.retry;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RetryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/retry/RetryItem;", "Lcom/avito/android/serp/adapter/l1;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RetryItem implements l1, Parcelable {

    @k
    public static final Parcelable.Creator<RetryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f270756b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AppendingState f270757c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f270758d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f270759e;

    /* compiled from: RetryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetryItem> {
        @Override // android.os.Parcelable.Creator
        public final RetryItem createFromParcel(Parcel parcel) {
            return new RetryItem(parcel.readInt(), AppendingState.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RetryItem[] newArray(int i12) {
            return new RetryItem[i12];
        }
    }

    public RetryItem() {
        this(0, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryItem)) {
            return false;
        }
        RetryItem retryItem = (RetryItem) obj;
        return this.f270756b == retryItem.f270756b && this.f270757c == retryItem.f270757c && this.f270758d == retryItem.f270758d && L.f(this.f270759e, retryItem.f270759e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272259o() {
        return this.f270756b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272246b() {
        return this.f270759e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272258n() {
        return this.f270758d;
    }

    public final int hashCode() {
        return this.f270759e.hashCode() + com.avito.android.actions_sheet.a.j(this.f270758d, (this.f270757c.hashCode() + (Integer.hashCode(this.f270756b) * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryItem(spanCount=");
        sb2.append(this.f270756b);
        sb2.append(", appendingState=");
        sb2.append(this.f270757c);
        sb2.append(", viewType=");
        sb2.append(this.f270758d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f270759e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f270756b);
        parcel.writeString(this.f270757c.name());
        parcel.writeString(this.f270758d.name());
        parcel.writeString(this.f270759e);
    }

    public RetryItem(int i12, @k AppendingState appendingState, @k SerpViewType serpViewType, @k String str) {
        this.f270756b = i12;
        this.f270757c = appendingState;
        this.f270758d = serpViewType;
        this.f270759e = str;
    }

    public /* synthetic */ RetryItem(int i12, AppendingState appendingState, SerpViewType serpViewType, String str, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 6 : i12, (i13 & 2) != 0 ? AppendingState.f270750b : appendingState, (i13 & 4) != 0 ? SerpViewType.f268582b : serpViewType, (i13 & 8) != 0 ? "retry_view_id" : str);
    }
}
