package com.avito.android.user_favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: FavoritesLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/FavoritesLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_user-favorites_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class FavoritesLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<FavoritesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f316784b;

    /* compiled from: FavoritesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoritesLink> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesLink createFromParcel(Parcel parcel) {
            return new FavoritesLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesLink[] newArray(int i12) {
            return new FavoritesLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoritesLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f316784b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public FavoritesLink(@Y61.l Integer num) {
        this.f316784b = num;
    }

    public /* synthetic */ FavoritesLink(Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num);
    }
}
