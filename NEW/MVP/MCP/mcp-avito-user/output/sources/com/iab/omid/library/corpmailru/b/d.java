package com.iab.omid.library.corpmailru.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f363979a = new d();

    /* renamed from: b, reason: collision with root package name */
    private Context f363980b;

    private d() {
    }

    public static d a() {
        return f363979a;
    }

    public Context b() {
        return this.f363980b;
    }

    public void a(Context context) {
        this.f363980b = context != null ? context.getApplicationContext() : null;
    }
}
