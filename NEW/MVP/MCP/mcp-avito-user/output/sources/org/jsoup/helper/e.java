package org.jsoup.helper;

import javax.xml.parsers.DocumentBuilderFactory;
import org.jsoup.nodes.g;
import org.jsoup.nodes.k;
import org.jsoup.select.f;
import org.w3c.dom.Element;

/* compiled from: W3CDom.java */
/* loaded from: classes7.dex */
public class e {

    /* compiled from: W3CDom.java */
    public static class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public Element f421037a;

        @Override // org.jsoup.select.f
        public final void a(k kVar, int i12) {
            if ((kVar instanceof g) && (this.f421037a.getParentNode() instanceof Element)) {
                this.f421037a = (Element) this.f421037a.getParentNode();
            }
            throw null;
        }

        @Override // org.jsoup.select.f
        public final void b(k kVar, int i12) {
            throw null;
        }
    }

    public e() {
        DocumentBuilderFactory.newInstance().setNamespaceAware(true);
    }
}
