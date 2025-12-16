package com.avito.android.cart_similar_items.konveyor.pagination;

import Y61.k;
import Y61.l;
import com.avito.android.cart_similar_items.konveyor.g;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaginationItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/a;", "Lcom/avito/android/cart_similar_items/konveyor/c;", "a", "b", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.android.cart_similar_items.konveyor.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C3378a f115845e = new C3378a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f115846f = new a(null, null, b.C3380b.f115852a, 3, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f115847b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f115848c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f115849d;

    /* compiled from: PaginationItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/a$a;", "", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_similar_items.konveyor.pagination.a$a, reason: collision with other inner class name */
    public static final class C3378a {
        public /* synthetic */ C3378a(C42822w c42822w) {
            this();
        }

        public C3378a() {
        }
    }

    /* compiled from: PaginationItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b;", "", "a", "b", "Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b$a;", "Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b$b;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PaginationItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b$a;", "Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_similar_items.konveyor.pagination.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C3379a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f115850a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f115851b;

            public C3379a(@k PrintableText printableText, @k PrintableText printableText2) {
                this.f115850a = printableText;
                this.f115851b = printableText2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3379a)) {
                    return false;
                }
                C3379a c3379a = (C3379a) obj;
                return L.f(this.f115850a, c3379a.f115850a) && L.f(this.f115851b, c3379a.f115851b);
            }

            public final int hashCode() {
                return this.f115851b.hashCode() + (this.f115850a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(message=");
                sb2.append(this.f115850a);
                sb2.append(", retryButtonTitle=");
                return AK.c.m(sb2, this.f115851b, ')');
            }
        }

        /* compiled from: PaginationItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b$b;", "Lcom/avito/android/cart_similar_items/konveyor/pagination/a$b;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cart_similar_items.konveyor.pagination.a$b$b, reason: collision with other inner class name */
        public static final class C3380b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C3380b f115852a = new C3380b();
        }
    }

    public a(String str, g gVar, b bVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "load-more-spinner" : str;
        gVar = (i12 & 2) != 0 ? g.a.f115843a : gVar;
        this.f115847b = str;
        this.f115848c = gVar;
        this.f115849d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f115847b, aVar.f115847b) && L.f(this.f115848c, aVar.f115848c) && L.f(this.f115849d, aVar.f115849d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF101819b() {
        return this.f115847b;
    }

    public final int hashCode() {
        return this.f115849d.hashCode() + ((this.f115848c.hashCode() + (this.f115847b.hashCode() * 31)) * 31);
    }

    @Override // com.avito.android.cart_similar_items.konveyor.c
    @k
    /* renamed from: q, reason: from getter */
    public final g getF115848c() {
        return this.f115848c;
    }

    @k
    public final String toString() {
        return "PaginationItem(stringId=" + this.f115847b + ", spanType=" + this.f115848c + ", state=" + this.f115849d + ')';
    }
}
