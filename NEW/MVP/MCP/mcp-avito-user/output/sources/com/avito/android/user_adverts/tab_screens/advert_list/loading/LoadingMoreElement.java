package com.avito.android.user_adverts.tab_screens.advert_list.loading;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SerpElement;
import kotlin.Metadata;

/* compiled from: LoadingMoreElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/loading/LoadingMoreElement;", "Lcom/avito/android/remote/model/SerpElement;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadingMoreElement implements SerpElement {

    @k
    public static final Parcelable.Creator<LoadingMoreElement> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f314742b;

    /* compiled from: LoadingMoreElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoadingMoreElement> {
        @Override // android.os.Parcelable.Creator
        public final LoadingMoreElement createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new LoadingMoreElement();
        }

        @Override // android.os.Parcelable.Creator
        public final LoadingMoreElement[] newArray(int i12) {
            return new LoadingMoreElement[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF314742b() {
        return this.f314742b;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f314742b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
