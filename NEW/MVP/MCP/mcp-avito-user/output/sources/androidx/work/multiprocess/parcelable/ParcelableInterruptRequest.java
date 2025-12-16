package androidx.work.multiprocess.parcelable;

import X41.f;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParcelableInterruptRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest;", "Landroid/os/Parcelable;", "b", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public final /* data */ class ParcelableInterruptRequest implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<ParcelableInterruptRequest> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f56179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56180c;

    /* compiled from: ParcelableInterruptRequest.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/work/multiprocess/parcelable/ParcelableInterruptRequest$a", "Landroid/os/Parcelable$Creator;", "Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableInterruptRequest> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableInterruptRequest createFromParcel(Parcel parcel) {
            return new ParcelableInterruptRequest(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableInterruptRequest[] newArray(int i12) {
            return new ParcelableInterruptRequest[i12];
        }
    }

    /* compiled from: ParcelableInterruptRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/work/multiprocess/parcelable/ParcelableInterruptRequest;", "CREATOR", "Landroid/os/Parcelable$Creator;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public ParcelableInterruptRequest(@k String str, int i12) {
        this.f56179b = str;
        this.f56180c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableInterruptRequest)) {
            return false;
        }
        ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) obj;
        return L.f(this.f56179b, parcelableInterruptRequest.f56179b) && this.f56180c == parcelableInterruptRequest.f56180c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56180c) + (this.f56179b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableInterruptRequest(id=");
        sb2.append(this.f56179b);
        sb2.append(", stopReason=");
        return r.t(sb2, this.f56180c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f56179b);
        parcel.writeInt(this.f56180c);
    }
}
