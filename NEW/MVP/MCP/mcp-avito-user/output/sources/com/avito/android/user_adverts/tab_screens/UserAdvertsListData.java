package com.avito.android.user_adverts.tab_screens;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsListData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListData;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsListData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsListData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f314689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314690c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314691d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UserAdvertsSpace f314692e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f314693f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Screen f314694g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f314695h;

    /* compiled from: UserAdvertsListData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsListData> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListData createFromParcel(Parcel parcel) {
            return new UserAdvertsListData(parcel.readString(), parcel.readInt(), parcel.readInt(), UserAdvertsSpace.valueOf(parcel.readString()), parcel.readInt() != 0, (Screen) parcel.readParcelable(UserAdvertsListData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsListData[] newArray(int i12) {
            return new UserAdvertsListData[i12];
        }
    }

    public UserAdvertsListData(@k String str, int i12, int i13, @k UserAdvertsSpace userAdvertsSpace, boolean z12, @k Screen screen, boolean z13) {
        this.f314689b = str;
        this.f314690c = i12;
        this.f314691d = i13;
        this.f314692e = userAdvertsSpace;
        this.f314693f = z12;
        this.f314694g = screen;
        this.f314695h = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f314689b);
        parcel.writeInt(this.f314690c);
        parcel.writeInt(this.f314691d);
        parcel.writeString(this.f314692e.name());
        parcel.writeInt(this.f314693f ? 1 : 0);
        parcel.writeParcelable(this.f314694g, i12);
        parcel.writeInt(this.f314695h ? 1 : 0);
    }

    public /* synthetic */ UserAdvertsListData(String str, int i12, int i13, UserAdvertsSpace userAdvertsSpace, boolean z12, Screen screen, boolean z13, int i14, C42822w c42822w) {
        this(str, i12, i13, userAdvertsSpace, z12, (i14 & 32) != 0 ? UserAdvertsScreen.f90543d : screen, (i14 & 64) != 0 ? false : z13);
    }
}
