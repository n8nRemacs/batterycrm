package com.avito.android.vas_performance.ui.visual_legacy;

import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<com.avito.android.vas_performance.ui.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualVasFragment f322110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VisualVasFragment visualVasFragment) {
        super(1);
        this.f322110l = visualVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.vas_performance.ui.a aVar) {
        int i12;
        com.avito.android.vas_performance.ui.a aVar2 = aVar;
        if (aVar2 != null) {
            VisualVasFragment visualVasFragment = this.f322110l;
            Button button = visualVasFragment.f322094y0;
            if (button == null) {
                button = null;
            }
            Object tag = button.getTag();
            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
            boolean z12 = aVar2.f321404b;
            if (!L.f(bool, Boolean.valueOf(z12))) {
                if (z12) {
                    i12 = R.attr.buttonPrimaryLarge;
                } else {
                    if (z12) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.buttonSecondaryLarge;
                }
                Button button2 = visualVasFragment.f322094y0;
                if (button2 == null) {
                    button2 = null;
                }
                button2.setAppearanceFromAttr(i12);
            }
            Button button3 = visualVasFragment.f322094y0;
            com.avito.android.lib.design.button.b.a(button3 != null ? button3 : null, aVar2.f321403a, false);
        }
        return G0.f406611a;
    }
}
