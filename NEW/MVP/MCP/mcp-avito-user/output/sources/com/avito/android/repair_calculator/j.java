package com.avito.android.repair_calculator;

import Y41.p;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.RepairPrices;
import j.InterfaceC42156l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsRepairCalculatorItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/repair_calculator/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/repair_calculator/i;", "a", "b", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f254487j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f254488b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f254489c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f254490d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f254491e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f254492f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f254493g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.chips.h f254494h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Map<com.avito.android.lib.design.chips.h, Integer> f254495i;

    /* compiled from: AdvertDetailsRepairCalculatorItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/repair_calculator/j$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f254496b;

        public a(@Y61.k String str) {
            this.f254496b = str;
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
        public final boolean V1(@Y61.k Object obj) {
            return L.f(this.f254496b, ((a) obj).f254496b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f254496b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f254496b, ((a) obj).f254496b);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
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

        public final int hashCode() {
            return this.f254496b.hashCode();
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChipItem(title="), this.f254496b, ')');
        }
    }

    /* compiled from: AdvertDetailsRepairCalculatorItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/repair_calculator/j$b;", "", "<init>", "()V", "", "CAPITAL_CHIP_TITLE", "Ljava/lang/String;", "COSMETIC_CHIP_TITLE", "DESIGNER_CHIP_TITLE", "GREYBOX_CHIP_TITLE", "REPAIR_TYPE_CAPITAL_PARAM", "REPAIR_TYPE_COSMETIC_PARAM", "REPAIR_TYPE_DESIGNER_PARAM", "REPAIR_TYPE_GREYBOX_PARAM", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public j(@Y61.k View view) {
        super(view);
        this.f254488b = view;
        View viewFindViewById = view.findViewById(R.id.repair_chips);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f254489c = (Chips) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.type_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f254490d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f254491e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.show_masters_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f254492f = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iv_help);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f254493g = (ImageView) viewFindViewById5;
    }

    @Override // com.avito.android.repair_calculator.i
    public final void Hm(@Y61.k Y41.a<G0> aVar) {
        this.f254493g.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(28, aVar));
    }

    @Override // com.avito.android.repair_calculator.i
    public final void nk(@Y61.k p<? super String, ? super Integer, G0> pVar) {
        this.f254492f.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(19, this, pVar));
    }

    @Override // com.avito.android.repair_calculator.i
    public final void qp(@Y61.k RepairPrices repairPrices, @l Boolean bool, @Y61.k Y41.l<? super String, G0> lVar) {
        List<? extends com.avito.android.lib.design.chips.h> listM0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer greybox = repairPrices.getGreybox();
        if (greybox != null) {
        }
        Integer cosmetic = repairPrices.getCosmetic();
        if (cosmetic != null) {
        }
        Integer capital = repairPrices.getCapital();
        if (capital != null) {
        }
        Integer designer = repairPrices.getDesigner();
        if (designer != null) {
        }
        Map<com.avito.android.lib.design.chips.h, Integer> mapQ = P0.q(linkedHashMap);
        this.f254495i = mapQ;
        Set<com.avito.android.lib.design.chips.h> setKeySet = mapQ.keySet();
        Chips chips = this.f254489c;
        if (setKeySet != null && (listM0 = C42745f0.M0(setKeySet)) != null) {
            chips.setData(listM0);
        }
        chips.setChipsSelectedListener(new c(lVar, this, bool));
        chips.p(0, true);
    }

    /* compiled from: AdvertDetailsRepairCalculatorItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/repair_calculator/j$c", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f254497a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f254498b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Boolean f254499c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super String, G0> lVar, j jVar, Boolean bool) {
            this.f254497a = lVar;
            this.f254498b = jVar;
            this.f254499c = bool;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
        @Override // com.avito.android.lib.design.chips.Chips.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(@Y61.k com.avito.android.lib.design.chips.h r12) throws android.content.res.Resources.NotFoundException {
            /*
                r11 = this;
                java.lang.CharSequence r0 = r12.getF262141c()
                java.lang.String r0 = r0.toString()
                Y41.l<java.lang.String, kotlin.G0> r1 = r11.f254497a
                com.avito.android.repair_calculator.d r1 = (com.avito.android.repair_calculator.d) r1
                r1.invoke(r0)
                com.avito.android.repair_calculator.j r0 = r11.f254498b
                r0.f254494h = r12
                java.lang.CharSequence r1 = r12.getF262141c()
                java.lang.String r1 = r1.toString()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                java.lang.Boolean r3 = r11.f254499c
                boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
                android.view.View r3 = r0.f254488b
                r4 = 0
                java.lang.String r5 = "Капитальный"
                r6 = 2131956570(0x7f13135a, float:1.95497E38)
                java.lang.String r7 = "Дизайнерский"
                r8 = 2131956571(0x7f13135b, float:1.9549701E38)
                java.lang.String r9 = "Черновой"
                java.lang.String r10 = "Косметический"
                if (r2 == 0) goto L87
                int r2 = r1.hashCode()
                switch(r2) {
                    case 290245949: goto L73;
                    case 1253795238: goto L63;
                    case 1659424346: goto L52;
                    case 1990230516: goto L3e;
                    default: goto L3d;
                }
            L3d:
                goto L79
            L3e:
                boolean r1 = r1.equals(r10)
                if (r1 != 0) goto L45
                goto L79
            L45:
                android.content.res.Resources r1 = r3.getResources()
                r2 = 2131956568(0x7f131358, float:1.9549695E38)
                java.lang.String r1 = r1.getString(r2)
                goto Ld4
            L52:
                boolean r1 = r1.equals(r9)
                if (r1 != 0) goto L59
                goto L79
            L59:
                android.content.res.Resources r1 = r3.getResources()
                java.lang.String r1 = r1.getString(r8)
                goto Ld4
            L63:
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L6a
                goto L79
            L6a:
                android.content.res.Resources r1 = r3.getResources()
                java.lang.String r1 = r1.getString(r6)
                goto Ld4
            L73:
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L7b
            L79:
                r1 = r4
                goto Ld4
            L7b:
                android.content.res.Resources r1 = r3.getResources()
                r2 = 2131956567(0x7f131357, float:1.9549693E38)
                java.lang.String r1 = r1.getString(r2)
                goto Ld4
            L87:
                int r2 = r1.hashCode()
                switch(r2) {
                    case 290245949: goto Lc2;
                    case 1253795238: goto Lb2;
                    case 1659424346: goto La2;
                    case 1990230516: goto L8f;
                    default: goto L8e;
                }
            L8e:
                goto Lc8
            L8f:
                boolean r1 = r1.equals(r10)
                if (r1 != 0) goto L96
                goto Lc8
            L96:
                android.content.res.Resources r1 = r3.getResources()
                r2 = 2131956569(0x7f131359, float:1.9549697E38)
                java.lang.String r1 = r1.getString(r2)
                goto Ld4
            La2:
                boolean r1 = r1.equals(r9)
                if (r1 != 0) goto La9
                goto Lc8
            La9:
                android.content.res.Resources r1 = r3.getResources()
                java.lang.String r1 = r1.getString(r8)
                goto Ld4
            Lb2:
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto Lb9
                goto Lc8
            Lb9:
                android.content.res.Resources r1 = r3.getResources()
                java.lang.String r1 = r1.getString(r6)
                goto Ld4
            Lc2:
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto Lc9
            Lc8:
                goto L79
            Lc9:
                android.content.res.Resources r1 = r3.getResources()
                r2 = 2131956566(0x7f131356, float:1.9549691E38)
                java.lang.String r1 = r1.getString(r2)
            Ld4:
                android.widget.TextView r2 = r0.f254490d
                r5 = 0
                com.avito.android.util.I5.a(r2, r1, r5)
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "ru"
                java.lang.String r6 = "RU"
                r1.<init>(r2, r6)
                java.text.NumberFormat r1 = java.text.NumberFormat.getInstance(r1)
                java.util.Map<com.avito.android.lib.design.chips.h, java.lang.Integer> r2 = r0.f254495i
                if (r2 == 0) goto Lf2
                java.lang.Object r12 = r2.get(r12)
                r4 = r12
                java.lang.Integer r4 = (java.lang.Integer) r4
            Lf2:
                android.content.res.Resources r12 = r3.getResources()
                java.lang.String r1 = r1.format(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                r2 = 2131956572(0x7f13135c, float:1.9549704E38)
                java.lang.String r12 = r12.getString(r2, r1)
                android.widget.TextView r0 = r0.f254491e
                com.avito.android.util.I5.a(r0, r12, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.repair_calculator.j.c.b(com.avito.android.lib.design.chips.h):void");
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
