package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoFlatsTwoColumnDialogLoadingScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f68748a = new y();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f68749b = new C22096n(-438935092, a.f68750l, false);

    /* compiled from: AutoFlatsTwoColumnDialogLoadingScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<InterfaceC20793y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f68750l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                float f12 = 6;
                C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(androidx.compose.ui.v.f42878y1, 200, 14), androidx.compose.foundation.shape.o.a(f12), null, false, a13, 6, 6), a13, 0);
                com.akita.compose.foundation.ui.g.a(17, null, a13, 6);
                a13.C(2125316621);
                for (int i12 = 0; i12 < 7; i12++) {
                    com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
                    C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 10), androidx.compose.foundation.shape.o.a(f12), null, false, a13, 6, 6), a13, 0);
                    com.akita.compose.foundation.ui.g.a(12, null, a13, 6);
                }
                a13.h();
                com.akita.compose.foundation.ui.g.a(31, null, a13, 6);
            }
            return G0.f406611a;
        }
    }
}
