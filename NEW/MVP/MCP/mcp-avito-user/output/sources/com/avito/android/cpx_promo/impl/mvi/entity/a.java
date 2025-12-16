package com.avito.android.cpx_promo.impl.mvi.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CpxPromoAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$a;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$b;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$c;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$d;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$e;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$f;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$g;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$h;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$i;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$k;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$l;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a$m;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$a;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo.impl.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3785a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3785a f127157a = new C3785a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C3785a);
        }

        public final int hashCode() {
            return -1683704070;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$b;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CpxPromoState.BudgetChip f127158a;

        public b(@Y61.k CpxPromoState.BudgetChip budgetChip) {
            this.f127158a = budgetChip;
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$c;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f127159a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1721477920;
        }

        @Y61.k
        public final String toString() {
            return "HelpClick";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$d;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CpxPromoInputSource f127160a;

        public d(@Y61.k CpxPromoInputSource cpxPromoInputSource) {
            this.f127160a = cpxPromoInputSource;
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$e;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$f;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f127161a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -278372325;
        }

        @Y61.k
        public final String toString() {
            return "PrimaryButtonClick";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$g;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f127162a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1724648928;
        }

        @Y61.k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$h;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f127163a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -2079237207;
        }

        @Y61.k
        public final String toString() {
            return "SecondaryButtonClick";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$i;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127164a;

        public i(boolean z12) {
            this.f127164a = z12;
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$j;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f127165a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1530974534;
        }

        @Y61.k
        public final String toString() {
            return "SliderInfoCloseClick";
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$k;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127166a;

        public k(boolean z12) {
            this.f127166a = z12;
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$l;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements a {

        /* renamed from: a, reason: collision with root package name */
        public final float f127167a;

        public l(float f12) {
            this.f127167a = f12;
        }
    }

    /* compiled from: CpxPromoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a$m;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f127168a;

        public m(@Y61.k DeepLink deepLink) {
            this.f127168a = deepLink;
        }
    }
}
