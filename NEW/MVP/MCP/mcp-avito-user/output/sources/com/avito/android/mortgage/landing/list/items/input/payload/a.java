package com.avito.android.mortgage.landing.list.items.input.payload;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayload.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$d;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$e;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$f;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$g;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$h;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$i;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a$j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.input.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5903a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f199781a;

        public C5903a(@l Integer num) {
            this.f199781a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5903a) && L.f(this.f199781a, ((C5903a) obj).f199781a);
        }

        public final int hashCode() {
            Integer num = this.f199781a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ChipSelectedChanged(chipIdx="), this.f199781a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199782a;

        public b(boolean z12) {
            this.f199782a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f199782a == ((b) obj).f199782a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199782a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("EnabledChanged(isEnabled="), this.f199782a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f199783a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -100815024;
        }

        @k
        public final String toString() {
            return "FormatterChanged";
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$d;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f199784a;

        public d(@k String str) {
            this.f199784a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f199784a, ((d) obj).f199784a);
        }

        public final int hashCode() {
            return this.f199784a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputTextChanged(text="), this.f199784a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$e;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LabelValueParameter f199785a;

        public e(@k LabelValueParameter labelValueParameter) {
            this.f199785a = labelValueParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f199785a, ((e) obj).f199785a);
        }

        public final int hashCode() {
            return this.f199785a.hashCode();
        }

        @k
        public final String toString() {
            return "MaxValueChanged(maxValue=" + this.f199785a + ')';
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$f;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LabelValueParameter f199786a;

        public f(@k LabelValueParameter labelValueParameter) {
            this.f199786a = labelValueParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f199786a, ((f) obj).f199786a);
        }

        public final int hashCode() {
            return this.f199786a.hashCode();
        }

        @k
        public final String toString() {
            return "MinValueChanged(minValue=" + this.f199786a + ')';
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$g;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<com.avito.android.lib.design.chips.h> f199787a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(@l List<? extends com.avito.android.lib.design.chips.h> list) {
            this.f199787a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f199787a, ((g) obj).f199787a);
        }

        public final int hashCode() {
            List<com.avito.android.lib.design.chips.h> list = this.f199787a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PredefinedValuesChanged(predefinedValues="), this.f199787a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$h;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        public final double f199788a;

        public h(double d12) {
            this.f199788a = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Double.compare(this.f199788a, ((h) obj).f199788a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f199788a);
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.o(new StringBuilder("SliderMaxValueChanged(maxValue="), this.f199788a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$i;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        public final double f199789a;

        public i(double d12) {
            this.f199789a = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Double.compare(this.f199789a, ((i) obj).f199789a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f199789a);
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.o(new StringBuilder("SliderMinValueChanged(minValue="), this.f199789a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/payload/a$j;", "Lcom/avito/android/mortgage/landing/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        public final double f199790a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f199791b;

        public j(double d12, boolean z12) {
            this.f199790a = d12;
            this.f199791b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Double.compare(this.f199790a, jVar.f199790a) == 0 && this.f199791b == jVar.f199791b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199791b) + (Double.hashCode(this.f199790a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SliderValueChanged(value=");
            sb2.append(this.f199790a);
            sb2.append(", show=");
            return r.x(sb2, this.f199791b, ')');
        }
    }
}
