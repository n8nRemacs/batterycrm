package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.avito.android.str_cancellation_settings.models.items.DaysOptionChipable;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FreeCancellationDaysChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_cancellation_settings.composables.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35119t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C35119t f288254a = new C35119t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f288255b = new C22096n(-437675607, a.f288257l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f288256c = new C22096n(-1737764763, b.f288258l, false);

    /* compiled from: FreeCancellationDaysChips.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_cancellation_settings.composables.t$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f288257l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                List listU = C42745f0.U(new DaysOptionChipable(1, "1 День", false, false, 12, null), new DaysOptionChipable(3, "3 Дня", false, false, 12, null), new DaysOptionChipable(5, "5 Дней", false, false, 12, null), new DaysOptionChipable(7, "7 Дней", true, false, 8, null), new DaysOptionChipable(14, "14 Дней", false, false, 12, null));
                C35118s c35118s = C35118s.f288252l;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                N.a("Отмена станет платной, когда до заселения:", listU, c35118s, R1.i(androidx.compose.ui.v.f42878y1, 16), a13, 3510);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FreeCancellationDaysChips.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_cancellation_settings.composables.t$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f288258l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
                C35119t.f288254a.getClass();
                com.akita.compose.foundation.ui.n.a(null, null, 0.0f, pVar, null, C35119t.f288255b, a13, 1572864, 55);
            }
            return G0.f406611a;
        }
    }
}
