package com.google.firebase.concurrent;

import com.google.firebase.concurrent.i;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements i.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f360813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f360814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f360815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f360816e;

    public /* synthetic */ c(h hVar, Object obj, long j12, TimeUnit timeUnit, int i12) {
        this.f360812a = i12;
        this.f360813b = hVar;
        this.f360816e = obj;
        this.f360814c = j12;
        this.f360815d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.i.c
    public final ScheduledFuture a(final i.a aVar) {
        switch (this.f360812a) {
            case 0:
                h hVar = this.f360813b;
                return hVar.f360834c.schedule(new f(hVar, (Runnable) this.f360816e, aVar, 1), this.f360814c, this.f360815d);
            default:
                final h hVar2 = this.f360813b;
                final Callable callable = (Callable) this.f360816e;
                return hVar2.f360834c.schedule(new Callable() { // from class: com.google.firebase.concurrent.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        h hVar3 = hVar2;
                        return hVar3.f360833b.submit(new a(1, callable, aVar));
                    }
                }, this.f360814c, this.f360815d);
        }
    }
}
