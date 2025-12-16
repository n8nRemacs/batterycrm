package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.x;
import java.util.regex.Pattern;
import org.commonmark.internal.h;

/* compiled from: HtmlBlockParser.java */
/* loaded from: classes7.dex */
public class k extends R61.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f420301e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f420303b;

    /* renamed from: a, reason: collision with root package name */
    public final Q61.n f420302a = new Q61.n();

    /* renamed from: c, reason: collision with root package name */
    public boolean f420304c = false;

    /* renamed from: d, reason: collision with root package name */
    public org.commonmark.internal.a f420305d = new org.commonmark.internal.a();

    /* compiled from: HtmlBlockParser.java */
    public static class b extends R61.b {
        @Override // R61.e
        public final d a(h hVar, R61.g gVar) {
            int i12 = hVar.f420284e;
            CharSequence charSequence = hVar.f420280a;
            if (hVar.f420286g < 4 && charSequence.charAt(i12) == '<') {
                for (int i13 = 1; i13 <= 7; i13++) {
                    if (i13 != 7 || !(((h.a) gVar).f420295a.c() instanceof x)) {
                        Pattern[] patternArr = k.f420301e[i13];
                        Pattern pattern = patternArr[0];
                        Pattern pattern2 = patternArr[1];
                        if (pattern.matcher(charSequence.subSequence(i12, charSequence.length())).find()) {
                            d dVar = new d(new k(pattern2, null));
                            dVar.f420259b = hVar.f420281b;
                            return dVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    public k(Pattern pattern, a aVar) {
        this.f420303b = pattern;
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420302a;
    }

    @Override // R61.a, R61.d
    public final void d(CharSequence charSequence) {
        org.commonmark.internal.a aVar = this.f420305d;
        int i12 = aVar.f420253b;
        StringBuilder sb2 = aVar.f420252a;
        if (i12 != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        aVar.f420253b++;
        Pattern pattern = this.f420303b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f420304c = true;
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        if (this.f420304c) {
            return null;
        }
        if (hVar.f420287h && this.f420303b == null) {
            return null;
        }
        return R61.c.a(hVar.f420281b);
    }

    @Override // R61.a, R61.d
    public final void h() {
        this.f420302a.f13489f = this.f420305d.f420252a.toString();
        this.f420305d = null;
    }
}
