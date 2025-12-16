package rw0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactsInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/d;", "", "<init>", "()V", "a", "b", "Lrw0/d$a;", "Lrw0/d$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC47929d {

    /* compiled from: ContactsInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/d$a;", "Lrw0/d;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.d$a */
    public static final class a extends AbstractC47929d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f437179a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: ContactsInfo.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/d$b;", "Lrw0/d;", "a", "b", "c", "Lrw0/d$b$a;", "Lrw0/d$b$b;", "Lrw0/d$b$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.d$b */
    public static abstract class b extends AbstractC47929d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f437180a;

        /* compiled from: ContactsInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/d$b$a;", "Lrw0/d$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rw0.d$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f437181b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f437182c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f437183d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final StrSoftBookingContactFieldType f437184e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final String f437185f;

            public a(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.k StrSoftBookingContactFieldType strSoftBookingContactFieldType, @Y61.k String str4) {
                super(str, str3, strSoftBookingContactFieldType, str4, null);
                this.f437181b = str;
                this.f437182c = str2;
                this.f437183d = str3;
                this.f437184e = strSoftBookingContactFieldType;
                this.f437185f = str4;
            }

            @Override // rw0.AbstractC47929d.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final String getF437180a() {
                return this.f437183d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f437181b, aVar.f437181b) && L.f(this.f437182c, aVar.f437182c) && L.f(this.f437183d, aVar.f437183d) && this.f437184e == aVar.f437184e && L.f(this.f437185f, aVar.f437185f);
            }

            public final int hashCode() {
                String str = this.f437181b;
                int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f437182c);
                String str2 = this.f437183d;
                return this.f437185f.hashCode() + ((this.f437184e.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(value=");
                sb2.append(this.f437181b);
                sb2.append(", error=");
                sb2.append(this.f437182c);
                sb2.append(", hint=");
                sb2.append(this.f437183d);
                sb2.append(", type=");
                sb2.append(this.f437184e);
                sb2.append(", paramId=");
                return C22026a.c(sb2, this.f437185f, ')');
            }
        }

        /* compiled from: ContactsInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/d$b$b;", "Lrw0/d$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rw0.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12601b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f437186b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f437187c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final StrSoftBookingContactFieldType f437188d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f437189e;

            public C12601b(@Y61.l String str, @Y61.l String str2, @Y61.k StrSoftBookingContactFieldType strSoftBookingContactFieldType, @Y61.k String str3) {
                super(str, str2, strSoftBookingContactFieldType, str3, null);
                this.f437186b = str;
                this.f437187c = str2;
                this.f437188d = strSoftBookingContactFieldType;
                this.f437189e = str3;
            }

            @Override // rw0.AbstractC47929d.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final String getF437180a() {
                return this.f437187c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12601b)) {
                    return false;
                }
                C12601b c12601b = (C12601b) obj;
                return L.f(this.f437186b, c12601b.f437186b) && L.f(this.f437187c, c12601b.f437187c) && this.f437188d == c12601b.f437188d && L.f(this.f437189e, c12601b.f437189e);
            }

            public final int hashCode() {
                String str = this.f437186b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f437187c;
                return this.f437189e.hashCode() + ((this.f437188d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Normal(value=");
                sb2.append(this.f437186b);
                sb2.append(", hint=");
                sb2.append(this.f437187c);
                sb2.append(", type=");
                sb2.append(this.f437188d);
                sb2.append(", paramId=");
                return C22026a.c(sb2, this.f437189e, ')');
            }
        }

        /* compiled from: ContactsInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/d$b$c;", "Lrw0/d$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: rw0.d$b$c */
        public static final /* data */ class c extends b {
            @Override // rw0.AbstractC47929d.b
            @Y61.l
            /* renamed from: a */
            public final String getF437180a() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @Y61.k
            public final String toString() {
                return "Warning(value=null, warning=null, hint=null, type=null, paramId=null)";
            }
        }

        public b(String str, String str2, StrSoftBookingContactFieldType strSoftBookingContactFieldType, String str3, C42822w c42822w) {
            super(null);
            this.f437180a = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public String getF437180a() {
            return this.f437180a;
        }
    }

    public /* synthetic */ AbstractC47929d(C42822w c42822w) {
        this();
    }

    public AbstractC47929d() {
    }
}
