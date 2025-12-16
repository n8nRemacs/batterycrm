package com.avito.android.extended_profile_widgets.adapter.selections.adapter;

import Y61.k;
import Y61.l;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/selections/adapter/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/selections/adapter/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f154882o = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154884c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154885d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f154886e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154887f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f154888g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f154889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f154890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f154891j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Y41.a<G0> f154892k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<ObjectAnimator> f154893l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final List<ObjectAnimator> f154894m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile_ui_components.f f154895n;

    /* compiled from: SelectionItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = i.this.f154892k;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_selection_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f154883b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_selection_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
        simpleDraweeView.setPivotX(0.0f);
        simpleDraweeView.setPivotY(y6.b(132) / 2.0f);
        this.f154884c = simpleDraweeView;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_selection_image_2);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f154885d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_selection_image_2_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f154886e = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_profile_selection_image_3);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f154887f = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_selection_image_3_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f154888g = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.extended_profile_selection_clickable_overlay);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f154889h = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.extended_profile_selection_item_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154890i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.extended_profile_selection_item_description);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154891j = (TextView) viewFindViewById9;
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property, 0.94f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property2, 0.94f);
        Property property3 = View.TRANSLATION_X;
        List<ObjectAnimator> listU = C42745f0.U(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(viewFindViewById4, (Property<View, Float>) property3, j.f154897a), ObjectAnimator.ofFloat(viewFindViewById6, (Property<View, Float>) property3, j.f154898b));
        this.f154893l = listU;
        List<ObjectAnimator> listU2 = C42745f0.U(ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property, 1.0f), ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(viewFindViewById4, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(viewFindViewById6, (Property<View, Float>) property3, 0.0f));
        this.f154894m = listU2;
        this.f154895n = new com.avito.android.extended_profile_ui_components.f(listU, listU2, new a());
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.selections.adapter.h
    public final void dm(@k SelectionItem selectionItem, @k Y41.a<G0> aVar) {
        this.f154892k = aVar;
        this.f154889h.setOnTouchListener(this.f154895n);
        I5.a(this.f154890i, selectionItem.f154871c, false);
        I5.a(this.f154891j, selectionItem.f154873e, false);
        List<Image> list = selectionItem.f154872d;
        C35949t5.c(this.f154884c, com.avito.android.image_loader.b.b((Image) C42745f0.G(list)), null, null, null, 14);
        C35949t5.c(this.f154885d, com.avito.android.image_loader.b.b((Image) C42745f0.K(1, list)), null, null, null, 14);
        C35949t5.c(this.f154887f, com.avito.android.image_loader.b.b((Image) C42745f0.K(2, list)), null, null, null, 14);
        this.f154883b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(14, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154892k = null;
        this.f154883b.setOnClickListener(null);
        this.f154889h.setOnTouchListener(null);
    }
}
