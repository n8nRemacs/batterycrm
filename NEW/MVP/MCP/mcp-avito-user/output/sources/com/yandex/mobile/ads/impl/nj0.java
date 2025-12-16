package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class nj0 {

    /* renamed from: a, reason: collision with root package name */
    private h90 f388318a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private int f388319b;

    /* renamed from: c, reason: collision with root package name */
    private List<eb<?>> f388320c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private String f388321d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private AdImpressionData f388322e;

    /* renamed from: f, reason: collision with root package name */
    private String f388323f;

    /* renamed from: g, reason: collision with root package name */
    private zv f388324g;

    /* renamed from: h, reason: collision with root package name */
    private zv f388325h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final HashSet f388326i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final HashSet f388327j = new HashSet();

    public final void a(@j.P h90 h90Var) {
        this.f388318a = h90Var;
    }

    public final List<eb<?>> b() {
        return this.f388320c;
    }

    public final void c(String str) {
        int[] iArrB = n6.b(3);
        int length = iArrB.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            int i14 = iArrB[i13];
            if (tz0.a(i14).equals(str)) {
                i12 = i14;
                break;
            }
            i13++;
        }
        this.f388319b = i12;
    }

    public final void d(String str) {
        this.f388323f = str;
    }

    public final h90 e() {
        return this.f388318a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj0.class != obj.getClass()) {
            return false;
        }
        nj0 nj0Var = (nj0) obj;
        h90 h90Var = this.f388318a;
        if (h90Var == null ? nj0Var.f388318a != null : !h90Var.equals(nj0Var.f388318a)) {
            return false;
        }
        if (this.f388319b != nj0Var.f388319b) {
            return false;
        }
        List<eb<?>> list = this.f388320c;
        if (list == null ? nj0Var.f388320c != null : !list.equals(nj0Var.f388320c)) {
            return false;
        }
        String str = this.f388321d;
        if (str == null ? nj0Var.f388321d != null : !str.equals(nj0Var.f388321d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f388322e;
        if (adImpressionData == null ? nj0Var.f388322e != null : !adImpressionData.equals(nj0Var.f388322e)) {
            return false;
        }
        String str2 = this.f388323f;
        if (str2 == null ? nj0Var.f388323f != null : !str2.equals(nj0Var.f388323f)) {
            return false;
        }
        zv zvVar = this.f388324g;
        if (zvVar == null ? nj0Var.f388324g != null : !zvVar.equals(nj0Var.f388324g)) {
            return false;
        }
        zv zvVar2 = this.f388325h;
        if (zvVar2 == null ? nj0Var.f388325h != null : !zvVar2.equals(nj0Var.f388325h)) {
            return false;
        }
        if (this.f388326i.equals(nj0Var.f388326i)) {
            return this.f388327j.equals(nj0Var.f388327j);
        }
        return false;
    }

    @j.N
    public final ArrayList f() {
        return new ArrayList(this.f388326i);
    }

    @j.P
    public final int g() {
        return this.f388319b;
    }

    @j.N
    public final ArrayList h() {
        return new ArrayList(this.f388327j);
    }

    public final int hashCode() {
        h90 h90Var = this.f388318a;
        int iHashCode = (h90Var != null ? h90Var.hashCode() : 0) * 31;
        int i12 = this.f388319b;
        int iA2 = (iHashCode + (i12 != 0 ? n6.a(i12) : 0)) * 31;
        List<eb<?>> list = this.f388320c;
        int iHashCode2 = (iA2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f388321d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f388322e;
        int iHashCode4 = (iHashCode3 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        String str2 = this.f388323f;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        zv zvVar = this.f388324g;
        int iHashCode6 = (iHashCode5 + (zvVar != null ? zvVar.hashCode() : 0)) * 31;
        zv zvVar2 = this.f388325h;
        return this.f388327j.hashCode() + ((this.f388326i.hashCode() + ((iHashCode6 + (zvVar2 != null ? zvVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final void a(@j.N q31 q31Var) {
        this.f388327j.add(q31Var);
    }

    public final void b(@j.N ArrayList arrayList) {
        this.f388327j.addAll(arrayList);
    }

    @j.P
    public final String d() {
        return this.f388323f;
    }

    public final void a(@j.N String str) {
        this.f388326i.add(str);
    }

    public final void b(@j.P String str) {
        this.f388321d = str;
    }

    public final void a(@j.N ArrayList arrayList) {
        this.f388326i.addAll(arrayList);
    }

    public final void b(zv zvVar) {
        this.f388325h = zvVar;
    }

    public final void a(@j.P AdImpressionData adImpressionData) {
        this.f388322e = adImpressionData;
    }

    @j.P
    public final String a() {
        return this.f388321d;
    }

    public final void c(ArrayList arrayList) {
        this.f388320c = arrayList;
    }

    public final void a(zv zvVar) {
        this.f388324g = zvVar;
    }

    @j.P
    public final AdImpressionData c() {
        return this.f388322e;
    }
}
