package com.avito.android.mortgage_invite.participant;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParticipantScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.participant.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32831a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32831a f206058a = new C32831a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f206059b = new C22096n(1400871451, C6139a.f206061l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f206060c = new C22096n(1947611159, b.f206062l, false);

    /* compiled from: ParticipantScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.participant.a$a, reason: collision with other inner class name */
    public static final class C6139a extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6139a f206061l = new C6139a();

        public C6139a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                C20806p1.a(u0.e.a(R.drawable.error_image, 0, a13), null, C20588k2.f(C20588k2.t(androidx.compose.ui.v.f42878y1, 196), 230), null, null, 0.0f, null, a13, 440, 120);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ParticipantScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.participant.a$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f206062l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
            InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
            androidx.compose.runtime.A a13 = a12;
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
                String strC = u0.i.c(a13, R.string.mortgage_client_search_content_description);
                com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63918e0;
                v.a aVar = androidx.compose.ui.v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.e.a(eVarA, strC, R1.m(interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39079e), 16, 0.0f, 6, 0.0f, 10), pVar, a13, 8, 0);
            }
            return G0.f406611a;
        }
    }
}
