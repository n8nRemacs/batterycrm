package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzar extends zzat {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Location f350452r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(i iVar, Location location) {
        super(iVar);
        this.f350452r = location;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzda) bVar).zzz(this.f350452r, zzau.a(this));
    }
}
