package com.avito.android.brand_global_rubricator;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandGlobalRubricatorViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brand_global_rubricator/p;", "Lcom/avito/android/brand_global_rubricator/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    public final int f107463b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComposeView f107464c;

    static {
        int i12 = ComposeView.f41092l;
    }

    public p(@Y61.k View view, int i12) {
        super(view);
        this.f107463b = i12;
        View viewFindViewById = view.findViewById(R.id.compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f107464c = composeView;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
    }

    @Override // com.avito.android.brand_global_rubricator.m
    public final void d60(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        ComposeView composeView = this.f107464c;
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = this.f107463b;
        composeView.setLayoutParams(layoutParams);
        composeView.setContent(new C22096n(46321607, new o(new q(arrayList), lVar), true));
    }
}
