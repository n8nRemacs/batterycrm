package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LotsListLoaded.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f251427a = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f251428b = new C22096n(-1984726580, a.f251430l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f251429c = new C22096n(-2013744507, C7541b.f251431l, false);

    /* compiled from: LotsListLoaded.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f251430l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.spinner.h f66694c = com.akita.compose.theme.re23.b.r(a13).getF66694c();
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.spinner.b.a(f66694c, C20588k2.x(R1.k(0.0f, 12, 1, aVar), null, 3), a13, 48, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LotsListLoaded.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.checkerboard.ui.lots_list.b$b, reason: collision with other inner class name */
    public static final class C7541b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7541b f251431l = new C7541b();

        public C7541b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < 20; i12++) {
                    arrayList.add(Yh0.e.f19623a);
                }
                y.a(arrayList, false, null, false, null, null, a13, 8, 62);
            }
            return G0.f406611a;
        }
    }
}
