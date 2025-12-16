package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractC36441a;
import com.fasterxml.jackson.databind.deser.r;
import com.fasterxml.jackson.databind.deser.std.E;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.util.C36497c;
import java.io.Serializable;

/* compiled from: DeserializerFactoryConfig.java */
/* loaded from: classes4.dex */
public class h implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.deser.q[] f341495g = new com.fasterxml.jackson.databind.deser.q[0];

    /* renamed from: h, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.deser.g[] f341496h = new com.fasterxml.jackson.databind.deser.g[0];

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC36441a[] f341497i = new AbstractC36441a[0];

    /* renamed from: j, reason: collision with root package name */
    public static final y[] f341498j = new y[0];

    /* renamed from: k, reason: collision with root package name */
    public static final r[] f341499k = {new E()};
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.q[] f341500b = f341495g;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f341501c = f341499k;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.g[] f341502d = f341496h;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC36441a[] f341503e = f341497i;

    /* renamed from: f, reason: collision with root package name */
    public final y[] f341504f = f341498j;

    public final C36497c a() {
        return new C36497c(this.f341502d);
    }

    public final C36497c b() {
        return new C36497c(this.f341500b);
    }

    public final boolean c() {
        return this.f341502d.length > 0;
    }
}
