package com.avito.android.beduin.common.component.segmented_control;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
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

/* compiled from: BeduinSegmentedControlComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/segmented_control/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinSegmentedControlModel, SegmentedControl> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C3066a f102384h = new C3066a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<String> f102385i = Collections.singletonList("segmentedControl");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Class<BeduinSegmentedControlModel> f102386j = BeduinSegmentedControlModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102387e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f102388f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinSegmentedControlModel f102389g;

    /* compiled from: BeduinSegmentedControlComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/segmented_control/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.segmented_control.a$a, reason: collision with other inner class name */
    public static final class C3066a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3066a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSegmentedControlModel> S() {
            return a.f102386j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f102385i;
        }

        public C3066a() {
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k lj.e eVar, @k BeduinSegmentedControlModel beduinSegmentedControlModel) {
        this.f102387e = interfaceC15523b;
        this.f102388f = eVar;
        this.f102389g = beduinSegmentedControlModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102389g;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinSegmentedControlModel beduinSegmentedControlModel = (BeduinSegmentedControlModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        SegmentedControlChange[] segmentedControlChangeArrValues = SegmentedControlChange.values();
        if (segmentedControlChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, SegmentedControlChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(segmentedControlChangeArrValues));
        BeduinSegmentedControlModel beduinSegmentedControlModel2 = this.f102389g;
        if (!L.f(fVar.invoke(beduinSegmentedControlModel2), fVar.invoke(beduinSegmentedControlModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SegmentedControlChange segmentedControlChange : segmentedControlChangeArrValues) {
            if (!L.f(segmentedControlChange.b().invoke(beduinSegmentedControlModel2), segmentedControlChange.b().invoke(beduinSegmentedControlModel))) {
                arrayList.add(segmentedControlChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        SegmentedControl segmentedControl = new SegmentedControl(new ContextThemeWrapper(viewGroup.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, this.f102389g.getTheme())), null, 0, 0, 14, null);
        segmentedControl.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        segmentedControl.setLayoutParams(layoutParams);
        return segmentedControl;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        SegmentedControl segmentedControl = (SegmentedControl) view;
        BeduinSegmentedControlModel beduinSegmentedControlModel = this.f102389g;
        segmentedControl.setTag(beduinSegmentedControlModel.getF100853b());
        Boolean boolIsEnabled = beduinSegmentedControlModel.isEnabled();
        segmentedControl.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        List<Option> options = beduinSegmentedControlModel.getOptions();
        ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getName());
        }
        segmentedControl.q(f.a(beduinSegmentedControlModel.getSelectedId(), beduinSegmentedControlModel.getOptions()), arrayList);
        segmentedControl.setOnSegmentClickListener(new b(this));
        segmentedControl.setAppearance(com.avito.android.lib.util.f.k(segmentedControl.getContext(), beduinSegmentedControlModel.getStyle()));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        SegmentedControl segmentedControl = (SegmentedControl) view;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c(segmentedControl, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
        segmentedControl.setOnSegmentClickListener(new b(this));
    }
}
