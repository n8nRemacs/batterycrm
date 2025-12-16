package com.avito.android.clientEventBus;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: ClientEventBusImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f118546b;

    public f(b bVar) {
        this.f118546b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        b bVar = this.f118546b;
        bVar.f118540h.c(new NonFatalErrorEvent("Subscribe to active topic was failed", th2, null, null, 12, null));
        bVar.f118538f.a("ClientEventBus", "Periodic subscribe failed", th2);
        bVar.f118542j.accept(th2);
    }
}
