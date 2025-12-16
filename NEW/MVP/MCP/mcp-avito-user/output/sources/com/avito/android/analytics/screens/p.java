package com.avito.android.analytics.screens;

import com.avito.android.analytics.screens.tracker.M;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenFlowTrackerProviderImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/f;", "invoke", "()Lcom/avito/android/analytics/screens/tracker/fps/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.a<com.avito.android.analytics.screens.tracker.fps.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f90668l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(0);
        this.f90668l = qVar;
    }

    @Override // Y41.a
    public final com.avito.android.analytics.screens.tracker.fps.f invoke() {
        q qVar = this.f90668l;
        M m12 = qVar.f90685q;
        com.avito.android.analytics.screens.tracker.trace.a aVar = qVar.f90686r;
        Screen screen = qVar.f90672d;
        com.avito.android.analytics.screens.tracker.fps.a aVar2 = new com.avito.android.analytics.screens.tracker.fps.a(screen, qVar.f90682n, qVar.f90669a, qVar.f90684p, m12, aVar);
        return new com.avito.android.analytics.screens.tracker.fps.f(qVar.f90683o, screen, qVar.f90677i, qVar.f90689u, qVar.f90690v, aVar2);
    }
}
