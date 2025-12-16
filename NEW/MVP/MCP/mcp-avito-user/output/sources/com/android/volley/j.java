package com.android.volley;

import j.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes10.dex */
public interface j {

    /* compiled from: Cache.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f67066a;

        /* renamed from: b, reason: collision with root package name */
        public String f67067b;

        /* renamed from: c, reason: collision with root package name */
        public long f67068c;

        /* renamed from: d, reason: collision with root package name */
        public long f67069d;

        /* renamed from: e, reason: collision with root package name */
        public long f67070e;

        /* renamed from: f, reason: collision with root package name */
        public long f67071f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f67072g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<o> f67073h;
    }

    void a();

    void b(String str, a aVar);

    @P
    a get(String str);

    void invalidate(String str);
}
