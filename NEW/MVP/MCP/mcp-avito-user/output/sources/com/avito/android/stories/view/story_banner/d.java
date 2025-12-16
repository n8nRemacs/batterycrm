package com.avito.android.stories.view.story_banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.i;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.service_booking_common.blueprints.geo_reference.g;
import com.avito.android.stories.view.n;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: StoryBannerItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/view/story_banner/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/stories/view/n;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f285341i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f285342b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f285343c;

    /* renamed from: d, reason: collision with root package name */
    public final Banner f285344d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f285345e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f285346f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f285347g;

    /* renamed from: h, reason: collision with root package name */
    public final ShimmerLayout f285348h;

    /* compiled from: ImageRequests.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements i {
        public a() {
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            ShimmerLayout shimmerLayout = d.this.f285348h;
            shimmerLayout.setVisibility(8);
            shimmerLayout.d();
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
            ShimmerLayout shimmerLayout = d.this.f285348h;
            shimmerLayout.setVisibility(0);
            shimmerLayout.c();
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
            ShimmerLayout shimmerLayout = d.this.f285348h;
            shimmerLayout.setVisibility(8);
            shimmerLayout.d();
        }
    }

    public d(@k View view) {
        super(view);
        this.f285342b = view;
        this.f285343c = view.getContext();
        this.f285344d = (Banner) view.findViewById(R.id.story_banner);
        this.f285345e = (TextView) view.findViewById(R.id.story_banner_title);
        this.f285346f = (TextView) view.findViewById(R.id.story_banner_subtitle);
        this.f285347g = (SimpleDraweeView) view.findViewById(R.id.story_banner_image);
        this.f285348h = (ShimmerLayout) view.findViewById(R.id.story_banner_shimmer);
    }

    @Override // com.avito.android.stories.view.n
    public final void BE(@l UniversalColor universalColor, @l String str) {
        TextView textView = this.f285346f;
        I5.a(textView, str, false);
        Context context = this.f285343c;
        textView.setTextColor(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.black, context));
    }

    @Override // com.avito.android.stories.view.n
    public final void X2(@l UniversalColor universalColor, @l String str) {
        TextView textView = this.f285345e;
        I5.a(textView, str, false);
        Context context = this.f285343c;
        textView.setTextColor(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.black, context));
    }

    @Override // com.avito.android.stories.view.n
    public final void a(@k Y41.a<G0> aVar) {
        this.f285344d.setOnClickListener(new g(25, aVar));
    }

    @Override // com.avito.android.stories.view.n
    public final void v(@l UniversalColor universalColor) {
        Context context = this.f285343c;
        Banner.h(this.f285344d, ColorStateList.valueOf(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.white, context)));
    }

    @Override // com.avito.android.stories.view.n
    public final void v1(@l UniversalImage universalImage) {
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(this.f285342b, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f285347g;
        if (imageG == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageG);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVarB);
        aVarA.f169490h = new a();
        aVarA.c();
    }
}
