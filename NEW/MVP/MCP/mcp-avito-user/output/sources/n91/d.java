package N91;

import B91.x;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l f11269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar) {
        super(1);
        this.f11269l = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        M91.b bVar = (M91.b) obj;
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar = this.f11269l;
        x xVar = lVar.f436431g0;
        if (xVar == null) {
            xVar = null;
        }
        xVar.f1191c.setText("");
        x xVar2 = lVar.f436431g0;
        (xVar2 != null ? xVar2 : null).f1191c.clearFocus();
        O91.o oVar = (O91.o) lVar.f436433i0.getValue();
        ?? r22 = oVar.f12064M;
        ArrayList arrayList = new ArrayList(C42745f0.q(r22, 10));
        for (M91.b bVar2 : r22) {
            arrayList.add(new M91.b(bVar2.f10432a, bVar2.f10433b, L.f(bVar2, bVar)));
        }
        oVar.f12064M = arrayList;
        oVar.f12065N.setValue(arrayList);
        lVar.dismiss();
        return G0.f406611a;
    }
}
