package com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.UniversalColor;
import kotlin.G0;
import kotlin.Metadata;
import tl.InterfaceC48686b;

/* compiled from: VerticalFilterToolbarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_filter_toolbar/h;", "Ltl/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h extends InterfaceC48686b {
    @k
    Banner T1();

    void a(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @k Y41.l<? super Drawable, G0> lVar);

    void d(@l UniversalColor universalColor, @l UniversalColor universalColor2);

    void h(boolean z12);

    void setTitle(@l String str);
}
