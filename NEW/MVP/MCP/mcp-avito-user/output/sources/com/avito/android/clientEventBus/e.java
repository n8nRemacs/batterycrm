package com.avito.android.clientEventBus;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.Metadata;

/* compiled from: ClientEventBusImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a;", "EventT", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f118545b;

    public e(b bVar) {
        this.f118545b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        b bVar = this.f118545b;
        bVar.f118540h.c(new NonFatalErrorEvent("Observe events was failed", th2, null, null, 12, null));
        bVar.f118538f.a("ClientEventBus", "Observe events failed", th2);
    }
}
