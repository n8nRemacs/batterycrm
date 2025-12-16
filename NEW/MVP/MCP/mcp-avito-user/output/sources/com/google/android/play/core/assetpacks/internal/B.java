package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class B extends C37131a implements IInterface {
    public B(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void M2(Bundle bundle) {
        Parcel parcelE4 = e4();
        int i12 = t.f358383a;
        parcelE4.writeInt(1);
        bundle.writeToParcel(parcelE4, 0);
        f4(parcelE4, 3);
    }
}
