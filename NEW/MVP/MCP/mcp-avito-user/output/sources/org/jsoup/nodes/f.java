package org.jsoup.nodes;

import a71.C19693c;
import java.io.IOException;
import org.jsoup.nodes.Document;

/* compiled from: DocumentType.java */
/* loaded from: classes7.dex */
public class f extends j {
    public f(String str, String str2, String str3) {
        org.jsoup.helper.d.d(str);
        org.jsoup.helper.d.d(str2);
        org.jsoup.helper.d.d(str3);
        super.e("name", str);
        super.e("publicId", str2);
        super.e("systemId", str3);
        if (N("publicId")) {
            super.e("pubSysKey", "PUBLIC");
        } else if (N("systemId")) {
            super.e("pubSysKey", "SYSTEM");
        }
    }

    public final boolean N(String str) {
        return !C19693c.e(super.c(str));
    }

    public final void O(String str) {
        if (str != null) {
            super.e("pubSysKey", str);
        }
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final /* bridge */ /* synthetic */ int l() {
        return 0;
    }

    @Override // org.jsoup.nodes.k
    public final String v() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.k
    public final void x(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.f421047h != Document.OutputSettings.Syntax.f421048b || N("publicId") || N("systemId")) {
            sb2.append("<!DOCTYPE");
        } else {
            sb2.append("<!doctype");
        }
        if (N("name")) {
            sb2.append(" ").append(super.c("name"));
        }
        if (N("pubSysKey")) {
            sb2.append(" ").append(super.c("pubSysKey"));
        }
        if (N("publicId")) {
            sb2.append(" \"").append(super.c("publicId")).append('\"');
        }
        if (N("systemId")) {
            sb2.append(" \"").append(super.c("systemId")).append('\"');
        }
        sb2.append('>');
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.k
    public final k p() {
        return this;
    }

    @Override // org.jsoup.nodes.k
    public final void y(StringBuilder sb2, int i12, Document.OutputSettings outputSettings) {
    }
}
