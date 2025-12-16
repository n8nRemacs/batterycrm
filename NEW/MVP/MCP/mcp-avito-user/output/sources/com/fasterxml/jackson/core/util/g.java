package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: InternCache.java */
/* loaded from: classes3.dex */
public final class g extends ConcurrentHashMap<String, String> {

    /* renamed from: c, reason: collision with root package name */
    public static final g f341303c = new g();
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f341304b;

    public g() {
        super(180, 0.8f, 4);
        this.f341304b = new Object();
    }

    public final String a(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f341304b) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
