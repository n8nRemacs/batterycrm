package ih0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormStepAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u0004\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lih0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "Lih0/a$i;", "Lih0/a$l;", "Lih0/a$n;", "Lih0/a$o;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ih0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41402a {

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$a;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11384a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.item.address.a f398622a;

        public C11384a(@Y61.k com.avito.android.rating_form.item.address.a aVar) {
            this.f398622a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11384a) && L.f(this.f398622a, ((C11384a) obj).f398622a);
        }

        public final int hashCode() {
            return this.f398622a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Address(addressItem=" + this.f398622a + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$b;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$b */
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398623a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f398624b;

        public b(@Y61.k FieldIdentifier fieldIdentifier, @Y61.l Integer num) {
            this.f398623a = fieldIdentifier;
            this.f398624b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f398623a, bVar.f398623a) && L.f(this.f398624b, bVar.f398624b);
        }

        public final int hashCode() {
            int iHashCode = this.f398623a.hashCode() * 31;
            Integer num = this.f398624b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeRating(fieldIdentifier=");
            sb2.append(this.f398623a);
            sb2.append(", value=");
            return com.akita.compose.component.accordion.s.j(sb2, this.f398624b, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$c;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$c */
    public static final /* data */ class c implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398625a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f398626b;

        public c(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k String str) {
            this.f398625a = fieldIdentifier;
            this.f398626b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f398625a, cVar.f398625a) && L.f(this.f398626b, cVar.f398626b);
        }

        public final int hashCode() {
            return this.f398626b.hashCode() + (this.f398625a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeText(fieldIdentifier=");
            sb2.append(this.f398625a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f398626b, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$d;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$d */
    public static final /* data */ class d implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398627a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f398628b;

        public d(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k List<CheckableGroupItem.a> list) {
            this.f398627a = fieldIdentifier;
            this.f398628b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f398627a.equals(dVar.f398627a) && L.f(this.f398628b, dVar.f398628b);
        }

        public final int hashCode() {
            return this.f398628b.hashCode() + (this.f398627a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickCheckBox(fieldIdentifier=");
            sb2.append(this.f398627a);
            sb2.append(", values=");
            return H.n(sb2, this.f398628b, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$e;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$e */
    public static final /* data */ class e implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398629a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f398630b;

        public e(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k List<CheckableGroupItem.a> list) {
            this.f398629a = fieldIdentifier;
            this.f398630b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f398629a.equals(eVar.f398629a) && L.f(this.f398630b, eVar.f398630b);
        }

        public final int hashCode() {
            return this.f398630b.hashCode() + (this.f398629a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickRadioButton(fieldIdentifier=");
            sb2.append(this.f398629a);
            sb2.append(", values=");
            return H.n(sb2, this.f398630b, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/a$f;", "Lih0/a$o;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$f */
    public static final /* data */ class f implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f398631a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1778543365;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$g;", "Lih0/a$i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$g */
    public static final /* data */ class g implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398632a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.step.e f398633b;

        public g(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k com.avito.android.rating_form.step.e eVar) {
            this.f398632a = fieldIdentifier;
            this.f398633b = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f398632a, gVar.f398632a) && L.f(this.f398633b, gVar.f398633b);
        }

        public final int hashCode() {
            return this.f398633b.hashCode() + (this.f398632a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "DeleteFile(fieldIdentifier=" + this.f398632a + ", file=" + this.f398633b + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$h;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$h */
    public static final /* data */ class h implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.item.development.a f398634a;

        public h(@Y61.k com.avito.android.rating_form.item.development.a aVar) {
            this.f398634a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f398634a, ((h) obj).f398634a);
        }

        public final int hashCode() {
            return this.f398634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Development(developmentItem=" + this.f398634a + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lih0/a$i;", "Lih0/a;", "Lih0/a$g;", "Lih0/a$s;", "Lih0/a$z;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$i */
    public interface i extends InterfaceC41402a {
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/a$j;", "Lih0/a$o;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$j */
    public static final /* data */ class j implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f398635a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 782808560;
        }

        @Y61.k
        public final String toString() {
            return "Finish";
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lih0/a$k;", "", "a", "b", "c", "Lih0/a$k$a;", "Lih0/a$k$b;", "Lih0/a$k$c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$k */
    public interface k {

        /* compiled from: RatingFormStepAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/a$k$a;", "Lih0/a$k;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ih0.a$k$a, reason: collision with other inner class name */
        public static final /* data */ class C11385a implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11385a f398636a = new C11385a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C11385a);
            }

            public final int hashCode() {
                return 1618380064;
            }

            @Y61.k
            public final String toString() {
                return "Concat";
            }
        }

        /* compiled from: RatingFormStepAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/a$k$b;", "Lih0/a$k;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ih0.a$k$b */
        public static final /* data */ class b implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f398637a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1863294355;
            }

            @Y61.k
            public final String toString() {
                return "Latest";
            }
        }

        /* compiled from: RatingFormStepAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/a$k$c;", "Lih0/a$k;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ih0.a$k$c */
        public static final /* data */ class c implements k {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f398638a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -770136916;
            }

            @Y61.k
            public final String toString() {
                return "Merge";
            }
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lih0/a$l;", "Lih0/a;", "Lih0/a$a;", "Lih0/a$b;", "Lih0/a$c;", "Lih0/a$d;", "Lih0/a$e;", "Lih0/a$h;", "Lih0/a$m;", "Lih0/a$t;", "Lih0/a$u;", "Lih0/a$v;", "Lih0/a$w;", "Lih0/a$x;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$l */
    public interface l extends InterfaceC41402a {
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$m;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$m */
    public static final /* data */ class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f398639a;

        public m(boolean z12) {
            this.f398639a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f398639a == ((m) obj).f398639a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f398639a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("KeyboardShown(isShown="), this.f398639a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lih0/a$n;", "Lih0/a;", "Lih0/a$r;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$n */
    public interface n extends InterfaceC41402a {
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lih0/a$o;", "Lih0/a;", "Lih0/a$f;", "Lih0/a$j;", "Lih0/a$p;", "Lih0/a$q;", "Lih0/a$y;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$o */
    public interface o extends InterfaceC41402a {
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$p;", "Lih0/a$o;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$p */
    public static final /* data */ class p implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f398640a;

        public p(@Y61.k DeepLink deepLink) {
            this.f398640a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f398640a, ((p) obj).f398640a);
        }

        public final int hashCode() {
            return this.f398640a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f398640a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$q;", "Lih0/a$o;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$q */
    public static final /* data */ class q implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398641a;

        public q(@Y61.k String str) {
            this.f398641a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f398641a, ((q) obj).f398641a);
        }

        public final int hashCode() {
            return this.f398641a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f398641a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$r;", "Lih0/a$n;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$r */
    public static final /* data */ class r implements n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.android.rating_form.api.remote.model.a> f398642a;

        /* JADX WARN: Multi-variable type inference failed */
        public r(@Y61.k List<? extends com.avito.android.rating_form.api.remote.model.a> list) {
            this.f398642a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f398642a, ((r) obj).f398642a);
        }

        public final int hashCode() {
            return this.f398642a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ReloadFailedRequest(failedCommands="), this.f398642a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$s;", "Lih0/a$i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$s */
    public static final /* data */ class s implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398643a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.step.e f398644b;

        public s(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k com.avito.android.rating_form.step.e eVar) {
            this.f398643a = fieldIdentifier;
            this.f398644b = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return L.f(this.f398643a, sVar.f398643a) && L.f(this.f398644b, sVar.f398644b);
        }

        public final int hashCode() {
            return this.f398644b.hashCode() + (this.f398643a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "RetryUploadFile(fieldIdentifier=" + this.f398643a + ", file=" + this.f398644b + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$t;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$t */
    public static final /* data */ class t implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<List<String>> f398645a;

        /* JADX WARN: Multi-variable type inference failed */
        public t(@Y61.k List<? extends List<String>> list) {
            this.f398645a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f398645a, ((t) obj).f398645a);
        }

        public final int hashCode() {
            return this.f398645a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("RevealFields(fieldsForReveal="), this.f398645a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$u;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$u */
    public static final /* data */ class u implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.item.select.a f398646a;

        public u(@Y61.k com.avito.android.rating_form.item.select.a aVar) {
            this.f398646a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f398646a, ((u) obj).f398646a);
        }

        public final int hashCode() {
            return this.f398646a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Select(selectItem=" + this.f398646a + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$v;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$v */
    public static final /* data */ class v implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AddressParameter.Value f398647a;

        public v(@Y61.l AddressParameter.Value value) {
            this.f398647a = value;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f398647a, ((v) obj).f398647a);
        }

        public final int hashCode() {
            AddressParameter.Value value = this.f398647a;
            if (value == null) {
                return 0;
            }
            return value.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectedAddress(value=" + this.f398647a + ')';
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$w;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$w */
    public static final /* data */ class w implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Long f398648a;

        public w(@Y61.l Long l12) {
            this.f398648a = l12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && L.f(this.f398648a, ((w) obj).f398648a);
        }

        public final int hashCode() {
            Long l12 = this.f398648a;
            if (l12 == null) {
                return 0;
            }
            return l12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.media3.exoplayer.analytics.m.m(new StringBuilder("SelectedDevelopment(value="), this.f398648a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$x;", "Lih0/a$l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$x */
    public static final /* data */ class x implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f398649a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<ParcelableEntity<String>> f398650b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f398651c;

        /* JADX WARN: Multi-variable type inference failed */
        public x(@Y61.l String str, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l String str2) {
            this.f398649a = str;
            this.f398650b = list;
            this.f398651c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return L.f(this.f398649a, xVar.f398649a) && L.f(this.f398650b, xVar.f398650b) && L.f(this.f398651c, xVar.f398651c);
        }

        public final int hashCode() {
            String str = this.f398649a;
            int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f398650b);
            String str2 = this.f398651c;
            return iE2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedItem(fieldISlug=");
            sb2.append(this.f398649a);
            sb2.append(", selectedItems=");
            sb2.append(this.f398650b);
            sb2.append(", sectionTitle=");
            return C22026a.c(sb2, this.f398651c, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$y;", "Lih0/a$o;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$y */
    public static final /* data */ class y implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398652a;

        public y(@Y61.k String str) {
            this.f398652a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f398652a, ((y) obj).f398652a);
        }

        public final int hashCode() {
            return this.f398652a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TryOpenFilePicker(slug="), this.f398652a, ')');
        }
    }

    /* compiled from: RatingFormStepAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/a$z;", "Lih0/a$i;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.a$z */
    public static final /* data */ class z implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f398653a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f398654b;

        public z(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k ArrayList arrayList) {
            this.f398653a = fieldIdentifier;
            this.f398654b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return this.f398653a.equals(zVar.f398653a) && this.f398654b.equals(zVar.f398654b);
        }

        public final int hashCode() {
            return this.f398654b.hashCode() + (this.f398653a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UploadFile(fieldIdentifier=");
            sb2.append(this.f398653a);
            sb2.append(", list=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f398654b, ')');
        }
    }
}
