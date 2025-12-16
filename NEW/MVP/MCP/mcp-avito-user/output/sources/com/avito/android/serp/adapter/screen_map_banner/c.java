package com.avito.android.serp.adapter.screen_map_banner;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ScreenMapBannerItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/screen_map_banner/c;", "LUr0/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends Ur0.c {

    /* renamed from: s, reason: collision with root package name */
    public final int f271569s;

    /* renamed from: t, reason: collision with root package name */
    public final int f271570t;

    public c(@k Resources resources, @k com.avito.konveyor.a aVar) {
        super(resources, aVar);
        this.f271569s = y6.b(6);
        this.f271570t = y6.b(8);
    }

    @Override // Ur0.c
    public final void c(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (!(recyclerView.W(view) instanceof h)) {
            this.f16709q = false;
            return;
        }
        int i12 = this.f271570t;
        rect.top = i12;
        rect.bottom = i12;
        int i13 = this.f271569s;
        rect.left = i13;
        rect.right = i13;
        this.f16709q = true;
    }
}
