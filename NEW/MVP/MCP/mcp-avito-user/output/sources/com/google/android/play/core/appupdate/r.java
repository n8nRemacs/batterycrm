package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class r extends com.google.android.play.core.appupdate.internal.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f358068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f358070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C37028k c37028k, C37028k c37028k2, w wVar, String str) {
        super(c37028k);
        this.f358070e = wVar;
        this.f358068c = str;
        this.f358069d = c37028k2;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        C37028k c37028k = this.f358069d;
        w wVar = this.f358070e;
        String str = this.f358068c;
        try {
            wVar.f358080a.f358030m.T2(wVar.f358081b, w.a(wVar, str), new v(wVar, c37028k, str));
        } catch (RemoteException e12) {
            w.f358078e.b(e12, "requestUpdateInfo(%s)", str);
            c37028k.c(new RuntimeException(e12));
        }
    }
}
