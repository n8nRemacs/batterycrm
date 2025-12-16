package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import io.noties.markwon.C;
import io.noties.markwon.q;
import j.N;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarkwonImpl.java */
/* loaded from: classes8.dex */
class i extends e {

    /* renamed from: a, reason: collision with root package name */
    public final org.commonmark.parser.d f401898a;

    /* renamed from: b, reason: collision with root package name */
    public final o f401899b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f401900c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f401901d;

    public i(@N org.commonmark.parser.d dVar, @N o oVar, @N List list, boolean z12) {
        this.f401898a = dVar;
        this.f401899b = oVar;
        this.f401900c = list;
        this.f401901d = z12;
    }

    @Override // io.noties.markwon.e
    @N
    public final SpannableStringBuilder b(@N String str) {
        List<j> list = this.f401900c;
        Iterator<j> it = list.iterator();
        String strProcessMarkdown = str;
        while (it.hasNext()) {
            strProcessMarkdown = it.next().processMarkdown(strProcessMarkdown);
        }
        org.commonmark.parser.d dVar = this.f401898a;
        dVar.getClass();
        if (strProcessMarkdown == null) {
            throw new NullPointerException("input must not be null");
        }
        org.commonmark.internal.h hVar = new org.commonmark.internal.h(dVar.f420372a, dVar.f420374c, dVar.f420373b);
        int i12 = 0;
        while (true) {
            int length = strProcessMarkdown.length();
            int i13 = i12;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                char cCharAt = strProcessMarkdown.charAt(i13);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i13++;
            }
            if (i13 == -1) {
                break;
            }
            hVar.i(strProcessMarkdown.substring(i12, i13));
            i12 = i13 + 1;
            if (i12 < strProcessMarkdown.length() && strProcessMarkdown.charAt(i13) == '\r' && strProcessMarkdown.charAt(i12) == '\n') {
                i12 = i13 + 2;
            }
        }
        if (strProcessMarkdown.length() > 0 && (i12 == 0 || i12 < strProcessMarkdown.length())) {
            hVar.i(strProcessMarkdown.substring(i12));
        }
        hVar.f(hVar.f420293n);
        org.commonmark.internal.n nVarA = hVar.f420289j.a(new org.commonmark.internal.m(hVar.f420290k, hVar.f420292m));
        Iterator it2 = hVar.f420294o.iterator();
        while (it2.hasNext()) {
            ((R61.d) it2.next()).f(nVarA);
        }
        Q61.v vVarA = hVar.f420291l.f420277a;
        Iterator it3 = dVar.f420375d.iterator();
        while (it3.hasNext()) {
            vVarA = ((org.commonmark.parser.f) it3.next()).a();
        }
        Iterator<j> it4 = list.iterator();
        while (it4.hasNext()) {
            it4.next().beforeRender(vVarA);
        }
        o oVar = this.f401899b;
        oVar.getClass();
        q qVar = new q(oVar.f401924b, new z(), new C(), Collections.unmodifiableMap(((q.a) oVar.f401923a).f401929a), new C41741b());
        vVarA.a(qVar);
        Iterator<j> it5 = list.iterator();
        while (it5.hasNext()) {
            it5.next().afterRender(vVarA, qVar);
        }
        C c12 = qVar.f401927c;
        C.b bVar = new C.b(c12.f401646b);
        Iterator it6 = c12.f401647c.iterator();
        while (it6.hasNext()) {
            C.a aVar = (C.a) it6.next();
            bVar.setSpan(aVar.f401648a, aVar.f401649b, aVar.f401650c, aVar.f401651d);
        }
        return (TextUtils.isEmpty(bVar) && this.f401901d && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : bVar;
    }
}
