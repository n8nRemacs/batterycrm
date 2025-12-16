package ha1;

import B91.z;
import android.content.res.Resources;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* renamed from: ha1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40904b implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397227b;

    public C40904b(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar) {
        this.f397227b = iVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
        t tVar = (t) obj;
        boolean z12 = tVar instanceof r;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397227b;
        if (z12) {
            String string = ((r) tVar).f397257a;
            kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.camera.i.f436493l0;
            z zVar = (z) iVar.f436376g0;
            if (zVar != null) {
                zVar.f1200c.setChecked(false);
                Ca1.w wVar = Ca1.w.f2278a;
                SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
                sdkBioPassportFrameView.setState(wVar);
                if (string == null) {
                    string = iVar.getString(R.string.sdk_bio_passport_upload_finish_message);
                }
                sdkBioPassportFrameView.b(string, "");
            }
        } else if (tVar instanceof s) {
            s sVar = (s) tVar;
            iVar.g5(sVar.f397258a, sVar.f397259b);
        } else if (tVar instanceof q) {
            iVar.h5((q) tVar);
        }
        return G0.f406611a;
    }
}
