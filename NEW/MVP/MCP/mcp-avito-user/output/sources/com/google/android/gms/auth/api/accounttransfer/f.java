package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.internal.auth.zzap;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class f extends C36616a.AbstractC10618a {
    @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
    public final /* synthetic */ C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, Object obj, i.b bVar, i.c cVar) {
        return new zzap(context, looper, c36703g, (u) obj, bVar, cVar);
    }
}
