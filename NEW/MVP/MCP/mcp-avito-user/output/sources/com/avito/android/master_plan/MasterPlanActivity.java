package com.avito.android.master_plan;

import Cd.C13243a;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.F0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MasterPlanScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import rY.C47614a;
import rY.C47615b;
import rY.C47617d;
import vY.C49283b;
import vY.InterfaceC49282a;
import vY.InterfaceC49284c;
import wY.C49575a;
import z1.AbstractC50339a;

/* compiled from: MasterPlanActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/master_plan/MasterPlanActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/master_plan/t;", "<init>", "()V", "a", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MasterPlanActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, t {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f185969v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public p f185970m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f185972o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f185973p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f185974q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public k f185975r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f185976s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public r f185977t;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f185971n = new O0(m0.f406844a.b(o.class), new f(), new e(new i()), new g());

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f185978u = C42727D.c(new h());

    /* compiled from: MasterPlanActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/master_plan/MasterPlanActivity$a;", "", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MasterPlanActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC49284c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49284c interfaceC49284c) throws Resources.NotFoundException {
            r rVar;
            InterfaceC49284c interfaceC49284c2 = interfaceC49284c;
            MasterPlanActivity masterPlanActivity = (MasterPlanActivity) this.receiver;
            int i12 = MasterPlanActivity.f185969v;
            masterPlanActivity.getClass();
            if (interfaceC49284c2 instanceof InterfaceC49284c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = masterPlanActivity.f185972o;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, ((InterfaceC49284c.b) interfaceC49284c2).f440837a, null, null, 6);
            } else if (interfaceC49284c2 instanceof InterfaceC49284c.a) {
                masterPlanActivity.finish();
            } else if ((interfaceC49284c2 instanceof InterfaceC49284c.C12780c) && (rVar = masterPlanActivity.f185977t) != null) {
                String string = ((InterfaceC49284c.C12780c) interfaceC49284c2).f440838a;
                if (string == null) {
                    string = rVar.f186099f.getResources().getString(R.string.master_plan_wrong_args);
                }
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(string);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181047e;
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, rVar.f186095b, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, new C30597v(rVar, 1), null, 2990);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MasterPlanActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvY/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LvY/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<vY.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(vY.d dVar) {
            MasterPlanPin masterPlanPin;
            Object id2;
            MasterPlanPin masterPlanPin2;
            vY.d dVar2 = dVar;
            r rVar = MasterPlanActivity.this.f185977t;
            if (rVar != null) {
                boolean z12 = rVar.f186105l;
                C49283b c49283b = dVar2.f440841b;
                MasterPlanView masterPlanView = rVar.f186100g;
                if (!z12 && c49283b != null) {
                    int i12 = rVar.f186104k;
                    Uri uriFindUri = c49283b.f440832a.findUri((i12 * 16) / 9, i12);
                    if (uriFindUri != null) {
                        ImageView imageView = masterPlanView.f179665b;
                        if (imageView != null) {
                            com.avito.android.image_loader.glide.utils.b.c(imageView, uriFindUri);
                        }
                        if (imageView != null) {
                            imageView.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(masterPlanView, 17));
                        }
                    }
                    List<MasterPlanPin> list = c49283b.f440833b;
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    masterPlanView.a(list);
                    masterPlanView.setSelectedPin(c49283b.f440835d);
                    masterPlanView.setScroll(c49283b.f440834c);
                    masterPlanView.setOnPinClickListener(rVar);
                    masterPlanView.setSwipeListener(new s(rVar));
                    rVar.f186105l = true;
                }
                int iOrdinal = dVar2.f440843d.ordinal();
                ShimmerLayout shimmerLayout = rVar.f186102i;
                RecyclerView recyclerView = rVar.f186101h;
                if (iOrdinal == 0) {
                    shimmerLayout.setVisibility(0);
                    recyclerView.setVisibility(8);
                } else if (iOrdinal == 1) {
                    shimmerLayout.setVisibility(8);
                    recyclerView.setVisibility(0);
                    List<C47614a> list2 = dVar2.f440842c;
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            id2 = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            String buildingId = ((C47614a) next).getBuildingId();
                            if (c49283b != null && (masterPlanPin2 = c49283b.f440835d) != null) {
                                id2 = masterPlanPin2.getId();
                            }
                            if (L.f(buildingId, id2)) {
                                id2 = next;
                                break;
                            }
                        }
                        C47614a c47614a = (C47614a) id2;
                        if (c47614a != null) {
                            ArrayList arrayList = new ArrayList();
                            C47615b info = c47614a.getInfo();
                            String title = info.getTitle();
                            C47617d subtitle = info.getSubtitle();
                            k kVar = rVar.f186097d;
                            arrayList.add(kVar.c(title, subtitle));
                            arrayList.addAll(kVar.a(info.getInfoText(), info.c()));
                            ButtonAction allItemsButton = info.getAllItemsButton();
                            if (allItemsButton != null) {
                                arrayList.add(kVar.b(allItemsButton));
                            }
                            rVar.f186096c.c(new UV0.c(arrayList));
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                    if (c49283b != null && (masterPlanPin = c49283b.f440835d) != null) {
                        masterPlanView.setSelectedPin(masterPlanPin);
                    }
                } else if (iOrdinal == 2) {
                    shimmerLayout.setVisibility(8);
                    recyclerView.setVisibility(0);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MasterPlanActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<DeepLink, String, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(DeepLink deepLink, String str) {
            int i12 = MasterPlanActivity.f185969v;
            MasterPlanActivity.this.a2().accept(new InterfaceC49282a.c(deepLink, str));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f185981l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f185981l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f185981l);
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
            return MasterPlanActivity.this.getF42820b();
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
            return MasterPlanActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MasterPlanActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LwY/a;", "invoke", "()LwY/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<C49575a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final C49575a invoke() {
            Intent intent = MasterPlanActivity.this.getIntent();
            Image image = (Image) intent.getParcelableExtra("image");
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("pins");
            float floatExtra = intent.getFloatExtra("scroll", 0.5f);
            MasterPlanPin masterPlanPin = (MasterPlanPin) intent.getParcelableExtra("selectedPin");
            String stringExtra = intent.getStringExtra("developmentId");
            String str = stringExtra == null ? "" : stringExtra;
            String stringExtra2 = intent.getStringExtra(SearchParamsConverterKt.SOURCE);
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            return new C49575a(image, parcelableArrayListExtra, floatExtra, masterPlanPin, str, stringExtra2);
        }
    }

    /* compiled from: MasterPlanActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/master_plan/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/master_plan/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<o> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = MasterPlanActivity.this.f185970m;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.master_plan.di.a.a().a((com.avito.android.master_plan.di.c) C29972i.a(C29972i.b(this), com.avito.android.master_plan.di.c.class), cv.c.a(this), new C28478k(MasterPlanScreen.f90404d, com.avito.android.analytics.screens.s.a(this), null, 4, null), (C49575a) this.f185978u.getValue(), new d()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f185976s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final o a2() {
        return (o) this.f185971n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        F0.a(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
        ScreenPerformanceTracker screenPerformanceTracker = this.f185976s;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.master_plan_activity);
        View viewFindViewById = findViewById(R.id.motion_layout);
        com.avito.konveyor.adapter.a aVar = this.f185973p;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f185974q;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        k kVar = this.f185975r;
        r rVar = new r(viewFindViewById, aVar2, aVar4, kVar != null ? kVar : null, this);
        this.f185977t = rVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar4);
        RecyclerView recyclerView = rVar.f186101h;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        int iJ2 = C35835l0.j(R.attr.ic_arrowBack20, rVar.f186099f);
        Button button = rVar.f186103j;
        button.setImageResource(iJ2);
        button.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(rVar, 26));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f185976s;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, a2(), new b(1, this, MasterPlanActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/master_plan/mvi/entity/MasterPlanOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f185976s;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }
}
