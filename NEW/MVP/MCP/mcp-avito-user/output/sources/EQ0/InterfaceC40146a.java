package eq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Leq0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Leq0/a$a;", "Leq0/a$b;", "Leq0/a$c;", "Leq0/a$d;", "Leq0/a$e;", "Leq0/a$f;", "Leq0/a$g;", "Leq0/a$h;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40146a {

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leq0/a$a;", "Leq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11105a implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11105a f395380a = new C11105a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11105a);
        }

        public final int hashCode() {
            return -819488208;
        }

        @k
        public final String toString() {
            return "OnBackButtonClick";
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/a$b;", "Leq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$b */
    public static final /* data */ class b implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395381a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395382b;

        public b(int i12, int i13) {
            this.f395381a = i12;
            this.f395382b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f395381a == bVar.f395381a && this.f395382b == bVar.f395382b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395382b) + r.i(Integer.hashCode(this.f395381a) * 31, 31, false);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnChipClick(districtIndex=");
            sb2.append(this.f395381a);
            sb2.append(", isSelected=false, stateIndex=");
            return r.t(sb2, this.f395382b, ')');
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leq0/a$c;", "Leq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$c */
    public static final /* data */ class c implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f395383a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 773314170;
        }

        @k
        public final String toString() {
            return "OnClearClick";
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leq0/a$d;", "Leq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$d */
    public static final /* data */ class d implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395384a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -49772843;
        }

        @k
        public final String toString() {
            return "OnConfirmButtonClick";
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/a$e;", "Leq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$e */
    public static final /* data */ class e implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395385a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f395386b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395387c;

        public e(int i12, int i13, boolean z12) {
            this.f395385a = i12;
            this.f395386b = z12;
            this.f395387c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f395385a == eVar.f395385a && this.f395386b == eVar.f395386b && this.f395387c == eVar.f395387c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395387c) + r.i(Integer.hashCode(this.f395385a) * 31, 31, this.f395386b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnDistrictCheckedChange(index=");
            sb2.append(this.f395385a);
            sb2.append(", isSelected=");
            sb2.append(this.f395386b);
            sb2.append(", stateIndex=");
            return r.t(sb2, this.f395387c, ')');
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/a$f;", "Leq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$f */
    public static final /* data */ class f implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395388a;

        public f(@k String str) {
            this.f395388a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f395388a, ((f) obj).f395388a);
        }

        public final int hashCode() {
            return this.f395388a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnInputChange(newQuery="), this.f395388a, ')');
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/a$g;", "Leq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$g */
    public static final /* data */ class g implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395389a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CheckBoxExpandableLineState f395390b;

        /* renamed from: c, reason: collision with root package name */
        public final int f395391c;

        public g(int i12, int i13, @k CheckBoxExpandableLineState checkBoxExpandableLineState) {
            this.f395389a = i12;
            this.f395390b = checkBoxExpandableLineState;
            this.f395391c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f395389a == gVar.f395389a && this.f395390b == gVar.f395390b && this.f395391c == gVar.f395391c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395391c) + ((this.f395390b.hashCode() + (Integer.hashCode(this.f395389a) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnRegionCheckedChange(index=");
            sb2.append(this.f395389a);
            sb2.append(", previousCheckedState=");
            sb2.append(this.f395390b);
            sb2.append(", regionStateIndex=");
            return r.t(sb2, this.f395391c, ')');
        }
    }

    /* compiled from: SelectDistrictAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leq0/a$h;", "Leq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eq0.a$h */
    public static final /* data */ class h implements InterfaceC40146a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395392a;

        public h(int i12) {
            this.f395392a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f395392a == ((h) obj).f395392a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395392a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnRegionClick(index="), this.f395392a, ')');
        }
    }
}
