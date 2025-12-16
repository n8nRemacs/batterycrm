package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39344m {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f387786a;

    public AbstractC39344m(@j.N String str) {
        this.f387786a = str;
    }

    @j.N
    public final String a() {
        return this.f387786a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f387786a.equals(((AbstractC39344m) obj).f387786a);
    }

    public int hashCode() {
        return this.f387786a.hashCode();
    }
}
