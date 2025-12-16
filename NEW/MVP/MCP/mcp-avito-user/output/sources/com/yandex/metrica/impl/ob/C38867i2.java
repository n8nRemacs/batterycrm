package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38867i2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f380761a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Context f380762b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final CounterConfiguration.b f380763c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38916k2 f380764d;

    public C38867i2(@j.N String str, @j.N Context context, @j.N CounterConfiguration.b bVar, @j.N C38916k2 c38916k2) {
        this.f380761a = str;
        this.f380762b = context;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            this.f380763c = CounterConfiguration.b.SELF_DIAGNOSTIC_MAIN;
        } else if (iOrdinal != 1) {
            this.f380763c = null;
        } else {
            this.f380763c = CounterConfiguration.b.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f380764d = c38916k2;
    }

    public void a(@j.N C38715c0 c38715c0) {
        if (this.f380763c != null) {
            try {
                String str = this.f380761a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    synchronized (counterConfiguration) {
                        counterConfiguration.f377493b.put("CFG_API_KEY", str);
                    }
                    counterConfiguration.e(this.f380763c);
                    this.f380764d.a(c38715c0.b(new Q1(new A3(this.f380762b, (ResultReceiver) null), counterConfiguration, null).c()));
                }
                counterConfiguration.e(this.f380763c);
                this.f380764d.a(c38715c0.b(new Q1(new A3(this.f380762b, (ResultReceiver) null), counterConfiguration, null).c()));
            } catch (Throwable unused) {
            }
        }
    }
}
