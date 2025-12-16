package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tasks.Task;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes6.dex */
public abstract class g extends com.google.android.gms.common.api.h<C36616a.d.C10620d> implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f348707k = new C36616a("SmsRetriever.API", new i(), new C36616a.g());

    public g(@N Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) f348707k, C36616a.d.f348913j2, h.a.f348930c);
    }

    @Override // com.google.android.gms.auth.api.phone.f
    @N
    public abstract Task<Void> startSmsRetriever();

    @N
    public abstract Task<Void> startSmsUserConsent(@P String str);

    public g(@N Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) f348707k, C36616a.d.f348913j2, h.a.f348930c);
    }
}
