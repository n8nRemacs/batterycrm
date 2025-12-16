package com.avito.android.category_with_params.screen;

import Y41.r;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.category_with_params.entity.ListItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class e extends N implements r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f117718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f117719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f117720n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l f117721o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, float f12, boolean z12, Y41.l lVar) {
        super(4);
        this.f117718l = list;
        this.f117719m = f12;
        this.f117720n = z12;
        this.f117721o = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            ListItem listItem = (ListItem) this.f117718l.get(iIntValue);
            a13.C(1688440869);
            if (listItem instanceof ListItem.Divider) {
                a13.C(-361174778);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                v vVarJ = R1.j(C20588k2.d(v.f42878y1, 1.0f), this.f117719m, 8);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63987e.getClass();
                com.akita.compose.theme.re23.semantic.b.f65954b.getBorder().getClass();
                com.avito.android.lib.compose.design.shared.divider.a.a(vVarJ, X2.c.f18151l, 0.0f, 0.0f, a13, 6, 12);
                a13.h();
            } else if (listItem instanceof ListItem.Option) {
                a13.C(-361165264);
                i.a((ListItem.Option) listItem, this.f117719m, this.f117720n, this.f117721o, a13, 56);
                a13.h();
            } else {
                a13.C(1688989599);
                a13.h();
            }
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
