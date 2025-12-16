package com.google.android.gms.internal.auth;

import PX0.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.b;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzbo extends h implements c {
    public zzbo(@N Activity activity, @P com.google.android.gms.auth.api.c cVar) {
        super(activity, b.f348590a, cVar == null ? com.google.android.gms.auth.api.c.f348592c : cVar, h.a.f348930c);
    }

    public final Task<String> getSpatulaHeader() {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn((C37028k) obj2));
            }
        };
        aVarA.f348955d = 1520;
        return doRead(aVarA.a());
    }

    public final Task<ProxyResponse> performProxyRequest(@N final ProxyRequest proxyRequest) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ProxyRequest proxyRequest2 = proxyRequest;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm((C37028k) obj2), proxyRequest2);
            }
        };
        aVarA.f348955d = 1518;
        return doWrite(aVarA.a());
    }

    public zzbo(@N Context context, @P com.google.android.gms.auth.api.c cVar) {
        super(context, b.f348590a, cVar == null ? com.google.android.gms.auth.api.c.f348592c : cVar, h.a.f348930c);
    }
}
