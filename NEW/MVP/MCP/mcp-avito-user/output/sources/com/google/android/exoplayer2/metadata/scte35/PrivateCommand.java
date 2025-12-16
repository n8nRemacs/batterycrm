package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;

/* loaded from: classes6.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f345728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345729c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f345730d;

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
        this.f345728b = j13;
        this.f345729c = j12;
        this.f345730d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f345728b);
        parcel.writeLong(this.f345729c);
        parcel.writeByteArray(this.f345730d);
    }

    public PrivateCommand(Parcel parcel, a aVar) {
        this.f345728b = parcel.readLong();
        this.f345729c = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i12 = U.f348106a;
        this.f345730d = bArrCreateByteArray;
    }
}
