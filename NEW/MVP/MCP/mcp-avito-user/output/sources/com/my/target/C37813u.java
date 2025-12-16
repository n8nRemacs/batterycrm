package com.my.target;

import e11.W1;
import j11.InterfaceC42179d;
import java.util.Stack;

/* renamed from: com.my.target.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37813u {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final W1 f365159a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final d f365160b;

    /* renamed from: com.my.target.u$b */
    public class b implements InterfaceC42179d.a {
        public b(C37813u c37813u, a aVar) {
        }
    }

    /* renamed from: com.my.target.u$c */
    public interface c {
    }

    /* renamed from: com.my.target.u$d */
    public class d implements Runnable {
        public d(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C37813u c37813u = C37813u.this;
            c37813u.getClass();
            c37813u.f365159a.b(c37813u.f365160b);
        }
    }

    public C37813u() {
        new b(this, null);
        this.f365159a = new W1(200);
        this.f365160b = new d(null);
        new Stack();
        new r1(null, null, null);
    }
}
