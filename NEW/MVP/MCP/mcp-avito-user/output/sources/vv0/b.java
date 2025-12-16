package Vv0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShiftListInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LVv0/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "LVv0/b$a;", "LVv0/b$b;", "LVv0/b$c;", "LVv0/b$d;", "LVv0/b$e;", "LVv0/b$f;", "LVv0/b$g;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b {

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/b$a;", "LVv0/b;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17482a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -913563327;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv0/b$b;", "LVv0/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1213b extends b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f17483a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f17484b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f17485c;

        public C1213b(@l String str, @k ArrayList arrayList, boolean z12) {
            super(null);
            this.f17483a = str;
            this.f17484b = arrayList;
            this.f17485c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1213b)) {
                return false;
            }
            C1213b c1213b = (C1213b) obj;
            return L.f(this.f17483a, c1213b.f17483a) && L.f(this.f17484b, c1213b.f17484b) && this.f17485c == c1213b.f17485c;
        }

        public final int hashCode() {
            String str = this.f17483a;
            return Boolean.hashCode(this.f17485c) + androidx.compose.ui.graphics.colorspace.e.g(this.f17484b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f17483a);
            sb2.append(", content=");
            sb2.append(this.f17484b);
            sb2.append(", canLoadMore=");
            return r.x(sb2, this.f17485c, ')');
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/b$c;", "LVv0/b;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f17486a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -911534767;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/b$d;", "LVv0/b;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f17487a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1563810742;
        }

        @k
        public final String toString() {
            return "LoadMoreError";
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv0/b$e;", "LVv0/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f17488a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17489b;

        public e(@k ArrayList arrayList, boolean z12) {
            super(null);
            this.f17488a = arrayList;
            this.f17489b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f17488a, eVar.f17488a) && this.f17489b == eVar.f17489b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17489b) + (this.f17488a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoreLoaded(content=");
            sb2.append(this.f17488a);
            sb2.append(", canLoadMore=");
            return r.x(sb2, this.f17489b, ')');
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/b$f;", "LVv0/b;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f17490a = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -950301935;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: ShiftListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVv0/b$g;", "LVv0/b;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f17491a = new g();

        public g() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1236421126;
        }

        @k
        public final String toString() {
            return "StartLoadingMore";
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
