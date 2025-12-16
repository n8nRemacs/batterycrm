package com.huawei.agconnect;

import java.util.Objects;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f363129b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f363130c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f363131d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f363132e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f363133f = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f363134a;

    public a(int i12) {
        this.f363134a = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f363134a == ((a) obj).f363134a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f363134a));
    }
}
