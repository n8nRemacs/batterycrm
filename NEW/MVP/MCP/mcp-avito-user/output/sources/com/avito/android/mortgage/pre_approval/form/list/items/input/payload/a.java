package com.avito.android.mortgage.pre_approval.form.list.items.input.payload;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputPayload.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$c;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$d;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$e;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$a;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.pre_approval.form.list.items.input.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5985a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f201813a;

        public C5985a(@l Integer num) {
            this.f201813a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5985a) && L.f(this.f201813a, ((C5985a) obj).f201813a);
        }

        public final int hashCode() {
            Integer num = this.f201813a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ChipSelectedChanged(chipIdx="), this.f201813a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f201814a;

        public b(@l PrintableText printableText) {
            this.f201814a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f201814a, ((b) obj).f201814a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f201814a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ErrorChanged(error="), this.f201814a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$c;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f201815a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -300722124;
        }

        @k
        public final String toString() {
            return "FormatterChanged";
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$d;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f201816a;

        public d(@l Double d12) {
            this.f201816a = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f201816a, ((d) obj).f201816a);
        }

        public final int hashCode() {
            Double d12 = this.f201816a;
            if (d12 == null) {
                return 0;
            }
            return d12.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(new StringBuilder("InputPercentChanged(inputPercent="), this.f201816a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$e;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f201817a;

        public e(@k String str) {
            this.f201817a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f201817a, ((e) obj).f201817a);
        }

        public final int hashCode() {
            return this.f201817a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputTextChanged(text="), this.f201817a, ')');
        }
    }

    /* compiled from: InputPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a$f;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f201818a;

        public f(@l Double d12) {
            this.f201818a = d12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f201818a, ((f) obj).f201818a);
        }

        public final int hashCode() {
            Double d12 = this.f201818a;
            if (d12 == null) {
                return 0;
            }
            return d12.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(new StringBuilder("SliderValueChanged(value="), this.f201818a, ')');
        }
    }
}
