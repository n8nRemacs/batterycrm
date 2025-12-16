package com.yandex.div.internal.viewpool;

import Y61.k;
import androidx.collection.C20199a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfilingSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/internal/viewpool/c;", "", "<init>", "()V", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f370203d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f370204a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f370205b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C20199a<String, a> f370206c = new C20199a<>();

    /* compiled from: ProfilingSession.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/viewpool/c$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f370207a;

        /* renamed from: b, reason: collision with root package name */
        public int f370208b;
    }

    /* compiled from: ProfilingSession.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/viewpool/c$b;", "", "<init>", "()V", "", "LONG_OPERATION_THRESHOLD_NS", "J", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @k
    public final HashMap a() {
        HashMap map = new HashMap();
        a aVar = this.f370204a;
        map.put("view obtaining - total count", Integer.valueOf(aVar.f370208b));
        long j12 = aVar.f370207a;
        f370203d.getClass();
        map.put("view obtaining - total time (µs)", Long.valueOf(d.a(j12 / 1000)));
        Iterator<Map.Entry<String, a>> it = this.f370206c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, a> next = it.next();
            String key = next.getKey();
            a value = next.getValue();
            if (value.f370208b > 0) {
                map.put("blocking view obtaining for " + ((Object) key) + " - count", Integer.valueOf(value.f370208b));
                String str = "blocking view obtaining for " + ((Object) key) + " - avg time (µs)";
                int i12 = value.f370208b;
                map.put(str, Long.valueOf(d.a((i12 != 0 ? value.f370207a / i12 : 0L) / 1000)));
            }
        }
        a aVar2 = this.f370205b;
        int i13 = aVar2.f370208b;
        if (i13 > 0) {
            map.put("long view requests - count", Integer.valueOf(i13));
            int i14 = aVar2.f370208b;
            map.put("long view requests - avg time (µs)", Long.valueOf(d.a((i14 != 0 ? aVar2.f370207a / i14 : 0L) / 1000)));
        }
        return map;
    }
}
