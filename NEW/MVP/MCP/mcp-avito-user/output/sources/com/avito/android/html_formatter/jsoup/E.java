package com.avito.android.html_formatter.jsoup;

import android.text.SpannableStringBuilder;
import com.avito.android.html_formatter.HtmlCharSequence;
import com.avito.android.html_formatter.span.BlockElementSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: JsoupHtmlNode.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/E;", "LhJ/f;", "a", "b", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class E implements hJ.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final org.jsoup.nodes.k f164169a;

    /* compiled from: JsoupHtmlNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[BlockElementSpan.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BlockElementSpan.Type type = BlockElementSpan.Type.f164244b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: JsoupHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/html_formatter/jsoup/E$d", "Lorg/jsoup/select/f;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements org.jsoup.select.f {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Stack<Integer> f164173b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SpannableStringBuilder f164174c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C30804b f164175d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ hJ.h f164176e;

        public d(Stack stack, SpannableStringBuilder spannableStringBuilder, C30804b c30804b, hJ.h hVar) {
            this.f164173b = stack;
            this.f164174c = spannableStringBuilder;
            this.f164175d = c30804b;
            this.f164176e = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0167  */
        @Override // org.jsoup.select.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@Y61.l org.jsoup.nodes.k r23, int r24) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_formatter.jsoup.E.d.a(org.jsoup.nodes.k, int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
        @Override // org.jsoup.select.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(@Y61.l org.jsoup.nodes.k r13, int r14) {
            /*
                Method dump skipped, instructions count: 437
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_formatter.jsoup.E.d.b(org.jsoup.nodes.k, int):void");
        }
    }

    public E(@Y61.k org.jsoup.nodes.k kVar) {
        this.f164169a = kVar;
    }

    public static final void l(E e12, SpannableStringBuilder spannableStringBuilder, String str, hJ.h hVar, org.jsoup.nodes.k kVar) {
        e12.getClass();
        if (!hVar.f397161e) {
            spannableStringBuilder.append((CharSequence) str);
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new com.avito.android.html_formatter.span.a(new a0(kVar)), length, spannableStringBuilder.length(), 33);
    }

    public static boolean o(org.jsoup.nodes.k kVar) {
        return (kVar instanceof org.jsoup.nodes.g) && kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) kVar).f421086d.f421236c, "br");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hJ.f
    public final boolean c(@Y61.k hJ.m mVar) {
        E e12 = mVar instanceof E ? (E) mVar : null;
        if (e12 == null) {
            return false;
        }
        l0.a aVar = new l0.a();
        this.f164169a.I(new H(aVar, e12));
        return aVar.f406838b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hJ.f
    @Y61.l
    public final E d() {
        l0.h hVar = new l0.h();
        this.f164169a.I(new a(new F(hVar)));
        org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) hVar.f406842b;
        if (gVar != null) {
            return new E(gVar);
        }
        return null;
    }

    @Override // hJ.f
    @Y61.k
    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        List<org.jsoup.nodes.k> listM = this.f164169a.m();
        ArrayList arrayList = new ArrayList(C42745f0.q(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.jsoup.nodes.k) it.next()).w());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hJ.f
    public final boolean g(@Y61.k hJ.m mVar) {
        E e12 = mVar instanceof E ? (E) mVar : null;
        if (e12 == null) {
            return false;
        }
        ArrayList arrayListC = C30810h.c(this.f164169a);
        if (arrayListC.isEmpty()) {
            return false;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.L.f((org.jsoup.nodes.k) it.next(), e12.f164169a)) {
                return true;
            }
        }
        return false;
    }

    @Override // hJ.f
    @Y61.k
    public final HtmlCharSequence i(@Y61.k hJ.h hVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.f164169a.I(new d(new Stack(), spannableStringBuilder, new C30804b(hVar), hVar));
        return new HtmlCharSequence(spannableStringBuilder);
    }

    @Y61.k
    public final a0 m() {
        return new a0(this.f164169a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final E n() {
        l0.h hVar = new l0.h();
        this.f164169a.I(new b(new G(hVar)));
        org.jsoup.nodes.n nVar = (org.jsoup.nodes.n) hVar.f406842b;
        if (nVar != null) {
            return new E(nVar);
        }
        return null;
    }

    public final boolean p() {
        org.jsoup.nodes.k kVar = this.f164169a;
        return (kVar instanceof org.jsoup.nodes.g) && ((org.jsoup.nodes.g) kVar).f421086d.f421237d;
    }

    /* compiled from: JsoupHtmlNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/E$a;", "Lorg/jsoup/select/f;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements org.jsoup.select.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<org.jsoup.nodes.g, G0> f164170a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k Y41.l<? super org.jsoup.nodes.g, G0> lVar) {
            this.f164170a = lVar;
        }

        @Override // org.jsoup.select.f
        public final void a(@Y61.l org.jsoup.nodes.k kVar, int i12) {
            if (kVar instanceof org.jsoup.nodes.g) {
                this.f164170a.invoke(kVar);
            }
        }

        @Override // org.jsoup.select.f
        public final void b(@Y61.l org.jsoup.nodes.k kVar, int i12) {
        }
    }

    /* compiled from: JsoupHtmlNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/E$b;", "Lorg/jsoup/select/f;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements org.jsoup.select.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<org.jsoup.nodes.n, G0> f164171a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Y41.l<? super org.jsoup.nodes.n, G0> lVar) {
            this.f164171a = lVar;
        }

        @Override // org.jsoup.select.f
        public final void a(@Y61.l org.jsoup.nodes.k kVar, int i12) {
            if (kVar instanceof org.jsoup.nodes.n) {
                this.f164171a.invoke(kVar);
            }
        }

        @Override // org.jsoup.select.f
        public final void b(@Y61.l org.jsoup.nodes.k kVar, int i12) {
        }
    }
}
