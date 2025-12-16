package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class qj {

    /* renamed from: a, reason: collision with root package name */
    private final String f389204a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389205b;

    public qj(int i12, String str) {
        this.f389205b = i12;
        this.f389204a = str;
    }

    public final String a() {
        return this.f389204a;
    }

    public final int b() {
        return this.f389205b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qj.class != obj.getClass()) {
            return false;
        }
        qj qjVar = (qj) obj;
        String str = this.f389204a;
        if (str == null ? qjVar.f389204a == null : str.equals(qjVar.f389204a)) {
            return this.f389205b == qjVar.f389205b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f389204a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        int i12 = this.f389205b;
        return iHashCode + (i12 != 0 ? n6.a(i12) : 0);
    }
}
