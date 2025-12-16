package ft;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: FiltersAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lft/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lft/a$a;", "Lft/a$b;", "Lft/a$c;", "Lft/a$d;", "Lft/a$e;", "Lft/a$f;", "Lft/a$g;", "Lft/a$h;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ft.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40476a {

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lft/a$a;", "Lft/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11179a implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11179a f396168a = new C11179a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11179a);
        }

        public final int hashCode() {
            return -545115290;
        }

        @k
        public final String toString() {
            return "ApplyFilters";
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$b;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$b */
    public static final /* data */ class b implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396169a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final OptionItem f396170b;

        public b(@k String str, @k OptionItem optionItem) {
            this.f396169a = str;
            this.f396170b = optionItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f396169a, bVar.f396169a) && L.f(this.f396170b, bVar.f396170b);
        }

        public final int hashCode() {
            return this.f396170b.hashCode() + (this.f396169a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChipsClicked(filterId=" + this.f396169a + ", clickedOption=" + this.f396170b + ')';
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lft/a$c;", "Lft/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$c */
    public static final /* data */ class c implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f396171a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1655905229;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$d;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$d */
    public static final /* data */ class d implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396172a;

        public d(@k String str) {
            this.f396172a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396172a, ((d) obj).f396172a);
        }

        public final int hashCode() {
            return this.f396172a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DropSelectFilterOptions(filterId="), this.f396172a, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$e;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$e */
    public static final /* data */ class e implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396173a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<OptionItem> f396174b;

        public e(@k String str, @k List<OptionItem> list) {
            this.f396173a = str;
            this.f396174b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f396173a, eVar.f396173a) && L.f(this.f396174b, eVar.f396174b);
        }

        public final int hashCode() {
            return this.f396174b.hashCode() + (this.f396173a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OptionsSelected(filterId=");
            sb2.append(this.f396173a);
            sb2.append(", selectedOptions=");
            return H.p(sb2, this.f396174b, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$f;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$f */
    public static final /* data */ class f implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396175a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Q<Integer, Integer> f396176b;

        public f(@k String str, @k Q<Integer, Integer> q12) {
            this.f396175a = str;
            this.f396176b = q12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f396175a, fVar.f396175a) && L.f(this.f396176b, fVar.f396176b);
        }

        public final int hashCode() {
            return this.f396176b.hashCode() + (this.f396175a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RangeChanged(filterId=");
            sb2.append(this.f396175a);
            sb2.append(", range=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f396176b, ')');
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$g;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$g */
    public static final /* data */ class g implements InterfaceC40476a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowFilters(filters=null)";
        }
    }

    /* compiled from: FiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft/a$h;", "Lft/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ft.a$h */
    public static final /* data */ class h implements InterfaceC40476a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396177a;

        public h(@k String str) {
            this.f396177a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f396177a, ((h) obj).f396177a);
        }

        public final int hashCode() {
            return this.f396177a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleSwitch(filterId="), this.f396177a, ')');
        }
    }
}
