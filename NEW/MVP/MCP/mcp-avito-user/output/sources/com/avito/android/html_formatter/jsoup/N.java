package com.avito.android.html_formatter.jsoup;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.html_formatter.FormatChange;
import hJ.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: JsoupSupportsFormatHtmlNode.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/N;", "LhJ/q;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class N implements hJ.q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final org.jsoup.nodes.k f164184a;

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FormatChange.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FormatChange.Type type = FormatChange.Type.f164160b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "", "invoke", "(Lorg/jsoup/nodes/k;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f164185l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            num.intValue();
            boolean z12 = false;
            if (kVar2 != null && kVar2.r("label")) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<org.jsoup.nodes.g> f164186l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l0.h<org.jsoup.nodes.g> hVar) {
            super(2);
            this.f164186l = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, org.jsoup.nodes.k] */
        @Override // Y41.p
        public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            if (num.intValue() == 0 && (kVar2 instanceof org.jsoup.nodes.g) && kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) kVar2).f421086d.f421236c, "li")) {
                this.f164186l.f406842b = kVar2;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f164187l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            if (num.intValue() > 0 && kVar2 != null && kVar2.l() == 0) {
                kVar2.D();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "", "invoke", "(Lorg/jsoup/nodes/k;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f164188l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            num.intValue();
            boolean z12 = false;
            if (kVar2 != null && kVar2.r("label")) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f164189l = new f();

        public f() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupSupportsFormatHtmlNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f164190l = new g();

        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            if (num.intValue() < 0 && kVar2 != null && kVar2.l() == 0) {
                kVar2.D();
            }
            return G0.f406611a;
        }
    }

    public N(@Y61.k org.jsoup.nodes.k kVar) {
        this.f164184a = kVar;
    }

    public static m.a a(org.jsoup.nodes.k kVar, String str) {
        if (kVar instanceof org.jsoup.nodes.n) {
            return a(kVar.f421096b, str);
        }
        boolean z12 = kVar instanceof org.jsoup.nodes.g;
        if (z12 && C30810h.j(kVar)) {
            org.jsoup.nodes.g gVar = new org.jsoup.nodes.g(str);
            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g("li");
            gVar2.K(new org.jsoup.nodes.g("br"));
            gVar.K(gVar2);
            ((org.jsoup.nodes.g) kVar).K(gVar);
            return new m.a(null, 1, 1, null);
        }
        if (z12 && C30810h.h(kVar)) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) kVar;
            if (gVar3.a0() != null || ((org.jsoup.nodes.g) gVar3.f421096b).a0() == null || !kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) gVar3.f421096b).a0().f421086d.f421236c, str)) {
                org.jsoup.nodes.g gVar4 = new org.jsoup.nodes.g(str);
                g(gVar3, gVar4);
                return c(gVar3, gVar4);
            }
            g(gVar3, ((org.jsoup.nodes.g) gVar3.f421096b).a0());
            if (((org.jsoup.nodes.g) gVar3.f421096b).P() == 1) {
                ((org.jsoup.nodes.g) gVar3.f421096b).D();
            } else {
                gVar3.D();
            }
            return new m.a(null, 0, 1, null);
        }
        if (z12 && C30810h.f(kVar)) {
            return a((org.jsoup.nodes.g) ((org.jsoup.nodes.g) kVar).f421096b, str);
        }
        if (!z12) {
            return new m.a(null, 0, 1, null);
        }
        org.jsoup.nodes.g gVar5 = (org.jsoup.nodes.g) kVar;
        org.jsoup.nodes.g gVarA0 = gVar5.a0();
        org.jsoup.nodes.g gVar6 = (org.jsoup.nodes.g) gVar5.f421096b;
        if (gVarA0 != null && kotlin.jvm.internal.L.f(gVarA0.f421086d.f421236c, str)) {
            g(gVar5, gVarA0);
            gVar5.D();
            return new m.a(null, 0, 1, null);
        }
        org.jsoup.nodes.g gVar7 = new org.jsoup.nodes.g(str);
        gVar6.W(gVar5.f421097c, gVar7);
        g(gVar5, gVar7);
        gVar5.D();
        return new m.a(null, 0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m.a b(org.jsoup.nodes.k kVar, int i12, int i13, String str, FormatChange.Type type) {
        boolean z12;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            if (!(kVar instanceof org.jsoup.nodes.n)) {
                if (!(kVar instanceof org.jsoup.nodes.g) || !C30810h.f(kVar)) {
                    return new m.a(null, 0, 1, null);
                }
                org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) ((org.jsoup.nodes.g) kVar).f421096b;
                int i14 = kVar.f421097c;
                org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(str);
                gVar2.W(0, kVar);
                G0 g02 = G0.f406611a;
                gVar.W(i14, gVar2);
                return new m.a(null, 0, 1, null);
            }
            org.jsoup.nodes.n nVar = (org.jsoup.nodes.n) kVar;
            String strM = nVar.M();
            String strSubstring = strM.substring(0, i12);
            String strSubstring2 = strM.substring(i12, i13);
            String strSubstring3 = strM.substring(i13, strM.length());
            int i15 = nVar.f421097c;
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) nVar.f421096b;
            if (strSubstring3.length() > 0) {
                gVar3.W(i15, new org.jsoup.nodes.n(strSubstring3));
            }
            if (strSubstring2.length() > 0) {
                org.jsoup.nodes.g gVar4 = new org.jsoup.nodes.g(str);
                nVar.R(strSubstring2);
                gVar4.K(nVar);
                gVar3.W(i15, gVar4);
            }
            if (strSubstring.length() > 0) {
                gVar3.W(i15, new org.jsoup.nodes.n(strSubstring));
            }
            return new m.a(null, 0, 1, null);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(kVar instanceof org.jsoup.nodes.n) && !C30810h.f(kVar)) {
            return new m.a(null, 0, 1, null);
        }
        kVar.e("label", "split");
        l0.h hVar = new l0.h();
        l0.h hVar2 = new l0.h();
        org.jsoup.nodes.k kVar2 = kVar;
        while (true) {
            z12 = kVar2 instanceof org.jsoup.nodes.g;
            org.jsoup.nodes.g gVar5 = z12 ? (org.jsoup.nodes.g) kVar2 : null;
            if (kotlin.jvm.internal.L.f(gVar5 != null ? gVar5.f421086d.f421236c : null, str)) {
                break;
            }
            kVar2 = kVar2.f421096b;
        }
        org.jsoup.nodes.g gVar6 = z12 ? (org.jsoup.nodes.g) kVar2 : null;
        if (gVar6 == null || !kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) kVar2).f421086d.f421236c, str)) {
            gVar6 = null;
        }
        if (gVar6 == null) {
            return new m.a(null, 0, 1, null);
        }
        org.jsoup.nodes.g gVarD = d(gVar6);
        org.jsoup.nodes.g gVarD2 = d(gVar6);
        org.jsoup.nodes.g gVar7 = (org.jsoup.nodes.g) gVar6.f421096b;
        if (gVar7 == null) {
            return new m.a(null, 0, 1, null);
        }
        gVar7.W(gVar6.f421097c, gVarD, gVarD2);
        C30810h.l(gVarD, new C30807e(O.f164191l, new P(hVar), new Q(i12)));
        C30810h.l(gVarD2, new C30807e(S.f164194l, new T(hVar2), new U(i12, i13)));
        C30810h.l(gVar6, new C30807e(V.f164198l, W.f164199l, new X(i13)));
        kVar.E();
        org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) hVar.f406842b;
        if (kVar3 != null) {
            kVar3.E();
        }
        org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) hVar2.f406842b;
        if (kVar4 != null) {
            kVar4.E();
        }
        if (gVarD.f0().length() == 0) {
            gVarD.D();
        }
        if (gVar6.f0().length() == 0) {
            gVar6.D();
        }
        gVar7.V(gVarD2.f421097c, gVarD2.m());
        gVarD2.D();
        return new m.a(null, 0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m.a c(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
        if (!kotlin.jvm.internal.L.f(gVar.f421086d.f421236c, "li") || !C30810h.i((org.jsoup.nodes.g) gVar.f421096b)) {
            return null;
        }
        gVar.M("label", "split");
        org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) gVar.f421096b;
        org.jsoup.nodes.g gVar4 = (org.jsoup.nodes.g) gVar3.f421096b;
        org.jsoup.nodes.g gVarD = d(gVar3);
        gVar4.W(gVar3.f421097c, gVarD, gVar2);
        l0.h hVar = new l0.h();
        C30810h.l(gVarD, new C30807e(b.f164185l, new c(hVar), d.f164187l));
        C30810h.l(gVar3, new C30807e(e.f164188l, f.f164189l, g.f164190l));
        org.jsoup.nodes.g gVar5 = (org.jsoup.nodes.g) hVar.f406842b;
        if (gVar5 != null) {
            gVar5.D();
        }
        gVar.D();
        if (gVar3.P() == 0) {
            gVar3.D();
        }
        if (gVarD.P() == 0) {
            gVarD.D();
        }
        return new m.a(null, 0, 1, null);
    }

    public static org.jsoup.nodes.g d(org.jsoup.nodes.g gVar) {
        org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(gVar.f421086d.f421236c);
        List<org.jsoup.nodes.k> listQ = gVar.q();
        ArrayList arrayList = new ArrayList(listQ.size());
        Iterator<org.jsoup.nodes.k> it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().n());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            gVar2.K((org.jsoup.nodes.k) it2.next());
        }
        return gVar2;
    }

    public static void g(org.jsoup.nodes.g gVar, org.jsoup.nodes.g gVar2) {
        org.jsoup.nodes.g gVar3 = new org.jsoup.nodes.g("li");
        gVar2.K(gVar3);
        gVar3.V(0, gVar.m());
    }

    public static m.a i(org.jsoup.nodes.k kVar, InterfaceC28373a interfaceC28373a) {
        boolean z12 = kVar instanceof org.jsoup.nodes.g;
        if (z12 && C30810h.h(kVar)) {
            org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) kVar;
            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g("p");
            gVar2.V(0, kVar.m());
            G0 g02 = G0.f406611a;
            return c(gVar, gVar2);
        }
        if (z12) {
            org.jsoup.parser.h hVar = ((org.jsoup.nodes.g) kVar).f421086d;
            if (hVar.f421237d && !kotlin.jvm.internal.L.f(hVar.f421236c, "li")) {
                if (interfaceC28373a != null) {
                    interfaceC28373a.c(new NonFatalErrorEvent("Removing list format from block element", null, Collections.singletonMap("outerHtml", kVar.w()), null, 10, null));
                }
                return new m.a(null, 0, 1, null);
            }
        }
        if (z12) {
            org.jsoup.nodes.g gVar3 = (org.jsoup.nodes.g) kVar;
            if (kotlin.jvm.internal.L.f(gVar3.f421086d.f421236c, "li") && !C30810h.i((org.jsoup.nodes.g) gVar3.f421096b)) {
                if (interfaceC28373a != null) {
                    interfaceC28373a.c(new NonFatalErrorEvent("Removing list format from bad html", null, Collections.singletonMap("outerHtml", ((org.jsoup.nodes.g) gVar3.f421096b).w()), null, 10, null));
                }
                return new m.a(null, 0, 1, null);
            }
        }
        org.jsoup.nodes.g gVarA = C30810h.a(kVar);
        if (gVarA != null) {
            return i(gVarA, interfaceC28373a);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() {
        /*
            r6 = this;
            org.jsoup.nodes.k r0 = r6.f164184a
            java.util.ArrayList r0 = com.avito.android.html_formatter.jsoup.C30810h.c(r0)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r0.next()
            org.jsoup.nodes.k r3 = (org.jsoup.nodes.k) r3
            boolean r4 = r3 instanceof org.jsoup.nodes.g
            if (r4 == 0) goto L1f
            org.jsoup.nodes.g r3 = (org.jsoup.nodes.g) r3
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L23
            goto Lc
        L23:
            org.jsoup.parser.h r3 = r3.f421086d
            java.lang.String r3 = r3.f421236c
            if (r3 == 0) goto L6b
            int r4 = r3.hashCode()
            r5 = -891980137(0xffffffffcad57697, float:-6994763.5)
            if (r4 == r5) goto L60
            r5 = 3240(0xca8, float:4.54E-42)
            if (r4 == r5) goto L55
            r5 = 3549(0xddd, float:4.973E-42)
            if (r4 == r5) goto L4a
            r5 = 3735(0xe97, float:5.234E-42)
            if (r4 == r5) goto L3f
            goto L6b
        L3f:
            java.lang.String r4 = "ul"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L48
            goto L6b
        L48:
            r3 = 4
            goto L6c
        L4a:
            java.lang.String r4 = "ol"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L6b
            r3 = 8
            goto L6c
        L55:
            java.lang.String r4 = "em"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L5e
            goto L6b
        L5e:
            r3 = 2
            goto L6c
        L60:
            java.lang.String r4 = "strong"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L69
            goto L6b
        L69:
            r3 = 1
            goto L6c
        L6b:
            r3 = r1
        L6c:
            r2 = r2 | r3
            goto Lc
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.html_formatter.jsoup.N.e():int");
    }

    @Override // hJ.q
    @Y61.l
    public final m.a f(int i12, int i13, @Y61.k FormatChange formatChange, @Y61.l InterfaceC28373a interfaceC28373a) {
        int iE2 = e();
        int i14 = formatChange.f164158a;
        int i15 = iE2 & i14;
        FormatChange.Type type = FormatChange.Type.f164160b;
        FormatChange.Type type2 = formatChange.f164159b;
        if (type2 != type) {
            i14 = 0;
        }
        int i16 = i15 ^ i14;
        org.jsoup.nodes.k kVar = this.f164184a;
        if (i16 == 1) {
            return b(kVar, i12, i13, "strong", type2);
        }
        if (i16 == 2) {
            return b(kVar, i12, i13, "em", type2);
        }
        if (i16 == 4) {
            int iOrdinal = type2.ordinal();
            if (iOrdinal == 0) {
                return a(kVar, "ul");
            }
            if (iOrdinal == 1) {
                return i(kVar, interfaceC28373a);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i16 != 8) {
            return null;
        }
        int iOrdinal2 = type2.ordinal();
        if (iOrdinal2 == 0) {
            return a(kVar, "ol");
        }
        if (iOrdinal2 == 1) {
            return i(kVar, interfaceC28373a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
