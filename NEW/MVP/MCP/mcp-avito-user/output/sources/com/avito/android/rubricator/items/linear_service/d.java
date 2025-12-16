package com.avito.android.rubricator.items.linear_service;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rubricator.Type;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SerpRubricatorLinearServiceItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/linear_service/d;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f255800s;

    /* renamed from: t, reason: collision with root package name */
    public final int f255801t;

    /* renamed from: u, reason: collision with root package name */
    public final int f255802u;

    /* renamed from: v, reason: collision with root package name */
    public final int f255803v;

    public d(@k Resources resources, @k com.avito.konveyor.a aVar) throws Resources.NotFoundException {
        super(resources, aVar);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f255800s = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f255801t = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_linear_services_vertical_margin);
        this.f255802u = resources.getDimensionPixelOffset(R.dimen.serp_rubricator_services_bottom_padding);
        this.f255803v = y6.b(6);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Object objW = recyclerView.W(view);
        if (!(objW instanceof com.avito.android.rubricator.h) || ((com.avito.android.rubricator.h) objW).getF255753m() != Type.f255700d) {
            this.f16709q = false;
            return;
        }
        int i12 = -this.f255800s;
        rect.left = i12;
        rect.right = i12;
        int i13 = this.f255801t + this.f255803v;
        rect.top = i13;
        rect.bottom = i13 + this.f255802u;
        this.f16709q = true;
    }
}
