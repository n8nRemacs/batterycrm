package com.avito.android.profile_phones.landline_verification;

import android.widget.TextView;
import android.widget.ViewAnimator;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: LandlinePhoneVerificationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<LandlinePhoneVerificationViewModel.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationFragment f227223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment) {
        super(1);
        this.f227223l = landlinePhoneVerificationFragment;
    }

    @Override // Y41.l
    public final G0 invoke(LandlinePhoneVerificationViewModel.d dVar) {
        LandlinePhoneVerificationViewModel.d dVar2 = dVar;
        boolean zF2 = L.f(dVar2, LandlinePhoneVerificationViewModel.d.a.f227210a);
        LandlinePhoneVerificationFragment landlinePhoneVerificationFragment = this.f227223l;
        if (zF2) {
            LandlinePhoneVerificationFragment.q5(landlinePhoneVerificationFragment, true);
        } else if (dVar2 instanceof LandlinePhoneVerificationViewModel.d.b) {
            LandlinePhoneVerificationFragment.q5(landlinePhoneVerificationFragment, false);
            CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = landlinePhoneVerificationFragment.f227161n0;
            if (collapsingTitleAppBarLayout == null) {
                collapsingTitleAppBarLayout = null;
            }
            LandlinePhoneVerificationViewModel.d.b bVar = (LandlinePhoneVerificationViewModel.d.b) dVar2;
            collapsingTitleAppBarLayout.setTitle(bVar.f227212b);
            CollapsingTitleAppBarLayout collapsingTitleAppBarLayout2 = landlinePhoneVerificationFragment.f227161n0;
            if (collapsingTitleAppBarLayout2 == null) {
                collapsingTitleAppBarLayout2 = null;
            }
            collapsingTitleAppBarLayout2.setShortTitle(bVar.f227212b);
            TextView textView = landlinePhoneVerificationFragment.f227162o0;
            if (textView == null) {
                textView = null;
            }
            textView.setText(bVar.f227213c);
            TextView textView2 = landlinePhoneVerificationFragment.f227163p0;
            if (textView2 == null) {
                textView2 = null;
            }
            com.avito.android.util.text.a aVar = landlinePhoneVerificationFragment.f227171x0;
            if (aVar == null) {
                aVar = null;
            }
            textView2.setText(aVar.c(landlinePhoneVerificationFragment.requireContext(), bVar.f227214d));
            ViewAnimator viewAnimator = landlinePhoneVerificationFragment.f227167t0;
            (viewAnimator != null ? viewAnimator : null).setDisplayedChild(bVar.f227211a.f227190b);
        }
        return G0.f406611a;
    }
}
