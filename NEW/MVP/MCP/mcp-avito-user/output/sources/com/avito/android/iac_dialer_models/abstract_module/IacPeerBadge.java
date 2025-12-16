package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacPeerBadge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerBadge;", "Landroid/os/Parcelable;", "()V", "ReviewCount", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerBadge$ReviewCount;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacPeerBadge implements Parcelable {

    /* compiled from: IacPeerBadge.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerBadge$ReviewCount;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerBadge;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewCount extends IacPeerBadge {

        @k
        public static final Parcelable.Creator<ReviewCount> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f166867b;

        /* compiled from: IacPeerBadge.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCount> {
            @Override // android.os.Parcelable.Creator
            public final ReviewCount createFromParcel(Parcel parcel) {
                return new ReviewCount(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final ReviewCount[] newArray(int i12) {
                return new ReviewCount[i12];
            }
        }

        public ReviewCount(int i12) {
            super(null);
            this.f166867b = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewCount) && this.f166867b == ((ReviewCount) obj).f166867b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f166867b);
        }

        @k
        public final String toString() {
            return "ReviewCount(count=***)";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f166867b);
        }
    }

    public /* synthetic */ IacPeerBadge(C42822w c42822w) {
        this();
    }

    public IacPeerBadge() {
    }
}
