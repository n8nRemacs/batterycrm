package com.avito.android.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesFragmentParams.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/FavoritesFragmentParams;", "Lcom/avito/android/util/OpenParams;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesFragmentParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<FavoritesFragmentParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FavoritesSpace f156262b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f156263c;

    /* compiled from: FavoritesFragmentParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoritesFragmentParams> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesFragmentParams createFromParcel(Parcel parcel) {
            return new FavoritesFragmentParams(FavoritesSpace.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesFragmentParams[] newArray(int i12) {
            return new FavoritesFragmentParams[i12];
        }
    }

    public FavoritesFragmentParams(@Y61.k FavoritesSpace favoritesSpace, @Y61.l Integer num) {
        this.f156262b = favoritesSpace;
        this.f156263c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156262b.name());
        Integer num = this.f156263c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ FavoritesFragmentParams(FavoritesSpace favoritesSpace, Integer num, int i12, C42822w c42822w) {
        this(favoritesSpace, (i12 & 2) != 0 ? null : num);
    }
}
