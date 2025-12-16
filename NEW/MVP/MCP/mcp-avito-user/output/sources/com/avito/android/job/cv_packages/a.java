package com.avito.android.job.cv_packages;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: JobCvPackagesRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f174329b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f174330c = y6.b(10);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12 = this.f174329b;
        rect.left = i12;
        rect.right = i12;
        rect.bottom = this.f174330c;
    }
}
