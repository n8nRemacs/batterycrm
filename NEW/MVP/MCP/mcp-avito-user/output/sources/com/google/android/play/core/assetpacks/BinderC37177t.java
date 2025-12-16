package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.C37028k;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class BinderC37177t extends com.google.android.play.core.assetpacks.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final C37028k f358499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f358500b;

    public BinderC37177t(E e12, C37028k c37028k) {
        this.f358500b = e12;
        this.f358499a = c37028k;
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void A2(Bundle bundle) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public void G0(Bundle bundle, Bundle bundle2) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public void M2(Bundle bundle) {
        com.google.android.play.core.assetpacks.internal.Q q12 = this.f358500b.f358111d;
        C37028k c37028k = this.f358499a;
        q12.d(c37028k);
        int i12 = bundle.getInt("error_code");
        E.f358106g.b("onError(%d)", Integer.valueOf(i12));
        c37028k.c(new AssetPackException(i12));
    }

    public void R0(int i12, Bundle bundle) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onStartDownload(%d)", Integer.valueOf(i12));
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void b(int i12) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onCancelDownload(%d)", Integer.valueOf(i12));
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void c() {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public void d2(ArrayList arrayList) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public void i0(Bundle bundle, Bundle bundle2) {
        this.f358500b.f358112e.d(this.f358499a);
        E.f358106g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public void i1(Bundle bundle, Bundle bundle2) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void l() {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void o2(Bundle bundle) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void p(int i12) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onGetSession(%d)", Integer.valueOf(i12));
    }

    @Override // com.google.android.play.core.assetpacks.internal.y
    public final void t2(Bundle bundle) {
        this.f358500b.f358111d.d(this.f358499a);
        E.f358106g.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }
}
