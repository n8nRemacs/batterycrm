package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class w extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f358050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f358051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f358052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(D d12, C37028k c37028k, C37028k c37028k2, t tVar) {
        super(c37028k);
        this.f358052e = d12;
        this.f358050c = c37028k2;
        this.f358051d = tVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        synchronized (this.f358052e.f358023f) {
            try {
                final D d12 = this.f358052e;
                final C37028k c37028k = this.f358050c;
                d12.f358022e.add(c37028k);
                c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.play.core.appupdate.internal.u
                    @Override // com.google.android.gms.tasks.InterfaceC37022e
                    public final void onComplete(Task task) {
                        D d13 = d12;
                        C37028k c37028k2 = c37028k;
                        synchronized (d13.f358023f) {
                            d13.f358022e.remove(c37028k2);
                        }
                    }
                });
                if (this.f358052e.f358028k.getAndIncrement() > 0) {
                    this.f358052e.f358019b.c("Already connected to the service.", new Object[0]);
                }
                D.b(this.f358052e, this.f358051d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
