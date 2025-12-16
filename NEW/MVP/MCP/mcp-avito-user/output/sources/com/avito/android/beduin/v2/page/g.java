package com.avito.android.beduin.v2.page;

import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BaseDetachedBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f104810l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BaseDetachedBottomSheet f104811m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f104812n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, BaseDetachedBottomSheet baseDetachedBottomSheet, View view2) {
        super(0);
        this.f104810l = view;
        this.f104811m = baseDetachedBottomSheet;
        this.f104812n = view2;
    }

    @Override // Y41.a
    public final G0 invoke() throws Resources.NotFoundException {
        WindowInsets rootWindowInsets;
        Insets insets;
        View view = this.f104810l;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int dimensionPixelSize = this.f104811m.requireContext().getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_thumb_layout_height);
        int i12 = Build.VERSION.SDK_INT;
        View view2 = this.f104812n;
        int i13 = 0;
        if (i12 >= 35 && (rootWindowInsets = view2.getRootWindowInsets()) != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout())) != null) {
            i13 = insets.bottom + insets.top;
        }
        layoutParams.height = (view2.getMeasuredHeight() - i13) - dimensionPixelSize;
        view.setLayoutParams(layoutParams);
        return G0.f406611a;
    }
}
