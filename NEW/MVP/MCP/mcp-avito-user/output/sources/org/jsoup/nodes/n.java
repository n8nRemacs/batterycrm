package org.jsoup.nodes;

import a71.C19693c;
import org.jsoup.nodes.Document;

/* compiled from: TextNode.java */
/* loaded from: classes7.dex */
public class n extends j {
    public n(String str) {
        this.f421095d = str;
    }

    public static boolean P(StringBuilder sb2) {
        return sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ';
    }

    @Override // org.jsoup.nodes.k
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public n n() {
        return (n) super.n();
    }

    public final boolean O() {
        return C19693c.e(J());
    }

    public String Q() {
        String strJ = J();
        StringBuilder sbB = C19693c.b();
        C19693c.a(strJ, sbB, false);
        return C19693c.h(sbB);
    }

    public final void R(String str) {
        super.e(v(), str);
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final /* bridge */ /* synthetic */ int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final String toString() {
        return w();
    }

    @Override // org.jsoup.nodes.k
    public String v() {
        return "#text";
    }

    @Override // org.jsoup.nodes.k
    public void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
        boolean z12 = outputSettings.f421045f;
        if (z12 && this.f421097c == 0) {
            k kVar = this.f421096b;
            if ((kVar instanceof g) && ((g) kVar).f421086d.f421238e && !O()) {
                k.t(sb2, i12, outputSettings);
            }
        }
        Entities.b(sb2, J(), outputSettings, false, z12 && !g.Z(this.f421096b), z12 && (this.f421096b instanceof Document));
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final k p() {
        return this;
    }

    @Override // org.jsoup.nodes.k
    public void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
    }
}
