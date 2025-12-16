package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class gv extends AbstractC39344m {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final List<a> f385841b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f385842a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final String f385843b;

        public a(@j.N String str, @j.N String str2) {
            this.f385842a = str;
            this.f385843b = str2;
        }

        @j.N
        public final String a() {
            return this.f385842a;
        }

        @j.N
        public final String b() {
            return this.f385843b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f385842a.equals(aVar.f385842a)) {
                return this.f385843b.equals(aVar.f385843b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f385843b.hashCode() + (this.f385842a.hashCode() * 31);
        }
    }

    public gv(@j.N String str, @j.N ArrayList arrayList) {
        super(str);
        this.f385841b = arrayList;
    }

    @j.N
    public final List<a> b() {
        return this.f385841b;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39344m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gv.class == obj.getClass() && super.equals(obj)) {
            return this.f385841b.equals(((gv) obj).f385841b);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39344m
    public final int hashCode() {
        return this.f385841b.hashCode() + (super.hashCode() * 31);
    }
}
