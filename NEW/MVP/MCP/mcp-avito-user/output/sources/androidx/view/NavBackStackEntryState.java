package androidx.view;

import X41.f;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavBackStackEntryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f52849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52850c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Bundle f52851d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Bundle f52852e;

    /* compiled from: NavBackStackEntryState.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/navigation/NavBackStackEntryState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState[] newArray(int i12) {
            return new NavBackStackEntryState[i12];
        }
    }

    /* compiled from: NavBackStackEntryState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/NavBackStackEntryState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public NavBackStackEntryState(@k C23395u c23395u) {
        this.f52849b = c23395u.f53186g;
        this.f52850c = c23395u.f53182c.f52886i;
        this.f52851d = c23395u.a();
        Bundle bundle = new Bundle();
        this.f52852e = bundle;
        c23395u.f53189j.c(bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f52849b);
        parcel.writeInt(this.f52850c);
        parcel.writeBundle(this.f52851d);
        parcel.writeBundle(this.f52852e);
    }

    public NavBackStackEntryState(@k Parcel parcel) {
        this.f52849b = parcel.readString();
        this.f52850c = parcel.readInt();
        this.f52851d = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f52852e = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}
