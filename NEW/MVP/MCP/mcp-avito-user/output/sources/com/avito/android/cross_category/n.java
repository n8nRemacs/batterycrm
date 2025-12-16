package com.avito.android.cross_category;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.rxjava3.internal.operators.observable.W;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CrossCategoryWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cross_category/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cross_category/m;", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f131070b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f131071c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f131072d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f131073e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f131074f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f131075g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f131076h;

    /* compiled from: CrossCategoryWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f131078l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cross_item_category_card);
        constraintLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        constraintLayout.setClipToOutline(true);
        this.f131070b = constraintLayout;
        this.f131071c = (TextView) view.findViewById(R.id.cross_item_block_title);
        this.f131072d = (TextView) view.findViewById(R.id.cross_item_card_name);
        this.f131073e = (SimpleDraweeView) view.findViewById(R.id.cross_item_card_image);
        this.f131074f = b.f131078l;
        this.f131075g = true;
        this.f131076h = new com.jakewharton.rxrelay3.c<>();
        view.addOnAttachStateChangeListener(new a());
    }

    @Override // com.avito.android.cross_category.m
    public final void SH(@f0 @Y61.l Integer num, @Y61.k String str) {
        TextView textView = this.f131071c;
        textView.setText(str);
        if (num != null) {
            textView.setTextAppearance(num.intValue());
        }
    }

    @Override // com.avito.android.cross_category.m
    @Y61.k
    public final W V1() {
        return this.f131076h.N(new o(this));
    }

    @Override // com.avito.android.cross_category.m
    public final void aO(int i12) {
        ConstraintLayout constraintLayout = this.f131070b;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.width = i12;
        constraintLayout.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.cross_category.m
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f131074f = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f131074f.invoke();
    }

    @Override // com.avito.android.cross_category.m
    public final int kh() {
        ViewGroup.LayoutParams layoutParams = this.f131070b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    @Override // com.avito.android.cross_category.m
    public final void l(@Y61.k Image image) {
        com.avito.android.advert.item.delivery_suggests.l.w(image, C35949t5.a(this.f131073e));
    }

    @Override // com.avito.android.cross_category.m
    public final void nN(@Y61.k C c12) {
        this.f131070b.setOnClickListener(c12);
    }

    @Override // com.avito.android.cross_category.m
    public final int qw() {
        ViewGroup.LayoutParams layoutParams = this.f131070b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    @Override // com.avito.android.cross_category.m
    public final void setQuery(@Y61.k String str) {
        this.f131072d.setText(str);
    }

    /* compiled from: CrossCategoryWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cross_category/n$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            n.this.f131076h.accept(G0.f406611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}
