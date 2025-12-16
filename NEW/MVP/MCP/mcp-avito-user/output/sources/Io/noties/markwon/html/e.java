package io.noties.markwon.html;

import Q61.v;
import io.noties.markwon.AbstractC41740a;
import io.noties.markwon.C;
import io.noties.markwon.g;
import io.noties.markwon.html.g;
import io.noties.markwon.html.jsoup.parser.Token;
import io.noties.markwon.html.m;
import io.noties.markwon.html.r;
import io.noties.markwon.n;
import j.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: HtmlPlugin.java */
/* loaded from: classes8.dex */
public class e extends AbstractC41740a {

    /* renamed from: b, reason: collision with root package name */
    public i f401734b;

    /* renamed from: c, reason: collision with root package name */
    public j f401735c;

    /* renamed from: d, reason: collision with root package name */
    public final d f401736d = new d();

    /* renamed from: a, reason: collision with root package name */
    public final m.a f401733a = new m.a();

    /* compiled from: HtmlPlugin.java */
    public class a implements n.c<Q61.o> {
        public a() {
        }

        @Override // io.noties.markwon.n.c
        public final void a(@N v vVar, @N io.noties.markwon.n nVar) throws IOException {
            e.a(e.this, nVar, ((Q61.o) vVar).f13490f);
        }
    }

    /* compiled from: HtmlPlugin.java */
    public class b implements n.c<Q61.n> {
        public b() {
        }

        @Override // io.noties.markwon.n.c
        public final void a(@N v vVar, @N io.noties.markwon.n nVar) throws IOException {
            e.a(e.this, nVar, ((Q61.n) vVar).f13489f);
        }
    }

    /* compiled from: HtmlPlugin.java */
    public interface c {
    }

    public static void a(e eVar, io.noties.markwon.n nVar, String str) throws IOException {
        g.b bVar;
        int length;
        if (str == null) {
            eVar.getClass();
            return;
        }
        i iVar = eVar.f401734b;
        C cBuilder = nVar.builder();
        iVar.getClass();
        io.noties.markwon.html.jsoup.parser.d dVar = new io.noties.markwon.html.jsoup.parser.d(new io.noties.markwon.html.jsoup.parser.a(str), new io.noties.markwon.html.jsoup.parser.c(0));
        while (true) {
            Token tokenO = dVar.o();
            Token.TokenType tokenType = tokenO.f401765a;
            if (Token.TokenType.f401771g == tokenType) {
                return;
            }
            int iOrdinal = tokenType.ordinal();
            Set<String> set = i.f401747i;
            ArrayList arrayList = iVar.f401750c;
            Set<String> set2 = i.f401745g;
            boolean z12 = true;
            d dVar2 = iVar.f401748a;
            if (iOrdinal == 1) {
                Token.g gVar = (Token.g) tokenO;
                boolean zContains = set2.contains(gVar.f401779c);
                Set<String> set3 = i.f401746h;
                if (zContains) {
                    String str2 = gVar.f401779c;
                    g.b bVar2 = new g.b(cBuilder.length(), str2, i.a(gVar));
                    if (iVar.f401753f) {
                        int length2 = cBuilder.length();
                        if (length2 > 0 && '\n' != cBuilder.charAt(length2 - 1)) {
                            io.noties.markwon.html.a.a(cBuilder, '\n');
                        }
                        iVar.f401753f = false;
                    }
                    if (set3.contains(str2) || gVar.f401785i) {
                        dVar2.getClass();
                        String strA = d.a(bVar2);
                        if (strA != null && strA.length() > 0) {
                            try {
                                cBuilder.append(strA);
                            } catch (IOException e12) {
                                throw new RuntimeException(e12);
                            }
                        }
                        int length3 = cBuilder.length();
                        if (!bVar2.isClosed()) {
                            bVar2.f401742d = length3;
                        }
                    }
                    arrayList.add(bVar2);
                } else {
                    String str3 = gVar.f401779c;
                    if ("p".equals(iVar.f401751d.f401739a)) {
                        iVar.f401751d.g(cBuilder.length());
                        io.noties.markwon.html.a.a(cBuilder, '\n');
                        iVar.f401751d = iVar.f401751d.f401743e;
                    } else if ("li".equals(str3) && "li".equals(iVar.f401751d.f401739a)) {
                        iVar.f401751d.g(cBuilder.length());
                        iVar.f401751d = iVar.f401751d.f401743e;
                    }
                    if (set.contains(str3)) {
                        iVar.f401752e = "pre".equals(str3);
                        int length4 = cBuilder.length();
                        if (length4 > 0 && '\n' != cBuilder.charAt(length4 - 1)) {
                            io.noties.markwon.html.a.a(cBuilder, '\n');
                        }
                    } else if (iVar.f401753f) {
                        int length5 = cBuilder.length();
                        if (length5 > 0 && '\n' != cBuilder.charAt(length5 - 1)) {
                            io.noties.markwon.html.a.a(cBuilder, '\n');
                        }
                        iVar.f401753f = false;
                    }
                    int length6 = cBuilder.length();
                    Map<String, String> mapA = i.a(gVar);
                    g.a aVar = iVar.f401751d;
                    g.a aVar2 = new g.a(str3, length6, mapA, aVar);
                    if (!set3.contains(str3) && !gVar.f401785i) {
                        z12 = false;
                    }
                    if (z12) {
                        dVar2.getClass();
                        String strA2 = d.a(aVar2);
                        if (strA2 != null && strA2.length() > 0) {
                            try {
                                cBuilder.append(strA2);
                            } catch (IOException e13) {
                                throw new RuntimeException(e13);
                            }
                        }
                        aVar2.g(cBuilder.length());
                    }
                    ArrayList arrayList2 = aVar.f401744f;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                        aVar.f401744f = arrayList2;
                    }
                    arrayList2.add(aVar2);
                    if (!z12) {
                        iVar.f401751d = aVar2;
                    }
                }
            } else if (iOrdinal == 2) {
                Token.f fVar = (Token.f) tokenO;
                if (set2.contains(fVar.f401779c)) {
                    String str4 = fVar.f401779c;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size <= -1) {
                            bVar = null;
                            break;
                        }
                        bVar = (g.b) arrayList.get(size);
                        if (str4.equals(bVar.f401739a) && bVar.f401742d < 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        if (bVar.f401740b == cBuilder.length()) {
                            dVar2.getClass();
                            String strA3 = d.a(bVar);
                            if (strA3 != null) {
                                try {
                                    cBuilder.append(strA3);
                                } catch (IOException e14) {
                                    throw new RuntimeException(e14);
                                }
                            }
                        }
                        int length7 = cBuilder.length();
                        if (!bVar.isClosed()) {
                            bVar.f401742d = length7;
                        }
                    }
                } else {
                    String str5 = fVar.f401779c;
                    g.a aVar3 = iVar.f401751d;
                    while (aVar3 != null && !str5.equals(aVar3.f401739a) && !aVar3.isClosed()) {
                        aVar3 = aVar3.f401743e;
                    }
                    if (aVar3 == null) {
                        continue;
                    } else {
                        if ("pre".equals(str5)) {
                            iVar.f401752e = false;
                        }
                        int length8 = cBuilder.length();
                        int i12 = aVar3.f401740b;
                        if (i12 == length8) {
                            dVar2.getClass();
                            String strA4 = d.a(aVar3);
                            if (strA4 != null) {
                                try {
                                    cBuilder.append(strA4);
                                } catch (IOException e15) {
                                    throw new RuntimeException(e15);
                                }
                            }
                        }
                        aVar3.g(cBuilder.length());
                        if (i12 != aVar3.f401742d) {
                            iVar.f401753f = set.contains(aVar3.f401739a);
                        }
                        if ("p".equals(str5)) {
                            io.noties.markwon.html.a.a(cBuilder, '\n');
                        }
                        iVar.f401751d = aVar3.f401743e;
                    }
                }
            } else if (iOrdinal != 4) {
                continue;
            } else {
                Token.b bVar3 = (Token.b) tokenO;
                if (iVar.f401752e) {
                    try {
                        cBuilder.append(bVar3.f401773b);
                    } catch (IOException e16) {
                        throw new RuntimeException(e16);
                    }
                } else {
                    if (iVar.f401753f) {
                        int length9 = cBuilder.length();
                        if (length9 > 0 && '\n' != cBuilder.charAt(length9 - 1)) {
                            io.noties.markwon.html.a.a(cBuilder, '\n');
                        }
                        iVar.f401753f = false;
                    }
                    String str6 = bVar3.f401773b;
                    iVar.f401749b.getClass();
                    int length10 = cBuilder.length();
                    int length11 = str6.length();
                    boolean z13 = false;
                    for (int i13 = 0; i13 < length11; i13++) {
                        char cCharAt = str6.charAt(i13);
                        if (Character.isWhitespace(cCharAt)) {
                            z13 = true;
                        } else {
                            if (z13 && (length = cBuilder.length()) > 0 && !Character.isWhitespace(cBuilder.charAt(length - 1))) {
                                io.noties.markwon.html.a.a(cBuilder, ' ');
                            }
                            io.noties.markwon.html.a.a(cBuilder, cCharAt);
                            z13 = false;
                        }
                    }
                    if (z13 && length10 < cBuilder.length()) {
                        io.noties.markwon.html.a.a(cBuilder, ' ');
                    }
                }
            }
            tokenO.a();
        }
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void afterRender(@N v vVar, @N io.noties.markwon.n nVar) {
        j jVar = this.f401735c;
        if (jVar == null) {
            throw new IllegalStateException("Unexpected state, html-renderer is not defined");
        }
        jVar.a(nVar, this.f401734b);
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureConfiguration(@N g.b bVar) {
        m.a aVar = this.f401733a;
        aVar.getClass();
        aVar.a(io.noties.markwon.html.tag.d.e());
        aVar.a(new io.noties.markwon.html.tag.f());
        aVar.a(new io.noties.markwon.html.tag.a());
        aVar.a(new io.noties.markwon.html.tag.k());
        aVar.a(new io.noties.markwon.html.tag.l());
        aVar.a(new io.noties.markwon.html.tag.j());
        aVar.a(new io.noties.markwon.html.tag.i());
        aVar.a(new io.noties.markwon.html.tag.m());
        aVar.a(new io.noties.markwon.html.tag.g());
        aVar.a(new io.noties.markwon.html.tag.b());
        aVar.a(new io.noties.markwon.html.tag.c());
        this.f401734b = new i(this.f401736d, new r.a());
        if (aVar.f401894b) {
            throw new IllegalStateException("Builder has been already built");
        }
        aVar.f401894b = true;
        HashMap map = aVar.f401893a;
        this.f401735c = map.size() > 0 ? new m(Collections.unmodifiableMap(map)) : new n();
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureVisitor(@N n.b bVar) {
        bVar.a(Q61.n.class, new b()).a(Q61.o.class, new a());
    }
}
