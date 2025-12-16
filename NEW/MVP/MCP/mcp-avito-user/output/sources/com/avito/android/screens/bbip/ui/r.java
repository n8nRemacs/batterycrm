package com.avito.android.screens.bbip.ui;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip.ui.l;
import np0.InterfaceC44461a;

/* compiled from: BbipViewModelImpl_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class r implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f260442a;

    public r(q qVar) {
        this.f260442a = qVar;
    }

    @Override // com.avito.android.screens.bbip.ui.l.a
    public final l a(String str, String str2) {
        q qVar = this.f260442a;
        return new l(str, str2, qVar.f260436a.get(), qVar.f260437b.get(), (InterfaceC44461a) qVar.f260438c.get(), (ScreenPerformanceTracker) qVar.f260439d.get(), qVar.f260440e.get(), (ZK0.a) qVar.f260441f.get());
    }
}
