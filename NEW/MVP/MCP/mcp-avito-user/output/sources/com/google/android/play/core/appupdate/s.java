package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class s extends com.google.android.play.core.appupdate.internal.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f358071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f358072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f358073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C37028k c37028k, C37028k c37028k2, w wVar, String str) {
        super(c37028k);
        this.f358073e = wVar;
        this.f358071c = c37028k2;
        this.f358072d = str;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        C37028k c37028k = this.f358071c;
        w wVar = this.f358073e;
        try {
            wVar.f358080a.f358030m.Q2(wVar.f358081b, w.b(), new u(wVar, new com.google.android.play.core.appupdate.internal.s("OnCompleteUpdateCallback"), c37028k));
        } catch (RemoteException e12) {
            w.f358078e.b(e12, "completeUpdate(%s)", this.f358072d);
            c37028k.c(new RuntimeException(e12));
        }
    }
}
