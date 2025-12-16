package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.b;
import org.jsoup.nodes.b.a;

/* compiled from: XmlDeclaration.java */
/* loaded from: classes7.dex */
public class o extends j {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f421100f;

    public o(String str, boolean z12) {
        org.jsoup.helper.d.d(str);
        this.f421095d = str;
        this.f421100f = z12;
    }

    @Override // org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        return (o) super.n();
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final /* bridge */ /* synthetic */ int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final k n() {
        return (o) super.n();
    }

    @Override // org.jsoup.nodes.k
    public final String toString() {
        return w();
    }

    @Override // org.jsoup.nodes.k
    public final String v() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.k
    public final void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        Appendable appendableAppend = sb2.append("<");
        boolean z12 = this.f421100f;
        appendableAppend.append(z12 ? "!" : "?").append(J());
        b bVarI = i();
        bVarI.getClass();
        b.a aVar = bVarI.new a();
        while (aVar.hasNext()) {
            a aVar2 = (a) aVar.next();
            if (!aVar2.f421070b.equals("#declaration")) {
                sb2.append(' ');
                aVar2.a(sb2, outputSettings);
            }
        }
        sb2.append((CharSequence) (z12 ? "!" : "?")).append(">");
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final k p() {
        return this;
    }

    @Override // org.jsoup.nodes.k
    public final void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
    }
}
