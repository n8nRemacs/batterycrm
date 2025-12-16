package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbk extends zba implements IInterface {
    public final void zbc(zbj zbjVar, AuthorizationRequest authorizationRequest) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbjVar);
        zbc.zbc(parcelE4, authorizationRequest);
        f4(parcelE4, 1);
    }
}
