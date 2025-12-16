package com.avito.android.iac_calls_history.impl_module.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CallsHistoryLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/CallsHistoryLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class CallsHistoryLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CallsHistoryLink> CREATOR = new a();

    /* compiled from: CallsHistoryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallsHistoryLink> {
        @Override // android.os.Parcelable.Creator
        public final CallsHistoryLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CallsHistoryLink();
        }

        @Override // android.os.Parcelable.Creator
        public final CallsHistoryLink[] newArray(int i12) {
            return new CallsHistoryLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
