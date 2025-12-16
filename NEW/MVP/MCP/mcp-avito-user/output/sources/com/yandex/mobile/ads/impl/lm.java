package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* loaded from: classes8.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final FalseClick f387573a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final List<ia1> f387574b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final e90 f387575c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private FalseClick f387576a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private List<ia1> f387577b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private e90 f387578c;

        public final void a(@j.P FalseClick falseClick) {
            this.f387576a = falseClick;
        }

        public final void a(@j.P List list) {
            this.f387577b = list;
        }

        public final void a(@j.P e90 e90Var) {
            this.f387578c = e90Var;
        }
    }

    public lm(@j.N a aVar) {
        this.f387573a = aVar.f387576a;
        this.f387574b = aVar.f387577b;
        this.f387575c = aVar.f387578c;
    }

    @j.P
    public final FalseClick a() {
        return this.f387573a;
    }

    @j.P
    public final e90 b() {
        return this.f387575c;
    }

    @j.P
    public final List<ia1> c() {
        return this.f387574b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lm.class != obj.getClass()) {
            return false;
        }
        lm lmVar = (lm) obj;
        FalseClick falseClick = this.f387573a;
        if (falseClick == null ? lmVar.f387573a != null : !falseClick.equals(lmVar.f387573a)) {
            return false;
        }
        e90 e90Var = this.f387575c;
        if (e90Var == null ? lmVar.f387575c != null : !e90Var.equals(lmVar.f387575c)) {
            return false;
        }
        List<ia1> list = this.f387574b;
        List<ia1> list2 = lmVar.f387574b;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        FalseClick falseClick = this.f387573a;
        int iHashCode = (falseClick != null ? falseClick.hashCode() : 0) * 31;
        List<ia1> list = this.f387574b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        e90 e90Var = this.f387575c;
        return iHashCode2 + (e90Var != null ? e90Var.hashCode() : 0);
    }
}
