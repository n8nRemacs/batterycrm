package com.huawei.hms.availableupdate;

/* compiled from: ConfigChangeHolder.java */
/* loaded from: classes7.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static t f363422b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f363423a = false;

    public static t b() {
        if (f363422b == null) {
            synchronized (t.class) {
                try {
                    if (f363422b == null) {
                        f363422b = new t();
                    }
                } finally {
                }
            }
        }
        return f363422b;
    }

    public boolean a() {
        return this.f363423a;
    }

    public void a(boolean z12) {
        this.f363423a = z12;
    }
}
