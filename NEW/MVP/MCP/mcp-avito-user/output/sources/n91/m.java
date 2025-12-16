package N91;

import B91.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class m extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u f11280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar) {
        super(1);
        this.f11280l = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Iterable, java.lang.Object] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        M91.b bVar = (M91.b) obj;
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar = this.f11280l;
        v vVar = (v) uVar.f436376g0;
        SdkBioEditText sdkBioEditText = vVar != null ? vVar.f1179b : null;
        if (sdkBioEditText != null) {
            sdkBioEditText.setText("");
        }
        v vVar2 = (v) uVar.f436376g0;
        if (vVar2 != null) {
            vVar2.f1179b.clearFocus();
        }
        O91.o oVar = (O91.o) uVar.f436435i0.getValue();
        ?? r12 = oVar.f12064M;
        ArrayList arrayList = new ArrayList(C42745f0.q(r12, 10));
        for (M91.b bVar2 : r12) {
            arrayList.add(new M91.b(bVar2.f10432a, bVar2.f10433b, L.f(bVar2, bVar)));
        }
        oVar.f12064M = arrayList;
        oVar.f12065N.setValue(arrayList);
        return G0.f406611a;
    }
}
