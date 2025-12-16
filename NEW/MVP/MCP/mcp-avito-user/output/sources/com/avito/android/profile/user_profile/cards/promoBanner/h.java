package com.avito.android.profile.user_profile.cards.promoBanner;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: PromoBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/promoBanner/h;", "Lcom/avito/android/profile/user_profile/cards/promoBanner/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f225252j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Banner f225253b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f225254c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f225255d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f225256e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f225257f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f225258g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f225259h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f225260i;

    public h(@k View view) {
        super(view);
        this.f225253b = (Banner) view.findViewById(R.id.profile_banner_item);
        this.f225254c = (LinearLayout) view.findViewById(R.id.banner_centred_title_layout);
        this.f225255d = (LinearLayout) view.findViewById(R.id.banner_title_with_subtitle_layout);
        this.f225256e = (SimpleDraweeView) view.findViewById(R.id.banner_right_image);
        this.f225257f = (SimpleDraweeView) view.findViewById(R.id.banner_full_image);
        this.f225258g = (TextView) view.findViewById(R.id.banner_centred_title);
        this.f225259h = (TextView) view.findViewById(R.id.banner_title);
        this.f225260i = (TextView) view.findViewById(R.id.banner_subtitle);
    }

    public static void B80(SimpleDraweeView simpleDraweeView, UniversalImage universalImage) {
        if (universalImage == null) {
            D6.w(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))));
        aVarA.f169500r = false;
        aVarA.c();
        D6.H(simpleDraweeView);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    @Override // com.avito.android.profile.user_profile.cards.promoBanner.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(@Y61.l java.util.List<com.avito.android.remote.model.user_profile.items.PromoBanner.Image> r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L2a
            r1 = r6
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.avito.android.remote.model.user_profile.items.PromoBanner$Image r3 = (com.avito.android.remote.model.user_profile.items.PromoBanner.Image) r3
            com.avito.android.remote.model.user_profile.items.PromoBanner$Position r3 = r3.getPosition()
            com.avito.android.remote.model.user_profile.items.PromoBanner$Position r4 = com.avito.android.remote.model.user_profile.items.PromoBanner.Position.RIGHT
            if (r3 != r4) goto La
            goto L21
        L20:
            r2 = r0
        L21:
            com.avito.android.remote.model.user_profile.items.PromoBanner$Image r2 = (com.avito.android.remote.model.user_profile.items.PromoBanner.Image) r2
            if (r2 == 0) goto L2a
            com.avito.android.remote.model.UniversalImage r1 = r2.getImage()
            goto L2b
        L2a:
            r1 = r0
        L2b:
            if (r6 == 0) goto L52
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L33:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.avito.android.remote.model.user_profile.items.PromoBanner$Image r3 = (com.avito.android.remote.model.user_profile.items.PromoBanner.Image) r3
            com.avito.android.remote.model.user_profile.items.PromoBanner$Position r3 = r3.getPosition()
            com.avito.android.remote.model.user_profile.items.PromoBanner$Position r4 = com.avito.android.remote.model.user_profile.items.PromoBanner.Position.FULL
            if (r3 != r4) goto L33
            goto L4a
        L49:
            r2 = r0
        L4a:
            com.avito.android.remote.model.user_profile.items.PromoBanner$Image r2 = (com.avito.android.remote.model.user_profile.items.PromoBanner.Image) r2
            if (r2 == 0) goto L52
            com.avito.android.remote.model.UniversalImage r0 = r2.getImage()
        L52:
            com.avito.android.fresco.SimpleDraweeView r6 = r5.f225256e
            B80(r6, r1)
            com.avito.android.fresco.SimpleDraweeView r6 = r5.f225257f
            B80(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.promoBanner.h.G0(java.util.List):void");
    }

    @Override // com.avito.android.profile.user_profile.cards.promoBanner.g
    public final void N4(@l AttributedText attributedText, @l AttributedText attributedText2) {
        LinearLayout linearLayout = this.f225255d;
        LinearLayout linearLayout2 = this.f225254c;
        if (attributedText2 == null) {
            D6.H(linearLayout2);
            D6.w(linearLayout);
            j.a(this.f225258g, attributedText, null);
        } else {
            D6.w(linearLayout2);
            D6.H(linearLayout);
            j.a(this.f225259h, attributedText, null);
            j.a(this.f225260i, attributedText2, null);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.promoBanner.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f225253b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(17, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.promoBanner.g
    public final void v(@l UniversalColor universalColor) {
        int iD2;
        Banner banner = this.f225253b;
        if (universalColor != null) {
            iD2 = C48063a.f437606a.a(banner.getContext(), universalColor);
        } else {
            iD2 = C35835l0.d(R.attr.white, banner.getContext());
        }
        Banner.h(banner, ColorStateList.valueOf(iD2));
    }
}
