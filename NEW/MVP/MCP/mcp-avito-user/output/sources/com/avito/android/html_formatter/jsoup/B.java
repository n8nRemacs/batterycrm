package com.avito.android.html_formatter.jsoup;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsoupHtmlCleaner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/jsoup/nodes/g;", "it", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<org.jsoup.nodes.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final B f164166l = new B();

    public B() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(org.jsoup.nodes.g gVar) {
        org.jsoup.nodes.g gVar2 = gVar;
        org.jsoup.parser.h hVar = gVar2.f421086d;
        if ((kotlin.jvm.internal.L.f(hVar.f421236c, "p") || kotlin.jvm.internal.L.f(hVar.f421236c, "li")) && gVar2.f0().length() == 0 && C30810h.b(gVar2) == null) {
            while (gVar2.f421088f.size() != 0) {
                gVar2.k(0).D();
            }
            gVar2.K(new org.jsoup.nodes.g("br"));
        }
        return G0.f406611a;
    }
}
