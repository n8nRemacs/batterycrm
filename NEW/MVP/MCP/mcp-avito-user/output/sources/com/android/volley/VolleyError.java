package com.android.volley;

/* loaded from: classes10.dex */
public class VolleyError extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final r f67046b;

    public VolleyError() {
        this.f67046b = null;
    }

    public VolleyError(r rVar) {
        this.f67046b = rVar;
    }

    public VolleyError(int i12) {
        super("Neither response entry was set");
        this.f67046b = null;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.f67046b = null;
    }
}
