package com.avito.android.quic;

import android.content.SharedPreferences;
import j.InterfaceC42148d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: QuicHostsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/quic/a;", "", "a", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f246164a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f246165b;

    /* compiled from: QuicHostsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/quic/a$a;", "", "<init>", "()V", "", "PREFS_HIDDEN_HOSTS_FILE_NAME", "Ljava/lang/String;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.quic.a$a, reason: collision with other inner class name */
    public static final class C7381a {
        public /* synthetic */ C7381a(C42822w c42822w) {
            this();
        }

        public C7381a() {
        }
    }

    static {
        new C7381a(null);
    }

    public a() {
        throw null;
    }

    public a(Y41.l lVar, x xVar, int i12, C42822w c42822w) {
        this.f246164a = (i12 & 2) != 0 ? new x() : xVar;
        this.f246165b = (SharedPreferences) lVar.invoke("QuicHostsStorageHiddenHostsPrefs");
    }

    @Y61.k
    @InterfaceC42148d
    public final synchronized LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        try {
            this.f246164a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, ?> all = this.f246165b.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(all.size()));
            Iterator<T> it = all.entrySet().iterator();
            while (true) {
                long jLongValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Object key = ((Map.Entry) next).getKey();
                Object value = ((Map.Entry) next).getValue();
                Long l12 = value instanceof Long ? (Long) value : null;
                if (l12 != null) {
                    jLongValue = l12.longValue();
                }
                linkedHashMap.put(key, Long.valueOf(jLongValue));
            }
            linkedHashSet = new LinkedHashSet();
            for (String str : C42745f0.M0(linkedHashMap.keySet())) {
                Long l13 = (Long) linkedHashMap.get(str);
                if ((l13 != null ? l13.longValue() : 0L) < jCurrentTimeMillis) {
                    linkedHashSet.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedHashSet;
    }
}
