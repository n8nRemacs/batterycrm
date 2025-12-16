package ru.mts.biometry.sdk.feature.recognition.ui.camera;

import H91.g;
import R91.j;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.view.C22981N;
import com.avito.android.R;
import ha1.k;
import ha1.m;
import ha1.o;
import ha1.q;
import ha1.w;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import ru.mts.biometry.sdk.feature.document.ml.c;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/camera/p;", "Lru/mts/biometry/sdk/feature/recognition/ui/camera/i;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"SetTextI18n"})
/* loaded from: classes9.dex */
public final class p extends i {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f436498o0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public N0 f436499m0;

    /* renamed from: n0, reason: collision with root package name */
    public final InterfaceC42726C f436500n0 = C42727D.c(new k(this));

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void c() throws ExecutionException, InterruptedException {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            PreviewView previewView = zVar.f1204g;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (!previewView.isLaidOut() || previewView.isLayoutRequested()) {
                previewView.addOnLayoutChangeListener(new o(this, zVar));
            } else {
                e5().c(getViewLifecycleOwner(), previewView, j5());
                i5().b();
            }
        }
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i, ru.mts.biometry.sdk.base.b
    /* renamed from: f5 */
    public final void d5(B91.z zVar) {
        int i12;
        super.d5(zVar);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new m(this, null), 3);
        g.b(zVar.f1199b);
        i5();
        int iOrdinal = w.ke().ordinal();
        SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
        if (iOrdinal == 0) {
            i12 = R.drawable.sdk_bio_horizontal_frame;
        } else {
            if (iOrdinal != 1) {
                return;
            }
            sdkBioPassportFrameView.setFramePadding((int) getResources().getDimension(R.dimen.sdk_bio_passport_frame_padding));
            i12 = R.drawable.sdk_bio_passport_frame;
        }
        sdkBioPassportFrameView.setDrawable(i12);
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void h5(q qVar) {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            i5();
            String string = getString(w.ke() == c.f436445b ? R.string.sdk_bio_title_no_document_detected : R.string.sdk_bio_title_no_passport_detected);
            SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
            int i12 = SdkBioPassportFrameView.f436567e;
            sdkBioPassportFrameView.b(string, "");
            j5().f14152k = true;
            super.h5(qVar);
        }
    }

    public final j j5() {
        return (j) this.f436500n0.getValue();
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        j5().f14152k = false;
        super.onDestroyView();
    }
}
