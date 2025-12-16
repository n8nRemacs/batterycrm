package da1;

import B91.F;
import L91.s;
import L91.t;
import L91.u;
import L91.v;
import L91.w;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* renamed from: da1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39695g implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393921b;

    public C39695g(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        this.f393921b = mVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        w wVar = (w) obj;
        boolean z12 = wVar instanceof u;
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393921b;
        if (z12) {
            C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
            F f12 = (F) mVar.f436376g0;
            if (f12 != null) {
                Ca1.w wVar2 = Ca1.w.f2278a;
                SdkBioPassportFrameView sdkBioPassportFrameView = f12.f1030c;
                sdkBioPassportFrameView.setState(wVar2);
                sdkBioPassportFrameView.b(mVar.getString(R.string.sdk_bio_passport_upload_finish_message), "");
            }
        } else if (wVar instanceof t) {
            mVar.f436492l0.b("android.permission.CAMERA");
        } else if (wVar instanceof s) {
            C39689a c39689a2 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
            F f13 = (F) mVar.f436376g0;
            if (f13 != null) {
                ru.mts.biometry.sdk.feature.passport.ui.camera.m.e5(mVar, f13);
            }
        } else if (wVar instanceof v) {
            C39689a c39689a3 = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
            F f14 = (F) mVar.f436376g0;
            if (f14 != null) {
                Bitmap bitmap = ((v) wVar).f9850a;
                mVar.f5().f20965j = false;
                f14.f1031d.setVisibility(8);
                AppCompatImageView appCompatImageView = f14.f1029b;
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageBitmap(bitmap);
                f14.f1032e.f436591b.f1185b.setVisibility(4);
                Ca1.v vVar = Ca1.v.f2277a;
                SdkBioPassportFrameView sdkBioPassportFrameView2 = f14.f1030c;
                sdkBioPassportFrameView2.setState(vVar);
                sdkBioPassportFrameView2.b(mVar.getString(R.string.sdk_bio_passport_upload_progress_message), "");
            }
        }
        return G0.f406611a;
    }
}
