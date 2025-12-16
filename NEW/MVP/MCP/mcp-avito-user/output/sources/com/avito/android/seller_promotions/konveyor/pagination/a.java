package com.avito.android.seller_promotions.konveyor.pagination;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.seller_promotions.konveyor.g;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaginationItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/a;", "Lcom/avito/android/seller_promotions/konveyor/c;", "a", "b", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.android.seller_promotions.konveyor.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C8009a f267806e = new C8009a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f267807f = new a(null, null, b.C8011b.f267813a, 3, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f267809c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f267810d;

    /* compiled from: PaginationItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/a$a;", "", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_promotions.konveyor.pagination.a$a, reason: collision with other inner class name */
    public static final class C8009a {
        public /* synthetic */ C8009a(C42822w c42822w) {
            this();
        }

        public C8009a() {
        }
    }

    /* compiled from: PaginationItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/a$b;", "", "a", "b", "Lcom/avito/android/seller_promotions/konveyor/pagination/a$b$a;", "Lcom/avito/android/seller_promotions/konveyor/pagination/a$b$b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PaginationItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/a$b$a;", "Lcom/avito/android/seller_promotions/konveyor/pagination/a$b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_promotions.konveyor.pagination.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C8010a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f267811a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f267812b;

            public C8010a(@k PrintableText printableText, @k PrintableText printableText2) {
                this.f267811a = printableText;
                this.f267812b = printableText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8010a)) {
                    return false;
                }
                C8010a c8010a = (C8010a) obj;
                return L.f(this.f267811a, c8010a.f267811a) && L.f(this.f267812b, c8010a.f267812b);
            }

            public final int hashCode() {
                return this.f267812b.hashCode() + (this.f267811a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(message=");
                sb2.append(this.f267811a);
                sb2.append(", retryButtonTitle=");
                return AK.c.m(sb2, this.f267812b, ')');
            }
        }

        /* compiled from: PaginationItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/a$b$b;", "Lcom/avito/android/seller_promotions/konveyor/pagination/a$b;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_promotions.konveyor.pagination.a$b$b, reason: collision with other inner class name */
        public static final class C8011b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8011b f267813a = new C8011b();
        }
    }

    public a(String str, g gVar, b bVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "load-more-spinner" : str;
        gVar = (i12 & 2) != 0 ? g.a.f267804a : gVar;
        this.f267808b = str;
        this.f267809c = gVar;
        this.f267810d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f267808b, aVar.f267808b) && L.f(this.f267809c, aVar.f267809c) && L.f(this.f267810d, aVar.f267810d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154848b() {
        return this.f267808b;
    }

    public final int hashCode() {
        return this.f267810d.hashCode() + ((this.f267809c.hashCode() + (this.f267808b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.seller_promotions.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final g getF267809c() {
        return this.f267809c;
    }

    @k
    public final String toString() {
        return "PaginationItem(stringId=" + this.f267808b + ", spanType=" + this.f267809c + ", state=" + this.f267810d + ')';
    }
}
