package com.avito.android.mortgage_invite.common.presentation;

import Y41.q;
import Y61.k;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.p;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import u0.i;

/* compiled from: ApplicationContactInfoFormBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f205560a = new g();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22096n f205561b = new C22096n(-297294215, a.f205562l, false);

    /* compiled from: ApplicationContactInfoFormBlock.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<InterfaceC20640y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f205562l = new a();

        public a() {
            super(3);
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
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64469bd, 0, a13);
                String strC = i.c(a13, R.string.contact_info_client_search_content_description);
                p pVar = com.akita.compose.theme.re23.b.f63984b.f63918e0;
                v.a aVar = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                h.a aVar2 = h.f42849c;
                com.akita.compose.foundation.ui.e.a(eVarA, strC, R1.m(interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39079e), 16, 0.0f, 6, 0.0f, 10), pVar, a13, 8, 0);
            }
            return G0.f406611a;
        }
    }
}
