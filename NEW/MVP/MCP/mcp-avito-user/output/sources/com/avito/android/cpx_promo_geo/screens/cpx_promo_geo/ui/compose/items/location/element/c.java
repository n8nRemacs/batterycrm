package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoTriggerBanner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f128063a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f128064b = new C22096n(998540856, a.f128065l, false);

    /* compiled from: CpxPromoGeoTriggerBanner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f128065l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                k.a(new C48709c.B("Вы обходите 40% конкурентов", "Этот бюджет даст небольшой рост просмотров", com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element.a.f128061l, b.f128062l), "", a13, 48);
            }
            return G0.f406611a;
        }
    }
}
