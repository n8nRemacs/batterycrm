package com.facebook.cache.common;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: SimpleCacheKey.java */
@Nullsafe
/* loaded from: classes5.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f339737a;

    public j(String str) {
        str.getClass();
        this.f339737a = str;
    }

    @Override // com.facebook.cache.common.c
    public final String a() {
        return this.f339737a;
    }

    @Override // com.facebook.cache.common.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(@I41.h Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f339737a.equals(((j) obj).f339737a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f339737a.hashCode();
    }

    public final String toString() {
        return this.f339737a;
    }
}
