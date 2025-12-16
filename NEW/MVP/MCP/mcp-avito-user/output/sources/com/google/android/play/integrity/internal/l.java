package com.google.android.play.integrity.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public abstract class l extends e implements m {
    public l() {
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.e
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i13 = f.f358914a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AK.c.g(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        b(bundle);
        return true;
    }
}
