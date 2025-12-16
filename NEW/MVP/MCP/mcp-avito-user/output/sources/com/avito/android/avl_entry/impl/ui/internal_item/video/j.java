package com.avito.android.avl_entry.impl.ui.internal_item.video;

import Y61.l;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.image_loader.d;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.w6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShortVideosWidgetCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/video/j;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/video/i;", "Lcom/avito/android/serp/c;", "Landroidx/lifecycle/q;", "a", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.android.serp.c implements i, InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f98607b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f98608c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f98609d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f98610e;

    /* compiled from: ShortVideosWidgetCarouselItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/video/j$a;", "", "<init>", "()V", "", "THUMBNAIL_ANIMATION_DURATION", "J", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(@Y61.k View view) {
        Lifecycle lifecycle;
        super(view);
        this.f98607b = view;
        View viewFindViewById = view.findViewById(R.id.thumbnail);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f98608c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.play_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f98609d = (ImageView) viewFindViewById2;
        ComponentCallbacks2 componentCallbacks2A = C35835l0.a(view.getContext());
        InterfaceC22983P interfaceC22983P = componentCallbacks2A instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2A : null;
        if (interfaceC22983P == null || (lifecycle = interfaceC22983P.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    public final void FJ() {
        D6.w(this.f98609d);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.f98608c.animate().alpha(0.0f);
        w6.a(viewPropertyAnimatorAlpha, new k(this));
        viewPropertyAnimatorAlpha.setDuration(300L);
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    @Y61.k
    /* renamed from: H6, reason: from getter */
    public final View getF98607b() {
        return this.f98607b;
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    public final void d(@l Y41.a<G0> aVar) {
        this.f98610e = aVar;
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    public final void eE(@l Image image) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
        com.avito.android.image_loader.e eVar = new com.avito.android.image_loader.e();
        SimpleDraweeView simpleDraweeView = this.f98608c;
        C35949t5.c(this.f98608c, aVarB, null, null, d.a.a(eVar.a(simpleDraweeView.getContext()), simpleDraweeView.getContext(), aVarB, null, null, 28), 6);
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    public final void i20() {
        SimpleDraweeView simpleDraweeView = this.f98608c;
        D6.H(simpleDraweeView);
        simpleDraweeView.setAlpha(1.0f);
        D6.H(this.f98609d);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f98607b.setOnClickListener(null);
        Y41.a<G0> aVar = this.f98610e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.avl_entry.impl.ui.internal_item.video.i
    public final void l0(@Y61.k Y41.l<? super Context, G0> lVar) {
        this.f98607b.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(16, lVar, this));
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
        i20();
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
        Lifecycle lifecycle;
        ComponentCallbacks2 componentCallbacks2A = C35835l0.a(this.f98607b.getContext());
        InterfaceC22983P interfaceC22983P2 = componentCallbacks2A instanceof InterfaceC22983P ? (InterfaceC22983P) componentCallbacks2A : null;
        if (interfaceC22983P2 == null || (lifecycle = interfaceC22983P2.getLifecycle()) == null) {
            return;
        }
        lifecycle.c(this);
    }
}
