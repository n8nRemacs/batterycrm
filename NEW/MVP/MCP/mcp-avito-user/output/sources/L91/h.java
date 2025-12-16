package L91;

import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* loaded from: classes9.dex */
public final class h implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9825b;

    public h(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar) {
        this.f9825b = nVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        SdkBioPassportFrameView sdkBioPassportFrameView;
        w wVar = (w) obj;
        if (!(wVar instanceof t)) {
            boolean z12 = wVar instanceof u;
            ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9825b;
            if (z12) {
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                B91.z zVar = (B91.z) nVar.f436376g0;
                if (zVar != null && (sdkBioPassportFrameView = zVar.f1203f) != null) {
                    sdkBioPassportFrameView.setState(Ca1.w.f2278a);
                    sdkBioPassportFrameView.b(nVar.getString(R.string.sdk_bio_passport_upload_finish_message), "");
                }
            } else if (wVar instanceof s) {
                kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                B91.z zVar2 = (B91.z) nVar.f436376g0;
                if (zVar2 != null) {
                    nVar.f5();
                    String string = nVar.getString(z.ke() == ru.mts.biometry.sdk.feature.document.ml.c.f436445b ? R.string.sdk_bio_title_no_document_detected : R.string.sdk_bio_title_no_passport_detected);
                    SdkBioPassportFrameView sdkBioPassportFrameView2 = zVar2.f1203f;
                    int i12 = SdkBioPassportFrameView.f436567e;
                    sdkBioPassportFrameView2.b(string, "");
                    sdkBioPassportFrameView2.setState(Ca1.u.f2276a);
                    sdkBioPassportFrameView2.setActive(false);
                    zVar2.f1204g.setVisibility(0);
                    AppCompatImageView appCompatImageView = zVar2.f1201d;
                    appCompatImageView.setVisibility(8);
                    appCompatImageView.setImageBitmap(null);
                    nVar.e5().f14152k = true;
                }
            } else if (wVar instanceof v) {
                Bitmap bitmap = ((v) wVar).f9850a;
                kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
                B91.z zVar3 = (B91.z) nVar.f436376g0;
                if (zVar3 != null) {
                    zVar3.f1206i.f436591b.f1185b.setVisibility(4);
                    zVar3.f1204g.setVisibility(8);
                    AppCompatImageView appCompatImageView2 = zVar3.f1201d;
                    appCompatImageView2.setVisibility(0);
                    appCompatImageView2.setImageBitmap(bitmap);
                    Ca1.v vVar = Ca1.v.f2277a;
                    SdkBioPassportFrameView sdkBioPassportFrameView3 = zVar3.f1203f;
                    sdkBioPassportFrameView3.setState(vVar);
                    sdkBioPassportFrameView3.b(nVar.getString(R.string.sdk_bio_passport_upload_progress_message), "");
                }
            }
        }
        return G0.f406611a;
    }
}
