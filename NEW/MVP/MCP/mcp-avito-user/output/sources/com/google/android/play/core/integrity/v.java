package com.google.android.play.core.integrity;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class v extends com.google.android.play.integrity.internal.o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f358582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f358583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C37028k f358584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f358585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f358586g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, C37028k c37028k, byte[] bArr, Long l12, C37028k c37028k2, c cVar) {
        super(c37028k);
        this.f358586g = xVar;
        this.f358582c = bArr;
        this.f358583d = l12;
        this.f358584e = c37028k2;
        this.f358585f = cVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.w) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        C37028k c37028k = this.f358584e;
        x xVar = this.f358586g;
        try {
            xVar.f358592c.f358942m.K0(x.a(xVar, this.f358582c, this.f358583d), new w(xVar, c37028k));
        } catch (RemoteException e12) {
            com.google.android.play.integrity.internal.n nVar = xVar.f358590a;
            Object[] objArr = {this.f358585f};
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                com.google.android.play.integrity.internal.n.b(nVar.f358917a, "requestIntegrityToken(%s)", objArr);
            }
            c37028k.c(new IntegrityServiceException(-100, e12));
        }
    }
}
