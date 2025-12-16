package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36703g;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzx extends C36616a.AbstractC10618a {
    @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
    public final /* synthetic */ C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, Object obj, i.b bVar, i.c cVar) {
        return new zzy(context, looper, c36703g, bVar, cVar);
    }
}
