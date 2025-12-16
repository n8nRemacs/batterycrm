package androidx.work.multiprocess.parcelable;

import X41.f;
import Y61.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ParcelableData.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableData;", "Landroid/os/Parcelable;", "b", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public final class ParcelableData implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<ParcelableData> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23544h f56176b;

    /* compiled from: ParcelableData.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/work/multiprocess/parcelable/ParcelableData$a", "Landroid/os/Parcelable$Creator;", "Landroidx/work/multiprocess/parcelable/ParcelableData;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableData> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableData createFromParcel(Parcel parcel) {
            return new ParcelableData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableData[] newArray(int i12) {
            return new ParcelableData[i12];
        }
    }

    /* compiled from: ParcelableData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/parcelable/ParcelableData$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/work/multiprocess/parcelable/ParcelableData;", "CREATOR", "Landroid/os/Parcelable$Creator;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public ParcelableData(@k C23544h c23544h) {
        this.f56176b = c23544h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        C23544h c23544h = this.f56176b;
        c23544h.getClass();
        C23544h.f55508b.getClass();
        parcel.writeByteArray(C23544h.b.c(c23544h));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParcelableData(@Y61.k android.os.Parcel r2) throws java.io.IOException {
        /*
            r1 = this;
            byte[] r2 = r2.createByteArray()
            if (r2 == 0) goto L11
            androidx.work.h$b r0 = androidx.work.C23544h.f55508b
            r0.getClass()
            androidx.work.h r2 = androidx.work.C23544h.b.a(r2)
            if (r2 != 0) goto L13
        L11:
            androidx.work.h r2 = androidx.work.C23544h.f55509c
        L13:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableData.<init>(android.os.Parcel):void");
    }
}
