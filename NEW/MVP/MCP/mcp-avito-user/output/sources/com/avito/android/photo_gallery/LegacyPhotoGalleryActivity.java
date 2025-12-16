package com.avito.android.photo_gallery;

import X70.c;
import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.U;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.InterfaceC23487e;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import com.avito.android.di.C29972i;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.lib.design.button.Button;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.di.C33182b;
import com.avito.android.photo_gallery.di.k;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBarAuthData;
import com.avito.android.photo_gallery.realty_layouts.RealtyDelegateState;
import com.avito.android.photo_gallery.ui.ImageLabel;
import com.avito.android.player.player_fragment.PlayerFragmentAction;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.images_groups.ImageGroup;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.avito.android.util.L5;
import com.avito.android.util.O2;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ur.InterfaceC49101b;

/* compiled from: LegacyPhotoGalleryActivity.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_gallery/LegacyPhotoGalleryActivity;", "Lcom/avito/android/ui/activity/a;", "LR70/c;", "LR70/d;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "DS_TCH_BDGT_ARCHITECTURE [Forbidden]"})
/* loaded from: classes14.dex */
public final class LegacyPhotoGalleryActivity extends com.avito.android.ui.activity.a implements R70.c, R70.d, InterfaceC28477j.b {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f216531m0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public C29640d f216532A;

    /* renamed from: B, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f216533B;

    /* renamed from: C, reason: collision with root package name */
    @Inject
    public InterfaceC28265d f216534C;

    /* renamed from: D, reason: collision with root package name */
    @Inject
    public InterfaceC35945t1<String> f216535D;

    /* renamed from: E, reason: collision with root package name */
    @Inject
    public InterfaceC35741a1 f216536E;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public W70.f f216537F;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.data.a f216538G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f216539H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.d f216540I;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public R0 f216541J;

    /* renamed from: K, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_gallery.nav_bar.a f216542K;

    /* renamed from: L, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f216543L;

    /* renamed from: M, reason: collision with root package name */
    @Inject
    public InterfaceC49101b f216544M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public String f216545N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public String f216546O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public String f216547P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public TreeClickStreamParent f216548Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.adapter.a f216549R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Long f216550S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public AdvertActions f216551T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public ContactBarData f216552U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.contactbar.A f216553V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public Object f216554W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public Object f216555X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public Button f216556Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f216557Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public z f216558a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public A f216559b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f216560c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f216561d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f216562e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f216563f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f216564g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f216565h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f216566i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final Object f216567j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public P f216568k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final r f216569l0;

    /* renamed from: m, reason: collision with root package name */
    public SafeViewPager f216570m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public View f216571n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public View f216572o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public ImageView f216573p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.ui.g f216574q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public ImageLabel f216575r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Toast f216576s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f216577t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f216578u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public com.avito.android.player.router.d f216579v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public yf.m f216580w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public E80.c f216581x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f216582y;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.sheet.j f216583z;

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/LegacyPhotoGalleryActivity$a;", "", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PlayerFragmentAction.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PlayerFragmentAction playerFragmentAction = PlayerFragmentAction.f220209b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PlayerFragmentAction playerFragmentAction2 = PlayerFragmentAction.f220209b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PlayerFragmentAction playerFragmentAction3 = PlayerFragmentAction.f220209b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = (LegacyPhotoGalleryActivity) this.receiver;
            com.avito.android.advert_core.contactbar.A a12 = legacyPhotoGalleryActivity.f216553V;
            if (a12 != null) {
                a12.W6(legacyPhotoGalleryActivity.f216557Z, (4 & 2) == 0, false);
            }
            legacyPhotoGalleryActivity.a2(legacyPhotoGalleryActivity.f216557Z, false);
            legacyPhotoGalleryActivity.h2(legacyPhotoGalleryActivity.f216557Z);
            P p12 = legacyPhotoGalleryActivity.f216568k0;
            if (p12 != null) {
                boolean z12 = legacyPhotoGalleryActivity.f216557Z;
                if (p12.f216636o) {
                    Button button = p12.f216625d;
                    Button button2 = p12.f216630i;
                    if (z12) {
                        D6.w(button2);
                        D6.w(button);
                    } else if (p12.f216643v) {
                        D6.w(button2);
                        D6.H(button);
                    } else {
                        D6.H(button2);
                        D6.w(button);
                    }
                }
                Button button3 = p12.f216635n;
                if (z12) {
                    D6.w(button3);
                } else if (p12.f216619B.contains(Integer.valueOf(p12.f216642u))) {
                    D6.H(button3);
                }
            }
            legacyPhotoGalleryActivity.f216557Z = !legacyPhotoGalleryActivity.f216557Z;
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = (LegacyPhotoGalleryActivity) this.receiver;
            String str = legacyPhotoGalleryActivity.f216546O;
            if (str != null) {
                InterfaceC28373a interfaceC28373a = legacyPhotoGalleryActivity.f216533B;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                interfaceC28373a.c(new z8.d(legacyPhotoGalleryActivity.f216548Q, str, true));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            TreeClickStreamParent treeClickStreamParent;
            String str;
            String str2;
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = (LegacyPhotoGalleryActivity) this.receiver;
            C29640d c29640d = legacyPhotoGalleryActivity.f216532A;
            if (c29640d == null) {
                c29640d = null;
            }
            if (c29640d.v().invoke().booleanValue() && (treeClickStreamParent = legacyPhotoGalleryActivity.f216548Q) != null && (str = legacyPhotoGalleryActivity.f216546O) != null && (str2 = legacyPhotoGalleryActivity.f216547P) != null) {
                InterfaceC28373a interfaceC28373a = legacyPhotoGalleryActivity.f216533B;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new P70.c(treeClickStreamParent, str, str2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            P p12 = ((LegacyPhotoGalleryActivity) this.receiver).f216568k0;
            if (p12 != null) {
                if (!p12.f216619B.contains(Integer.valueOf(iIntValue))) {
                    p12.f216619B.add(Integer.valueOf(iIntValue));
                }
                if (p12.f216642u == iIntValue) {
                    p12.d();
                    D6.H(p12.f216635n);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2;
            String str3 = str;
            P p12 = ((LegacyPhotoGalleryActivity) this.receiver).f216568k0;
            if (p12 != null && (str2 = p12.f216623b) != null) {
                p12.f216624c.c(new P8.c(str2, str3));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            String str;
            P p12 = LegacyPhotoGalleryActivity.this.f216568k0;
            if (p12 != null && (str = p12.f216623b) != null) {
                p12.f216624c.c(new P8.b(str));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SafeViewPager f216585b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LegacyPhotoGalleryActivity f216586c;

        public i(SafeViewPager safeViewPager, LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
            this.f216585b = safeViewPager;
            this.f216586c = legacyPhotoGalleryActivity;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f216586c;
            SafeViewPager safeViewPager = legacyPhotoGalleryActivity.f216570m;
            if (safeViewPager == null) {
                safeViewPager = null;
            }
            View childAt = safeViewPager.getChildAt(0);
            if (childAt != null) {
                AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
                ImageViewportEvent imageViewportEvent = new ImageViewportEvent(childAt.getWidth(), childAt.getHeight(), "advertisement_full_gallery", null, null, null, null, 120, null);
                InterfaceC28373a interfaceC28373a = legacyPhotoGalleryActivity.f216533B;
                C28456h.a(interfaceC28373a != null ? interfaceC28373a : null, imageViewportEvent);
            }
            this.f216585b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((LegacyPhotoGalleryActivity) this.receiver).onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = LegacyPhotoGalleryActivity.this;
            legacyPhotoGalleryActivity.f216563f0 = true;
            legacyPhotoGalleryActivity.onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Map<Integer, Image> map;
            a aVar = LegacyPhotoGalleryActivity.f216531m0;
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = LegacyPhotoGalleryActivity.this;
            return Boolean.valueOf(((Boolean) legacyPhotoGalleryActivity.f216564g0.getValue()).booleanValue() || !((map = legacyPhotoGalleryActivity.d2().f216614y) == null || map.isEmpty()));
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<String> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return LegacyPhotoGalleryActivity.this.getString(R.string.advert_core_realty_layout_label);
        }
    }

    /* compiled from: LegacyPhotoGalleryActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            a aVar = LegacyPhotoGalleryActivity.f216531m0;
            LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = LegacyPhotoGalleryActivity.this;
            return Boolean.valueOf(O2.a(legacyPhotoGalleryActivity.d2().f216594e) || O2.a(legacyPhotoGalleryActivity.d2().f216593d));
        }
    }

    public LegacyPhotoGalleryActivity() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f216554W = c42784z0;
        this.f216555X = c42784z0;
        this.f216557Z = true;
        this.f216562e0 = C42727D.c(new m());
        this.f216564g0 = C42727D.c(new n());
        this.f216565h0 = C42727D.c(new l());
        this.f216567j0 = C35961v3.a(this);
        this.f216569l0 = new r(this);
    }

    public static void i2(View view, boolean z12) {
        view.animate().alpha(z12 ? 0.0f : 1.0f).setDuration(200L).withStartAction(new U(view, 6)).withEndAction(new D.b(12, view, z12)).start();
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.ac_legacy_photogallery_contactbar;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ArrayList arrayListA;
        Object gVar;
        Object cVar;
        Image image;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Kundle kundleA = bundle != null ? com.avito.android.util.G.a(bundle, "dealConfirmationState") : null;
        this.f216550S = d2().f216605p;
        this.f216551T = d2().f216602m;
        this.f216552U = d2().f216603n;
        this.f216546O = d2().f216599j;
        this.f216545N = d2().f216606q;
        this.f216547P = d2().f216600k;
        this.f216548Q = d2().f216601l;
        k.a aVarA = C33182b.a();
        aVarA.d(this);
        aVarA.c(com.avito.android.analytics.screens.s.a(this));
        aVarA.e(getResources());
        aVarA.h(this.f216548Q);
        BannerPageSource bannerPageSource = BannerPageSource.f87777c;
        aVarA.s();
        aVarA.b((com.avito.android.photo_gallery.di.C) C29972i.a(C29972i.b(this), com.avito.android.photo_gallery.di.C.class));
        aVarA.a(cv.c.a(this));
        aVarA.i(kundleA);
        aVarA.g(getF42820b());
        aVarA.f(C22981N.a(getLifecycle()));
        aVarA.build().a(this);
        if (d2().f216610u) {
            I i12 = I.f216526a;
            Video video = d2().f216597h;
            NativeVideo nativeVideo = d2().f216598i;
            List<Image> list = d2().f216591b;
            List<Integer> list2 = d2().f216593d;
            List<Image> list3 = d2().f216594e;
            Map<Integer, Image> map = d2().f216614y;
            GalleryTeaser galleryTeaser = d2().f216608s;
            List<BeduinItemTeaser> list4 = d2().f216609t;
            AutotekaTeaserResult autotekaTeaserResult = d2().f216607r;
            i12.getClass();
            X70.a.f18643a.getClass();
            ArrayList arrayListA2 = X70.a.a(nativeVideo, video, autotekaTeaserResult, galleryTeaser, list, list2, list3, list4, map, true);
            arrayListA = new ArrayList();
            Iterator it = arrayListA2.iterator();
            while (it.hasNext()) {
                X70.c cVar2 = (X70.c) it.next();
                if (cVar2 instanceof c.b) {
                    gVar = new q.b(((c.b) cVar2).f18645a);
                } else if (cVar2 instanceof c.d) {
                    gVar = new q.d(((c.d) cVar2).f18649a);
                } else if (cVar2 instanceof c.e) {
                    gVar = new q.f(((c.e) cVar2).f18650a);
                } else if (cVar2 instanceof c.f) {
                    gVar = new q.h(((c.f) cVar2).f18651a);
                } else if (cVar2 instanceof c.a) {
                    gVar = new q.g(((c.a) cVar2).f18644a, true);
                } else {
                    if (!(cVar2 instanceof c.C1319c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.C1319c c1319c = (c.C1319c) cVar2;
                    Image image2 = c1319c.f18646a;
                    if (image2 != null && (image = c1319c.f18648c) != null) {
                        cVar = new q.a(image2, image);
                    } else if (c1319c.f18647b && image2 != null) {
                        cVar = new q.e(image2);
                    } else if (image2 != null) {
                        cVar = new q.c(image2);
                    } else {
                        gVar = null;
                    }
                    gVar = cVar;
                }
                if (gVar != null) {
                    arrayListA.add(gVar);
                }
            }
        } else {
            arrayListA = com.avito.android.photo_gallery.adapter.p.a(d2().f216598i, d2().f216597h, d2().f216607r, d2().f216608s, d2().f216591b, d2().f216593d, d2().f216594e, d2().f216609t, d2().f216614y, true);
        }
        this.f216554W = arrayListA;
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            com.avito.android.photo_gallery.adapter.q qVar = (com.avito.android.photo_gallery.adapter.q) obj;
            if ((qVar instanceof q.c) || (qVar instanceof q.a)) {
                arrayList.add(obj);
            }
        }
        this.f216555X = arrayList;
        Iterable iterable = (Iterable) this.f216554W;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof q.g) {
                arrayList2.add(obj2);
            }
        }
        this.f216561d0 = !arrayList2.isEmpty();
        W70.f fVar = this.f216537F;
        (fVar != null ? fVar : null).a(fA2.b());
    }

    public final void a2(boolean z12, boolean z13) {
        Button button = this.f216556Y;
        if (button != null) {
            button.setClickable(!z12);
            if (!z13) {
                i2(button, z12);
            } else {
                button.setAlpha(z12 ? 0.0f : 1.0f);
                button.setVisibility(z12 ? 8 : 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final com.avito.android.photo_gallery.adapter.q b2() {
        com.avito.android.photo_gallery.adapter.q qVarA;
        if (((Boolean) this.f216565h0.getValue()).booleanValue()) {
            P p12 = this.f216568k0;
            qVarA = p12 != null ? p12.a() : null;
        } else {
            qVarA = (com.avito.android.photo_gallery.adapter.q) C42745f0.K(this.f216566i0, this.f216554W);
        }
        if (qVarA == null) {
            InterfaceC28373a interfaceC28373a = this.f216533B;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new NonFatalErrorEvent("Should be at least one element. ItemId: " + this.f216546O, null, null, null, 14, null));
            setResult(0);
            finish();
        }
        return qVarA;
    }

    public final com.avito.android.photo_gallery.adapter.a c2(List<? extends com.avito.android.photo_gallery.adapter.q> list) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        c cVar = new c(0, this, LegacyPhotoGalleryActivity.class, "onImageClick", "onImageClick()V", 0);
        d dVar = new d(0, this, LegacyPhotoGalleryActivity.class, "onVideoClick", "onVideoClick()V", 0);
        E80.b bVar = new E80.b(new C33200m(0, this, LegacyPhotoGalleryActivity.class, "showBottomBar", "showBottomBar()V", 0), new C33201n(0, this, LegacyPhotoGalleryActivity.class, "hideBottomBar", "hideBottomBar()V", 0), new C33202o(this), new C33203p(this));
        C33204q c33204q = new C33204q(this);
        e eVar = new e(0, this, LegacyPhotoGalleryActivity.class, "onZoomChanged", "onZoomChanged()V", 0);
        InterfaceC35845m2 interfaceC35845m2 = this.f216577t;
        InterfaceC35845m2 interfaceC35845m22 = interfaceC35845m2 != null ? interfaceC35845m2 : null;
        E80.c cVar2 = this.f216581x;
        E80.c cVar3 = cVar2 != null ? cVar2 : null;
        com.avito.android.player.router.d dVar2 = this.f216579v;
        return new com.avito.android.photo_gallery.adapter.a(this, supportFragmentManager, list, this.f216546O, this, interfaceC35845m22, dVar2 != null ? dVar2 : null, cVar3, true, cVar, dVar, bVar, eVar, c33204q, this.f216545N, new f(1, this, LegacyPhotoGalleryActivity.class, "onComposeImagesDownloadSuccess", "onComposeImagesDownloadSuccess(I)V", 0), new g(1, this, LegacyPhotoGalleryActivity.class, "onComposeImagesDownloadFailure", "onComposeImagesDownloadFailure(Ljava/lang/String;)V", 0), new h());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final LegacyPhotoGalleryOpenParams d2() {
        return (LegacyPhotoGalleryOpenParams) this.f216567j0.getValue();
    }

    public final void e2(com.avito.android.advert_core.contactbar.A a12, z zVar) {
        InterfaceC28265d interfaceC28265d = this.f216534C;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.bb(this.f216559b0);
        InterfaceC28265d interfaceC28265d2 = this.f216534C;
        if (interfaceC28265d2 == null) {
            interfaceC28265d2 = null;
        }
        interfaceC28265d2.Qa(zVar);
        InterfaceC28265d interfaceC28265d3 = this.f216534C;
        if (interfaceC28265d3 == null) {
            interfaceC28265d3 = null;
        }
        interfaceC28265d3.Ra(this.f216545N);
        InterfaceC28265d interfaceC28265d4 = this.f216534C;
        if (interfaceC28265d4 == null) {
            interfaceC28265d4 = null;
        }
        interfaceC28265d4.wb(this.f216551T);
        InterfaceC28265d interfaceC28265d5 = this.f216534C;
        InterfaceC28265d interfaceC28265d6 = interfaceC28265d5 != null ? interfaceC28265d5 : null;
        ContactBarData contactBarData = this.f216552U;
        if (interfaceC28265d5 == null) {
            interfaceC28265d5 = null;
        }
        InterfaceC28265d.a.a(interfaceC28265d6, a12, contactBarData, interfaceC28265d5.Ua());
        com.avito.android.deal_confirmation.d dVar = this.f216540I;
        (dVar != null ? dVar : null).b(zVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final void f2(ViewGroup viewGroup) {
        com.avito.android.photo_gallery.ui.g gVar = new com.avito.android.photo_gallery.ui.g(viewGroup, Integer.valueOf(R.layout.gallery_fullscreen_page_indicator_content));
        gVar.f217714a = R.string.gallery_fullscreen_current_page_indicator;
        gVar.a(this.f216566i0, Integer.valueOf(this.f216554W.size()));
        D6.H(gVar.f217715b);
        this.f216574q = gVar;
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void g2() {
        ImageGroup imageGroup;
        Set<Integer> addedByAvitoImagesIndexes;
        Object next;
        com.avito.android.photo_gallery.adapter.q qVarB2 = b2();
        int iIndexOf = this.f216555X.indexOf(qVarB2);
        List<ImageGroup> list = d2().f216612w;
        String str = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((ImageGroup) next).getIndex() == iIndexOf) {
                        break;
                    }
                }
            }
            imageGroup = (ImageGroup) next;
        } else {
            imageGroup = null;
        }
        AddedByAvitoParams addedByAvitoParams = d2().f216611v;
        if (imageGroup != null) {
            ImageLabel imageLabel = this.f216575r;
            if (imageLabel != null) {
                String label = imageGroup.getLabel();
                if (imageGroup.getPostfix() != null) {
                    str = " · " + imageGroup.getPostfix();
                }
                imageLabel.a(label, str);
                return;
            }
            return;
        }
        if (qVarB2 != null && (qVarB2 instanceof q.e)) {
            ImageLabel imageLabel2 = this.f216575r;
            if (imageLabel2 != null) {
                String str2 = (String) this.f216562e0.getValue();
                int i12 = ImageLabel.f217667e;
                imageLabel2.a(str2, null);
                return;
            }
            return;
        }
        if (addedByAvitoParams == null || (addedByAvitoImagesIndexes = addedByAvitoParams.getAddedByAvitoImagesIndexes()) == null || !addedByAvitoImagesIndexes.contains(Integer.valueOf(iIndexOf))) {
            ImageLabel imageLabel3 = this.f216575r;
            if (imageLabel3 != null) {
                int i13 = ImageLabel.f217667e;
                imageLabel3.a(null, null);
                return;
            }
            return;
        }
        ImageLabel imageLabel4 = this.f216575r;
        if (imageLabel4 != null) {
            String addedByAvitoImagesLabel = addedByAvitoParams.getAddedByAvitoImagesLabel();
            int i14 = ImageLabel.f217667e;
            imageLabel4.a(addedByAvitoImagesLabel, null);
        }
    }

    public final void h2(boolean z12) {
        TextView textView;
        View view = this.f216571n;
        if (view != null) {
            i2(view, z12);
        }
        View view2 = this.f216572o;
        if (view2 != null) {
            i2(view2, z12);
        }
        ImageView imageView = this.f216573p;
        if (imageView != null) {
            imageView.setClickable(!z12);
        }
        ImageView imageView2 = this.f216573p;
        if (imageView2 != null) {
            i2(imageView2, z12);
        }
        com.avito.android.photo_gallery.ui.g gVar = this.f216574q;
        if (gVar != null && (textView = gVar.f217715b) != null) {
            i2(textView, z12);
        }
        ImageLabel imageLabel = this.f216575r;
        if (imageLabel != null) {
            i2(imageLabel, z12);
        }
    }

    @Override // R70.c
    public final void i() {
        if (R70.g.a(this.f216576s)) {
            return;
        }
        Toast toast = this.f216576s;
        if (toast != null) {
            toast.cancel();
        }
        this.f216576s = L5.a(this, R.string.photo_load_error, 0);
    }

    public final void k2(PlayerFragmentAction playerFragmentAction) {
        if (b2() instanceof q.d) {
            for (InterfaceC23487e interfaceC23487e : getSupportFragmentManager().P()) {
                if (interfaceC23487e instanceof E80.a) {
                    int iOrdinal = playerFragmentAction.ordinal();
                    if (iOrdinal == 0) {
                        ((E80.a) interfaceC23487e).M4();
                    } else if (iOrdinal == 1) {
                        E80.a aVar = (E80.a) interfaceC23487e;
                        aVar.B2(new E80.b(new C33200m(0, this, LegacyPhotoGalleryActivity.class, "showBottomBar", "showBottomBar()V", 0), new C33201n(0, this, LegacyPhotoGalleryActivity.class, "hideBottomBar", "hideBottomBar()V", 0), new C33202o(this), new C33203p(this)));
                        aVar.F1();
                    } else if (iOrdinal == 2) {
                        ((E80.a) interfaceC23487e).C3();
                    } else if (iOrdinal == 3) {
                        ((E80.a) interfaceC23487e).B2(new E80.b(new C33200m(0, this, LegacyPhotoGalleryActivity.class, "showBottomBar", "showBottomBar()V", 0), new C33201n(0, this, LegacyPhotoGalleryActivity.class, "hideBottomBar", "hideBottomBar()V", 0), new C33202o(this), new C33203p(this)));
                    }
                }
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            if (i13 == -1) {
                Parcelable parcelableExtra = intent == null ? null : intent.getParcelableExtra("SuccessAuthResultData");
                InterfaceC28265d interfaceC28265d = this.f216534C;
                if (interfaceC28265d == null) {
                    interfaceC28265d = null;
                }
                interfaceC28265d.k0(parcelableExtra);
                com.avito.android.photo_gallery.nav_bar.a aVar = this.f216542K;
                com.avito.android.photo_gallery.nav_bar.a aVar2 = aVar != null ? aVar : null;
                aVar2.getClass();
                if ((parcelableExtra instanceof PhotoGalleryNavBarAuthData) && (((PhotoGalleryNavBarAuthData) parcelableExtra) instanceof PhotoGalleryNavBarAuthData.ComparisonFeature)) {
                    aVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 3) {
            DealConfirmationSheetActivity.f132774r.getClass();
            String stringExtra = intent != null ? intent.getStringExtra("result_key.message") : null;
            if (stringExtra != null) {
                com.avito.android.deal_confirmation.d dVar = this.f216540I;
                (dVar != null ? dVar : null).d(stringExtra);
                return;
            }
            return;
        }
        if (i12 != 11) {
            return;
        }
        if (i13 == -1) {
            SafeViewPager safeViewPager = this.f216570m;
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
        SafeViewPager safeViewPager2 = this.f216570m;
        if (safeViewPager2 == null) {
            safeViewPager2 = null;
        }
        if (safeViewPager2.getCurrentItem() <= 0) {
            finish();
        } else {
            SafeViewPager safeViewPager3 = this.f216570m;
            (safeViewPager3 == null ? null : safeViewPager3).setCurrentItem((safeViewPager3 != null ? safeViewPager3 : null).getCurrentItem() - 1);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        String str;
        String str2;
        k2(PlayerFragmentAction.f220211d);
        C29640d c29640d = this.f216532A;
        if (c29640d == null) {
            c29640d = null;
        }
        if (c29640d.v().invoke().booleanValue() && (str = this.f216546O) != null && (str2 = this.f216547P) != null) {
            InterfaceC28373a interfaceC28373a = this.f216533B;
            (interfaceC28373a != null ? interfaceC28373a : null).c(new P70.a(this.f216548Q, str, str2, this.f216563f0));
        }
        setResult(-1, getIntent());
        supportFinishAfterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049a  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@Y61.l android.os.Bundle r35) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.LegacyPhotoGalleryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC28265d interfaceC28265d = this.f216534C;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.e0();
        com.avito.android.deal_confirmation.d dVar = this.f216540I;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        P p12 = this.f216568k0;
        if (p12 != null) {
            kotlinx.coroutines.U.b(p12.f216639r, null);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        com.avito.android.advert_collection_toast.a aVar = this.f216543L;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        super.onPause();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        InterfaceC28265d interfaceC28265d = this.f216534C;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.nb(AdvertDetailsBlockIdKt.GALLERY_BLOCK);
        InterfaceC28265d interfaceC28265d2 = this.f216534C;
        if (interfaceC28265d2 == null) {
            interfaceC28265d2 = null;
        }
        interfaceC28265d2.db();
        com.avito.android.deal_confirmation.d dVar = this.f216540I;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onResume();
        k2(PlayerFragmentAction.f220212e);
        com.avito.android.advert_collection_toast.a aVar = this.f216543L;
        (aVar != null ? aVar : null).d(K1(), this);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC28265d interfaceC28265d = this.f216534C;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        bundle.putBundle("contactsState", interfaceC28265d.H());
        bundle.putBoolean("visibilityBottomBar", this.f216557Z);
        bundle.putBoolean("visibilityTeaser", this.f216560c0);
        Long l12 = this.f216550S;
        if (l12 != null) {
            bundle.putLong("returnStateId", l12.longValue());
        }
        SafeViewPager safeViewPager = this.f216570m;
        if (safeViewPager == null) {
            safeViewPager = null;
        }
        bundle.putInt("currentPosition", safeViewPager.getCurrentItem());
        com.avito.android.deal_confirmation.d dVar = this.f216540I;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.util.G.c(bundle, "dealConfirmationState", dVar.d0());
        com.avito.android.photo_gallery.nav_bar.a aVar = this.f216542K;
        com.avito.android.photo_gallery.nav_bar.a aVar2 = aVar != null ? aVar : null;
        aVar2.getClass();
        Kundle kundle = new Kundle();
        kundle.j(aVar2.f217539r, "navBarState");
        com.avito.android.util.G.c(bundle, "navBarState", kundle);
        P p12 = this.f216568k0;
        if (p12 != null) {
            bundle.putParcelable("realtyLayoutsState", new RealtyDelegateState(p12.f216641t, p12.f216642u, p12.f216643v, p12.f216632k, p12.f216646y, p12.f216618A, p12.f216619B));
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        P p12 = this.f216568k0;
        if (p12 != null) {
            if (p12.f216632k) {
                p12.f216632k = false;
                p12.f216646y = true;
                p12.c();
            }
            if (p12.f216633l) {
                p12.f(true);
            }
        }
    }

    @Override // R70.c
    public final void l() {
    }
}
