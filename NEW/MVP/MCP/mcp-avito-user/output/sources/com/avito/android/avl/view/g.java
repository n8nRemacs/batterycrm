package com.avito.android.avl.view;

import GX0.a;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.exoplayer2.offline.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g implements k.a, NestedScrollView.e, a.InterfaceC0354a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f98386d;

    public /* synthetic */ g(int i12, KeyEvent.Callback callback, Object obj) {
        this.f98384b = i12;
        this.f98385c = callback;
        this.f98386d = obj;
    }

    @Override // com.google.android.exoplayer2.offline.k.a
    public void a(long j12, long j13, float f12) {
        if (this.f98384b <= ((AvlPlayerActivity) this.f98385c).f98297F + 1 || j13 >= 1572864.0d) {
            com.google.android.exoplayer2.source.hls.offline.a aVar = (com.google.android.exoplayer2.source.hls.offline.a) this.f98386d;
            synchronized (aVar.f345836h) {
                try {
                    aVar.f345837i = true;
                    for (int i12 = 0; i12 < aVar.f345836h.size(); i12++) {
                        aVar.f345836h.get(i12).cancel(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // GX0.a.InterfaceC0354a
    public Object execute() {
        ((com.google.android.datatransport.runtime.scheduling.jobscheduling.i) this.f98385c).f343207d.b((com.google.android.datatransport.runtime.r) this.f98386d, this.f98384b + 1);
        return null;
    }

    @Override // androidx.core.widget.NestedScrollView.e
    public void g(NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15) {
        boolean z12 = i13 < this.f98384b;
        ((View) this.f98385c).setVisibility(z12 ? 0 : 4);
        ((View) this.f98386d).setVisibility(z12 ? 4 : 0);
    }

    public /* synthetic */ g(com.google.android.datatransport.runtime.scheduling.jobscheduling.i iVar, com.google.android.datatransport.runtime.r rVar, int i12) {
        this.f98385c = iVar;
        this.f98386d = rVar;
        this.f98384b = i12;
    }
}
