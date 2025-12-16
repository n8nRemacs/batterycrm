package com.avito.android.beduin.common.component.status_line;

import Ui.InterfaceC15523b;
import Y61.k;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.core.content.d;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.status_line.BeduinStatusLineModel;
import com.avito.android.beduin.common.component.status_line.b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.util.v;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import lj.e;
import sK0.C48065c;

/* compiled from: BeduinStatusLineComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/status_line/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/status_line/BeduinStatusLineModel;", "Lcom/avito/android/beduin/common/component/status_line/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinStatusLineModel, b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinStatusLineModel f102681e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f102682f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102683g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> f102684h;

    public a(@k BeduinStatusLineModel beduinStatusLineModel, @k e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> interfaceC40113b) {
        this.f102681e = beduinStatusLineModel;
        this.f102682f = eVar;
        this.f102683g = interfaceC15523b;
        this.f102684h = interfaceC40113b;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102681e;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        b bVar = new b(viewGroup.getContext(), null, 0, 6, null);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(layoutParams);
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Iterable iterableH0;
        int i12;
        b bVar = (b) view;
        BeduinStatusLineModel beduinStatusLineModel = this.f102681e;
        List<BeduinStatusLineModel.Status> passedStatuses = beduinStatusLineModel.getPassedStatuses();
        if (passedStatuses == null) {
            passedStatuses = C42784z0.f406748b;
        }
        List<BeduinStatusLineModel.Status> list = passedStatuses;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(u((BeduinStatusLineModel.Status) it.next(), bVar));
        }
        List<BeduinStatusLineModel.Status> noPassedStatuses = beduinStatusLineModel.getNoPassedStatuses();
        if (noPassedStatuses == null) {
            noPassedStatuses = C42784z0.f406748b;
        }
        List<BeduinStatusLineModel.Status> list2 = noPassedStatuses;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(u((BeduinStatusLineModel.Status) it2.next(), bVar));
        }
        Float lineShift = beduinStatusLineModel.getLineAlignment().getLineShift();
        bVar.setLineShift(lineShift != null ? y6.a(lineShift.floatValue()) : 0);
        bVar.setLineAlignment(beduinStatusLineModel.getLineAlignment().getType());
        Float lineHorizontalSpacing = beduinStatusLineModel.getLineHorizontalSpacing();
        bVar.setProgressHorizontalMargin(lineHorizontalSpacing != null ? y6.a(lineHorizontalSpacing.floatValue()) : 0);
        BeduinStatusLineModel.LineMode lineMode = beduinStatusLineModel.getLineMode();
        if (lineMode == null) {
            lineMode = BeduinStatusLineModel.LineMode.NO_PASSED_NEXT_LINE;
        }
        bVar.setTransitLineMode(lineMode);
        bVar.setPassedLineColor(C48065c.d(bVar.getContext(), beduinStatusLineModel.getLineColors().getPassedStatusColor(), R.attr.black));
        bVar.setNoPassedLineColor(C48065c.d(bVar.getContext(), beduinStatusLineModel.getLineColors().getNoPassedStatusColor(), R.attr.beige400));
        ArrayList arrayListH0 = C42745f0.h0(arrayList2, arrayList);
        bVar.f102691h = arrayListH0;
        int size = arrayListH0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (bVar.f102692i.size() >= size) {
            iterableH0 = C42745f0.E0((Iterable) bVar.f102692i, size);
        } else {
            int size2 = size - bVar.f102692i.size();
            Collection collection = (Collection) bVar.f102692i;
            ArrayList arrayList3 = new ArrayList(size2);
            for (int i13 = 0; i13 < size2; i13++) {
                ProgressBar progressBar = new ProgressBar(bVar.getContext(), null, android.R.attr.progressBarStyleHorizontal);
                progressBar.setId(View.generateViewId());
                v.a(progressBar, bVar.f102694k);
                progressBar.setLayoutParams(new b.a(-2, bVar.f102694k, null, 4, null));
                arrayList3.add(progressBar);
            }
            iterableH0 = C42745f0.h0(arrayList3, collection);
            bVar.f102692i = iterableH0;
            G0 g02 = G0.f406611a;
        }
        int size3 = arrayList.size();
        Iterable iterable = iterableH0;
        int i14 = 0;
        for (Object obj : iterable) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            ProgressBar progressBar2 = (ProgressBar) obj;
            int i16 = size3 - 1;
            if (i14 < i16) {
                i12 = 100;
            } else if (i14 == i16) {
                i12 = bVar.transitLineMode.f102680b;
            } else {
                if (i14 < size3) {
                    throw new IllegalStateException("unreachable");
                }
                i12 = 0;
            }
            progressBar2.setProgress(i12);
            int i17 = bVar.noPassedLineColor;
            int i18 = bVar.passedLineColor;
            LayerDrawable layerDrawable = (LayerDrawable) d.getDrawable(bVar.getContext(), R.drawable.status_line_progress);
            V0.a(layerDrawable.findDrawableByLayerId(android.R.id.background), i17);
            V0.a(layerDrawable.findDrawableByLayerId(android.R.id.progress), i18);
            progressBar2.setProgressDrawable(layerDrawable);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar2.getLayoutParams();
            int i19 = bVar.progressHorizontalMargin;
            marginLayoutParams.setMargins(i19, bVar.lineShift, i19, 0);
            i14 = i15;
        }
        bVar.f102693j = (List) iterable;
        bVar.removeAllViews();
        int size4 = bVar.f102691h.size();
        for (int i22 = 0; i22 < size4; i22++) {
            bVar.addView(bVar.f102691h.get(i22));
            if (i22 != C42745f0.J(bVar.f102691h)) {
                bVar.addView(bVar.f102693j.get(i22));
            }
        }
    }

    public final View u(BeduinStatusLineModel.Status status, b bVar) {
        AbstractC40112a abstractC40112aA = this.f102684h.a(status.getItem(), this.f102682f, this.f102683g);
        Float maxWidth = status.getMaxWidth();
        InterfaceC40116e interfaceC40116eI = abstractC40112aA.i(bVar, new b.a(-2, -2, maxWidth != null ? Integer.valueOf(y6.a(maxWidth.floatValue())) : null));
        abstractC40112aA.m(interfaceC40116eI);
        View root = interfaceC40116eI.getF103243b();
        if (root.getId() == -1) {
            root.setId(View.generateViewId());
        }
        return root;
    }
}
