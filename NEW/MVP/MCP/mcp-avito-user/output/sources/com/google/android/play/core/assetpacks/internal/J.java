package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class J extends G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f358350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f358351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f358352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Q q12, C37028k c37028k, C37028k c37028k2, G g12) {
        super(c37028k);
        this.f358352e = q12;
        this.f358350c = c37028k2;
        this.f358351d = g12;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        synchronized (this.f358352e.f358364f) {
            try {
                final Q q12 = this.f358352e;
                final C37028k c37028k = this.f358350c;
                q12.f358363e.add(c37028k);
                c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.play.core.assetpacks.internal.H
                    @Override // com.google.android.gms.tasks.InterfaceC37022e
                    public final void onComplete(Task task) {
                        Q q13 = q12;
                        C37028k c37028k2 = c37028k;
                        synchronized (q13.f358364f) {
                            q13.f358363e.remove(c37028k2);
                        }
                    }
                });
                if (this.f358352e.f358369k.getAndIncrement() > 0) {
                    this.f358352e.f358360b.d("Already connected to the service.", new Object[0]);
                }
                Q.b(this.f358352e, this.f358351d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
