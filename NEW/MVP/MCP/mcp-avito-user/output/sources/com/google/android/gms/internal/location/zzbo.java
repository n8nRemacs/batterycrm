package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.tasks.C37028k;
import j.B;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzbo implements InterfaceC36673v, zzcs {

    /* renamed from: a, reason: collision with root package name */
    public final zzbn f350454a;

    /* renamed from: b, reason: collision with root package name */
    @B
    public C36658n f350455b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public boolean f350456c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbp f350457d;

    public zzbo(zzbp zzbpVar, C36658n c36658n, zzbn zzbnVar) {
        this.f350457d = zzbpVar;
        this.f350455b = c36658n;
        this.f350454a = zzbnVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
    public final void accept(Object obj, Object obj2) {
        C36658n.a aVar;
        boolean z12;
        zzda zzdaVar = (zzda) obj;
        C37028k c37028k = (C37028k) obj2;
        synchronized (this) {
            aVar = this.f350455b.f349180c;
            z12 = this.f350456c;
            this.f350455b.a();
        }
        if (aVar == null) {
            c37028k.b(Boolean.FALSE);
        } else {
            this.f350454a.zza(zzdaVar, aVar, z12, c37028k);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C36658n zza() {
        return this.f350455b;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        C36658n.a<?> aVar;
        synchronized (this) {
            this.f350456c = false;
            aVar = this.f350455b.f349180c;
        }
        if (aVar != null) {
            this.f350457d.doUnregisterEventListener(aVar, 2441);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C36658n c36658n) {
        C36658n c36658n2 = this.f350455b;
        if (c36658n2 != c36658n) {
            c36658n2.a();
            this.f350455b = c36658n;
        }
    }
}
