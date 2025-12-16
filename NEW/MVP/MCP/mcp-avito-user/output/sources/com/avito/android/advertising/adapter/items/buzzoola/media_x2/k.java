package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.facebook.drawee.drawable.s;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: BuzzoolaMediaX2ViewHolderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/k;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/j;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.android.serp.c implements j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f87352k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f87353b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f87354c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f87355d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RatioForegroundFrameLayout f87356e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f87357f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f87358g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87359h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Rect f87360i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final U9.f f87361j;

    /* compiled from: BuzzoolaMediaX2ViewHolderImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/adapter/items/buzzoola/media_x2/k$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            k kVar = k.this;
            if (kVar.f87359h) {
                FrameLayout frameLayout = kVar.f87355d;
                ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                U9.f fVar = kVar.f87361j;
                viewTreeObserver.removeOnScrollChangedListener(fVar);
                frameLayout.getViewTreeObserver().addOnScrollChangedListener(fVar);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            k kVar = k.this;
            if (kVar.f87359h) {
                kVar.f87355d.getViewTreeObserver().removeOnScrollChangedListener(kVar.f87361j);
            }
        }
    }

    public k(@Y61.k View view, @Y61.k AdStyle adStyle, @Y61.k BannerPageSource bannerPageSource) {
        super(view);
        this.f87353b = view;
        this.f87354c = adStyle;
        View viewFindViewById = view.findViewById(R.id.buzzoola_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f87355d = (FrameLayout) viewFindViewById;
        this.f87356e = (RatioForegroundFrameLayout) view.findViewById(R.id.media_view_container);
        this.f87357f = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f87358g = (TextView) view.findViewById(R.id.advertising_badge);
        com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
        Resources resources = view.getResources();
        hVar.getClass();
        this.f87360i = com.avito.android.advertising.ui.h.f(resources, bannerPageSource);
        this.f87361j = new U9.f(this, 3);
        view.addOnAttachStateChangeListener(new a());
    }

    public final void B80() {
        ViewParent parent = this.f87353b.getParent();
        if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) == null) {
            return;
        }
        float f12 = 1 - s.f(r0.getTop() / (r1.getHeight() - r0.getMeasuredHeight()), 0.0f, 1.0f);
        GW0.a hierarchy = this.f87357f.getHierarchy();
        PointF pointF = new PointF(0.5f, f12);
        hierarchy.getClass();
        hierarchy.l(2).q(pointF);
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.media_x2.j
    public final void Be(boolean z12) {
        this.f87359h = z12;
        U9.f fVar = this.f87361j;
        FrameLayout frameLayout = this.f87355d;
        View view = this.f87353b;
        if (z12) {
            if (view.isAttachedToWindow()) {
                frameLayout.getViewTreeObserver().removeOnScrollChangedListener(fVar);
                frameLayout.getViewTreeObserver().addOnScrollChangedListener(fVar);
            }
        } else if (!view.isAttachedToWindow()) {
            frameLayout.getViewTreeObserver().removeOnScrollChangedListener(fVar);
        }
        this.f87357f.getHierarchy().n(z12 ? l.f87363a : s.c.f340137i);
        if (z12) {
            B80();
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        e.a.a(this, R.dimen.ad_image_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns, reason: from getter */
    public final Rect getF4091d() {
        return this.f87360i;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: Qw */
    public final TextView getF7302g() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    /* renamed from: T1 */
    public final ViewGroup getF7299d() {
        return this.f87355d;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.media_x2.j
    @Y61.k
    /* renamed from: VF, reason: from getter */
    public final SimpleDraweeView getF87357f() {
        return this.f87357f;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        ViewGroup f87356e = getF7305j();
        if (f87356e != null) {
            v.b(f87356e, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@Y61.l TextView textView, @Y61.l String str) {
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: getCallToActionView */
    public final TextView getF7303h() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF7298c() {
        return this.f87354c;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF7297b() {
        return this.f87353b;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: j70 */
    public final ViewGroup getF7319x() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    /* renamed from: od */
    public final ViewGroup getF7305j() {
        return this.f87356e;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: qs */
    public final TextView getF7311p() {
        return null;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.media_x2.j
    @Y61.k
    /* renamed from: t6, reason: from getter */
    public final TextView getF87358g() {
        return this.f87358g;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    public final View uC() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: wV */
    public final TextView getF7312q() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.media_x2.j, com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: od, reason: from getter */
    public final RatioForegroundFrameLayout getF7305j() {
        return this.f87356e;
    }
}
