package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.pr0;

/* loaded from: classes8.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f383032a;

    /* renamed from: b, reason: collision with root package name */
    public final long f383033b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f383034c;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i12) {
            return new PrivateCommand[i12];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, int i12) {
        this(parcel);
    }

    public static PrivateCommand a(pr0 pr0Var, int i12, long j12) {
        long jV2 = pr0Var.v();
        int i13 = i12 - 4;
        byte[] bArr = new byte[i13];
        pr0Var.a(bArr, 0, i13);
        return new PrivateCommand(jV2, bArr, j12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f383032a);
        parcel.writeLong(this.f383033b);
        parcel.writeByteArray(this.f383034c);
    }

    private PrivateCommand(long j12, byte[] bArr, long j13) {
        this.f383032a = j13;
        this.f383033b = j12;
        this.f383034c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f383032a = parcel.readLong();
        this.f383033b = parcel.readLong();
        this.f383034c = (byte[]) pc1.a(parcel.createByteArray());
    }
}
