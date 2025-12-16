package com.avito.android.stories.view.stories_carousel;

import Y61.k;
import Y61.l;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.stories.view.o;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StoryCarouselItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/view/stories_carousel/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/stories/view/o;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f285327b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatioFrameLayout f285328c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f285329d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f285330e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f285331f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DockingBadge f285332g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Float f285333h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Y41.a<G0> f285334i;

    public f(@k View view) {
        super(view);
        this.f285327b = view;
        view.getContext();
        View viewFindViewById = view.findViewById(R.id.story_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.util.layout.RatioFrameLayout");
        }
        this.f285328c = (RatioFrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f285329d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285330e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.viewed_indicator);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285331f = viewFindViewById4;
        DockingBadge dockingBadge = (DockingBadge) view.findViewById(R.id.docking_badge);
        this.f285332g = dockingBadge;
        if (dockingBadge != null) {
            DockingBadgeType.Predefined predefined = DockingBadgeType.Predefined.Green;
            DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.Pyramid;
            int i12 = DockingBadge.f179108i;
            dockingBadge.d(predefined, DockingBadgeSize.MEDIUM, dockingBadgeEdgeType, dockingBadgeEdgeType);
        }
        if (dockingBadge != null) {
            dockingBadge.setBadgeColor(C35835l0.d(R.attr.red600, view.getContext()));
        }
    }

    @Override // com.avito.android.stories.view.o
    @k
    public final z<G0> A() {
        return C37722i.a(this.f285327b);
    }

    @Override // com.avito.android.stories.view.o
    public final void Ji(@l Color color, @l Image image) {
        ColorDrawable colorDrawable = color != null ? new ColorDrawable(color.getValue()) : null;
        SimpleDraweeView simpleDraweeView = this.f285329d;
        simpleDraweeView.getHierarchy().o(colorDrawable, 1);
        simpleDraweeView.getHierarchy().o(colorDrawable, 5);
        C35949t5.c(this.f285329d, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.stories.view.o
    public final void d(@l Y41.a<G0> aVar) {
        this.f285334i = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f285334i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.stories.view.o
    public final void n4(@l String str) {
        DockingBadge dockingBadge = this.f285332g;
        if (str == null || str.length() == 0) {
            if (dockingBadge != null) {
                D6.w(dockingBadge);
            }
        } else {
            if (dockingBadge != null) {
                D6.G(dockingBadge, true);
            }
            if (dockingBadge != null) {
                dockingBadge.setText(str);
            }
        }
    }

    @Override // com.avito.android.stories.view.o
    public final void q0(float f12) {
        if (L.d(this.f285333h, 1.0f)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f285328c;
        ratioFrameLayout.setRatio(1.0f);
        ratioFrameLayout.requestLayout();
        this.f285333h = Float.valueOf(1.0f);
    }

    @Override // com.avito.android.stories.view.o
    public final void setTitle(@l String str) {
        if (str != null) {
            this.f285330e.setText(str);
        }
    }

    @Override // com.avito.android.stories.view.o
    public final void setViewed(boolean z12) {
        D6.G(this.f285331f, !z12);
    }
}
