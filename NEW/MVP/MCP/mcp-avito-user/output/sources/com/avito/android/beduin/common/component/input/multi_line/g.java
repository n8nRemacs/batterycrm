package com.avito.android.beduin.common.component.input.multi_line;

import Ui.InterfaceC15523b;
import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.input.InputChange;
import com.avito.android.beduin.common.component.input.i;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.input.Input;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: MultiLineInputComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/input/multi_line/g;", "Lej/a;", "Lcom/avito/android/beduin/common/component/input/multi_line/MultiLineInputModel;", "Lcom/avito/android/beduin/common/component/input/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends AbstractC40112a<MultiLineInputModel, com.avito.android.beduin.common.component.input.g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final lj.e f101570e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101571f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final MultiLineInputModel f101572g;

    public g(@k lj.e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k MultiLineInputModel multiLineInputModel) {
        this.f101570e = eVar;
        this.f101571f = interfaceC15523b;
        this.f101572g = multiLineInputModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101572g;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        return new com.avito.android.beduin.common.component.input.g(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, this.f101572g.getTheme())), layoutParams, false);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        MultiLineInputModel multiLineInputModel = (MultiLineInputModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        InputChange[] inputChangeArrValues = InputChange.values();
        if (inputChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, InputChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(inputChangeArrValues));
        MultiLineInputModel multiLineInputModel2 = this.f101572g;
        if (!L.f(fVar.invoke(multiLineInputModel2), fVar.invoke(multiLineInputModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InputChange inputChange : inputChangeArrValues) {
            if (!L.f(inputChange.b().invoke(multiLineInputModel2), inputChange.b().invoke(multiLineInputModel))) {
                arrayList.add(inputChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    @Override // ej.AbstractC40112a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(ej.InterfaceC40116e r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.input.multi_line.g.m(ej.e):void");
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        com.avito.android.beduin.common.component.input.g gVar = (com.avito.android.beduin.common.component.input.g) interfaceC40116e;
        p(gVar, new f(gVar, list, this));
    }

    public final void p(com.avito.android.beduin.common.component.input.g gVar, l<? super Input, G0> lVar) {
        gVar.f101550d.e();
        Input input = gVar.f101549c;
        lVar.invoke(input);
        i.a(gVar, this.f101570e, this.f101572g, true, this.f101571f);
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 1));
    }
}
