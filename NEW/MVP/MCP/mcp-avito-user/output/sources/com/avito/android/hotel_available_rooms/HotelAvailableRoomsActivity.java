package com.avito.android.hotel_available_rooms;

import Cd.C13243a;
import JI.a;
import JI.b;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity;
import com.avito.android.hotel_available_rooms.di.C30776c;
import com.avito.android.hotel_available_rooms.di.o;
import com.avito.android.hotel_available_rooms.mvi.HotelAvailableRoomsScreen;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import com.avito.android.hotel_available_rooms.mvi.entity.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import okhttp3.internal.http2.Http2;
import z1.AbstractC50339a;

/* compiled from: HotelAvailableRoomsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_available_rooms/HotelAvailableRoomsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelAvailableRoomsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final a f162646u = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f162647m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f162648n = new O0(m0.f406844a.b(j.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f162649o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f162650p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f162651q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f162652r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f162653s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public i f162654t;

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/HotelAvailableRoomsActivity$a;", "", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<JI.b, G0> {
        @Override // Y41.l
        public final G0 invoke(JI.b bVar) {
            RecyclerView recyclerView;
            JI.b bVar2 = bVar;
            HotelAvailableRoomsActivity hotelAvailableRoomsActivity = (HotelAvailableRoomsActivity) this.receiver;
            a aVar = HotelAvailableRoomsActivity.f162646u;
            hotelAvailableRoomsActivity.getClass();
            if (bVar2 instanceof b.a) {
                hotelAvailableRoomsActivity.finish();
            } else if (bVar2 instanceof b.C0521b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = hotelAvailableRoomsActivity.f162650p;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.C0521b c0521b = (b.C0521b) bVar2;
                b.a.a(aVar2, c0521b.f8862a, c0521b.f8863b, null, 4);
            } else if (bVar2 instanceof b.c) {
                i iVar = hotelAvailableRoomsActivity.f162654t;
                if (iVar != null && (recyclerView = iVar.f162831h) != null) {
                    recyclerView.A0(0);
                }
            } else if (bVar2 instanceof b.d) {
                PhotoGalleryIntentFactory photoGalleryIntentFactory = hotelAvailableRoomsActivity.f162651q;
                b.d dVar = (b.d) bVar2;
                hotelAvailableRoomsActivity.startActivityForResult((photoGalleryIntentFactory != null ? photoGalleryIntentFactory : null).a(null, null, null, null, null, null, null, dVar.f8865a, dVar.f8866b, dVar.f8868d, (16773151 & 1024) != 0 ? null : dVar.f8867c, (16773151 & 2048) != 0 ? null : dVar.f8869e, (16773151 & 4096) != 0 ? null : null, (16773151 & 8192) != 0 ? null : null, (16773151 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, (32768 & 16773151) != 0 ? null : null, null, null, (262144 & 16773151) != 0 ? null : null, null, false, (16773151 & 2097152) != 0 ? null : null, null, null), 1, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<HotelAvailableRoomsState, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(HotelAvailableRoomsState hotelAvailableRoomsState) {
            HotelAvailableRoomsState hotelAvailableRoomsState2 = hotelAvailableRoomsState;
            HotelAvailableRoomsActivity hotelAvailableRoomsActivity = HotelAvailableRoomsActivity.this;
            i iVar = hotelAvailableRoomsActivity.f162654t;
            if (iVar != null) {
                com.avito.android.hotel_available_rooms.mvi.entity.a aVar = hotelAvailableRoomsState2.f163130k;
                boolean z12 = aVar instanceof a.d;
                RecyclerView recyclerView = iVar.f162831h;
                RecyclerView recyclerView2 = iVar.f162830g;
                NestedScrollView nestedScrollView = iVar.f162826c;
                ShimmerLayout shimmerLayout = iVar.f162825b;
                if (z12) {
                    com.avito.konveyor.adapter.d dVar = hotelAvailableRoomsActivity.f162652r;
                    if (dVar == null) {
                        dVar = null;
                    }
                    a.d dVar2 = (a.d) aVar;
                    dVar.l(dVar2.f163144a, null);
                    com.avito.konveyor.adapter.d dVar3 = hotelAvailableRoomsActivity.f162653s;
                    if (dVar3 == null) {
                        dVar3 = null;
                    }
                    dVar3.l(null, null);
                    D6.H(shimmerLayout);
                    D6.w(nestedScrollView);
                    recyclerView2.setVisibility(dVar2.f163145b ? 0 : 8);
                    D6.w(recyclerView);
                } else {
                    boolean z13 = aVar instanceof a.C4768a;
                    TextView textView = iVar.f162828e;
                    TextView textView2 = iVar.f162827d;
                    Button button = iVar.f162829f;
                    if (z13) {
                        com.avito.konveyor.adapter.d dVar4 = hotelAvailableRoomsActivity.f162652r;
                        if (dVar4 == null) {
                            dVar4 = null;
                        }
                        a.C4768a c4768a = (a.C4768a) aVar;
                        dVar4.l(c4768a.f163136a, null);
                        D6.w(shimmerLayout);
                        D6.H(nestedScrollView);
                        D6.H(recyclerView2);
                        D6.w(recyclerView);
                        D6.w(button);
                        textView2.setText(c4768a.f163137b.k0(hotelAvailableRoomsActivity));
                        textView.setText(c4768a.f163138c.k0(hotelAvailableRoomsActivity));
                    } else if (aVar instanceof a.b) {
                        com.avito.konveyor.adapter.d dVar5 = hotelAvailableRoomsActivity.f162652r;
                        if (dVar5 == null) {
                            dVar5 = null;
                        }
                        a.b bVar = (a.b) aVar;
                        dVar5.l(bVar.f163139a, null);
                        com.avito.konveyor.adapter.d dVar6 = hotelAvailableRoomsActivity.f162653s;
                        if (dVar6 == null) {
                            dVar6 = null;
                        }
                        dVar6.l(bVar.f163140b, null);
                        D6.w(shimmerLayout);
                        D6.w(nestedScrollView);
                        D6.H(recyclerView2);
                        D6.H(recyclerView);
                    } else if (aVar instanceof a.c) {
                        com.avito.konveyor.adapter.d dVar7 = hotelAvailableRoomsActivity.f162652r;
                        if (dVar7 == null) {
                            dVar7 = null;
                        }
                        a.c cVar = (a.c) aVar;
                        dVar7.l(cVar.f163141a, null);
                        D6.w(shimmerLayout);
                        D6.H(nestedScrollView);
                        D6.H(recyclerView2);
                        D6.w(recyclerView);
                        D6.H(button);
                        textView2.setText(cVar.f163142b.k0(hotelAvailableRoomsActivity));
                        textView.setText(cVar.f163143c.k0(hotelAvailableRoomsActivity));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJI/a;", "it", "Lkotlin/G0;", "invoke", "(LJI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<JI.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JI.a aVar) {
            a aVar2 = HotelAvailableRoomsActivity.f162646u;
            HotelAvailableRoomsActivity.this.b2().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f162657l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f162657l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f162657l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return HotelAvailableRoomsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return HotelAvailableRoomsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/hotel_available_rooms/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<j> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            k kVar = HotelAvailableRoomsActivity.this.f162647m;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    public static HotelAvailableRoomsOpenParams a2(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (HotelAvailableRoomsOpenParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("hotel_available_open_params_key", HotelAvailableRoomsOpenParams.class) : extras.getParcelable("hotel_available_open_params_key"));
        }
        return null;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C30776c.a().a(cv.c.a(this), (o) C29972i.a(C29972i.b(this), o.class), new C28478k(HotelAvailableRoomsScreen.f163086d, s.a(this), null, 4, null), new d(), a2(getIntent())).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f162649o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final j b2() {
        return (j) this.f162648n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 != 1 || intent == null) {
            return;
        }
        b2().accept(new a.g(intent.getIntExtra("image_position", 0)));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f162649o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.hotel_available_rooms_activity, (ViewGroup) null, false);
        setContentView(viewInflate);
        i iVar = new i(viewInflate);
        com.avito.konveyor.adapter.d dVar = this.f162652r;
        if (dVar == null) {
            dVar = null;
        }
        iVar.f162830g.setAdapter(dVar);
        com.avito.konveyor.adapter.d dVar2 = this.f162653s;
        if (dVar2 == null) {
            dVar2 = null;
        }
        iVar.f162831h.setAdapter(dVar2);
        final int i12 = 0;
        iVar.f162824a.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_available_rooms.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelAvailableRoomsActivity f162817c;

            {
                this.f162817c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelAvailableRoomsActivity hotelAvailableRoomsActivity = this.f162817c;
                switch (i12) {
                    case 0:
                        HotelAvailableRoomsActivity.a aVar = HotelAvailableRoomsActivity.f162646u;
                        hotelAvailableRoomsActivity.b2().accept(a.b.f8848a);
                        break;
                    default:
                        HotelAvailableRoomsActivity.a aVar2 = HotelAvailableRoomsActivity.f162646u;
                        hotelAvailableRoomsActivity.b2().accept(a.l.f8860a);
                        break;
                }
            }
        });
        final int i13 = 1;
        iVar.f162829f.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.hotel_available_rooms.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HotelAvailableRoomsActivity f162817c;

            {
                this.f162817c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotelAvailableRoomsActivity hotelAvailableRoomsActivity = this.f162817c;
                switch (i13) {
                    case 0:
                        HotelAvailableRoomsActivity.a aVar = HotelAvailableRoomsActivity.f162646u;
                        hotelAvailableRoomsActivity.b2().accept(a.b.f8848a);
                        break;
                    default:
                        HotelAvailableRoomsActivity.a aVar2 = HotelAvailableRoomsActivity.f162646u;
                        hotelAvailableRoomsActivity.b2().accept(a.l.f8860a);
                        break;
                }
            }
        });
        this.f162654t = iVar;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f162649o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, b2(), new b(1, this, HotelAvailableRoomsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsOneTimeEvent;)V", 0), new c());
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.hotel_available_rooms.f(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f162649o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i iVar = this.f162654t;
        RecyclerView recyclerView = iVar != null ? iVar.f162830g : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        i iVar2 = this.f162654t;
        RecyclerView recyclerView2 = iVar2 != null ? iVar2.f162831h : null;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(null);
        }
        this.f162654t = null;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        b2().accept(new a.i(a2(intent)));
    }
}
