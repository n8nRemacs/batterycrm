package com.avito.android.publish.screen.step.params.view.actions;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsPaddingHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/actions/k;", "Lcom/avito/android/publish/screen/step/params/view/actions/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f241562a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f241563b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f241564c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f241565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f241566e;

    public k(@Y61.k View view, @Y61.k View view2) {
        this.f241562a = view;
        this.f241563b = view2;
        View viewFindViewById = view2.findViewById(R.id.buttons_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f241564c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f241565d = (RecyclerView) viewFindViewById2;
        this.f241566e = view.getResources().getDimensionPixelSize(R.dimen.publish_continue_button_vertical_margin);
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.j
    /* renamed from: a, reason: from getter */
    public final int getF241566e() {
        return this.f241566e;
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.j
    public final int b() {
        return this.f241564c.getHeight();
    }

    @Override // com.avito.android.publish.screen.step.params.view.actions.j
    public final void c(int i12) {
        D6.f(this.f241565d, 0, 0, 0, i12, 7);
    }
}
