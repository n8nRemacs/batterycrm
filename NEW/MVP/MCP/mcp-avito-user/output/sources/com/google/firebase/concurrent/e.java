package com.google.firebase.concurrent;

import com.google.firebase.concurrent.i;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e implements i.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f360821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f360822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f360823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f360825f;

    public /* synthetic */ e(h hVar, Runnable runnable, long j12, long j13, TimeUnit timeUnit, int i12) {
        this.f360820a = i12;
        this.f360821b = hVar;
        this.f360822c = runnable;
        this.f360823d = j12;
        this.f360824e = j13;
        this.f360825f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.i.c
    public final ScheduledFuture a(i.a aVar) {
        switch (this.f360820a) {
            case 0:
                h hVar = this.f360821b;
                return hVar.f360834c.scheduleAtFixedRate(new f(hVar, this.f360822c, aVar, 0), this.f360823d, this.f360824e, this.f360825f);
            default:
                h hVar2 = this.f360821b;
                return hVar2.f360834c.scheduleWithFixedDelay(new f(hVar2, this.f360822c, aVar, 2), this.f360823d, this.f360824e, this.f360825f);
        }
    }
}
