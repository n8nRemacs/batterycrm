package pa1;

import com.google.android.material.snackbar.Snackbar;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class e implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.gallery.g f428609b;

    public e(ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar) {
        this.f428609b = gVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        j jVar = (j) obj;
        boolean z12 = jVar instanceof i;
        ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar = this.f428609b;
        if (z12) {
            Snackbar snackbar = gVar.f436518k0;
            if (snackbar != null) {
                snackbar.l();
            }
            ru.mts.biometry.sdk.view.modalcard.f fVar = (ru.mts.biometry.sdk.view.modalcard.f) gVar.f436519l0.getValue();
            if (fVar.isVisible()) {
                fVar.dismiss();
            }
        } else if (jVar instanceof h) {
            Snackbar snackbar2 = gVar.f436518k0;
            if (snackbar2 != null && snackbar2.i()) {
                snackbar2.b(3);
            }
            ((ru.mts.biometry.sdk.view.modalcard.f) gVar.f436519l0.getValue()).show(gVar.getChildFragmentManager(), "ru.mts.biometry.sdk.view.modalcard.d");
        }
        return G0.f406611a;
    }
}
