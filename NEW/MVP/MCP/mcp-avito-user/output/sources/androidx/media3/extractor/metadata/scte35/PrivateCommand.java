package androidx.media3.extractor.metadata.scte35;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;

@J
/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f50710b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50711c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f50712d;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i12) {
            return new PrivateCommand[i12];
        }
    }

    public PrivateCommand(long j12, byte[] bArr, long j13) {
        this.f50710b = j13;
        this.f50711c = j12;
        this.f50712d = bArr;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f50710b);
        sb2.append(", identifier= ");
        return c.j(this.f50711c, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f50710b);
        parcel.writeLong(this.f50711c);
        parcel.writeByteArray(this.f50712d);
    }

    public PrivateCommand(Parcel parcel, a aVar) {
        this.f50710b = parcel.readLong();
        this.f50711c = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i12 = M.f47887a;
        this.f50712d = bArrCreateByteArray;
    }
}
