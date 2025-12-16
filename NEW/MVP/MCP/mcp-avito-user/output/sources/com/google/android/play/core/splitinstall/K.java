package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.splitinstall.internal.C37214g;
import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
class K extends com.google.android.play.core.splitinstall.internal.O {

    /* renamed from: a, reason: collision with root package name */
    public final C37028k f358683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f358684b;

    public K(L l12, C37028k c37028k) {
        this.f358684b = l12;
        this.f358683a = c37028k;
    }

    @Override // com.google.android.play.core.splitinstall.internal.P
    public final void T(int i12) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onCompleteInstall(%d)", Integer.valueOf(i12));
    }

    public void U2(ArrayList arrayList) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onGetSessionStates", new Object[0]);
    }

    public void e1(int i12, Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onStartInstall(%d)", Integer.valueOf(i12));
    }

    @Override // com.google.android.play.core.splitinstall.internal.P
    public final void i3(Bundle bundle) {
        C37214g c37214g = this.f358684b.f358688b;
        C37028k c37028k = this.f358683a;
        c37214g.d(c37028k);
        int i12 = bundle.getInt("error_code");
        L.f358685c.b("onError(%d)", Integer.valueOf(i12));
        c37028k.c(new SplitInstallException(i12));
    }

    public void k(Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onDeferredInstall", new Object[0]);
    }

    public void l1(int i12, Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onGetSession(%d)", Integer.valueOf(i12));
    }

    public void p0(int i12, Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onCancelInstall(%d)", Integer.valueOf(i12));
    }

    public void p2(Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onDeferredUninstall", new Object[0]);
    }

    public void v2(Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    public void z2(Bundle bundle) {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.P
    public final void zzk() {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.P
    public final void zzm() {
        this.f358684b.f358688b.d(this.f358683a);
        L.f358685c.d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
