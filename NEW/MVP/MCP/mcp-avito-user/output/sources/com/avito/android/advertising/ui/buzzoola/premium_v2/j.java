package com.avito.android.advertising.ui.buzzoola.premium_v2;

import Y61.l;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.buzzoola.c;
import com.avito.android.advertising.ui.c;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.util.V2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.facebook.drawee.drawable.s;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;

/* compiled from: BuzzoolaPremiumV2View.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium_v2/j;", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/c;", "Lcom/avito/android/serp/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.android.serp.c implements com.avito.android.advertising.ui.buzzoola.premium_v2.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ForegroundRelativeLayout f88684b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f88685c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdStyle f88686d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TV0.b<?, ?> f88687e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TV0.b<?, ?> f88688f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final TV0.b<?, ?> f88689g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f88690h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f88691i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final RatioForegroundFrameLayout f88692j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.ui.buzzoola.premium.k f88693k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.adapter.items.buzzoola.premium.a f88694l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88695m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f88696n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f88697o;

    /* compiled from: BuzzoolaPremiumV2View.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f88698b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((com.avito.android.cyclic_gallery_widget.image_carousel.i) obj) instanceof i.e;
        }
    }

    /* compiled from: BuzzoolaPremiumV2View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;", "it", "", "apply", "(Lcom/avito/android/cyclic_gallery_widget/image_carousel/i$e;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f88699b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(((i.e) obj).f132022a);
        }
    }

    /* compiled from: BuzzoolaPremiumV2View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f88700b;

        public c(Y41.a<G0> aVar) {
            this.f88700b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).intValue();
            this.f88700b.invoke();
        }
    }

    /* compiled from: BuzzoolaPremiumV2View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f88701b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdBuzzoolaPremium", "Click image error", (Throwable) obj);
        }
    }

    public j(@Y61.k ForegroundRelativeLayout foregroundRelativeLayout, float f12, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar, @Y61.k AdStyle adStyle, @Y61.k TV0.b<?, ?> bVar, @l TV0.b<?, ?> bVar2, @l TV0.b<?, ?> bVar3) throws BlueprintCollisionException {
        super(foregroundRelativeLayout);
        this.f88684b = foregroundRelativeLayout;
        this.f88685c = cVar;
        this.f88686d = adStyle;
        this.f88687e = bVar;
        this.f88688f = bVar2;
        this.f88689g = bVar3;
        boolean zB2 = adStyle.b();
        boolean z12 = !zB2;
        View viewFindViewById = foregroundRelativeLayout.findViewById(R.id.gallery);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f88691i = recyclerView;
        View viewFindViewById2 = foregroundRelativeLayout.findViewById(R.id.gallery_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.util.layout.RatioForegroundFrameLayout");
        }
        this.f88692j = (RatioForegroundFrameLayout) viewFindViewById2;
        this.f88697o = new io.reactivex.rxjava3.disposables.c();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(new com.avito.android.cyclic_gallery_widget.image_carousel.r(new u(f12, cVar), !zB2 ? s.c.f340137i : null, Integer.valueOf(R.color.common_gray_4), null, null, null, 56, null));
        c10493a.b(bVar);
        if (bVar2 != null) {
            c10493a.b(bVar2);
        }
        if (bVar3 != null) {
            c10493a.b(bVar3);
        }
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.android.advertising.ui.buzzoola.premium.k kVar = new com.avito.android.advertising.ui.buzzoola.premium.k(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, z12);
        this.f88693k = kVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(foregroundRelativeLayout.getContext()).inflate(R.layout.buzzoola_premium_badges, (ViewGroup) null);
        this.f88695m = viewGroup;
        this.f88696n = (TextView) viewGroup.findViewById(R.id.advertising_badge);
        View viewFindViewById3 = viewGroup.findViewById(R.id.domain_badge);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(8);
        }
        com.avito.android.advertising.adapter.items.buzzoola.premium.a aVar = new com.avito.android.advertising.adapter.items.buzzoola.premium.a(viewGroup, C42756l.l0(new Integer[]{Integer.valueOf(aVarA.Y(com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.c.class)), Integer.valueOf(aVarA.Y(com.avito.android.cyclic_gallery_widget.image_carousel.r.class))}));
        this.f88694l = aVar;
        kVar.a(aVar);
        if (adStyle.b()) {
            return;
        }
        recyclerView.n(new com.avito.android.advertising.ui.buzzoola.premium_v2.d(this, new GestureDetector(viewGroup.getContext(), new e(this))));
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void H0() {
        this.f88697o.e();
        S3(null);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void H1(@l Parcelable parcelable) {
        com.avito.android.advertising.ui.buzzoola.premium.k kVar = this.f88693k;
        if (parcelable == null) {
            kVar.e();
        } else {
            kVar.f(parcelable);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void NG(@Y61.k com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.a aVar, @Y61.k ArrayList arrayList, @l com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar2, @l com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar3) {
        com.avito.android.advertising.ui.buzzoola.premium.k kVar = this.f88693k;
        kVar.f88651w = aVar;
        kVar.f88652x = arrayList;
        kVar.f88653y = aVar2;
        kVar.f88654z = aVar3;
        kVar.h();
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void P1(@l Y41.l<? super Integer, G0> lVar) {
        this.f88693k.f132081p = (N) lVar;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final void Q10(boolean z12) {
        c.a.a(this, z12);
        this.f88694l.f87384e = false;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void S3(@l View.OnClickListener onClickListener) {
        this.f88696n.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    @Y61.k
    /* renamed from: V6, reason: from getter */
    public final TextView getF88696n() {
        return this.f88696n;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f88697o.b(this.f88685c.N(a.f88698b).g(i.e.class).d0(b.f88699b).v0(new c(aVar), d.f88701b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    public final void d(@l Y41.a<G0> aVar) {
        this.f88690h = aVar;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF88601c() {
        return this.f88686d;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.c
    public final View getView() {
        return this.f88684b;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f88690h;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f88690h = null;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium_v2.c
    @l
    public final Parcelable k2() {
        return this.f88693k.c();
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }

    public /* synthetic */ j(ForegroundRelativeLayout foregroundRelativeLayout, float f12, com.jakewharton.rxrelay3.c cVar, AdStyle adStyle, TV0.b bVar, TV0.b bVar2, TV0.b bVar3, int i12, C42822w c42822w) {
        this(foregroundRelativeLayout, f12, cVar, adStyle, bVar, (i12 & 32) != 0 ? null : bVar2, (i12 & 64) != 0 ? null : bVar3);
    }
}
