package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public abstract class V1<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final Context f379753a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f379754b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f379755c;

    public V1(@j.N Context context, @j.N String str, @j.N String str2) {
        this.f379753a = context;
        this.f379754b = str;
        this.f379755c = str2;
    }

    @j.P
    public T a() {
        int identifier = this.f379753a.getResources().getIdentifier(this.f379754b, this.f379755c, this.f379753a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public abstract T a(int i12);
}
