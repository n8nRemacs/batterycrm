package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final rb0 f389488a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final me1 f389489b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final List<b30> f389490c;

    public rd0(@j.P rb0 rb0Var, @j.P me1 me1Var, @j.P ArrayList arrayList) {
        this.f389488a = rb0Var;
        this.f389489b = me1Var;
        this.f389490c = arrayList;
    }

    @j.P
    public final List<b30> a() {
        return this.f389490c;
    }

    @j.P
    public final rb0 b() {
        return this.f389488a;
    }

    @j.P
    public final me1 c() {
        return this.f389489b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd0)) {
            return false;
        }
        rd0 rd0Var = (rd0) obj;
        rb0 rb0Var = this.f389488a;
        if (rb0Var == null ? rd0Var.f389488a != null : !rb0Var.equals(rd0Var.f389488a)) {
            return false;
        }
        me1 me1Var = this.f389489b;
        if (me1Var == null ? rd0Var.f389489b != null : !me1Var.equals(rd0Var.f389489b)) {
            return false;
        }
        List<b30> list = this.f389490c;
        List<b30> list2 = rd0Var.f389490c;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        rb0 rb0Var = this.f389488a;
        int iHashCode = (rb0Var != null ? rb0Var.hashCode() : 0) * 31;
        me1 me1Var = this.f389489b;
        int iHashCode2 = (iHashCode + (me1Var != null ? me1Var.hashCode() : 0)) * 31;
        List<b30> list = this.f389490c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
