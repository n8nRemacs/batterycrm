package com.avito.android.gallery.ui;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParcelableClickStreamEvent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.gallery.ui.adapter.j;
import com.avito.android.remote.model.Image;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35961v3;
import iF.InterfaceC41279c;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: PhotoGalleryActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gallery/ui/PhotoGalleryActivity;", "Lcom/avito/android/ui/activity/a;", "LiF/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoGalleryActivity extends com.avito.android.ui.activity.a implements InterfaceC41279c, InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final a f159233u = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public SafeViewPager f159234m;

    /* renamed from: n, reason: collision with root package name */
    public Toolbar f159235n;

    /* renamed from: o, reason: collision with root package name */
    public int f159236o;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Toast f159238q;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f159240s;

    /* renamed from: p, reason: collision with root package name */
    public boolean f159237p = true;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Object f159239r = C35961v3.a(this);

    /* renamed from: t, reason: collision with root package name */
    @k
    public final c f159241t = new c();

    /* compiled from: PhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gallery/ui/PhotoGalleryActivity$a;", "", "<init>", "()V", "", "TOOLBAR_IS_SHOWN_KEY", "Ljava/lang/String;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            PhotoGalleryActivity photoGalleryActivity = PhotoGalleryActivity.this;
            if (photoGalleryActivity.f159237p) {
                Toolbar toolbar = photoGalleryActivity.f159235n;
                (toolbar != null ? toolbar : null).animate().translationY(-r3.getHeight()).alpha(0.0f).setInterpolator(new LinearInterpolator()).start();
                photoGalleryActivity.f159237p = false;
            } else {
                Toolbar toolbar2 = photoGalleryActivity.f159235n;
                (toolbar2 != null ? toolbar2 : null).animate().translationY(0.0f).alpha(1.0f).setInterpolator(new LinearInterpolator()).start();
                photoGalleryActivity.f159237p = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/gallery/ui/PhotoGalleryActivity$c", "Landroidx/viewpager/widget/ViewPager$l;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends ViewPager.l {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.C] */
        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            PhotoGalleryActivity photoGalleryActivity = PhotoGalleryActivity.this;
            photoGalleryActivity.getIntent().putExtra("image_position", i12);
            C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(photoGalleryActivity.getSupportFragmentManager().P()), com.avito.android.gallery.ui.a.f159247l));
            while (aVar.hasNext()) {
                ((j) aVar.next()).l0();
            }
            photoGalleryActivity.setTitle(photoGalleryActivity.getString(R.string.full_gallery_photo_title, Integer.valueOf(i12 + 1), Integer.valueOf(photoGalleryActivity.f159236o)));
            ParcelableClickStreamEvent parcelableClickStreamEvent = ((PhotoGalleryOpenParams) photoGalleryActivity.f159239r.getValue()).f159246d;
            if (parcelableClickStreamEvent != null) {
                InterfaceC28373a interfaceC28373a = photoGalleryActivity.f159240s;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                interfaceC28373a.c(parcelableClickStreamEvent);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.gallery.di.a.a().a((com.avito.android.gallery.di.b) C29972i.a(C29972i.b(this), com.avito.android.gallery.di.b.class)).a(this);
    }

    @Override // iF.InterfaceC41279c
    public final void i() {
        Toast toast = this.f159238q;
        if (toast != null) {
            toast.cancel();
        }
        if (this.f159238q == null) {
            this.f159238q = Toast.makeText(this, R.string.gallery_photo_load_error, 0);
        }
        Toast toast2 = this.f159238q;
        if (toast2 != null) {
            toast2.show();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 11) {
            if (i13 == -1) {
                SafeViewPager safeViewPager = this.f159234m;
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
            SafeViewPager safeViewPager2 = this.f159234m;
            if (safeViewPager2 == null) {
                safeViewPager2 = null;
            }
            if (safeViewPager2.getCurrentItem() <= 0) {
                finish();
            } else {
                SafeViewPager safeViewPager3 = this.f159234m;
                (safeViewPager3 == null ? null : safeViewPager3).setCurrentItem((safeViewPager3 != null ? safeViewPager3 : null).getCurrentItem() - 1);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        setResult(-1, getIntent());
        supportFinishAfterTransition();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        setContentView(R.layout.photogallery_activity);
        this.f159235n = (Toolbar) findViewById(R.id.toolbar);
        this.f159234m = (SafeViewPager) findViewById(R.id.view_pager);
        ?? r02 = this.f159239r;
        List<Image> list = ((PhotoGalleryOpenParams) r02.getValue()).f159244b;
        int i12 = ((PhotoGalleryOpenParams) r02.getValue()).f159245c;
        com.avito.android.gallery.ui.adapter.a aVar = new com.avito.android.gallery.ui.adapter.a(getSupportFragmentManager(), list, this, new b());
        this.f159237p = bundle != null ? bundle.getBoolean("TOOLBAR_IS_SHOWN_KEY") : true;
        this.f159236o = list.size();
        Toolbar toolbar = this.f159235n;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationIcon(C35835l0.m(toolbar.getContext(), R.attr.ic_arrowBack24, R.attr.constantWhite));
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 13));
        SafeViewPager safeViewPager = this.f159234m;
        if (safeViewPager == null) {
            safeViewPager = null;
        }
        safeViewPager.setOffscreenPageLimit(1);
        safeViewPager.setAdapter(aVar);
        safeViewPager.setCurrentItem(i12);
        safeViewPager.c(this.f159241t);
        setTitle(getString(R.string.full_gallery_photo_title, Integer.valueOf(i12 + 1), Integer.valueOf(this.f159236o)));
        if (!this.f159237p) {
            Toolbar toolbar2 = this.f159235n;
            Toolbar toolbar3 = toolbar2 != null ? toolbar2 : null;
            toolbar3.setAlpha(0.0f);
            toolbar3.setTranslationY(-toolbar3.getHeight());
        }
        getIntent().putExtra("image_position", i12);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@k Bundle bundle) {
        bundle.putBoolean("TOOLBAR_IS_SHOWN_KEY", this.f159237p);
        super.onSaveInstanceState(bundle);
    }
}
