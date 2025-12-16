package com.avito.android.serp.adapter.constructor;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SerpConstructorAdvertRedesignDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/D;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f269443s;

    /* renamed from: t, reason: collision with root package name */
    public final int f269444t;

    /* renamed from: u, reason: collision with root package name */
    public final int f269445u;

    /* renamed from: v, reason: collision with root package name */
    public final int f269446v;

    public D(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f269443s = aVar.Y(B.class);
        this.f269444t = resources.getDimensionPixelSize(R.dimen.constructor_advert_horizontal_padding);
        this.f269445u = resources.getDimensionPixelSize(R.dimen.constructor_advert_bottom_offset);
        this.f269446v = resources.getDimensionPixelSize(R.dimen.constructor_advert_top_offset);
    }

    @Override // Ur0.c
    public final void c(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view).getItemViewType() == this.f269443s) {
            int i12 = this.f269444t;
            rect.left = i12;
            rect.right = i12;
            rect.top = this.f269446v;
            rect.bottom = this.f269445u;
        }
    }
}
