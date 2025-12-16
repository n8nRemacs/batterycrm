package Q00;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.chips.c;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalFormAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LQ00/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LQ00/a$a;", "LQ00/a$b;", "LQ00/a$c;", "LQ00/a$d;", "LQ00/a$e;", "LQ00/a$f;", "LQ00/a$g;", "LQ00/a$h;", "LQ00/a$i;", "LQ00/a$j;", "LQ00/a$k;", "LQ00/a$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$a;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q00.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0879a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13396a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final c.a f13397b;

        public C0879a(@Y61.k String str, @Y61.k c.a aVar) {
            this.f13396a = str;
            this.f13397b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0879a)) {
                return false;
            }
            C0879a c0879a = (C0879a) obj;
            return L.f(this.f13396a, c0879a.f13396a) && L.f(this.f13397b, c0879a.f13397b);
        }

        public final int hashCode() {
            return this.f13397b.hashCode() + (this.f13396a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ChipSelected(stringId=" + this.f13396a + ", value=" + this.f13397b + ')';
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/a$b;", "LQ00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f13398a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1961753653;
        }

        @Y61.k
        public final String toString() {
            return "CloseFormClick";
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$c;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13399a;

        public c(@Y61.k String str) {
            this.f13399a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13399a, ((c) obj).f13399a);
        }

        public final int hashCode() {
            return this.f13399a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FocusCleared(stringId="), this.f13399a, ')');
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/a$d;", "LQ00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f13400a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -939992288;
        }

        @Y61.k
        public final String toString() {
            return "NextStepClick";
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/a$e;", "LQ00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f13401a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1847837668;
        }

        @Y61.k
        public final String toString() {
            return "PreviousStepClick";
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/a$f;", "LQ00/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f13402a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1731077094;
        }

        @Y61.k
        public final String toString() {
            return "ReloadClick";
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$g;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectItem f13403a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f13404b;

        public g(@Y61.k SelectItem selectItem, @Y61.k String str) {
            this.f13403a = selectItem;
            this.f13404b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f13403a, gVar.f13403a) && L.f(this.f13404b, gVar.f13404b);
        }

        public final int hashCode() {
            return this.f13404b.hashCode() + (this.f13403a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectOptionsClick(item=");
            sb2.append(this.f13403a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f13404b, ')');
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$h;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13405a;

        /* renamed from: b, reason: collision with root package name */
        public final float f13406b;

        public h(@Y61.k String str, float f12) {
            this.f13405a = str;
            this.f13406b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f13405a, hVar.f13405a) && Float.compare(this.f13406b, hVar.f13406b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13406b) + (this.f13405a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SliderFilled(stringId=");
            sb2.append(this.f13405a);
            sb2.append(", value=");
            return r.k(')', this.f13406b, sb2);
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$i;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13407a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SelectItem.Option f13408b;

        public i(@Y61.k String str, @Y61.k SelectItem.Option option) {
            this.f13407a = str;
            this.f13408b = option;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f13407a, iVar.f13407a) && L.f(this.f13408b, iVar.f13408b);
        }

        public final int hashCode() {
            return this.f13408b.hashCode() + (this.f13407a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "UpdateSelectValue(stringId=" + this.f13407a + ", value=" + this.f13408b + ')';
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$j;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13409a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f13410b;

        public j(@Y61.k String str, @Y61.k String str2) {
            this.f13409a = str;
            this.f13410b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f13409a, jVar.f13409a) && L.f(this.f13410b, jVar.f13410b);
        }

        public final int hashCode() {
            return this.f13410b.hashCode() + (this.f13409a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateStringFieldValue(stringId=");
            sb2.append(this.f13409a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f13410b, ')');
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$k;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13411a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13412b;

        public k(@Y61.k String str, int i12) {
            this.f13411a = str;
            this.f13412b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f13411a, kVar.f13411a) && this.f13412b == kVar.f13412b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13412b) + (this.f13411a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateValueByPredefined(stringId=");
            sb2.append(this.f13411a);
            sb2.append(", value=");
            return r.t(sb2, this.f13412b, ')');
        }
    }

    /* compiled from: PreApprovalFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/a$l;", "LQ00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13413a;

        /* renamed from: b, reason: collision with root package name */
        public final float f13414b;

        public l(@Y61.k String str, float f12) {
            this.f13413a = str;
            this.f13414b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f13413a, lVar.f13413a) && Float.compare(this.f13414b, lVar.f13414b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13414b) + (this.f13413a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateValueBySlider(stringId=");
            sb2.append(this.f13413a);
            sb2.append(", value=");
            return r.k(')', this.f13414b, sb2);
        }
    }
}
