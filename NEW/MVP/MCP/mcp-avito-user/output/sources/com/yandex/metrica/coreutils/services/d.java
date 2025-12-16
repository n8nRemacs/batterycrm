package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.a;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: FirstExecutionConditionService.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ArrayList f377647a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @P
    public g f377648b;

    /* compiled from: FirstExecutionConditionService.java */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public long f377650b;

        /* renamed from: c, reason: collision with root package name */
        public long f377651c;

        /* renamed from: d, reason: collision with root package name */
        public long f377652d;

        /* renamed from: e, reason: collision with root package name */
        @N
        public final c f377653e = new c();

        /* renamed from: a, reason: collision with root package name */
        public boolean f377649a = false;

        public b(@P g gVar) {
            this.f377651c = gVar == null ? 0L : gVar.f377657a;
            this.f377650b = gVar != null ? gVar.f377658b : 0L;
            this.f377652d = Long.MAX_VALUE;
        }
    }

    /* compiled from: FirstExecutionConditionService.java */
    public static class c {
    }

    /* compiled from: FirstExecutionConditionService.java */
    /* renamed from: com.yandex.metrica.coreutils.services.d$d, reason: collision with other inner class name */
    public static class C10948d {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final b f377654a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final a.b f377655b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final ICommonExecutor f377656c;

        public C10948d(ICommonExecutor iCommonExecutor, a.b bVar, b bVar2, a aVar) {
            this.f377655b = bVar;
            this.f377654a = bVar2;
            this.f377656c = iCommonExecutor;
        }

        public final boolean a(int i12) {
            b bVar = this.f377654a;
            if (!bVar.f377649a) {
                long j12 = bVar.f377651c;
                long j13 = bVar.f377650b;
                long j14 = bVar.f377652d;
                bVar.f377653e.getClass();
                if (j13 - j12 < j14) {
                    return false;
                }
            }
            long millis = TimeUnit.SECONDS.toMillis(i12);
            a.b bVar2 = this.f377655b;
            boolean z12 = bVar2.f377641a;
            ICommonExecutor iCommonExecutor = this.f377656c;
            if (z12) {
                iCommonExecutor.execute(new com.yandex.metrica.coreutils.services.c(bVar2));
            } else {
                bVar2.f377643c.a(millis, iCommonExecutor, bVar2.f377642b);
            }
            bVar.f377649a = true;
            return true;
        }
    }
}
