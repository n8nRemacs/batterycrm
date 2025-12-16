package io.noties.markwon.html;

import io.noties.markwon.html.f;
import io.noties.markwon.html.h;
import j.N;
import java.util.List;

/* compiled from: MarkwonHtmlRendererImpl.java */
/* loaded from: classes8.dex */
class l implements h.a<f.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.noties.markwon.n f401890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f401891b;

    public l(m mVar, io.noties.markwon.n nVar) {
        this.f401891b = mVar;
        this.f401890a = nVar;
    }

    public final void a(@N List<f.a> list) {
        for (f.a aVar : list) {
            if (aVar.isClosed()) {
                String strName = aVar.name();
                j jVar = this.f401891b;
                p pVarB = jVar.b(strName);
                if (pVarB != null) {
                    pVarB.a(this.f401890a, jVar, aVar);
                } else {
                    a(aVar.e());
                }
            }
        }
    }
}
