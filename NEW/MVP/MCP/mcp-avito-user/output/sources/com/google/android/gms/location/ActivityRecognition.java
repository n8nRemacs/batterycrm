package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.internal.location.zzag;
import com.google.android.gms.internal.location.zzw;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public class ActivityRecognition {

    @j.N
    @Deprecated
    public static final C36616a<C36616a.d.C10620d> API = zzag.zzb;

    @j.N
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new zzw();

    @j.N
    public static InterfaceC36780a getClient(@j.N Activity activity) {
        return new zzag(activity);
    }

    @j.N
    public static InterfaceC36780a getClient(@j.N Context context) {
        return new zzag(context);
    }
}
