package kotlinx.datetime.internal.format;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FormatStructure.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {
    public static final void a(kotlin.collections.builders.b bVar, o oVar) {
        if (oVar instanceof C43373e) {
            bVar.add(((C43373e) oVar).f412519a);
            return;
        }
        if (oVar instanceof h) {
            Iterator it = ((h) oVar).f412524a.iterator();
            while (it.hasNext()) {
                a(bVar, (t) it.next());
            }
            return;
        }
        if (oVar instanceof j) {
            return;
        }
        if (oVar instanceof A) {
            a(bVar, ((A) oVar).f412497a);
            return;
        }
        if (!(oVar instanceof C43371c)) {
            if (oVar instanceof u) {
                a(bVar, ((u) oVar).f412606b);
            }
        } else {
            C43371c c43371c = (C43371c) oVar;
            a(bVar, c43371c.f412516a);
            Iterator it2 = c43371c.f412517b.iterator();
            while (it2.hasNext()) {
                a(bVar, (o) it2.next());
            }
        }
    }
}
