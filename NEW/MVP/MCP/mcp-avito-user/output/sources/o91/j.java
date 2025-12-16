package O91;

import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.vas_performance.ui.PerformanceVasFragment;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import com.avito.android.vas_performance.ui.stickers.buy.StickersBuyVasFragment;
import com.avito.android.vas_performance.ui.stickers.edit.StickersEditVasFragment;
import ru.cyberity.cbr.core.widget.CBRErrorBottomSheetView;
import w50.InterfaceC49447a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12049d;

    public /* synthetic */ j(int i12, Object obj, boolean z12) {
        this.f12047b = i12;
        this.f12048c = z12;
        this.f12049d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z12 = this.f12048c;
        Object obj = this.f12049d;
        switch (this.f12047b) {
            case 0:
                if (!z12) {
                    new ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l().show(((ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j) obj).getParentFragmentManager(), "AddressSelectBottomSheet");
                    break;
                }
                break;
            case 1:
                PerformanceVasFragment performanceVasFragment = (PerformanceVasFragment) obj;
                if (!z12) {
                    PerformanceVasFragment.a aVar = PerformanceVasFragment.f321384B0;
                    ActivityC22955m activityC22955mL1 = performanceVasFragment.l1();
                    if (activityC22955mL1 != null) {
                        activityC22955mL1.onBackPressed();
                        break;
                    }
                } else {
                    InterfaceC49447a interfaceC49447a = performanceVasFragment.f321396x0;
                    (interfaceC49447a != null ? interfaceC49447a : null).r1();
                    break;
                }
                break;
            case 2:
                CompetitiveVasFragment competitiveVasFragment = (CompetitiveVasFragment) obj;
                if (!z12) {
                    CompetitiveVasFragment.a aVar2 = CompetitiveVasFragment.f321463C0;
                    ActivityC22955m activityC22955mL12 = competitiveVasFragment.l1();
                    if (activityC22955mL12 != null) {
                        activityC22955mL12.onBackPressed();
                        break;
                    }
                } else {
                    InterfaceC49447a interfaceC49447a2 = competitiveVasFragment.f321464A0;
                    (interfaceC49447a2 != null ? interfaceC49447a2 : null).r1();
                    break;
                }
                break;
            case 3:
                StickersBuyVasFragment stickersBuyVasFragment = (StickersBuyVasFragment) obj;
                if (!z12) {
                    StickersBuyVasFragment.a aVar3 = StickersBuyVasFragment.f321919K0;
                    ActivityC22955m activityC22955mL13 = stickersBuyVasFragment.l1();
                    if (activityC22955mL13 != null) {
                        activityC22955mL13.onBackPressed();
                        break;
                    }
                } else {
                    InterfaceC49447a interfaceC49447a3 = stickersBuyVasFragment.f321927G0;
                    (interfaceC49447a3 != null ? interfaceC49447a3 : null).r1();
                    break;
                }
                break;
            case 4:
                StickersEditVasFragment stickersEditVasFragment = (StickersEditVasFragment) obj;
                if (!z12) {
                    StickersEditVasFragment.a aVar4 = StickersEditVasFragment.f322004B0;
                    ActivityC22955m activityC22955mL14 = stickersEditVasFragment.l1();
                    if (activityC22955mL14 != null) {
                        activityC22955mL14.onBackPressed();
                        break;
                    }
                } else {
                    InterfaceC49447a interfaceC49447a4 = stickersEditVasFragment.f322019z0;
                    (interfaceC49447a4 != null ? interfaceC49447a4 : null).r1();
                    break;
                }
                break;
            default:
                CBRErrorBottomSheetView.m291_set_dismissOnTouchOutside_$lambda0(z12, (CBRErrorBottomSheetView) obj, view);
                break;
        }
    }
}
