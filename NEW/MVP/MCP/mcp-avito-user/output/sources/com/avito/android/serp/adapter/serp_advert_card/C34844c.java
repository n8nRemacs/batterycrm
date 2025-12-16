package com.avito.android.serp.adapter.serp_advert_card;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.serp.AdvertItemLayout;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: RdsSerpAdvertCardSinglePictures.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/c;", "Lcom/avito/android/serp/adapter/serp_advert_card/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41177b
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34844c extends AbstractC34843b {

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f271904P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final AsyncViewportTracker.ViewContext f271905Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f271906R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f271907S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final AdvertItemLayout f271908T;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.c$a */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f271909b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.q f271910c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C34844c f271911d;

        public a(View view, Y41.q qVar, C34844c c34844c) {
            this.f271909b = view;
            this.f271910c = qVar;
            this.f271911d = c34844c;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            C34844c c34844c = this.f271911d;
            this.f271910c.invoke(Integer.valueOf(c34844c.f271907S.getWidth()), Integer.valueOf(c34844c.f271907S.getHeight()), c34844c.f271905Q);
            this.f271909b.removeOnLayoutChangeListener(this);
        }
    }

    public C34844c(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        super(view, hVar, locale);
        this.f271904P = aVar;
        this.f271905Q = viewContext;
        this.f271906R = new com.avito.android.image_loader.e().a(view.getContext());
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f271907S = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.AdvertItemLayout");
        }
        this.f271908T = (AdvertItemLayout) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Ny(@Y61.k List list) {
        com.avito.android.image_loader.k kVar = (com.avito.android.image_loader.k) C42745f0.E(list);
        SimpleDraweeView simpleDraweeView = this.f271907S;
        Drawable drawableA = d.a.a(this.f271906R, simpleDraweeView.getContext(), kVar, null, null, 28);
        if (!L.f(kVar.a(simpleDraweeView), Uri.EMPTY)) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(kVar);
            aVarA.f169500r = false;
            aVarA.f169501s = drawableA;
            aVarA.c();
            return;
        }
        Drawable drawableU = D6.u(simpleDraweeView, R.drawable.ic_rds_stub);
        ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
        aVarA2.f169492j = drawableU;
        aVarA2.f169493k = null;
        aVarA2.f169484b = new ImageRequest.d.a(drawableU, null);
        aVarA2.f169501s = drawableA;
        aVarA2.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA2.f169498p = null;
        aVarA2.f169497o = new C34845d(this);
        aVarA2.c();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return ((com.avito.android.image_loader.m) kVar).a(this.f271907S);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        SimpleDraweeView simpleDraweeView = this.f271907S;
        simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, qVar, this));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.AbstractC34843b
    public final void b(float f12) {
        super.b(f12);
        this.f271907S.setAlpha(f12);
    }
}
