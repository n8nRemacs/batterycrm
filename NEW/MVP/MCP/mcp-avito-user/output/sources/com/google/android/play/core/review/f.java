package com.google.android.play.core.review;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class f extends com.google.android.play.core.review.internal.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f358610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f358611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, C37028k c37028k, C37028k c37028k2) {
        super(c37028k);
        this.f358611d = iVar;
        this.f358610c = c37028k2;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        C37028k c37028k = this.f358610c;
        i iVar = this.f358611d;
        try {
            iVar.f358616a.f358646m.R1(iVar.f358617b, j.a(), new h(iVar, new com.google.android.play.core.review.internal.i("OnRequestInstallCallback"), c37028k));
        } catch (RemoteException e12) {
            com.google.android.play.core.review.internal.i iVar2 = i.f358615c;
            Object[] objArr = {iVar.f358617b};
            iVar2.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                com.google.android.play.core.review.internal.i.b(iVar2.f358621a, "error requesting in-app review for %s", objArr);
            }
            c37028k.c(new RuntimeException(e12));
        }
    }
}
