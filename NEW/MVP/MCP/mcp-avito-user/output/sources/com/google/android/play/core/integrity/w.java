package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class w extends com.google.android.play.integrity.internal.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.integrity.internal.n f358587a = new com.google.android.play.integrity.internal.n("OnRequestIntegrityTokenCallback");

    /* renamed from: b, reason: collision with root package name */
    public final C37028k f358588b;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f358589p;

    public w(x xVar, C37028k c37028k) {
        this.f358589p = xVar;
        this.f358588b = c37028k;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final void b(Bundle bundle) {
        com.google.android.play.integrity.internal.z zVar = this.f358589p.f358592c;
        C37028k c37028k = this.f358588b;
        zVar.c(c37028k);
        this.f358587a.a("onRequestIntegrityToken", new Object[0]);
        int i12 = bundle.getInt("error");
        if (i12 != 0) {
            c37028k.c(new IntegrityServiceException(i12, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            c37028k.c(new IntegrityServiceException(-100, null));
        } else {
            new h();
            c37028k.d(new j(string, null));
        }
    }
}
