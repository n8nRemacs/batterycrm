package org.jsoup.nodes;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeafNode.java */
/* loaded from: classes7.dex */
public abstract class j extends k {

    /* renamed from: e, reason: collision with root package name */
    public static final List<k> f421094e = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public Object f421095d;

    @Override // org.jsoup.nodes.k
    public void E() {
        K();
        super.E();
    }

    public final String J() {
        return c(v());
    }

    public final void K() {
        Object obj = this.f421095d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.f421095d = bVar;
        if (obj != null) {
            bVar.y(v(), (String) obj);
        }
    }

    public String L() {
        return J();
    }

    public String M() {
        return J();
    }

    @Override // org.jsoup.nodes.k
    public String a(String str) {
        K();
        return super.a(str);
    }

    @Override // org.jsoup.nodes.k
    public String c(String str) {
        org.jsoup.helper.d.d(str);
        return !(this.f421095d instanceof b) ? str.equals(v()) ? (String) this.f421095d : "" : super.c(str);
    }

    @Override // org.jsoup.nodes.k
    public void e(String str, String str2) {
        if (!(this.f421095d instanceof b) && str.equals(v())) {
            this.f421095d = str2;
        } else {
            K();
            super.e(str, str2);
        }
    }

    @Override // org.jsoup.nodes.k
    public final b i() {
        K();
        return (b) this.f421095d;
    }

    @Override // org.jsoup.nodes.k
    public String j() {
        k kVar = this.f421096b;
        return kVar != null ? kVar.j() : "";
    }

    @Override // org.jsoup.nodes.k
    public int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final k o(k kVar) {
        j jVar = (j) super.o(kVar);
        Object obj = this.f421095d;
        if (obj instanceof b) {
            jVar.f421095d = ((b) obj).clone();
        }
        return jVar;
    }

    @Override // org.jsoup.nodes.k
    public final List<k> q() {
        return f421094e;
    }

    @Override // org.jsoup.nodes.k
    public boolean r(String str) {
        K();
        return super.r(str);
    }

    @Override // org.jsoup.nodes.k
    public final boolean s() {
        return this.f421095d instanceof b;
    }

    @Override // org.jsoup.nodes.k
    public k p() {
        return this;
    }
}
