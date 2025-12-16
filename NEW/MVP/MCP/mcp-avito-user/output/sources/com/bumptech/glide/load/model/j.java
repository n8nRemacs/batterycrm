package com.bumptech.glide.load.model;

import android.text.TextUtils;
import j.N;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes5.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<i>> f339227b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f339228c;

    /* compiled from: LazyHeaders.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final Map<String, List<i>> f339229b;

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<i>> f339230a = f339229b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = property.charAt(i12);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f339229b = Collections.unmodifiableMap(map);
        }
    }

    /* compiled from: LazyHeaders.java */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final String f339231a;

        public b(@N String str) {
            this.f339231a = str;
        }

        @Override // com.bumptech.glide.load.model.i
        public final String a() {
            return this.f339231a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f339231a.equals(((b) obj).f339231a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f339231a.hashCode();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("StringHeaderFactory{value='"), this.f339231a, "'}");
        }
    }

    public j(Map<String, List<i>> map) {
        this.f339227b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f339227b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strA = value.get(i12).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb2.append(strA);
                    if (i12 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map<String, String> b() {
        if (this.f339228c == null) {
            synchronized (this) {
                try {
                    if (this.f339228c == null) {
                        this.f339228c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f339228c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f339227b.equals(((j) obj).f339227b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f339227b.hashCode();
    }

    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("LazyHeaders{headers="), this.f339227b, '}');
    }
}
