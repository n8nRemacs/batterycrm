package com.avito.android.html_editor;

import android.text.Spanned;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.html_formatter.FormatChange;
import hJ.AbstractC40837b;
import hJ.C40836a;
import j.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HtmlInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_editor/g;", "Lcom/avito/android/html_editor/f;", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f164139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final hJ.h f164140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f164141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164142d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<d, G0> f164143e;

    /* compiled from: HtmlInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "index", "Lcom/avito/android/html_formatter/span/a;", "span", "<anonymous parameter 2>", "end", "Lkotlin/G0;", "invoke", "(ILcom/avito/android/html_formatter/span/a;II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.r<Integer, com.avito.android.html_formatter.span.a, Integer, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f164144l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.f f164145m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f164146n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, l0.f fVar, int i13) {
            super(4);
            this.f164144l = i12;
            this.f164145m = fVar;
            this.f164146n = i13;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        @Override // Y41.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(java.lang.Integer r4, com.avito.android.html_formatter.span.a r5, java.lang.Integer r6, java.lang.Integer r7) {
            /*
                r3 = this;
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.avito.android.html_formatter.span.a r5 = (com.avito.android.html_formatter.span.a) r5
                java.lang.Number r6 = (java.lang.Number) r6
                r6.intValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r6 = r7.intValue()
                com.avito.android.html_formatter.jsoup.a0 r5 = r5.f164255a
                int r7 = r3.f164144l
                if (r7 != 0) goto L62
                if (r4 != 0) goto L62
                boolean r4 = r5.p()
                if (r4 == 0) goto L62
                org.jsoup.nodes.k r4 = r5.f164169a
                org.jsoup.nodes.k r0 = r4.B()
                if (r0 == 0) goto L2f
                com.avito.android.html_formatter.jsoup.E r4 = new com.avito.android.html_formatter.jsoup.E
                r4.<init>(r0)
                goto L56
            L2f:
                boolean r0 = r4 instanceof org.jsoup.nodes.g
                r1 = 0
                if (r0 == 0) goto L55
                org.jsoup.nodes.g r4 = (org.jsoup.nodes.g) r4
                org.jsoup.parser.h r0 = r4.f421086d
                java.lang.String r0 = r0.f421236c
                java.lang.String r2 = "li"
                boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
                if (r0 == 0) goto L55
                org.jsoup.nodes.k r4 = r4.f421096b
                org.jsoup.nodes.g r4 = (org.jsoup.nodes.g) r4
                if (r4 == 0) goto L55
                org.jsoup.nodes.g r4 = r4.a0()
                if (r4 == 0) goto L55
                com.avito.android.html_formatter.jsoup.E r0 = new com.avito.android.html_formatter.jsoup.E
                r0.<init>(r4)
                r4 = r0
                goto L56
            L55:
                r4 = r1
            L56:
                if (r4 == 0) goto L5d
                com.avito.android.html_formatter.jsoup.a0 r4 = r4.m()
                goto L66
            L5d:
                com.avito.android.html_formatter.jsoup.a0 r4 = r5.m()
                goto L66
            L62:
                com.avito.android.html_formatter.jsoup.a0 r4 = r5.m()
            L66:
                boolean r5 = r4.p()
                kotlin.jvm.internal.l0$f r0 = r3.f164145m
                if (r5 == 0) goto L91
                int r5 = r3.f164146n
                if (r6 != r5) goto L74
                if (r7 != r5) goto L91
            L74:
                com.avito.android.html_formatter.jsoup.E r5 = r4.n()
                if (r5 != 0) goto L7e
                com.avito.android.html_formatter.jsoup.E r5 = r4.d()
            L7e:
                if (r5 == 0) goto L8e
                com.avito.android.html_formatter.jsoup.a0 r4 = r5.m()
                com.avito.android.html_formatter.jsoup.N r4 = r4.f164205c
                int r4 = r4.e()
                int r5 = r0.f406840b
            L8c:
                r4 = r4 & r5
                goto La2
            L8e:
                int r4 = r0.f406840b
                goto La2
            L91:
                boolean r5 = r4.p()
                if (r5 != 0) goto La0
                int r5 = r0.f406840b
                com.avito.android.html_formatter.jsoup.N r4 = r4.f164205c
                int r4 = r4.e()
                goto L8c
            La0:
                int r4 = r0.f406840b
            La2:
                r0.f406840b = r4
                kotlin.G0 r4 = kotlin.G0.f406611a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_editor.g.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public g(@Y61.k n nVar, @Y61.k hJ.h hVar, @Y61.k c cVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Y41.l lVar) {
        this.f164139a = nVar;
        this.f164140b = hVar;
        this.f164141c = cVar;
        this.f164142d = interfaceC28373a;
        this.f164143e = lVar;
        new com.jakewharton.rxrelay3.c();
    }

    public static int d(List list) {
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            AbstractC40837b abstractC40837b = (AbstractC40837b) it.next();
            length += abstractC40837b instanceof hJ.l ? ((hJ.l) abstractC40837b).f397166b.length() : abstractC40837b instanceof hJ.o ? d(((hJ.o) abstractC40837b).f397170b) : 0;
        }
        return length;
    }

    public static boolean e(String str, List list) {
        List<AbstractC40837b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (AbstractC40837b abstractC40837b : list2) {
            if (abstractC40837b instanceof C40836a) {
                C40836a c40836a = (C40836a) abstractC40837b;
                if (c40836a.f397151a == 0 && c40836a.f397152b == str.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(List list) {
        List<AbstractC40837b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (AbstractC40837b abstractC40837b : list2) {
            if (!(abstractC40837b instanceof hJ.l) || C43066x.L(((hJ.l) abstractC40837b).f397166b) != '\n') {
                if (abstractC40837b instanceof hJ.o) {
                    List<hJ.l> list3 = ((hJ.o) abstractC40837b).f397170b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        if (C43066x.L(((hJ.l) obj).f397166b) == '\n') {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.avito.android.html_editor.f
    @K
    public final void a() {
        this.f164141c.f164130a.clear();
    }

    @Override // com.avito.android.html_editor.f
    @K
    public final int b(@Y61.k Spanned spanned, int i12, int i13) {
        int i14;
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        if (iMin == iMax) {
            i14 = iMin - 1;
            if (i14 < 0) {
                i14 = 0;
            }
        } else {
            i14 = iMin;
        }
        l0.f fVar = new l0.f();
        fVar.f406840b = 31;
        s.a(spanned, i14, iMax, new a(iMin, fVar, iMax));
        if ((fVar.f406840b & 16) == 16) {
            fVar.f406840b = 0;
        }
        ArrayList arrayList = this.f164141c.f164130a;
        int i15 = fVar.f406840b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FormatChange formatChange = ((hJ.d) it.next()).f397155c;
            FormatChange.Type type = formatChange.f164159b;
            FormatChange.Type type2 = FormatChange.Type.f164160b;
            int i16 = formatChange.f164158a;
            if (type != type2 || (i15 & i16) != i16) {
                if (type != type2 || (i15 & i16) == i16) {
                    FormatChange.Type type3 = FormatChange.Type.f164161c;
                    if (type == type3 && (i15 & i16) == i16) {
                        i15 -= i16;
                    } else if (type == type3) {
                        int i17 = i15 & i16;
                    }
                } else {
                    i15 += i16;
                }
            }
        }
        fVar.f406840b = i15;
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7 A[EDGE_INSN: B:236:0x00e7->B:81:0x00e7 BREAK  A[LOOP:13: B:10:0x0031->B:239:?], EDGE_INSN: B:237:0x00e7->B:81:0x00e7 BREAK  A[LOOP:13: B:10:0x0031->B:239:?]] */
    @j.K
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.html_editor.f.a c(@Y61.k hJ.m r19, @Y61.k android.text.Spanned r20, @Y61.k java.util.List<? extends hJ.AbstractC40837b> r21) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_editor.g.c(hJ.m, android.text.Spanned, java.util.List):com.avito.android.html_editor.f$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(hJ.m r18, android.text.Spanned r19, hJ.AbstractC40837b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_editor.g.g(hJ.m, android.text.Spanned, hJ.b, int, int):int");
    }
}
