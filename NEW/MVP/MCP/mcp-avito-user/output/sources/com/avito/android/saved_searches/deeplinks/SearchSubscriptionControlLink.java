package com.avito.android.saved_searches.deeplinks;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SearchSubscriptionControlLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/SearchSubscriptionControlLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class SearchSubscriptionControlLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SearchSubscriptionControlLink> CREATOR = new a();

    /* compiled from: SearchSubscriptionControlLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchSubscriptionControlLink> {
        @Override // android.os.Parcelable.Creator
        public final SearchSubscriptionControlLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SearchSubscriptionControlLink();
        }

        @Override // android.os.Parcelable.Creator
        public final SearchSubscriptionControlLink[] newArray(int i12) {
            return new SearchSubscriptionControlLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
