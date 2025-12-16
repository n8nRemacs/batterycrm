package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class m0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37203e f358825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37207i f358826c;

    public m0(C37207i c37207i, C37203e c37203e) {
        this.f358826c = c37207i;
        this.f358825b = c37203e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0 l0Var = this.f358826c.f358729b;
        C37203e c37203e = this.f358825b;
        ArrayList arrayList = c37203e.f358710a;
        ArrayList arrayListF = C37207i.f(c37203e.f358711b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
        }
        if (!arrayListF.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(arrayListF));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        l0Var.d(AbstractC37204f.n(bundle));
    }
}
