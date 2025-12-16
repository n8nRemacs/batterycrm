package org.jsoup.parser;

import java.io.StringReader;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.n;
import org.jsoup.nodes.o;
import org.jsoup.parser.Token;

/* compiled from: XmlTreeBuilder.java */
/* loaded from: classes7.dex */
public class m extends l {

    /* compiled from: XmlTreeBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421348a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f421348a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421348a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421348a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f421348a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f421348a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f421348a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jsoup.parser.l
    public final f b() {
        return f.f421222d;
    }

    @Override // org.jsoup.parser.l
    public final void c(StringReader stringReader, String str, g gVar) {
        super.c(stringReader, str, gVar);
        this.f421342e.add(this.f421341d);
        this.f421341d.f421038j.f421047h = Document.OutputSettings.Syntax.f421049c;
    }

    @Override // org.jsoup.parser.l
    public final boolean e(Token token) {
        o oVarN;
        int iOrdinal = token.f421101a.ordinal();
        if (iOrdinal != 0) {
            org.jsoup.nodes.g gVar = null;
            if (iOrdinal == 1) {
                Token.h hVar = (Token.h) token;
                h hVarA = h.a(hVar.m(), this.f421345h);
                org.jsoup.nodes.b bVar = hVar.f421126j;
                if (bVar != null) {
                    bVar.j(this.f421345h);
                }
                f fVar = this.f421345h;
                org.jsoup.nodes.b bVar2 = hVar.f421126j;
                fVar.a(bVar2);
                org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(hVarA, null, bVar2);
                a().K(gVar2);
                if (!hVar.f421125i) {
                    this.f421342e.add(gVar2);
                } else if (!h.f421228k.containsKey(hVarA.f421235b)) {
                    hVarA.f421240g = true;
                }
            } else if (iOrdinal == 2) {
                String strB = this.f421345h.b(((Token.g) token).f421118b);
                int size = this.f421342e.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.jsoup.nodes.g gVar3 = this.f421342e.get(size);
                    if (gVar3.v().equals(strB)) {
                        gVar = gVar3;
                        break;
                    }
                    size--;
                }
                if (gVar != null) {
                    for (int size2 = this.f421342e.size() - 1; size2 >= 0; size2--) {
                        org.jsoup.nodes.g gVar4 = this.f421342e.get(size2);
                        this.f421342e.remove(size2);
                        if (gVar4 == gVar) {
                            break;
                        }
                    }
                }
            } else if (iOrdinal == 3) {
                Token.d dVar = (Token.d) token;
                String string = dVar.f421111c;
                if (string == null) {
                    string = dVar.f421110b.toString();
                }
                org.jsoup.nodes.d dVar2 = new org.jsoup.nodes.d(string);
                if (dVar.f421112d && dVar2.O() && (oVarN = dVar2.N()) != null) {
                    dVar2 = oVarN;
                }
                a().K(dVar2);
            } else if (iOrdinal == 4) {
                Token.c cVar = (Token.c) token;
                String str = cVar.f421109b;
                a().K(cVar instanceof Token.b ? new org.jsoup.nodes.c(str) : new n(str));
            } else if (iOrdinal != 5) {
                throw new IllegalArgumentException("Unexpected token type: " + token.f421101a);
            }
        } else {
            Token.e eVar = (Token.e) token;
            org.jsoup.nodes.f fVar2 = new org.jsoup.nodes.f(this.f421345h.b(eVar.f421113b.toString()), eVar.f421115d.toString(), eVar.f421116e.toString());
            fVar2.O(eVar.f421114c);
            a().K(fVar2);
        }
        return true;
    }
}
