package c60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeRequestAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lc60/a;", "", "a", "b", "c", "d", "Lc60/a$a;", "Lc60/a$b;", "Lc60/a$c;", "Lc60/a$d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26947a {

    /* compiled from: CodeRequestAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc60/a$a;", "Lc60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c60.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2030a implements InterfaceC26947a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57648a;

        public C2030a(@k DeepLink deepLink) {
            this.f57648a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2030a) && L.f(this.f57648a, ((C2030a) obj).f57648a);
        }

        public final int hashCode() {
            return this.f57648a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LegalClick(deepLink="), this.f57648a, ')');
        }
    }

    /* compiled from: CodeRequestAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc60/a$b;", "Lc60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c60.a$b */
    public static final /* data */ class b implements InterfaceC26947a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f57649a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1954723171;
        }

        @k
        public final String toString() {
            return "LoadPhoneHint";
        }
    }

    /* compiled from: CodeRequestAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc60/a$c;", "Lc60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c60.a$c */
    public static final /* data */ class c implements InterfaceC26947a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f57650a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1362623329;
        }

        @k
        public final String toString() {
            return "PhoneNumberInput";
        }
    }

    /* compiled from: CodeRequestAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc60/a$d;", "Lc60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c60.a$d */
    public static final /* data */ class d implements InterfaceC26947a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57651a;

        public d(@k String str) {
            this.f57651a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f57651a, ((d) obj).f57651a);
        }

        public final int hashCode() {
            return this.f57651a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RequestCode(phoneNumber="), this.f57651a, ')');
        }
    }
}
