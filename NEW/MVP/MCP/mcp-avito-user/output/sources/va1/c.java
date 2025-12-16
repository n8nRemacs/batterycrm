package va1;

import B91.C13112e;
import Ba1.AnimationAnimationListenerC13124b;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class c implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g f440846b;

    public c(ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar) {
        this.f440846b = gVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        j jVar = (j) obj;
        if (!(jVar instanceof h)) {
            boolean z12 = jVar instanceof g;
            ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g gVar = this.f440846b;
            if (z12) {
                C49291a c49291a = ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g.f436527i0;
                C13112e c13112e = (C13112e) gVar.f436376g0;
                if (c13112e != null) {
                    ProgressBar progressBar = c13112e.f1105b;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setFillAfter(true);
                    progressBar.startAnimation(alphaAnimation);
                    progressBar.setEnabled(true);
                    c13112e.f1107d.setText(gVar.getString(R.string.sdk_bio_selfie_upload_hint));
                }
            } else if (jVar instanceof i) {
                C49291a c49291a2 = ru.mts.biometry.sdk.feature.selfie.ui.uploadselfie.g.f436527i0;
                C13112e c13112e2 = (C13112e) gVar.f436376g0;
                if (c13112e2 != null) {
                    ProgressBar progressBar2 = c13112e2.f1105b;
                    H91.g.b(progressBar2);
                    b bVar = new b(c13112e2);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(200L);
                    alphaAnimation2.setFillAfter(true);
                    progressBar2.startAnimation(alphaAnimation2);
                    alphaAnimation2.setAnimationListener(new AnimationAnimationListenerC13124b(bVar));
                    c13112e2.f1107d.setText(gVar.getString(R.string.sdk_bio_selfie_upload_hint_success));
                }
            }
        }
        return G0.f406611a;
    }
}
