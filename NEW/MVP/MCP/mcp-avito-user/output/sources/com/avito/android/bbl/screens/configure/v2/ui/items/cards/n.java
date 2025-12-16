package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BblSelectorCardPreview.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/D;", "item", "", "Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/ItemIndex;", "index", "Landroidx/compose/ui/v;", "modifier", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bbl/screens/configure/v2/ui/items/cards/D;ILandroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.s<D, Integer, androidx.compose.ui.v, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<C28729a> f99436l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.runtime.snapshots.D<C28729a> d12) {
        super(5);
        this.f99436l = d12;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    @Override // Y41.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.bbl.screens.configure.v2.ui.items.cards.D r7, java.lang.Integer r8, androidx.compose.ui.v r9, androidx.compose.runtime.A r10, java.lang.Integer r11) {
        /*
            r6 = this;
            r1 = r7
            com.avito.android.bbl.screens.configure.v2.ui.items.cards.D r1 = (com.avito.android.bbl.screens.configure.v2.ui.items.cards.D) r1
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r2 = r9
            androidx.compose.ui.v r2 = (androidx.compose.ui.v) r2
            r4 = r10
            androidx.compose.runtime.A r4 = (androidx.compose.runtime.A) r4
            java.lang.Number r11 = (java.lang.Number) r11
            int r7 = r11.intValue()
            r8 = r7 & 14
            if (r8 != 0) goto L24
            boolean r8 = r4.B(r1)
            if (r8 == 0) goto L21
            r8 = 4
            goto L22
        L21:
            r8 = 2
        L22:
            r8 = r8 | r7
            goto L25
        L24:
            r8 = r7
        L25:
            r9 = r7 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L35
            boolean r9 = r4.m(r0)
            if (r9 == 0) goto L32
            r9 = 32
            goto L34
        L32:
            r9 = 16
        L34:
            r8 = r8 | r9
        L35:
            r7 = r7 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L45
            boolean r7 = r4.B(r2)
            if (r7 == 0) goto L42
            r7 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r7 = 128(0x80, float:1.8E-43)
        L44:
            r8 = r8 | r7
        L45:
            r7 = r8 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r7 != r9) goto L56
            boolean r7 = r4.c()
            if (r7 != 0) goto L52
            goto L56
        L52:
            r4.f()
            goto L8f
        L56:
            r7 = -616416367(0xffffffffdb423b91, float:-5.467164E16)
            r4.C(r7)
            androidx.compose.runtime.snapshots.D<com.avito.android.bbl.screens.configure.v2.ui.items.cards.a> r7 = r6.f99436l
            boolean r9 = r4.B(r7)
            java.lang.Object r10 = r4.t()
            if (r9 != 0) goto L71
            androidx.compose.runtime.A$a r9 = androidx.compose.runtime.A.f37866a
            r9.getClass()
            androidx.compose.runtime.A$a$a r9 = androidx.compose.runtime.A.a.f37868b
            if (r10 != r9) goto L79
        L71:
            com.avito.android.bbl.screens.configure.v2.ui.items.cards.m r10 = new com.avito.android.bbl.screens.configure.v2.ui.items.cards.m
            r10.<init>(r7)
            r4.H(r10)
        L79:
            r3 = r10
            Y41.l r3 = (Y41.l) r3
            r4.h()
            int r7 = r8 >> 3
            r7 = r7 & 14
            int r9 = r8 << 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            r7 = r7 | r9
            r8 = r8 & 896(0x380, float:1.256E-42)
            r5 = r7 | r8
            com.avito.android.bbl.screens.configure.v2.ui.items.cards.l.a(r0, r1, r2, r3, r4, r5)
        L8f:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bbl.screens.configure.v2.ui.items.cards.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
