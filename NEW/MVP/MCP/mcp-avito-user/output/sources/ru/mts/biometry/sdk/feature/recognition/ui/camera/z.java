package ru.mts.biometry.sdk.feature.recognition.ui.camera;

import Ba1.o;
import Ca1.d;
import H91.g;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import e11.ViewOnClickListenerC39879j1;
import ha1.q;
import ha1.x;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.SdkBioPassportFrameView;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/camera/z;", "Lru/mts/biometry/sdk/feature/recognition/ui/camera/i;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class z extends i {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f436501m0 = 0;

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void c() throws ExecutionException, InterruptedException {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            PreviewView previewView = zVar.f1204g;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (!previewView.isLaidOut() || previewView.isLayoutRequested()) {
                previewView.addOnLayoutChangeListener(new x(this, zVar));
            } else {
                e5().c(getViewLifecycleOwner(), previewView, null);
                i5().b();
            }
        }
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void d() {
        B91.z zVar = (B91.z) this.f436376g0;
        SwitchCompat switchCompat = zVar != null ? zVar.f1200c : null;
        if (switchCompat != null) {
            switchCompat.setClickable(false);
        }
        super.d();
        o oVarE5 = e5();
        androidx.camera.lifecycle.i iVar = oVarE5.f1519g;
        if (iVar != null) {
            iVar.d(oVarE5.f1515c);
            G0 g02 = G0.f406611a;
        }
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i, ru.mts.biometry.sdk.base.b
    /* renamed from: f5 */
    public final void d5(B91.z zVar) {
        g.c(zVar.f1205h);
        d.a(new ViewOnClickListenerC39879j1(this, 6), zVar.f1200c);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        ConstraintLayout constraintLayout = zVar.f1202e;
        dVar.g(constraintLayout);
        SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
        dVar.i(sdkBioPassportFrameView.getId(), 3, zVar.f1206i.getId(), 4);
        dVar.i(sdkBioPassportFrameView.getId(), 6, 0, 6);
        dVar.i(sdkBioPassportFrameView.getId(), 7, 0, 7);
        int id2 = sdkBioPassportFrameView.getId();
        FrameLayout frameLayout = zVar.f1199b;
        dVar.i(id2, 4, frameLayout.getId(), 3);
        dVar.c(constraintLayout);
        super.d5(zVar);
        g.c(frameLayout);
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void g5(Bitmap bitmap, String str) throws Resources.NotFoundException {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            super.g5(bitmap, str);
            zVar.f1200c.setChecked(false);
        }
    }

    @Override // ru.mts.biometry.sdk.feature.recognition.ui.camera.i
    public final void h5(q qVar) throws Resources.NotFoundException {
        B91.z zVar = (B91.z) this.f436376g0;
        if (zVar != null) {
            float f12 = qVar.f397253a;
            SdkBioPassportFrameView sdkBioPassportFrameView = zVar.f1203f;
            sdkBioPassportFrameView.setRatio(f12);
            String string = qVar.f397255c;
            if (string == null) {
                string = getString(R.string.sdk_bio_title_no_document_detected);
            }
            sdkBioPassportFrameView.b(string, qVar.f397256d);
            SwitchCompat switchCompat = zVar.f1200c;
            switchCompat.setClickable(true);
            switchCompat.setChecked(false);
            super.h5(qVar);
        }
    }
}
