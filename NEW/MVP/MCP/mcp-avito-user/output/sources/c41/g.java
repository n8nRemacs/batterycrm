package c41;

import io.noties.markwon.B;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.j;
import io.noties.markwon.y;
import j.N;
import j.P;

/* compiled from: ListItemSpanFactory.java */
/* loaded from: classes8.dex */
public class g implements B {
    @Override // io.noties.markwon.B
    @P
    public final Object a(@N io.noties.markwon.g gVar, @N y yVar) {
        if (CoreProps.ListItemType.f401659b == CoreProps.f401652a.a(yVar)) {
            return new io.noties.markwon.core.spans.b(gVar.f401711a, CoreProps.f401653b.a(yVar).intValue());
        }
        return new j(gVar.f401711a, String.valueOf(CoreProps.f401654c.a(yVar)).concat(". "));
    }
}
