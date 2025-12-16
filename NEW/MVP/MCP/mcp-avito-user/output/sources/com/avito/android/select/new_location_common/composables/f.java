package com.avito.android.select.new_location_common.composables;

import androidx.compose.runtime.A;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxExpandableLine.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckBoxExpandableLineState f265872l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f265873m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f265874n;

    /* compiled from: CheckboxExpandableLine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CheckBoxExpandableLineState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckBoxExpandableLineState checkBoxExpandableLineState = CheckBoxExpandableLineState.f265893b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckBoxExpandableLineState checkBoxExpandableLineState2 = CheckBoxExpandableLineState.f265893b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(CheckBoxExpandableLineState checkBoxExpandableLineState, Y41.a<G0> aVar, String str) {
        super(2);
        this.f265872l = checkBoxExpandableLineState;
        this.f265873m = (N) aVar;
        this.f265874n = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Type inference failed for: r10v8, types: [Y41.a, java.lang.Object, kotlin.jvm.internal.N] */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
        /*
            r9 = this;
            r6 = r10
            androidx.compose.runtime.A r6 = (androidx.compose.runtime.A) r6
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            r10 = r10 & 11
            r11 = 2
            if (r10 != r11) goto L19
            boolean r10 = r6.c()
            if (r10 != 0) goto L15
            goto L19
        L15:
            r6.f()
            goto L86
        L19:
            com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState r10 = r9.f265872l
            int r10 = r10.ordinal()
            if (r10 == 0) goto L33
            r0 = 1
            if (r10 == r0) goto L30
            if (r10 != r11) goto L2a
            androidx.compose.ui.state.ToggleableState r10 = androidx.compose.ui.state.ToggleableState.f41896b
        L28:
            r0 = r10
            goto L36
        L2a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L30:
            androidx.compose.ui.state.ToggleableState r10 = androidx.compose.ui.state.ToggleableState.f41898d
            goto L28
        L33:
            androidx.compose.ui.state.ToggleableState r10 = androidx.compose.ui.state.ToggleableState.f41897c
            goto L28
        L36:
            r10 = -1189538331(0xffffffffb91915e5, float:-1.4599373E-4)
            r6.C(r10)
            kotlin.jvm.internal.N r10 = r9.f265873m
            boolean r11 = r6.B(r10)
            java.lang.Object r1 = r6.t()
            if (r11 != 0) goto L51
            androidx.compose.runtime.A$a r11 = androidx.compose.runtime.A.f37866a
            r11.getClass()
            androidx.compose.runtime.A$a$a r11 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r11) goto L59
        L51:
            com.avito.android.select.new_location_common.composables.e r1 = new com.avito.android.select.new_location_common.composables.e
            r1.<init>(r10)
            r6.H(r1)
        L59:
            Y41.a r1 = (Y41.a) r1
            r6.h()
            com.akita.compose.theme.re23.b r10 = com.akita.compose.theme.re23.b.f63983a
            r10.getClass()
            com.akita.compose.theme.re23.style.g4 r10 = com.akita.compose.theme.re23.b.v(r6)
            com.akita.compose.component.toggle.u r2 = r10.getF66824b()
            androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
            com.avito.android.select.new_districts.compose.h r11 = com.avito.android.select.new_districts.compose.C34621h.f265749a
            r11.getClass()
            java.lang.String r11 = "check_toggle_"
            java.lang.String r3 = r9.f265874n
            java.lang.String r11 = r11.concat(r3)
            androidx.compose.ui.v r3 = androidx.compose.ui.platform.C22501m2.a(r10, r11)
            r7 = 0
            r8 = 112(0x70, float:1.57E-43)
            r4 = 0
            r5 = 0
            com.akita.compose.component.toggle.j.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L86:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_location_common.composables.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
