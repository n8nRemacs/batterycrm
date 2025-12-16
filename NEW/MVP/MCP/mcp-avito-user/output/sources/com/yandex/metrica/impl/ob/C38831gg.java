package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import com.yandex.metrica.impl.ob.C39005ng;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.gg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38831gg {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f380650a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Cursor f380651b;

    public C38831gg(@j.N Context context) {
        this.f380650a = context;
    }

    @j.l0
    public void a(@j.N InterfaceC39198vg interfaceC39198vg) {
        try {
            try {
                FutureTask futureTask = new FutureTask(new CallableC38806fg(this));
                F0.g().q().a(futureTask).start();
                C38756dg c38756dg = (C38756dg) futureTask.get(5L, TimeUnit.SECONDS);
                A2.a(this.f380651b);
                ((C39005ng.a) interfaceC39198vg).a(c38756dg);
            } finally {
                A2.a(this.f380651b);
            }
        } catch (Throwable unused) {
            C38980mg c38980mg = C38980mg.this;
            C38980mg.a(c38980mg, null, C38980mg.c(c38980mg));
        }
    }
}
