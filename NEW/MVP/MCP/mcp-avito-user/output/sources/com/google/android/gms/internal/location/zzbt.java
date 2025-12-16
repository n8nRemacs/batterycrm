package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.C37028k;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzbt extends zzbu {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f350462r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(i iVar, List list) {
        super(iVar);
        this.f350462r = list;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final void c(C36616a.b bVar) {
        C37028k c37028k = new C37028k();
        c37028k.f355672a.c(new zzbq(this));
        ((zzda) bVar).zzy(this.f350462r, c37028k);
    }
}
