package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: MainScreenLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MainScreenLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class MainScreenLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<MainScreenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133432c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133433d;

    /* compiled from: MainScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MainScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final MainScreenLink createFromParcel(Parcel parcel) {
            return new MainScreenLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MainScreenLink[] newArray(int i12) {
            return new MainScreenLink[i12];
        }
    }

    public MainScreenLink() {
        this(null, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133431b);
        parcel.writeString(this.f133432c);
        parcel.writeInt(this.f133433d ? 1 : 0);
    }

    public /* synthetic */ MainScreenLink(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? false : z12);
    }

    public MainScreenLink(@Y61.l String str, @Y61.l String str2, boolean z12) {
        this.f133431b = str;
        this.f133432c = str2;
        this.f133433d = z12;
    }
}
