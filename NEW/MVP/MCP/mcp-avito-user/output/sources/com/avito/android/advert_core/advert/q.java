package com.avito.android.advert_core.advert;

import android.content.res.Resources;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridAfterHeaderItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/q;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f82699b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82702e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82703f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82704g;

    /* renamed from: h, reason: collision with root package name */
    public final float f82705h;

    public /* synthetic */ q(int i12, Resources resources, L0 l02, int i13, int i14, C42822w c42822w) {
        this(i12, resources, l02, (i14 & 8) != 0 ? 0 : i13);
    }

    public final int c(float f12) {
        float f13 = this.f82705h;
        return (int) r.c(f13, this.f82702e, (f12 - f13) / f13, f13);
    }

    public final float e(int i12) {
        return ((i12 + 1) * this.f82704g) / this.f82699b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r10, @Y61.k android.view.View r11, @Y61.k androidx.recyclerview.widget.RecyclerView r12, @Y61.k androidx.recyclerview.widget.RecyclerView.z r13) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.advert.q.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public q(int i12, @Y61.k Resources resources, @Y61.k L0 l02, int i13) {
        this.f82699b = i12;
        this.f82700c = i13;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.rds_column_offset) / 2;
        this.f82701d = dimensionPixelSize;
        this.f82702e = resources.getDimensionPixelSize(R.dimen.content_horizontal_padding) - dimensionPixelSize;
        this.f82703f = resources.getDimensionPixelSize(R.dimen.rds_grid_row_offset) / 2;
        this.f82704g = l02.c();
        this.f82705h = l02.c() / 2;
    }
}
