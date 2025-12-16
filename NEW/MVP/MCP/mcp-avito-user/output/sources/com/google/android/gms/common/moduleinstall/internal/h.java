package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class h extends zaa implements IInterface {
    public final void g4(BinderC36738a binderC36738a, ApiFeatureRequest apiFeatureRequest, j jVar) {
        Parcel parcelE4 = e4();
        zac.zad(parcelE4, binderC36738a);
        zac.zac(parcelE4, apiFeatureRequest);
        zac.zad(parcelE4, jVar);
        f4(parcelE4, 2);
    }
}
