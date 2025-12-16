package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes8.dex */
public final class r2 extends ok1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f389360c = 0;
    private static final long serialVersionUID = 9076708591501334094L;

    /* renamed from: b, reason: collision with root package name */
    private final int f389361b;

    public static final class a {
        @X41.n
        @Y61.k
        public static r2 a(@Y61.l zo0 zo0Var) {
            int i12 = zo0Var != null ? zo0Var.f392315a : -1;
            if (204 == i12) {
                return new r2(zo0Var, 6);
            }
            Map<String, String> map = zo0Var != null ? zo0Var.f392317c : null;
            Integer numValueOf = zo0Var != null ? Integer.valueOf(zo0Var.f392315a) : null;
            boolean z12 = false;
            if ((numValueOf == null || 400 != numValueOf.intValue() || map == null) ? false : fz.a(map, 48)) {
                return new r2(zo0Var, 12);
            }
            if (403 == i12) {
                return new r2(zo0Var, 10);
            }
            if (404 == i12) {
                return new r2(zo0Var, 4);
            }
            if (500 <= i12 && i12 < 600) {
                z12 = true;
            }
            return z12 ? new r2(zo0Var, 9) : -1 == i12 ? new r2(zo0Var, 7) : new r2(zo0Var, 8);
        }

        @X41.n
        @Y61.k
        public static r2 b(@Y61.l zo0 zo0Var) {
            int i12 = zo0Var != null ? zo0Var.f392315a : -1;
            return new r2(zo0Var, (500 > i12 || i12 >= 600) ? -1 == i12 ? 7 : 8 : 9);
        }
    }

    public r2(@Y61.l zo0 zo0Var, int i12) {
        super(zo0Var);
        this.f389361b = i12;
    }

    public final int a() {
        return this.f389361b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r2.class.equals(obj.getClass()) && this.f389361b == ((r2) obj).f389361b;
    }

    public final int hashCode() {
        return this.f389361b;
    }
}
