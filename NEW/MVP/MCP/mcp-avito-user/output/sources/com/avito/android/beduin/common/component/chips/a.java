package com.avito.android.beduin.common.component.chips;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.chips.BeduinChipsModel;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.j;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.SelectStrategy;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.util.q;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinChipsComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/chips/BeduinChipsModel;", "Lcom/avito/android/lib/design/chips/Chips;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinChipsModel, Chips> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101022e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinChipsModel f101023f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f101024g;

    /* compiled from: BeduinChipsComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/a$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.chips.a$a, reason: collision with other inner class name */
    public static final class C3031a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinChipsModel.Option f101025b;

        public C3031a(@k BeduinChipsModel.Option option) {
            this.f101025b = option;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            return (obj instanceof C3031a) && L.f(((C3031a) obj).f101025b.getId(), this.f101025b.getId());
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF114848c() {
            String title = this.f101025b.getTitle();
            return title == null ? "" : title;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            Integer numA;
            String leftIconName = this.f101025b.getLeftIconName();
            if (leftIconName == null || (numA = q.a(leftIconName)) == null) {
                return null;
            }
            return new e.b(numA.intValue());
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF293858c() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return this.f101025b.f();
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            Integer numA;
            String rightIconName = this.f101025b.getRightIconName();
            if (rightIconName == null || (numA = q.a(rightIconName)) == null) {
                return null;
            }
            return new e.b(numA.intValue());
        }
    }

    /* compiled from: BeduinChipsComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/chips/a$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f101026a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101027b = Collections.singletonList("chips");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinChipsModel> f101028c = BeduinChipsModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinChipsModel> S() {
            return f101028c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101027b;
        }
    }

    /* compiled from: BeduinChipsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101029a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101030b;

        static {
            int[] iArr = new int[BeduinChipsModel.SelectionType.values().length];
            try {
                iArr[BeduinChipsModel.SelectionType.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinChipsModel.SelectionType.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinChipsModel.SelectionType.SingleOptional.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101029a = iArr;
            int[] iArr2 = new int[BeduinChipsModel.DisplayType.values().length];
            try {
                iArr2[BeduinChipsModel.DisplayType.SingleLineFixed.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BeduinChipsModel.DisplayType.SingleLineScrollable.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BeduinChipsModel.DisplayType.SingleLineStretched.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BeduinChipsModel.DisplayType.MultiLine.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f101030b = iArr2;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinChipsModel beduinChipsModel, @k lj.e eVar) {
        this.f101022e = interfaceC15523b;
        this.f101023f = beduinChipsModel;
        this.f101024g = eVar;
    }

    public static final void u(a aVar, com.avito.android.lib.design.chips.h hVar, Chips chips, boolean z12) {
        List<BeduinAction> listD;
        List<com.avito.android.lib.design.chips.h> listS = chips.s();
        ArrayList arrayList = new ArrayList(C42745f0.q(listS, 10));
        Iterator it = ((ArrayList) listS).iterator();
        while (it.hasNext()) {
            arrayList.add(((C3031a) ((com.avito.android.lib.design.chips.h) it.next())).f101025b.getId());
        }
        BeduinChipsModel beduinChipsModel = aVar.f101023f;
        j.a(aVar.f101024g, beduinChipsModel.getF100853b(), new SelectedIdsTransform(arrayList), new ShowErrorMessageTransform(false));
        InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f101022e;
        if (z12 && (listD = beduinChipsModel.d()) != null) {
            C28806b.a(interfaceC15523b, listD);
        }
        List<BeduinAction> listD2 = ((C3031a) hVar).f101025b.d();
        if (listD2 != null) {
            C28806b.a(interfaceC15523b, listD2);
        }
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101023f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinChipsModel beduinChipsModel = (BeduinChipsModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        ChipsChange[] chipsChangeArrValues = ChipsChange.values();
        if (chipsChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, ChipsChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(chipsChangeArrValues));
        BeduinChipsModel beduinChipsModel2 = this.f101023f;
        if (!L.f(fVar.invoke(beduinChipsModel2), fVar.invoke(beduinChipsModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ChipsChange chipsChange : chipsChangeArrValues) {
            if (!L.f(chipsChange.b().invoke(beduinChipsModel2), chipsChange.b().invoke(beduinChipsModel))) {
                arrayList.add(chipsChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Chips chips = new Chips(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.beduin.common.component.a.a(this.f101023f.getTheme())), null);
        chips.setId(R.id.beduin_chips);
        chips.setLayoutParams(layoutParams);
        return chips;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        SelectStrategy selectStrategy;
        Chips.DisplayType displayType;
        Chips chips = (Chips) view;
        BeduinChipsModel beduinChipsModel = this.f101023f;
        chips.setTag(beduinChipsModel.getF100853b());
        String style = beduinChipsModel.getStyle();
        chips.setAppearanceFromAttr(style != null ? com.avito.android.lib.util.f.e(style) : R.attr.chipsLarge);
        chips.t(this.f395324b, this.f395325c);
        chips.setEnabled(beduinChipsModel.isEnabled());
        int i12 = c.f101029a[beduinChipsModel.f().ordinal()];
        if (i12 == 1) {
            selectStrategy = SelectStrategy.f178716b;
        } else if (i12 == 2) {
            selectStrategy = SelectStrategy.f178717c;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            selectStrategy = SelectStrategy.f178718d;
        }
        chips.setSelectStrategy(selectStrategy);
        chips.setKeepSelected(beduinChipsModel.f() == BeduinChipsModel.SelectionType.Single);
        int i13 = c.f101030b[beduinChipsModel.c().ordinal()];
        if (i13 == 1) {
            displayType = Chips.DisplayType.f178701b;
        } else if (i13 == 2) {
            displayType = Chips.DisplayType.f178703d;
        } else if (i13 == 3) {
            displayType = Chips.DisplayType.f178702c;
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            displayType = Chips.DisplayType.f178704e;
        }
        chips.setDisplayType(displayType);
        chips.setError(beduinChipsModel.getErrorMessageToDisplay());
        List<BeduinChipsModel.Option> options = beduinChipsModel.getOptions();
        ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3031a((BeduinChipsModel.Option) it.next()));
        }
        chips.setData(arrayList);
        v(chips, beduinChipsModel.e());
        chips.setChipsSelectedListener(new com.avito.android.beduin.common.component.chips.b(this, chips));
        chips.setChipsOnRightDrawableClickedListener(new com.avito.android.beduin.common.component.chips.c(chips));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        d dVar = new d(this, (Chips) view);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(dVar, list);
    }

    public final void v(Chips chips, List<String> list) {
        List<com.avito.android.lib.design.chips.h> listS = chips.s();
        ArrayList arrayList = new ArrayList(C42745f0.q(listS, 10));
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3031a) ((com.avito.android.lib.design.chips.h) it.next())).f101025b.getId());
        }
        if (arrayList.equals(list)) {
            return;
        }
        Chips.c chipsSelectedListener = chips.getChipsSelectedListener();
        chips.setChipsSelectedListener(null);
        HashSet hashSetK0 = C42745f0.K0(list);
        List<BeduinChipsModel.Option> options = this.f101023f.getOptions();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : options) {
            if (hashSetK0.contains(((BeduinChipsModel.Option) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        chips.j();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C3031a((BeduinChipsModel.Option) it2.next()));
        }
        chips.r(arrayList3);
        chips.setChipsSelectedListener(chipsSelectedListener);
    }
}
