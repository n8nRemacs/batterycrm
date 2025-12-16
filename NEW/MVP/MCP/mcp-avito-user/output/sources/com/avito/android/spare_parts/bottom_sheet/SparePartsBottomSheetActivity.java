package com.avito.android.spare_parts.bottom_sheet;

import Cd.C13243a;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.publish.start_publish.C;
import com.avito.android.util.D6;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import rx0.InterfaceC47932a;
import sx0.InterfaceC48429b;
import wx0.InterfaceC49696b;
import z1.AbstractC50339a;

/* compiled from: SparePartsBottomSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/SparePartsBottomSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SparePartsBottomSheetActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f284733v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f284734m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public p f284735n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public y f284736o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final O0 f284737p = new O0(m0.f406844a.b(x.class), new c(), new b(new e()), new d());

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f284738q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f284739r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f284740s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC49696b f284741t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public InterfaceC48429b f284742u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SparePartsBottomSheetActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/SparePartsBottomSheetActivity$a;", "", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f284743b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f284744c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f284745d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f284746e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f284747f;

        static {
            a aVar = new a("Unchanged", 0);
            f284743b = aVar;
            a aVar2 = new a("Added", 1);
            f284744c = aVar2;
            a aVar3 = new a("Removed", 2);
            f284745d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f284746e = aVarArr;
            f284747f = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f284746e.clone();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f284748l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f284748l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f284748l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SparePartsBottomSheetActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SparePartsBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: SparePartsBottomSheetActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/x;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/spare_parts/bottom_sheet/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<x> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final x invoke() {
            y yVar = SparePartsBottomSheetActivity.this.f284736o;
            if (yVar == null) {
                yVar = null;
            }
            return (x) yVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_spare_parts_bottom_sheet;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        SparePartsBottomSheetParams sparePartsBottomSheetParams = (SparePartsBottomSheetParams) getIntent().getParcelableExtra("key_spare_parts_params");
        ((InterfaceC47932a.b) C29972i.a(C29972i.b(this), InterfaceC47932a.b.class)).ic().a(sparePartsBottomSheetParams.f284752b, sparePartsBottomSheetParams.f284753c, getResources(), com.avito.android.analytics.screens.s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f284738q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f284738q;
        Object[] objArr = 0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, this, Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        View viewInflate = LayoutInflater.from(contextThemeWrapperB).inflate(R.layout.spare_parts_bottom_sheet_view, (ViewGroup) null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, 0, 2, objArr == true ? 1 : 0);
        dVar.G(viewInflate, true);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new C(this, 1));
        dVar.S(D6.i(420, this));
        this.f284734m = dVar;
        com.avito.konveyor.adapter.j jVar = this.f284739r;
        if (jVar == null) {
            jVar = null;
        }
        this.f284735n = new p(viewInflate, dVar, jVar);
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f284734m;
        if (dVar2 != null) {
            com.avito.android.lib.util.g.a(dVar2);
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.spare_parts.bottom_sheet.b(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f284738q;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f284735n;
        if (pVar != null) {
            pVar.f284824c = true;
            pVar.a();
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f284734m;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
            N0.a(dVar);
        }
    }
}
