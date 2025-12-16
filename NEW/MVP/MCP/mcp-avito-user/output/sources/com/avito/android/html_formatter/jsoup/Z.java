package com.avito.android.html_formatter.jsoup;

import hJ.m;
import hJ.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JsoupSupportsReplaceHtmlNode.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/Z;", "LhJ/s;", "LhJ/p;", "LhJ/r;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z implements hJ.s, hJ.p, hJ.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f164202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f164203b;

    public Z(@Y61.k org.jsoup.nodes.k kVar) {
        this.f164202a = new M(kVar);
        this.f164203b = new Y(kVar);
    }

    @Override // hJ.s
    @Y61.l
    public final m.a a(int i12, int i13, @Y61.k List<hJ.l> list) {
        hJ.r rVar;
        hJ.m mVar;
        p.b bVar = new p.b(new ArrayList(), new LinkedHashMap());
        m.a aVarB = this.f164202a.b(i12, i13, bVar);
        if (aVarB == null || (rVar = aVarB.f397167a) == null) {
            rVar = this;
        }
        for (hJ.l lVar : list) {
            m.a aVarJ = rVar.j(lVar.f397165a, lVar.f397166b);
            if (aVarJ != null && (mVar = aVarJ.f397167a) != null) {
                rVar = mVar;
            }
            if (aVarB == null) {
                aVarB = null;
            } else if (aVarJ != null) {
                aVarB = new m.a(aVarJ.f397167a, aVarB.f397168b + aVarJ.f397168b);
            }
        }
        for (org.jsoup.nodes.k kVar : bVar.f397172a) {
            boolean z12 = ((kVar instanceof org.jsoup.nodes.g) && ((org.jsoup.nodes.g) kVar).f0().length() == 0) || ((kVar instanceof org.jsoup.nodes.n) && ((org.jsoup.nodes.n) kVar).M().length() == 0);
            if (kVar.f421096b != null && z12) {
                kVar.D();
            }
        }
        return aVarB;
    }

    @Override // hJ.p
    @Y61.l
    public final m.a b(int i12, int i13, @Y61.l p.b bVar) {
        throw null;
    }

    @Override // hJ.r
    @Y61.l
    public final m.a j(int i12, @Y61.k String str) {
        return this.f164203b.j(i12, str);
    }
}
