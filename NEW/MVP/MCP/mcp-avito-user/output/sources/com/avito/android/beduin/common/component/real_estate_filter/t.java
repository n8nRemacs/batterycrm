package com.avito.android.beduin.common.component.real_estate_filter;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRealEstateFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f102340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f102341m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f102342n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f102343o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f102344p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, View view, NestedScrollView nestedScrollView, View view2, View view3) {
        super(0);
        this.f102340l = sVar;
        this.f102341m = view;
        this.f102342n = nestedScrollView;
        this.f102343o = view2;
        this.f102344p = view3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        s sVar = this.f102340l;
        View viewFindViewById = sVar.f102339d.findViewById(R.id.floatin_confirm);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new q(sVar, 1));
        }
        int measuredHeight = this.f102341m.getMeasuredHeight();
        NestedScrollView nestedScrollView = this.f102342n;
        int measuredHeight2 = measuredHeight - nestedScrollView.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            View view = this.f102343o;
            D6.g(view);
            View view2 = this.f102344p;
            D6.H(view2);
            nestedScrollView.setOnScrollChangeListener(new com.avito.android.avl.view.g(measuredHeight2, view2, view));
        }
        return G0.f406611a;
    }
}
