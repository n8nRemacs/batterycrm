package ru.avito.messenger;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserType;

/* compiled from: MessengerUserConnectionParams.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/l0;", "Lru/avito/messenger/n0;", "a", "b", "d", "e", "Lru/avito/messenger/l0$b;", "Lru/avito/messenger/l0$d;", "Lru/avito/messenger/l0$e;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface l0 extends n0 {

    /* renamed from: O2, reason: collision with root package name */
    @Y61.k
    public static final a f431814O2 = a.f431815a;

    /* compiled from: MessengerUserConnectionParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/l0$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f431815a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f431816b = new b("");
    }

    /* compiled from: MessengerUserConnectionParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/l0$b;", "Lru/avito/messenger/l0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f431817b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final MessengerUserType.Default f431818c = MessengerUserType.Default.f430683b;

        public b(@Y61.k String str) {
            this.f431817b = str;
        }

        @Override // ru.avito.messenger.n0
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF431824b() {
            return this.f431817b;
        }

        @Override // ru.avito.messenger.l0
        public final boolean d() {
            return getF431824b().length() > 0;
        }

        @Override // ru.avito.messenger.n0
        public final MessengerUserType e() {
            return this.f431818c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f431817b, ((b) obj).f431817b);
        }

        public final int hashCode() {
            return this.f431817b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Default(userHashId="), this.f431817b, ')');
        }
    }

    /* compiled from: MessengerUserConnectionParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: MessengerUserConnectionParams.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/l0$d;", "Lru/avito/messenger/l0;", "Lru/avito/messenger/n0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements l0, n0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f431819b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f431820c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f431821d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final MessengerUserType.Employee.Company f431822e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f431823f;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k MessengerUserType.Employee.Company company) {
            this.f431819b = str;
            this.f431820c = str2;
            this.f431821d = str3;
            this.f431822e = company;
            this.f431823f = new MessengerUserHashInfo(str, company);
        }

        @Override // ru.avito.messenger.n0
        @Y61.k
        /* renamed from: c */
        public final String getF431824b() {
            return this.f431823f.f430682d;
        }

        @Override // ru.avito.messenger.l0
        public final boolean d() {
            return this.f431823f.f430682d.length() > 0 && this.f431819b.length() > 0 && this.f431820c.length() > 0 && this.f431821d.length() > 0 && this.f431822e.f430684b.length() > 0;
        }

        @Override // ru.avito.messenger.n0
        public final MessengerUserType e() {
            return this.f431822e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.L.f(this.f431819b, dVar.f431819b) && kotlin.jvm.internal.L.f(this.f431820c, dVar.f431820c) && kotlin.jvm.internal.L.f(this.f431821d, dVar.f431821d) && kotlin.jvm.internal.L.f(this.f431822e, dVar.f431822e);
        }

        public final int hashCode() {
            return this.f431822e.f430684b.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f431819b.hashCode() * 31, 31, this.f431820c), 31, this.f431821d);
        }

        @Y61.k
        public final String toString() {
            return "EmployeeCompany(accountHashId=" + this.f431819b + ", companySessionId=" + this.f431820c + ", employeeId=" + this.f431821d + ", userType=" + this.f431822e + ')';
        }
    }

    /* compiled from: MessengerUserConnectionParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/l0$e;", "Lru/avito/messenger/l0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements l0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f431824b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final MessengerUserType.Employee.Personal f431825c = MessengerUserType.Employee.Personal.f430685b;

        public e(@Y61.k String str) {
            this.f431824b = str;
        }

        @Override // ru.avito.messenger.n0
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF431824b() {
            return this.f431824b;
        }

        @Override // ru.avito.messenger.l0
        public final boolean d() {
            return getF431824b().length() > 0;
        }

        @Override // ru.avito.messenger.n0
        public final MessengerUserType e() {
            return this.f431825c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.L.f(this.f431824b, ((e) obj).f431824b);
        }

        public final int hashCode() {
            return this.f431824b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmployeePersonal(userHashId="), this.f431824b, ')');
        }
    }

    boolean d();
}
