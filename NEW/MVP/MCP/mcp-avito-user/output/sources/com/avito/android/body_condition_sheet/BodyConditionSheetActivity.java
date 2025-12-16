package com.avito.android.body_condition_sheet;

import Cd.C13243a;
import Mj.InterfaceC14496a;
import Nj.InterfaceC14580a;
import Nj.c;
import Nj.d;
import SK0.b;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.body_condition.CarBodyConditionItem;
import com.avito.android.body_condition_sheet.BodyConditionSheetActivity;
import com.avito.android.body_condition_sheet.di.a;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.I5;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: BodyConditionSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/body_condition_sheet/BodyConditionSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BodyConditionSheetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final a f106832w = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f106833m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f106834n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public View f106835o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public o f106836p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public q f106837q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final O0 f106838r = new O0(m0.f406844a.b(p.class), new e(), new d(new g()), new f());

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC14496a f106839s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.body_condition.c f106840t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.body_condition.f f106841u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public s f106842v;

    /* compiled from: BodyConditionSheetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/body_condition_sheet/BodyConditionSheetActivity$a;", "", "<init>", "()V", "", "EXTRA_BODY", "Ljava/lang/String;", "EXTRA_FROM_PAGE", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BodyConditionSheetActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Nj.c, G0> {
        public final void f(@Y61.k Nj.c cVar) {
            com.avito.android.lib.design.bottom_sheet.d dVar;
            BodyConditionSheetActivity bodyConditionSheetActivity = (BodyConditionSheetActivity) this.receiver;
            a aVar = BodyConditionSheetActivity.f106832w;
            bodyConditionSheetActivity.getClass();
            if (cVar instanceof c.C0758c) {
                c.C0758c c0758c = (c.C0758c) cVar;
                View view = bodyConditionSheetActivity.f106835o;
                if (view == null) {
                    return;
                }
                com.avito.android.lib.design.tooltip.k kVar = bodyConditionSheetActivity.f106834n;
                if (kVar != null) {
                    kVar.dismiss();
                }
                bodyConditionSheetActivity.f106834n = null;
                com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
                kVar2.f181224j = new r.a(new i.a(new b.a()));
                com.avito.android.lib.design.tooltip.p.a(kVar2, new com.avito.android.body_condition_sheet.e(c0758c.f11728a));
                bodyConditionSheetActivity.f106834n = kVar2.f(view);
                return;
            }
            if (!(cVar instanceof c.d)) {
                if (L.f(cVar, c.b.f11727a)) {
                    bodyConditionSheetActivity.finish();
                    return;
                } else {
                    if (!L.f(cVar, c.a.f11726a) || (dVar = bodyConditionSheetActivity.f106833m) == null) {
                        return;
                    }
                    dVar.r();
                    return;
                }
            }
            c.d dVar2 = (c.d) cVar;
            com.avito.android.lib.design.tooltip.k kVar3 = bodyConditionSheetActivity.f106834n;
            if (kVar3 != null) {
                kVar3.dismiss();
            }
            bodyConditionSheetActivity.f106834n = null;
            bodyConditionSheetActivity.f106835o = null;
            o oVar = bodyConditionSheetActivity.f106836p;
            if (oVar != null) {
                com.avito.android.advert_core.body_condition.c cVar2 = bodyConditionSheetActivity.f106840t;
                oVar.f106919c.a((cVar2 != null ? cVar2 : null).b(dVar2.f11729a), AdvertDetailsFlatViewType.f82420b, false);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Nj.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: BodyConditionSheetActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNj/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LNj/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Nj.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Nj.d dVar) {
            Nj.d dVar2 = dVar;
            if (dVar2 instanceof d.b) {
                d.b bVar = (d.b) dVar2;
                a aVar = BodyConditionSheetActivity.f106832w;
                final BodyConditionSheetActivity bodyConditionSheetActivity = BodyConditionSheetActivity.this;
                com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(bodyConditionSheetActivity, 0, 2, null);
                dVar3.D(R.layout.body_condition_bottom_sheet_view, true);
                View viewFindViewById = dVar3.findViewById(R.id.body_condition_sheet_view_container);
                InterfaceC14496a interfaceC14496a = bodyConditionSheetActivity.f106839s;
                if (interfaceC14496a == null) {
                    interfaceC14496a = null;
                }
                o oVar = new o(viewFindViewById, interfaceC14496a);
                BodyCondition bodyCondition = bVar.f11731a;
                I5.a(oVar.f106917a, bodyCondition.getTitle(), false);
                final com.avito.android.body_condition_sheet.d dVar4 = new com.avito.android.body_condition_sheet.d(bodyConditionSheetActivity);
                oVar.f106918b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.body_condition_sheet.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dVar4.invoke(view);
                    }
                });
                com.avito.android.advert_core.body_condition.c cVar = bodyConditionSheetActivity.f106840t;
                if (cVar == null) {
                    cVar = null;
                }
                oVar.f106919c.a(cVar.b((BodyConditionSide) C42745f0.E(bodyCondition.getSides())), AdvertDetailsFlatViewType.f82420b, false);
                com.avito.android.body_condition.f fVar = bodyConditionSheetActivity.f106841u;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.O5(oVar.f106920d, new CarBodyConditionItem("", BodyCondition.a(bodyCondition), false, 4, null), 0);
                com.avito.android.body_condition.f fVar2 = bodyConditionSheetActivity.f106841u;
                if (fVar2 == null) {
                    fVar2 = null;
                }
                C43175k.K(new C43197r1(new h(bodyConditionSheetActivity, null), new com.avito.android.body_condition_sheet.g(new com.avito.android.body_condition_sheet.f(y.a(fVar2.getF106807e())))), C22981N.a(bodyConditionSheetActivity.getLifecycle()));
                com.avito.android.body_condition.f fVar3 = bodyConditionSheetActivity.f106841u;
                if (fVar3 == null) {
                    fVar3 = null;
                }
                C43175k.K(new C43197r1(new i(bodyConditionSheetActivity, null), y.a(fVar3.getF106805c())), C22981N.a(bodyConditionSheetActivity.getLifecycle()));
                bodyConditionSheetActivity.f106836p = oVar;
                dVar3.setCancelable(true);
                dVar3.setCanceledOnTouchOutside(true);
                dVar3.L(null, null, false, true);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar3, true);
                dVar3.Q(new com.avito.android.body_condition_sheet.c(bodyConditionSheetActivity));
                dVar3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.body_condition_sheet.b
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BodyConditionSheetActivity.a aVar2 = BodyConditionSheetActivity.f106832w;
                        bodyConditionSheetActivity.a2().accept(InterfaceC14580a.b.f11715a);
                    }
                });
                s sVar = bodyConditionSheetActivity.f106842v;
                (sVar != null ? sVar : null).getClass();
                if ("item".equals(bVar.f11732b)) {
                    dVar3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.avito.android.body_condition_sheet.a
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            s sVar2 = bodyConditionSheetActivity.f106842v;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            sVar2.getClass();
                            b.a.a(sVar2.f106924a, r.f106922a, null, null, null, 14);
                        }
                    });
                }
                com.avito.android.lib.util.g.a(dVar3);
                bodyConditionSheetActivity.f106833m = dVar3;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f106844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f106844l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f106844l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return BodyConditionSheetActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return BodyConditionSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: BodyConditionSheetActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/body_condition_sheet/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/body_condition_sheet/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<p> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = BodyConditionSheetActivity.this.f106837q;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("BODY_CONDITION_SHEET_ACTIVITY_EXTRA_BODY");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Starting BodyConditionSheetActivity unavailable without BodyCondition model");
        }
        a.InterfaceC3194a interfaceC3194aA = com.avito.android.body_condition_sheet.di.g.a();
        interfaceC3194aA.a((BodyCondition) parcelableExtra);
        interfaceC3194aA.b(getIntent().getStringExtra("BODY_CONDITION_SHEET_ACTIVITY_EXTRA_FROM_PAGE"));
        interfaceC3194aA.c((com.avito.android.body_condition_sheet.di.b) C29972i.a(C29972i.b(this), com.avito.android.body_condition_sheet.di.b.class));
        interfaceC3194aA.build().a(this);
    }

    public final p a2() {
        return (p) this.f106838r.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.body_condition_sheet_activity);
        com.avito.android.arch.mvi.android.f.b(this, a2(), new b(1, this, BodyConditionSheetActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/body_condition_sheet/mvi/entity/BodyConditionSheetOneTimeEvent;)V", 0), new c());
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.tooltip.k kVar = this.f106834n;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f106834n = null;
        this.f106835o = null;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f106833m;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
            N0.a(dVar);
        }
        this.f106836p = null;
        this.f106833m = null;
    }
}
