package com.avito.android.remote.analytics.success_rate;

import Y61.k;
import j.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: UrlsCountMaps.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/f;", "", "<init>", "()V", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f253260f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f253261a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f253262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f253263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f253264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC43030m<Map<String, Integer>> f253265e;

    /* compiled from: UrlsCountMaps.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/f$a;", "", "<init>", "()V", "", "DWH_STRING_LENGTH_LIMIT", "I", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final void a(a aVar, Map map, String str) {
            aVar.getClass();
            Object obj = map.get(str);
            if (obj == null) {
                obj = 0;
            }
            map.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
        }

        @k0
        public static int b(@k LinkedHashMap linkedHashMap, @k LinkedHashMap linkedHashMap2, @k String str) {
            int length = 1;
            if (!linkedHashMap.containsKey(str) && !linkedHashMap2.containsKey(str)) {
                length = str.length() + 10;
            }
            return c(linkedHashMap2) + c(linkedHashMap) + length + 2;
        }

        public static final int c(LinkedHashMap linkedHashMap) {
            int length = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                length = String.valueOf(((Number) entry.getValue()).intValue()).length() + ((String) entry.getKey()).length() + length + 10;
            }
            return length;
        }

        public a() {
        }
    }

    /* compiled from: UrlsCountMaps.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ResponseType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResponseType responseType = ResponseType.f253230b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResponseType responseType2 = ResponseType.f253230b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ResponseType responseType3 = ResponseType.f253230b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f253261a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f253262b = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.f253263c = linkedHashMap3;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        this.f253264d = linkedHashMap4;
        this.f253265e = C42756l.f(new Map[]{linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4});
    }
}
