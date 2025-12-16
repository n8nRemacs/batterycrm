package com.avito.android.beduin.common.component.input.single_line;

import Ui.InterfaceC15523b;
import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.input.InputChange;
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

/* compiled from: SingleLineInputComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/input/single_line/h;", "Lej/a;", "Lcom/avito/android/beduin/common/component/input/single_line/SingleLineInputModel;", "Lcom/avito/android/beduin/common/component/input/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends AbstractC40112a<SingleLineInputModel, com.avito.android.beduin.common.component.input.g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final lj.e f101591e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101592f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SingleLineInputModel f101593g;

    public h(@k lj.e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k SingleLineInputModel singleLineInputModel) {
        this.f101591e = eVar;
        this.f101592f = interfaceC15523b;
        this.f101593g = singleLineInputModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101593g;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        return new com.avito.android.beduin.common.component.input.g(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, this.f101593g.getTheme())), layoutParams, true);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        SingleLineInputModel singleLineInputModel = (SingleLineInputModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        InputChange[] inputChangeArrValues = InputChange.values();
        if (inputChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, InputChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(inputChangeArrValues));
        SingleLineInputModel singleLineInputModel2 = this.f101593g;
        if (!L.f(fVar.invoke(singleLineInputModel2), fVar.invoke(singleLineInputModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InputChange inputChange : inputChangeArrValues) {
            if (!L.f(inputChange.b().invoke(singleLineInputModel2), inputChange.b().invoke(singleLineInputModel))) {
                arrayList.add(inputChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0340 A[PHI: r7
  0x0340: PHI (r7v122 java.lang.Integer) = (r7v99 java.lang.Integer), (r7v106 java.lang.Integer), (r7v111 java.lang.Integer) binds: [B:189:0x033e, B:201:0x036d, B:210:0x0385] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    @Override // ej.AbstractC40112a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(ej.InterfaceC40116e r29) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.input.single_line.h.m(ej.e):void");
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        com.avito.android.beduin.common.component.input.g gVar = (com.avito.android.beduin.common.component.input.g) interfaceC40116e;
        p(gVar, new g(gVar, list, this));
    }

    public final void p(com.avito.android.beduin.common.component.input.g gVar, l<? super Input, G0> lVar) {
        gVar.f101550d.e();
        Input input = gVar.f101549c;
        lVar.invoke(input);
        com.avito.android.beduin.common.component.input.i.a(gVar, this.f101591e, this.f101593g, false, this.f101592f);
        input.setOnFocusChangeListener(new e(this, input, 0));
        input.setOnEditorActionListener(new C27140f(this, 2));
    }
}
