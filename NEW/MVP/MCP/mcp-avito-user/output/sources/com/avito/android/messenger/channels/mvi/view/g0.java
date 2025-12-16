package com.avito.android.messenger.channels.mvi.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsContentDelegate.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/g0;", "Lcom/avito/android/messenger/channels/mvi/view/a;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onResume", "()V", "onPause", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g0 implements InterfaceC31872a, InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.presenter.a f188747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Fragment f188748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public ViewPager2 f188749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public TabLayout f188750e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public i0 f188751f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188752g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a f188753h = new a();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f188754i;

    /* compiled from: ChannelsContentDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger/channels/mvi/view/g0$a", "Lcom/avito/android/lib/deprecated_design/tab/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.lib.deprecated_design.tab.adapter.b {
        public a() {
        }

        @Override // com.avito.android.lib.deprecated_design.tab.adapter.b, com.google.android.material.tabs.TabLayout.c
        public final void b(@Y61.k TabLayout.i iVar) {
            g0.this.f188747b.T8(iVar.f357412d);
        }
    }

    /* compiled from: ChannelsContentDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C30277e1 f188756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30277e1 c30277e1) {
            super(0);
            this.f188756l = c30277e1;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C30277e1 c30277e1 = this.f188756l;
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[20];
            return (Boolean) c30277e1.f145043v.a().invoke();
        }
    }

    public g0(@Y61.k com.avito.android.messenger.channels.mvi.presenter.a aVar, @Y61.k Fragment fragment, @Y61.k C30277e1 c30277e1) {
        this.f188747b = aVar;
        this.f188748c = fragment;
        this.f188754i = C42727D.b(LazyThreadSafetyMode.f406616d, new b(c30277e1));
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        this.f188747b.getF188298a0().removeObservers(this.f188748c.getViewLifecycleOwner());
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        com.avito.android.messenger.channels.mvi.presenter.a aVar = this.f188747b;
        this.f188752g.b(aVar.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new e0(this)));
        aVar.getF188298a0().observe(this.f188748c.getViewLifecycleOwner(), new d0(this));
        aVar.d3();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.channels.mvi.view.InterfaceC31872a
    public final void a(@Y61.k ViewGroup viewGroup, @Y61.l String str, @Y61.l Boolean bool) {
        ViewPager2 viewPager2;
        View viewB = C0.b(viewGroup, R.layout.messenger_channels_folders_content, viewGroup, true);
        View viewFindViewById = viewB.findViewById(R.id.channels_view_pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        this.f188749d = (ViewPager2) viewFindViewById;
        View viewFindViewById2 = viewB.findViewById(R.id.folders_tabs);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        }
        this.f188750e = (TabLayout) viewFindViewById2;
        this.f188751f = new i0(viewB);
        ViewPager2 viewPager22 = this.f188749d;
        if (viewPager22 != null) {
            viewPager22.setUserInputEnabled(false);
        }
        boolean zBooleanValue = ((Boolean) this.f188754i.getValue()).booleanValue();
        Fragment fragment = this.f188748c;
        if (!zBooleanValue && (viewPager2 = this.f188749d) != null) {
            com.avito.android.messenger.folders.e.f196349a.getClass();
            viewPager2.setAdapter(new f0((List) com.avito.android.messenger.folders.e.f196353e.getValue(), fragment));
        }
        fragment.getLifecycle().a(this);
    }

    @Override // com.avito.android.messenger.channels.mvi.view.InterfaceC31872a
    public final void destroy() {
        TabLayout tabLayout = this.f188750e;
        if (tabLayout != null) {
            tabLayout.f357363L.remove(this.f188753h);
        }
        this.f188748c.getLifecycle().c(this);
        this.f188750e = null;
        this.f188749d = null;
        this.f188751f = null;
    }
}
