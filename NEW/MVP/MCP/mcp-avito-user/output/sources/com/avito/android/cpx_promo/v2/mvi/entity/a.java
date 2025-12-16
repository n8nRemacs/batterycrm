package com.avito.android.cpx_promo.v2.mvi.entity;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: CpxPromoV2Action.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$a;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$b;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$c;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$d;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$e;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$f;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$g;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$h;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$i;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$k;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$l;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a$m;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$a;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo.v2.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3795a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3795a f127689a = new C3795a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C3795a);
        }

        public final int hashCode() {
            return -788654030;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$b;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CpxPromoV2State.a f127690a;

        public b(@Y61.k CpxPromoV2State.a aVar) {
            this.f127690a = aVar;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$c;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CpxPromoV2State.ButtonState.ButtonType f127691a;

        public c(@Y61.k CpxPromoV2State.ButtonState.ButtonType buttonType) {
            this.f127691a = buttonType;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$d;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f127692a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1822409939;
        }

        @Y61.k
        public final String toString() {
            return "CashbackBannerClick";
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$e;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f127693a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -826427880;
        }

        @Y61.k
        public final String toString() {
            return "HelpClick";
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$f;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CpxPromoInputSource f127694a;

        public f(@Y61.k CpxPromoInputSource cpxPromoInputSource) {
            this.f127694a = cpxPromoInputSource;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$g;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements a {
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$h;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f127695a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -962536472;
        }

        @Y61.k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$i;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127696a;

        public i(boolean z12) {
            this.f127696a = z12;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$j;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f127697a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -2100495090;
        }

        @Y61.k
        public final String toString() {
            return "SliderInfoCloseClick";
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$k;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127698a;

        public k(boolean z12) {
            this.f127698a = z12;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$l;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements a {

        /* renamed from: a, reason: collision with root package name */
        public final float f127699a;

        public l(float f12) {
            this.f127699a = f12;
        }
    }

    /* compiled from: CpxPromoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a$m;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f127700a;

        public m(@Y61.k DeepLink deepLink) {
            this.f127700a = deepLink;
        }
    }
}
