package com.avito.android.user_adverts.root_screen.adverts_host.publish_button;

import Ae0.b;
import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.view.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishFabView.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/publish_button/PublishFabView;", "Landroid/widget/LinearLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/publish_button/PublishFabView$FabBehavior;", "getBehavior", "()Lcom/avito/android/user_adverts/root_screen/adverts_host/publish_button/PublishFabView$FabBehavior;", "Lkotlin/Function0;", "Lkotlin/G0;", "listener", "setPublishClickListener", "(LY41/a;)V", "FabBehavior", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PublishFabView extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f313790e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f313791b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f313792c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FabBehavior f313793d;

    /* compiled from: PublishFabView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/publish_button/PublishFabView$FabBehavior;", "Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FabBehavior extends HideBottomViewOnScrollBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        public boolean f313794l;

        /* JADX WARN: Multi-variable type inference failed */
        @j
        public FabBehavior() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean s(@k CoordinatorLayout coordinatorLayout, @k View view, @k View view2, @k View view3, int i12, int i13) {
            return this.f313794l && super.s(coordinatorLayout, view, view2, view3, i12, i13);
        }

        public /* synthetic */ FabBehavior(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : context, (i12 & 2) != 0 ? null : attributeSet);
        }

        @j
        public FabBehavior(@l Context context, @l AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f313794l = true;
        }
    }

    @j
    public PublishFabView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void setPublishClickListener(@k a<G0> listener) {
        this.f313791b.setOnClickListener(new b(13, listener));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublishFabView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        super(((context instanceof d) && ((d) context).f21657a == 2132024975) ? context : new d(context, R.style.Theme_DesignSystem_Re23), attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View.inflate(getContext(), R.layout.user_adverts_publish_fab_view, this);
        this.f313793d = new FabBehavior(getContext(), attributeSet);
        this.f313791b = (Button) findViewById(R.id.publish_fab_button);
        this.f313792c = (Button) findViewById(R.id.secondary_fab_button);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @k
    /* renamed from: getBehavior, reason: from getter */
    public FabBehavior getF313793d() {
        return this.f313793d;
    }
}
