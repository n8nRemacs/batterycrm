package curtains;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Windows.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "decorView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class o extends N implements Y41.l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        curtains.internal.d.f393004d.getClass();
        view2.getViewTreeObserver().addOnDrawListener(new curtains.internal.d(view2));
        return G0.f406611a;
    }
}
