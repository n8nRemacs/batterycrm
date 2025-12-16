package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.InterfaceC36652k;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class zbw extends zba implements IInterface {
    public final void zbc(zbm zbmVar, BeginSignInRequest beginSignInRequest) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbmVar);
        zbc.zbc(parcelE4, beginSignInRequest);
        f4(parcelE4, 1);
    }

    public final void zbd(zbp zbpVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbpVar);
        zbc.zbc(parcelE4, getPhoneNumberHintIntentRequest);
        parcelE4.writeString(str);
        f4(parcelE4, 4);
    }

    public final void zbe(zbr zbrVar, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, zbrVar);
        zbc.zbc(parcelE4, getSignInIntentRequest);
        f4(parcelE4, 3);
    }

    public final void zbf(InterfaceC36652k interfaceC36652k, String str) {
        Parcel parcelE4 = e4();
        zbc.zbd(parcelE4, interfaceC36652k);
        parcelE4.writeString(str);
        f4(parcelE4, 2);
    }
}
