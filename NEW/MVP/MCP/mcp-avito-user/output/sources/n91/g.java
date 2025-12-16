package N91;

import B91.x;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class g implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l f11271b;

    public g(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar) {
        this.f11271b = lVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar = this.f11271b;
        x xVar = lVar.f436431g0;
        if (xVar == null) {
            xVar = null;
        }
        xVar.f1193e.setVisibility(list.isEmpty() ? 0 : 8);
        lVar.f436432h0.m(C42745f0.B0(list, new f()));
        return G0.f406611a;
    }
}
