package com.google.android.play.core.review.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class g extends b implements h {
    public g() {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.google.android.play.core.review.internal.b
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i13 = c.f358619a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AK.c.g(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        l(bundle);
        return true;
    }
}
