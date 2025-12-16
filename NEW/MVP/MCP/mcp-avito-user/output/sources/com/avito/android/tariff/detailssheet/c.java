package com.avito.android.tariff.detailssheet;

import Y41.l;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffDetailsSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/tariff/detailssheet/vm/d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<P2<? super com.avito.android.tariff.detailssheet.vm.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffDetailsSheetDialogFragment f297404l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment) {
        super(1);
        this.f297404l = tariffDetailsSheetDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super com.avito.android.tariff.detailssheet.vm.d> p22) {
        P2<? super com.avito.android.tariff.detailssheet.vm.d> p23 = p22;
        boolean z12 = p23 instanceof P2.b;
        TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment = this.f297404l;
        if (z12) {
            P2.b bVar = (P2.b) p23;
            ViewGroup viewGroup = tariffDetailsSheetDialogFragment.f297399k0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            D6.w(viewGroup);
            com.avito.android.progress_overlay.l lVar = tariffDetailsSheetDialogFragment.f297400l0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.j();
            Button button = tariffDetailsSheetDialogFragment.f297401m0;
            if (button == null) {
                button = null;
            }
            String str = ((com.avito.android.tariff.detailssheet.vm.d) bVar.f318720a).f297436b;
            if (str == null) {
                str = "";
            }
            com.avito.android.lib.design.button.b.a(button, str, false);
            TextView textView = tariffDetailsSheetDialogFragment.f297398j0;
            if (textView == null) {
                textView = null;
            }
            com.avito.android.util.text.a aVar = tariffDetailsSheetDialogFragment.f297397i0;
            I5.a(textView, (aVar != null ? aVar : null).c(tariffDetailsSheetDialogFragment.requireContext(), ((com.avito.android.tariff.detailssheet.vm.d) bVar.f318720a).f297435a), false);
        } else if (p23 instanceof P2.a) {
            P2.a aVar2 = (P2.a) p23;
            ViewGroup viewGroup2 = tariffDetailsSheetDialogFragment.f297399k0;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            D6.H(viewGroup2);
            com.avito.android.progress_overlay.l lVar2 = tariffDetailsSheetDialogFragment.f297400l0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.a(z.k(aVar2.f318719a));
            Button button2 = tariffDetailsSheetDialogFragment.f297401m0;
            D6.w(button2 != null ? button2 : null);
        } else if (p23 instanceof P2.c) {
            ViewGroup viewGroup3 = tariffDetailsSheetDialogFragment.f297399k0;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            D6.H(viewGroup3);
            com.avito.android.progress_overlay.l lVar3 = tariffDetailsSheetDialogFragment.f297400l0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.k(null);
            Button button3 = tariffDetailsSheetDialogFragment.f297401m0;
            D6.w(button3 != null ? button3 : null);
        }
        return G0.f406611a;
    }
}
