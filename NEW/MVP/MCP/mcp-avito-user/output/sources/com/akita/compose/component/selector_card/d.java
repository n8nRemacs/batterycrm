package com.akita.compose.component.selector_card;

import Y41.q;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import com.akita.compose.component.toggle.j;
import com.akita.compose.component.toggle.r;
import com.akita.compose.component.toggle.u;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCard.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f62634l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectorCardType f62635m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f62636n;

    /* compiled from: SelectorCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SelectorCardType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectorCardType selectorCardType = SelectorCardType.f62626b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z12, SelectorCardType selectorCardType, h hVar) {
        super(3);
        this.f62634l = z12;
        this.f62635m = selectorCardType;
        this.f62636n = hVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else if (this.f62634l) {
            int iOrdinal = this.f62635m.ordinal();
            h hVar = this.f62636n;
            if (iOrdinal == 0) {
                a13.C(1921533728);
                u uVar = hVar.f62667e;
                v.a aVar = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                j.b(true, null, uVar, R1.h(interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39078d), hVar.f62670h), null, null, a13, 54, 112);
                a13.h();
            } else if (iOrdinal != 1) {
                a13.C(1921957560);
                a13.h();
            } else {
                a13.C(1921073502);
                u uVar2 = hVar.f62666d;
                v.a aVar2 = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                r.a(true, null, uVar2, R1.h(interfaceC20640y2.d(aVar2, InterfaceC22215f.a.f39078d), hVar.f62670h), null, null, a13, 54, 112);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
