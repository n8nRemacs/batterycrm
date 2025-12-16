package com.avito.android.cpx_promo.v2.compose;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoV2CashbackBanner.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/v2/compose/a;", "", "a", "b", "Lcom/avito/android/cpx_promo/v2/compose/a$a;", "Lcom/avito/android/cpx_promo/v2/compose/a$b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f127398a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T1 f127399b;

    /* renamed from: c, reason: collision with root package name */
    public final float f127400c;

    /* renamed from: d, reason: collision with root package name */
    public final float f127401d;

    /* compiled from: CpxPromoV2CashbackBanner.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/compose/a$a;", "Lcom/avito/android/cpx_promo/v2/compose/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo.v2.compose.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3789a extends a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f127402e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3789a(@k String str) {
            super(str, R1.b(10, 6), 22, 4, null);
            h.a aVar = h.f42849c;
            this.f127402e = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3789a) && L.f(this.f127402e, ((C3789a) obj).f127402e);
        }

        public final int hashCode() {
            return this.f127402e.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Input(bannerTitle="), this.f127402e, ')');
        }
    }

    /* compiled from: CpxPromoV2CashbackBanner.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/compose/a$b;", "Lcom/avito/android/cpx_promo/v2/compose/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f127403e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f127404f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final DeepLink f127405g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k String str, @k String str2, @k DeepLink deepLink) {
            super(str, R1.a(14), 48, 12, null);
            h.a aVar = h.f42849c;
            this.f127403e = str;
            this.f127404f = str2;
            this.f127405g = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f127403e, bVar.f127403e) && L.f(this.f127404f, bVar.f127404f) && L.f(this.f127405g, bVar.f127405g);
        }

        public final int hashCode() {
            return this.f127405g.hashCode() + H.d(this.f127403e.hashCode() * 31, 31, this.f127404f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Main(bannerTitle=");
            sb2.append(this.f127403e);
            sb2.append(", bannerDescription=");
            sb2.append(this.f127404f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f127405g, ')');
        }
    }

    public a(String str, T1 t12, float f12, float f13, C42822w c42822w) {
        this.f127398a = str;
        this.f127399b = t12;
        this.f127400c = f12;
        this.f127401d = f13;
    }
}
