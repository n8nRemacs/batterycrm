package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class Kd {

    /* renamed from: e, reason: collision with root package name */
    private static final Rd f378702e = new Rd("UNDEFINED_", null);

    /* renamed from: a, reason: collision with root package name */
    protected final String f378703a;

    /* renamed from: b, reason: collision with root package name */
    protected final SharedPreferences f378704b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f378705c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f378706d = false;

    public Kd(Context context, String str) {
        this.f378703a = str;
        this.f378704b = a(context);
        new Rd(f378702e.b(), str);
    }

    private SharedPreferences a(Context context) {
        return C38689b.a(context, d());
    }

    public void b() {
        synchronized (this) {
            a();
            this.f378705c.clear();
            this.f378706d = false;
        }
    }

    public String c() {
        return this.f378703a;
    }

    public abstract String d();

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Kd> T e() {
        synchronized (this) {
            this.f378706d = true;
            this.f378705c.clear();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Kd> T a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                try {
                    this.f378705c.put(str, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Kd> T a(String str) {
        synchronized (this) {
            this.f378705c.put(str, this);
        }
        return this;
    }

    private void a() {
        SharedPreferences.Editor editorEdit = this.f378704b.edit();
        if (this.f378706d) {
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        for (Map.Entry<String, Object> entry : this.f378705c.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == this) {
                editorEdit.remove(key);
            } else if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        editorEdit.apply();
    }
}
