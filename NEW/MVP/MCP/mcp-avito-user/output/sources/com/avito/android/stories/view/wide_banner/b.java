package com.avito.android.stories.view.wide_banner;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.service_booking_common.blueprints.geo_reference.g;
import com.avito.android.stories.model.StoryBannerItem;
import com.avito.android.stories.view.p;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: WideBannerViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/view/wide_banner/b;", "Lcom/avito/android/stories/view/p;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements p {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f285350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f285351c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f285352d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f285353e;

    /* compiled from: WideBannerViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ StoryBannerItem f285355m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StoryBannerItem storyBannerItem) {
            super(0);
            this.f285355m = storyBannerItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            UniversalImage universalImage = this.f285355m.f285160i;
            b bVar = b.this;
            Image imageG = universalImage != null ? l.g(bVar.f285350b, universalImage) : null;
            if (imageG != null) {
                ImageRequest.a aVarA = C35949t5.a(bVar.f285353e);
                aVarA.d(com.avito.android.image_loader.b.b(imageG));
                aVarA.e(y6.b(16));
                aVarA.c();
            }
            return G0.f406611a;
        }
    }

    public b(@k View view) {
        View viewFindViewById = view.findViewById(R.id.wide_banner_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f285350b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285351c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285352d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById4;
        this.f285353e = simpleDraweeView;
        simpleDraweeView.getHierarchy().n(new com.avito.android.stories.view.wide_banner.a());
    }

    public static void a(TextView textView, String str, UniversalColor universalColor) {
        I5.a(textView, str, false);
        Context context = textView.getContext();
        textView.setTextColor(universalColor != null ? C48063a.f437606a.a(context, universalColor) : C35835l0.d(R.attr.white, context));
    }

    @Override // com.avito.android.stories.view.p
    public final void D40(@k StoryBannerItem storyBannerItem, @k Y41.a<G0> aVar) {
        int iD2;
        a(this.f285351c, storyBannerItem.f285155d, storyBannerItem.f285157f);
        a(this.f285352d, storyBannerItem.f285156e, storyBannerItem.f285158g);
        View view = this.f285350b;
        UniversalColor universalColor = storyBannerItem.f285161j;
        if (universalColor != null) {
            iD2 = C48063a.f437606a.a(view.getContext(), universalColor);
        } else {
            iD2 = C35835l0.d(R.attr.black, view.getContext());
        }
        view.setBackgroundTintList(ColorStateList.valueOf(iD2));
        D6.l(true, this.f285353e, new a(storyBannerItem));
        view.setOnClickListener(new g(26, aVar));
    }

    @Override // com.avito.android.stories.view.p
    public final void cr(int i12) {
        D6.c(this.f285350b, null, null, null, Integer.valueOf(y6.b(i12)), 7);
    }

    @Override // com.avito.android.stories.view.p
    public final boolean ng() {
        return this.f285350b.getVisibility() == 0;
    }
}
