package com.avito.android.beduin.common.component.stepper;

import Ui.InterfaceC15523b;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.stepper.Stepper;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinStepperComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "Lcom/avito/android/beduin/common/component/stepper/k;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinStepperModel, k> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C3078a f102711h = new C3078a(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final List<String> f102712i = Collections.singletonList("stepper");

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinStepperModel> f102713j = BeduinStepperModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinStepperModel f102714e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102715f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final lj.e f102716g;

    /* compiled from: BeduinStepperComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.stepper.a$a, reason: collision with other inner class name */
    public static final class C3078a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3078a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinStepperModel> S() {
            return a.f102713j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return a.f102712i;
        }

        public C3078a() {
        }
    }

    /* compiled from: BeduinStepperComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102717l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinStepperComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = a.this;
            lj.e eVar = aVar.f102716g;
            BeduinStepperModel beduinStepperModel = aVar.f102714e;
            eVar.h(new d.h(beduinStepperModel, BeduinStepperModel.a(beduinStepperModel, null, iIntValue, null, null, 1019)));
            com.avito.android.beduin_shared.model.utils.a.a(aVar.f102715f, aVar.f102714e.f());
            return G0.f406611a;
        }
    }

    public a(@Y61.k BeduinStepperModel beduinStepperModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k lj.e eVar) {
        this.f102714e = beduinStepperModel;
        this.f102715f = interfaceC15523b;
        this.f102716g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102714e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        return new k(new androidx.appcompat.view.d(viewGroup.getContext(), this.f102714e.g()), layoutParams);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinStepperModel beduinStepperModel = (BeduinStepperModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        StepperChange[] stepperChangeArrValues = StepperChange.values();
        if (stepperChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, StepperChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(stepperChangeArrValues));
        BeduinStepperModel beduinStepperModel2 = this.f102714e;
        if (!L.f(fVar.invoke(beduinStepperModel2), fVar.invoke(beduinStepperModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StepperChange stepperChange : stepperChangeArrValues) {
            if (!L.f(stepperChange.b().invoke(beduinStepperModel2), stepperChange.b().invoke(beduinStepperModel))) {
                arrayList.add(stepperChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    @Override // ej.AbstractC40112a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(ej.InterfaceC40116e r7) {
        /*
            r6 = this;
            com.avito.android.beduin.common.component.stepper.k r7 = (com.avito.android.beduin.common.component.stepper.k) r7
            com.avito.android.beduin.common.component.stepper.BeduinStepperModel r0 = r6.f102714e
            java.lang.String r1 = r0.getStyle()
            com.avito.android.lib.design.component_container.ComponentContainer r2 = r7.f102727b
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "medium"
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            int r4 = r1.hashCode()
            r5 = 2130974877(0x7f04189d, float:1.755859E38)
            switch(r4) {
                case -1078030475: goto L73;
                case -255376411: goto L62;
                case 102742843: goto L51;
                case 109548807: goto L40;
                case 267827403: goto L2f;
                case 274633367: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L79
        L1e:
            java.lang.String r3 = "overlaySmall"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
            goto L79
        L27:
            r1 = 2130974880(0x7f0418a0, float:1.7558596E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7f
        L2f:
            java.lang.String r3 = "overlayLarge"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L38
            goto L79
        L38:
            r1 = 2130974878(0x7f04189e, float:1.7558592E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7f
        L40:
            java.lang.String r3 = "small"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L49
            goto L79
        L49:
            r1 = 2130974881(0x7f0418a1, float:1.7558598E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7f
        L51:
            java.lang.String r3 = "large"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5a
            goto L79
        L5a:
            r1 = 2130974876(0x7f04189c, float:1.7558587E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7f
        L62:
            java.lang.String r3 = "overlayMedium"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6b
            goto L79
        L6b:
            r1 = 2130974879(0x7f04189f, float:1.7558594E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L7f
        L73:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7b
        L79:
            r1 = 0
            goto L7f
        L7b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L7f:
            if (r1 == 0) goto L85
            int r5 = r1.intValue()
        L85:
            int r1 = com.avito.android.lib.util.f.s(r5, r2)
            com.avito.android.lib.design.stepper.Stepper r2 = r7.f102728c
            r2.setAppearance(r1)
            com.avito.android.beduin.common.component.stepper.b r1 = new com.avito.android.beduin.common.component.stepper.b
            r1.<init>(r6)
            r6.p(r7, r1)
            com.avito.android.beduin.common.component.stepper.l.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.stepper.a.m(ej.e):void");
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        f fVar = new f((k) interfaceC40116e, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(fVar, list);
    }

    public final void p(k kVar, Y41.l<? super Stepper, G0> lVar) {
        Stepper stepper = kVar.f102728c;
        stepper.setOnValueChangeListener(b.f102717l);
        lVar.invoke(stepper);
        stepper.setOnValueChangeListener(new c());
    }
}
