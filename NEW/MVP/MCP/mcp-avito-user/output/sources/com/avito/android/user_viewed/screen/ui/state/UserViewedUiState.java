package com.avito.android.user_viewed.screen.ui.state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedUiState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/state/UserViewedUiState;", "Landroid/os/Parcelable;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedUiState implements Parcelable {

    @k
    public static final Parcelable.Creator<UserViewedUiState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f318507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f318508c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f318509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f318510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f318511f;

    /* compiled from: UserViewedUiState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedUiState> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedUiState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(UserViewedUiState.class, parcel, arrayList, iL2, 1);
            }
            return new UserViewedUiState(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedUiState[] newArray(int i12) {
            return new UserViewedUiState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserViewedUiState(@k List<? extends ParcelableItem> list, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f318507b = list;
        this.f318508c = z12;
        this.f318509d = z13;
        this.f318510e = z14;
        this.f318511f = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserViewedUiState)) {
            return false;
        }
        UserViewedUiState userViewedUiState = (UserViewedUiState) obj;
        return L.f(this.f318507b, userViewedUiState.f318507b) && this.f318508c == userViewedUiState.f318508c && this.f318509d == userViewedUiState.f318509d && this.f318510e == userViewedUiState.f318510e && this.f318511f == userViewedUiState.f318511f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318511f) + r.i(r.i(r.i(this.f318507b.hashCode() * 31, 31, this.f318508c), 31, this.f318509d), 31, this.f318510e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserViewedUiState(items=");
        sb2.append(this.f318507b);
        sb2.append(", enableOverScroll=");
        sb2.append(this.f318508c);
        sb2.append(", enableRefresh=");
        sb2.append(this.f318509d);
        sb2.append(", showRefresh=");
        sb2.append(this.f318510e);
        sb2.append(", resetList=");
        return r.x(sb2, this.f318511f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f318507b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f318508c ? 1 : 0);
        parcel.writeInt(this.f318509d ? 1 : 0);
        parcel.writeInt(this.f318510e ? 1 : 0);
        parcel.writeInt(this.f318511f ? 1 : 0);
    }

    public /* synthetic */ UserViewedUiState(List list, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15);
    }
}
