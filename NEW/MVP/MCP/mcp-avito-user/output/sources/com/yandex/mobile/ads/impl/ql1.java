package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import j.InterfaceC42156l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class ql1 {

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    private int f389226f;

    /* renamed from: h, reason: collision with root package name */
    private int f389228h;

    /* renamed from: o, reason: collision with root package name */
    private float f389235o;

    /* renamed from: a, reason: collision with root package name */
    private String f389221a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f389222b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f389223c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f389224d = "";

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private String f389225e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f389227g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f389229i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f389230j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f389231k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f389232l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f389233m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f389234n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f389236p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f389237q = false;

    public final void a(String[] strArr) {
        this.f389223c = new HashSet(Arrays.asList(strArr));
    }

    public final void b(String str) {
        this.f389221a = str;
    }

    public final void c(String str) {
        this.f389222b = str;
    }

    public final void d(String str) {
        this.f389224d = str;
    }

    public final float e() {
        return this.f389235o;
    }

    public final int f() {
        return this.f389234n;
    }

    public final int g() {
        return this.f389236p;
    }

    public final int h() {
        int i12 = this.f389232l;
        if (i12 == -1 && this.f389233m == -1) {
            return -1;
        }
        return (i12 == 1 ? 1 : 0) | (this.f389233m == 1 ? 2 : 0);
    }

    public final boolean i() {
        return this.f389229i;
    }

    public final boolean j() {
        return this.f389227g;
    }

    public final boolean k() {
        return this.f389230j == 1;
    }

    public final boolean l() {
        return this.f389231k == 1;
    }

    public final void m() {
        this.f389232l = 1;
    }

    public final void n() {
        this.f389233m = 1;
    }

    public final void o() {
        this.f389231k = 1;
    }

    public final int a(@j.P String str, @j.P String str2, Set<String> set, @j.P String str3) {
        if (this.f389221a.isEmpty() && this.f389222b.isEmpty() && this.f389223c.isEmpty() && this.f389224d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f389221a;
        int i12 = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.f389222b;
        if (!str5.isEmpty() && i12 != -1) {
            i12 = str5.equals(str2) ? i12 + 2 : -1;
        }
        String str6 = this.f389224d;
        if (!str6.isEmpty() && i12 != -1) {
            i12 = str6.equals(str3) ? i12 + 4 : -1;
        }
        if (i12 == -1 || !set.containsAll(this.f389223c)) {
            return 0;
        }
        return (this.f389223c.size() * 4) + i12;
    }

    public final void b(int i12) {
        this.f389226f = i12;
        this.f389227g = true;
    }

    public final int c() {
        if (this.f389227g) {
            return this.f389226f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @j.P
    public final String d() {
        return this.f389225e;
    }

    public final void d(int i12) {
        this.f389236p = i12;
    }

    public final boolean b() {
        return this.f389237q;
    }

    public final void c(int i12) {
        this.f389234n = i12;
    }

    public final void a(@j.P String str) {
        this.f389225e = bb.b(str);
    }

    public final int a() {
        if (this.f389229i) {
            return this.f389228h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final void a(int i12) {
        this.f389228h = i12;
        this.f389229i = true;
    }

    public final void a(float f12) {
        this.f389235o = f12;
    }

    public final void a(boolean z12) {
        this.f389237q = z12;
    }
}
