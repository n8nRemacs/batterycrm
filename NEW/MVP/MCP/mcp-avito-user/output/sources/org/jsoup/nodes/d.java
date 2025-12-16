package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

/* compiled from: Comment.java */
/* loaded from: classes7.dex */
public class d extends j {
    public d(String str) {
        this.f421095d = str;
    }

    public final o N() {
        String strJ = J();
        Document documentC = new org.jsoup.parser.g(new org.jsoup.parser.m()).c("<" + strJ.substring(1, strJ.length() - 1) + ">", super.j());
        if (documentC.O().size() <= 0) {
            return null;
        }
        g gVar = documentC.N().get(0);
        o oVar = new o(l.a(documentC).f421227c.b(gVar.f421086d.f421235b), strJ.startsWith("!"));
        oVar.i().b(gVar.i());
        return oVar;
    }

    public final boolean O() {
        String strJ = J();
        return strJ.length() > 1 && (strJ.startsWith("!") || strJ.startsWith("?"));
    }

    @Override // org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        return (d) super.n();
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final /* bridge */ /* synthetic */ int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final k n() {
        return (d) super.n();
    }

    @Override // org.jsoup.nodes.k
    public final String toString() {
        return w();
    }

    @Override // org.jsoup.nodes.k
    public final String v() {
        return "#comment";
    }

    @Override // org.jsoup.nodes.k
    public final void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.f421045f && this.f421097c == 0) {
            k kVar = this.f421096b;
            if ((kVar instanceof g) && ((g) kVar).f421086d.f421238e) {
                k.t(sb2, i12, outputSettings);
            }
        }
        sb2.append("<!--").append(J()).append("-->");
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final k p() {
        return this;
    }

    @Override // org.jsoup.nodes.k
    public final void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
    }
}
