package K91;

import B91.C13114g;
import B91.C13119l;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class i implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9314b;

    public i(ru.mts.biometry.sdk.feature.address.ui.o oVar) {
        this.f9314b = oVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        r rVar = (r) obj;
        C13119l c13119l = (C13119l) this.f9314b.f436376g0;
        if (c13119l != null && (rVar instanceof q)) {
            H91.g.c(c13119l.f1144c);
            C13114g c13114g = c13119l.f1143b;
            H91.g.c(c13114g.f1114a);
            I91.d dVar = ((q) rVar).f9325a;
            if (dVar != null) {
                c13114g.f1115b.setText(dVar.f8028a);
                c13119l.f1145d.setEnabled(true);
            }
        }
        return G0.f406611a;
    }
}
