package com.yandex.mobile.ads.nativeads.view.pager;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.h11;
import com.yandex.mobile.ads.impl.or;
import com.yandex.mobile.ads.impl.q21;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.v11;
import j.X;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/G0;", "setOnClickLeftButtonListener", "(Landroid/view/View$OnClickListener;)V", "setOnClickRightButtonListener", "mobileads_externalRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final or f392882a;

    /* renamed from: b, reason: collision with root package name */
    @k
    private final h11 f392883b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final InterfaceC42726C f392884c;

    /* renamed from: d, reason: collision with root package name */
    @k
    private final ss f392885d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f392886e;

    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            v11 v11VarA = q21.b().a(MultiBannerControlsContainer.this.getContext());
            return Boolean.valueOf((v11VarA == null || v11VarA.U()) ? false : true);
        }
    }

    public static final class b extends ViewPager2.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f392888a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MultiBannerControlsContainer f392889b;

        public b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f392888a = viewPager2;
            this.f392889b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            RecyclerView.Adapter adapter = this.f392888a.getAdapter();
            this.f392889b.a(i12, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    public MultiBannerControlsContainer(@k Context context) {
        super(context);
        this.f392882a = new or();
        this.f392883b = new h11();
        this.f392884c = C42727D.c(new a());
        this.f392885d = new ss();
        this.f392886e = true;
    }

    public final void setOnClickLeftButtonListener(@k View.OnClickListener listener) {
        h11 h11Var = this.f392883b;
        View viewFindViewById = findViewById(R.id.left_scroll_control_button);
        h11Var.getClass();
        ImageView imageView = (ImageView) h11.a(ImageView.class, viewFindViewById);
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@k View.OnClickListener listener) {
        h11 h11Var = this.f392883b;
        View viewFindViewById = findViewById(R.id.right_scroll_control_button);
        h11Var.getClass();
        ImageView imageView = (ImageView) h11.a(ImageView.class, viewFindViewById);
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(@k ViewPager2 viewPager2) {
        viewPager2.e(new b(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new com.avito.android.util.bottom_gap.a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        if (view instanceof ViewPager2) {
            boolean z12 = multiBannerControlsContainer.f392886e;
            boolean zA2 = multiBannerControlsContainer.f392885d.a(view, i12, i13, i14, i15);
            multiBannerControlsContainer.f392886e = zA2;
            if (zA2 != z12) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    public MultiBannerControlsContainer(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f392882a = new or();
        this.f392883b = new h11();
        this.f392884c = C42727D.c(new a());
        this.f392885d = new ss();
        this.f392886e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i12, int i13) {
        h11 h11Var = this.f392883b;
        View viewFindViewById = findViewById(R.id.left_scroll_control_button);
        h11Var.getClass();
        ImageView imageView = (ImageView) h11.a(ImageView.class, viewFindViewById);
        h11 h11Var2 = this.f392883b;
        View viewFindViewById2 = findViewById(R.id.right_scroll_control_button);
        h11Var2.getClass();
        ImageView imageView2 = (ImageView) h11.a(ImageView.class, viewFindViewById2);
        h11 h11Var3 = this.f392883b;
        View viewFindViewById3 = findViewById(R.id.dot_indicator);
        h11Var3.getClass();
        ImageView imageView3 = (ImageView) h11.a(ImageView.class, viewFindViewById3);
        if (!this.f392886e) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        h11 h11Var4 = this.f392883b;
        View viewFindViewById4 = findViewById(R.id.dot_indicator);
        h11Var4.getClass();
        ImageView imageView4 = (ImageView) h11.a(ImageView.class, viewFindViewById4);
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            imageView4.setImageDrawable(this.f392882a.a(getContext(), i12, i13));
        }
        h11 h11Var5 = this.f392883b;
        View viewFindViewById5 = findViewById(R.id.left_scroll_control_button);
        h11Var5.getClass();
        ImageView imageView5 = (ImageView) h11.a(ImageView.class, viewFindViewById5);
        h11 h11Var6 = this.f392883b;
        View viewFindViewById6 = findViewById(R.id.right_scroll_control_button);
        h11Var6.getClass();
        ImageView imageView6 = (ImageView) h11.a(ImageView.class, viewFindViewById6);
        if (!((Boolean) this.f392884c.getValue()).booleanValue() || imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i12 == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i12 == i13 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    public MultiBannerControlsContainer(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f392882a = new or();
        this.f392883b = new h11();
        this.f392884c = C42727D.c(new a());
        this.f392885d = new ss();
        this.f392886e = true;
    }

    @X
    public MultiBannerControlsContainer(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f392882a = new or();
        this.f392883b = new h11();
        this.f392884c = C42727D.c(new a());
        this.f392885d = new ss();
        this.f392886e = true;
    }
}
