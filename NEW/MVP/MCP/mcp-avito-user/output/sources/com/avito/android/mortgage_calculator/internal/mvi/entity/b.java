package com.avito.android.mortgage_calculator.internal.mvi.entity;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.mortgage_calculator.model.MortgageCalculatorConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculatorAction.kt */
@P
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u001b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u001b !\"#$%&'()*+,-./0123456789:¨\u0006;"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "LD10/b;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$c;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$e;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$f;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$g;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$h;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$k;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$l;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$m;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$n;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$o;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$p;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$q;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$s;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$t;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$u;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$v;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$w;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$x;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$y;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$z;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$A;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b implements a, D10.b {

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$A;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204567b;

        public A(@Y61.k String str) {
            super(null);
            this.f204567b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f204567b, ((A) obj).f204567b);
        }

        public final int hashCode() {
            return this.f204567b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePropertyCost(value="), this.f204567b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.entity.b$a, reason: case insensitive filesystem */
    public static final /* data */ class C32744a extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MortgageCalculatorConfig f204568b;

        public C32744a(@Y61.k MortgageCalculatorConfig mortgageCalculatorConfig) {
            super(null);
            this.f204568b = mortgageCalculatorConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32744a) && L.f(this.f204568b, ((C32744a) obj).f204568b);
        }

        public final int hashCode() {
            return this.f204568b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ApplyConfig(config=" + this.f204568b + ')';
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C6098b extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C6098b f204569b = new C6098b();

        public C6098b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C6098b);
        }

        public final int hashCode() {
            return -1305774279;
        }

        @Y61.k
        public final String toString() {
            return "CalculatorShown";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$c;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f204570b = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1091468962;
        }

        @Y61.k
        public final String toString() {
            return "CloseOfferDescription";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$c;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d extends b implements D10.c {

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f204571b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1374975120;
            }

            @Y61.k
            public final String toString() {
                return "DownPayment";
            }
        }

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.entity.b$d$b, reason: collision with other inner class name */
        public static final /* data */ class C6099b extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6099b f204572b = new C6099b();

            public C6099b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6099b);
            }

            public final int hashCode() {
                return -528995764;
            }

            @Y61.k
            public final String toString() {
                return "LandCost";
            }
        }

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$c;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f204573b = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1728668627;
            }

            @Y61.k
            public final String toString() {
                return "MonthlyPayment";
            }
        }

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d$d;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$d;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.entity.b$d$d, reason: collision with other inner class name */
        public static final /* data */ class C6100d extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6100d f204574b = new C6100d();

            public C6100d() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6100d);
            }

            public final int hashCode() {
                return -1901242570;
            }

            @Y61.k
            public final String toString() {
                return "PropertyCost";
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
            super(null);
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$e;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204575b;

        public e(@Y61.k String str) {
            super(null);
            this.f204575b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f204575b, ((e) obj).f204575b);
        }

        public final int hashCode() {
            return this.f204575b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleOfferActionClicked(offerType="), this.f204575b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$f;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204576b;

        public f(@Y61.k String str) {
            super(null);
            this.f204576b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f204576b, ((f) obj).f204576b);
        }

        public final int hashCode() {
            return this.f204576b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleOfferDescriptionActionClicked(offerType="), this.f204576b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$g;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* renamed from: b, reason: collision with root package name */
        public final int f204577b;

        public g(int i12) {
            super(null);
            this.f204577b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f204577b == ((g) obj).f204577b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f204577b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("HandleOfferDescriptionTabClicked(tabIdx="), this.f204577b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$h;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final h f204578b = new h();

        public h() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1628348818;
        }

        @Y61.k
        public final String toString() {
            return "HandlePrimaryButtonClick";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final i f204579b = new i();

        public i() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 623713120;
        }

        @Y61.k
        public final String toString() {
            return "HandleSecondaryButtonClick";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$j;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final j f204580b = new j();

        public j() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2008139428;
        }

        @Y61.k
        public final String toString() {
            return "HandleTeaserAction";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$k;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204581b;

        public k(@Y61.k String str) {
            super(null);
            this.f204581b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f204581b, ((k) obj).f204581b);
        }

        public final int hashCode() {
            return this.f204581b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OfferVisible(type="), this.f204581b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$l;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final l f204582b = new l();

        public l() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 460397977;
        }

        @Y61.k
        public final String toString() {
            return "OffersScrolled";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$m;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final m f204583b = new m();

        public m() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -500482501;
        }

        @Y61.k
        public final String toString() {
            return "OpenDisclaimer";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$n;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204584b;

        public n(@Y61.k String str) {
            super(null);
            this.f204584b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f204584b, ((n) obj).f204584b);
        }

        public final int hashCode() {
            return this.f204584b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenOfferDescription(offerType="), this.f204584b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$o;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final o f204585b = new o();

        public o() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1948399113;
        }

        @Y61.k
        public final String toString() {
            return "PrimaryButtonInViewPort";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$p;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final p f204586b = new p();

        public p() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -318105402;
        }

        @Y61.k
        public final String toString() {
            return "ReloadOffers";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$q;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC27333b f204587b;

        public q(@Y61.k InterfaceC27333b interfaceC27333b) {
            super(null);
            this.f204587b = interfaceC27333b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f204587b, ((q) obj).f204587b);
        }

        public final int hashCode() {
            return this.f204587b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectTab(tab=" + this.f204587b + ')';
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "a", "b", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class r extends b {

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r$a;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends r {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f204588b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1932690991;
            }

            @Y61.k
            public final String toString() {
                return "DownPayment";
            }
        }

        /* compiled from: CalculatorAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r$b;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$r;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.entity.b$r$b, reason: collision with other inner class name */
        public static final /* data */ class C6101b extends r {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6101b f204589b = new C6101b();

            public C6101b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6101b);
            }

            public final int hashCode() {
                return 251343406;
            }

            @Y61.k
            public final String toString() {
                return "MonthlyPayment";
            }
        }

        public /* synthetic */ r(C42822w c42822w) {
            this();
        }

        public r() {
            super(null);
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$s;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "<init>", "()V", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s extends b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final s f204590b = new s();

        public s() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1947615884;
        }

        @Y61.k
        public final String toString() {
            return "TeaserVisible";
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$t;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f204591b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f204592c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f204593d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f204594e;

        public t() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f204591b, tVar.f204591b) && L.f(this.f204592c, tVar.f204592c) && L.f(this.f204593d, tVar.f204593d) && L.f(this.f204594e, tVar.f204594e);
        }

        public final int hashCode() {
            String str = this.f204591b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f204592c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f204593d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f204594e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateAnalyticsParams(utmSource=");
            sb2.append(this.f204591b);
            sb2.append(", utmTerm=");
            sb2.append(this.f204592c);
            sb2.append(", utmCampaign=");
            sb2.append(this.f204593d);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f204594e, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public t(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            C42822w c42822w2 = null;
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            str3 = (i12 & 4) != 0 ? null : str3;
            str4 = (i12 & 8) != 0 ? null : str4;
            super(c42822w2);
            this.f204591b = str;
            this.f204592c = str2;
            this.f204593d = str3;
            this.f204594e = str4;
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$u;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC27333b f204595b;

        public u(@Y61.k InterfaceC27333b interfaceC27333b) {
            super(null);
            this.f204595b = interfaceC27333b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f204595b, ((u) obj).f204595b);
        }

        public final int hashCode() {
            return this.f204595b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCreditTerm(value=" + this.f204595b + ')';
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$v;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204596b;

        public v(@Y61.k String str) {
            super(null);
            this.f204596b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f204596b, ((v) obj).f204596b);
        }

        public final int hashCode() {
            return this.f204596b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateDownPayment(value="), this.f204596b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$w;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        public final float f204597b;

        public w(float f12) {
            super(null);
            this.f204597b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && Float.compare(this.f204597b, ((w) obj).f204597b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f204597b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f204597b, new StringBuilder("UpdateDownPaymentBySlider(value="));
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$x;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204598b;

        public x(@Y61.k String str) {
            super(null);
            this.f204598b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && L.f(this.f204598b, ((x) obj).f204598b);
        }

        public final int hashCode() {
            return this.f204598b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateLandCost(value="), this.f204598b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$y;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f204599b;

        public y(@Y61.k String str) {
            super(null);
            this.f204599b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f204599b, ((y) obj).f204599b);
        }

        public final int hashCode() {
            return this.f204599b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateMonthlyPayment(value="), this.f204599b, ')');
        }
    }

    /* compiled from: CalculatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b$z;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/b;", "LD10/c;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z extends b implements D10.c {

        /* renamed from: b, reason: collision with root package name */
        public final float f204600b;

        public z(float f12) {
            super(null);
            this.f204600b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && Float.compare(this.f204600b, ((z) obj).f204600b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f204600b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f204600b, new StringBuilder("UpdateMonthlyPaymentBySlider(value="));
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
