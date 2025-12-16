package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbn extends zba implements IInterface {
    public final void zbc(zbt zbtVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbtVar);
        zbc.zbc(parcelE4, saveAccountLinkingTokenRequest);
        f4(parcelE4, 1);
    }

    public final void zbd(zbv zbvVar, SavePasswordRequest savePasswordRequest) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbvVar);
        zbc.zbc(parcelE4, savePasswordRequest);
        f4(parcelE4, 2);
    }
}
