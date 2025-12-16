package com.avito.android.review_gallery;

import Cd.C13243a;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.adapter.gallery.m;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ReviewGalleryScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import com.avito.android.review_gallery.adapter.ReviewGalleryFragment;
import com.avito.android.review_gallery.di.c;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import gn0.C40714c;
import gn0.InterfaceC40712a;
import gn0.InterfaceC40713b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import z1.AbstractC50339a;

/* compiled from: ReviewGalleryActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/review_gallery/ReviewGalleryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/review_gallery/adapter/ReviewGalleryFragment$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewGalleryActivity extends com.avito.android.ui.activity.a implements ReviewGalleryFragment.a, InterfaceC28477j.b {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f255437y = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f255438m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f255440o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.review_gallery.router.a f255441p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public Pv0.b f255442q;

    /* renamed from: r, reason: collision with root package name */
    public ViewPager2 f255443r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public com.avito.android.review_gallery.h f255444s;

    /* renamed from: t, reason: collision with root package name */
    public Toolbar f255445t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup f255446u;

    /* renamed from: v, reason: collision with root package name */
    public com.avito.android.review_gallery.adapter.a f255447v;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f255439n = new O0(m0.f406844a.b(com.avito.android.review_gallery.j.class), new h(), new g(new j()), new i());

    /* renamed from: w, reason: collision with root package name */
    public boolean f255448w = true;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final f f255449x = new f();

    /* compiled from: ReviewGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/review_gallery/ReviewGalleryActivity$a;", "", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ReviewGalleryActivity.f255437y;
            ReviewGalleryActivity reviewGalleryActivity = ReviewGalleryActivity.this;
            GalleryItem.GalleyReview galleyReviewA2 = reviewGalleryActivity.a2();
            if (galleyReviewA2 != null) {
                reviewGalleryActivity.b2().accept(new InterfaceC40712a.c(galleyReviewA2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem$GalleryButton;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/adapter/gallery/GalleryItem$GalleryButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<GalleryItem.GalleryButton, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(GalleryItem.GalleryButton galleryButton) {
            a aVar = ReviewGalleryActivity.f255437y;
            ReviewGalleryActivity.this.b2().accept(new InterfaceC40712a.b(galleryButton));
            return G0.f406611a;
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC40713b, G0> {
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC40713b interfaceC40713b) {
            GalleryItem.GalleyReview galleyReviewA2;
            GalleryItem galleryItemA;
            InterfaceC40713b interfaceC40713b2 = interfaceC40713b;
            ReviewGalleryActivity reviewGalleryActivity = (ReviewGalleryActivity) this.receiver;
            a aVar = ReviewGalleryActivity.f255437y;
            reviewGalleryActivity.getClass();
            if (L.f(interfaceC40713b2, InterfaceC40713b.C11230b.f396853a)) {
                reviewGalleryActivity.finish();
            } else {
                if (interfaceC40713b2 instanceof InterfaceC40713b.d) {
                    DeepLink deepLink = ((InterfaceC40713b.d) interfaceC40713b2).f396855a;
                    if (deepLink != null) {
                        com.avito.android.review_gallery.router.a aVar2 = reviewGalleryActivity.f255441p;
                        (aVar2 != null ? aVar2 : null).g(deepLink);
                    }
                } else if (interfaceC40713b2 instanceof InterfaceC40713b.a) {
                    InterfaceC40713b.a aVar3 = (InterfaceC40713b.a) interfaceC40713b2;
                    Pv0.b bVar = reviewGalleryActivity.f255442q;
                    if (bVar == null) {
                        bVar = null;
                    }
                    GalleryItem galleryItem = bVar.read();
                    if (galleryItem != null) {
                        m mVar = aVar3.f396852a;
                        galleryItemA = GalleryItem.a(galleryItem, O2.b(galleryItem.f68403e, mVar.f68471a), O2.b(galleryItem.f68405g, mVar.f68472b), mVar.f68473c);
                    } else {
                        galleryItemA = null;
                    }
                    if (galleryItemA != null) {
                        com.avito.android.review_gallery.adapter.a aVar4 = reviewGalleryActivity.f255447v;
                        if (aVar4 == null) {
                            aVar4 = null;
                        }
                        List<GalleryItem.GalleryImage> list = galleryItemA.f68405g;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((GalleryItem.GalleryImage) it.next()).f68425b);
                        }
                        aVar4.f255465l = arrayList;
                        aVar4.notifyDataSetChanged();
                        Pv0.b bVar2 = reviewGalleryActivity.f255442q;
                        (bVar2 != null ? bVar2 : null).a(galleryItemA);
                    }
                } else if ((interfaceC40713b2 instanceof InterfaceC40713b.c) && (galleyReviewA2 = reviewGalleryActivity.a2()) != null && reviewGalleryActivity.getSupportFragmentManager().H("bottomSheetDialogTag") == null) {
                    com.avito.android.review_gallery.dialog.b.a(galleyReviewA2).show(reviewGalleryActivity.getSupportFragmentManager(), "bottomSheetDialogTag");
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<C40714c, G0> {
        @Override // Y41.l
        public final G0 invoke(C40714c c40714c) {
            C40714c c40714c2 = c40714c;
            com.avito.android.review_gallery.h hVar = ((ReviewGalleryActivity) this.receiver).f255444s;
            if (hVar != null) {
                hVar.f255501c.setOnClickListener(new com.avito.android.review_gallery.g(hVar, 0));
                String str = hVar.f255515q;
                String str2 = c40714c2.f396858c;
                com.avito.android.review_gallery.h.a(hVar.f255502d, hVar.f255503e, str2, str);
                String str3 = hVar.f255516r;
                TextView textView = hVar.f255504f;
                TextView textView2 = hVar.f255505g;
                String str4 = c40714c2.f396860e;
                com.avito.android.review_gallery.h.a(textView, textView2, str4, str3);
                RatingBar ratingBar = hVar.f255506h;
                Float f12 = c40714c2.f396859d;
                if (f12 != null) {
                    ratingBar.setRating(f12.floatValue());
                    D6.H(ratingBar);
                } else {
                    D6.w(ratingBar);
                }
                hVar.f255507i.setText(c40714c2.f396861f);
                Image image = c40714c2.f396862g;
                C35949t5.c(hVar.f255508j, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
                hVar.f255509k.setText(c40714c2.f396863h);
                hVar.f255510l.setText(c40714c2.f396864i);
                TextView textView3 = hVar.f255511m;
                String str5 = c40714c2.f396865j;
                textView3.setText(str5);
                D6.G(hVar.f255512n, true ^ (str5 == null || str5.length() == 0));
                GalleryItem.GalleryButton galleryButton = c40714c2.f396866k;
                if (galleryButton != null) {
                    hVar.b(hVar.f255513o, galleryButton);
                    hVar.b(hVar.f255514p, c40714c2.f396867l);
                }
                hVar.f255515q = str2;
                hVar.f255516r = str4;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/review_gallery/ReviewGalleryActivity$f", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends ViewPager2.i {
        public f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            ReviewGalleryActivity reviewGalleryActivity = ReviewGalleryActivity.this;
            int intExtra = reviewGalleryActivity.getIntent().getIntExtra("position", 0);
            Pv0.b bVar = reviewGalleryActivity.f255442q;
            if (bVar == null) {
                bVar = null;
            }
            GalleryItem galleryItem = bVar.read();
            if (galleryItem != null) {
                reviewGalleryActivity.b2().accept(new InterfaceC40712a.d(intExtra, i12, galleryItem));
            }
            reviewGalleryActivity.getIntent().putExtra("position", i12);
            C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(reviewGalleryActivity.getSupportFragmentManager().P()), com.avito.android.review_gallery.c.f255476l));
            while (aVar.hasNext()) {
                ((com.avito.android.review_gallery.adapter.f) aVar.next()).l0();
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f255453l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f255453l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f255453l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ReviewGalleryActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ReviewGalleryActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ReviewGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/review_gallery/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/review_gallery/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.review_gallery.j> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.review_gallery.j invoke() {
            k kVar = ReviewGalleryActivity.this.f255438m;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.review_gallery.j) kVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((c.b) C29972i.a(C29972i.b(this), c.b.class)).nh().a(ReviewGalleryScreen.f90465d, s.a(this), getIntent().getStringExtra("from_page"), getIntent().getStringExtra("item_id"), getIntent().getIntExtra("position", 0), cv.c.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f255440o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f255440o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final GalleryItem.GalleyReview a2() {
        List<GalleryItem.GalleyReview> list;
        Pv0.b bVar = this.f255442q;
        Object obj = null;
        if (bVar == null) {
            bVar = null;
        }
        GalleryItem galleryItem = bVar.read();
        int intExtra = getIntent().getIntExtra("position", 0);
        if (galleryItem == null || (list = galleryItem.f68403e) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((GalleryItem.GalleyReview) next).f68427b, galleryItem.f68405g.get(intExtra).f68426c)) {
                obj = next;
                break;
            }
        }
        return (GalleryItem.GalleyReview) obj;
    }

    public final com.avito.android.review_gallery.j b2() {
        return (com.avito.android.review_gallery.j) this.f255439n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        b2().accept(InterfaceC40712a.C11229a.f396844a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        ArrayList arrayList;
        List<GalleryItem.GalleryImage> list;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f255440o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.activity_review_gallery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f255445t = toolbar;
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.review_gallery.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ReviewGalleryActivity f255475c;

            {
                this.f255475c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewGalleryActivity reviewGalleryActivity = this.f255475c;
                switch (i12) {
                    case 0:
                        ReviewGalleryActivity.a aVar = ReviewGalleryActivity.f255437y;
                        reviewGalleryActivity.onBackPressed();
                        break;
                    default:
                        if (!reviewGalleryActivity.f255448w) {
                            Toolbar toolbar2 = reviewGalleryActivity.f255445t;
                            if (toolbar2 == null) {
                                toolbar2 = null;
                            }
                            D6.n(toolbar2, 250L);
                            ViewGroup viewGroup = reviewGalleryActivity.f255446u;
                            D6.n(viewGroup != null ? viewGroup : null, 250L);
                            reviewGalleryActivity.f255448w = true;
                            break;
                        } else {
                            Toolbar toolbar3 = reviewGalleryActivity.f255445t;
                            if (toolbar3 == null) {
                                toolbar3 = null;
                            }
                            D6.o(toolbar3, 250L);
                            ViewGroup viewGroup2 = reviewGalleryActivity.f255446u;
                            D6.o(viewGroup2 != null ? viewGroup2 : null, 250L);
                            reviewGalleryActivity.f255448w = false;
                            break;
                        }
                }
            }
        });
        Toolbar toolbar2 = this.f255445t;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        setSupportActionBar(toolbar2);
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.gallery_content);
        this.f255446u = viewGroup;
        this.f255444s = new com.avito.android.review_gallery.h(viewGroup, new b(), new c());
        Pv0.b bVar = this.f255442q;
        if (bVar == null) {
            bVar = null;
        }
        GalleryItem galleryItem = bVar.read();
        if (galleryItem == null || (list = galleryItem.f68405g) == null) {
            arrayList = null;
        } else {
            List<GalleryItem.GalleryImage> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((GalleryItem.GalleryImage) it.next()).f68425b);
            }
        }
        getSupportFragmentManager().p0("detailsDialog", this, new com.avito.android.offlinization.ui.a(this, 13));
        this.f255443r = (ViewPager2) findViewById(R.id.gallery_view_pager);
        if (arrayList != null) {
            this.f255447v = new com.avito.android.review_gallery.adapter.a(this, this, arrayList);
        }
        ViewPager2 viewPager2 = this.f255443r;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        com.avito.android.review_gallery.adapter.a aVar = this.f255447v;
        if (aVar == null) {
            aVar = null;
        }
        viewPager2.setAdapter(aVar);
        ViewPager2 viewPager22 = this.f255443r;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        viewPager22.setOffscreenPageLimit(3);
        ViewPager2 viewPager23 = this.f255443r;
        if (viewPager23 == null) {
            viewPager23 = null;
        }
        final int i13 = 1;
        viewPager23.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.review_gallery.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ReviewGalleryActivity f255475c;

            {
                this.f255475c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewGalleryActivity reviewGalleryActivity = this.f255475c;
                switch (i13) {
                    case 0:
                        ReviewGalleryActivity.a aVar2 = ReviewGalleryActivity.f255437y;
                        reviewGalleryActivity.onBackPressed();
                        break;
                    default:
                        if (!reviewGalleryActivity.f255448w) {
                            Toolbar toolbar22 = reviewGalleryActivity.f255445t;
                            if (toolbar22 == null) {
                                toolbar22 = null;
                            }
                            D6.n(toolbar22, 250L);
                            ViewGroup viewGroup2 = reviewGalleryActivity.f255446u;
                            D6.n(viewGroup2 != null ? viewGroup2 : null, 250L);
                            reviewGalleryActivity.f255448w = true;
                            break;
                        } else {
                            Toolbar toolbar3 = reviewGalleryActivity.f255445t;
                            if (toolbar3 == null) {
                                toolbar3 = null;
                            }
                            D6.o(toolbar3, 250L);
                            ViewGroup viewGroup22 = reviewGalleryActivity.f255446u;
                            D6.o(viewGroup22 != null ? viewGroup22 : null, 250L);
                            reviewGalleryActivity.f255448w = false;
                            break;
                        }
                }
            }
        });
        int iIndexOf = 0;
        int intExtra = getIntent().getIntExtra("position", 0);
        ViewPager2 viewPager24 = this.f255443r;
        if (viewPager24 == null) {
            viewPager24 = null;
        }
        viewPager24.setCurrentItem(intExtra);
        ViewPager2 viewPager25 = this.f255443r;
        if (viewPager25 == null) {
            viewPager25 = null;
        }
        viewPager25.e(this.f255449x);
        GalleryItem.GalleyReview galleyReviewA2 = a2();
        if (galleyReviewA2 != null) {
            com.avito.android.review_gallery.j jVarB2 = b2();
            List<TnsGalleryImage> list3 = galleyReviewA2.f68432g;
            if (list3 != null) {
                iIndexOf = list3.indexOf(arrayList != null ? (TnsGalleryImage) arrayList.get(intExtra) : null);
            }
            jVarB2.accept(new InterfaceC40712a.e(iIndexOf, galleyReviewA2.f68427b));
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f255440o;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, b2(), new d(1, this, ReviewGalleryActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryOneTimeEvent;)V", 0), new e(1, this, ReviewGalleryActivity.class, "render", "render(Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f255440o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        ViewPager2 viewPager2 = this.f255443r;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.i(this.f255449x);
        super.onDestroy();
    }
}
