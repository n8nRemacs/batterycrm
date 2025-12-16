package com.avito.android.serp.adapter.slider.sales_slider;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.dynamicanimation.animation.c;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C1;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SalesSliderButtonView.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/m;", "Landroid/widget/FrameLayout;", "", "color", "Lkotlin/G0;", "setBackgroundColor", "(I)V", "setImageBackgroundColor", "setIconColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "setImage", "(Lcom/avito/android/remote/model/UniversalImage;)V", "getInitialWidth", "()I", "Landroid/view/View;", "getAnimatedContainer", "()Landroid/view/View;", "", "alpha", "setIconAlpha", "(F)V", "getButtonAnimateRightPosition", "()F", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f272320m = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f272321b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f272322c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f272323d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f272324e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f272325f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272326g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.dynamicanimation.animation.i f272327h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public androidx.dynamicanimation.animation.i f272328i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Handler f272329j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f272330k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f272331l;

    /* compiled from: SalesSliderButtonView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = m.this;
            androidx.dynamicanimation.animation.i iVar = mVar.f272328i;
            if (iVar != null) {
                iVar.j();
            }
            androidx.dynamicanimation.animation.i iVar2 = mVar.f272327h;
            if (iVar2 != null) {
                iVar2.f46032b = mVar.getF272321b();
                iVar2.f46033c = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SalesSliderButtonView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = m.this;
            androidx.dynamicanimation.animation.i iVar = mVar.f272327h;
            if (iVar != null) {
                iVar.j();
            }
            androidx.dynamicanimation.animation.i iVar2 = mVar.f272328i;
            if (iVar2 != null) {
                iVar2.f46032b = mVar.getButtonAnimateRightPosition();
                iVar2.f46033c = true;
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getButtonAnimateRightPosition() throws Resources.NotFoundException {
        return (getContext().getResources().getDimensionPixelSize(R.dimen.slider_widget_fake_drag_offset) / 2) + getF272321b();
    }

    public final void b(int i12) {
        LinearLayout linearLayout = this.f272323d;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i12;
        linearLayout.setLayoutParams(layoutParams);
    }

    public final void c() {
        C1.f318564a.getClass();
        if (C1.a() && this.f272326g) {
            this.f272329j.removeCallbacksAndMessages(null);
            androidx.dynamicanimation.animation.i iVar = this.f272327h;
            if (iVar != null) {
                iVar.d();
            }
            androidx.dynamicanimation.animation.i iVar2 = this.f272328i;
            if (iVar2 != null) {
                iVar2.d();
            }
            androidx.dynamicanimation.animation.i iVar3 = new androidx.dynamicanimation.animation.i(new androidx.dynamicanimation.animation.g(getF272321b()));
            androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j();
            jVar.b(290.0f);
            jVar.a(0.26f);
            jVar.f46058i = getButtonAnimateRightPosition();
            iVar3.f46047t = jVar;
            final int i12 = 0;
            iVar3.c(new c.r(this) { // from class: com.avito.android.serp.adapter.slider.sales_slider.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f272319b;

                {
                    this.f272319b = this;
                }

                @Override // androidx.dynamicanimation.animation.c.r
                public final void a(float f12) {
                    m mVar = this.f272319b;
                    switch (i12) {
                        case 0:
                            int i13 = m.f272320m;
                            mVar.b((int) f12);
                            break;
                        default:
                            int i14 = m.f272320m;
                            mVar.b((int) f12);
                            break;
                    }
                }
            });
            this.f272327h = iVar3;
            androidx.dynamicanimation.animation.i iVar4 = new androidx.dynamicanimation.animation.i(new androidx.dynamicanimation.animation.g(getButtonAnimateRightPosition()));
            androidx.dynamicanimation.animation.j jVar2 = new androidx.dynamicanimation.animation.j();
            jVar2.b(290.0f);
            jVar2.a(0.26f);
            jVar2.f46058i = getF272321b();
            iVar4.f46047t = jVar2;
            final int i13 = 1;
            iVar4.c(new c.r(this) { // from class: com.avito.android.serp.adapter.slider.sales_slider.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f272319b;

                {
                    this.f272319b = this;
                }

                @Override // androidx.dynamicanimation.animation.c.r
                public final void a(float f12) {
                    m mVar = this.f272319b;
                    switch (i13) {
                        case 0:
                            int i132 = m.f272320m;
                            mVar.b((int) f12);
                            break;
                        default:
                            int i14 = m.f272320m;
                            mVar.b((int) f12);
                            break;
                    }
                }
            });
            this.f272328i = iVar4;
            androidx.dynamicanimation.animation.i iVar5 = this.f272327h;
            if (iVar5 != null) {
                final int i14 = 0;
                iVar5.b(new c.q(this) { // from class: com.avito.android.serp.adapter.slider.sales_slider.j

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m f272315b;

                    {
                        this.f272315b = this;
                    }

                    @Override // androidx.dynamicanimation.animation.c.q
                    public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
                        m mVar = this.f272315b;
                        switch (i14) {
                            case 0:
                                if (!z12) {
                                    mVar.f272329j.postDelayed(new k(1, mVar.f272331l), 1000L);
                                    break;
                                } else {
                                    int i15 = m.f272320m;
                                    break;
                                }
                            default:
                                if (!z12) {
                                    mVar.f272329j.postDelayed(new k(2, mVar.f272330k), 2000L);
                                    break;
                                } else {
                                    int i16 = m.f272320m;
                                    break;
                                }
                        }
                    }
                });
            }
            androidx.dynamicanimation.animation.i iVar6 = this.f272328i;
            if (iVar6 != null) {
                final int i15 = 1;
                iVar6.b(new c.q(this) { // from class: com.avito.android.serp.adapter.slider.sales_slider.j

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m f272315b;

                    {
                        this.f272315b = this;
                    }

                    @Override // androidx.dynamicanimation.animation.c.q
                    public final void a(androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
                        m mVar = this.f272315b;
                        switch (i15) {
                            case 0:
                                if (!z12) {
                                    mVar.f272329j.postDelayed(new k(1, mVar.f272331l), 1000L);
                                    break;
                                } else {
                                    int i152 = m.f272320m;
                                    break;
                                }
                            default:
                                if (!z12) {
                                    mVar.f272329j.postDelayed(new k(2, mVar.f272330k), 2000L);
                                    break;
                                } else {
                                    int i16 = m.f272320m;
                                    break;
                                }
                        }
                    }
                });
            }
            this.f272329j.postDelayed(new k(0, this.f272330k), 1000L);
        }
    }

    @Y61.k
    public final View getAnimatedContainer() {
        return this.f272323d;
    }

    /* renamed from: getInitialWidth, reason: from getter */
    public final int getF272321b() {
        return this.f272321b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.f272324e.setBackgroundColor(color);
    }

    public final void setIconAlpha(float alpha) {
        this.f272325f.setAlpha(alpha);
    }

    public final void setIconColor(int color) {
        this.f272325f.setColorFilter(color);
    }

    public final void setImage(@Y61.k UniversalImage image) {
        C35949t5.c(this.f272322c, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(getContext()))), null, null, null, 14);
    }

    public final void setImageBackgroundColor(int color) {
        this.f272322c.setBackgroundColor(color);
    }

    @X41.j
    public m(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f272321b = context.getResources().getDimensionPixelSize(R.dimen.slider_widget_initial_button_size);
        this.f272326g = true;
        this.f272329j = new Handler(Looper.getMainLooper());
        this.f272330k = new b();
        this.f272331l = new a();
        setId(View.generateViewId());
        View viewInflate = View.inflate(context, R.layout.serp_sales_slider_button, this);
        View viewFindViewById = viewInflate.findViewById(R.id.sales_slider_button_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f272322c = simpleDraweeView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.sales_slider_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f272323d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.sales_slider_colored_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById3;
        this.f272324e = frameLayout;
        v.a(frameLayout, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        v.a(simpleDraweeView, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        View viewFindViewById4 = viewInflate.findViewById(R.id.sales_slider_button_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f272325f = (ImageView) viewFindViewById4;
        c();
    }
}
