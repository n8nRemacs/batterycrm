package Fz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import j.InterfaceC42150f;
import j.e0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersRangeState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LFz0/c;", "", "<init>", "()V", "a", "b", "c", "d", "LFz0/c$a;", "LFz0/c$b;", "LFz0/c$c;", "LFz0/c$d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c {

    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/c$a;", "LFz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6115a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f6116b;

        public a(@k String str, @k ArrayList arrayList) {
            super(null);
            this.f6115a = str;
            this.f6116b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f6115a, aVar.f6115a) && L.f(this.f6116b, aVar.f6116b);
        }

        public final int hashCode() {
            return this.f6116b.hashCode() + (this.f6115a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f6115a);
            sb2.append(", items=");
            return e.p(sb2, this.f6116b, ')');
        }
    }

    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/c$b;", "LFz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6117a;

        public b(@k String str) {
            super(null);
            this.f6117a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6117a, ((b) obj).f6117a);
        }

        public final int hashCode() {
            return this.f6117a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Empty(title="), this.f6117a, ')');
        }
    }

    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/c$c;", "LFz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0320c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6118a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6119b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f6120c;

        /* renamed from: d, reason: collision with root package name */
        public final int f6121d;

        public C0320c(@InterfaceC42150f int i12, @e0 int i13, @l String str, @e0 int i14) {
            super(null);
            this.f6118a = i12;
            this.f6119b = i13;
            this.f6120c = str;
            this.f6121d = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0320c)) {
                return false;
            }
            C0320c c0320c = (C0320c) obj;
            return this.f6118a == c0320c.f6118a && this.f6119b == c0320c.f6119b && L.f(this.f6120c, c0320c.f6120c) && this.f6121d == c0320c.f6121d;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f6119b, Integer.hashCode(this.f6118a) * 31, 31);
            String str = this.f6120c;
            return Integer.hashCode(this.f6121d) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(image=");
            sb2.append(this.f6118a);
            sb2.append(", titleRes=");
            sb2.append(this.f6119b);
            sb2.append(", titleText=");
            sb2.append(this.f6120c);
            sb2.append(", subtitle=");
            return r.t(sb2, this.f6121d, ')');
        }
    }

    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/c$d;", "LFz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f6122a;

        public d(@k ArrayList arrayList) {
            super(null);
            this.f6122a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6122a, ((d) obj).f6122a);
        }

        public final int hashCode() {
            return this.f6122a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Loading(stubItems="), this.f6122a, ')');
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
