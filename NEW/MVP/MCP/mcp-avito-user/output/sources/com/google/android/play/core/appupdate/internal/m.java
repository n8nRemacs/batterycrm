package com.google.android.play.core.appupdate.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class m extends h implements n {
    public m() {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.h
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i13 = i.f358036a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(AK.c.g(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            k(bundle);
            return true;
        }
        if (i12 != 3) {
            return false;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i14 = i.f358036a;
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(AK.c.g(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        l(bundle2);
        return true;
    }
}
