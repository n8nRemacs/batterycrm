package dq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Ldq0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Ldq0/c$a;", "Ldq0/c$b;", "Ldq0/c$c;", "Ldq0/c$d;", "Ldq0/c$e;", "Ldq0/c$f;", "Ldq0/c$g;", "Ldq0/c$h;", "Ldq0/c$i;", "Ldq0/c$j;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39781c {

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/c$a;", "Ldq0/c;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$a */
    public static final /* data */ class a implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394119a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -977955131;
        }

        @k
        public final String toString() {
            return "ClearSelection";
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$b;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$b */
    public static final /* data */ class b implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394120a;

        public b(@k String str) {
            this.f394120a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f394120a, ((b) obj).f394120a);
        }

        public final int hashCode() {
            return this.f394120a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FilterByQuery(query="), this.f394120a, ')');
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$c;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11039c implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.select.bottom_sheet.blueprints.group.a f394121a;

        public C11039c(@k com.avito.android.select.bottom_sheet.blueprints.group.a aVar) {
            this.f394121a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11039c) && L.f(this.f394121a, ((C11039c) obj).f394121a);
        }

        public final int hashCode() {
            return this.f394121a.hashCode();
        }

        @k
        public final String toString() {
            return "GroupExpanded(item=" + this.f394121a + ')';
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$d;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$d */
    public static final /* data */ class d implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.select.bottom_sheet.blueprints.group.a f394122a;

        public d(@k com.avito.android.select.bottom_sheet.blueprints.group.a aVar) {
            this.f394122a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f394122a, ((d) obj).f394122a);
        }

        public final int hashCode() {
            return this.f394122a.hashCode();
        }

        @k
        public final String toString() {
            return "GroupItemClicked(item=" + this.f394122a + ')';
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$e;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$e */
    public static final /* data */ class e implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394123a;

        public e(@k String str) {
            this.f394123a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f394123a, ((e) obj).f394123a);
        }

        public final int hashCode() {
            return this.f394123a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QueryChanged(query="), this.f394123a, ')');
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$f;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$f */
    public static final /* data */ class f implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParcelableEntity<String> f394124a;

        public f(@k ParcelableEntity<String> parcelableEntity) {
            this.f394124a = parcelableEntity;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f394124a, ((f) obj).f394124a);
        }

        public final int hashCode() {
            return this.f394124a.hashCode();
        }

        @k
        public final String toString() {
            return "RemoveChip(item=" + this.f394124a + ')';
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$g;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$g */
    public static final /* data */ class g implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f394125a;

        public g(boolean z12) {
            this.f394125a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f394125a == ((g) obj).f394125a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f394125a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RequestNextPage(isRetry="), this.f394125a, ')');
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/c$h;", "Ldq0/c;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$h */
    public static final /* data */ class h implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f394126a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1395009669;
        }

        @k
        public final String toString() {
            return "RetryRequestQuery";
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq0/c$i;", "Ldq0/c;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$i */
    public static final /* data */ class i implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f394127a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 404254505;
        }

        @k
        public final String toString() {
            return "SubmitClicked";
        }
    }

    /* compiled from: SelectAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/c$j;", "Ldq0/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq0.c$j */
    public static final /* data */ class j implements InterfaceC39781c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.select.variant.a f394128a;

        public j(@k com.avito.android.select.variant.a aVar) {
            this.f394128a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f394128a, ((j) obj).f394128a);
        }

        public final int hashCode() {
            return this.f394128a.hashCode();
        }

        @k
        public final String toString() {
            return "VariantItemClicked(item=" + this.f394128a + ')';
        }
    }
}
