package com.avito.android.photo_gallery;

import Cd.C13243a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.photo_gallery.di.B;
import com.avito.android.photo_gallery.di.C33183c;
import com.avito.android.remote.model.Video;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import i.b;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: PhotoGalleryActivity.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGalleryActivity;", "Lcom/avito/android/ui/activity/a;", "LR70/c;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoGalleryActivity extends com.avito.android.ui.activity.a implements R70.c, InterfaceC28477j.a {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f216648B = 0;

    /* renamed from: m, reason: collision with root package name */
    public SafeViewPager f216650m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Toast f216651n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f216652o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.player.router.d f216653p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public E80.c f216654q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.u f216655r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_download.feature.mvi.k f216656s;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f216658u;

    /* renamed from: w, reason: collision with root package name */
    public Toolbar f216660w;

    /* renamed from: x, reason: collision with root package name */
    public int f216661x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public String f216662y;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final O0 f216657t = new O0(m0.f406844a.b(com.avito.android.photo_download.feature.mvi.j.class), new f(), new e(new c()), new g());

    /* renamed from: v, reason: collision with root package name */
    public boolean f216659v = true;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final d f216663z = new d();

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f216649A = registerForActivityResult(new b.l(), new L91.o(this, 22));

    /* compiled from: PhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            PhotoGalleryActivity.this.onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            PhotoGalleryActivity photoGalleryActivity = PhotoGalleryActivity.this;
            if (photoGalleryActivity.f216659v) {
                Toolbar toolbar = photoGalleryActivity.f216660w;
                (toolbar != null ? toolbar : null).animate().translationY(-r3.getHeight()).alpha(0.0f).setInterpolator(new LinearInterpolator()).start();
                photoGalleryActivity.f216659v = false;
            } else {
                Toolbar toolbar2 = photoGalleryActivity.f216660w;
                (toolbar2 != null ? toolbar2 : null).animate().translationY(0.0f).alpha(1.0f).setInterpolator(new LinearInterpolator()).start();
                photoGalleryActivity.f216659v = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/photo_download/feature/mvi/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.photo_download.feature.mvi.j> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_download.feature.mvi.j invoke() {
            com.avito.android.photo_download.feature.mvi.k kVar = PhotoGalleryActivity.this.f216656s;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.photo_download.feature.mvi.j) kVar.get();
        }
    }

    /* compiled from: PhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/photo_gallery/PhotoGalleryActivity$d", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ViewPager.l {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            PhotoGalleryActivity photoGalleryActivity = PhotoGalleryActivity.this;
            photoGalleryActivity.getIntent().putExtra("image_position", i12);
            C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(photoGalleryActivity.getSupportFragmentManager().P()), C.f216479l));
            while (aVar.hasNext()) {
                ((T) aVar.next()).l0();
            }
            photoGalleryActivity.setTitle("Фото " + (i12 + 1) + " из " + photoGalleryActivity.f216661x);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f216668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f216668l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f216668l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return PhotoGalleryActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return PhotoGalleryActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, R.anim.gallery_fade_out);
        } else {
            overridePendingTransition(0, R.anim.gallery_fade_out);
        }
    }

    @Override // R70.c
    public final void i() {
        if (R70.g.a(this.f216651n)) {
            return;
        }
        Toast toast = this.f216651n;
        if (toast != null) {
            toast.cancel();
        }
        this.f216651n = L5.a(this, R.string.photo_load_error, 0);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 11) {
            if (i13 == -1) {
                SafeViewPager safeViewPager = this.f216650m;
                androidx.viewpager.widget.a adapter = (safeViewPager != null ? safeViewPager : null).getAdapter();
                if (adapter != null) {
                    adapter.h();
                    return;
                }
                return;
            }
            if (i13 != 0) {
                finish();
                return;
            }
            SafeViewPager safeViewPager2 = this.f216650m;
            if (safeViewPager2 == null) {
                safeViewPager2 = null;
            }
            if (safeViewPager2.getCurrentItem() <= 0) {
                finish();
            } else {
                SafeViewPager safeViewPager3 = this.f216650m;
                (safeViewPager3 == null ? null : safeViewPager3).setCurrentItem((safeViewPager3 != null ? safeViewPager3 : null).getCurrentItem() - 1);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        setResult(-1, getIntent());
        supportFinishAfterTransition();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        B.a aVarA = C33183c.a();
        aVarA.b((com.avito.android.photo_gallery.di.C) C29972i.a(C29972i.b(this), com.avito.android.photo_gallery.di.C.class));
        aVarA.build().a(this);
        setContentView(R.layout.ac_photogallery);
        PhotoGallerySwipeCloseView photoGallerySwipeCloseView = (PhotoGallerySwipeCloseView) findViewById(R.id.swipe_close_view);
        if (photoGallerySwipeCloseView != null) {
            photoGallerySwipeCloseView.setOnSwipeCloseListener(new a());
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f216660w = toolbar;
        setSupportActionBar(toolbar);
        Toolbar toolbar2 = this.f216660w;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new com.avito.android.order.feature.c(this, 17));
        Video video = (Video) getIntent().getParcelableExtra("video");
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("images");
        ArrayList arrayListB = com.avito.android.photo_gallery.adapter.p.b(video, null, parcelableArrayListExtra, null, null, true, null, null, null, null, 984);
        SafeViewPager safeViewPager = (SafeViewPager) findViewById(R.id.view_pager);
        this.f216650m = safeViewPager;
        safeViewPager.setOffscreenPageLimit(1);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        InterfaceC35845m2 interfaceC35845m2 = this.f216652o;
        InterfaceC35845m2 interfaceC35845m22 = interfaceC35845m2 != null ? interfaceC35845m2 : null;
        E80.c cVar = this.f216654q;
        E80.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.player.router.d dVar = this.f216653p;
        com.avito.android.photo_gallery.adapter.a aVar = new com.avito.android.photo_gallery.adapter.a(this, supportFragmentManager, arrayListB, null, this, interfaceC35845m22, dVar != null ? dVar : null, cVar2, false, new b(), null, null, null, null, null, null, null, null, 244744, null);
        SafeViewPager safeViewPager2 = this.f216650m;
        if (safeViewPager2 == null) {
            safeViewPager2 = null;
        }
        safeViewPager2.setAdapter(aVar);
        int intExtra = getIntent().getIntExtra("image_position", 0);
        SafeViewPager safeViewPager3 = this.f216650m;
        if (safeViewPager3 == null) {
            safeViewPager3 = null;
        }
        safeViewPager3.setCurrentItem(intExtra);
        int size = parcelableArrayListExtra.size();
        this.f216661x = size;
        setTitle("Фото " + (intExtra + 1) + " из " + size);
        SafeViewPager safeViewPager4 = this.f216650m;
        if (safeViewPager4 == null) {
            safeViewPager4 = null;
        }
        safeViewPager4.c(this.f216663z);
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(R.drawable.ic_arrow_back_white_24dp);
        }
        boolean z12 = bundle != null ? bundle.getBoolean("TOOLBAR_IS_SHOWN_KEY") : true;
        this.f216659v = z12;
        if (!z12) {
            Toolbar toolbar3 = this.f216660w;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            toolbar3.setAlpha(0.0f);
            toolbar3.setTranslationY(-toolbar3.getHeight());
        }
        if (getIntent().getBooleanExtra("is_download_available", false) && video == null) {
            C43259k.d(C22981N.a(getLifecycle()), null, null, new B(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@Y61.k Menu menu) {
        if (getIntent().getBooleanExtra("is_download_available", false)) {
            getMenuInflater().inflate(R.menu.photo_gallery_toolbar_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // com.avito.android.ui.activity.a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(@Y61.k android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = r7.getItemId()
            r1 = 2131369144(0x7f0a1cb8, float:1.8358258E38)
            if (r0 != r1) goto Lc0
            com.avito.android.ui.SafeViewPager r7 = r6.f216650m
            r0 = 0
            if (r7 != 0) goto Lf
            r7 = r0
        Lf:
            int r7 = r7.getCurrentItem()
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "images"
            java.util.ArrayList r1 = r1.getParcelableArrayListExtra(r2)
            java.lang.Object r7 = kotlin.collections.C42745f0.K(r7, r1)
            com.avito.android.remote.model.Image r7 = (com.avito.android.remote.model.Image) r7
            if (r7 == 0) goto L8b
            java.util.Map r7 = r7.getVariants()
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L3b
            r1 = r0
            goto L78
        L3b:
            java.lang.Object r1 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L46
            goto L78
        L46:
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            com.avito.android.remote.model.Size r2 = (com.avito.android.remote.model.Size) r2
            int r3 = r2.getHeight()
            int r2 = r2.getWidth()
            int r2 = r2 * r3
        L58:
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            com.avito.android.remote.model.Size r4 = (com.avito.android.remote.model.Size) r4
            int r5 = r4.getHeight()
            int r4 = r4.getWidth()
            int r4 = r4 * r5
            if (r2 >= r4) goto L72
            r1 = r3
            r2 = r4
        L72:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L58
        L78:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L83
            java.lang.Object r7 = r1.getValue()
            android.net.Uri r7 = (android.net.Uri) r7
            goto L84
        L83:
            r7 = r0
        L84:
            if (r7 == 0) goto L8b
            java.lang.String r7 = r7.toString()
            goto L8c
        L8b:
            r7 = r0
        L8c:
            if (r7 != 0) goto L90
            java.lang.String r7 = ""
        L90:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "analytics_params"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.avito.android.photo_gallery.PhotoGalleryIntentFactory$AnalyticsParameters r1 = (com.avito.android.photo_gallery.PhotoGalleryIntentFactory.AnalyticsParameters) r1
            com.avito.android.analytics.a r2 = r6.f216658u
            if (r2 == 0) goto La1
            goto La2
        La1:
            r2 = r0
        La2:
            if (r1 == 0) goto La6
            java.lang.String r0 = r1.f216671b
        La6:
            H70.a r1 = new H70.a
            r1.<init>(r7, r0)
            r2.c(r1)
            androidx.lifecycle.O0 r0 = r6.f216657t
            java.lang.Object r0 = r0.getValue()
            com.avito.android.photo_download.feature.mvi.j r0 = (com.avito.android.photo_download.feature.mvi.j) r0
            J70.a$a r1 = new J70.a$a
            r1.<init>(r7)
            r0.accept(r1)
            r7 = 1
            goto Lc4
        Lc0:
            boolean r7 = super.onOptionsItemSelected(r7)
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.PhotoGalleryActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        bundle.putBoolean("TOOLBAR_IS_SHOWN_KEY", this.f216659v);
        super.onSaveInstanceState(bundle);
    }

    @Override // R70.c
    public final void l() {
    }
}
