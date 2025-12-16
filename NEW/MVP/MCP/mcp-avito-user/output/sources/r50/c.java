package r50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Lce.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lr50/c;", "Data", "", "<init>", "()V", "a", "b", "c", "d", "Lr50/c$b;", "Lr50/c$c;", "Lr50/c$d;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class c<Data> {

    /* compiled from: Lce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr50/c$a;", "", "<init>", "()V", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Lce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lr50/c$b;", "Data", "Lr50/c;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<Data> extends c<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final r50.d f429599a;

        public b(r50.d dVar) {
            super(null);
            this.f429599a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f429599a, ((b) obj).f429599a);
        }

        public final int hashCode() {
            r50.d dVar = this.f429599a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f429599a + ')';
        }
    }

    /* compiled from: Lce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lr50/c$c;", "Data", "Lr50/c;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r50.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12355c<Data> extends c<Data> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429600a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f429601b;

        public C12355c(@k String str, boolean z12) {
            super(null);
            this.f429600a = str;
            this.f429601b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12355c)) {
                return false;
            }
            C12355c c12355c = (C12355c) obj;
            return L.f(this.f429600a, c12355c.f429600a) && this.f429601b == c12355c.f429601b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f429601b) + (this.f429600a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(msg=");
            sb2.append(this.f429600a);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f429601b, ')');
        }
    }

    /* compiled from: Lce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr50/c$d;", "Data", "Lr50/c;", "<init>", "()V", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d<Data> extends c<Data> {
        public d() {
            super(null);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
