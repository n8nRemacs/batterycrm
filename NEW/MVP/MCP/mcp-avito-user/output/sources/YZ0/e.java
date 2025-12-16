package yz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.InterfaceC42150f;
import j.e0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lyz0/e;", "", "a", "b", "c", "Lyz0/e$a;", "Lyz0/e$b;", "Lyz0/e$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f443662a;

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/e$a;", "Lyz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f443663b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f443664c;

        public a(@k d dVar, @k ArrayList arrayList) {
            super(dVar, null);
            this.f443663b = dVar;
            this.f443664c = arrayList;
        }

        @Override // yz0.e
        @k
        /* renamed from: a, reason: from getter */
        public final d getF443662a() {
            return this.f443663b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f443663b, aVar.f443663b) && L.f(this.f443664c, aVar.f443664c);
        }

        public final int hashCode() {
            return this.f443664c.hashCode() + (this.f443663b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(toolbarState=");
            sb2.append(this.f443663b);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f443664c, ')');
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/e$b;", "Lyz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f443665b;

        public b(@k d dVar) {
            super(dVar, null);
            this.f443665b = dVar;
        }

        @Override // yz0.e
        @k
        /* renamed from: a, reason: from getter */
        public final d getF443662a() {
            return this.f443665b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443665b, ((b) obj).f443665b);
        }

        public final int hashCode() {
            return this.f443665b.hashCode();
        }

        @k
        public final String toString() {
            return "Empty(toolbarState=" + this.f443665b + ')';
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyz0/e$c;", "Lyz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f443666b;

        /* renamed from: c, reason: collision with root package name */
        public final int f443667c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443668d;

        /* renamed from: e, reason: collision with root package name */
        public final int f443669e;

        public c(@k d dVar, @InterfaceC42150f int i12, @e0 int i13, @e0 int i14) {
            super(dVar, null);
            this.f443666b = dVar;
            this.f443667c = i12;
            this.f443668d = i13;
            this.f443669e = i14;
        }

        @Override // yz0.e
        @k
        /* renamed from: a, reason: from getter */
        public final d getF443662a() {
            return this.f443666b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443666b, cVar.f443666b) && this.f443667c == cVar.f443667c && this.f443668d == cVar.f443668d && this.f443669e == cVar.f443669e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f443669e) + r.e(this.f443668d, r.e(this.f443667c, this.f443666b.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(toolbarState=");
            sb2.append(this.f443666b);
            sb2.append(", image=");
            sb2.append(this.f443667c);
            sb2.append(", title=");
            sb2.append(this.f443668d);
            sb2.append(", subtitle=");
            return r.t(sb2, this.f443669e, ')');
        }
    }

    public e(d dVar, C42822w c42822w) {
        this.f443662a = dVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public d getF443662a() {
        return this.f443662a;
    }
}
