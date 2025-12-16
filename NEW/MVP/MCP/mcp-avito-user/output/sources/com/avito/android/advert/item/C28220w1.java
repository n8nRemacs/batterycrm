package com.avito.android.advert.item;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/w1;", "Landroidx/recyclerview/widget/z;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.w1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28220w1 extends C23434z {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Integer f80710p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public View f80711q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f80712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f80713s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f80714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28220w1(Y41.a aVar, RecyclerView.Adapter adapter, int i12, boolean z12, Context context) {
        int itemCount;
        super(context);
        this.f80712r = (kotlin.jvm.internal.N) aVar;
        this.f80713s = i12;
        this.f80714t = z12;
        kotlin.Q q12 = (kotlin.Q) aVar.invoke();
        if (q12 != null) {
            A a12 = q12.f406619b;
            this.f80710p = (Integer) a12;
            this.f80711q = (View) q12.f406620c;
            itemCount = ((Number) a12).intValue();
        } else {
            itemCount = adapter.getItemCount();
        }
        this.f53878a = itemCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r1
  0x0006: PHI (r1v12 java.lang.Integer) = (r1v0 java.lang.Integer), (r1v5 java.lang.Integer) binds: [B:3:0x0004, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.C23434z, androidx.recyclerview.widget.RecyclerView.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r5, int r6, @Y61.k androidx.recyclerview.widget.RecyclerView.z r7, @Y61.k androidx.recyclerview.widget.RecyclerView.y.a r8) {
        /*
            r4 = this;
            int r0 = r4.f53878a
            java.lang.Integer r1 = r4.f80710p
            if (r1 == 0) goto Lb
        L6:
            int r1 = r1.intValue()
            goto L33
        Lb:
            kotlin.jvm.internal.N r1 = r4.f80712r
            java.lang.Object r1 = r1.invoke()
            kotlin.Q r1 = (kotlin.Q) r1
            if (r1 == 0) goto L2d
            A r2 = r1.f406619b
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4.f80710p = r3
            B r1 = r1.f406620c
            android.view.View r1 = (android.view.View) r1
            r4.f80711q = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L31
            goto L6
        L31:
            int r1 = r4.f53878a
        L33:
            r4.f53878a = r1
            android.view.View r2 = r4.f80711q
            if (r1 == r0) goto L4e
            if (r2 == 0) goto L4e
            androidx.recyclerview.widget.RecyclerView r5 = r4.f53879b
            r5.getClass()
            int r5 = androidx.recyclerview.widget.RecyclerView.V(r2)
            int r6 = r4.f53878a
            if (r5 != r6) goto L4a
            r4.f53883f = r2
        L4a:
            r4.e(r2, r8)
            goto L51
        L4e:
            super.c(r5, r6, r7, r8)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28220w1.c(int, int, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.RecyclerView$y$a):void");
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int i(@Y61.l View view, int i12) {
        int i13 = super.i(view, i12);
        if (view != null && view.getTop() > 0 && view.getTop() < Math.abs(i13)) {
            i13 = -view.getTop();
        }
        return i13 + this.f80713s;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final float j(@Y61.l DisplayMetrics displayMetrics) {
        return (this.f80714t ? 25.0f : 80.0f) / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int m() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int n() {
        return -1;
    }
}
