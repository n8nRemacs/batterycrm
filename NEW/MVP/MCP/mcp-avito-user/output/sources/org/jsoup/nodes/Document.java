package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.nodes.Entities;

/* loaded from: classes7.dex */
public class Document extends g {

    /* renamed from: j, reason: collision with root package name */
    public OutputSettings f421038j;

    /* renamed from: k, reason: collision with root package name */
    public org.jsoup.parser.g f421039k;

    /* renamed from: l, reason: collision with root package name */
    public QuirksMode f421040l;

    public static class OutputSettings implements Cloneable {

        /* renamed from: e, reason: collision with root package name */
        public Entities.b f421044e;

        /* renamed from: b, reason: collision with root package name */
        public Entities.EscapeMode f421041b = Entities.EscapeMode.base;

        /* renamed from: d, reason: collision with root package name */
        public final ThreadLocal<CharsetEncoder> f421043d = new ThreadLocal<>();

        /* renamed from: f, reason: collision with root package name */
        public boolean f421045f = true;

        /* renamed from: g, reason: collision with root package name */
        public final int f421046g = 1;

        /* renamed from: h, reason: collision with root package name */
        public Syntax f421047h = Syntax.f421048b;

        /* renamed from: c, reason: collision with root package name */
        public Charset f421042c = Charset.forName("UTF8");

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Syntax {

            /* renamed from: b, reason: collision with root package name */
            public static final Syntax f421048b;

            /* renamed from: c, reason: collision with root package name */
            public static final Syntax f421049c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Syntax[] f421050d;

            static {
                Syntax syntax = new Syntax("html", 0);
                f421048b = syntax;
                Syntax syntax2 = new Syntax("xml", 1);
                f421049c = syntax2;
                f421050d = new Syntax[]{syntax, syntax2};
            }

            public Syntax() {
                throw null;
            }

            public static Syntax valueOf(String str) {
                return (Syntax) Enum.valueOf(Syntax.class, str);
            }

            public static Syntax[] values() {
                return (Syntax[]) f421050d.clone();
            }
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                String strName = this.f421042c.name();
                outputSettings.getClass();
                outputSettings.f421042c = Charset.forName(strName);
                outputSettings.f421041b = Entities.EscapeMode.valueOf(this.f421041b.name());
                return outputSettings;
            } catch (CloneNotSupportedException e12) {
                throw new RuntimeException(e12);
            }
        }

        public final CharsetEncoder e() {
            CharsetEncoder charsetEncoderNewEncoder = this.f421042c.newEncoder();
            this.f421043d.set(charsetEncoderNewEncoder);
            String strName = charsetEncoderNewEncoder.charset().name();
            this.f421044e = strName.equals("US-ASCII") ? Entities.b.f421065b : strName.startsWith("UTF-") ? Entities.b.f421066c : Entities.b.f421067d;
            return charsetEncoderNewEncoder;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QuirksMode {

        /* renamed from: b, reason: collision with root package name */
        public static final QuirksMode f421051b;

        /* renamed from: c, reason: collision with root package name */
        public static final QuirksMode f421052c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ QuirksMode[] f421053d;

        static {
            QuirksMode quirksMode = new QuirksMode("noQuirks", 0);
            f421051b = quirksMode;
            QuirksMode quirksMode2 = new QuirksMode("quirks", 1);
            f421052c = quirksMode2;
            f421053d = new QuirksMode[]{quirksMode, quirksMode2, new QuirksMode("limitedQuirks", 2)};
        }

        public QuirksMode() {
            throw null;
        }

        public static QuirksMode valueOf(String str) {
            return (QuirksMode) Enum.valueOf(QuirksMode.class, str);
        }

        public static QuirksMode[] values() {
            return (QuirksMode[]) f421053d.clone();
        }
    }

    public Document(String str) {
        super(org.jsoup.parser.h.a("#root", org.jsoup.parser.f.f421221c), str, null);
        this.f421038j = new OutputSettings();
        this.f421040l = QuirksMode.f421051b;
    }

    public static g g0(k kVar) {
        if (kVar.v().equals("body")) {
            return (g) kVar;
        }
        int iL2 = kVar.l();
        for (int i12 = 0; i12 < iL2; i12++) {
            g gVarG0 = g0(kVar.k(i12));
            if (gVarG0 != null) {
                return gVarG0;
            }
        }
        return null;
    }

    @Override // org.jsoup.nodes.g
    /* renamed from: Q */
    public final g clone() {
        Document document = (Document) super.clone();
        document.f421038j = this.f421038j.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.k
    /* renamed from: clone */
    public final Object n() {
        Document document = (Document) super.clone();
        document.f421038j = this.f421038j.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.k
    public final k n() {
        Document document = (Document) super.clone();
        document.f421038j = this.f421038j.clone();
        return document;
    }

    @Override // org.jsoup.nodes.g, org.jsoup.nodes.k
    public final String v() {
        return "#document";
    }

    @Override // org.jsoup.nodes.k
    public final String w() {
        return U();
    }
}
