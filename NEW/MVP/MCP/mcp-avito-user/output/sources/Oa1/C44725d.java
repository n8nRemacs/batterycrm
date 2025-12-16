package oa1;

import B91.K;
import Ca1.u;
import Ca1.v;
import Ca1.w;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

/* renamed from: oa1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44725d implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.camera.h f419914b;

    public C44725d(ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar) {
        this.f419914b = hVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC44733l abstractC44733l = (AbstractC44733l) obj;
        boolean z12 = abstractC44733l instanceof C44731j;
        ru.mts.biometry.sdk.feature.registration.ui.camera.h hVar = this.f419914b;
        if (z12) {
            kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
            K k12 = (K) hVar.f436376g0;
            if (k12 != null) {
                k12.f1073b.setEnabled(true);
                k12.f1076e.setVisibility(0);
                k12.f1074c.setVisibility(8);
                SdkBioPassportFrameView sdkBioPassportFrameView = k12.f1075d;
                String string = hVar.getString(R.string.sdk_bio_registration_hint);
                int i12 = SdkBioPassportFrameView.f436567e;
                sdkBioPassportFrameView.b(string, "");
                sdkBioPassportFrameView.setState(u.f2276a);
            }
        } else if (abstractC44733l instanceof C44730i) {
            kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
            K k13 = (K) hVar.f436376g0;
            if (k13 != null) {
                k13.f1073b.setEnabled(false);
                k13.f1076e.setVisibility(8);
                SdkBioPassportFrameView sdkBioPassportFrameView2 = k13.f1075d;
                String string2 = hVar.getString(R.string.sdk_bio_passport_upload_finish_message);
                int i13 = SdkBioPassportFrameView.f436567e;
                sdkBioPassportFrameView2.b(string2, "");
                sdkBioPassportFrameView2.setState(w.f2278a);
            }
        } else if (abstractC44733l instanceof C44732k) {
            kotlin.reflect.n[] nVarArr3 = ru.mts.biometry.sdk.feature.registration.ui.camera.h.f436507m0;
            K k14 = (K) hVar.f436376g0;
            if (k14 != null) {
                Bitmap bitmap = ((C44732k) abstractC44733l).f419924a;
                k14.f1077f.f436591b.f1185b.setVisibility(4);
                k14.f1073b.setEnabled(false);
                k14.f1076e.setVisibility(8);
                AppCompatImageView appCompatImageView = k14.f1074c;
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageBitmap(bitmap);
                SdkBioPassportFrameView sdkBioPassportFrameView3 = k14.f1075d;
                String string3 = hVar.getString(R.string.sdk_bio_registration_upload_progress_message);
                int i14 = SdkBioPassportFrameView.f436567e;
                sdkBioPassportFrameView3.b(string3, "");
                sdkBioPassportFrameView3.setState(v.f2277a);
            }
        }
        return G0.f406611a;
    }
}
