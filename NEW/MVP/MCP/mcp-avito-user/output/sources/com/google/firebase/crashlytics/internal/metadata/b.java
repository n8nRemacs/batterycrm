package com.google.firebase.crashlytics.internal.metadata;

import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes4.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f361032a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f361033b = 64;

    /* renamed from: c, reason: collision with root package name */
    public final int f361034c;

    public b(int i12) {
        this.f361034c = i12;
    }

    public static String a(int i12, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i12 ? strTrim.substring(0, i12) : strTrim;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strA = a(this.f361034c, str);
        if (this.f361032a.size() >= this.f361033b && !this.f361032a.containsKey(strA)) {
            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            return false;
        }
        String strA2 = a(this.f361034c, str2);
        String str3 = (String) this.f361032a.get(strA);
        if (str3 == null ? strA2 == null : str3.equals(strA2)) {
            return false;
        }
        HashMap map = this.f361032a;
        if (str2 == null) {
            strA2 = "";
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        try {
            int i12 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f361034c, key);
                if (this.f361032a.size() < this.f361033b || this.f361032a.containsKey(strA)) {
                    String value = entry.getValue();
                    this.f361032a.put(strA, value == null ? "" : a(this.f361034c, value));
                } else {
                    i12++;
                }
            }
            if (i12 > 0) {
                com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
