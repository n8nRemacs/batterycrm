package com.avito.android.beduin.common.container.time_line;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.time_line.TimeLineContainerChange;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BeduinTimeLineContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/b;", "Lej/a;", "Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "Lcom/avito/android/beduin/common/container/time_line/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40112a<BeduinTimeLineContainerModel, e> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinTimeLineContainerModel f103239e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Wh.c f103240f;

    public b(@k BeduinTimeLineContainerModel beduinTimeLineContainerModel, @k Wh.c cVar) {
        this.f103239e = beduinTimeLineContainerModel;
        this.f103240f = cVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103239e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        return new e(C0.b(viewGroup, R.layout.beduin_container_time_line, viewGroup, false), new com.avito.android.beduin.common.component.adapter.a(0));
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinTimeLineContainerModel beduinTimeLineContainerModel = (BeduinTimeLineContainerModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        TimeLineContainerChange[] timeLineContainerChangeArrValues = TimeLineContainerChange.values();
        if (timeLineContainerChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, TimeLineContainerChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(timeLineContainerChangeArrValues));
        BeduinTimeLineContainerModel beduinTimeLineContainerModel2 = this.f103239e;
        if (!L.f(fVar.invoke(beduinTimeLineContainerModel2), fVar.invoke(beduinTimeLineContainerModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TimeLineContainerChange timeLineContainerChange : timeLineContainerChangeArrValues) {
            ((TimeLineContainerChange.a) timeLineContainerChange.f103234b).getClass();
            List<BeduinModel> children = beduinTimeLineContainerModel2.getChildren();
            ((TimeLineContainerChange.a) timeLineContainerChange.f103234b).getClass();
            if (!L.f(children, beduinTimeLineContainerModel.getChildren())) {
                arrayList.add(timeLineContainerChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        e eVar = (e) interfaceC40116e;
        Context context = eVar.f103243b.getContext();
        BeduinTimeLineContainerModel beduinTimeLineContainerModel = this.f103239e;
        J.b(eVar.f103245d, beduinTimeLineContainerModel.getMargin());
        LocalIcon icon = beduinTimeLineContainerModel.getIcon();
        Drawable drawableC = v.c(context, icon, null);
        ImageView imageView = eVar.f103246e;
        imageView.setImageDrawable(drawableC);
        D6.G(imageView, icon != null);
        boolean z12 = beduinTimeLineContainerModel.getLine() != null;
        View view = eVar.f103247f;
        D6.G(view, z12);
        Line line = beduinTimeLineContainerModel.getLine();
        if (line != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = y6.b(line.getWidth());
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(C48063a.f437606a.a(context, line.getColor()));
        }
        p(eVar);
        I.e(eVar.f103248g, beduinTimeLineContainerModel.getChildrenPadding());
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        a aVar = new a(this, (e) interfaceC40116e);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(aVar, list);
    }

    public final void p(e eVar) {
        com.avito.android.beduin.common.component.adapter.a aVar = eVar.f103244c;
        List<BeduinModel> children = this.f103239e.getChildren();
        ArrayList arrayList = new ArrayList(C42745f0.q(children, 10));
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f103240f.a((BeduinModel) it.next()));
        }
        aVar.m(arrayList);
    }
}
