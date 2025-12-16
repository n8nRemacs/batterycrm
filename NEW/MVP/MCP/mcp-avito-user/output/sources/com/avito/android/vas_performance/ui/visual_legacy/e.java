package com.avito.android.vas_performance.ui.visual_legacy;

import com.avito.android.lib.design.button.Button;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<P2<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualVasFragment f322109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VisualVasFragment visualVasFragment) {
        super(1);
        this.f322109l = visualVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(P2<?> p22) {
        P2<?> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        VisualVasFragment visualVasFragment = this.f322109l;
        if (z12) {
            Button button = visualVasFragment.f322094y0;
            (button != null ? button : null).setLoading(true);
        } else if (p23 instanceof P2.b) {
            Button button2 = visualVasFragment.f322094y0;
            (button2 != null ? button2 : null).setLoading(false);
        } else if (p23 instanceof P2.a) {
            com.avito.android.progress_overlay.l lVar = visualVasFragment.f322095z0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.a("");
            Button button3 = visualVasFragment.f322094y0;
            (button3 != null ? button3 : null).setLoading(false);
        }
        return G0.f406611a;
    }
}
