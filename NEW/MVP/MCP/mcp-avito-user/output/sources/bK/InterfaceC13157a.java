package Bk;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripSelectAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LBk/a;", "", "a", "b", "c", "d", "e", "f", "LBk/a$a;", "LBk/a$b;", "LBk/a$c;", "LBk/a$d;", "LBk/a$e;", "LBk/a$f;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13157a {

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/a$a;", "LBk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0069a implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Long> f1638a;

        public C0069a(@k List<Long> list) {
            this.f1638a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0069a) && L.f(this.f1638a, ((C0069a) obj).f1638a);
        }

        public final int hashCode() {
            return this.f1638a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("AttachBusinessTripButtonClicked(chosenItems="), this.f1638a, ')');
        }
    }

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/a$b;", "LBk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$b */
    public static final /* data */ class b implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1639a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1640b;

        public b(long j12, boolean z12) {
            this.f1639a = j12;
            this.f1640b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1639a == bVar.f1639a && this.f1640b == bVar.f1640b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1640b) + (Long.hashCode(this.f1639a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckedChanged(id=");
            sb2.append(this.f1639a);
            sb2.append(", value=");
            return r.x(sb2, this.f1640b, ')');
        }
    }

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/a$c;", "LBk/a;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$c */
    public static final /* data */ class c implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1641a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1487531352;
        }

        @k
        public final String toString() {
            return "ExitButtonClicked";
        }
    }

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/a$d;", "LBk/a;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$d */
    public static final /* data */ class d implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f1642a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -723689184;
        }

        @k
        public final String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/a$e;", "LBk/a;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$e */
    public static final /* data */ class e implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f1643a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -368403520;
        }

        @k
        public final String toString() {
            return "SuccessScreenImageLoaded";
        }
    }

    /* compiled from: B2bBusinessTripSelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/a$f;", "LBk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.a$f */
    public static final /* data */ class f implements InterfaceC13157a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1644a;

        public f(@k String str) {
            this.f1644a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f1644a, ((f) obj).f1644a);
        }

        public final int hashCode() {
            return this.f1644a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UrlClick(url="), this.f1644a, ')');
        }
    }
}
