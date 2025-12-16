package com.avito.android.beduin.common.component.bar_chart;

import Kh.C14314a;
import Ui.InterfaceC15523b;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.bar_chart.BarChartModelChange;
import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BeduinBarChartComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/d;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "Lcom/avito/android/beduin/common/component/bar_chart/p;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.android.beduin.common.component.h<BeduinBarChartModel, p> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f100729i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final List<String> f100730j = Collections.singletonList("barChart");

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinBarChartModel> f100731k = BeduinBarChartModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinBarChartModel f100732e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f100733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f100734g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100735h = true;

    /* compiled from: BeduinBarChartComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/d$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinBarChartModel> S() {
            return d.f100731k;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return d.f100730j;
        }

        public a() {
        }
    }

    public d(@Y61.k BeduinBarChartModel beduinBarChartModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k lj.e eVar) {
        this.f100732e = beduinBarChartModel;
        this.f100733f = interfaceC15523b;
        this.f100734g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100732e;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102294j() {
        return this.f100735h;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinBarChartModel beduinBarChartModel = (BeduinBarChartModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BarChartModelChange[] barChartModelChangeArrValues = BarChartModelChange.values();
        if (barChartModelChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BarChartModelChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(barChartModelChangeArrValues));
        BeduinBarChartModel beduinBarChartModel2 = this.f100732e;
        if (!L.f(fVar.invoke(beduinBarChartModel2), fVar.invoke(beduinBarChartModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BarChartModelChange barChartModelChange : barChartModelChangeArrValues) {
            if (!L.f(((BarChartModelChange.a) barChartModelChange.f100697b).invoke(beduinBarChartModel2), ((BarChartModelChange.a) barChartModelChange.f100697b).invoke(beduinBarChartModel))) {
                arrayList.add(barChartModelChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        p pVar = new p(new ContextThemeWrapper(viewGroup.getContext(), this.f100732e.getTheme().f100608b), null, 0, 6, null);
        pVar.setLayoutParams(layoutParams);
        return pVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        p pVar = (p) view;
        BeduinBarChartModel beduinBarChartModel = this.f100732e;
        if (beduinBarChartModel.getMargin() != null) {
            J.b(pVar, beduinBarChartModel.getMargin());
        } else if (this.f395326d) {
            D6.b(pVar, Integer.valueOf(this.f395324b), 0, Integer.valueOf(this.f395325c), 0);
        } else {
            D6.b(pVar, 0, 0, 0, 0);
        }
        com.avito.android.beduin.common.component.bar_chart.a aVar = new com.avito.android.beduin.common.component.bar_chart.a(beduinBarChartModel, Kh.e.a(pVar, null, beduinBarChartModel.getColumnTitleSettings()).getLineHeight());
        pVar.setDataProvider(aVar);
        pVar.setOnClickListener(new e(this));
        pVar.setOnScrollListener(new f(this));
        pVar.setHeight(y6.b(beduinBarChartModel.getHeight()));
        pVar.setSpacing(new C14314a(beduinBarChartModel));
        pVar.setVerticalAxis(new Kh.c(beduinBarChartModel, aVar.f100702a + aVar.f100703b + aVar.f100706e));
        u(pVar, true);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        g gVar = new g(this, (p) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(gVar, list);
    }

    public final void u(p pVar, boolean z12) {
        Object next;
        com.avito.konveyor.adapter.d listAdapter = pVar.getListAdapter();
        BeduinBarChartModel beduinBarChartModel = this.f100732e;
        listAdapter.l(beduinBarChartModel.getColumns(), new c(this, pVar, z12));
        Iterator<T> it = beduinBarChartModel.getColumns().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((BarChartColumnItem) next).isSelected()) {
                    break;
                }
            }
        }
        BarChartColumnItem barChartColumnItem = (BarChartColumnItem) next;
        if (barChartColumnItem == null) {
            return;
        }
        String details = barChartColumnItem.getDetails();
        if (details == null || C43066x.K(details)) {
            pVar.setDetailsValue(null);
        } else {
            pVar.setDetailsValue(new Kh.b(barChartColumnItem.getF155493b(), beduinBarChartModel.getColumnDetailsSettings(), barChartColumnItem.getDetails()));
        }
    }
}
