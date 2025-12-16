package com.avito.android.mvi.rx3.locks.legacy;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RxExecutor.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/concurrent/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f207107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mvi.rx3.locks.c f207108c;

    public b(a aVar, com.avito.android.mvi.rx3.locks.c cVar) {
        this.f207107b = aVar;
        this.f207108c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f207107b;
        boolean z12 = aVar.f207084d;
        com.avito.android.mvi.rx3.locks.c cVar = this.f207108c;
        if (z12) {
            aVar.f207085e.invoke(aVar.f207082b, "addOperation(" + cVar + ')');
        }
        aVar.f207087g.add(cVar);
        aVar.f207090j.execute(new e(aVar));
    }
}
