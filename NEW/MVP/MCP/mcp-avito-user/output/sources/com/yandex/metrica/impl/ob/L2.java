package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.j;
import com.yandex.metrica.p;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    static Rf f378740a = new Rf(P.g().c(), new Sf());

    public static void a(@j.N Context context, @j.N IIdentifierCallback iIdentifierCallback, @j.N List<String> list) {
        f378740a.a(context, iIdentifierCallback, list);
    }

    @j.P
    public static String b(@j.N Context context) {
        return f378740a.b(context);
    }

    @j.N
    public static String c(@j.N Context context) {
        return f378740a.c(context);
    }

    @j.P
    public static String d(@j.N Context context) {
        return f378740a.d(context);
    }

    @j.P
    public static Future<String> a() {
        return f378740a.a();
    }

    @j.P
    public static Future<Boolean> b() {
        return f378740a.b();
    }

    @j.N
    public static String a(Context context) {
        return f378740a.a(context);
    }

    @j.N
    public static String a(@j.N String str) {
        f378740a.getClass();
        return Y21.a.a(str);
    }

    @j.N
    public static String a(int i12) {
        f378740a.getClass();
        return Z0.a(i12);
    }

    @j.N
    public static YandexMetricaConfig a(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N String str) {
        f378740a.getClass();
        j.b bVarA = com.yandex.metrica.j.a(yandexMetricaConfig);
        bVarA.f382351b = Collections.singletonList(str);
        return new com.yandex.metrica.j(bVarA, null);
    }

    @j.N
    public static YandexMetricaConfig a(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N List<String> list) {
        f378740a.getClass();
        j.b bVarA = com.yandex.metrica.j.a(yandexMetricaConfig);
        bVarA.f382351b = list;
        return new com.yandex.metrica.j(bVarA, null);
    }

    public static void a(Context context, boolean z12) {
        f378740a.a(context, z12);
    }

    public static void a(@j.N p.Ucc ucc, boolean z12) {
        f378740a.a(ucc, z12);
    }

    public static void a(@j.N Context context, @j.P Map<String, Object> map) {
        f378740a.a(context, map);
    }
}
