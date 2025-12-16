package com.avito.android.advertising.ui.buzzoola.premium;

import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.buzzoola.c;
import com.avito.android.advertising.ui.c;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.r;

/* compiled from: AdBuzzoolaPremiumV1View.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/h;", "Lcom/avito/android/advertising/ui/buzzoola/premium/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ForegroundRelativeLayout f88632b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f88633c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f88634d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f88635e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RatioForegroundFrameLayout f88636f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final k f88637g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f88638h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f88639i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ImageView f88640j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.adapter.items.buzzoola.premium.a f88641k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f88642l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88643m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f88644n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f88645o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f88646p;

    /* compiled from: AdBuzzoolaPremiumV1View.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f88647b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: AdBuzzoolaPremiumV1View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f88648b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: AdBuzzoolaPremiumV1View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f88649b;

        public c(Y41.a<G0> aVar) {
            this.f88649b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).intValue();
            this.f88649b.invoke();
        }
    }

    /* compiled from: AdBuzzoolaPremiumV1View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f88650b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdBuzzoolaPremium", "Click image error", (Throwable) obj);
        }
    }

    public h(@Y61.k ForegroundRelativeLayout foregroundRelativeLayout, @Y61.k AdStyle adStyle, float f12, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar, boolean z12, @Y61.l TV0.b<?, ?> bVar, @Y61.l TV0.b<?, ?> bVar2) throws BlueprintCollisionException {
        this.f88632b = foregroundRelativeLayout;
        this.f88633c = adStyle;
        this.f88634d = cVar;
        View viewFindViewById = foregroundRelativeLayout.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f88635e = recyclerView;
        View viewFindViewById2 = foregroundRelativeLayout.findViewById(R.id.gallery_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.util.layout.RatioForegroundFrameLayout");
        }
        this.f88636f = (RatioForegroundFrameLayout) viewFindViewById2;
        View viewFindViewById3 = foregroundRelativeLayout.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88638h = (TextView) viewFindViewById3;
        View viewFindViewById4 = foregroundRelativeLayout.findViewById(R.id.description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88639i = (TextView) viewFindViewById4;
        View viewFindViewById5 = foregroundRelativeLayout.findViewById(R.id.action_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f88640j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = foregroundRelativeLayout.findViewById(R.id.logo);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f88643m = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = foregroundRelativeLayout.findViewById(R.id.call_to_action);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88644n = (TextView) viewFindViewById7;
        this.f88646p = new io.reactivex.rxjava3.disposables.c();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.cyclic_gallery_widget.image_carousel.r(new u(f12, cVar), z12 ? s.c.f340137i : null, Integer.valueOf(R.color.common_gray_4), null, null, null, 56, null));
        if (bVar != null) {
            c10493a.b(bVar);
        }
        if (bVar2 != null) {
            c10493a.b(bVar2);
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        k kVar = new k(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, z12);
        this.f88637g = kVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(foregroundRelativeLayout.getContext()).inflate(R.layout.buzzoola_premium_badges, (ViewGroup) null);
        this.f88642l = (TextView) viewGroup.findViewById(R.id.advertising_badge);
        com.avito.android.advertising.adapter.items.buzzoola.premium.a aVar = new com.avito.android.advertising.adapter.items.buzzoola.premium.a(viewGroup, Collections.singleton(Integer.valueOf(aVarA.Y(com.avito.android.cyclic_gallery_widget.image_carousel.r.class))));
        this.f88641k = aVar;
        kVar.a(aVar);
        if (adStyle.b()) {
            return;
        }
        recyclerView.n(new com.avito.android.advertising.ui.buzzoola.premium.b(this, new GestureDetector(viewGroup.getContext(), new com.avito.android.advertising.ui.buzzoola.premium.c(this))));
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void H0() {
        this.f88646p.e();
        this.f88638h.setOnClickListener(null);
        this.f88639i.setOnClickListener(null);
        this.f88640j.setOnClickListener(null);
        this.f88643m.setOnClickListener(null);
        this.f88644n.setOnClickListener(null);
        this.f88642l.setOnClickListener(null);
        S3(null);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void H1(@Y61.l Parcelable parcelable) {
        k kVar = this.f88637g;
        if (parcelable == null) {
            kVar.e();
        } else {
            kVar.f(parcelable);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void I4(@Y61.l Uri uri) {
        boolean z12 = (uri == null || this.f88645o) ? false : true;
        SimpleDraweeView simpleDraweeView = this.f88643m;
        D6.G(simpleDraweeView, z12);
        if (uri == null || this.f88645o) {
            simpleDraweeView.setController(null);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(ImageKt.toImage(uri)));
        aVarA.f169500r = false;
        aVarA.c();
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final void Q10(boolean z12) {
        c.a.a(this, z12);
        this.f88641k.f87384e = false;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void S3(@Y61.l View.OnClickListener onClickListener) {
        this.f88642l.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void S5(@InterfaceC42165v @Y61.l Integer num) {
        boolean z12 = num != null;
        ImageView imageView = this.f88640j;
        D6.G(imageView, z12);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    @Y61.k
    /* renamed from: V6, reason: from getter */
    public final TextView getF88696n() {
        return this.f88642l;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f88646p.b(this.f88634d.N(a.f88647b).g(i.e.class).d0(b.f88648b).v0(new c(aVar), d.f88650b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        this.f88638h.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(28, aVar));
        this.f88639i.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(29, aVar));
        this.f88640j.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(0, aVar));
        this.f88643m.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(1, aVar));
        this.f88644n.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(2, aVar));
    }

    public final void b() throws Resources.NotFoundException {
        Resources resources = this.f88632b.getResources();
        D6.c(this.f88636f, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_card_image_bottom_margin)), 7);
        D6.c(this.f88643m, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_logo_inset)), null, null, null, 14);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.premium_ad_text_left_margin);
        D6.c(this.f88638h, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
        D6.c(this.f88639i, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
        D6.c(this.f88644n, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF88686d() {
        return this.f88633c;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final View getView() {
        return this.f88632b;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void h(@Y61.l String str) {
        I5.a(this.f88639i, str, false);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void hH(@Y61.l String str, boolean z12) {
        boolean z13 = true ^ (str == null || str.length() == 0);
        TextView textView = this.f88644n;
        D6.G(textView, z13);
        textView.setText(str);
        com.avito.android.advertising.ui.h.f88704a.getClass();
        com.avito.android.advertising.ui.h.h(textView, z12);
        D6.c(textView, null, Integer.valueOf(textView.getResources().getDimensionPixelOffset(z12 ? R.dimen.premium_ad_call_to_action_rounded_top_margin : R.dimen.premium_ad_call_to_action_top_margin)), null, Integer.valueOf(textView.getResources().getDimensionPixelOffset(z12 ? R.dimen.premium_ad_call_to_action_rounded_bottom_margin : R.dimen.premium_ad_call_to_action_bottom_margin)), 5);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void jV(@Y61.k ArrayList arrayList, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar2) {
        k kVar = this.f88637g;
        kVar.f88651w = null;
        kVar.f88652x = arrayList;
        kVar.f88653y = aVar;
        kVar.f88654z = aVar2;
        kVar.h();
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    @Y61.l
    public final Parcelable k2() {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.i
    public final void setTitle(@Y61.k String str) {
        this.f88638h.setText(str);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }

    public /* synthetic */ h(ForegroundRelativeLayout foregroundRelativeLayout, AdStyle adStyle, float f12, com.jakewharton.rxrelay3.c cVar, boolean z12, TV0.b bVar, TV0.b bVar2, int i12, C42822w c42822w) {
        this(foregroundRelativeLayout, adStyle, f12, cVar, z12, (i12 & 32) != 0 ? null : bVar, (i12 & 64) != 0 ? null : bVar2);
    }
}
