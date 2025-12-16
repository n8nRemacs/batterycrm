package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class z extends s implements A {
    public z() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.assetpacks.internal.s
    public final boolean e4(Parcel parcel, int i12) {
        B b12 = null;
        if (i12 == 2) {
            Bundle bundle = (Bundle) t.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                b12 = iInterfaceQueryLocalInterface instanceof B ? (B) iInterfaceQueryLocalInterface : new B(strongBinder);
            }
            t.b(parcel);
            s2(bundle, b12);
            return true;
        }
        if (i12 != 3) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            b12 = iInterfaceQueryLocalInterface2 instanceof B ? (B) iInterfaceQueryLocalInterface2 : new B(strongBinder2);
        }
        t.b(parcel);
        C0(b12);
        return true;
    }
}
