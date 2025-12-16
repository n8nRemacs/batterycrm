package org.jsoup.parser;

import a71.C19693c;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.io.StringReader;
import java.util.Iterator;
import org.jsoup.nodes.Document;

/* compiled from: Parser.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final l f421225a;

    /* renamed from: b, reason: collision with root package name */
    public final e f421226b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public final f f421227c;

    public g(l lVar) {
        this.f421225a = lVar;
        this.f421227c = lVar.b();
    }

    public static Document a(String str) {
        b bVar = new b();
        return bVar.d(new StringReader(str), "", new g(bVar));
    }

    public static Document b(String str) {
        Document document = new Document("");
        document.f421039k = document.f421039k;
        org.jsoup.nodes.g gVarL = document.L("html");
        gVarL.L("head");
        gVarL.L("body");
        org.jsoup.nodes.g gVarG0 = Document.g0(document);
        b bVar = new b();
        g gVar = new g(bVar);
        bVar.f421143k = c.f421156b;
        bVar.c(new StringReader(str), "", gVar);
        bVar.f421148p = gVarG0;
        bVar.f421154v = true;
        org.jsoup.nodes.g gVar2 = null;
        if (gVarG0 != null) {
            if (gVarG0.z() != null) {
                bVar.f421341d.f421040l = gVarG0.z().f421040l;
            }
            String str2 = gVarG0.f421086d.f421236c;
            if (C19693c.c(str2, "title", "textarea")) {
                bVar.f421340c.f421250c = k.f421296d;
            } else if (C19693c.c(str2, "iframe", "noembed", "noframes", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "xmp")) {
                bVar.f421340c.f421250c = k.f421300f;
            } else if (str2.equals("script")) {
                bVar.f421340c.f421250c = k.f421302g;
            } else if (str2.equals("noscript")) {
                bVar.f421340c.f421250c = k.f421292b;
            } else if (str2.equals("plaintext")) {
                bVar.f421340c.f421250c = k.f421292b;
            } else {
                bVar.f421340c.f421250c = k.f421292b;
            }
            org.jsoup.nodes.g gVar3 = new org.jsoup.nodes.g(h.a("html", bVar.f421345h), "", null);
            bVar.f421341d.K(gVar3);
            bVar.f421342e.add(gVar3);
            bVar.J();
            org.jsoup.select.c cVarY = gVarG0.Y();
            cVarY.add(0, gVarG0);
            Iterator<org.jsoup.nodes.g> it = cVarY.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.jsoup.nodes.g next = it.next();
                if (next instanceof org.jsoup.nodes.i) {
                    bVar.f421147o = (org.jsoup.nodes.i) next;
                    break;
                }
            }
            gVar2 = gVar3;
        }
        bVar.h();
        org.jsoup.nodes.k[] kVarArr = (org.jsoup.nodes.k[]) (gVarG0 != null ? gVar2.m() : bVar.f421341d.m()).toArray(new org.jsoup.nodes.k[0]);
        for (int length = kVarArr.length - 1; length > 0; length--) {
            kVarArr[length].D();
        }
        for (org.jsoup.nodes.k kVar : kVarArr) {
            gVarG0.K(kVar);
        }
        return document;
    }

    public final Document c(String str, String str2) {
        return this.f421225a.d(new StringReader(str), str2, this);
    }
}
