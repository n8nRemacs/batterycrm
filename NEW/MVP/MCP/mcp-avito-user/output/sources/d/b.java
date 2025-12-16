package D;

import B91.C13108a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.E;
import androidx.camera.camera2.internal.C20026p;
import androidx.camera.camera2.internal.RunnableC20012i;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.audio.h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import com.adjust.sdk.ActivityHandler;
import com.avito.android.R;
import com.avito.android.advert.item.I1;
import com.avito.android.bottom_navigation.C28895q;
import com.avito.android.component.advert_contact_bar.C29563j;
import com.avito.android.component.advert_contact_bar.J;
import com.avito.android.lib.design.radio.RadioButton;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.avito.android.util.D6;
import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;
import com.my.tracker.MyTracker;
import com.yandex.mobile.ads.impl.fj1;
import com.yandex.mobile.ads.impl.pc;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import ru.mts.biometry.sdk.view.SdkBioSelfieFrame;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2825d;

    public /* synthetic */ b(int i12, Object obj, boolean z12) {
        this.f2823b = i12;
        this.f2825d = obj;
        this.f2824c = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z12 = this.f2824c;
        Object obj = this.f2825d;
        switch (this.f2823b) {
            case 0:
                e eVar = (e) obj;
                if (eVar.f2830a != z12) {
                    eVar.f2830a = z12;
                    if (!z12) {
                        b.a<Void> aVar = eVar.f2836g;
                        if (aVar != null) {
                            aVar.d(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                            eVar.f2836g = null;
                            break;
                        }
                    } else if (eVar.f2831b) {
                        C20026p c20026p = eVar.f2832c;
                        c20026p.getClass();
                        c20026p.f23389c.execute(new RunnableC20012i(c20026p, 1));
                        eVar.f2831b = false;
                        break;
                    }
                }
                break;
            case 1:
                h.a aVar2 = (h.a) obj;
                aVar2.getClass();
                int i12 = M.f47887a;
                aVar2.f48896b.onSkipSilenceEnabledChanged(z12);
                break;
            case 2:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$0(z12);
                break;
            case 3:
                ((I1) obj).R(z12, false);
                break;
            case 4:
                int i13 = C28895q.f107050f;
                ((C28895q) obj).f107051b.setVisibility(z12 ? 0 : 8);
                break;
            case 5:
                ((C29563j) obj).f125180a.setVisibility(z12 ? 8 : 0);
                break;
            case 6:
                D6.G(((J) obj).f125138a, true ^ z12);
                break;
            case 7:
                int i14 = com.avito.android.lib.design.picker.i.f180016t;
                com.avito.android.lib.design.picker.i iVar = (com.avito.android.lib.design.picker.i) obj;
                iVar.f();
                iVar.e(z12);
                break;
            case 8:
                int i15 = RadioButton.f180117l;
                ((E) obj).setChecked(z12);
                break;
            case 9:
                com.avito.android.lib.design.tooltip.f fVar = (com.avito.android.lib.design.tooltip.f) obj;
                k kVar = fVar.f181206j;
                if (kVar != null) {
                    RecyclerView recyclerView = fVar.f181197a;
                    View view = fVar.f181198b;
                    if (fVar.a(view, recyclerView) && !(recyclerView.getScrollState() != 0)) {
                        kVar.f(view);
                        if (z12) {
                            com.avito.android.lib.design.tooltip.e eVar2 = new com.avito.android.lib.design.tooltip.e(fVar, kVar, z12);
                            recyclerView.o(eVar2);
                            fVar.f181204h = eVar2;
                        }
                    } else {
                        com.avito.android.lib.design.tooltip.d dVar = new com.avito.android.lib.design.tooltip.d(fVar, kVar, z12);
                        recyclerView.o(dVar);
                        fVar.f181203g = dVar;
                    }
                }
                fVar.f181207k = null;
                break;
            case 10:
                D6.G(((com.avito.android.mortgage.landing.list.items.expandable_block.g) obj).f199709c, z12);
                break;
            case 11:
                D6.G(((com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.h) obj).f202052c, z12);
                break;
            case 12:
                LegacyPhotoGalleryActivity.a aVar3 = LegacyPhotoGalleryActivity.f216531m0;
                ((View) obj).setVisibility(z12 ? 8 : 0);
                break;
            case 13:
                i.a aVar4 = (i.a) obj;
                aVar4.getClass();
                int i16 = U.f348106a;
                aVar4.f343997b.onSkipSilenceEnabledChanged(z12);
                break;
            case 14:
                ((MyTracker.FlushListener) obj).onResult(z12);
                break;
            case 15:
                fj1.b((ViewGroup) obj, z12);
                break;
            case 16:
                ((pc.a) obj).a(z12);
                break;
            default:
                ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar2 = (ru.mts.biometry.sdk.feature.selfie.ui.camera.i) obj;
                C13108a c13108a = (C13108a) iVar2.f436376g0;
                if (c13108a != null) {
                    SdkBioSelfieFrame sdkBioSelfieFrame = c13108a.f1089c;
                    sdkBioSelfieFrame.setActive(z12);
                    if (!z12) {
                        sdkBioSelfieFrame.setText(iVar2.getString(R.string.sdk_bio_selfie_face_out_of_frame));
                        N0 n02 = iVar2.f436524k0;
                        if (n02 != null) {
                            ((V0) n02).c(null);
                        }
                        iVar2.f436524k0 = null;
                        break;
                    } else if (iVar2.f436524k0 == null) {
                        iVar2.f436524k0 = C43259k.d(C22981N.a(iVar2.getLifecycle()), null, null, new ta1.h(c13108a, iVar2, null), 3);
                        break;
                    }
                }
                break;
        }
    }
}
