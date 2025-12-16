package com.avito.android.short_term_rent.bookingform.domain.validation;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputConstraint.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$c;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$d;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: InputConstraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.domain.validation.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8384a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f281427a;

        /* renamed from: b, reason: collision with root package name */
        public final long f281428b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f281429c;

        public C8384a(long j12, long j13, @k String str) {
            this.f281427a = j12;
            this.f281428b = j13;
            this.f281429c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8384a)) {
                return false;
            }
            C8384a c8384a = (C8384a) obj;
            return this.f281427a == c8384a.f281427a && this.f281428b == c8384a.f281428b && L.f(this.f281429c, c8384a.f281429c);
        }

        @Override // com.avito.android.short_term_rent.bookingform.domain.validation.a
        @k
        /* renamed from: getMessage, reason: from getter */
        public final String getF281436a() {
            return this.f281429c;
        }

        public final int hashCode() {
            return this.f281429c.hashCode() + r.g(Long.hashCode(this.f281427a) * 31, 31, this.f281428b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Length(min=");
            sb2.append(this.f281427a);
            sb2.append(", max=");
            sb2.append(this.f281428b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f281429c, ')');
        }
    }

    /* compiled from: InputConstraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f281430a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281431b;

        public b(long j12, @k String str) {
            this.f281430a = j12;
            this.f281431b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f281430a == bVar.f281430a && L.f(this.f281431b, bVar.f281431b);
        }

        @Override // com.avito.android.short_term_rent.bookingform.domain.validation.a
        @k
        /* renamed from: getMessage, reason: from getter */
        public final String getF281436a() {
            return this.f281431b;
        }

        public final int hashCode() {
            return this.f281431b.hashCode() + (Long.hashCode(this.f281430a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaxLength(value=");
            sb2.append(this.f281430a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f281431b, ')');
        }
    }

    /* compiled from: InputConstraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$c;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f281432a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281433b;

        public c(long j12, @k String str) {
            this.f281432a = j12;
            this.f281433b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f281432a == cVar.f281432a && L.f(this.f281433b, cVar.f281433b);
        }

        @Override // com.avito.android.short_term_rent.bookingform.domain.validation.a
        @k
        /* renamed from: getMessage, reason: from getter */
        public final String getF281436a() {
            return this.f281433b;
        }

        public final int hashCode() {
            return this.f281433b.hashCode() + (Long.hashCode(this.f281432a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MinLength(value=");
            sb2.append(this.f281432a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f281433b, ')');
        }
    }

    /* compiled from: InputConstraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$d;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f281434a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281435b;

        public d(@k String str, @k String str2) {
            this.f281434a = str;
            this.f281435b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f281434a, dVar.f281434a) && L.f(this.f281435b, dVar.f281435b);
        }

        @Override // com.avito.android.short_term_rent.bookingform.domain.validation.a
        @k
        /* renamed from: getMessage, reason: from getter */
        public final String getF281436a() {
            return this.f281435b;
        }

        public final int hashCode() {
            return this.f281435b.hashCode() + (this.f281434a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Regex(regexp=");
            sb2.append(this.f281434a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f281435b, ')');
        }
    }

    /* compiled from: InputConstraint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/a$e;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f281436a;

        public e(@k String str) {
            this.f281436a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f281436a, ((e) obj).f281436a);
        }

        @Override // com.avito.android.short_term_rent.bookingform.domain.validation.a
        @k
        /* renamed from: getMessage, reason: from getter */
        public final String getF281436a() {
            return this.f281436a;
        }

        public final int hashCode() {
            return this.f281436a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Required(message="), this.f281436a, ')');
        }
    }

    @k
    /* renamed from: getMessage */
    String getF281436a();
}
