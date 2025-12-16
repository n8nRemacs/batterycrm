package io.noties.markwon.html;

import io.noties.markwon.html.f;
import io.noties.markwon.html.h;
import j.N;
import java.util.List;

/* compiled from: MarkwonHtmlRendererImpl.java */
/* loaded from: classes8.dex */
class k implements h.a<f.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.noties.markwon.n f401888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f401889b;

    public k(m mVar, io.noties.markwon.n nVar) {
        this.f401889b = mVar;
        this.f401888a = nVar;
    }

    public final void a(@N List<f.b> list) {
        for (f.b bVar : list) {
            if (bVar.isClosed()) {
                String strName = bVar.name();
                j jVar = this.f401889b;
                p pVarB = jVar.b(strName);
                if (pVarB != null) {
                    pVarB.a(this.f401888a, jVar, bVar);
                }
            }
        }
    }
}
