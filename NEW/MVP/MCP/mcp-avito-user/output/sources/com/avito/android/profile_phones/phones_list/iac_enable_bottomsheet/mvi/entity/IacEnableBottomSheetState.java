package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacEnableBottomSheetState.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacEnableBottomSheetState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227842b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f227843c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227844d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f227840e = new a(null);

    @k
    public static final Parcelable.Creator<IacEnableBottomSheetState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final IacEnableBottomSheetState f227841f = new IacEnableBottomSheetState(false, false, false, 4, null);

    /* compiled from: IacEnableBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetState$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacEnableBottomSheetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacEnableBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final IacEnableBottomSheetState createFromParcel(Parcel parcel) {
            return new IacEnableBottomSheetState(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacEnableBottomSheetState[] newArray(int i12) {
            return new IacEnableBottomSheetState[i12];
        }
    }

    public /* synthetic */ IacEnableBottomSheetState(boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(z12, z13, (i12 & 4) != 0 ? false : z14);
    }

    public static IacEnableBottomSheetState a(IacEnableBottomSheetState iacEnableBottomSheetState, boolean z12, boolean z13, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            z12 = iacEnableBottomSheetState.f227842b;
        }
        if ((i12 & 2) != 0) {
            z13 = iacEnableBottomSheetState.f227843c;
        }
        if ((i12 & 4) != 0) {
            z14 = iacEnableBottomSheetState.f227844d;
        }
        iacEnableBottomSheetState.getClass();
        return new IacEnableBottomSheetState(z12, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacEnableBottomSheetState)) {
            return false;
        }
        IacEnableBottomSheetState iacEnableBottomSheetState = (IacEnableBottomSheetState) obj;
        return this.f227842b == iacEnableBottomSheetState.f227842b && this.f227843c == iacEnableBottomSheetState.f227843c && this.f227844d == iacEnableBottomSheetState.f227844d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227844d) + r.i(Boolean.hashCode(this.f227842b) * 31, 31, this.f227843c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacEnableBottomSheetState(canChangeStateIacEnable=");
        sb2.append(this.f227842b);
        sb2.append(", iacEnable=");
        sb2.append(this.f227843c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f227844d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f227842b ? 1 : 0);
        parcel.writeInt(this.f227843c ? 1 : 0);
        parcel.writeInt(this.f227844d ? 1 : 0);
    }

    public IacEnableBottomSheetState(boolean z12, boolean z13, boolean z14) {
        this.f227842b = z12;
        this.f227843c = z13;
        this.f227844d = z14;
    }
}
