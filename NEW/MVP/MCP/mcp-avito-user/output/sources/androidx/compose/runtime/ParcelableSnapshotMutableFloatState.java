package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22158c;
import androidx.compose.runtime.snapshots.C22176v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SnapshotFloatState.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroidx/compose/runtime/c3;", "Landroid/os/Parcelable;", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableFloatState extends C22040c3 implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR;

    /* compiled from: SnapshotFloatState.android.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableFloatState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableFloatState[] newArray(int i12) {
            return new ParcelableSnapshotMutableFloatState[i12];
        }
    }

    /* compiled from: SnapshotFloatState.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$b;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public ParcelableSnapshotMutableFloatState(float f12) {
        AbstractC22167l abstractC22167lJ = C22176v.j();
        C22040c3.a aVar = new C22040c3.a(abstractC22167lJ.getF38722b(), f12);
        if (!(abstractC22167lJ instanceof C22158c)) {
            aVar.f38675b = new C22040c3.a(1, f12);
        }
        this.f38188c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeFloat(f());
    }
}
