package com.avito.android.lib.beduin_v2.component.date_picker;

import Y41.p;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AbstractC22450a;
import com.akita.compose.component.date_picker.C;
import com.akita.compose.component.date_picker.E;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.z;
import com.akita.compose.foundation.r;
import com.akita.compose.theme.re23.style.C27576r0;
import com.akita.compose.theme.re23.style.InterfaceC27562o0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;

/* compiled from: DatePickerCompose.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR4\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R.\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001b0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R+\u0010*\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/date_picker/j;", "Landroidx/compose/ui/platform/a;", "Lcom/avito/android/lib/beduin_v2/component/date_picker/k;", "<set-?>", "j", "Landroidx/compose/runtime/y1;", "getState$_design_modules_beduin_v2_renderer_component_date_picker", "()Lcom/avito/android/lib/beduin_v2/component/date_picker/k;", "setState$_design_modules_beduin_v2_renderer_component_date_picker", "(Lcom/avito/android/lib/beduin_v2/component/date_picker/k;)V", VoiceInfo.STATE, "Lkotlin/Function1;", "", "Lkotlin/ranges/o;", "Lkotlin/G0;", "k", "LY41/l;", "getOnSelectedDatesChange$_design_modules_beduin_v2_renderer_component_date_picker", "()LY41/l;", "setOnSelectedDatesChange$_design_modules_beduin_v2_renderer_component_date_picker", "(LY41/l;)V", "onSelectedDatesChange", "", "l", "getOnSpecialDateClicked$_design_modules_beduin_v2_renderer_component_date_picker", "setOnSpecialDateClicked$_design_modules_beduin_v2_renderer_component_date_picker", "onSpecialDateClicked", "", "m", "getDisabledDateRangeValidator$_design_modules_beduin_v2_renderer_component_date_picker", "setDisabledDateRangeValidator$_design_modules_beduin_v2_renderer_component_date_picker", "disabledDateRangeValidator", "n", "getSpecialDateValidator$_design_modules_beduin_v2_renderer_component_date_picker", "setSpecialDateValidator$_design_modules_beduin_v2_renderer_component_date_picker", "specialDateValidator", "Lcom/avito/android/lib/beduin_v2/component/date_picker/m;", "o", "getStyle$_design_modules_beduin_v2_renderer_component_date_picker", "()Lcom/avito/android/lib/beduin_v2/component/date_picker/m;", "setStyle$_design_modules_beduin_v2_renderer_component_date_picker", "(Lcom/avito/android/lib/beduin_v2/component/date_picker/m;)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "_design-modules_beduin-v2_renderer_component_date-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 state;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super List<o>, G0> onSelectedDatesChange;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super Long, G0> onSpecialDateClicked;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super o, Boolean> disabledDateRangeValidator;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super Long, Boolean> specialDateValidator;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 style;

    /* compiled from: DatePickerCompose.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            F f12;
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                j jVar = j.this;
                C cA2 = E.a(jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175553a, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175554b, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175555c, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175556d, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175557e, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175558f, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175559g, jVar.getState$_design_modules_beduin_v2_renderer_component_date_picker().f175560h, false, a13, 256);
                com.avito.android.lib.beduin_v2.component.date_picker.f fVar = new com.avito.android.lib.beduin_v2.component.date_picker.f(1, jVar, j.class, "onSpecialDateClicked", "onSpecialDateClicked(J)V", 0);
                g gVar = new g(1, jVar, j.class, "onSelectedDatesChange", "onSelectedDatesChange(Ljava/util/List;)V", 0);
                h hVar = new h(1, jVar, j.class, "disableDateRangeValidator", "disableDateRangeValidator(Lkotlin/ranges/LongRange;)Z", 0);
                i iVar = new i(1, jVar, j.class, "specialDateValidator", "specialDateValidator(J)Z", 0);
                m style$_design_modules_beduin_v2_renderer_component_date_picker = jVar.getStyle$_design_modules_beduin_v2_renderer_component_date_picker();
                style$_design_modules_beduin_v2_renderer_component_date_picker.getClass();
                a13.C(-1770442395);
                if (L.f(style$_design_modules_beduin_v2_renderer_component_date_picker.f175562a, "datePickerDefault")) {
                    a13.C(-1492600049);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    f12 = ((InterfaceC27562o0) a13.o(C27576r0.f66726b)).getDefault();
                    a13.h();
                } else {
                    a13.C(-1492598193);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    f12 = ((InterfaceC27562o0) a13.o(C27576r0.f66726b)).getDefault();
                    a13.h();
                }
                F.a aVar = f12.f61127a;
                r rVar = style$_design_modules_beduin_v2_renderer_component_date_picker.f175563b;
                if (rVar == null) {
                    rVar = aVar.f61145a;
                }
                r rVar2 = rVar;
                androidx.compose.ui.unit.h hVar2 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175564c;
                float f13 = hVar2 != null ? hVar2.f42852b : aVar.f61146b;
                com.akita.compose.foundation.p pVar = style$_design_modules_beduin_v2_renderer_component_date_picker.f175565d;
                if (pVar == null) {
                    pVar = aVar.f61147c;
                }
                com.akita.compose.foundation.p pVar2 = pVar;
                androidx.compose.ui.unit.h hVar3 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175566e;
                float f14 = hVar3 != null ? hVar3.f42852b : aVar.f61148d;
                com.akita.compose.foundation.p pVar3 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175569h;
                if (pVar3 == null) {
                    pVar3 = aVar.f61147c;
                }
                com.akita.compose.foundation.p pVar4 = pVar3;
                com.akita.compose.foundation.p pVar5 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175570i;
                if (pVar5 == null) {
                    pVar5 = aVar.f61152h;
                }
                com.akita.compose.foundation.p pVar6 = pVar5;
                com.akita.compose.foundation.p pVar7 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175571j;
                if (pVar7 == null) {
                    pVar7 = aVar.f61153i;
                }
                com.akita.compose.foundation.p pVar8 = pVar7;
                com.akita.compose.foundation.p pVar9 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175572k;
                if (pVar9 == null) {
                    pVar9 = aVar.f61154j;
                }
                com.akita.compose.foundation.p pVar10 = pVar9;
                com.akita.compose.foundation.p pVar11 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175573l;
                if (pVar11 == null) {
                    pVar11 = aVar.f61155k;
                }
                com.akita.compose.foundation.p pVar12 = pVar11;
                com.akita.compose.foundation.p pVar13 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175574m;
                if (pVar13 == null) {
                    pVar13 = aVar.f61156l;
                }
                com.akita.compose.foundation.p pVar14 = pVar13;
                com.akita.compose.foundation.p pVar15 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175575n;
                if (pVar15 == null) {
                    pVar15 = aVar.f61157m;
                }
                com.akita.compose.foundation.p pVar16 = pVar15;
                com.akita.compose.foundation.p pVar17 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175576o;
                if (pVar17 == null) {
                    pVar17 = aVar.f61158n;
                }
                com.akita.compose.foundation.p pVar18 = pVar17;
                com.akita.compose.foundation.p pVar19 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175577p;
                if (pVar19 == null) {
                    pVar19 = aVar.f61159o;
                }
                com.akita.compose.foundation.p pVar20 = pVar19;
                androidx.compose.ui.unit.l lVar = style$_design_modules_beduin_v2_renderer_component_date_picker.f175578q;
                long j12 = lVar != null ? lVar.f42861a : aVar.f61160p;
                androidx.compose.ui.unit.h hVar4 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175568g;
                float f15 = hVar4 != null ? hVar4.f42852b : aVar.f61150f;
                com.akita.compose.foundation.p pVar21 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175567f;
                if (pVar21 == null) {
                    pVar21 = aVar.f61149e;
                }
                aVar.getClass();
                F.a aVar2 = new F.a(rVar2, f13, pVar2, f14, pVar21, f15, pVar4, pVar6, pVar8, pVar10, pVar12, pVar14, pVar16, pVar18, pVar20, j12, null);
                com.akita.compose.foundation.p pVar22 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175579r;
                if (pVar22 == null) {
                    pVar22 = f12.f61129c;
                }
                com.akita.compose.foundation.p pVar23 = pVar22;
                r rVar3 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175580s;
                if (rVar3 == null) {
                    rVar3 = f12.f61130d;
                }
                r rVar4 = rVar3;
                r rVar5 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175581t;
                if (rVar5 == null) {
                    rVar5 = f12.f61131e;
                }
                r rVar6 = rVar5;
                androidx.compose.ui.unit.h hVar5 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175582u;
                float f16 = hVar5 != null ? hVar5.f42852b : f12.f61132f;
                androidx.compose.ui.unit.h hVar6 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175583v;
                float f17 = hVar6 != null ? hVar6.f42852b : f12.f61133g;
                androidx.compose.ui.unit.h hVar7 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175584w;
                float f18 = hVar7 != null ? hVar7.f42852b : f12.f61134h;
                androidx.compose.ui.unit.h hVar8 = style$_design_modules_beduin_v2_renderer_component_date_picker.f175585x;
                F f19 = new F(aVar2, f12.f61128b, pVar23, rVar4, rVar6, f16, f17, f18, hVar8 != null ? hVar8.f42852b : f12.f61135i, f12.f61136j, f12.f61137k, f12.f61138l, f12.f61139m, f12.f61140n, f12.f61141o, f12.f61142p, f12.f61143q, f12.f61144r, null);
                a13.h();
                z.a(cA2, gVar, null, fVar, hVar, iVar, f19, a13, F.f61126s << 18, 4);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerCompose.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            j.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerCompose.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/o;", "it", "", "invoke", "(Lkotlin/ranges/o;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<o, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f175549l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(o oVar) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DatePickerCompose.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/ranges/o;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<List<? extends o>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f175550l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(List<? extends o> list) {
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerCompose.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f175551l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Long l12) {
            l12.longValue();
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerCompose.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.l<Long, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f175552l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Long l12) {
            l12.longValue();
            return Boolean.FALSE;
        }
    }

    public j(@Y61.k Context context) {
        super(context, null, 0, 6, null);
        this.state = C22126m3.g(new k(null, null, 0, null, null, false, false, false, 255, null));
        this.onSelectedDatesChange = d.f175550l;
        this.onSpecialDateClicked = e.f175551l;
        this.disabledDateRangeValidator = c.f175549l;
        this.specialDateValidator = f.f175552l;
        this.style = C22126m3.g(new m(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null));
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.l A a12, int i12) {
        B bE2 = a12.E(-1474794013);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(696828286, new a(), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    @Y61.k
    public final Y41.l<o, Boolean> getDisabledDateRangeValidator$_design_modules_beduin_v2_renderer_component_date_picker() {
        return this.disabledDateRangeValidator;
    }

    @Y61.k
    public final Y41.l<List<o>, G0> getOnSelectedDatesChange$_design_modules_beduin_v2_renderer_component_date_picker() {
        return this.onSelectedDatesChange;
    }

    @Y61.k
    public final Y41.l<Long, G0> getOnSpecialDateClicked$_design_modules_beduin_v2_renderer_component_date_picker() {
        return this.onSpecialDateClicked;
    }

    @Y61.k
    public final Y41.l<Long, Boolean> getSpecialDateValidator$_design_modules_beduin_v2_renderer_component_date_picker() {
        return this.specialDateValidator;
    }

    @Y61.k
    public final k getState$_design_modules_beduin_v2_renderer_component_date_picker() {
        return (k) ((C22082i3) this.state).getF42167b();
    }

    @Y61.k
    public final m getStyle$_design_modules_beduin_v2_renderer_component_date_picker() {
        return (m) ((C22082i3) this.style).getF42167b();
    }

    public final void setDisabledDateRangeValidator$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k Y41.l<? super o, Boolean> lVar) {
        this.disabledDateRangeValidator = lVar;
    }

    public final void setOnSelectedDatesChange$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k Y41.l<? super List<o>, G0> lVar) {
        this.onSelectedDatesChange = lVar;
    }

    public final void setOnSpecialDateClicked$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k Y41.l<? super Long, G0> lVar) {
        this.onSpecialDateClicked = lVar;
    }

    public final void setSpecialDateValidator$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k Y41.l<? super Long, Boolean> lVar) {
        this.specialDateValidator = lVar;
    }

    public final void setState$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k k kVar) {
        ((C22082i3) this.state).setValue(kVar);
    }

    public final void setStyle$_design_modules_beduin_v2_renderer_component_date_picker(@Y61.k m mVar) {
        ((C22082i3) this.style).setValue(mVar);
    }
}
