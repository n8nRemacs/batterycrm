package com.avito.android.bundles.ui.recycler.item.bundle;

import android.view.GestureDetector;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasBundleItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/bundle/i;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f108415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f108416c;

    public i(j jVar, Y41.a<G0> aVar) {
        this.f108415b = jVar;
        this.f108416c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(@Y61.k android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.avito.android.bundles.ui.recycler.item.bundle.j r0 = r5.f108415b
            androidx.recyclerview.widget.RecyclerView r1 = r0.f108424h
            float r2 = r6.getX()
            float r3 = r6.getY()
            r0.getClass()
            int r4 = r1.getLeft()
            float r4 = (float) r4
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L58
            int r4 = r1.getTop()
            float r4 = (float) r4
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L58
            int r4 = r1.getRight()
            float r4 = (float) r4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            int r1 = r1.getBottom()
            float r1 = (float) r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L58
            float r1 = r6.getX()
            androidx.recyclerview.widget.RecyclerView r2 = r0.f108424h
            int r2 = r2.getLeft()
            float r2 = (float) r2
            float r1 = r1 - r2
            float r6 = r6.getY()
            androidx.recyclerview.widget.RecyclerView r2 = r0.f108424h
            int r2 = r2.getTop()
            float r2 = (float) r2
            float r6 = r6 - r2
            androidx.recyclerview.widget.RecyclerView r0 = r0.f108424h
            android.view.View r6 = r0.J(r1, r6)
            if (r6 == 0) goto L58
            boolean r6 = r6.performClick()
            goto L59
        L58:
            r6 = 0
        L59:
            if (r6 != 0) goto L60
            Y41.a<kotlin.G0> r6 = r5.f108416c
            r6.invoke()
        L60:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bundles.ui.recycler.item.bundle.i.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
