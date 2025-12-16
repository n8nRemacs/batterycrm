package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.lib.design.radio.RadioGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRadioGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/radio/RadioGroup;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<RadioGroup, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinRadioGroupChange f102195l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f102196m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RadioGroup f102197n;

    /* compiled from: BeduinRadioGroupComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BeduinRadioGroupChange.values().length];
            try {
                iArr[BeduinRadioGroupChange.f102182c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinRadioGroupChange.f102183d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinRadioGroupChange.f102184e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeduinRadioGroupChange beduinRadioGroupChange, e eVar, RadioGroup radioGroup) {
        super(1);
        this.f102195l = beduinRadioGroupChange;
        this.f102196m = eVar;
        this.f102197n = radioGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[PHI: r5
  0x00b6: PHI (r5v11 java.lang.Boolean) = (r5v5 java.lang.Boolean), (r5v7 java.lang.Boolean) binds: [B:32:0x00b4, B:37:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.lib.design.radio.RadioGroup r10) {
        /*
            r9 = this;
            com.avito.android.lib.design.radio.RadioGroup r10 = (com.avito.android.lib.design.radio.RadioGroup) r10
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupChange r0 = r9.f102195l
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            com.avito.android.beduin.common.component.radio_group.e r3 = r9.f102196m
            if (r0 == 0) goto L67
            if (r0 == r2) goto L20
            r1 = 2
            if (r0 == r1) goto L15
            goto Lda
        L15:
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r0 = r3.f102204i
            java.lang.String r0 = r0.getErrorMessageToDisplay()
            r10.setHint(r0)
            goto Lda
        L20:
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r0 = r3.f102204i
            java.lang.String r0 = r0.getSelectedId()
            if (r0 != 0) goto L2e
            r0 = -1
            r10.a(r0)
            goto Lda
        L2e:
            androidx.core.view.k0 r0 = new androidx.core.view.k0
            r0.<init>(r10)
            java.util.Iterator r10 = r0.iterator()
        L37:
            r0 = r10
            androidx.core.view.m0 r0 = (androidx.core.view.C22833m0) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r0 = r0.next()
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r2 = r2.getTag()
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r4 = r3.f102204i
            java.lang.String r4 = r4.getSelectedId()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r4)
            if (r2 == 0) goto L37
            r1 = r0
        L58:
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lda
            com.avito.android.lib.design.radio.RadioGroup r10 = r9.f102197n
            int r0 = r1.getId()
            r10.a(r0)
            goto Lda
        L67:
            androidx.core.view.k0 r0 = new androidx.core.view.k0
            r0.<init>(r10)
            com.avito.android.beduin.common.component.radio_group.c r4 = com.avito.android.beduin.common.component.radio_group.c.f102198l
            kotlin.sequences.h r0 = kotlin.sequences.C43033p.i(r0, r4)
            kotlin.sequences.h$a r4 = new kotlin.sequences.h$a
            r4.<init>(r0)
        L77:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r4.next()
            com.avito.android.lib.design.radio.RadioButton r0 = (com.avito.android.lib.design.radio.RadioButton) r0
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r5 = r3.f102204i
            java.util.List r5 = r5.getOptions()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L8f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lab
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.avito.android.beduin.common.component.radio_group.Option r7 = (com.avito.android.beduin.common.component.radio_group.Option) r7
            java.lang.String r7 = r7.getId()
            java.lang.Object r8 = r0.getTag()
            boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
            if (r7 == 0) goto L8f
            goto Lac
        Lab:
            r6 = r1
        Lac:
            com.avito.android.beduin.common.component.radio_group.Option r6 = (com.avito.android.beduin.common.component.radio_group.Option) r6
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r5 = r3.f102204i
            java.lang.Boolean r5 = r5.isEnabled()
            if (r5 == 0) goto Lbb
        Lb6:
            boolean r5 = r5.booleanValue()
            goto Lc7
        Lbb:
            if (r6 == 0) goto Lc2
            java.lang.Boolean r5 = r6.isEnabled()
            goto Lc3
        Lc2:
            r5 = r1
        Lc3:
            if (r5 == 0) goto Lc6
            goto Lb6
        Lc6:
            r5 = r2
        Lc7:
            r0.setEnabled(r5)
            goto L77
        Lcb:
            com.avito.android.beduin.common.component.radio_group.BeduinRadioGroupModel r0 = r3.f102204i
            java.lang.Boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Ld7
            boolean r2 = r0.booleanValue()
        Ld7:
            r10.setEnabled(r2)
        Lda:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.radio_group.b.invoke(java.lang.Object):java.lang.Object");
    }
}
