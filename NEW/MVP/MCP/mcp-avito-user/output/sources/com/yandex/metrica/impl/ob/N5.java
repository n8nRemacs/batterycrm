package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class N5 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f378971a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private Set<Integer> f378972b;

    /* renamed from: c, reason: collision with root package name */
    private int f378973c;

    /* renamed from: d, reason: collision with root package name */
    private int f378974d;

    public N5() {
        this(false, 0, 0, new HashSet());
    }

    public void a() {
        this.f378972b = new HashSet();
        this.f378974d = 0;
    }

    @j.N
    public Set<Integer> b() {
        return this.f378972b;
    }

    public int c() {
        return this.f378974d;
    }

    public int d() {
        return this.f378973c;
    }

    public boolean e() {
        return this.f378971a;
    }

    public N5(boolean z12, int i12, int i13, @j.N Set<Integer> set) {
        this.f378971a = z12;
        this.f378972b = set;
        this.f378973c = i12;
        this.f378974d = i13;
    }

    public void b(int i12) {
        this.f378973c = i12;
        this.f378974d = 0;
    }

    public void a(boolean z12) {
        this.f378971a = z12;
    }

    public void a(int i12) {
        this.f378972b.add(Integer.valueOf(i12));
        this.f378974d++;
    }
}
