package jz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljz/c;", "", "a", "b", "Ljz/c$a;", "Ljz/c$b;", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42452c {

    /* compiled from: EmployeeModeInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljz/c$a;", "Ljz/c;", "a", "b", "Ljz/c$a$a;", "Ljz/c$a$b;", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz.c$a */
    public interface a extends InterfaceC42452c {

        /* compiled from: EmployeeModeInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljz/c$a$a;", "Ljz/c$a;", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jz.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11597a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final InterfaceC42451b f405968a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f405969b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f405970c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f405971d;

            public C11597a(@k InterfaceC42451b interfaceC42451b, @k String str, @k String str2, @k String str3) {
                this.f405968a = interfaceC42451b;
                this.f405969b = str;
                this.f405970c = str2;
                this.f405971d = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11597a)) {
                    return false;
                }
                C11597a c11597a = (C11597a) obj;
                return L.f(this.f405968a, c11597a.f405968a) && L.f(this.f405969b, c11597a.f405969b) && L.f(this.f405970c, c11597a.f405970c) && L.f(this.f405971d, c11597a.f405971d);
            }

            @Override // jz.InterfaceC42452c
            @k
            /* renamed from: getMode, reason: from getter */
            public final InterfaceC42451b getF405972a() {
                return this.f405968a;
            }

            public final int hashCode() {
                return this.f405971d.hashCode() + H.d(H.d(this.f405968a.hashCode() * 31, 31, this.f405969b), 31, this.f405970c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Company(mode=");
                sb2.append(this.f405968a);
                sb2.append(", companySessionId=");
                sb2.append(this.f405969b);
                sb2.append(", employeeId=");
                sb2.append(this.f405970c);
                sb2.append(", companyHashId=");
                return C22026a.c(sb2, this.f405971d, ')');
            }
        }

        /* compiled from: EmployeeModeInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljz/c$a$b;", "Ljz/c$a;", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jz.c$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final InterfaceC42451b f405972a;

            public b(@k InterfaceC42451b interfaceC42451b) {
                this.f405972a = interfaceC42451b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f405972a, ((b) obj).f405972a);
            }

            @Override // jz.InterfaceC42452c
            @k
            /* renamed from: getMode, reason: from getter */
            public final InterfaceC42451b getF405972a() {
                return this.f405972a;
            }

            public final int hashCode() {
                return this.f405972a.hashCode();
            }

            @k
            public final String toString() {
                return "Personal(mode=" + this.f405972a + ')';
            }
        }
    }

    /* compiled from: EmployeeModeInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljz/c$b;", "Ljz/c;", "<init>", "()V", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz.c$b */
    public static final /* data */ class b implements InterfaceC42452c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405973a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InterfaceC42451b.a f405974b = InterfaceC42451b.a.f405966a;

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // jz.InterfaceC42452c
        @k
        /* renamed from: getMode */
        public final InterfaceC42451b getF405972a() {
            return f405974b;
        }

        public final int hashCode() {
            return -372931797;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    @k
    /* renamed from: getMode */
    InterfaceC42451b getF405972a();
}
