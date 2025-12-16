package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.um, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39180um {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @j.P
    private static volatile C39180um f382025c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382026a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, C39132sm> f382027b = new HashMap();

    @j.k0
    public C39180um(@j.N Context context) {
        this.f382026a = context;
    }

    @j.N
    public static C39180um a(@j.N Context context) {
        if (f382025c == null) {
            synchronized (C39180um.class) {
                try {
                    if (f382025c == null) {
                        f382025c = new C39180um(context);
                    }
                } finally {
                }
            }
        }
        return f382025c;
    }

    @j.N
    public C39132sm a(@j.N String str) {
        if (!this.f382027b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f382027b.containsKey(str)) {
                        this.f382027b.put(str, new C39132sm(new ReentrantLock(), new C39156tm(this.f382026a, str)));
                    }
                } finally {
                }
            }
        }
        return this.f382027b.get(str);
    }
}
