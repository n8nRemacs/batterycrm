package org.jsoup.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TreeBuilder.java */
/* loaded from: classes7.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public g f421338a;

    /* renamed from: b, reason: collision with root package name */
    public a f421339b;

    /* renamed from: c, reason: collision with root package name */
    public j f421340c;

    /* renamed from: d, reason: collision with root package name */
    public Document f421341d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<org.jsoup.nodes.g> f421342e;

    /* renamed from: f, reason: collision with root package name */
    public String f421343f;

    /* renamed from: g, reason: collision with root package name */
    public Token f421344g;

    /* renamed from: h, reason: collision with root package name */
    public f f421345h;

    /* renamed from: i, reason: collision with root package name */
    public final Token.h f421346i = new Token.h();

    /* renamed from: j, reason: collision with root package name */
    public final Token.g f421347j = new Token.g();

    public final org.jsoup.nodes.g a() {
        int size = this.f421342e.size();
        if (size > 0) {
            return this.f421342e.get(size - 1);
        }
        return null;
    }

    public abstract f b();

    public void c(StringReader stringReader, String str, g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("BaseURI must not be null");
        }
        Document document = new Document(str);
        this.f421341d = document;
        document.f421039k = gVar;
        this.f421338a = gVar;
        this.f421345h = gVar.f421227c;
        this.f421339b = new a(stringReader, 32768);
        this.f421344g = null;
        this.f421340c = new j(this.f421339b, gVar.f421226b);
        this.f421342e = new ArrayList<>(32);
        this.f421343f = str;
    }

    public final Document d(StringReader stringReader, String str, g gVar) {
        c(stringReader, str, gVar);
        h();
        a aVar = this.f421339b;
        StringReader stringReader2 = aVar.f421128b;
        if (stringReader2 != null) {
            try {
                stringReader2.close();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                aVar.f421128b = null;
                aVar.f421127a = null;
                aVar.f421134h = null;
                throw th2;
            }
            aVar.f421128b = null;
            aVar.f421127a = null;
            aVar.f421134h = null;
        }
        this.f421339b = null;
        this.f421340c = null;
        this.f421342e = null;
        return this.f421341d;
    }

    public abstract boolean e(Token token);

    public final boolean f(String str) {
        Token token = this.f421344g;
        Token.g gVar = this.f421347j;
        if (token == gVar) {
            Token.g gVar2 = new Token.g();
            gVar2.n(str);
            return e(gVar2);
        }
        gVar.f();
        gVar.n(str);
        return e(gVar);
    }

    public final void g(String str) {
        Token token = this.f421344g;
        Token.h hVar = this.f421346i;
        if (token == hVar) {
            Token.h hVar2 = new Token.h();
            hVar2.n(str);
            e(hVar2);
        } else {
            hVar.f();
            hVar.n(str);
            e(hVar);
        }
    }

    public final void h() {
        Token token;
        j jVar = this.f421340c;
        Token.TokenType tokenType = Token.TokenType.f421107g;
        while (true) {
            if (jVar.f421252e) {
                StringBuilder sb2 = jVar.f421254g;
                int length = sb2.length();
                Token.c cVar = jVar.f421259l;
                if (length != 0) {
                    String string = sb2.toString();
                    sb2.delete(0, sb2.length());
                    jVar.f421253f = null;
                    cVar.f421109b = string;
                    token = cVar;
                } else {
                    String str = jVar.f421253f;
                    if (str != null) {
                        cVar.f421109b = str;
                        jVar.f421253f = null;
                        token = cVar;
                    } else {
                        jVar.f421252e = false;
                        token = jVar.f421251d;
                    }
                }
                e(token);
                token.f();
                if (token.f421101a == tokenType) {
                    return;
                }
            } else {
                jVar.f421250c.d(jVar, jVar.f421248a);
            }
        }
    }
}
