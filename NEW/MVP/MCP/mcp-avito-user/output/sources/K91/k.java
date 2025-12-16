package K91;

import B91.C13119l;
import android.content.res.Resources;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioButton;

/* loaded from: classes9.dex */
public final class k implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9317b;

    public k(ru.mts.biometry.sdk.feature.address.ui.o oVar) {
        this.f9317b = oVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
        SdkBioButton sdkBioButton;
        x xVar = (x) obj;
        boolean z12 = xVar instanceof s;
        ru.mts.biometry.sdk.feature.address.ui.o oVar = this.f9317b;
        if (z12) {
            C13119l c13119l = (C13119l) oVar.f436376g0;
            SdkBioButton sdkBioButton2 = c13119l != null ? c13119l.f1145d : null;
            if (sdkBioButton2 != null) {
                sdkBioButton2.setEnabled(false);
            }
            C13119l c13119l2 = (C13119l) oVar.f436376g0;
            if (c13119l2 != null) {
                sdkBioButton = c13119l2.f1145d;
                sdkBioButton.disableLoader();
            }
        } else if (!(xVar instanceof u)) {
            if (xVar instanceof w) {
                C13119l c13119l3 = (C13119l) oVar.f436376g0;
                SdkBioButton sdkBioButton3 = c13119l3 != null ? c13119l3.f1145d : null;
                if (sdkBioButton3 != null) {
                    sdkBioButton3.setEnabled(true);
                }
                C13119l c13119l4 = (C13119l) oVar.f436376g0;
                if (c13119l4 != null) {
                    sdkBioButton = c13119l4.f1145d;
                    sdkBioButton.disableLoader();
                }
            } else if (xVar instanceof v) {
                C13119l c13119l5 = (C13119l) oVar.f436376g0;
                if (c13119l5 != null) {
                    c13119l5.f1145d.enableLoader();
                }
            } else if (xVar instanceof t) {
                W91.h hVar = oVar.f436422h0;
                (hVar != null ? hVar : null).c(new W91.e(Ba1.y.b(((t) xVar).f9327a), "ERROR_SCREEN"));
            }
        }
        return G0.f406611a;
    }
}
