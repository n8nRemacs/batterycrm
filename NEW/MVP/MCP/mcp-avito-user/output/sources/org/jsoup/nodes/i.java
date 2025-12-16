package org.jsoup.nodes;

/* compiled from: FormElement.java */
/* loaded from: classes7.dex */
public class i extends g {

    /* renamed from: j, reason: collision with root package name */
    public final org.jsoup.select.c f421093j;

    public i(org.jsoup.parser.h hVar, b bVar) {
        super(hVar, null, bVar);
        this.f421093j = new org.jsoup.select.c();
    }

    @Override // org.jsoup.nodes.k
    public final void F(k kVar) {
        super.F(kVar);
        this.f421093j.remove(kVar);
    }

    @Override // org.jsoup.nodes.g
    /* renamed from: Q */
    public final g clone() {
        return (i) super.clone();
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        return (i) super.clone();
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.k
    public final k n() {
        return (i) super.clone();
    }
}
