package com.avito.android.map.view;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SnackBars.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/map_core/utils/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.component.snackbar.d f185541l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.component.snackbar.d dVar) {
        super(0);
        this.f185541l = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ViewGroup.LayoutParams layoutParams = this.f185541l.f125236a.f357285i.getLayoutParams();
        CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
        if (gVar != null) {
            gVar.b(null);
        }
        return G0.f406611a;
    }
}
