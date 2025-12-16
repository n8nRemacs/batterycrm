package com.avito.android.auto_loans_cabinet.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BlankStatus.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/e;", "", "a", "b", "c", "d", "Lcom/avito/android/auto_loans_cabinet/domain/e$a;", "Lcom/avito/android/auto_loans_cabinet/domain/e$b;", "Lcom/avito/android/auto_loans_cabinet/domain/e$c;", "Lcom/avito/android/auto_loans_cabinet/domain/e$d;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<f> f95382a;

    /* compiled from: BlankStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/e$a;", "Lcom/avito/android/auto_loans_cabinet/domain/e;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final long f95383b;

        /* renamed from: c, reason: collision with root package name */
        public final long f95384c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f95385d;

        public a(long j12, long j13, @k ArrayList arrayList) {
            super(arrayList, null);
            this.f95383b = j12;
            this.f95384c = j13;
            this.f95385d = arrayList;
        }

        @Override // com.avito.android.auto_loans_cabinet.domain.e
        @k
        public final List<f> a() {
            return this.f95385d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f95383b == aVar.f95383b && this.f95384c == aVar.f95384c && L.f(this.f95385d, aVar.f95385d);
        }

        public final int hashCode() {
            return this.f95385d.hashCode() + r.g(Long.hashCode(this.f95383b) * 31, 31, this.f95384c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Draft(itemId=");
            sb2.append(this.f95383b);
            sb2.append(", ofpApplicationId=");
            sb2.append(this.f95384c);
            sb2.append(", finishedBlanks=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f95385d, ')');
        }
    }

    /* compiled from: BlankStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/e$b;", "Lcom/avito/android/auto_loans_cabinet/domain/e;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: b, reason: collision with root package name */
        public final long f95386b;

        /* renamed from: c, reason: collision with root package name */
        public final long f95387c;

        /* renamed from: d, reason: collision with root package name */
        public final int f95388d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f95389e;

        public b(long j12, long j13, int i12, @k ArrayList arrayList) {
            super(arrayList, null);
            this.f95386b = j12;
            this.f95387c = j13;
            this.f95388d = i12;
            this.f95389e = arrayList;
        }

        @Override // com.avito.android.auto_loans_cabinet.domain.e
        @k
        public final List<f> a() {
            return this.f95389e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f95386b == bVar.f95386b && this.f95387c == bVar.f95387c && this.f95388d == bVar.f95388d && L.f(this.f95389e, bVar.f95389e);
        }

        public final int hashCode() {
            return this.f95389e.hashCode() + r.e(this.f95388d, r.g(Long.hashCode(this.f95386b) * 31, 31, this.f95387c), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoanApproved(itemId=");
            sb2.append(this.f95386b);
            sb2.append(", ofpApplicationId=");
            sb2.append(this.f95387c);
            sb2.append(", applicationsCount=");
            sb2.append(this.f95388d);
            sb2.append(", finishedBlanks=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f95389e, ')');
        }
    }

    /* compiled from: BlankStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/e$c;", "Lcom/avito/android/auto_loans_cabinet/domain/e;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: b, reason: collision with root package name */
        public final long f95390b;

        /* renamed from: c, reason: collision with root package name */
        public final long f95391c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f95392d;

        public c(long j12, long j13, @k ArrayList arrayList) {
            super(arrayList, null);
            this.f95390b = j12;
            this.f95391c = j13;
            this.f95392d = arrayList;
        }

        @Override // com.avito.android.auto_loans_cabinet.domain.e
        @k
        public final List<f> a() {
            return this.f95392d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f95390b == cVar.f95390b && this.f95391c == cVar.f95391c && L.f(this.f95392d, cVar.f95392d);
        }

        public final int hashCode() {
            return this.f95392d.hashCode() + r.g(Long.hashCode(this.f95390b) * 31, 31, this.f95391c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoanReject(itemId=");
            sb2.append(this.f95390b);
            sb2.append(", ofpApplicationId=");
            sb2.append(this.f95391c);
            sb2.append(", finishedBlanks=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f95392d, ')');
        }
    }

    /* compiled from: BlankStatus.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/e$d;", "Lcom/avito/android/auto_loans_cabinet/domain/e;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f95393b;

        public d(@k ArrayList arrayList) {
            super(arrayList, null);
            this.f95393b = arrayList;
        }

        @Override // com.avito.android.auto_loans_cabinet.domain.e
        @k
        public final List<f> a() {
            return this.f95393b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f95393b, ((d) obj).f95393b);
        }

        public final int hashCode() {
            return this.f95393b.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("NoLoans(finishedBlanks="), this.f95393b, ')');
        }
    }

    public e() {
        throw null;
    }

    public e(List list, C42822w c42822w) {
        this.f95382a = list;
    }

    @k
    public List<f> a() {
        return this.f95382a;
    }
}
