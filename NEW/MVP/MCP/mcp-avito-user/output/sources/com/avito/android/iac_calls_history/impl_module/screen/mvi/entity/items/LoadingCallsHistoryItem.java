package com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import kotlin.Metadata;

/* compiled from: LoadingCallsHistoryItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/items/LoadingCallsHistoryItem;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState$Item;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadingCallsHistoryItem implements CallsHistoryScreenState.Item {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LoadingCallsHistoryItem f164848b = new LoadingCallsHistoryItem();

    @k
    public static final Parcelable.Creator<LoadingCallsHistoryItem> CREATOR = new a();

    /* compiled from: LoadingCallsHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoadingCallsHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final LoadingCallsHistoryItem createFromParcel(Parcel parcel) {
            parcel.readInt();
            return LoadingCallsHistoryItem.f164848b;
        }

        @Override // android.os.Parcelable.Creator
        public final LoadingCallsHistoryItem[] newArray(int i12) {
            return new LoadingCallsHistoryItem[i12];
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
