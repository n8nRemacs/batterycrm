package io.noties.markwon.html;

import io.noties.markwon.html.f;
import io.noties.markwon.html.g;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MarkwonHtmlRendererImpl.java */
/* loaded from: classes8.dex */
class m extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, p> f401892a;

    /* compiled from: MarkwonHtmlRendererImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f401893a = new HashMap(2);

        /* renamed from: b, reason: collision with root package name */
        public boolean f401894b;

        public final void a(@N p pVar) {
            for (String str : pVar.b()) {
                HashMap map = this.f401893a;
                if (!map.containsKey(str)) {
                    map.put(str, pVar);
                }
            }
        }
    }

    public m(@N Map map) {
        this.f401892a = map;
    }

    @Override // io.noties.markwon.html.j
    public final void a(@N io.noties.markwon.n nVar, @N i iVar) {
        k kVar = new k(this, nVar);
        ArrayList arrayList = iVar.f401750c;
        if (arrayList.size() > 0) {
            kVar.a(Collections.unmodifiableList(arrayList));
            arrayList.clear();
        } else {
            kVar.a(Collections.emptyList());
        }
        l lVar = new l(this, nVar);
        g.a aVar = iVar.f401751d;
        while (true) {
            g.a aVar2 = aVar.f401743e;
            if (aVar2 == null) {
                break;
            } else {
                aVar = aVar2;
            }
        }
        List<f.a> listE = aVar.e();
        if (listE.size() > 0) {
            lVar.a(listE);
        } else {
            lVar.a(Collections.emptyList());
        }
        iVar.f401751d = new g.a("", 0, Collections.emptyMap(), null);
        iVar.b();
    }

    @Override // io.noties.markwon.html.j
    @P
    public final p b(@N String str) {
        return this.f401892a.get(str);
    }
}
