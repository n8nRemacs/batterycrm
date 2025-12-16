package com.avito.android.photo_list_view_group_selection;

import Cd.C13243a;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.photo_list_view_group_selection.mvi.l;
import com.avito.android.photo_list_view_group_selection.mvi.m;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.konveyor.adapter.j;
import e80.C39966c;
import e80.InterfaceC39964a;
import e80.InterfaceC39965b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: PhotoItemGroupSelectionActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoItemGroupSelectionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f218362r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public m f218363m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f218364n = new O0(m0.f406844a.b(l.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f218365o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f218366p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public j f218367q;

    /* compiled from: PhotoItemGroupSelectionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = PhotoItemGroupSelectionActivity.f218362r;
            PhotoItemGroupSelectionActivity.this.a2();
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoItemGroupSelectionActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC39965b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC39965b interfaceC39965b) {
            InterfaceC39965b interfaceC39965b2 = interfaceC39965b;
            PhotoItemGroupSelectionActivity photoItemGroupSelectionActivity = (PhotoItemGroupSelectionActivity) this.receiver;
            int i12 = PhotoItemGroupSelectionActivity.f218362r;
            photoItemGroupSelectionActivity.getClass();
            if (interfaceC39965b2 instanceof InterfaceC39965b.C11055b) {
                Intent intent = new Intent();
                InterfaceC39965b.C11055b c11055b = (InterfaceC39965b.C11055b) interfaceC39965b2;
                String str = c11055b.f394980d;
                intent.putExtra("key_selection_result", new PhotoItemGroupSelectionResult(c11055b.f394977a, c11055b.f394978b, c11055b.f394979c, str, c11055b.f394981e));
                G0 g02 = G0.f406611a;
                photoItemGroupSelectionActivity.setResult(-1, intent);
                photoItemGroupSelectionActivity.finish();
            } else if (interfaceC39965b2 instanceof InterfaceC39965b.a) {
                photoItemGroupSelectionActivity.a2();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoItemGroupSelectionActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le80/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Le80/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C39966c, G0> {
        public c() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(C39966c c39966c) {
            C39966c c39966c2 = c39966c;
            com.avito.konveyor.adapter.a aVar = PhotoItemGroupSelectionActivity.this.f218366p;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(c39966c2.f394987e.f394990b));
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoItemGroupSelectionActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le80/a;", "it", "Lkotlin/G0;", "invoke", "(Le80/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC39964a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39964a interfaceC39964a) {
            int i12 = PhotoItemGroupSelectionActivity.f218362r;
            ((l) PhotoItemGroupSelectionActivity.this.f218364n.getValue()).accept(interfaceC39964a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f218371l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f218371l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f218371l);
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
            return PhotoItemGroupSelectionActivity.this.getF42820b();
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
            return PhotoItemGroupSelectionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PhotoItemGroupSelectionActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/photo_list_view_group_selection/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<l> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = PhotoItemGroupSelectionActivity.this.f218363m;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.photo_item_group_selection_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_selection_params", PhotoItemGroupSelectionParams.class) : intent.getParcelableExtra("key_selection_params");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("PhotoItemGroupSelectionParams cannot be null");
        }
        com.avito.android.photo_list_view_group_selection.di.a.a().a((com.avito.android.photo_list_view_group_selection.di.e) C29972i.a(C29972i.b(this), com.avito.android.photo_list_view_group_selection.di.e.class), getResources().getString(R.string.photo_item_group_selection_header), (PhotoItemGroupSelectionParams) parcelableExtra, s.a(this), new d()).a(this);
    }

    public final void a2() {
        setResult(0);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ((NavBar) findViewById(R.id.nav_bar)).c(R.attr.ic_close24, new a());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.groups_list);
        j jVar = this.f218367q;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        ((Button) findViewById(R.id.main_button)).setOnClickListener(new com.avito.android.order.feature.c(this, 21));
        ScreenPerformanceTracker screenPerformanceTracker = this.f218365o;
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (l) this.f218364n.getValue(), new b(1, this, PhotoItemGroupSelectionActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionOneTimeEvent;)V", 0), new c());
    }
}
