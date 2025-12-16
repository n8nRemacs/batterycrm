package O91;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class a extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j f12034l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar) {
        super(1);
        this.f12034l = jVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayListB;
        M91.c cVar = (M91.c) obj;
        o oVar = (o) this.f12034l.f436437i0.getValue();
        Z1 z12 = oVar.f12062K;
        do {
            value = z12.getValue();
            List<M91.c> list = (List) value;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (M91.c cVar2 : list) {
                arrayList.add(new M91.c(cVar2.f10435a, cVar2.f10436b, L.f(cVar2, cVar)));
            }
        } while (!z12.N3(value, arrayList));
        Z1 z13 = oVar.f12065N;
        do {
            value2 = z13.getValue();
            for (M91.b bVar : (List) value2) {
                if (bVar.f10434c) {
                    oVar.f12060E.getClass();
                    arrayListB = M91.a.b(cVar.f10435a, bVar);
                    oVar.f12064M = arrayListB;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!z13.N3(value2, arrayListB));
        return G0.f406611a;
    }
}
