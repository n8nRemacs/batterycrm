package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.Document;

/* compiled from: CDataNode.java */
/* loaded from: classes7.dex */
public class c extends n {
    @Override // org.jsoup.nodes.n
    /* renamed from: N */
    public final n n() {
        return (c) super.n();
    }

    @Override // org.jsoup.nodes.n
    public final String Q() {
        return J();
    }

    @Override // org.jsoup.nodes.n, org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        return (c) super.n();
    }

    @Override // org.jsoup.nodes.n, org.jsoup.nodes.k
    public final k n() {
        return (c) super.n();
    }

    @Override // org.jsoup.nodes.n, org.jsoup.nodes.k
    public final String v() {
        return "#cdata";
    }

    @Override // org.jsoup.nodes.n, org.jsoup.nodes.k
    public final void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        sb2.append("<![CDATA[").append(J());
    }

    @Override // org.jsoup.nodes.n, org.jsoup.nodes.k
    public final void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
        try {
            sb2.append("]]>");
        } catch (IOException e12) {
            throw new UncheckedIOException(e12);
        }
    }
}
