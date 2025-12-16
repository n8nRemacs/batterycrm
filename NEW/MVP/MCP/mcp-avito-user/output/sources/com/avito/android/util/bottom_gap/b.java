package com.avito.android.util.bottom_gap;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.core.util.V;
import com.avito.android.util.bottom_gap.e;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: BottomGapCalculatorBottomOverlaysListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/bottom_gap/b;", "Lcom/avito/android/util/bottom_gap/e$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements e.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f318831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f318832b = new LinkedHashMap();

    public b(@k c cVar) {
        this.f318831a = cVar;
    }

    @Override // com.avito.android.util.bottom_gap.e.a
    public final void a(@k View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight != 0) {
            this.f318831a.b(new j((int) V.a(measuredHeight, view.getResources().getDisplayMetrics())));
        }
        a aVar = new a(this, 0);
        view.addOnLayoutChangeListener(aVar);
        this.f318832b.put(view, aVar);
    }

    @Override // com.avito.android.util.bottom_gap.e.a
    public final void b(@k View view) {
        View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f318832b.remove(view);
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }
}
