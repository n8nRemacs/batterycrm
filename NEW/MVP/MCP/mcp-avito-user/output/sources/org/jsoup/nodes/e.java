package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* compiled from: DataNode.java */
/* loaded from: classes7.dex */
public class e extends j {
    public e(String str) {
        this.f421095d = str;
    }

    @Override // org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        return (e) super.n();
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final /* bridge */ /* synthetic */ int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final k n() {
        return (e) super.n();
    }

    @Override // org.jsoup.nodes.k
    public final String toString() {
        return w();
    }

    @Override // org.jsoup.nodes.k
    public final String v() {
        return "#data";
    }

    @Override // org.jsoup.nodes.k
    public final void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
        sb2.append((CharSequence) J());
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final k p() {
        return this;
    }

    @Override // org.jsoup.nodes.k
    public final void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
    }
}
