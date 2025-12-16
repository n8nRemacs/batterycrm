package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    public NetworkTask.Method f382430a = NetworkTask.Method.f382424b;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f382431b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public byte[] f382432c = null;

    /* renamed from: d, reason: collision with root package name */
    public Long f382433d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f382434e;

    public final void a(long j12) {
        this.f382433d = Long.valueOf(j12);
        this.f382434e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j12) * 1000) / 1000);
    }
}
