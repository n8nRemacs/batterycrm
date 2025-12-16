package com.avito.android.publish.slots.delivery_all_toggles.item;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.U;
import androidx.core.view.o0;
import androidx.core.widget.NestedScrollView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryAllTogglesItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f243526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f243527m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NestedScrollView nestedScrollView, o oVar) {
        super(0);
        this.f243526l = nestedScrollView;
        this.f243527m = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        NestedScrollView nestedScrollView = this.f243526l;
        View childAt = nestedScrollView.getChildAt(0);
        if (childAt != null && childAt.getHeight() > 0 && nestedScrollView.getHeight() > 0) {
            o oVar = this.f243527m;
            ViewGroup viewGroup = oVar.f243507b;
            int height = viewGroup.getHeight() - o0.a((ConstraintLayout) viewGroup.getParent().getParent().getParent(), 0).getHeight();
            int height2 = childAt.getHeight();
            Space space = oVar.f243517l;
            int paddingBottom = nestedScrollView.getPaddingBottom() + nestedScrollView.getPaddingTop() + (height2 - space.getHeight());
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            if (paddingBottom < height) {
                layoutParams.height = height;
                layoutParams3.height = height;
                space.setLayoutParams(layoutParams2);
            } else {
                layoutParams.height = paddingBottom;
            }
            nestedScrollView.setLayoutParams(layoutParams);
            childAt.setLayoutParams(layoutParams3);
            space.setLayoutParams(layoutParams2);
            nestedScrollView.post(new U(childAt, 7));
        }
        return G0.f406611a;
    }
}
