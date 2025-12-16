package com.avito.android.async_phone;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.event.ContactSource;
import kotlin.Metadata;

/* compiled from: AsyncPhoneRequestData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/AsyncPhoneRequestData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncPhoneRequestData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AsyncPhoneRequestData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AsyncPhoneItem f92116b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ContactSource f92117c;

    /* compiled from: AsyncPhoneRequestData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AsyncPhoneRequestData> {
        @Override // android.os.Parcelable.Creator
        public final AsyncPhoneRequestData createFromParcel(Parcel parcel) {
            return new AsyncPhoneRequestData((AsyncPhoneItem) parcel.readParcelable(AsyncPhoneRequestData.class.getClassLoader()), ContactSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AsyncPhoneRequestData[] newArray(int i12) {
            return new AsyncPhoneRequestData[i12];
        }
    }

    public AsyncPhoneRequestData(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k ContactSource contactSource) {
        this.f92116b = asyncPhoneItem;
        this.f92117c = contactSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f92116b, i12);
        parcel.writeString(this.f92117c.name());
    }
}
