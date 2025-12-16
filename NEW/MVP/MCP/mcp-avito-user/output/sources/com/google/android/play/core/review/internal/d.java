package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public final class d extends a implements f {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.review.internal.f
    public final void R1(String str, Bundle bundle, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i12 = c.f358619a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(hVar);
        try {
            this.f358618a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
