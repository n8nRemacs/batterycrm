package com.avito.android.html_formatter.jsoup;

import hJ.m;
import hJ.p;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: JsoupExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_html-formatter_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.html_formatter.jsoup.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30810h {

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "", "invoke", "(Lorg/jsoup/nodes/k;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f164216l = new a();

        public a() {
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

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<org.jsoup.nodes.k> f164217l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<org.jsoup.nodes.k> hVar) {
            super(2);
            this.f164217l = hVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, org.jsoup.nodes.k] */
        @Override // Y41.p
        public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            if (num.intValue() < 0 && ((kVar2 instanceof org.jsoup.nodes.n) || (kVar2 != 0 && C30810h.f(kVar2)))) {
                this.f164217l.f406842b = kVar2;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f164218l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "", "invoke", "(Lorg/jsoup/nodes/k;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f164219l = new d();

        public d() {
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

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<org.jsoup.nodes.k> f164220l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.h<org.jsoup.nodes.k> hVar) {
            super(2);
            this.f164220l = hVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, org.jsoup.nodes.k] */
        @Override // Y41.p
        public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            org.jsoup.nodes.k kVar2 = kVar;
            int iIntValue = num.intValue();
            l0.h<org.jsoup.nodes.k> hVar = this.f164220l;
            if (hVar.f406842b == null && iIntValue > 0 && ((kVar2 instanceof org.jsoup.nodes.n) || (kVar2 != 0 && C30810h.f(kVar2)))) {
                hVar.f406842b = kVar2;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JsoupExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.html_formatter.jsoup.h$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f164221l = new f();

        public f() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    @Y61.l
    public static final org.jsoup.nodes.g a(@Y61.k org.jsoup.nodes.k kVar) {
        boolean z12;
        while (true) {
            z12 = kVar instanceof org.jsoup.nodes.g;
            org.jsoup.nodes.g gVar = z12 ? (org.jsoup.nodes.g) kVar : null;
            if (gVar != null && gVar.f421086d.f421237d) {
                break;
            }
            kVar = kVar.f421096b;
        }
        org.jsoup.nodes.g gVar2 = z12 ? (org.jsoup.nodes.g) kVar : null;
        if (gVar2 == null || !((org.jsoup.nodes.g) kVar).f421086d.f421237d) {
            return null;
        }
        return gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final org.jsoup.nodes.g b(@Y61.k org.jsoup.nodes.g gVar) {
        l0.h hVar = new l0.h();
        gVar.e0(new C30806d(new C30808f(hVar)));
        return (org.jsoup.nodes.g) hVar.f406842b;
    }

    @Y61.k
    public static final ArrayList c(@Y61.k org.jsoup.nodes.k kVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        if (kVar instanceof org.jsoup.nodes.g) {
            arrayList.addAll(((org.jsoup.nodes.g) kVar).Y());
        } else if (kVar instanceof org.jsoup.nodes.n) {
            arrayList.add(kVar.f421096b);
            arrayList.addAll(((org.jsoup.nodes.g) kVar.f421096b).Y());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final org.jsoup.nodes.k d(@Y61.k org.jsoup.nodes.k kVar) {
        org.jsoup.nodes.g gVarA = a(kVar);
        if (gVarA == null) {
            return null;
        }
        kVar.e("label", "split");
        l0.h hVar = new l0.h();
        gVarA.e0(new C30807e(a.f164216l, new b(hVar), c.f164218l));
        kVar.E();
        return (org.jsoup.nodes.k) hVar.f406842b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static final org.jsoup.nodes.k e(@Y61.k org.jsoup.nodes.k kVar) {
        org.jsoup.nodes.g gVarA = a(kVar);
        if (gVarA == null) {
            return null;
        }
        kVar.e("label", "split");
        l0.h hVar = new l0.h();
        gVarA.e0(new C30807e(d.f164219l, new e(hVar), f.f164221l));
        kVar.E();
        return (org.jsoup.nodes.k) hVar.f406842b;
    }

    public static final boolean f(@Y61.k org.jsoup.nodes.k kVar) {
        return (kVar instanceof org.jsoup.nodes.g) && kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) kVar).f421086d.f421236c, "br");
    }

    public static final boolean g(@Y61.k org.jsoup.nodes.k kVar) {
        while (!j(kVar) && ((!(kVar instanceof org.jsoup.nodes.g) || !((org.jsoup.nodes.g) kVar).f421086d.f421237d) && kVar.B() == null && kVar.u() == null)) {
            kVar = kVar.f421096b;
        }
        return (kVar instanceof org.jsoup.nodes.g) && ((org.jsoup.nodes.g) kVar).f421086d.f421237d;
    }

    public static final boolean h(@Y61.k org.jsoup.nodes.k kVar) {
        if (kVar instanceof org.jsoup.nodes.g) {
            org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) kVar;
            if (kotlin.jvm.internal.L.f(gVar.f421086d.f421236c, "li") && i((org.jsoup.nodes.g) gVar.f421096b)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(@Y61.k org.jsoup.nodes.k kVar) {
        if (kVar instanceof org.jsoup.nodes.g) {
            org.jsoup.parser.h hVar = ((org.jsoup.nodes.g) kVar).f421086d;
            if (kotlin.jvm.internal.L.f(hVar.f421236c, "ul") || kotlin.jvm.internal.L.f(hVar.f421236c, "ol")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(@Y61.k org.jsoup.nodes.k kVar) {
        return (kVar instanceof org.jsoup.nodes.g) && kotlin.jvm.internal.L.f(((org.jsoup.nodes.g) kVar).f421086d.f421236c, "body");
    }

    @Y61.k
    public static final m.a k(@Y61.k org.jsoup.nodes.k kVar, @Y61.l p.b bVar) {
        org.jsoup.nodes.k kVarA = kVar.A();
        org.jsoup.nodes.g gVar = kVarA instanceof org.jsoup.nodes.g ? (org.jsoup.nodes.g) kVarA : null;
        if (gVar == null) {
            return new m.a(null, 0, 1, null);
        }
        if (bVar != null) {
            bVar.f397172a.add(kVar);
        } else {
            kVar.D();
        }
        if (i(gVar) && gVar.P() == 0) {
            gVar.D();
        }
        return new m.a(null, 0, 1, null);
    }

    public static final void l(@Y61.k org.jsoup.nodes.k kVar, @Y61.k org.jsoup.select.f fVar) {
        org.jsoup.nodes.k kVarU;
        org.jsoup.nodes.k kVarK = kVar;
        int i12 = 0;
        while (kVarK != null) {
            fVar.b(kVarK, i12);
            if (kVarK.l() > 0) {
                kVarK = kVarK.k(0);
                i12++;
            } else {
                while (true) {
                    if ((kVarK != null ? kVarK.u() : null) != null || i12 <= 0) {
                        break;
                    }
                    if (kVarK != null) {
                        kVarU = kVarK.f421096b;
                    }
                    fVar.a(kVarK, i12);
                    i12--;
                    kVarK = kVarU;
                }
                kVarU = kVarK != null ? kVarK.u() : null;
                fVar.a(kVarK, i12);
                if (kVarK == kVar) {
                    return;
                } else {
                    kVarK = kVarU;
                }
            }
        }
    }
}
