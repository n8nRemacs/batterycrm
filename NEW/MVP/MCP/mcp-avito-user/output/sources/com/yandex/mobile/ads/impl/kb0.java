package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class kb0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w90 f387096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Object f387097b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private String f387098c;

    public kb0(@Y61.k w90 w90Var) {
        this.f387096a = w90Var;
    }

    @Y61.l
    public final String a() {
        String str;
        synchronized (this.f387097b) {
            try {
                if (this.f387098c == null) {
                    this.f387098c = this.f387096a.b("YmadMauid");
                }
                str = this.f387098c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void a(@Y61.k String str) {
        synchronized (this.f387097b) {
            this.f387098c = str;
            this.f387096a.putString("YmadMauid", str);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
