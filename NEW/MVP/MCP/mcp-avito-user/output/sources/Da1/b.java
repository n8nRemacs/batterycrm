package Da1;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.h;
import java.util.Map;
import kotlin.jvm.internal.l0;
import ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3246c;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f3244a = i12;
        this.f3245b = obj;
        this.f3246c = obj2;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f3244a) {
            case 0:
                BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B((FrameLayout) ((h) this.f3245b).findViewById(R.id.design_bottom_sheet));
                bottomSheetBehaviorB.b(3);
                bottomSheetBehaviorB.v(new a(bottomSheetBehaviorB, (l0.e) this.f3246c));
                break;
            case 1:
                h hVar = (h) this.f3245b;
                hVar.s().N((int) (((l) this.f3246c).getResources().getDisplayMetrics().heightPixels * 0.9d), false);
                hVar.s().b(3);
                break;
            case 2:
                String str = (String) this.f3246c;
                if (str == null) {
                    str = "";
                }
                ((com.avito.android.comfortable_deal.deal.g) this.f3245b).f121077d.e(str);
                break;
            case 3:
                ((com.avito.android.service_booking_settings.work_hours.h) this.f3245b).f277936b.accept(new a.h(((Ut0.g) this.f3246c).f16734e));
                break;
            default:
                ru.cyberity.cbr.presentation.screen.verification.a.b((ru.cyberity.cbr.presentation.screen.verification.a) this.f3245b, (Map) this.f3246c, dialogInterface);
                break;
        }
    }
}
