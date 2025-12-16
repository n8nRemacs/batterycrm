package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.android.gms.common.internal.C36703g;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes6.dex */
final class zzn extends C36616a.AbstractC10618a<zzd, C36616a.d.C10620d> {
    @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
    public final C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, C36616a.d.C10620d c10620d, InterfaceC36637f interfaceC36637f, InterfaceC36664q interfaceC36664q) {
        return new zzd(context, looper, 300, c36703g, interfaceC36637f, interfaceC36664q);
    }
}
