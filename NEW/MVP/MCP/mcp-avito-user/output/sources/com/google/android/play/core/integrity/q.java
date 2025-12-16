package com.google.android.play.core.integrity;

import android.util.Base64;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class q implements InterfaceC37198a {

    /* renamed from: a, reason: collision with root package name */
    public final x f358578a;

    public q(x xVar) {
        this.f358578a = xVar;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC37198a
    public final Task<d> a(c cVar) {
        x xVar = this.f358578a;
        com.google.android.play.integrity.internal.z zVar = xVar.f358592c;
        if (zVar == null) {
            return C37030m.e(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(cVar.c(), 10);
            Long lB2 = cVar.b();
            xVar.f358590a.a("requestIntegrityToken(%s)", cVar);
            C37028k c37028k = new C37028k();
            zVar.b(new v(xVar, c37028k, bArrDecode, lB2, c37028k, cVar), c37028k);
            return c37028k.f355672a;
        } catch (IllegalArgumentException e12) {
            return C37030m.e(new IntegrityServiceException(-13, e12));
        }
    }
}
