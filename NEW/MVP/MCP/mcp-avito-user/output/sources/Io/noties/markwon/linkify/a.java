package io.noties.markwon.linkify;

import Q61.r;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import io.noties.markwon.AbstractC41740a;
import io.noties.markwon.B;
import io.noties.markwon.C;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.p;
import io.noties.markwon.j;
import io.noties.markwon.n;
import io.noties.markwon.y;
import j.N;

/* compiled from: LinkifyPlugin.java */
/* loaded from: classes8.dex */
public class a extends AbstractC41740a {

    /* renamed from: a, reason: collision with root package name */
    public final int f401918a = 7;

    /* compiled from: LinkifyPlugin.java */
    /* renamed from: io.noties.markwon.linkify.a$a, reason: collision with other inner class name */
    public class C11438a implements j.a<p> {
        public C11438a() {
        }

        @Override // io.noties.markwon.j.a
        public final void a(@N j jVar) {
            a aVar = a.this;
            aVar.getClass();
            ((p) jVar).f401663a.add(new c(aVar.f401918a));
        }
    }

    /* compiled from: LinkifyPlugin.java */
    public static class b extends c {
        @Override // io.noties.markwon.linkify.a.c
        public final boolean b(@N SpannableStringBuilder spannableStringBuilder, int i12) {
            return androidx.core.text.util.c.a(spannableStringBuilder, i12);
        }
    }

    /* compiled from: LinkifyPlugin.java */
    public static class c implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f401920a;

        public c(int i12) {
            this.f401920a = i12;
        }

        @Override // io.noties.markwon.core.p.a
        public final void a(@N n nVar, @N String str, int i12) {
            B bA2 = nVar.u().f401717g.a(r.class);
            if (bA2 == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (b(spannableStringBuilder, this.f401920a)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                    return;
                }
                y yVarF = nVar.f();
                C cBuilder = nVar.builder();
                for (URLSpan uRLSpan : uRLSpanArr) {
                    yVarF.a(CoreProps.f401656e, uRLSpan.getURL());
                    C.c(cBuilder, bA2.a(nVar.u(), yVarF), spannableStringBuilder.getSpanStart(uRLSpan) + i12, spannableStringBuilder.getSpanEnd(uRLSpan) + i12);
                }
            }
        }

        public boolean b(@N SpannableStringBuilder spannableStringBuilder, int i12) {
            return Linkify.addLinks(spannableStringBuilder, i12);
        }
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configure(@N j.b bVar) {
        bVar.b(p.class, new C11438a());
    }
}
