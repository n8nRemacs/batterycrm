package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* loaded from: classes8.dex */
public final class h90 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final List<AbstractC39344m> f385932a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final FalseClick f385933b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f385934c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final String f385935d;

    /* renamed from: e, reason: collision with root package name */
    private final long f385936e;

    public h90(@j.P List<AbstractC39344m> list, @j.P FalseClick falseClick, @j.P String str, @j.P String str2, long j12) {
        this.f385932a = list;
        this.f385933b = falseClick;
        this.f385934c = str;
        this.f385935d = str2;
        this.f385936e = j12;
    }

    @j.P
    public final List<AbstractC39344m> a() {
        return this.f385932a;
    }

    public final long b() {
        return this.f385936e;
    }

    @j.P
    public final FalseClick c() {
        return this.f385933b;
    }

    @j.P
    public final String d() {
        return this.f385934c;
    }

    @j.P
    public final String e() {
        return this.f385935d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h90.class != obj.getClass()) {
            return false;
        }
        h90 h90Var = (h90) obj;
        if (this.f385936e != h90Var.f385936e) {
            return false;
        }
        List<AbstractC39344m> list = this.f385932a;
        if (list == null ? h90Var.f385932a != null : !list.equals(h90Var.f385932a)) {
            return false;
        }
        FalseClick falseClick = this.f385933b;
        if (falseClick == null ? h90Var.f385933b != null : !falseClick.equals(h90Var.f385933b)) {
            return false;
        }
        String str = this.f385934c;
        if (str == null ? h90Var.f385934c != null : !str.equals(h90Var.f385934c)) {
            return false;
        }
        String str2 = this.f385935d;
        String str3 = h90Var.f385935d;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        List<AbstractC39344m> list = this.f385932a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        FalseClick falseClick = this.f385933b;
        int iHashCode2 = (iHashCode + (falseClick != null ? falseClick.hashCode() : 0)) * 31;
        String str = this.f385934c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f385935d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j12 = this.f385936e;
        return iHashCode4 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
